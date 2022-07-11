package JavaGrammer;

//public class InnerClassExample {
//    class Outer {
//        //외부 클래스의 필드
//        //외부 클래스의 인스턴스 변수
//        private int num =1;
//        // 외부 클래스의 정적 변수
//        private static int final sNum = 2;
//        //InClass 참조타입의 inClass 참조변수 선언
//        private InClass inClass;
//        //외부 클래스의 생성자는 InClass의 객체 생성
//        public Outer(){
//            inClass = new InClass();
//        }
//        class InClass{
//            int inNum = 10;
//            void Test(){
//                System.out.println("Outer num ="+ num +"(외부 클래스의 인스턴스 변수");
//                System.out.println("Outer sNum ="+ sNum +"(외부 클래스의 정적 변수");
//                System.out.println("Outer sNum ="+ inNum +"(내부클래스의 인스턴스 변수");
//            }
//        }
//        public void testClass(){
//            inClass.Test();
//        }
//    }
//    public void main(String[] args) {
//        Outer outer = new Outer();
//        System.out.println("외부 클래스 사용하여 내부 클래스 기능 호출");
//        outer.testClass();
//    }
//
//}
class StudyCafe{
    static String freeCoffee ="무료 커피";
    static String fridge;
    String desk;
    String beveridge;
    String nameTag = "이름표";

    static String keepInFreidge(){
        return freeCoffee+"맛있게 드셨나요?";
    }
    String fridgeForMember(){
        return nameTag + "가 없는 "+beveridge+"는 폐기됩니다.";
    }
    public static void main(String[] args) {
        StudyCafe new_member = new StudyCafe();
        new_member.beveridge = "슈렉라뗴";
        System.out.println(StudyCafe.keepInFreidge());
        System.out.println(new_member.fridgeForMember());
    }
}


