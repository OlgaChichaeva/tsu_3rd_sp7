package w4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Односвязный список целых чисел
 */
public class SinglyLinkedList {

    /**
     * Добавляет число i в конец списка
     * @param i
     */
   private List<Integer> list = new ArrayList<>();
    public void push_back(Integer i) {
      list.add(i);
    }

    /**
     * Изымает последний добавленный элемент списка
     * @return
     */
    public Integer pop_back() {
       
       // throw new RuntimeException("list is empty!");
        Integer remove = list.remove(list.lastIndexOf(this));
       return remove;
    }

    /**
     * Сортирует односвязный список.
     */
    public void sort() {
     Collections.sort(list);
    }
}
