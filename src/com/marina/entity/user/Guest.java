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
public class Guest extends AbstractUser {
    private static final long serialVersionUID = 1L;

    public Guest() {
        this.role = "guest";
    }
}
