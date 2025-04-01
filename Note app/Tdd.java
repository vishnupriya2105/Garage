public class Tdd{
	public static void main(String[]args){
		Note[] note=new Note[3];
	 note[0]=new Note();
	 note[0].id="FE00012";
	 note[0].author="Ajith";
	 note[0].sub="java";
	
	 note[1]=new Note();
	 note[1].id="FE00023";
	 note[1].author="vijith";
	 note[1].sub="python";
	
	 note[2]=new Note();
	 note[2].id="FE00034";
	 note[2].author="jith";
	 note[2].sub="DBMS";
	for(int i=0;i<note.length;i++)
	 {
	 System.out.println("\n"+"Create&Read:-"+"id:"+note[i].id+"\n"+"Author:"+note[i].author+"\n"+"sub:"+note[i].sub);
	 }
	 note[0]=null;
	 for(int i=0;i<note.length;i++)
	 {
	    if(note[i]!=null){
		System.out.println("\n"+"Delete:-"+"id:"+note[i].id+"\n"+"Author:"+note[i].author+"\n"+"sub:"+note[i].sub);
	 }
	  }
      note[2].id="Update01";
		for(int i=0;i<note.length;i++)
	 {
		if(note[i]!=null){
		System.out.println("\n"+"Update:-"+"id:"+note[i].id+"\n"+"Author:"+note[i].author+"\n"+"sub:"+note[i].sub);
	 }
	 } 
	 }
}