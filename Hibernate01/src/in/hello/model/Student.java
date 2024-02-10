package in.hello.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity//this class is used for mapping
@Table(name="student")//map to student table in the db
public class Student {
	
	@Id//treated as the primary key
	@Column(name="stdid")
	private Integer sid;
	
	@Column(name="stdname")
	private String sname;
	
	@Column(name="stdage")
	private Integer sage;
	
	@Column(name="stdaddress")
	private String saddress;
	
	public Student() {
		System.out.println("Hibernate uses the zero argument constructor internally");
	}
	
	public Integer getSid() {
		return sid;
	}



	public void setSid(Integer sid) {
		this.sid = sid;
	}



	public String getSname() {
		return sname;
	}



	public void setSname(String sname) {
		this.sname = sname;
	}



	public Integer getSage() {
		return sage;
	}



	public void setSage(Integer sage) {
		this.sage = sage;
	}



	public String getSaddress() {
		return saddress;
	}



	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}



	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sage=" + sage + ", saddress=" + saddress + "]";
	}

}
