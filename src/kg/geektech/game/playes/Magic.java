package kg.geektech.game.playes;

public class Magic extends Hero {

    private int boostPoints;
    public Magic(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.BOOST);
        this.boostPoints = boostPoints;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int newAttack = 2;
        for (int i = 0; i < heroes.length; i++) {
            if(heroes[i].getDamage() > 0 ){
                heroes[i].setDamage((heroes[i].getDamage() + newAttack) + boostPoints  );

            }
        }
    }
}
