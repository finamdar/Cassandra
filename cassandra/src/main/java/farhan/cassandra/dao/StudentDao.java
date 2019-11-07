package farhan.cassandra.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.core.CassandraTemplate;
import org.springframework.stereotype.Repository;

import farhan.cassandra.model.Student;

@Repository
public class StudentDao {

	@Autowired
	private CassandraTemplate cassandraTemplate;
	
	public void addStudent(Student student) {
		cassandraTemplate.insert(student);
	}
	
	public Student getStudentById(Integer ID) {
		return cassandraTemplate.selectOneById(ID, Student.class);
	}
	
}
