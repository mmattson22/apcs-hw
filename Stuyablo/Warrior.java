
public class Warrior extends Basechar {

    private int healthboost = 5;

    public Warrior() {
	setName("DEFAULT");
    }

    public int getHealth() {
	return healthboost + super.getHealth();


    public int getMana() {
	return healthboost + super.getMana();


    public int getAttack() {
	return healthboost + super.getAttack();


    public int getDexterity() {
	return healthboost + super.getDexterity();

    }
    public void attack(Basechar other){
	System.out.println(this+" is SUPERattacking "+other);

    }
}
