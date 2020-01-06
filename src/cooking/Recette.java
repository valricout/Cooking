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
public class Recette {
    
    public String name;
    public int nb_steps;
    public int nb_ustensiles;
    public Ingredient list_recipe[];
    public Ustensile list_ustensiles[];
    
    
    public Recette()
    {
        this.name = "NULL";
        this.nb_steps = 0;
        this.nb_ustensiles = 0;
    }
    
    public Recette(String a, int b, int c)
    {
        this.name = a;
        this.nb_steps = b;
        this.nb_ustensiles = c;
    }
    
    String getName()
    {
        return this.name;
    }
    
    int getNbSteps()
    {
        return this.nb_steps;
    }
    
    int getNbUstensiles()
    {
        return this.nb_ustensiles;
    }
    
    Ingredient[] getIng_List()
    {
        return this.list_recipe;
    }
    
    void setName(String a)
    {
        this.name = a;
    }
    
    void setSteps(int a)
    {
        this.nb_steps = a;
    }
    
    void setNbUstensiles(int a)
    {
        this.nb_ustensiles = a;
    }
}
