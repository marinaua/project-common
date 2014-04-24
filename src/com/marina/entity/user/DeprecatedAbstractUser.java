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
public abstract class DeprecatedAbstractUser implements IUser, Entity {

    protected static final long serialVersionUID = 1L;
    private final String table = "user";
    protected int id;
    protected String name;
    protected String surname;
    protected String login;
    protected String password;
    protected String role; //TODO: Delete

    @Override
    public String getTable() {
        return table;
    }

    @Override
    public int getID() {
        return id;
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

    @Override
    public String getColumns() {
        return "id, name, surname, login, password, role";
    }

    @Override
    public String getValues() {
        return "'" + id + "', '" + name + "', '" + surname + "', '" + login + "', '" + password + "', " + role + "'";
    }

    @Override
    public String toString() {
        return "AbstractUser{" + "id=" + id + ", name=" + name + ", surname=" + surname + ", role=" + role + '}';
    }
    
    

}
