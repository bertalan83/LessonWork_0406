package main.tasks;

public class NumberSystem {

    public static void main(String[] args) {
        int decimal = 4242;

        System.out.println(decimalToBinary(decimal));
    }

    /**
     * Átváltja a decimal nevű tízes számrendszerbeli számot kettes számrendszerbe,
     * és visszatér a kettes számrendszerbeli alakjával.
     */
    public static long decimalToBinary(int decimal) {

        long binary = 0;
        long tenPower = 1;

        while (decimal > 0) {
            int digit = decimal % 2;
            binary += (digit * tenPower);
            tenPower *= 10;
            decimal /= 2;
        }

        /*// --- ellenőrzéshez:

        long binaryShouldBe = 1000010010010L;*/

        return binary;
    }

}
