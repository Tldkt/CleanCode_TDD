//package JavaGrammer;
//
//    class Animal {
//        String name;
//
//        void setName(String name) {
//            this.name = name;
//        }
//    }
//
//    class Dog extends Animal {
//        void sleep() {
//            System.out.println(this.name + " zzz");
//        }
//    }
//
//    class HouseDog extends Dog {
//        void sleep() {
//            System.out.println(this.name + " zzz in house");
//        }
//
//        void sleep(int hour) {
//            System.out.println(this.name + " zzz in house for " + hour + " hours");
//        }
//    }
//
//    public class ConstructorExample {
//        public static void main(String[] args) {
//            HouseDog houseDog = new HouseDog();
//            houseDog.setName("happy");
//            houseDog.sleep();
//            houseDog.sleep(3);
//        }
//    }
//
//
//class Person {
//    String name;
//    int age;
//    public Person(String name, int age){
//        this.name = name;
//        this.age = age;
//    }
//    void learn(){
//        System.out.println("공부를 합니다.");
//    };
//    void walk(){
//        System.out.println("걷습니다.");
//    };
//    void eat(){
//        System.out.println("밥을 먹습니다.");
//    };
//}
//
//class Programmer extends Person { // Person 클래스로부터 상속. extends 키워드 사용
//    String companyName;
//
//    void coding(){
//        System.out.println("코딩을 합니다.");
//    };
//}
//
//class Dancer extends Person { // Person 클래스로부터 상속
//    String groupName;
//
//    void dancing(){
//        System.out.println("춤을 춥니다.");
//    };
//}
//
//class Singer extends Person { // Person 클래스로부터 상속
//    String bandName;
//
//    void singing(){
//        System.out.println("노래합니다.");
//    };
//    void playGuitar(){
//        System.out.println("기타를 칩니다.");
//    };
//}
//
//class HelloJava {
//    public static void main(String[] args){
//
//        //Person 객체 생성
//        Person p = new Person("KimCoding", 25);
//        p.learn();
//        p.eat();
//        p.walk();
//        System.out.println(p.name);
//
//        //Programmer 객체 생성
//        Programmer pg = new Programmer();
////        pg.name = "박해커";
////        pg.age = 26;
////        pg.learn(); // Persons 클래스에서 상속받아 사용 가능
////        pg.coding(); // Programmer의 개별 기능
////        System.out.println(pg.name);
//
//    }
//}