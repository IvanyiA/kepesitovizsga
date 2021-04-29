package hu.nive.ujratervezes.kepesitovizsga.army;

public class Swordsman extends MilitaryUnit {

    private static final int vitalityPoints = 100;
    private static final int hitPoints = 10;

    public Swordsman(boolean shielded) {
        super(vitalityPoints, hitPoints, shielded);
    }

    @Override
    public void sufferDamage(int damage) {

    }

}
