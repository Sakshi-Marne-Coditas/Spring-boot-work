package com.AOPPractice.AOP.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Account {
    @Id
    private int id;
    private String holder_name;
    private double balance;

    public Account() {
    }

    public Account(int id, String holder_name, double balance) {
        this.id = id;
        this.holder_name = holder_name;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHolder_name() {
        return holder_name;
    }

    public void setHolder_name(String holder_name) {
        this.holder_name = holder_name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", holder_name='" + holder_name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
