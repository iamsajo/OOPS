import java.util.ArrayList;
import java.util.Scanner;
public class duplicate{
    
    public static void main(String[] args) {
        int [] arr=new int[10];
        ArrayList <Integer> dup =new ArrayList<Integer>();
        int count;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the count of the array elements");
        count=sc.nextInt();
        System.out.println("enter the elements");
        for(int i=0;i<count;i++){
            arr[i]=sc.nextInt();
        }
        
        for(int i=0;i<count-1;i++){
            for(int j=i+1;j<count;j++){
                if(arr[i]==arr[j] && !(dup.contains(arr[j]))){
                    dup.add(arr[j]);
                    break;
                }
                
            }
        }
        System.out.println("dupliacted elements are"+dup);
        
    }

}