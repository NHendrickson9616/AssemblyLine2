package AssemblyLine2;

public class Pair{
    public AssemblyLineProduct material;
    public Double quantity;

    public Pair(AssemblyLineProduct material, Double quantity){
        this.material = material;
        this.quantity = quantity;
    }

    @Override
    public String toString(){
        return quantity + " " + material.getName();
    }
}
