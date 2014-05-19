/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.marina.entity.credit;

import com.marina.entity.Entity;

/**
 *
 * @author Marik
 */
public class Credit implements Entity {
    private static final long serialVersionUID = 1L;
    
    private final String table = "client_credit";
    private int id;
    private String title;
    private String status;
    private int clientID;
    private int creditProgramID;
    private int statusID;

    public void setId(int id) {
        this.id = id;
    }

    public int getStatusID() {
        return statusID;
    }

    public void setStatusID(int statusID) {
        this.statusID = statusID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public int getCreditProgramID() {
        return creditProgramID;
    }

    public void setCreditProgramID(int creditProgramID) {
        this.creditProgramID = creditProgramID;
    }
    
    
    @Override
    public String getColumns() {
        return "client_id, credit_program_id, status_id";
    }

    @Override
    public String getValues() {
        return "'" + clientID + "', '" + creditProgramID + "', '" + statusID + "'";
    }

    @Override
    public String getTable() {
        return table;
    }

    @Override
    public int getID() {
        return id;
    }

    @Override
    public String toString() {
        return "Credit{" + "id=" + id + ", title=" + title + ", status=" + status + ", clientID=" + clientID + ", creditProgramID=" + creditProgramID + '}';
    }
    
    @Override
    public String getSQLValues() {
        return "client_id = '" + clientID + "', credit_program_id = '" + creditProgramID + "', status_id = '" + statusID + "'";
    }

}
