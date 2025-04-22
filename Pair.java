package AssemblyLine2;

public class Pair{
    public AssemblyLineProduct material;
    public double quantity;

    public Pair(AssemblyLineProduct m, double q){
        material = m;
        quantity = q;
    }

    @Override
    public String toString(){
        return quantity + " " + material.getName();
    }
}
