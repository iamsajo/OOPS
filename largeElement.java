import java.util.Scanner;
public class largeElement{
    public static void main(String[] args) {
        int [] arr=new int[10];
        int count,large=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the count of the array elements");
        count=sc.nextInt();
        System.out.println("enter the elements");
        for(int i=0;i<count;i++){
            arr[i]=sc.nextInt();
            if(large<arr[i]){
                large=arr[i];
            }
        }
        System.out.println("Largest Element in the array is "+large);
        
        


        
    }

}