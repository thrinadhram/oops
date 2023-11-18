package Encaptulation;

class employee {

	private int employeeid;
	private String employeeName;
	private int employeeSalary;

	public void setEmployeeid(int employeeid) {

		this.employeeid = employeeid;

	}

	public  int getEmployeeid() {

		return employeeid;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;

	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public int getEmployeeSalary() {
		return employeeSalary;
	}

}

public class Encaptulationdemo {

	public static void main(String[] args) {
		employee em = new employee();
		em.setEmployeeid(10);
		System.out.println("my employee id is:" + em.getEmployeeid());

		em.setEmployeeName("Thrinadhram");
		System.out.println("my name is:" + em.getEmployeeName());

		em.setEmployeeSalary(10000);
		System.out.println("my monthly salary is:" + em.getEmployeeSalary());

	}

}
