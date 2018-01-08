package com.interfaceabstract;

public interface Parent extends AbstractParent{

  // private methods are not allowed
  //Illegal modifier for the interface method eat; only public & abstract are permitted
 // private void eat();

  void walk();

 public abstract void demo();

}
