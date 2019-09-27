https://fi.ort.edu.uy/innovaportal/file/2032/1/design_principles.pdf

***Classes are a necessary, but insufficient, means of organizing a design. The larger granularity of packages are needed to help bring order. But how do we choose which classes belong in which packages.*** 

***Below are three principles known as the Package Cohesion Principles, that attempt to help the software architect.***


1) ***The Release Reuse Equivalency Principle*** (REP)

***The granule of reuse is the granule of release.***

A reusable element, be it a component, a class, or a cluster of classes, cannot be reused unless it is managed by a release system of some kind. Users will be unwilling to use the element if they are forced to upgrade every time the author changes it.
Thus. even though the author has released a new version of his reusable element, he must be willing to support and maintain older versions while his customers go about the slow business of getting ready to upgrade. Thus, clients will refuse to reuse an element unless the author promises to keep track of version numbers, and maintain old versions for awhile.

Therefore, one criterion for grouping classes into packages is reuse. Since packages are the unit of release, they are also the unit of reuse. Therefore architects would do well to group reusable classes together into packages.


2) ***The Common Closure Principle*** (CCP)

***Classes that change together, belong together.***


A large development project is subdivided into a large network of interelated packages. The work to manage, test, and release those packages is non-trivial. The more packages that change in any given release, the greater the work to rebuild, test, and
deploy the release. Therefore we would like to minimze the number of packages that are changed in any given release cycle of the product.

To achieve this, we group together classes that we think will change together. This requires a certain amount of precience since we must anticipate the kinds of changes that are likely. Still, when we group classes that change together into the same packages, then the package impact from release to release will be minimzed.

3) ***The Common Reuse Principle*** (CRP)

***Classes that aren’t reused together should not be grouped together.***

A dependency upon a package is a dependency upon everything within the package. When a package changes, and its release number is bumped, all clients of that package must verify that they work with the new package -- even if nothing they used
within the package actually changed.

We frequently experience this when our OS vendor releases a new operating system. We have to upgrade sooner or later, because the vendor will not support the old version forever. So even though nothing of interest to us changed in the new release, we must go through the effort of upgrading and revalidating.

The same can happen with packages if classes that are not used together are grouped together. Changes to a class that I don’t care about will still force a new release of the package, and still cause me to go through the effort of upgrading and revalidating.


--------------------------------------------------------------------------------------------------------------

### Tension between the Package Cohesion Principles

***These three principles are mutually exclusive. They cannot simultaneously be satisfied. That is because each principle benefits a different group of people***. 

The REP and CRP makes life easy for reusers, whereas the CCP makes life easier for maintainers.

The CCP strives to make packages as large as possible (after all, if all the classes liv in just one package, then only one package will ever change). The CRP, however, tries to make packages very small. 


Fortunately, packages are not fixed in stone. Indeed, it is the nature of packages to shift and jitter during the course of development. Early in a project, architects may set up the package structure such that CCP dominates and develoipment and maintenance is aided. Later, as the architecture stabilizes, the architects may refactor the package structure to maximize REP and CRP for the external reusers.

----------------------------------------------------------------------------------------------------------------


### The Package Coupling Principles.
The next three packages govern the interlationships between packages. 

***Applications tend to be large networks of interlated packages. The rules that govern these interrelationship are some of the most important rules in object oriented architecture.***


1) The ***Acyclic Dependencies Principle*** (ADP)

***The dependencies betwen packages must not form cycles***

Since packages are the granule of release, they also tend to focus manpower. Engineers will typically work inside a single package rather than working on dozens. This tedency is amplified by the package cohesion principles, since they tend to group 
together those classes that are related. Thus, engineers will find that their changes are directed into just a few package. Once those changes are made, they can release those packages to the rest of the project.

Before they can do this release, however, they must test that the package works. To do that, they must compile and build it with all the packages that it depends upon.Hopefully this number is small. 

















