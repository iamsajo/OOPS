import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class secondLarge{
    
    public static void main(String[] args) {
        int [] arr=new int[10];
        ArrayList <Integer> large = new ArrayList<Integer>();
        int count;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the count of the array elements");
        count=sc.nextInt();
        System.out.println("enter the elements");
        for(int i=0;i<count;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<count;i++){
            if(!(large.contains(arr[i]))){
                large.add(arr[i]);
            }
        }
        
        Collections.sort(large);     
        System.out.println(large);
        System.out.println("2nd largest number is "+large.get(large.size()-2)); 
    }

}