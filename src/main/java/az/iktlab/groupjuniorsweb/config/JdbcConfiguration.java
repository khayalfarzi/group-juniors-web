package az.iktlab.groupjuniorsweb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

@Configuration
public class JdbcConfiguration {

//    @Bean
////    @Scope(value = "request")
//    public Statement getStatement() throws SQLException {
//        Connection con = DriverManager.getConnection("");
//        return con.createStatement();
//    }
}