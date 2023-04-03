import error.ErrorHandler;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(final String[] args) throws IOException {
        Processor processor = new Processor();
        List<String> arguments = new LinkedList<>(Arrays.asList(args));
        ErrorHandler errorHandler = new ErrorHandler();

        boolean sortingTypeError = errorHandler.handleSortingTypeArgument(arguments);
        boolean dataTypeError = errorHandler.handleDataTypeArgument(arguments);
        arguments = errorHandler.handleUnknownArgument(arguments);
        if (sortingTypeError || dataTypeError) {
            System.exit(1);
        }

        CommandLineParser parser = new CommandLineParser(arguments);
        processor.setDataType(parser.getDataType());
        processor.setSortType(parser.getSortType());
        processor.setInputFile(parser.getInputFile());
        processor.setOutputFile(parser.getOutputFile());

        processor.processInput();

    }
}



