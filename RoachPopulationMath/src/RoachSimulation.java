public class RoachSimulation {

    public static void main(String[] args){
        RoachPopulation rpop1 = new RoachPopulation(10);
        rpop1.breed();
        rpop1.spray(10);
        System.out.println(rpop1.getRoaches());

        rpop1.breed();
        rpop1.spray(10);
        System.out.println(rpop1.getRoaches());

        rpop1.breed();
        rpop1.spray(10);
        System.out.println(rpop1.getRoaches());

    }
}
