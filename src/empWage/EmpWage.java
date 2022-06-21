package empWage;

public class EmpWage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Employee Wage");
		int employeePresent = 1;
		int isPresent = (int) (Math.floor(Math.random() * 10) % 2);
		if(isPresent == employeePresent)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is not Present");
	}

}
