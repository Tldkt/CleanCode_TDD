package Practice;
/*

public class GenericEx {
    public static void main(String[] args) {
        //예제 2 generic을 사용하는 경우
        //Basket bas = new Basket("String"); "String"넣을 거야
        //String a = (String)bas.getObject(); 그걸 a로 받을 건데, String형으로 받아올래
        // 두 줄을 간단하게
        Basket<String> bas1 = new Basket<String>();//String형 넣어줄 거야
        bas1.setT("String");//들어가는 값은 "String"이야
        String str = bas1.getT();//str으로 받아올래
        System.out.println(str);

        Basket<Integer> bas2 = new Basket<Integer>();
        bas2.setT(1);
        int value =bas2.getT();//Integer가 아니라 왜 int로 받아오는 거지?
        System.out.println(value);
    }
}

//예제 1 Generic을 쓰지 않는 경우의 문제점
class Basket<T>{
   */
/* private Object object;
    Basket(Object object){
        this.object = object;
    }
    public void setObject(Object obj){
        this.object = obj;
    }
    public Object getObject(){
        return object;}*//*

    private T t;
    public T getT() {
        return t;
    }
    public void setT(T t) {
        this.t = t;
    }

}
*/
