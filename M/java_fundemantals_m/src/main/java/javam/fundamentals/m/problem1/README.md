### Problem 1 - Recursion
The class prob1.Problem1.java has a computeAverage method that accepts a HashMap scores as input. The method is intended to compute the average of the test scores that are stored as values in the map. An example of the scores map is the following:

Example of the scores HashMap
|Key|Value|
|------|----------|
|"John William"| "77.5"|
|"Annette Jones"| "91.0"|
|"Kevin Specker" | "88.8"|

The output of the ```computeAverage``` method working on this example would be (approximately) 85.77. Note that both keys and values in the map are ```Strings```.
The ```computeAverage``` method in your startup code has already been implemented (and this implementation should not be modified), but it relies on the unimplemented method computeSum. Your task in this problem is to implement computeSum using recursion.

Requirements for Problem 1. 

1. You must use recursion in your implementation of ```computeSum``` (failure to use recursion will result in a score of 0 for this problem).
2. Outputs of your ```computeSum``` method must be correct for any given input (note that if the input ```HashMap``` is either null or empty, the return value should be 0).
3. Your code must not have compiler errors or produce any runtime exceptions.
4. You are allowed to make use of additional data structures in your implementation of 
```computeSum```.

Hint: To extract the double value from a String, use the static method ```Double.parseDouble()```.
For example, to extract 2.3 from the String "2.3", use the following code:
``` double val = Double.parseDouble("2.3")```

```Java```
[Answer Template](../../../../../resources/problem1/Problem1.java.template)

```Java```
[Answer](Problem1.java)