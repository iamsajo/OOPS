import java.util.Arrays;
public class stringSort{
    public static void main(String[] args){
        String s="qwerty";
        char[] ch=s.toCharArray();
        Arrays.sort(ch);
        String sort= new String(ch);
        System.out.println(sort);
        
    }
}