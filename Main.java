import static java.lang.Long.sum;

public class Main {

    public static void main(String[] args) {

        String simpleString = new String("I study Basic Java!");
        System.out.println(simpleString);
        System.out.println(simpleString.length());

        System.out.println(simpleString.charAt(18));


        System.out.println(simpleString.replace('a', 'o'));
        System.out.println(simpleString.toUpperCase());
        System.out.println(simpleString.toLowerCase());
        System.out.println(simpleString.substring(0, 13) + "!");

        /** int index = simpleString.index0f("Java");
         System.out.println(simpleString.substring(index)); **/

        System.out.println();
        System.out.println("__________________________________________");

        System.out.println(sum(6, 12));
        System.out.println(substraction(10, 5));
        System.out.println(multiplication(30, 3));
        System.out.println(divison(30, 3));




    }

    public static int sum(int a, int b) {
        return a + b;
    }

    private static int substraction(int a, int b) {
        return a-b;
    }

    private static int multiplication(int a, int b) {
        return a * b;
    }
    private static int divison(int a, int b) {
        return a / b;
    }

}


