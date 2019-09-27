https://fi.ort.edu.uy/innovaportal/file/2032/1/design_principles.pdf

***Many client specific interfaces are better than one general purpose interface***

The ISP is another one of the enabling technologies supporting component substrates such as COM. Without it, components and classes would be much less useful and portable.

***The essence of the principle is quite simple. If you have a class that has several clients, rather than loading the class with all the methods that the clients need, create specific interfaces for each client and multiply inherit them into the class.***


![](/img/Fat-Service-with-Integrated-Interfaces.jpg)

Figure 2-19 shows a class with many clients, and one large interface to serve them all. Note that whenever a change is made to one of the methods that ClientA calls, ClientB and ClientC may be affected. It may be necessary to recompile and
redeploy them. This is unfortunate.


![](/img/Segregated-Interfaces.jpg)

A better technique is shown in Figure 2-20. The methods needed by each client are placed in special interfaces that are specific to that client. Those interfaces are multiply inherited by the Service class, and implemented there.

If the interface for ClientA needs to change, ClientB and ClientC will remain unaffected. They will not have to be recompiled or redeployed.


### What does Client Specific Mean? 
The ISP does not recommend that every class that uses a service have its own special interface class that the service must
inherit from. If that were the case, the service would depend upon each and every client in a bizarre and unhealthy way. 

Rather, ***clients should be categorized by their type, and interfaces for each type of client should be created.***

***If two or more different client types need the same method, the method should be added to both of their interfaces. This is neither harmful nor confusing to the client.***


### Changing Interfaces. 
When object oriented applications are maintained, the interfaces to existing classes and components often change. There are times when these changes have a huge impact and force the recompilation and redeployment of a very large part of the design. This impact can be mitigated by adding new interfaces to existing objects, rather than changing the existing interface.

Clients of the old interface that wish to access methods of the new interface, can query the object for that
interface as shown in the following code.


`
void Client(Service* s)
{
if (NewService* ns = dynamic_cast<NewService*>(s))
{
// use the new service interface
}
}
`
As with all principles, care must be taken not to overdo it. The specter of a class with hundreds of different interfaces, some segregated by client and other segregated by version, would be frightening indeed.






