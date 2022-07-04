import java.util.Scanner;
public class arraySortDesc{
    
    public static void main(String[] args) {
        int [] arr=new int[10];
        int count,s;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the count of the array elements");
        count=sc.nextInt();
        System.out.println("enter the elements");
        for(int i=0;i<count;i++){
            arr[i]=sc.nextInt();

        }
        
        for(int i=0;i<count-1;i++){
            for(int j=i+1;j<count;j++){
                if(arr[i]<arr[j]){
                    s=arr[i];
                    arr[i]=arr[j];
                    arr[j]=s;
                }
            }
        }
        System.out.println("sorted elements is");
        for(int i =0;i<count;i++){
            System.out.println(arr[i]);
        }


        
    }

}