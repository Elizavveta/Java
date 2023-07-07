package homework;

public class Main {
    public static void main(String[] args) {

        char ch = 'G';
        int in = 89;
        byte bt = 4;
        short sht = 56;
        float flt = 4.7333436f;
        double dbl = 4.355453532;
        long lg = 12121l;

        System.out.println("Character: " + ch);
        System.out.println("Integer: " + in);
        System.out.println("Byte: " + bt);
        System.out.println("Short: " + sht);
        System.out.println("Float: " + flt);
        System.out.println("Double: " + dbl);
        System.out.println("Long: " + lg);


        System.out.println("_______________________________________________________");

        int num = 345;
        int firstNum = num / 100;
        int secNum = num % 100 / 10;
        int trNum = num % 10;
        System.out.println("Число: " + num + "->" + firstNum + "," + secNum + "," + trNum + ".");


    }

}

