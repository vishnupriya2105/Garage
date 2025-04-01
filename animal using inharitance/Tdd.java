public class Tdd{
public static void main(String[] args){

	Vehicle bike= new Bike();
	bike.name="BMW";
	bike.color="Red";
	((Bike)bike).tyre="circle";
	
	Vehicle car= new Car();
	car.name="Bmw";
	car.color="Grey";
	((Car)car).door="Square";
	
	System.out.print("\n\n"+bike+"  "+"\n\n"+car);
	


}

}