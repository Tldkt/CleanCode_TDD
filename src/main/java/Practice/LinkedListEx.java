//package Practice;
//
//import java.util.Comparator;
//
//public class LinkedListEx<E> {
//    public LinkedListEx(){
//        head = crnt = null;
//    }
//    //노드
//    class Node<E>{
//        private E data;//데이터
//        private Node<E> next;//뒤쪽 포인터
//
//        //생성자
//        Node(E data, Node<E> next){
//            this.data =data;
//            this.next =next;
//        }
//    }
//    //머리노드 포인터, 선택노드 포인터
//    private Node<E> head;
//    private Node<E> crnt; //선택노드
//
//    public E search(E obj, Comparator<? super E> c){
//        //스캔하기 위한 변수를 head로 초기화
//        Node<E> ptr = head;
//        //ptr가 null이면 스캔할 노드가 없음을 의미하므로 빠져나와서 검색 실패 리턴
//        while(ptr != null){
//            //검색 성공
//            if(c.compare(obj, ptr.data) == 0){
//                crnt = ptr;
//                return ptr.data;
//            }
//            //다음 노드 선택
//            ptr=ptr.next;
//        }
//        //검색 실패
//        return null;
//    }
//    //머리에 노드 추가
//    public void sddFirst(E obj){
//        //우선 임시 ptr이 머리 노드를 가리키게끔 하기
//        Node<E> ptr = head;
//        //삽입할 노드 g 만들기
//        Node<E> g = new Node<E>(obj, ptr);
//        //head가 g 가리키고, 선택노드도
//        head = crnt = g;
//    }
//
//
//
//}
//
//
