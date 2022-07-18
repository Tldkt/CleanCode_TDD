package JavaGrammer;
import java.util.*;
import java.util.stream.*;



class StreamEx1 {
    public static void main(String[] args) {
        Stream<Student> studentStream = Stream.of(
                new Student("이자바",3,300),
                new Student("김자바",1,350),
                new Student("박자바",5,400),
                new Student("송자바",6,100),
                new Student("구자바",2,250),
                new Student("정자바",4,380)
        );

        studentStream.sorted(Comparator.comparing(Student::getBan)
                        .thenComparing(Comparator.naturalOrder()))
                .forEach(System.out::println);
    }
}

class Student implements Comparable<Student> {
    String name;
    int ban;
    int totalScore;

    Student(String name, int ban, int totalScore) {
        this.name =name;
        this.ban =ban;
        this.totalScore =totalScore;
    }

    public String toString() {
        return String.format("[%s, %d, %d]", name, ban, totalScore).toString();
    }

    String getName()     { return name;}
    int getBan()         { return ban;}
    int getTotalScore()  { return totalScore;}

    // ���� ���������� �⺻ ���ķ� �Ѵ�.
    public int compareTo(Student s) {
        return s.totalScore - this.totalScore;
    }
}