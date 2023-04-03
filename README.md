# SortingTool
Basic sorting tool.

## CommandLineArguments 

The programm takes up to 4 command line arguments. These are possible options:
-sortingType  
 natural or byCount
 ### natural
 natural order is lexicographic order, for numbers it is numeric order.
 ### byCount
 elements sorted by the number of occurrences, each on a new line, using the following format:
 element: count time(s), percentage%
 
-dataType 
 long, word, line
 ### long
 It will take input as a integer numbers
 
 ### word
 It will take input as a words
 
 ### line
 It will separate each line as an input
 
 -inputFile/-outputFile 
 It doesn't have any funcionality
 
## Examples
java SortingTool -sortingType natural -dataType long
1 -2   33 4
42
1                 1
Total numbers: 7.
Sorted data: -2 1 1 1 4 33 42 

-sortingType byCount -dataType line
1 -2   33 4
42
1                 1
Total lines: 3
Sorted data:
1                 1
1 -2   33 4
42
