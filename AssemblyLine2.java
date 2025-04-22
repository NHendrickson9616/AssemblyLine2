package AssemblyLine2;
import java.util.HashMap;
import java.util.Map;

public class AssemblyLine2{

    private static final Map<String, AssemblyLineProduct> prodMap = new HashMap<>();

    //refined resources contribute 6 energy to 

    private static void setStats(){
        prodMap.put("Copper", new AssemblyLineProduct("Copper",.5, "Starter", null));
        prodMap.put("Aluminum", new AssemblyLineProduct("Aluminum", .5, "Starter", null));
        prodMap.put("Gold", new AssemblyLineProduct("Gold", .5, "Starter", null));
        prodMap.put("Diamond", new AssemblyLineProduct("Diamond", .5, "Starter", null));
        prodMap.put("Iron", new AssemblyLineProduct("Iron", .5, "Starter", null));
    
        prodMap.put("Copper Wire", new AssemblyLineProduct("Copper Wire", 1, "Wire Maker", new Pair[]{new Pair(prodMap.get("Copper"), 1)}));
        prodMap.put("Aluminum Wire", new AssemblyLineProduct("Aluminum Wire", 1, "Wire Maker", new Pair[]{new Pair(prodMap.get("Aluminum"), 1)}));
        prodMap.put("Gold Wire", new AssemblyLineProduct("Gold Wire", 1, "Wire Maker", new Pair[]{new Pair(prodMap.get("Gold"), 1)}));
        prodMap.put("Diamond Wire", new AssemblyLineProduct("Diamond Wire", 1, "Wire Maker", new Pair[]{new Pair(prodMap.get("Diamond"), 1)}));
        prodMap.put("Iron Wire", new AssemblyLineProduct("Iron Wire", 1, "Wire Maker", new Pair[]{new Pair(prodMap.get("Iron"), 1)}));
    
        prodMap.put("Copper Liquid", new AssemblyLineProduct("Copper Liquid", 1, "Furnace", new Pair[]{new Pair(prodMap.get("Copper"),1)}));
        prodMap.put("Aluminum Liquid", new AssemblyLineProduct("Aluminum Liquid", 1, "Furnace", new Pair[]{new Pair(prodMap.get("Aluminum"),1)}));
        prodMap.put("Gold Liquid", new AssemblyLineProduct("Gold Liquid", 1, "Furnace", new Pair[]{new Pair(prodMap.get("Gold"),1)}));
        prodMap.put("Diamond Liquid", new AssemblyLineProduct("Diamond Liquid", 1, "Furnace", new Pair[]{new Pair(prodMap.get("Diamond"),1)}));
        prodMap.put("Iron Liquid", new AssemblyLineProduct("Iron Liquid", 1, "Furnace", new Pair[]{new Pair(prodMap.get("Iron"),1)}));
    
        prodMap.put("Copper Gear", new AssemblyLineProduct("Copper Gear", 1, "Cutter", new Pair[]{new Pair(prodMap.get("Copper"),1)}));
        prodMap.put("Aluminum Gear", new AssemblyLineProduct("Aluminum Gear", 1, "Cutter", new Pair[]{new Pair(prodMap.get("Aluminum"),1)}));
        prodMap.put("Gold Gear", new AssemblyLineProduct("Gold Gear", 1, "Cutter", new Pair[]{new Pair(prodMap.get("Gold"),1)}));
        prodMap.put("Diamond Gear", new AssemblyLineProduct("Diamond Gear", 1, "Cutter", new Pair[]{new Pair(prodMap.get("Diamond"),1)}));
        prodMap.put("Iron Gear", new AssemblyLineProduct("Iron Gear", 1, "Cutter", new Pair[]{new Pair(prodMap.get("Iron"),1)}));

        prodMap.put("Copper Cable", new AssemblyLineProduct("Copper Cable", 1, "Cable Maker", new Pair[]{new Pair(prodMap.get("Copper Wire"),3)}));
        prodMap.put("Aluminum Cable", new AssemblyLineProduct("Aluminum Cable", 1, "Cable Maker", new Pair[]{new Pair(prodMap.get("Aluminum Wire"),3)}));
        prodMap.put("Gold Cable", new AssemblyLineProduct("Gold Cable", 1, "Cable Maker", new Pair[]{new Pair(prodMap.get("Gold Wire"),3)}));
        prodMap.put("Diamond Cable", new AssemblyLineProduct("Diamond Cable", 1, "Cable Maker", new Pair[]{new Pair(prodMap.get("Diamond Wire"),3)}));
        prodMap.put("Iron Cable", new AssemblyLineProduct("Iron Cable", 1, "Cable Maker", new Pair[]{new Pair(prodMap.get("Iron Wire"),3)}));

        prodMap.put("Circuit", new AssemblyLineProduct("Circuit", 1, "Crafter MK1", new Pair[]{new Pair(prodMap.get("Gold"), 1), new Pair(prodMap.get("Copper Wire"),1)}));
        prodMap.put("Battery", new AssemblyLineProduct("Battery", 1, "Crafter MK1", new Pair[]{new Pair(prodMap.get("Copper"), 1), new Pair(prodMap.get("Copper Liquid"),1)}));
        prodMap.put("Electric Board", new AssemblyLineProduct("Electric Board", 1, "Crafter MK1", new Pair[]{new Pair(prodMap.get("Aluminum"), 1), new Pair(prodMap.get("Copper Wire"),1)}));
        prodMap.put("Engine", new AssemblyLineProduct("Engine", 1, "Crafter MK1", new Pair[]{new Pair(prodMap.get("Iron"), 1), new Pair(prodMap.get("Iron"),1)}));
        prodMap.put("Heater Plate", new AssemblyLineProduct("Heater Plate", 1, "Crafter MK1", new Pair[]{new Pair(prodMap.get("Aluminum"), 1), new Pair(prodMap.get("Iron Wire"),1)}));
        prodMap.put("Server Rack", new AssemblyLineProduct("Server Rack", 1, "Crafter MK1", new Pair[]{new Pair(prodMap.get("Aluminum"), 1), new Pair(prodMap.get("Iron"),1)}));
        prodMap.put("Solar Cell", new AssemblyLineProduct("Solar Cell", 1, "Crafter MK1", new Pair[]{new Pair(prodMap.get("Gold"), 1), new Pair(prodMap.get("Diamond Liquid"),1)}));

        prodMap.put("Fan", new AssemblyLineProduct("Fan", 1, "Crafter MK2", new Pair[]{new Pair(prodMap.get("Circuit"), 1), new Pair(prodMap.get("Diamond Gear"),3), new Pair(prodMap.get("Aluminum"), 6)}));
        prodMap.put("Advanced Engine", new AssemblyLineProduct("Advanced Engine", 1, "Crafter MK2", new Pair[]{new Pair(prodMap.get("Circuit"), 5), new Pair(prodMap.get("Engine"),5), new Pair(prodMap.get("Diamond"), 10)}));
        prodMap.put("Computer", new AssemblyLineProduct("Computer", 1, "Crafter MK2", new Pair[]{new Pair(prodMap.get("Fan"), 1), new Pair(prodMap.get("Power Supply"),1), new Pair(prodMap.get("Processor"), 1)}));
        prodMap.put("Laser", new AssemblyLineProduct("Laser", 1, "Crafter MK2", new Pair[]{new Pair(prodMap.get("Battery"), 5), new Pair(prodMap.get("Heater Plate"),5), new Pair(prodMap.get("Iron Liquid"), 5)}));
        prodMap.put("Power Supply", new AssemblyLineProduct("Power Supply", 1, "Crafter MK2", new Pair[]{new Pair(prodMap.get("Circuit"), 1), new Pair(prodMap.get("Diamond"),6), new Pair(prodMap.get("Aluminum Liquid"), 3)}));
        prodMap.put("Processor", new AssemblyLineProduct("Processor", 1, "Crafter MK2", new Pair[]{new Pair(prodMap.get("Circuit"), 1), new Pair(prodMap.get("Diamond Wire"),3), new Pair(prodMap.get("Gold Liquid"), 3)}));
        prodMap.put("Solar Panel", new AssemblyLineProduct("Solar Panel", 1, "Crafter MK2", new Pair[]{new Pair(prodMap.get("Circuit"), 1), new Pair(prodMap.get("Solar Cell"),2), new Pair(prodMap.get("Electric Board"), 2)}));

        prodMap.put("Copper Plate", new AssemblyLineProduct("Copper Plate", 1, "Hydraulic Press", new Pair[]{new Pair(prodMap.get("Copper"),1)}));
        prodMap.put("Aluminum Plate", new AssemblyLineProduct("Aluminum Plate", 1, "Hydraulic Press", new Pair[]{new Pair(prodMap.get("Aluminum"),1)}));
        prodMap.put("Gold Plate", new AssemblyLineProduct("Gold Plate", 1, "Hydraulic Press", new Pair[]{new Pair(prodMap.get("Gold"),1)}));
        prodMap.put("Diamond Plate", new AssemblyLineProduct("Diamond Plate", 1, "Hydraulic Press", new Pair[]{new Pair(prodMap.get("Diamond"),1)}));
        prodMap.put("Iron Plate", new AssemblyLineProduct("Iron Plate", 1, "Hydraulic Press", new Pair[]{new Pair(prodMap.get("Iron"),1)}));

        prodMap.put("AI Processor", new AssemblyLineProduct("AI Processor", 1, "Crafter MK3", new Pair[]{new Pair(prodMap.get("Circuit"), 10), new Pair(prodMap.get("Super Computer"),1), new Pair(prodMap.get("Copper Plate"), 6), new Pair(prodMap.get("Copper Cable"), 4)}));
        prodMap.put("AI Robot", new AssemblyLineProduct("AI Robot", 1, "Crafter MK3", new Pair[]{new Pair(prodMap.get("AI Robot Body"), 1), new Pair(prodMap.get("AI Robot Head"),1), new Pair(prodMap.get("Iron Plate"), 10), new Pair(prodMap.get("Diamond Cable"), 5)}));
        prodMap.put("AI Robot Arms", new AssemblyLineProduct("AI Robot Arms", 1, "Crafter MK3", new Pair[]{new Pair(prodMap.get("Laser"), 2), new Pair(prodMap.get("Aluminum Plate"),2), new Pair(prodMap.get("Aluminum Cable"), 3), new Pair(prodMap.get("Iron"), 8)}));
        prodMap.put("AI Robot Body", new AssemblyLineProduct("AI Robot Body", 1, "Crafter MK3", new Pair[]{new Pair(prodMap.get("Electric Engine"), 1), new Pair(prodMap.get("Solar Panel"),2), new Pair(prodMap.get("AI Robot Arms"), 1), new Pair(prodMap.get("Electric Board"), 5)}));
        prodMap.put("AI Robot Head", new AssemblyLineProduct("AI Robot Head", 1, "Crafter MK3", new Pair[]{new Pair(prodMap.get("AI Processor"), 1), new Pair(prodMap.get("Gold Plate"),5), new Pair(prodMap.get("Diamond Cable"),10), new Pair(prodMap.get("Circuit"), 10)}));
        prodMap.put("Electric Engine", new AssemblyLineProduct("Electric Engine", 1, "Crafter MK3", new Pair[]{new Pair(prodMap.get("Battery"), 2), new Pair(prodMap.get("Advanced Engine"),2), new Pair(prodMap.get("Electric Board"), 2), new Pair(prodMap.get("Iron Plate"), 5)}));
        prodMap.put("Explosive", new AssemblyLineProduct("Explosive", 1, "Crafter MK3", new Pair[]{new Pair(prodMap.get("Circuit"), 5), new Pair(prodMap.get("Diamond Wire"),10), new Pair(prodMap.get("Copper Cable"), 10), new Pair(prodMap.get("Heater Plate"), 10)}));
        prodMap.put("Ignition System", new AssemblyLineProduct("Ignition System", 1, "Crafter MK3", new Pair[]{new Pair(prodMap.get("Trigger"), 2), new Pair(prodMap.get("Explosive"),5), new Pair(prodMap.get("AI Processor"), 2), new Pair(prodMap.get("Battery"), 5)}));
        prodMap.put("Super Computer", new AssemblyLineProduct("Super Computer", 1, "Crafter MK3", new Pair[]{new Pair(prodMap.get("Computer"), 2), new Pair(prodMap.get("Server Rack"),1), new Pair(prodMap.get("Circuit"), 3), new Pair(prodMap.get("Gold Cable"), 3)}));
        prodMap.put("Trigger", new AssemblyLineProduct("Trigger", 1, "Crafter MK3", new Pair[]{new Pair(prodMap.get("Iron"), 40), new Pair(prodMap.get("Diamond Wire"),10), new Pair(prodMap.get("Circuit"), 5), new Pair(prodMap.get("Electric Board"), 5)}));

        prodMap.put("Plutonium", new AssemblyLineProduct("Plutonium",4, "Radioactive Starter", null));
        prodMap.put("Uranium", new AssemblyLineProduct("Uranium",4, "Radioactive Starter", null));

        prodMap.put("Refined Plutonium", new AssemblyLineProduct("Refined Plutonium", 5, "Refinery", new Pair[]{new Pair(prodMap.get("Plutonium"), 1)}));
        prodMap.put("Refined Uranium", new AssemblyLineProduct("Refined Uranium", 5, "Refinery", new Pair[]{new Pair(prodMap.get("Uranium"), 1)}));

        prodMap.put("Nuclear Cell", new AssemblyLineProduct("Nuclear Cell", 5, "Radioactive Crafter MK1", new Pair[]{
            new Pair(prodMap.get("Uranium Cell"), 1), new Pair(prodMap.get("Plutonium Cell"),1), 
            new Pair(prodMap.get("Solar Cell"), 3), new Pair(prodMap.get("Electric Board"), 3),
            new Pair(prodMap.get("Heater Plate"), 3), new Pair(prodMap.get("Refined Plutonium"), 4.2)}));
        prodMap.put("Nuclear Circuit", new AssemblyLineProduct("Nuclear Circuit", 5, "Radioactive Crafter MK1", new Pair[]{
            new Pair(prodMap.get("Uranium Circuit"), 1), new Pair(prodMap.get("Plutonium Circuit"),1), 
            new Pair(prodMap.get("Circuit"), 3), new Pair(prodMap.get("Gold Cable"), 3),
            new Pair(prodMap.get("Processor"), 3), new Pair(prodMap.get("Refined Plutonium"), 4.2)}));
        prodMap.put("Plutonium Cell", new AssemblyLineProduct("Nuclear Cell", 5, "Radioactive Crafter MK1", new Pair[]{
            new Pair(prodMap.get("Plutonium"), 2), new Pair(prodMap.get("Solar Cell"),2), 
            new Pair(prodMap.get("Diamond Liquid"), 2), new Pair(prodMap.get("Gold Cable"), 2),
            new Pair(prodMap.get("Copper Cable"), 2), new Pair(prodMap.get("Refined Plutonium"), 4.2)}));
        prodMap.put("Plutonium Circuit", new AssemblyLineProduct("Nuclear Circuit", 5, "Radioactive Crafter MK1", new Pair[]{
            new Pair(prodMap.get("Plutonium"), 4), new Pair(prodMap.get("Circuit"),5), 
            new Pair(prodMap.get("Copper"), 5), new Pair(prodMap.get("Gold Cable"), 1),
            new Pair(prodMap.get("Diamond Wire"), 2), new Pair(prodMap.get("Refined Plutonium"), 4.2)}));
        prodMap.put("Uranium Cell", new AssemblyLineProduct("Nuclear Cell", 5, "Radioactive Crafter MK1", new Pair[]{
            new Pair(prodMap.get("Uranium"), 2), new Pair(prodMap.get("Solar Cell"),2), 
            new Pair(prodMap.get("Diamond Liquid"), 2), new Pair(prodMap.get("Gold Cable"), 2),
            new Pair(prodMap.get("Copper Cable"), 2), new Pair(prodMap.get("Refined Plutonium"), 4.2)}));
        prodMap.put("Uranium Circuit", new AssemblyLineProduct("Nuclear Circuit", 5, "Radioactive Crafter MK1", new Pair[]{
            new Pair(prodMap.get("Uranium"), 4), new Pair(prodMap.get("Circuit"),5), 
            new Pair(prodMap.get("Copper"), 5), new Pair(prodMap.get("Gold Cable"), 1),
            new Pair(prodMap.get("Diamond Wire"), 2), new Pair(prodMap.get("Refined Plutonium"), 4.2)}));

        prodMap.put("AI Robot Bomber", new AssemblyLineProduct("AI Robot Bomber", 5, "Radioactive Crafter MK2", new Pair[]{
            new Pair(prodMap.get("Atomic Bomb"), 1), new Pair(prodMap.get("AI Robot"),1), 
            new Pair(prodMap.get("AI Processor"), 2), new Pair(prodMap.get("Nuclear Cell"), 3),
            new Pair(prodMap.get("Nuclear Processor"), 1), new Pair(prodMap.get("Nuclear Circuit"), 3), 
            new Pair(prodMap.get("Refined Plutonium"), 4.2)}));
        prodMap.put("Atomic Bomb", new AssemblyLineProduct("Atomic Bomb", 5, "Radioactive Crafter MK2", new Pair[]{
            new Pair(prodMap.get("Nuclear Processor"), 1), new Pair(prodMap.get("Nuclear Core"),1), 
            new Pair(prodMap.get("Ignition System"), 1), new Pair(prodMap.get("Nuclear Cell"), 1),
            new Pair(prodMap.get("Uranium"), 15), new Pair(prodMap.get("Plutonium"), 15), 
            new Pair(prodMap.get("Refined Plutonium"), 4.2)}));
        prodMap.put("Nuclear Core", new AssemblyLineProduct("Nuclear Core", 5, "Radioactive Crafter MK2", new Pair[]{
            new Pair(prodMap.get("Nuclear Cell"), 1), new Pair(prodMap.get("Uranium Cell"),1), 
            new Pair(prodMap.get("Plutonium Cell"), 1), new Pair(prodMap.get("Processor"), 10),
            new Pair(prodMap.get("Diamond Cable"), 4), new Pair(prodMap.get("Gold Cable"), 4), 
            new Pair(prodMap.get("Refined Plutonium"), 4.2)}));
        prodMap.put("Nuclear Processor", new AssemblyLineProduct("Nuclear Processor", 5, "Radioactive Crafter MK2", new Pair[]{
            new Pair(prodMap.get("Nuclear Circuit"), 1), new Pair(prodMap.get("Uranium Circuit"),1), 
            new Pair(prodMap.get("Plutonium Circuit"), 1), new Pair(prodMap.get("AI Processor"), 1),
            new Pair(prodMap.get("Processor"), 5), new Pair(prodMap.get("Diamond Plate"), 10), 
            new Pair(prodMap.get("Refined Plutonium"), 4.2)}));

    }

    public static void main(String[] args) {
        AssemblyLine2.setStats();
        for (Map.Entry<String, AssemblyLineProduct> entry : prodMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }

    public static String printPairList(Pair[] plist){
        String s = "";
        for(Pair p : plist){
            s += p + ", ";
        }
        s = s.substring(0, s.length()-2);
        return s;
    }
}



