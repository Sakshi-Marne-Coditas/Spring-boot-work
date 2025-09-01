package com.Coditas.CRUD;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class EntityClass {
    @Id
    @Column(name="emp_id")
    private int employeeId;
    @Column(name="emp_name")
    private String EmployeeName;
    @Column(name="emp_department")
    private String EmployeeDepartment;

    public EntityClass() {
    }

    public EntityClass(int employeeId, String employeeName, String employeeDepartment) {
        this.employeeId = employeeId;
        EmployeeName = employeeName;
        EmployeeDepartment = employeeDepartment;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    public String getEmployeeDepartment() {
        return EmployeeDepartment;
    }

    public void setEmployeeDepartment(String employeeDepartment) {
        EmployeeDepartment = employeeDepartment;
    }

    @Override
    public String toString() {
        return "EntityClass{" +
                "employeeId=" + employeeId +
                ", EmployeeName='" + EmployeeName + '\'' +
                ", EmployeeDepartment='" + EmployeeDepartment + '\'' +
                '}';
    }
}
