/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marina.entity.order;

import com.marina.entity.Entity;
import java.sql.Timestamp;

/**
 *
 * @author Marik
 */
public class Order implements Entity {

    private static final long serialVersionUID = 1L;
    private int id;
    private int clientID;
    private int creditProgrammID;
    private int managerID;
    private int statusID;
    private int creditID;
//    private Timestamp orderTimestamp;
    private String title;
    private String status;
    private String clientName;
    private String clientSurname;
    private final String table = "order";

    public void setId(int id) {
        this.id = id;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientSurname() {
        return clientSurname;
    }

    public void setClientSurname(String clientSurname) {
        this.clientSurname = clientSurname;
    }

    public int getCreditID() {
        return creditID;
    }

    public void setCreditID(int creditID) {
        this.creditID = creditID;
    }

    public int getStatusID() {
        return statusID;
    }

    public void setStatusID(int statusID) {
        this.statusID = statusID;
    }

    public int getManagerID() {
        return managerID;
    }

    public void setManagerID(int managerID) {
        this.managerID = managerID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public int getCreditProgrammID() {
        return creditProgrammID;
    }

    public void setCreditProgrammID(int creditProgrammID) {
        this.creditProgrammID = creditProgrammID;
    }

//    public Timestamp getOrderTimestamp() {
//        return orderTimestamp;
//    }
//
//    public void setOrderTimestamp(Timestamp orderTimestamp) {
//        this.orderTimestamp = orderTimestamp;
//    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String orderStatus) {
        this.status = orderStatus;
    }

    @Override
    public String getColumns() {
        return "status_id, client_id, manager_id, credit_program_id, credit_id";
    }

    @Override
    public String getValues() {
        return "'" + statusID + "', '" + clientID + "', '" + managerID + "', '" + creditProgrammID + "', '" + creditID;
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
    public String getSQLValues() {
        return "status_id = '" + statusID + "', client_id = '" + clientID + "', manager_id = '" + managerID + "', credit_program_id = '" + creditProgrammID + "', credit_id = '" + creditID + "'";
    }

    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", clientID=" + clientID + ", creditProgrammID=" + creditProgrammID + ", managerID=" + managerID + ", statusID=" + statusID + ", creditID=" + creditID + ", title=" + title + ", status=" + status + ", table=" + table + '}';
    }

}
