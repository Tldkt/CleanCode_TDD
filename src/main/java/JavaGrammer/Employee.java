package JavaGrammer;

//Composite_Example
public class Employee {
    int id;
    String name;
    //Address라는 클래스 형식(타입)으로 참조변수를 선언
    Address address;

    public Employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void showInfo() {
        System.out.println(id + " " + name);
        System.out.println(address.city+ " " + address.country);
    }

    public static void main(String[] args) {
        Address address1 = new Address("서울", "한국");
        Address address2 = new Address("도쿄", "일본");

        Employee e = new Employee(1, "김코딩", address1);
        Employee e2 = new Employee(2, "박해커", address2);

        e.showInfo();
        e2.showInfo();
    }
}

class Address {
    String city, country;
    //Address 클래스의 생성자
    public Address(String city, String country) {
        this.city = city;
        this.country = country;
    }
}

//class Vehicle {
//    void run() {
//        System.out.println("Vehicle is running");
//    }
//}
//
//class Bike extends Vehicle { // Vehicle 클래스 상속
//    void run() {
//        System.out.println("Bike is running"); // 메서드 오버라이딩
//    }
//
//    public static void main(String[] args) {
//        Bike bike = new Bike();
//        bike.run();
//    }
//}

class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle {
    void run() {
        System.out.println("Bike is running");
    }
}

class Car extends Vehicle {
    void run() {
        System.out.println("Car is running");
    }
}

class MotorBike extends Vehicle {
    void run() {
        System.out.println("MotorBike is running");
    }
}