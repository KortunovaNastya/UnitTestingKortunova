package org.example.third_task;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reverser {
    public List<Integer> reverseList(List<Integer> originalList) {
        List<Integer> reversedList = new ArrayList<>(originalList);
        Collections.reverse(reversedList);
        return reversedList;
    }
}
