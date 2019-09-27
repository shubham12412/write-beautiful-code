https://fi.ort.edu.uy/innovaportal/file/2032/1/design_principles.pdf

***Many client specific interfaces are better than one general purpose interface***

The ISP is another one of the enabling technologies supporting component substrates such as COM. Without it, components and classes would be much less useful and portable.

***The essence of the principle is quite simple. If you have a class that has several clients, rather than loading the class with all the methods that the clients need, create specific interfaces for each client and multiply inherit them into the class.***


![](/img/Fat-Service-with-Integrated-Interfaces.jpg)

Figure 2-19 shows a class with many clients, and one large interface to serve them all. Note that whenever a change is made to one of the methods that ClientA calls, ClientB and ClientC may be affected. It may be necessary to recompile and
redeploy them. This is unfortunate.




