import java.util.Scanner;
public class Arrayofobjects
{  public static void main(String [] args)
      {  int a,en,es;
	     String ena;
 	     Scanner sc = new Scanner(System.in);
	     System.out.print(" Enter the number of employee's:");
         a = sc.nextInt();
         Product [] Em = new Product[a];
         for(int i=0;i<a;i++)
		 {  System.out.print(" Employee "+(i+1)+" : \n");
	        System.out.print(" Enter the employee number:");
	        en = sc.nextInt();
		    System.out.print(" Enter the employee name:");
	        ena  = sc.next();
            System.out.print(" Enter the employee salary:");
	        es = sc.nextInt();
            Em[i] = new Product(en,ena,es);			
	      }
		 for(int i=0;i<a;i++)
		 {  Em[i].display(i);		 
	      } 
	  }
}
class Product
{     int a,eno,esalary;
      String ename;
	  Scanner sc = new Scanner(System.in);
      Product(int en,String ena,int es)	  
      { eno = en;
	    ename  = ena;
	    esalary = es;		
	  }
	  public void display(int b)	  
      { System.out.println(" Details of Employee "+b);
	    System.out.println(" The employee"+(b+1)+" no : "+eno);
		System.out.println(" The employee"+(b+1)+" name : "+ename);
        System.out.println(" The employee"+(b+1)+" salary : "+esalary);	
	  }
 }
 //Program to create a class for Employee having attributes eNo, eName eSalary. Read n
//employ information and Search for an employee given eNo, using the concept of Array of
//Objects.