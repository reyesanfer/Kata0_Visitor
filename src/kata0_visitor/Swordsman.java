
package kata0_visitor;

/**
 *
 * @author FernandoSanfielReyes
 * @version 1.0 2020/11/23 10:58 GMT
 */
public class Swordsman extends Soldier {

    public Swordsman(String name, int health) {
        super(name, health);
    }

    @Override
    public Weapon toEquip() {
        return new Sword();
    }

    @Override
    public void toApplyMechanics(Mechanics mechanics) {
        mechanics.toApplyMovement(this);
    }
    
}
