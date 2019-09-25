https://fi.ort.edu.uy/innovaportal/file/2032/1/design_principles.pdf

***Subclasses should be substitutable for their base classes.***

***Derived classes should be substitutable for their base classes. That is, a user of a base class should continue to
function properly if a derivative of that base class is passed to it.***


### Design by Contract

***Restating the LSP, we can say that, in order to be substitutable, the contract of the base class must be honored by the derived class***


Making the contract explicit is an avenue of research followed by Bertrand Meyer. He
has invented a language named Eiffel in which contracts are explicitly stated for each
method, and explicitly checked at each invocation. Those of us who are not using
Eiffel, have to make do with simple assertions and comments.


To state the contract of a method, we declare what must be true before the method is
called. This is called the precondition. If the precondition fails, the results of the
method are undefined, and the method ought not be called. We also declare what the
method guarantees will be true once it has completed. This is called the postcondition.
A method that fails its postcondition should not return.


Restating the LSP once again, this time in terms of the contracts, a derived class is
substitutable for its base class if:

1) Its preconditions are no stronger than the base class method.

2) Its postconditions are no weaker than the base class method.
Or, in other words, derived methods should expect no more and provide no less.










