package org.shubham.tutorial.lsp;

/**
 * The Circle/Ellipse Dilemma. Most of us learn, in high school math, that a
 * circle is just a degenerate form of an ellipse. All circles are ellipses with
 * coincident foci. This is-a relationship tempts us to model circles and
 * ellipses using inheritance
 * 
 * While this satisfies our conceptual model, there are certain difficulties. A
 * closer look at the declaration of Ellipse in Figure 2-16 begins to expose
 * them. Notice that Ellipse has three data elements. The first two are the
 * foci, and the last is the length of the major axis. If Circle inherits from
 * Ellipse, then it will inherit these data variables. This is unfortunate since
 * Circle really only needs two data elements, a center point and a radius.
 * 
 * 
 * Still, if we ignore the slight overhead in space, we can make Circle behave
 * properly by overriding its SetFoci method to ensure that both foci are kept
 * at the same value. See Listing 2-5. Thus, either focus will act as the center
 * of the circle, and the major axis will be its diameter.
 * 
 * 
 * Clients Ruin Everything. 
 * Certainly the model we have created is self
 * consistent. An instance of Circle will obeys all the rules of a circle. There
 * is nothing you can do to it to make it violate those rules. So too for
 * Ellipse. The two classes form a nicely consistent model, even if Circle has
 * one too many data elements.
 * 
 * 
 * However, Circle and Ellipse do not live alone in a universe by themselves.
 * They cohabit that universe with many other entities, and provide their public
 * interfaces to those entities. Those interfaces imply a contract. The contract
 * may not be explicitly stated, but it is there nonetheless. For example, users
 * of Ellipse have the right to expect the following code fragment to succeed:
 * 
 * void f(Ellipse& e)
  {
  Point a(-1,0);
  Point b(1,0);
  e.SetFoci(a,b);
  e.SetMajorAxis(3);
  assert(e.GetFocusA() == a);
  assert(e.GetFocusB() == b);
  assert(e.GetMajorAxis() == 3);
  }
 *
 *
 *
 * In this case the function expects to be working with an Ellipse. As such, it expects
  to be able to set the foci, and major axis, and then verify that they have been properly  
  set. If we pass an instance of Ellipse into this function, it will be quite happy.
  However, if we pass an instance of Circle into the function, it will fail rather badly.
 *
 * 
 * If we were to make the contract of Ellipse explicit, we would see a postcondition
  on the SetFoci that guaranteed that the input values got copied to the member variables, and that 
  the major axis variable was left unchanged. Clearly Circle violates
  this guarantee because it ignores the second input variable of SetFoci. 
 *
 *
 * 
 * Design by Contract. 
 * Restating the LSP, we can say that, in order to be substitutable, the contract of
 * the base class must be honored by the derived class. Since Circle does not honor the implied contract of 
 * Ellipse, it is not substitutable and violates the LSP.
 * 
 * 
 */
public class Circle extends Ellipse {

}
