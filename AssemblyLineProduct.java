package AssemblyLine2;

// import java.lang.reflect.Array;
// import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AssemblyLineProduct {
    private String name; 
    private double time;
    private String machine; 
    private Pair[] materials;

    public AssemblyLineProduct(String name, double time, String machine, Pair[] materials){
        this.name = name;
        this.time = time;
        this.machine = machine;
        this.materials = materials;
    }

    //Returns things
    public String getName(){
        return name;
    }
    public String getMachine() {
        return machine;
    }
    public double getTime() {
        return time;
    }
    public Pair[] getMaterials(){
        return materials;
    }

    //Sets things 
    public void setName(String n){
        name = n;
    }
    public void setMachine(String m) {
        machine = m;
    }
    public void setTime(float t){
        time = t;
    }
    public void setMaterials(Pair[] mat){
        materials = mat;
    }
    //Overload
    public void setMaterials(Pair mat, int index){
        materials[index] = mat;
    }

    @Override
    public String toString(){
        String s = machine;
        if (materials == null){
            s += " creates " + name + " in " + time + " seconds.";
        } else {
            switch (materials.length){
                case 1 -> s += " uses " + materials[0] + " in " + time + " seconds.";
                case 2 -> s += " uses " + materials[0] + " and " + materials[1] + " in " + time + " seconds.";
                default -> {
                    s += " uses ";
                    for(int i = 0; i < materials.length - 1; i++){
                        s += materials[i] + ", ";
                    }
                    s += "and " + materials[materials.length-1] + " in " + time + " seconds.";
                }
            }
        }
        
        return s;
    }

    public Pair[] getRawMats(){
        Pair me = new Pair(this, 1.0);
        HashMap<AssemblyLineProduct, Double> rawMats = new HashMap<>();
        mapAccum(rawMats, collectRawMats(me));
        
        // Remove this product itself from raw materials if present
        rawMats.remove(this);

        // Convert map entries to Pair array
        Pair[] result = new Pair[rawMats.size()];
        int i = 0;
        for (Map.Entry<AssemblyLineProduct, Double> entry : rawMats.entrySet()) {
            result[i++] = new Pair(entry.getKey(), entry.getValue());
        }

        return result;
    }

    private HashMap<AssemblyLineProduct, Double> collectRawMats(Pair product){

        HashMap<AssemblyLineProduct, Double> hereMats = new HashMap<>();
        AssemblyLineProduct current = product.material;

        if(current.materials == null || current.materials.length == 0){
            hereMats.put(current, product.quantity);
        } else {
            hereMats.put(current, product.quantity);
            for(Pair p : current.materials){
                // Recursively collect sub-materials, adjusting for quantity needed
                HashMap<AssemblyLineProduct, Double> subMats = collectRawMats(
                    new Pair(p.material, Math.round(p.quantity * product.quantity*100.)/100.));
                
                // Merge results
                mapAccum(hereMats, subMats);
            }
        }
        return hereMats;
    }

    private void mapAccum(HashMap<AssemblyLineProduct, Double> rawMats, HashMap<AssemblyLineProduct, Double> hereMats){
        for(Map.Entry<AssemblyLineProduct, Double> entry : hereMats.entrySet()){
            rawMats.put(entry.getKey(), rawMats.getOrDefault(entry.getKey(), 0.) + entry.getValue());
        }
    }
}
