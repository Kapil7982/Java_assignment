package question4;

import javax.persistence.Entity;

@Entity
public class SalariedEmployee extends Employee{

	@Override
	public String toString() {
		return "SalariedEmployee [salary=" + salary + ", email=" + email + "]";
	}
	private int salary;
    private String email;
    
    
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
    

}
