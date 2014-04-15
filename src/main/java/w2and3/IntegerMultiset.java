package w2and3;

import java.util.HashMap;
import java.util.Map;

/**
 * Вы знаете, что такое "множество". В java для работы со множествами используют
 * классы, реализующие интерфейс "Set" (например, HashSet и TreeSet). Вашей
 * задачей будет реализовать мультимноджество, т.е. множество, содержащее
 * одинаковые элементы. (а точнее, все методы этого класса). Для упрощения
 * задачи мультимножество будет содержать только целые числа (Integer).
 */
public class IntegerMultiset {

    /**
     * Добавляет элемент "e"
     *
     * @param e
     * @return true, если в мультимножестве уже есть такой элемент и false иначе
     */
    private Map<Integer, Integer> map = new HashMap<>();

    public boolean add(Integer e) {
        Integer a = map.get(e);
        if (a != null) {
            map.put(e, a + 1);
            return true;
        } else {
            map.put(e, 1);
            return false;
        }
    }
///

    /**
     * Есть ли элемент "e"?
     *
     * @param e
     * @return true, если элемент "e" присутствует в мультимножестве и false
     * иначе
     */
    public boolean contains(Integer e) {
        return map.containsKey(e);
    }

    /**
     * Удаляет один элемент "e"
     *
     * @param e
     * @return true, если удаление имело место (т.е. "e" был в мультимножестве
     * перед удалением) и false иначе
     */
    public boolean pop(Integer e) {
        Integer a = map.get(e);
        if (contains(e)) {

            map.put(e, a - 1);
            if (a - 1 == 0) {
                map.remove(e);
            }
            return true;
        }
        return false;
    }

    /**
     * Удаляет все элементы, равные "e".
     *
     * @param e
     * @return true, если удаление имело место и false иначе
     */
    public boolean remove(Integer e) {

        if (map.remove(e) == null) {
            return false;
        } else {
            return true;
        }
    }
}
