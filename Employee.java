package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//ArrayList

public class Employee {
    private String FirstName;
    private String Lastname;
    private int id;

    public Employee(String FirstName, String Lastname, int id) {
        this.FirstName = FirstName;
        this.Lastname = Lastname;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                FirstName.equals(employee.FirstName) &&
                Lastname.equals(employee.Lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(FirstName, Lastname, id);
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "FirstName='" + FirstName + '\'' +
                ", Lastname='" + Lastname + '\'' +
                ", id=" + id +
                '}';
    }
}

class Play{
    public static void main(String[] arg ){
        List<Employee> employeeList=new ArrayList<>();
        employeeList.add(new Employee("ahmad1","kabeer1",101));
        employeeList.add(new Employee("ahmad2","kabeer2",102));
        employeeList.add(new Employee("ahmad3","kabeer3",103));
        employeeList.add(new Employee("ahmad4","kabeer4",104));
        employeeList.add(new Employee("ahmad5","kabeer5",105));

//        employeeList.forEach(employee -> System.out.println(employee));

//        employeeList.add(new Employee("ahmad6","kabeer6",106));
//        employeeList.forEach(employee -> System.out.println(employee));
//
//        System.out.println(employeeList.isEmpty());
//        System.out.println(employeeList.size());
//
//        employeeList.add(3,new Employee("ahmad33","kabeer33",1033));
//        employeeList.forEach(employee -> System.out.println(employee));

//        Object[] employeObjects = employeeList.toArray();
//        for (Object i:employeObjects) {
//            System.out.println(i);
//        }

        //System.out.println(employeeList.contains(new Employee("ahmad3","kabeer3",103)));
        //System.out.println(employeeList.indexOf(new Employee("ahmad3","kabeer3",103)));
        employeeList.remove(2);
        employeeList.forEach(employee -> System.out.println(employee));
    }
}



