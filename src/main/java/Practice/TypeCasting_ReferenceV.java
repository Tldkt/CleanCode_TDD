package Practice;

import org.w3c.dom.ls.LSOutput;

public class TypeCasting_ReferenceV {
    public static void main(String[] args) {
        Car car = new Car();// 하위클래스 Car 타입의 Car객체
        Vehicle vehicle = (Vehicle) car;//vehicle은 car라는 하위클래스 객체를 상위클래스로 업캐스팅
        //Vehicle vehicle = Vehicle car; 상위클래스로 업캐스팅 시 괄호 생략가능

        Car car2 = (Car) vehicle;//아까 업캐스팅한 vehicle을 다시 Car형으로 다운캐스팅
        //MotorBike motorBike = (MotorBike) car; 앞서의 Car형 Car객체를 똑같이 자식클래스인 MB로 바꾸려 했으나 실패
        System.out.println(car);
        System.out.println(vehicle);
        System.out.println(car2);
    }

}

class Vehicle{
    String model;
    String color;
    int wheels;

    void startEngine(){
        System.out.println("부릉부르릉");
    }
    void accelerate(){
        System.out.println("속도를 높여봐");
    }
    void brake(){
        System.out.println("끼이익 운전그따위로할래?");
    }
}

class Car extends Vehicle{
    void giveRide(){
        System.out.println("다른 사람 태우기");
    }
}
class MotorBike extends Vehicle{
    void performance(){
        System.out.println("그러다 다친다");
    }
}