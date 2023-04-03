package sort;

import constants.Constants;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LineSort implements SortStrategy {
    @Override
    public void sort(SortType sortType) {
        Scanner scanner = new Scanner(System.in);
        List<String> lines = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            lines.add(line);
        }

        switch (sortType) {
            case NATURAL -> sortLinesNaturally(lines);
            case BYCOUNT -> processSortByCount(lines, Constants.LINES);
            default -> sortLinesNaturally(lines);

        }

    }

    private void sortLinesNaturally(List<String> list) {
        Collections.sort(list);
        StringBuilder stringBuilder = new StringBuilder();
        for (String parameter : list) {
            stringBuilder.append(parameter).append("\n");
        }
        System.out.printf("Total lines: %d\n", list.size());
        System.out.printf("Sorted data:\n%s", stringBuilder);
    }
}
