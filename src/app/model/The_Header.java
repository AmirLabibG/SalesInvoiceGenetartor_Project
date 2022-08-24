/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.model;

import java.util.Date;
import java.util.ArrayList;

/**
 *
 * @author Amir labib
 */
public class The_Header {
    private int num;        // total
    private String name;   //customer
    private Date date;   //invoice date
    private ArrayList<The_Item> items; //match the invoice no. by composition relation to connect each item to it`s invoice
  
// constractor for the defult "first" Reading"
    public The_Header(int num, String name, Date date) {
        this.num = num;
        this.name = name;
        this.date = date;
    }
// Getter and setter for accessing private objects "encapsulation"
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<The_Item> getItems() {
        if (items==null){items= new ArrayList();}
        return items;   // initializing the object on lazy loading mode
    }

    /*public void setItems(ArrayList<The_Item> items) {
        this.items = items;
    }*/      
    //no need for it 
    
   // this method let us see all content 

    @Override
    public String toString() {
        return "The_Header{" + "num=" + num + ", name=" + name + ", date=" + date + ", items=" + items + '}';
    }
    public double getTotal()
    {
        double total=0.0;
        
        for(The_Item item: getItems())
        {
            total+=item.getTotal();
        }
        
        return total;
    }
    
    
    
}
