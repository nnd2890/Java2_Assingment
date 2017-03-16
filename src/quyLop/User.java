/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quyLop;

/**
 *
 * @author nnd2890
 */
public class User {
    private String msv;
    private String name;
    private int money;
    private String date;

    public User() {
    }
    
    public User(String msv, String name, int money, String date) {
        this.msv = msv;
        this.name = name;
        this.money = money;
        this.date = date;
    }

    

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
}
