package JavaGrammer;

public class AccessTest {
        private static int eye=2;
        private int leg=3;

        public AccessTest (int eyes, int legs){
            eye = eyes;
            leg=leg;
        }

        public AccessTest (){
        }

        public void print(){
            System.out.println(eye);
            System.out.println(leg);
        }

}
