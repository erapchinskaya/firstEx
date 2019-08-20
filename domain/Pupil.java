package main.java.com.it.app.domain;

import main.java.com.it.app.annotation.FileStorage;

@FileStorage(name = "Pupil")
public class Pupil extends BaseEntity {
	private String name;
	private String secondName;
	private Integer age;
	private Integer grade;
	private Subject subject;

	public Pupil(long id, String name, String secondName, Integer age, Integer grade, Subject subject) {
		super(id);
		this.name = name;
		this.secondName = secondName;
		this.age = age;
		this.grade = grade;
		this.subject = subject;
	}

	public Pupil() {

	}

	@Override
	public String toString() {
		return "Pupil [ Id=" + getId() + ", name=" + name + ", secondName=" + secondName + ", age=" + age + ", grade=" + grade + ", subject:"
				+ subject + "]";
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public Integer getGrade() {
		return grade;
	}

	public void setGrade(Integer grade) {
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}
