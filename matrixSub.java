import java.util.Scanner;

public class matrixSub{
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

    public void sub(int row, int col, int[][] arr1, int[][] arr2){
        int[][] arr=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=arr1[i][j]-arr2[i][j];
            }
        }
        Display(arr, row, col);
    }


    public static void main(String[] args){
        int row1,col1,row2,col2;
        matrixSub obj=new matrixSub();
        System.out.println("Enter the number of rows and columns of matrix 1");
        row1=obj.s.nextInt();
        col1=obj.s.nextInt();
        System.out.println("Enter the number of rows and columns of matrix 2");
        row2=obj.s.nextInt();
        col2=obj.s.nextInt();
        if(row1!=row2 && col1!=col2){
            System.out.println("Substration is not posssible not possible");
        }
        else{
            int[][] arr1=obj.input(row1,col1);
            int[][] arr2=obj.input(row2,col2);
            obj.sub(row1,row2,arr1,arr2);
            
        }

    }

}