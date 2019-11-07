package farhan.cassandra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import farhan.cassandra.dao.StudentDao;
import farhan.cassandra.model.Student;

@RestController
public class StudentController {
	
	@Autowired
	private StudentDao studentDao;

	@GetMapping("/addstudent")
	public void addStudent() {
		studentDao.addStudent(new Student(99, "Shobhit", "IT", null));
	}
	
	@GetMapping("/getstudent")
	public Student getStudent(@RequestParam(name="id") Integer ID) {
		return studentDao.getStudentById(ID);
	}
	
}
