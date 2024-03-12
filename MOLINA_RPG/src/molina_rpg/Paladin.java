
package molina_rpg;

public class Paladin extends Swordsman {
   
    private boolean hasRessurected;
    
    public boolean isHasRessurected() {
        return hasRessurected;
    }
    
    public Paladin() {
        super();
        boolean hasResurrected = false;
    }
    

    
    @Override
    public void receiveDamage(int damage){
        if(damage % 2 == 0){
            damage/=2;
        } 
        super.receiveDamage(damage);
        
        if(getHealth() <= 0){
            ressurect();
        }
    }
    
    public void ressurect(){
        if(!hasRessurected){
            hasRessurected = true;
            setHealth(100);
        } else{
            System.out.println("Paladin has died");
        }
    }


    
}
