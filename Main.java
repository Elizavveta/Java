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






