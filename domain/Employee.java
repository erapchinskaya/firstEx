package main.java.com.it.app.domain;


abstract public class Employee extends BaseEntity {
    private String name;
    private String secondName;
    private Integer age;
    private Integer salary;

    public Employee() {

    }

    public Employee(Long id, String name, String secondName, Integer age, Integer salary) {
    	super(id);
        this.name = name;
        this.secondName = secondName;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", secondName='" + getSecondName() + 
                ", age=" + getAge() +
                ", salary=" + getSalary() +
                '}';
    }

    public String getSecondName() {
    	return secondName;
	}
    
    public void setSecondName(String secondName) {
    	this.secondName = secondName;
	}
  
	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
