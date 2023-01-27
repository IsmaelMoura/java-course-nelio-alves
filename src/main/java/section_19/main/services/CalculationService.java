package section_19.main.services;

import java.util.List;

public class CalculationService {

    public static <T extends Comparable<T>> T max(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalStateException("List can't be empty");
        }

        T max = list.get(0);
        for (T item : list) {
            if (item.compareTo(max) > Double.MIN_VALUE) {
                max = item;
            }
        }
        return max;
    }
}