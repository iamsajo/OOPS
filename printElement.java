import java.util.Scanner;
public class printElement{
    
    public static void main(String[] args) {
        int [] arr=new int[10];
        int count;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the count of the array elements");
        count=sc.nextInt();
        System.out.println("enter the elements");
        for(int i=0;i<count;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("entered elements are");
        for(int i=0;i<count;i++){
            System.out.println(arr[i]);
        }


        
    }

}