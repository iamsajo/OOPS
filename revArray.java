import java.util.Scanner;
public class revArray{
    
    public static void main(String[] args) {
        int [] arr=new int[10];
        int count,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the count of the array elements");
        count=sc.nextInt();
        System.out.println("enter the elements");
        for(int i=0;i<count;i++){
            arr[i]=sc.nextInt();
            
        }
        System.out.println("Reverse of the array");
        for(int i=count-1;i>0-1;i--){
            System.out.println(arr[i]);
        }
        
        


        
    }

}