package SRP;

import javax.xml.crypto.Data;

public class Employee {
    private String name;
    private Data dob;
    public String dol;

    public Employee(String name, Data dob, String dol) {
        this.name = name;
        this.dob = dob;
        this.dol = dol;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dob=" + dob +
                ", dol='" + dol + '\'' +
                '}';
    }
}
