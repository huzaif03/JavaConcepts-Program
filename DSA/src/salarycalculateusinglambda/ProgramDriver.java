package salarycalculateusinglambda;
public class ProgramDriver {
	public static void main(String[] args) {
		
//		Example of Anonymous class
		Employee e1 = new Employee(101,"Rohit",50000,6);
		SalaryCalculator sc = (Employee emp) -> {
			if(e1.experience > 2 && e1.experience <= 5) {
				double bonus = e1.basicSalary * 10/100;
				return e1.basicSalary+bonus;
			}else if(e1.experience > 5) {
				double bonus = e1.basicSalary * 20/100;
				return e1.basicSalary+bonus;
			}
			return e1.basicSalary;
		};
		
		double totalSalary = sc.calculateSalary(e1);
		System.out.println(totalSalary);
	}
}
