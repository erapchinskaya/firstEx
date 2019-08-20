package main.java.com.it.app.domain;

import main.java.com.it.app.annotation.FileStorage;

@FileStorage(name = "CleaningLady")

public class CleaningLady extends Employee {

	private boolean retiree;

	@Override
	public String toString() {
		return "CleaningLady{" + "id=" + getId() + ", name='" + getName() + '\'' + ", secondName='" + getSecondName()
				+ ", age=" + getAge() + ", salary=" + getSalary() + ", retiree=" + getRetiree() + '}';
	}

	public CleaningLady(Long id, String name, String secondName, Integer age, Integer salary, boolean retiree) {
		super(id, name, secondName, age, salary);
		this.retiree = retiree;
	}

	public CleaningLady() {
		super();
	}

	public boolean getRetiree() {
		boolean retiree;
		if (getAge() >= 60) {
			retiree = true;
		} else {
			retiree = false;
		}
		return retiree;
	}

	public void setRetiree(boolean retiree) {
		this.retiree = retiree;
	}

}
