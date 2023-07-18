import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        comparison( 10.5f, 10.45f,  10 );

    }

    public static void comparison(float m, float n, float a){
        if (Math.abs(m-a)<Math.abs(n-a))
            System.out.println("это ближе к " + a+ " чем n");
        else System.out.println("n ближе к " + a+ " чем m");
    }
}
__________________________________________________________________________

    public class Main {
    public static void main(String[] args) {
        calculate(1581);

    }

    public static void calculate(float seconds) {
        float hours = seconds/3600;
        if (hours>8) System.out.println("Больше чем чем полный рабочий день");
        else if(hours>=5) System.out.println("ОСталось " + seconds/3600+ "часов");
        else if(hours<5 && hours>=2) System.out.println("Осталось " + seconds/3600+ "часа");
        else if(hours<2 && hours>=1) System.out.println("Остался 1 час");
        else if(hours<1 && hours>=0) System.out.println("Осталось меньше одного часа");
        else System.out.println("Число должно быть положительным");
    }
}

    





