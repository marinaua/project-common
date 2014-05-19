/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.marina.entity.creditprogram;

import com.marina.entity.Entity;

/**
 *
 * @author Marik
 */
public class CreditProgram implements Entity {
    private static final long serialVersionUID = 1L;
    private int id;
    private String title;
    private String shortDescription;
    private String fullDescription;
    private final String table = "credit_program";

    @Override
    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getFullDescription() {
        return fullDescription;
    }

    public void setFullDescription(String fullDescription) {
        this.fullDescription = fullDescription;
    }

    @Override
    public String getColumns() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getValues() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getTable() {
        return table;
    }

    @Override
    public String toString() {
        return "CreditProgram{" + "id=" + id + ", title=" + title + ", shortDescription=" + shortDescription + ", fullDescription=" + fullDescription + '}';
    }

    @Override
    public String getSQLValues() {
        return "title = '" + title + "', short_description = '" + shortDescription + "', full_description = '" + fullDescription + "'";
    }
    
    
}
