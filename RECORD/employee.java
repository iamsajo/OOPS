package RECORD;
// Program to create a class for Employee having attributes eNo, eName eSalary. 

// Read n employ information and Search for an employee given eNo, using the concept of Array of Objects.

import java.util.Scanner;

public class employee {
    int n, e_id;
    double e_salary;
    String e_name;

    public employee(int e_id, String e_name, double e_salary) {
        this.e_id = e_id;
        this.e_name = e_name;
        this.e_salary = e_salary;
    }

    public static void main(String[] args) {
        int flag = 0;
        System.out.println("Enter the number of employees");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        employee[] e = new employee[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the employee id");
            int e_id = sc.nextInt();
            System.out.println("Enter the employee name");
            String e_name = sc.next();
            System.out.println("Enter the employee salary");
            double e_salary = sc.nextDouble();
            e[i] = new employee(e_id, e_name, e_salary);
        }
        System.out.println("Enter the employee id to be searched");
        int e_id = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (e[i].e_id == e_id) {
                flag = 1;
                System.out.println("Employee found");
                System.out.println("Employee id: " + e[i].e_id);
                System.out.println("Employee name: " + e[i].e_name);
                System.out.println("Employee salary: " + e[i].e_salary);
            }

        }
        if (flag == 0) {
            System.out.println("Employee not found");
        }
    }
}
