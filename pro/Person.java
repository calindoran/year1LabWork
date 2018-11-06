package pro;

// Author 			: Oisin Cawley
// Date 			: Feb-2016
// Purpose 			: A superclass Person

public class Person {
   // Instance variables
   private String name;
   private String address;
   
   // Constructor
   public Person(String name, String address) {
      this.name = name;
      this.address = address;
   }
   
   public String getAddress() {
      return address;
   }
   // Getters
   public String getName() {
      return name;
   }
   
   @Override
public String toString() {
      return name + "(" + address + ")";
   }
}