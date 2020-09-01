package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Vector;

//SingleLinkedList

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
class EmployeeNode{
    private Employee employee;
    private EmployeeNode next;

    public EmployeeNode(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeNode getNext() {
        return next;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }
    public String toString() {
        return employee.toString();
    }
}

class EmployeeLinkedList{
    private EmployeeNode head;
    private int size;
    public void AddtoFront(Employee employee){
        EmployeeNode node=new EmployeeNode(employee);
        node.setNext(head);
        head=node;
        size++;
    }

    public int getSize() {
        return size;
    }
    public boolean IsEmpty(){
        return head==null;
    }
    public EmployeeNode RemovefromFront(){
        if(IsEmpty()){
            return null;
        }
        EmployeeNode removenode=head;
        head=head.getNext();
        size--;
        removenode.setNext(null);
        return removenode;
    }

    public void PrintList(){
        EmployeeNode current=head;
        System.out.print("HEAD ->");
        while (current !=null){
            System.out.println(current);
            System.out.println(" -> ");
            current=current.getNext();
        }
        System.out.println("null");
    }

}

class Play{
    public static void main(String[] arg ){
        Employee e0=new Employee("ahmad0","kabeer0",100);
        Employee e1=new Employee("ahmad1","kabeer1",101);
        Employee e2=new Employee("ahmad2","kabeer2",102);
        Employee e3=new Employee("ahmad3","kabeer3",103);
        Employee e4=new Employee("ahmad4","kabeer4",104);

        EmployeeLinkedList list=new EmployeeLinkedList();
        list.AddtoFront(e0);
        list.AddtoFront(e1);
        list.AddtoFront(e2);
        list.AddtoFront(e3);
        list.AddtoFront(e4);
        list.PrintList();
        System.out.println(list.getSize());
        System.out.println(list.IsEmpty());
        list.RemovefromFront();
        System.out.println(list.getSize());
        list.PrintList();
    }
}


