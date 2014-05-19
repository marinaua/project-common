/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.marina.message;

import com.marina.entity.user.User;

/**
 *
 * @author Marik
 */
public class RequestMsg implements IMessage{
    private static final long serialVersionUID = -6871384776219135769L;
    private String command; 
    private Object data;
    private User user;

    public RequestMsg(User user, String command, Object data) {
        this.user = user;
        this.command = command;
        this.data = data;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "RequestMsg{" + "command=" + command + ", data=" + data + '}';
    }
    
    
}
