public class Tdd{
public static void main(String[] args){
Car car=new Car();
car.name="bmw";
car.color="red";
car.num="KL51c3174";
car.owner="lucky";
System.out.println("car name: "+car.name+"\n"+"car color:"+car.color+"\n"+"car num:"+car.num+"\n"+"car owner:"+car.owner);

car.door=new Door();
car.door.num="4";
car.door.color="grey door";
System.out.println("DOOR features:"+"\n"+"No:of Doors:"+car.door.num+"\n"+"door color:"+car.door.color);

car.door1=new Door();
car.door1.num="46*20";
System.out.println("size of door 1:"+"\n"+car.door1.num);

car.door2=new Door();
car.door2.num="46*20";
System.out.println("size of door 2:"+"\n"+car.door2.num);

car.door3=new Door();
car.door3.num="46*20";
System.out.println("size of door 3:"+"\n"+car.door3.num);

car.door4=new Door();
car.door4.num="46*20";
System.out.println("size of door 4:"+"\n"+car.door4.num);

car.tire=new Tire();
car.tire.num="4";
System.out.println("TIRE features:"+"\n"+"No:Tires:"+car.tire.num);

car.tire1=new Tire();
car.tire.num="p225/75R16";
System.out.println("size of tire 1:"+"\n"+car.tire.num);

car.tire2=new Tire();
car.tire.num="p225/75R17";
System.out.println("size of tire 2:"+"\n"+car.tire.num);

car.tire3=new Tire();
car.tire.num="p225/75R16";
System.out.println("size of tire 3:"+"\n"+car.tire.num);

car.tire4=new Tire();
car.tire.num="p225/75R16";
System.out.println("size of tire 4:"+"\n"+car.tire.num);
}


}
