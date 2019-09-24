package org.shubham.tutorial.ocp.usinggenerics;

import org.shubham.tutorial.ocp.usingdynamicpolymorphism.Modem;

/**
 * 
 * Static Polymorphism. Another technique for conforming to the OCP is through
 * the use of templates or generics. The LogOn function can be extended with
 * many different types of modems without requiring modification
 * 
 * 
 * 
 */

public class LogonService<T extends Modem> {

  public void logon(T modem, String phoneNo, String user, String password) {

    modem.dial(phoneNo);
    // you get the idea.
  }

}
