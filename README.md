This is my solution for the test task of Tyntec.

The main advantages and disadvantages of my solution are the following:
Advantages:
- Most parts of the solution are testable at the smallest possible level (only the random parts may not be sufficiently tested)
- It is possible to increase the number of rounds played easily
- It is also possible to easily add players with different behaviors to the simulation
Disadvantage:
- using a slightly modified version of the compare method for the Symbols enum of the java.util.Comparator interface may lead to confusion as to what the returned integer stands for