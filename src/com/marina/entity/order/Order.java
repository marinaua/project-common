/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.marina.entity.order;

import java.sql.Timestamp;

/**
 *
 * @author Marik
 */
public class Order {
    private int clientID;
    private int creditProgrammID;
    private Timestamp orderTimestamp;
    private String orderStatus;

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

    public Timestamp getOrderTimestamp() {
        return orderTimestamp;
    }

    public void setOrderTimestamp(Timestamp orderTimestamp) {
        this.orderTimestamp = orderTimestamp;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

}
