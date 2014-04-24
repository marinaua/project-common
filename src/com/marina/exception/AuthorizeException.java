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
public class AuthorizeException extends AbstractException {
    
    public AuthorizeException(){
        super.message = "Login or password incorrect";
        super.code = 403;
    }
   
}
