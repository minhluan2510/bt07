/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luanq
 */ 
import java.util.Collection;

public abstract class Phone {
    protected String name, phone, newphone;

    public Phone(String name, String phone, String newphone) {
        this.name = name;
        this.phone = phone;
        this.newphone = newphone;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNewphone() {
        return this.newphone;
    }

    public void setNewphone(String newphone) {
        this.newphone = newphone;
    }

    public abstract void insertPhone(String name, String phone);
    public abstract void removePhone(String name);
    public abstract void updatePhone(String name, String newphone);
    public abstract void searchPhone(String name);
    public abstract void sort();

    @Override
    public String toString() {
        return "Phone [name=" + name + ", phone=" + phone + ", newphone=" + newphone + "]";
    }
}

