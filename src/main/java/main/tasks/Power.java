package main.tasks;

public class Power {

    public static void main(String[] args) {
        int base = 0, exponent = 0;

        System.out.println(power(base,exponent));
    }

    /**
     * Hatványozást végez: a base értékét az exponent kitevőre emeli.
     */
    public static int power(int base, int exponent) {

        int result = 1;

        for (int i = 0; i < exponent; i++) {
            result *= base;
        }

        return result;
    }

}
