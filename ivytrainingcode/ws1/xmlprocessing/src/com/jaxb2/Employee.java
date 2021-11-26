package com.jaxb2;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="employee")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="employeeType", propOrder = {"id","salary","name"})
public class Employee {
 @XmlElement(required = true)
 private int id;
 private String name;
 private double salary;

 public Employee() {
  super();
  // TODO Auto-generated constructor stub
 }

 public Employee(int id, String name, double salary) {
  super();
  this.id = id;
  this.name = name;
  this.salary = salary;
 }

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

 public double getSalary() {
  return salary;
 }

 public void setSalary(double salary) {
  this.salary = salary;
 }

 @Override
 public String toString() {
  return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
 }

}