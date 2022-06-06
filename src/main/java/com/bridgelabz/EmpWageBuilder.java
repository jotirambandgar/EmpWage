package com.bridgelabz;

public class EmpWageBuilder {
  public boolean isEmpPresent(){
    double random = Math.random();
    if(random < 0.5){
      return false;
    }
    return true;
  }
}
