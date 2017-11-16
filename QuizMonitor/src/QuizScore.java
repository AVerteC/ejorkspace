//import java.math.*;

public class QuizScore {


    private int count = 0;
    private double max = 0;
    private double min = 0;
    private double avg = 0;
    private double sum = 0;
    private double oldmin = 0;
    private Boolean droptest = false;


    // constructor
    public QuizScore() {
        count = 0;
        sum = 0;
        min = 10000;
        max = -100;
    }


    public void addscore(double score) {
        sum += score;
        count = count + 1 ;
        if (score > max) {
            max = score;
        }

        if (score < min) {
            oldmin = min;
            min = score;
        }
    }

    public double getLow() {
        return min;
    }

    public double getAverage() {
        avg = sum / count;
        return avg;
    }

    public void dropLow() {
        if (!droptest); {
            count = count - 1;
            min = oldmin;
            sum = sum - min;
        }
    }
    public static void main(String[] args) {
        QuizScore studenta = new QuizScore();
        // QuizScore studentb = new QuizScore();
        // QuizScore studentc = new QuizScore();
        studenta.addscore(70);
        studenta.addscore(50);
        studenta.getLow();
        studenta.dropLow();

        System.out.println("student A has an average score of " + studenta.getAverage());
        System.out.println(" student A has a low score of " + studenta.getLow());

    }

}

