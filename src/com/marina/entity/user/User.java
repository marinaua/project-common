/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marina.entity.user;

import com.marina.entity.Entity;

/**
 *
 * @author Marik
 */
public class User implements IUser, Entity {

    protected static final long serialVersionUID = 1L;
    private final String table = "user";
    protected int id;
    protected String name;
    protected String surname;
    protected String login;
    protected String password;
    protected String role; //TODO: Delete
    protected double income;
    protected int managerID;

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public int getManagerID() {
        return managerID;
    }

    public void setManagerID(int managerID) {
        this.managerID = managerID;
    }

    @Override
    public String getTable() {
        return table;
    }

    @Override
    public int getID() {
        return id; //TODO: check if id = null
    }

    public void setID(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String getColumns() {
        return "id, name, surname, income, manager_id, login, password, role";
    }

    @Override
    public String getValues() {
        return "'" + id + "', '" + name + "', '" + surname + "', '" + income + "', '" + managerID + "', '" + login + "', '" + password + "', " + role + "'";
    }

    @Override
    public String toString() {
        return "AbstractUser{" + "id=" + id + ", name=" + name + ", surname=" + surname + ", '" + income + "', '" + managerID + "', role=" + role + " pass: " + password + " login: " + login + '}';
    }

    @Override
    public String getSQLValues() {
//        return "id = '', name = '', surname = '', income = '', manager_id = '', login, password = '', role = ''";
        return "";
    }

}
