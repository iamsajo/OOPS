import java.util.Scanner;
public class copyArray{
    
    public static void main(String[] args) {
        int [] arr=new int[10];
        int [] copy=new int[10];
        int count;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the count of the array elements");
        count=sc.nextInt();
        System.out.println("enter the elements");
        for(int i=0;i<count;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<count;i++){
            copy[i]=arr[i];
        }
        
        System.out.println("copied array elements are");
        for(int i=0;i<count;i++){
            System.out.println(copy[i]);
        }


        
    }

}
