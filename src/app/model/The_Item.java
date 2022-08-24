/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.model;

/**
 *
 * @author Amir labib
 */
public class The_Item {
    private int num;
    private The_Header inv;
    private String name;
    private double price;
    private int count;

    public The_Item(int num, The_Header inv, String name, double price, int count) {
        this.num = num;
        this.inv = inv;
        this.name = name;
        this.price = price;
        this.count = count;
    }
    
    // for calculating total price per all items
    public double getTotal()
    {return count*price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public The_Header getInv() {
        return inv;
    }

    public void setInv(The_Header inv) {
        this.inv = inv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "The_Item{" + "num=" + num + ", name=" + name + ", price=" + price + ", count=" + count + '}';
    }
    
}

