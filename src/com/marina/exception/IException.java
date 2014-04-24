/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.marina.exception;

import java.io.Serializable;

/**
 *
 * @author Marik
 */
public interface IException extends Serializable {
    public String getMessage();
    public int getCode();
}
