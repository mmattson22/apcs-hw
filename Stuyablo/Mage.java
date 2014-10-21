public class Mage extends BaseChar{
    // private int Health = 200;
    // private int Mana = 10;

    public Mage(){
        super("Blank");
    }

    public Mage(String n){
        super(n);
    }

    public int getHealth(){
	return this.Health;
    }

    public int getMana(){
	return this.Mana;
    }

    
    public void basicAttack(BaseChar other){
	other.Health = other.Health - 10;
        System.out.println(this + " has attacked " + other);
    }
    
    /*
    public void basicAttack(Mage other){
	other.Health = other.Health - 10;
        System.out.println(this + " has attacked " + other);
    }
    */
    
    public void cast(BaseChar other){
        if (Mana > 0){
            this.Mana = this.Mana - 2;
	    other.Health = other.Health - 20;
            System.out.println(this + " has casted on " + other);
	}else{
	    System.out.println("Not enough mana to cast.");
	}
    }

    /*
    public void cast(Mage other){
        if (Mana > 0){
            this.Mana = this.Mana - 2;
	    other.Health = other.Health - 20;
            System.out.println(this + " has casted on " + other);
	}else{
	    System.out.println("Not enough mana to cast.");
	}
    }
    */
    
}

/* Problems:
1. How to get attacks to work with all types of other classes?
(It does not work with current uncommented and with non-Mages then)
2. Getting name correct.
*/
