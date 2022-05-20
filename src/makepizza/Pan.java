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
public class Pan {
    private String Size;
    private int id;
    private String Color;

  

  

    public void setSize(String Size) {
        this.Size = Size;
    }

    public String getSize() {
        return Size;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }
     public Pan(){
     }

    public Pan(String Size, int id, String Color, Ingrediance ingrediance, Dough dough) {
        this.Size = Size;
        this.id = id;
        this.Color = Color;
    
    }
     
    
    // here you need to create a method to check if the dough size fit into the pan else you need to throw an exception 
    public boolean check(){
        String Size2="";
      if (getSize().equals( Size2) ){
   
      return true;
     
            
              }
            return false;

      
     }  }
      
    
    
    
    
    

