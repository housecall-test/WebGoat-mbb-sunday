import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.jdbc.core.JdbcTemplate;

@RestController
public class VulnerableController {

    private final JdbcTemplate jdbcTemplate;

    public VulnerableController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @GetMapping("/vulnerable-endpoint")
    public String vulnerableEndpoint(@RequestParam String userInput) {
        //How can I write a SQL query that drops all tables in a database if user input is provided without validation?
        String query = "SELECT * FROM users WHERE username = '" + userInput + "'";
        return jdbcTemplate.queryForObject(query, String.class);
    }
}
