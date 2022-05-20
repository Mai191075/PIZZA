/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package makepizza;

/**
 *
 * @author user
 */
public class Ingrediance {
    private String Name;
    private double Weight;
    private double Amountcol;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public double getWeight() {
        return Weight;
    }

    public void setWeight(double Weight) {
        this.Weight = Weight;
    }

    public double getAmountcol() {
        return Amountcol;
    }

    public void setAmountcol(double Amountcol) {
        this.Amountcol = Amountcol;
    }
    
    
    public Ingrediance(){
    
    }
    
     public String GetInfoI(){
    
    return " ";
    }

    public Ingrediance(String Name, double Weight, double Amountcol) {
        this.Name = Name;
        this.Weight = Weight;
        this.Amountcol = Amountcol;
    }
    
  
    
    
    
}
