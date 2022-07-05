package RECORD;

// Prepare bill with the given format using calculate method from interface.
import java.util.Scanner;

interface Bill {
    void calculate(int s, String name, double rate, int q);
}

public class billInteerface implements Bill {
    public void calculate(int s, String name, double rate, int q) {
        double amt = q * rate;
        System.out.println("Name: " + name);
        System.out.println("Quantity: " + q);
        System.out.println("Rate: " + rate);
        System.out.println("Amount: " + amt);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s, q;
        String name;
        double rate;
        billInteerface b = new billInteerface();
        System.out.println("Enter the name of the item");
        name = sc.next();
        System.out.println("Enter the quantity of the item");
        q = sc.nextInt();
        System.out.println("Enter the rate of the item");
        rate = sc.nextDouble();
        b.calculate(s = 1, name, rate, q);
    }
}