/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package makepizza;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class PIZZA {

  
    private int  id ;
    private String Size;
    private int small;
    private int large;
    private int meduim;

    private int Capacity ;
    private double coleries ;
    private ArrayList< Ingrediance> ingrediance;
    private Pan pan;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
public void setsmall(int id) {
        this.small = id;
    }
public void setmeduim(int id) {
        this.meduim = id;
    }
public void setlarge(int id) {
        this.large = id;
    }
public int getsmall() {
       return this.small;
    }
public int getmeduim() {
       return this.meduim;
    }
public int gettlarge() {
       return this.large;
    }
    public String getSize() {
        return Size;
    }

    public void setSize(String Size) {
        this.Size = Size;
    }

    public int getCapacity() {
        return Capacity;
    }

    public void setCapacity(int Capacity) {
        this.Capacity = Capacity;
    }

    public double getColeries() {
        return coleries;
    }

    public void setColeries(double coleries) {
        this.coleries = coleries;
    }
    
     public PIZZA(){
    }
    public double total_Amountcol(){
    return 1000;
    
    }
    
    public String GetInfoP(){
    
    return " ";
    }
/*
    public PIZZA(int id, String Size, String Capacity, double coleries, Ingrediance ingrediance, Pan pan) {
        this.id = id;
        this.Size = Size;
        this.Capacity = Capacity;
        this.coleries = coleries;
        this.ingrediance = ingrediance;
        this.pan = pan;
    }*/
    

    
    
    
    
    
}
