# SortingTool
Basic sorting tool.

## CommandLineArguments 

The program takes up to 4 command line arguments. These are possible options:

- `sortingType`: natural or byCount

  ### natural
  Natural order is lexicographic order. For numbers, it is numeric order.

  ### byCount
  Elements sorted by the number of occurrences, each on a new line, using the following format:
  

- `dataType`: long, word, line

### long
It will take input as integer numbers.

### word
It will take input as words.

### line
It will separate each line as an input.

- `inputFile`/`outputFile`: 

These do not have any functionality.

## Examples
-sortingType natural -dataType long
```
1 -2   33 4
42
1                 1
Total numbers: 7.
Sorted data: -2 1 1 1 4 33 42 
```
-sortingType byCount -dataType line
```
1 -2   33 4
42
1                 1
Total lines: 3
Sorted data:
1                 1
1 -2   33 4
42
```
