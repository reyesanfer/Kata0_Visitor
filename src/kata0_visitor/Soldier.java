
package kata0_visitor;

/**
 *
 * @author FernandoSanfielReyes
 * @version 1.0 2020/11/23 10:58 GMT
 * Tipos: Archer, Swordsman, 
 */
public abstract class Soldier {

    protected String name;
    protected int health;
    private int positionX, positionY;
    protected String status;

    public Soldier(String name, int health) {
        this.name = name;
        this.health = health;
    }
    
    public abstract Weapon toEquip();
    
    public abstract void toApplyMechanics(Mechanics mechanics);
    
    public void toAct(Soldier soldier){
        Weapon weapon = toEquip();
        weapon.toApply(soldier);
    }

    /**
     *
     * @param positionX
     * @param positionY
     */
    public void setPosition (int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }
    
}
