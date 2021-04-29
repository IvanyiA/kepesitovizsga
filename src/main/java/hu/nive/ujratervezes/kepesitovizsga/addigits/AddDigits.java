package hu.nive.ujratervezes.kepesitovizsga.addigits;

public class AddDigits {

    public int addDigits(String input) {
        if (input == null || input.isEmpty()) {
            return -1;
        }
        char[] c = input.toCharArray();
        int sumOfDigits = 0;
        for (char c1 : c) {

            if (Character.isDigit(c1)) {
                int number = Character.getNumericValue(c1);
                sumOfDigits += number;
            }
        }
        return sumOfDigits;
    }
}
