package BT.backend.model;

import java.util.Date;

public class Employee {
    private String name;
    private Date birthday;
    private String id;

    public Employee(String name, Date birthday, String id) {
        this.name = name;
        this.birthday = birthday;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", id='" + id + '\'' +
                '}';
    }

    public String toTableRow() {
        return String.format("| %-9s| %-14s| %-12s|", name, birthday, id);
    }
}
