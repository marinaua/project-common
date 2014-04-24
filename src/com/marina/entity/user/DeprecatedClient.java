/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marina.entity.user;

/**
 *
 * @author Marik
 */
public class DeprecatedClient extends DeprecatedAbstractUser {

    private static final long serialVersionUID = 1L;

    private double income;
    private int managerID;

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
    public String getColumns() {
        return super.getColumns() + ", income, manager_id";
    }

    @Override
    public String getValues() {
        return super.getValues() + ", '" + income + "', '" + managerID + "'";
    }

}
