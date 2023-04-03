package sort;

import comparator.ValueThenKeyComparator;

import java.util.*;

public interface SortStrategy {


    void sort(SortType sortType);

    default <T extends Comparable<T>> void processSortNatural(List<T> list, String name) {
        Collections.sort(list);
        StringJoiner stringBuilder = new StringJoiner(" ");
        for (T parameter : list) {
            stringBuilder.add(parameter.toString());
        }
        System.out.printf("Total %s: %d.\n", name, list.size());
        System.out.printf("Sorted data: %s \n", stringBuilder);
    }

    default <T extends Comparable<T>> void processSortByCount(List<T> list, String name) {
        Map<T, Integer> countMap = new TreeMap<>(Comparator.naturalOrder());

        for (T key : list) {
            if (countMap.containsKey(key)) {
                Integer value = countMap.get(key);
                countMap.put(key, value + 1);
            } else {
                countMap.put(key, 1);
            }
        }
        List<Map.Entry<T, Integer>> list1 = new ArrayList<Map.Entry<T, Integer>>(countMap.entrySet());
        Collections.sort(list1, new ValueThenKeyComparator<T, Integer>());

        System.out.printf("Total %s: %d.\n", name, list.size());
        for (var entry : list1) {
            long percentage = Math.round((((double) entry.getValue() / list.size()) * 100));
            System.out.printf("%s: %d time(s), %d%%\n", entry.getKey(), entry.getValue(), percentage);
        }
    }
}