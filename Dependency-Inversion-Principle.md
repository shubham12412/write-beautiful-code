https://fi.ort.edu.uy/innovaportal/file/2032/1/design_principles.pdf


***Depend upon Abstractions. Do not depend upon concretions.***

***If the OCP states the goal of OO architecture, the DIP states the primary mechanism.***

***Dependency Inversion is the strategy of depending upon interfaces or abstract functions and classes, rather than upon concrete functions and classes.*** 


Procedural designs exhibit a particular kind of dependency structure. As Figure 2-17 shows, this structure starts at the top and points down towards details. High level modules depend upon lower level modules, which depend upon yet lower level modules, etc..

A little thought should expose this dependency structure as intrinsically weak. The high level modules deal with the high level policies of the application. These policies generally care little about the details that implement them. Why then, must these high level modules directly depend upon those implementation modules?


***An object oriented architecture shows a very different dependency structure, one in which the majority of dependencies point towards abstractions. Morevoer, the modules that contain detailed implementation are no longer depended upon, rather they
depend themselves upon abstractions. Thus the dependency upon them has been inverted.***



### Depending upon Abstractions. 
The implication of this principle is quite simple. ***Every dependency in the design should target an interface, or an abstract class. No dependency should target a concrete class.***


Clearly such a restriction is draconian, and there are mitigating circumstatnces that
we will explore momentarily. 

But, as much as is feasible, the principle should be followed. The reason is simple, concrete things change alot, abstract things change much less frequently. ***Morevoer, abstractions are “hinge points”, they represent the places
where the design can bend or be extended, without themselves being modified (OCP)***




### Mitigating Forces. 
***One motivation behind the DIP is to prevent you from depending upon volatile modules. The DIP makes the assumption that anything concrete is volatile***. While this is frequently so, especially in early development, there are exceptions. For example, the string.h standard C library is very concrete, but is not at all volatile. Depending upon it in an ANSI string environment is not harmful. Likewise, if you have tried and true modules that are concrete, but not volatile, depending upon them is not so bad. Since they are not likely to change, they are not likely to inject volatility into your design.

Take care however. A dependency upon string.h could turn very ugly when the requirements for the project forced you to change to UNICODE characters. Non-volatility is not a replacement for the substitutability of an abstract interface. 

### Object Creation. 
One of the most common places that designs depend upon concrete classes is when those designs create instances. By definition, you cannot create instances of abstract classes. Thus, to create an instance, you must depend upon a
concrete class.

Creation of instances can happen all through the architecture of the design. Thus, it might seem that there is no escape and that the entire architecture will be littered with dependencies upon concrete classes. However, there is an elegant solution to this problem named ABSTRACTFACTORY.











