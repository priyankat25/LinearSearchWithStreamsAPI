This Java code demonstrates how to use the Stream API to perform operations on a collection of elements (in this case, a list of integers). Here is a step-by-step explanation of the code:

1. Imports
          import java.util.Arrays;
          import java.util.List; 
    These imports bring in the necessary classes:
    Arrays: to create the list using Arrays.asList().
    List: to define the type of collection (a list of integers in this case).                   

2. List Declaration
          List<Integer> num = Arrays.asList(10, 55, 70, 15, 10, 3);
    A List of integers (num) is created using Arrays.asList(). The list contains the following elements: [10, 55, 70, 15, 10, 3].
   
3. Element to Search For
          int ele = 10;
    The variable ele holds the value 10, which is the element we want to check for in the list.
   
4. Creating a Stream and Performing Operations
          Long count = num.stream()            // Create a new stream
                          .sorted()           // Sort the stream
                          .filter(n -> n == ele) // Filter for the element ele
                          .count();           // Count occurrences
    This line performs several stream operations:
    num.stream(): This converts the List<Integer> into a stream. A stream is a sequence of elements supporting parallel and sequential operations.
    .sorted(): This operation sorts the elements of the stream in their natural order (ascending order). After sorting, the stream becomes: [3, 10, 10, 15, 55, 70].
    .filter(n -> n == ele): This is a filter operation where we keep only those elements in the stream that are equal to the value of ele (which is 10). The filtered stream will contain only the elements equal to 10, so the result after this step is: [10, 10].
    .count(): This operation counts the number of elements in the filtered stream (i.e., how many times 10 appears). The count will be 2, as 10 appears twice in the list.

5. Checking and Printing the Result
          if(count >= 1) {
              System.out.println("Element is present.");
          } else {
              System.out.println("Element is not present.");
          }
    If the count is greater than or equal to 1, it means the element 10 is present in the list at least once, so it prints "Element is present.".
    If the count is 0, meaning the element was not found, it prints "Element is not present.".
    Since 10 appears twice in the list, the output will be:

Output:
Element is present.
