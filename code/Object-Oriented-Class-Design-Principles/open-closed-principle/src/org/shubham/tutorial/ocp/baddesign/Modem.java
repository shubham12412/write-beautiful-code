package org.shubham.tutorial.ocp.baddesign;

/**
 * 
 * the LogOn function must be changed every time a new kind of modem is added to
 * the software. Worse, since each different type of modem depends upon the
 * Modem::Type enumeration, each modem must be recompiled every time a new kind
 * of modem is added.
 * 
 * 
 * Logon, must be modified to be extended.
 * 
 * 
 * Of course this is not the worst attribute of this kind of design. Programs
 * that are designed this way tend to be littered with similar if/else or switch
 * statement. Every time anything needs to be done to the modem, a switch
 * statement if/else chain will need to select the proper functions to use. When
 * new modems are added, or modem policy changes, the code must be scanned for
 * all these selection statements, and each must be appropriately modified.
 * 
 * 
 * Worse, programmers may use local optimizations that hide the structure of the
 * selection statements. For example, it might be that the function is exactly
 * the same for Hayes and Courrier modems. Thus we might see code like this: 
 * if
 * (modem.type == Modem::ernie) SendErnie((Ernie&)modem, c); 
 * else
 * SendHayes((Hayes&)modem, c); 
 * Clearly, such structures make the system much
 * harder to maintain, and are very prone to error
 * 
 */

public class Modem {

  Type type;

  static enum Type {
    hayes, courrier, ernie
  }

  public void logon(Modem m, String phoneNo, String user, String password) {
    if (m.type == Type.hayes) {
      // DialHayes((Hayes&)m, pno);
    } else if (m.type == Type.courrier) {
      // DialCourrier((Courrier&)m, pno);
    } else if (m.type == Type.ernie) {
      // DialErnie((Ernie&)m, pno)
    }
    // ...you get the idea
  }

}

class Hayes {
  Modem.Type type;
  // Hayes related stuff
}

class Courrier {
  Modem.Type type;
// Courrier related stuff
}

class Ernie {
  Modem.Type type;
// Ernie related stuff
}