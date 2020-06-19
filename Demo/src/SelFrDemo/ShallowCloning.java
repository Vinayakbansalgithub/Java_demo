package SelFrDemo;
 class Employeeeee implements Cloneable{
	 
    private int empoyeeId;
    private String employeeName;
    private Department department;
 
    public int getEmpoyeeId() {
		return empoyeeId;
	}
	public void setEmpoyeeId(int empoyeeId) {
		this.empoyeeId = empoyeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Employeeeee(int id, String name, Department dept)
    {
        this.empoyeeId = id;
        this.employeeName = name;
        this.department = dept;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
       // return super.clone();
    
    
    	Employeeeee cloned = (Employeeeee)super.clone();
    	    cloned.setDepartment((Department)cloned.getDepartment().clone());
    	    return cloned;
    	}
    }
     
    //Accessor/mutators methods will go there


 class Department implements Cloneable
{
    private int id;
    private String name;
 
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
    //Accessor/mutators methods will go there
	 protected Object clone() throws CloneNotSupportedException {
	        return super.clone();
	 }
}
public class ShallowCloning {
	public static void main(String[] args) throws CloneNotSupportedException
    {
	/*Department dept = new Department(1, "Human Resource");
	Employeeeee original = new Employeeeee(1, "Admin", dept);
    //Lets create a clone of original object
	Employeeeee cloned = (Employeeeee) original.clone();
    //Let verify using employee id, if cloning actually workded
    //System.out.println(cloned.getEmpoyeeId());

    //Verify JDK's rules

    //Must be true and objects must have different memory addresses
    System.out.println(original != cloned);

    //As we are returning same class; so it should be true
    System.out.println(original.getClass() == cloned.getClass());

    //Default equals method checks for refernces so it should be false. If we want to make it true,
    //we need to override equals method in Employee class.
    System.out.println(original.equals(cloned));*/
		
		
		
		
		 Department hr = new Department(1, "Human Resource");
			Employeeeee original = new Employeeeee(1, "Admin", hr);
			Employeeeee cloned = (Employeeeee) original.clone();
	 
	        //Let change the department name in cloned object and we will verify in original object
	        cloned.getDepartment().setName("Finance");
	 
	        System.out.println(original.getDepartment().getName());
	    }
}

