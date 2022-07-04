import java.util.Scanner;
public class demo {
    public static void main(String[] args){
        String name;
        int a;
        System.out.println("enter your name");
        Scanner s = new Scanner(System.in);
        name=s.nextLine();
        System.out.println("enter the number");
        a=s.nextInt();
        System.out.println(name);
        System.out.println(a);
    }
    
}
