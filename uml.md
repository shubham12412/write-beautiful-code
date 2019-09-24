1) https://www.linkedin.com/learning/search?entityType=VIDEO&keywords=unified%20modeling%20language%20uml

2) https://martinfowler.com/books/uml.html

3) https://en.wikipedia.org/wiki/List_of_Unified_Modeling_Language_tools

---------------------------------------------------------------------------------------------------------------------

***Types of UML Diagrams: The current UML standards call for 14 different kinds of diagrams. These diagrams are organized into two distinct groups: structural diagrams and behavioral or interaction diagrams.***


### Class Diagram

These are the different types of relationships between classes:

1) ***Association***: If two classes in a model need to communicate with each other, there must be a link between them. This link can be represented by an association.


2) ***Aggregation***: Aggregation is a special type of association used to model a “whole to its parts” relationship. In a basic aggregation relationship, the lifecycle of a PART class is independent of the WHOLE class’s lifecycle. ***In other words, aggregation implies a relationship where the child can exist independently of the parent.***


3) ***Composition***: ***The composition aggregation relationship is just another form of the aggregation relationship, but the child class’s instance lifecycle is dependent on the parent class’s instance lifecycle***. In other words, ***Composition implies a relationship where the child cannot exist independent of the parent***. In the above example, WeeklySchedule is composed in Flight which means when Flight lifecycle ends, WeeklySchedule automatically gets destroyed.


4) ***Generalization***: Generalization is the mechanism for combining similar classes of objects into a single, more general class. Generalization identifies commonalities among a set of entities. In the above diagram, Crew, Pilot, and Admin, all are Person.

5) ***Dependency***: A dependency relationship is a relationship in which one class, the client, uses or depends on another class, the supplier. In the above diagram, FlightReservation depends on Payment.


![class diagram notation](https://www.educative.io/api/collection/5668639101419520/5692201761767424/page/6235413119238144/image/6207956561428480.png)


