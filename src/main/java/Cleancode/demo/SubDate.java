package Cleancode.demo;

public class SubDate {
    public static int getYearDay(int year) {
        if(year == 1){
            return 0;
        }else {
            return 365;
        }
    }
    //윤년인지 판단하는 메서드를 리팩토링하면 어떻게 될까?
    public static boolean isLeapYear(int year) {
//        if(year%4 == 0) {//40에서 통과 못함
//            if(year%400 == 0){ return true;}//40 통과
//            else if(year%100 == 0){return false;}//40 통과
//            else{return true;}
//        }else{return false;}
//        assertTrue(SubDate.isLeapYear(40)); 4로 떨어짐
//        assertFalse(SubDate.isLeapYear(100)); 4로 떨어짐
//        assertTrue(SubDate.isLeapYear(400)); 4로 떨어짐 통과하려면 어떻게 해야 할까?->4로 떨어지는 애들 케이스분류?
//        정리하면, 400으로 떨어지면 true, 100으로 떨어지면 false, 4로 떨어지면 true, 그 외에는 false라고 이해할 수 있다.
        if( year%400 == 0) {
            return true;
        }else if(year%100 == 0){
            return false;
            }else if(year%4 == 0){
            return true;
        } else{ return false;}

        }
//22.7.9 작성중
        }
