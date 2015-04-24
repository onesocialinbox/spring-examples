package demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserServiceDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private String sql = "select * from users";
	
	public List<String> getAllUsers() {
		
		List<String> names = jdbcTemplate.queryForList(sql, String.class);
		
		return names;
	}

}
