package Cleancode.demo;

import JavaGrammer.Parent;

public class Child extends JavaGrammer.Parent{
    @Override
    public void printEach() {
        super.printEach();{
//            System.out.println(a);//private이라서
//            System.out.println(b);//디폴트 변수라서
            System.out.println(c);//protected라서
            System.out.println(d);//puvlic이라서 가능
        }
    }
}
