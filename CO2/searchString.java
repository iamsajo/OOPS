import java.util.Scanner;
public class searchString {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String [] str=new String[5];
        int count;
        System.out.println("enter the count");
        count=s.nextInt();
        System.out.println("enter the elements");
        for(int i=0;i<count;i++){
            str[i]=s.next();
        }
        for(int i=0;i<count;i++){
            System.out.print(str[i]+"\t");
        }
        System.out.println();
        // search an elements
        System.out.println("enter the element to search");
        String search=s.next();
        int flag=0;
        for(int i=0;i<count;i++){
            if(str[i].equals(search)){
                System.out.println("element found at index "+i);
                flag=1;
                break;
            }

        }
        if(flag==0){
            System.out.println("element not found");
        }
    }
    
}
