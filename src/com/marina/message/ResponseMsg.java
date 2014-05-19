/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.marina.message;

/**
 *
 * @author Marik
 */
public class ResponseMsg implements IMessage{
    private static final long serialVersionUID = 1L;
    private boolean success;
    private String message;
    private Object data;

    public ResponseMsg(boolean success, String message, Object data) {
        this.success = success;
        this.message = message;
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResponseMsg{" + "success=" + success + ", message=" + message + ", data=" + data + '}';
    }
    
    
}
