import java.util.Scanner;

public class scantest
{
    public static void main (String [] args) {
        int age;
        String name;
        String bclear;

        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter your age ");
        age = reader.nextInt();
        bclear = reader.nextLine();
        System.out.println("Please type your name ");
        name = reader.nextLine();
        System.out.println(name + " is " + age + " years old.");


    }








}