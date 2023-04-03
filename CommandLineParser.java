import constants.Constants;
import sort.SortType;

import java.io.File;
import java.util.List;

class CommandLineParser {
    private String dataType = Constants.LONG;
    private SortType sortType = SortType.NATURAL;
    private File inputFile;
    private File outputFile;

    public CommandLineParser(List<String> arguments) {

        for (int i = 0; i < arguments.size(); i++) {
            switch (arguments.get(i)) {
                case Constants.DATA_TYPE:
                    dataType = arguments.get(i + 1);
                    break;
                case Constants.SORTING_TYPE:
                    sortType = SortType.valueOf(arguments.get(i + 1).toUpperCase());
                    break;
                case Constants.INPUT_FILE:
                    inputFile = new File(arguments.get(i + 1));
                    break;
                case Constants.OUTPUT_FILE:
                    outputFile = new File(arguments.get(i + 1));
                    break;
            }
        }
    }

    public String getDataType() {
        return dataType;
    }

    public SortType getSortType() {
        return sortType;
    }

    public File getInputFile() {
        return inputFile;
    }

    public File getOutputFile() {
        return outputFile;
    }
}