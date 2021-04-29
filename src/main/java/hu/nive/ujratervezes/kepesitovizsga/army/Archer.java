package hu.nive.ujratervezes.kepesitovizsga.army;

public class Archer extends MilitaryUnit {

    private static final int vitalityPoints = 50;
    private static final int hitPoints = 20;

    public Archer() {
        super(vitalityPoints, hitPoints, false);
    }

    @Override
    public void sufferDamage(int damage) {
        decreaseVitality(damage);
    }


}
