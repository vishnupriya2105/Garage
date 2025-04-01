public class Car extends Vehicle {
  String door;
  
  public String toString(){
	  
	  return "\n\n"+"Car name:"+super.name+"\n"+"Car color:"+super.color+"\n"+"Car door:"+door;  
  }
}