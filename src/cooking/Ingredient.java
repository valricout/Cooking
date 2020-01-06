/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cooking;

/**
 *
 * @author laure
 */
public class Ingredient {
    
    public String name;
    public int quantity;
    public Ustensile ust;
    public int unit; 
    //0 ml 
    //1 g 
    //2 cuillères à soupe 
    //3 cuillères à café
    
    
    public Ingredient(String a, int b)
    {
        this.name = a;
        this.quantity = b;
        this.ust = null;
    }
    
    public Ingredient()
    {
        this.name = "NULL";
        this.quantity = 0;
        this.ust = null;
    }
    
    String getName()
    {
        return this.name;
    }
    
    int getQuantity()
    {
        return this.quantity; 
    }
    
    Ustensile getUstensile()
    {
        return this.ust;
    }
    
    void setName(String a)
    {
        this.name = a;
    }
    
    void setQuantity(int a)
    {
        this.quantity = a;
    }
    
    void setUstensile(Ustensile a)
    {
        this.ust = a;
    }
    
    
    
    
}
