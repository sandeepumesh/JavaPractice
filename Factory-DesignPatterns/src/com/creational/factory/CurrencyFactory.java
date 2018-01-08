package com.creational.factory;

import com.creational.factoryImpl.India;
import com.creational.factoryImpl.USA;
import com.creational.factoryInterfaces.Currency;

public class CurrencyFactory {

  public static Currency getCurrencyByCountry(String country) throws Exception{

    if("IN".equalsIgnoreCase(country)){
      return new India();
    }else if("USA".equalsIgnoreCase(country)){
      return new USA();
    }
   throw new Exception("Invalid Country");
  }
public static void main(String[] args) {

  Currency curr;

  try {
    curr= CurrencyFactory.getCurrencyByCountry("IN");
    System.out.println("Indian currency : "+curr.getCurrency());
    System.out.println("Indian currency symbol: "+curr.getSymbol());
  }
  catch (Exception e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
  }

}
}
