package Practice;
//class 구조
//animal
//ㄴbat,cat
/*

public class InstanceOfExample {
    public static void main(String[] args) {
        Animal animal = new Animal();//상위 참조타입, 생성자
        System.out.println(animal instanceof Object); //true
        System.out.println(animal instanceof Animal); //true
        System.out.println(animal instanceof Bat); //false

        Animal cat = new Cat();//하위 생성자, 상위 참조타입
        System.out.println(cat instanceof Object); //true
        System.out.println(cat instanceof Animal); //true
        System.out.println(cat instanceof Cat); //true
        System.out.println(cat instanceof Bat); //false
    }
}

class Animal {};
class Bat extends Animal{};
class Cat extends Animal{};
*/

//------------------------------------------

class buyCoffeeTest{
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.buyCoffee(new Americano());
        customer.buyCoffee(new CaffeLatte());
        System.out.println("현재 잔액은 "+customer.money+"원입니다");
    }
}
class Coffee{
    int price;

    public Coffee(int price){
        this.price = price;
    }
}

class Americano extends Coffee{
    public Americano(){
        super(5000);
    }
    public String toString(){
        return "아메리카노";
    }
}
class CaffeLatte extends Coffee{
    public CaffeLatte(){
        super(6000);
    }
    public String toString(){
        return "카페라떼";
    }
}

class Customer{
    int money = 50000;
    void buyCoffee(Coffee coffee){
        if(money < coffee.price){
            System.out.println("파산");
            return;
        }
        money = money - coffee.price;
        System.out.println(coffee+"를 구입했습니다.");
    }

}

