package Cleancode.demo;

import java.util.*;
import java.util.stream.;

public class Solution {
    public static void main(String[] args) {

    }
    public List<String> findPeople(List<String> male, List<String> female, String lastName) {
        //TODO..
        Stream<String> woman = female.stream();
        Stream<String> man = male.stream();
        Stream<String> total = Stream.concat(woman, man);//스트림 합치기
        return total
                .distinct()
                .filter(n -> n.startsWith(lastName))
                .sorted()
                .collect(Collectors.toList());

    }
}
