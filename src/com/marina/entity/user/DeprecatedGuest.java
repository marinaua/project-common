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
public class DeprecatedGuest extends DeprecatedAbstractUser {
    private static final long serialVersionUID = 1L;

    public DeprecatedGuest() {
        this.role = "guest";
    }
}