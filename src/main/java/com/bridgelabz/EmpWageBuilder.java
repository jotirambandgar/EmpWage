package com.bridgelabz;

public class EmpWageBuilder {
  private final int EMP_FULL_DAY_HR = 8;
  private final int EMP_WAGE_PER_HR = 20;

  public boolean isEmpPresent(){
    double random = Math.random();
    if(random < 0.5){
      return false;
    }
    return true;
  }

  public int calculateWage(){
      return EMP_FULL_DAY_HR * EMP_WAGE_PER_HR;

  }
}
