package in.hello.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="studentdetails")
public class Student {
	
	@Id
	@Column(name="stdid")
	private Integer sid;
	
	@Column(name="stdname",length=70)
	private String sname;
	
	@Column(name="stdaddress",length=150)
	private String saddress;
	
	@Column(name="stdage",length=3)
	private Integer sage;
	
	public Student()
	{
		System.out.println("Hibernate uses the zero argument constructor internally");
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", saddress=" + saddress + ", sage=" + sage + "]";
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

	public String getSaddress() {
		return saddress;
	}

	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}

	public Integer getSage() {
		return sage;
	}

	public void setSage(Integer sage) {
		this.sage = sage;
	}
	
	
}
