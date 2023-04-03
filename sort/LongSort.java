package sort;

import constants.Constants;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LongSort implements SortStrategy {
    @Override
    public void sort(SortType sortType) {
        Scanner scanner = new Scanner(System.in);
        List<Long> numbers = new ArrayList<>();

        while (scanner.hasNext()) {
            if (scanner.hasNextLong()) {
                long number = scanner.nextLong();
                numbers.add(number);
            } else {
                String invalidInput = scanner.next();
                System.out.println(invalidInput + " is not a long. It will be skipped.");
            }
        }
        Collections.sort(numbers);
        switch (sortType) {
            case NATURAL -> processSortNatural(numbers, Constants.NUMBERS);
            case BYCOUNT -> processSortByCount(numbers, Constants.NUMBERS);
            default -> processSortNatural(numbers, Constants.NUMBERS);

        }

    }
}
