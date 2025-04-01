public class Tdd1{
public static void main(String[] args){
Car1 car1=new Car1();
car1.name="bmw";
car1.color="red";
car1.num="KL51c3174";
car1.owner="lucky";
System.out.println("car1 name: "+car1.name+"\n"+"car1 color:"+car1.color+"\n"+"car1 num:"+car1.num+"\n"+"car1 owner:"+car1.owner);
for(int i=0;i<4;i++)
{
car1.door1[0]=new Door1();
car1.door1[0].num=1;
car1.door1[0].color="red";

car1.door1[1]=new Door1();
car1.door1[1].num=2;
car1.door1[1].color="blue";

car1.door1[2]=new Door1();
car1.door1[2].num=3;
car1.door1[2].color="red";

car1.door1[3]=new Door1();
car1.door1[3].num=4;
car1.door1[3].color="blue";
System.out.println("door no:"+car1.door1[i].num+"\n"+"door color:"+car1.door1[i].color);
}
for(int i=0;i<4;i++)
{
car1.tire1[0]=new Tire1();
car1.tire1[0].num=1;
car1.tire1[0].name="Appolo";


car1.tire1[1]=new Tire1();
car1.tire1[1].num=2;
car1.tire1[1].name="Appolo";


car1.tire1[2]=new Tire1();
car1.tire1[2].num=3;
car1.tire1[2].name="Appolo";


car1.tire1[3]=new Tire1();
car1.tire1[3].num=4;
car1.tire1[3].name="Appolo";
System.out.println("tire no:"+car1.tire1[i].num+"\n"+"tire color:"+car1.tire1[i].name);
}
}
}
