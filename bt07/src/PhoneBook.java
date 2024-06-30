/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luanq
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class PhoneBook extends Phone {
    private ArrayList<String> PhoneList = new ArrayList<>();

    public PhoneBook(String name, String phone, String newphone) {
        super(name, phone, newphone);
    }

    

    @Override
    public void insertPhone(String name, String phone) {
        for (int i = 0; i < PhoneList.size(); i++) {
            String[] entry = PhoneList.get(i).split(" : ");
            if (entry[0].equals(name)) {
                if (!entry[1].contains(phone)) {
                    PhoneList.set(i, entry[0] + " : " + entry[1] + " : " + phone);
                }
                return;
            }
        }
        PhoneList.add(name + " : " + phone);
    }

    @Override
    public void removePhone(String name) {
        PhoneList.removeIf(entry -> entry.split(" : ")[0].equals(name));
    }

    @Override
    public void updatePhone(String name, String newphone) {
        for (int i = 0; i < PhoneList.size(); i++) {
            String[] entry = PhoneList.get(i).split(" : ");
            if (entry[0].equals(name)) {
                PhoneList.set(i, name + " : " + newphone);
                return;
            }
        }
    }

    @Override
    public void searchPhone(String name) {
        for (String entry : PhoneList) {
            if (entry.split(" : ")[0].equals(name)) {
                System.out.println(entry);
                return;
            }
        }
        System.out.println("Name not found");
    }

    @Override
    public void sort() {
        PhoneList.sort(Comparator.comparing(entry -> entry.split(" : ")[0]));
    }

    public void printPhoneList() {
        for (String entry : PhoneList) {
            System.out.println(entry);
        }
    }
}
