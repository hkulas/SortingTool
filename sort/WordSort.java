package sort;

import constants.Constants;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordSort implements SortStrategy {
    @Override
    public void sort(SortType sortType) {
        Scanner scanner = new Scanner(System.in);
        List<String> words = new ArrayList<>();

        while (scanner.hasNext()) {
            String word = scanner.next();
            words.add(word);
        }
        switch (sortType) {
            case NATURAL -> processSortNatural(words, Constants.WORDS);
            case BYCOUNT -> processSortByCount(words, Constants.WORDS);
            default -> processSortNatural(words, Constants.WORDS);

        }
    }
}
