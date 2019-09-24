https://fi.ort.edu.uy/innovaportal/file/2032/1/design_principles.pdf

***It means simply this: We should write our modules so that they can be extended, without requiring them to be modified. In other words, we want to be able to change what the modules do, without changing the source code of the modules.***

***This may sound contradictory, but there are several techniques for achieving the OCP on a large scale. All of these techniques are based upon abstraction. Indeed, abstraction is the key to the OCP.*** 

Several of these techniques are described below.

Bad Code design example :
https://github.com/shubham12412/write-beautiful-code/blob/master/code/Object-Oriented-Class-Design-Principles/open-closed-principle/src/org/shubham/tutorial/ocp/baddesign/Modem.java


1) Dynamic Polymorphism : 
https://github.com/shubham12412/write-beautiful-code/tree/master/code/Object-Oriented-Class-Design-Principles/open-closed-principle/src/org/shubham/tutorial/ocp/usingdynamicpolymorphism


2) Static Polymorphism. Another technique for conforming to the OCP is through the use of templates or generics. 

---------------------------------------------------------------------------------------------------------------

### Architectural Goals of the OCP. 
By using these techniques to conform to the OCP, we can create modules that are extensible, without being changed. 
This means that, with a little forethought, we can add new features to existing code, without changing the existing code 
and by only adding new code. 


Even if the OCP cannot be fully achieved, even partial OCP compliance can make dramatic improvements in the structure of an application. It is always better if changes do not propogate into existing code that already works. If you don’t have to
change working code, you aren’t likely to break it.







