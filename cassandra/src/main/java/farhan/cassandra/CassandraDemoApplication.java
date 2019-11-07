package farhan.cassandra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import farhan.cassandra.dao.StudentDao;
import farhan.cassandra.model.Student;

@SpringBootApplication
public class CassandraDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CassandraDemoApplication.class, args);
	}

}
