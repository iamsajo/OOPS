import java.util.Scanner;

public class arraySearch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String search;
        String [] str=new String[30];
        int count,flag=0;
        System.out.println("enter the count of the array");
        count=sc.nextInt();
        System.out.println("enter the elements");
        for(int i=0; i<count; i++){
            str[i]=sc.next();
        }
        System.out.println("Enterred array is..");
        for(int i=0;i<count;i++){
            System.out.println(str[i]);
        }
        System.out.println("enter the element to be search");
        search=sc.next();
        for(int i=0; i<count; i++){
            if(search.equals(str[i])){
                flag=1;
                break;
            }
            else{
                flag=0;
            }
        }
        if(flag==0){
            System.out.println("element to be search is not found");
        }
        else{
            System.out.println("element to be search is found");
        }
    }
}
