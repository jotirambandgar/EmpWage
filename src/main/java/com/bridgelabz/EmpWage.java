package com.bridgelabz;

public class EmpWage {
  public static void main(String[] args) {
    System.out.println("Welcome to employee wage");
    EmpWageBuilder empWageBuilder = new EmpWageBuilder();
    boolean isEmpPresent = empWageBuilder.isEmpPresent();
    if(isEmpPresent){
      System.out.println("Employee is present");
    }else {
      System.out.println("Employee is absent");
    }
  }
}
