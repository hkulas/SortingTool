package error;

import constants.Constants;

import java.util.LinkedList;
import java.util.List;

public class ErrorHandler {
    public boolean handleSortingTypeArgument(List<String> list) {
        if (list.contains(Constants.SORTING_TYPE)) {
            if (!list.contains(Constants.SORTING_TYPE_NATURAL) && !list.contains(Constants.SORTING_TYPE_BY_COUNT)) {
                System.out.println("No sorting type defined");
                return true;
            }
        }
        return false;
    }

    public boolean handleDataTypeArgument(List<String> list) {
        if (list.contains(Constants.DATA_TYPE)) {
            if (!list.contains(Constants.LONG) && !list.contains(Constants.WORD) && !list.contains(Constants.LINE)) {
                System.out.println("No data type defined");
                return true;
            }
        }
        return false;
    }

    public List<String> handleUnknownArgument(List<String> list) {
        List<String> elementsToDelete = new LinkedList<>();
        for (String arg : list) {
            if (!isKnownArgument(arg)) {
                System.out.println(arg + " is not a valid parameter. It will be skipped.");
                elementsToDelete.add(arg);
            }
        }
        list.removeAll(elementsToDelete);
        return list;
    }

    private boolean isKnownArgument(String arg) {
        final List<String> keyWords = List.of(Constants.SORTING_TYPE_NATURAL, Constants.LONG, Constants.WORD,
                Constants.LINE, Constants.SORTING_TYPE_BY_COUNT, Constants.DATA_TYPE, Constants.SORTING_TYPE, Constants.INPUT_FILE, Constants.OUTPUT_FILE);

        for (String knownArg : keyWords) {
            if (knownArg.equals(arg) || arg.contains(".txt")) {
                return true;
            }
        }
        return false;
    }


}