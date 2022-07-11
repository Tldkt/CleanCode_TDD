package JavaGrammer;

public class Main {
    public static void main(String[] args) {
        AccessTest PersonB = new AccessTest(14,8);
        PersonB.print();
    }
}
//        Outer outer = new Outer();
//        System.out.println("외부 클래스 사용하여 내부 클래스 기능 호출");
//        outer.testClass();
//        Bike bike = new Bike(); // 각각의 타입으로 선언 + 각각의 타입으로 객체 생성
//        Car car = new Car();
//        MotorBike motorBike = new MotorBike();
//
//        bike.run();
//        car.run();
//        motorBike.run();
//
//        Vehicle bike2 = new Bike(); // 상위 클래스 타입으로 선언 + 각각 타입으로 객체 생성
//        Vehicle car2 = new Car();
//        Vehicle motorBike2 = new MotorBike();
//
//        bike2.run();
//        car2.run();
//        motorBike2.run();

//        Vehicle[] vehicles = new Vehicle[] { new Bike(), new Car(), new MotorBike()};
//        for (Vehicle vehicle : vehicles) {
//            vehicle.run();
//        }



