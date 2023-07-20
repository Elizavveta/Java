package homework;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int isEdekaOpen = 8;
        int isEdekaClose = 16;
        int isReweOpen = 12;
        int isReweClose = 23;
        Scanner scanner = new Scanner(System.in);
           System.out.println("What time is it?");
           int hour = scanner.nextInt();
           if (hour > isReweClose || hour < isEdekaOpen){
            System.out.println("All shops are close");
        }else{
               System.out.println("I can buy food in : \n"
               +"isEdekaOpen: " +canBuyEdeka(isEdekaOpen, isEdekaClose, hour)
                       +"\nisReweOpen: "+canBuyRewe(isReweOpen, isReweClose, hour));
           }
    }
    static boolean canBuyEdeka(int isEdekaOpen, int isEdekaClose, int hour){
        if(hour < isEdekaClose && hour >= isEdekaOpen){

            return true;

        }else{
            return false;
        }
    }



    static boolean canBuyRewe(int isReweOpen, int isReweClose, int hour){
        if(hour < isReweClose && hour >= isReweOpen){
            return true;

        }else{
            return false;
        }
    }
}
