import constants.Constants;
import sort.*;

import java.io.File;

class Processor {
    private String dataType;

    private SortType sortType;
    private File inputFile;
    private File outputFile;

    public SortType getSortType() {
        return sortType;
    }

    public void setSortType(SortType sortType) {
        this.sortType = sortType;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public File getInputFile() {
        return inputFile;
    }

    public void setInputFile(File inputFile) {
        this.inputFile = inputFile;
    }

    public File getOutputFile() {
        return outputFile;
    }

    public void setOutputFile(File outputFile) {
        this.outputFile = outputFile;
    }

    public void processInput() {
        String dataType = getDataType();
        Finder finder = null;
        switch (dataType) {
            case Constants.LONG -> finder = new Finder(new LongSort());
            case Constants.WORD -> finder = new Finder(new WordSort());
            case Constants.LINE -> finder = new Finder(new LineSort());
            default -> finder = new Finder(new LongSort());
        }

        if (finder == null) {
            throw new RuntimeException("Unknown strategy type passed. Please, write correct sorting type");
        }

        finder.sort(getSortType());
    }
}