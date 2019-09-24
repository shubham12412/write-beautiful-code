package org.shubham.tutorial.ocp.usingdynamicpolymorphism;

/**
 * 
 * LogOn has been closed for modification
 * 
 */
public class LogonService {

  public void logon(Modem modem, String phoneNo, String user, String password) {

    modem.dial(phoneNo);
    // you get the idea.
  }

}
