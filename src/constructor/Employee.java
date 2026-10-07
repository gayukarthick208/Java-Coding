package constructor;

public class Employee {
	Employee (){
		System.out.println("empty");
	}
Employee(String empname,int empid,float empsalary){
	System.out.println("name:" + empname);
	System.out.println("id:" + empid);
	System.out.println("salary:" + empsalary);

}



public static void main(String[] args) {
	Employee e = new Employee();
	Employee  j = new Employee("josh" , 3375 ,45000.08f );
	Employee l = new Employee("yash", 7644 , 45000.00f);
	
	
	
}
}
