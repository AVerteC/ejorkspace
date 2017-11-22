

public class battery {

    private double capacity = 0;
    private double originalcapacity = 0;

    private battery(double capacity) {

        if ((capacity < 2000 || capacity > 3000)) {
            System.exit(0);
        }
        else {
            this.capacity = capacity;
            originalcapacity = capacity;
        }
    }

    private void drain(double amount){
        capacity = capacity - amount;
        if (capacity < 0){
            capacity = 0;
            //System.out.println("Battery is depleted");
        }
    }
    private void charge() {
        capacity = originalcapacity;
    }

    private double getRemainingCapacity()  {
        //System.out.println(capacity);
        return capacity;
    }

    public static void main (String[] args) {
        battery AA = new battery(2500);
        AA.drain(100);
        System.out.println(AA.getRemainingCapacity());
        AA.charge();
        System.out.println(AA.getRemainingCapacity());

    }









}



