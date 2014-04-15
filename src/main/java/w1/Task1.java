package w1;

import java.util.Arrays;

/**
 * Примечание: в этой задаче не рекомендуется использовать контейнеры.
 * Попробуйте вместо этого воспользоваться сортировкой и работать уже с
 * отсортированным массивом. Разрешается использовать библиотечные методы для
 * сортировки, а не писать свои.
 */
public class Task1 {

    /**
     * Метод вычисляет количество уникальных чисел в массиве "array"
     *
     * @param array массив
     * @return количество уникальных чисел
     */
    public int numberOfUniqueNumbers(int[] array) {
        // int[] arrayCopy = new int[5];
        int x = 1;
        Arrays.sort(array);
        for (int i = 0; i < array.length-1 ; i++) {
            if (array[i] != array[i + 1]) {
                x++;
            }
        }

        return x;
    }

    /**
     * Самое часто встречающееся число. Если таковых несколько, то возвращает
     * любое из них
     *
     * @param array массив
     * @return самое часто встречающееся число (или одно из, если таковых
     * несколько)
     */
    public int mostFrequentNumber(int[] array) {
        
         int x = 0;
        int y =0;
        Arrays.sort(array);
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
            x ++ ;
            y = array[i];
            
}
        }
        return 1;
    }
}
