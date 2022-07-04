import java.util.Scanner;

public class matrixIdentity {
    Scanner s=new Scanner(System.in);
    public void Display(int [][] arr,int row,int col){
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }

    }
    public int[][] input(int row,int col){
        int[][] arr=new int[row][col];
        System.out.println("Enter the elements of matrix");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=s.nextInt();
            }
        }
        return arr;
    }

    public void identity(int row,int col, int [][] arr){
        int flag=1;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(arr[i][j]!=1 && arr[j][i]!=0){
                    flag=0;
                    break;
                }
            }
        }
        if(flag == 1)
  	    {
  		    System.out.println("The Matrix that you entered is an Identity Matrix ");
	    }
	    else{
            System.out.println("The Matrix that you entered is Not an Identity Matrix ");
        }
    }

    public static void main(String[] args){
        int row1,col1;
        matrixIdentity obj=new matrixIdentity();
        System.out.println("Enter the number of rows and columns of matrix 1");
        row1=obj.s.nextInt();
        col1=obj.s.nextInt();
        int[][] arr1=obj.input(row1,col1);
        obj.identity(row1, col1, arr1);

    }
}
