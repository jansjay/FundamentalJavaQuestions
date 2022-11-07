### Polymorphism
In the problem3 package of your workspace, you are given fully implemented classes ```Employee``` and ```Manager```.You will also find a ```class Statistics``` in problem3 package, with an unimplemented method ```computeSumOfSalaries```. 

Your task is to implement ```computeSumOfSalaries```. 
The ```main``` method of the ```Main``` class must first combine the two input lists of Employees and Managers into a single list. 
To do this, so that you can use polymorphism, you must make use of the ```interface Payable``` that has been provided in the problem3 package. 
You will need to insert your own method inside the ```Payable interface```. 
The combined list should be passed into ```computeSumOfSalaries```, which must then polymorphically compute the sum of all the salaries of all Employees and Managers in the combined list, and then return this value. 
If you do not do this computation polymorphically (for example, by computing the sums of the two lists separately and summing the two results), you will receive no credit. 

The first step of your implementation must combine the two lists into a single list (inside the main method of ```Main```) before any sum of salaries is computed. Your implementation of ```computeSumOfSalaries``` must not check types (using ```instanceof``` or ```getClass()```). 
You must also add a proper List type in the declaration of the method ```computeSumOfSalaries```. 

Note: You may modify declarations of ```Employee``` and ```Manager```, but you must not remove the ```final``` keyword from either of these class declarations. The code you submit should have no compiler errors and should not produce any runtime errors. 

```Java```
Templates
[Employee](Employee.java.template)
[Main](Main.java.template)
[Manager](Manager.java.template)
[Payable](Payable.java.template)
[Statistics](Statistics.java.template)

```Java```
Answer
[Employee](Employee.java)
[Main](Main.java)
[Manager](Manager.java)
[Payable](Payable.java)
[Statistics](Statistics.java)
