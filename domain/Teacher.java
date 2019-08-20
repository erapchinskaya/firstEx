package main.java.com.it.app.domain;

import main.java.com.it.app.annotation.FileStorage;

@FileStorage(name = "Teacher")
public class Teacher extends Employee {

	private String subject;

	@Override
	public String toString() {
		return "Teacher{" + "id=" + getId() + ", name='" + getName() + '\'' + ", secondName='" + getSecondName() + '\''
				+ ", age=" + getAge() + ", salary=" + getSalary() + ", subject=" + getSubject() + '}';
	}

	public Teacher(Long id, String name, String secondName, Integer age, Integer salary, String subject) {
		super(id, name, secondName, age, salary);
		this.subject = subject;
	}

	public Teacher() {
		super();
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

}
