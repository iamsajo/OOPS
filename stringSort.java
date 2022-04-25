import java.util.Arrays;
public class stringSort{
    public static void main(String[] args){
        String s="qwerty";
        char[] ch=s.toCharArray();
        Arrays.sort(ch);
        String sort= new String(ch);
        System.out.println("Original string is ");
        System.out.println(s);
        System.out.println("sorted string is");
        System.out.println(sort);
        
    }
}