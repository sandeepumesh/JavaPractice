package com.creational.factoryImpl;

import com.creational.factoryInterfaces.Currency;

public class India implements Currency{

  @Override
  public String getCurrency() {
    // TODO Auto-generated method stub
    return "Rupee";
  }

  @Override
  public String getSymbol() {
    // TODO Auto-generated method stub
    return "rp";
  }

}
