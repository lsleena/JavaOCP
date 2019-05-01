package com.leena.OCP.ExceptionAndAssertion6;

public class CustomException {
}
class CanSwimException extends Exception {}

 class DangerInTheWater extends RuntimeException {}

 class SharkInTheWaterException extends DangerInTheWater {}


 class Dolphin {

 public void swim() throws CanSwimException {
         // logic here
         }
 }