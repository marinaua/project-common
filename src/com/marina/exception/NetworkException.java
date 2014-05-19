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
public class NetworkException extends AbstractException {
    public NetworkException(){
        super.message = "Network problems.";
        super.code = 0;
    }
    
}
