public class RoachPopulation {

    private double roachpopulation = 0;

    public RoachPopulation(int roachamount) {
        roachpopulation = roachamount;
    }

    public void breed() {
        //Simulate roach breeding
        roachpopulation = roachpopulation * 2;
    }

     public void spray(double percent) {
        roachpopulation = Math.floor(roachpopulation - (percent/100));
     }

    public double getRoaches() {
        return roachpopulation;
    }



}
