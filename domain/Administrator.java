package main.java.com.it.app.domain;

import main.java.com.it.app.annotation.FileStorage;

@FileStorage(name = "Administrator")
public class Administrator extends Employee {
    private String position;

    public Administrator(Long id, String name, String secondName, Integer age, Integer salary, String position) {
        super(id, name, secondName, age, salary);
        this.position = position;
    }

    public Administrator() {
        super();
    }

    @Override
    public String toString() {
        return "Administrator{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", secondName='" + getSecondName() + '\'' +
                ", age=" + getAge() +
                ", salary=" + getSalary() +
                ", position=" + getPosition() +
                '}';
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

}
