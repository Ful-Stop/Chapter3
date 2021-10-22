package com.company;

public class conditionals {

    public static boolean chimpTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile || !aSmile && !bSmile) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean negPos(int valueI, int valueII, boolean negative){
        if(!negative){
            if((valueI < 0 && valueII >= 0) || (valueII < 0 && valueI >= 0)){
                return true;
            }
            else{
                return false;
            }
        }

        else{
            if(valueI < 0 && valueII < 0){
                return true;
            }
            else{
                return false;
            }
        }
    }

    public static boolean pickUpPhone(boolean isMorning, boolean isMom, boolean isAsleep){
        if(isAsleep){
            return false;
        }
        else{
            if(isMorning){
                if(isMom){
                    return true;
                }
                else{
                    return false;
                }
            }
            else{
                return true;
            }
        }
    }

    public static String setAlarm(int DOTW, boolean isVacation){
        if (DOTW >= 1 && DOTW <= 5) {
            if (isVacation) {
                return ("10:00");
            } else {
                return ("7:00");
            }
        } else {
            if (isVacation) {
                return ("off");
            }
            else{
                return ("10:00");
                }
        }
    }

    public static boolean onesDigitSame(int a, int b, int c){
        if((a % 10 == b % 10) || (a % 10 == c % 10) || (b % 10 == c % 10)){
            return true;
        }
        else{
            return false;
        }
    }

    public static int blackjack(int cardI, int cardII) {
        int dist1 = 21 - cardI;
        int dist2 = 21 - cardII;

        if (dist1 < 0 && dist2 < 0) {
            return 0;
        }
        else if(dist1 < 0 && dist2 >= 0){
            return cardII;
        }
        else if(dist2 < 0 && dist1 >= 0){
            return cardI;
        }
        else if (dist1 < dist2) {
            return cardI;
        } else if (dist2 < dist1) {
            return cardII;
        } else {
            return cardI;
        }
    }

    public static void main(String[] args) {
        System.out.println(chimpTrouble(true, true));
        System.out.println(chimpTrouble(true, false));
        System.out.println(chimpTrouble(false, true));
        System.out.println(chimpTrouble(false, false));
        System.out.println();

        System.out.println(negPos(1, 1, false));
        System.out.println(negPos(-1, 1, false));
        System.out.println(negPos(1, -1, false));
        System.out.println(negPos(-1, -1, false));
        System.out.println(negPos(1, 1, true));
        System.out.println(negPos(-1, 1, true));
        System.out.println(negPos(1, -1, true));
        System.out.println(negPos(-1, -1, true));
        System.out.println();

        System.out.println(pickUpPhone(false, false, true));
        System.out.println(pickUpPhone(true, true, true));
        System.out.println(pickUpPhone(true, true, false));
        System.out.println(pickUpPhone(false, true, false));
        System.out.println(pickUpPhone(true, false, false));
        System.out.println(pickUpPhone(false, false, false));
        System.out.println();

        System.out.println(setAlarm(1, false));
        System.out.println(setAlarm(5, false));
        System.out.println(setAlarm(0, false));
        System.out.println(setAlarm(2, true));
        System.out.println(setAlarm(4, true));
        System.out.println(setAlarm(6, true));
        System.out.println();

        System.out.println(onesDigitSame(23, 19, 13));
        System.out.println(onesDigitSame (23, 19, 12));
        System.out.println(onesDigitSame (23, 19, 3));
        System.out.println(onesDigitSame (423, 13, 3));
        System.out.println(onesDigitSame (23, 29, 25));
        System.out.println("");

        System.out.println(blackjack(19, 21));
        System.out.println(blackjack(21, 19));
        System.out.println(blackjack(19, 22));
        System.out.println(blackjack(8, 8));
        System.out.println(blackjack(25, 24));
    }
}
