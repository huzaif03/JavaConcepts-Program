package array;

import java.util.Scanner;

public class EmployeeDriver {
		public static void main(String[] args) {
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter the number of employees");
			int size = sc.nextInt();
			Employee e[]= new Employee[size]; 
			for(int i=0;i<e.length;i++) {
				System.out.println("Enter the employe name");
				String name = sc.next();
				System.out.println("Enter the Emp. salary");
				int salary = sc.nextInt();
				e[i] = new Employee(name,salary);
			}
			for(int i = 0 ;i<e.length ; i++) {
				if(e[i].salary>15000 && e[i].salary <30000) {
					System.out.println(e[i]);
				}
			}
		}
}
