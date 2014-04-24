/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.marina.exception;

/**
 *
 * @author Marik
 */
public class AbstractException implements IException {
    protected String message;
    protected int code;

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "Exception: " + "message = " + message + ", code = " + code + '.';
    }
    
    
    
}
