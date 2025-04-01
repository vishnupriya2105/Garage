public class Tdd{
	public static void main(String[] args){
		
		System.out.print("\t\t---------------------------------------car details---------------------------------------------");
		
	Car car=new Car();
	
		car.name="*Ford";
		car.color="*Red";
		car.owner="*Vish";
	 car.start();
	
for(int i=0;i<4;i++)
	
{
	car.door[i]=new Door();	
	car.door[i].color= "*Black";
	//System.out.print(car.door[i]);
}
for(int i=0;i<4;i++)
{
	car.tyre[i]=new Tyre();	
	car.tyre[i].brand= "*MRF";
	car.tyre[i].size="*205/55 R16 91V";
	// System.out.print(car.tyre[i]);	
}
	car.steering=new Steering();
	car.steering.type="*Power";
	
//	System.out.print(car.steering);
			System.out.print(car);
      
	  car.stop();
	}
	
}
	
