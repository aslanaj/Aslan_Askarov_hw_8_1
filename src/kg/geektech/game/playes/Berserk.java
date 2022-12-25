package kg.geektech.game.playes;

public class Berserk extends Hero {
    private int savedDamage;

    public Berserk(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {

        setSavedDamage(boss.getDamage());
        boss.setHealth(boss.getHealth() - this.getDamage() - savedDamage);
        System.out.println("Berserk damage "  + savedDamage);
    }

    public void setSavedDamage(int savedDamage) {
        this.savedDamage = savedDamage;

    }
}
