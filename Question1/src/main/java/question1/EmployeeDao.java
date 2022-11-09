package question1;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class EmployeeDao {

	public void addDepartment(Department dept) {
		
		EntityManager em = Persistence.createEntityManagerFactory("evaluationUnit").createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(dept);
		
		em.getTransaction().commit();
		
		em.close();
	}
	
	 public void addEmployee(Employeee emp){
		 
		 EntityManager em = Persistence.createEntityManagerFactory("evaluationUnit").createEntityManager();
		 
		 em.getTransaction().begin();
		 
		 em.persist(emp);
		 
		 em.getTransaction().commit();
		 
		 em.close();
		 
		 
		 
	 }
	 
	 public void registerEmployeeTODepartment(int empId, int deptId)throws EmployeeException, DepartmentException {
		 
		 EntityManager em = Persistence.createEntityManagerFactory("evaluationUnit").createEntityManager();
		 
		 Employeee emp = em.find(Employeee.class, empId);	
		 
		 Department dept = em.find(Department.class, deptId);
		 
		 if(emp != null && dept!= null)
		 {
			 emp.setDept(dept);
			 dept.getEmp().add(emp);
			 
			 
			 em.getTransaction().begin();
			 
			 em.persist(emp);
			 
			 em.getTransaction().commit();
			 
			 em.close();
		 }
		 else if(emp == null)
		 {
			 throw new EmployeeException("Employee not found");
		 }
		 else if(dept==null)
		 {
			 throw new DepartmentException("Department not found");
		 }
	 }
	 
	 
	 List<Employeee> getAllEmployeeWithDeptName(String deptName)throws EmployeeException {
		 
		 List<Employeee>  list = null;
		 EntityManager em = Persistence.createEntityManagerFactory("evaluationUnit").createEntityManager();
		 
		 Query q = em.createNamedQuery("select emp from Department where deptName=?1");
		 
		 q.setParameter(1, deptName);
		 
		 list = q.getResultList();
		 
		 if(list.size() ==0)
		 {
			 throw new EmployeeException("Employee is not available in this department");
		 }
		 
		 return list;
		 
		 
	 }
	 
	 Department getDepartmentDetailsByEmployeeId(int empId)throws DepartmentException {
		 
		 Department dept = null;
		 
		 EntityManager em = Persistence.createEntityManagerFactory("evaluationUnit").createEntityManager();
		 
		 Employeee emp = em.find(Employeee.class, empId);
		 
		 
		 dept  = emp.getDept();
		 
		 if(dept ==null)
		 {
			 throw new DepartmentException("Not in any department");
		 }
		 
		 return dept;
	 }
}
