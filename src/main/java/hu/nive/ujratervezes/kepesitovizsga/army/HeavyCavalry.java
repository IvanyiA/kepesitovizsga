package hu.nive.ujratervezes.kepesitovizsga.army;

public class HeavyCavalry extends MilitaryUnit {


    private static final int vitalityPoints = 150;
    private static final int hitPoints = 20;

    public HeavyCavalry() {
        super(vitalityPoints, hitPoints, true);
    }

    @Override
    public void sufferDamage(int damage) {

    }


}
