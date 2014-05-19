/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.marina.entity;

import java.io.Serializable;

/**
 *
 * @author Marik
 */
public interface Entity extends Serializable {    
    public String getColumns();
    public String getValues();
    public String getTable();
    public int getID();
    public String getSQLValues();
}
