package oops.cunstructoroverloading;

public class Student {
	int sid;
	String sname;
	String stream;
	//to initlize only sid
	Student(int sid){
		this.sid = sid;
	}
	
	//to initlize sid and sname
	
	Student(int sid, String sname){
//		this.sid = sid;
		this(sid);
		this.sname = sname;
	}
	
	//to initlize all sid, sname, stream
	Student(int sid,String sname, String stream){
//		this.sid = sid;
//		this.sname = sname;
		this(sid,sname);
		this.stream = stream;
	}
}
