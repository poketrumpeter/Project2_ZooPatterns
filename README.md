# Project2_ZooPatterns

Continuation of OOAD project 1 which implements patterns into the design and adds parts 
of the zoo, as well as adding UML diagrams for this updated zoo program.

## Group Member Names
Gregorio Figueroa 

Darrien Lee

## Assumptions
An assumption that was made regarding the clock was that 
it would only show the times for the zoo. This means it will 
run from 8:00 AM to 8:00 PM. The clock is able to work all
24 hours, but the main day loop will only go until all the tasks for 
each the zookeeper and the ZooFoodServer


Issues: We didn't encounter any issues during development. Drawing UML diagrams took quite a bit of time, however.

## Observer and Strategy Patterns
The main design patterns implemented in this code are the observer
and strategy pattern. The Observer pattern allows the Zoo
Announcer to get alerts and be notified when certain things
in the zoo are happening. The implementation and application
of this pattern is located within the Zoo.people package

The Strategy Pattern allows us to encapsulate what varies and define 
behaviors seperate from the classes and subclasses that will
use these behaviors. We decided to apply the strategy pattern to the Roam
method because most animals could move in a different or uniqueway. It made
the most sense to encapsulate this behavior. The implementations
for the movements are located in the Zoo.Animals,Movements 
Package. 

## Special Instructions
The only specific instructions for running this porogram is when run, 
it will ask for a specific number of days as an Int. There are not many 
System output because all of the output will be sent to an output file
called dayatthezoo.out. 

