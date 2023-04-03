package sort;

import sort.SortStrategy;
import sort.SortType;

public class Finder {
    private SortStrategy strategy;

    public Finder(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void sort(SortType sortType) {
        strategy.sort(sortType);
    }
}
