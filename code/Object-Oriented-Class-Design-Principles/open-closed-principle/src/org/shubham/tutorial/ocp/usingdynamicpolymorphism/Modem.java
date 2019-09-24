package org.shubham.tutorial.ocp.usingdynamicpolymorphism;

/**
 * 
 * LogOn has been closed for modification
 * 
 */
public interface Modem {

  void dial(String phoneNo);

  void send(String text);

  char recv();

  void hangup();

}
