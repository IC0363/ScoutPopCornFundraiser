public class Main {
    public static void main (String[]args){
        PopcornOrder o1 = new PopcornOrder("Jalapeno", 1);
        PopcornOrder o2 = new PopcornOrder("Butter Microwave", 3);
        PopcornOrder o3 = new PopcornOrder("Butter Microwave", 2);
        PopcornOrder o4 = new PopcornOrder("Caramel With Sea Salt", 2);
        PopcornOrder o5 = new PopcornOrder("Caramel With Sea Salt", 5);
        PopcornOrder o6 = new PopcornOrder("Kettle Corn", 4);

        

        MasterList popcorn2023 = new MasterList();
        popcorn2023.addOrder(o1);
        popcorn2023.addOrder(o2);
        popcorn2023.addOrder(o3);
        popcorn2023.addOrder(o4);
        popcorn2023.addOrder(o5);
        popcorn2023.addOrder(o6);

        System.out.println(popcorn2023.toString());
        System.out.println(popcorn2023.getTotalOrders());
        System.out.println(popcorn2023.removeVariety("Butter MicroWave"));
        System.out.println(popcorn2023.removeVariety("Sea Salt Splash"));
        System.out.println(popcorn2023.removeVariety("Kettle Corn"));
        System.out.println(popcorn2023.toString());


        MasterList popcorn2024 = new MasterList();
        System.out.println(popcorn2024.getTotalOrders());
        System.out.println(popcorn2024.removeVariety("Butter MicroWave"));
        System.out.println(popcorn2024.removeVariety("Sea Salt Splash"));
        System.out.println(popcorn2024.removeVariety("Kettle Corn"));
        System.out.println(popcorn2024.toString());
    }
    
}
