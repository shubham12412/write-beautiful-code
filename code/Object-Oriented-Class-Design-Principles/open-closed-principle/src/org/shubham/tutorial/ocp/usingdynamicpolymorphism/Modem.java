package org.shubham.tutorial.ocp.usingdynamicpolymorphism;


public interface Modem {

  void dial(String phoneNo);

  void send(String text);

  char recv();

  void hangup();

}
