import java.util.ArrayList;
import java.util.Scanner;
public class oddEven{
    
    public static void main(String[] args) {
        int [] arr=new int[10];
        ArrayList <Integer> odd = new ArrayList<Integer>();
        ArrayList <Integer> even = new ArrayList<Integer>();
        int count;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the count of the array elements");
        count=sc.nextInt();
        System.out.println("enter the elements");
        for(int i=0;i<count;i++){
            arr[i]=sc.nextInt();
            if(arr[i]%2==0){
                even.add(arr[i]);
            }
            else{
                odd.add(arr[i]);
            }
        }

        System.out.println("odd numbers are");
        System.out.println(odd);
        System.out.println("even numbers are");
        System.out.println(even);

        
    }

}