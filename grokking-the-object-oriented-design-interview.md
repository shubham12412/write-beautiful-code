1) https://www.educative.io/courses/grokking-the-object-oriented-design-interview

2) https://www.educative.io/courses/grokking-the-object-oriented-design-interview/qVDnLQ75r5G

***The four principles of object-oriented programming are encapsulation, abstraction, inheritance, and polymorphism.***

1) ***Encapsulation***: ***Encapsulation is the mechanism of binding the data together and hiding it from the outside world***. Encapsulation is achieved when each object keeps its state private so that other objects don’t have direct access to its state. Instead, they can access this state only through a set of public functions.

2) ***Abstraction***: Abstraction can be thought of as the natural extension of encapsulation. It means hiding all but the relevant data about an object in order to reduce the complexity of the system. In a large system, objects talk to each other, which makes it difficult to maintain a large code base; ***abstraction helps by hiding internal implementation details of objects and only revealing operations that are relevant to other objects.***

3) ***Inheritance***: Inheritance is the mechanism of creating new classes from existing ones

4) ***Polymorphism***: Polymorphism (from Greek, meaning “many forms”) is the ability of an object to take different forms and thus, depending upon the context, to respond to the same message in different ways. Take the example of a chess game; a chess piece can take many forms, like bishop, castle, or knight and all these pieces will respond differently to the ‘move’ message.


-------------------------------------------------------------------------------------------------------------------

***Types of UML Diagrams: The current UML standards call for 14 different kinds of diagrams. These diagrams are organized into two distinct groups: structural diagrams and behavioral or interaction diagrams.***


### Class Diagram

These are the different types of relationships between classes:

1) ***Association***: If two classes in a model need to communicate with each other, there must be a link between them. This link can be represented by an association.


2) ***Aggregation***: Aggregation is a special type of association used to model a “whole to its parts” relationship. In a basic aggregation relationship, the lifecycle of a PART class is independent of the WHOLE class’s lifecycle. ***In other words, aggregation implies a relationship where the child can exist independently of the parent.***


3) ***Composition***: ***The composition aggregation relationship is just another form of the aggregation relationship, but the child class’s instance lifecycle is dependent on the parent class’s instance lifecycle***. In other words, ***Composition implies a relationship where the child cannot exist independent of the parent***. In the above example, WeeklySchedule is composed in Flight which means when Flight lifecycle ends, WeeklySchedule automatically gets destroyed.


4) ***Generalization***: Generalization is the mechanism for combining similar classes of objects into a single, more general class. Generalization identifies commonalities among a set of entities. In the above diagram, Crew, Pilot, and Admin, all are Person.

5) ***Dependency***: A dependency relationship is a relationship in which one class, the client, uses or depends on another class, the supplier. In the above diagram, FlightReservation depends on Payment.


![class diagram notation](https://www.educative.io/api/collection/5668639101419520/5692201761767424/page/6235413119238144/image/6207956561428480.png)




------------------------------------------------------------------------------------------------------------------

1) Design a Library Management System
https://www.educative.io/courses/grokking-the-object-oriented-design-interview/RMlM3NgjAyR

2) Design a Parking Lot
https://www.educative.io/courses/grokking-the-object-oriented-design-interview/gxM3gRxmr8Z

3) Design Amazon - Online Shopping System
https://www.educative.io/courses/grokking-the-object-oriented-design-interview/Bn8PMllro6Q

4) Design Stack Overflow
https://www.educative.io/courses/grokking-the-object-oriented-design-interview/m2YWoEq06AR

5) Design a Movie Ticket Booking System
https://www.educative.io/courses/grokking-the-object-oriented-design-interview/gxkvNgMqDk3

6) Design an ATM
https://www.educative.io/courses/grokking-the-object-oriented-design-interview/m22LWKgQ4Wr

7) Design an Airline Management System
https://www.educative.io/courses/grokking-the-object-oriented-design-interview/RMjqP6Vw98R

8) Design Blackjack and a Deck of Cards
https://www.educative.io/courses/grokking-the-object-oriented-design-interview/YQ5gm2APRnp

9) Design a Hotel Management System
https://www.educative.io/courses/grokking-the-object-oriented-design-interview/39Ek39vZBy9

10) Design a Restaurant Management system
https://www.educative.io/courses/grokking-the-object-oriented-design-interview/xV8p1GA6K0r









