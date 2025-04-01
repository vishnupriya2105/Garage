public class Tdd{
	public static void main(String[]args){
		School school=new School();
		school.name="ABC school";
		school.add="ABC add  pathiripala 678903";
		school.phno=9998887776L;
	System.out.println("\n"+"school name:"+school.name+"\n"+"school add:"+school.add+"\n"+"phone:"+school.phno);
	
	 school.playground=new Playground();
	school.playground.name="playground";
	school.playground.sqft=25.3;
	System.out.println("\n"+"Playground name:"+school.playground.name+"\n"+"Playground sqft:"+school.playground.sqft);
	
	
	school.playground.teacher=new Teacher();
	school.playground.teacher.name="Priya";
	school.playground.teacher.sub="sports";
	school.playground.teacher.age=25;
	school.playground.teacher.gender="female";
	System.out.println("\n"+"Teacher name:"+school.playground.teacher.name+"\n"+"Subject:"+school.playground.teacher.sub+"\n"+"age:"+school.playground.teacher.age+"\n"+"gender:"+school.playground.teacher.gender);
	
		school.classroom=new Classroom();

	for(int i=0;i<school.classroom.teacher.length;i++)
	{
	school.classroom.teacher[i]=new Teacher();
	school.classroom.teacher[i].name="riya"+i;
	school.classroom.teacher[i].sub="physics";
	school.classroom.teacher[i].age=26;
	school.classroom.teacher[i].gender="female";
}
    for(int i=0;i<5;i++)
	{
	school.classroom.student[i]=new Student();
	school.classroom.student[i].name="A"+i;
	school.classroom.student[i].gender="F";
	school.classroom.student[i].age=9;
	school.classroom.student[i].roll=5;
	}
	 for(int i=0;i<school.classroom.teacher.length;i++){
	school.classroom.teacher[i].showTeacherDetails();
	}
	 for(int i=0;i<school.classroom.student.length;i++){
	school.classroom.student[i].showStudentllDetails();
	}
	}
	}
		