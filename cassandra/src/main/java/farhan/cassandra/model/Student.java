package farhan.cassandra.model;

import java.util.Set;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table(value = "student")
public class Student {
	
	@PrimaryKey(value = "rollno")
	private Integer rollNo;
	
	private String name;
	
	private String dept;
	
	@Column(value="email")
	private Set<String> emailIds;
	
	public Student(Integer rollNo, String name, String dept, Set<String> emailIds) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.dept = dept;
		this.emailIds = emailIds;
	}

	public Integer getRollNo() {
		return rollNo;
	}

	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Set<String> getEmailIds() {
		return emailIds;
	}

	public void setEmailIds(Set<String> emailIds) {
		this.emailIds = emailIds;
	}
	
}
