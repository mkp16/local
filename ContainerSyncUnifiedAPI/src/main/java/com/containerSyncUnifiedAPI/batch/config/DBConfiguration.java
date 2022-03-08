package com.containerSyncUnifiedAPI.batch.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.Base64;

@Configuration
@PropertySource(value = "classpath:/application.properties")
public class DBConfiguration {

	@Autowired
    private Environment env;

    @Value("${spring.trackit.encrypt.datasource.password}")
    private String trackitPassword;


    @Bean(name = "trackitDB")
    @Primary
    @ConfigurationProperties(prefix = "spring.trackit.datasource")
    public DataSource trackitDataSource() {
        return DataSourceBuilder.create().password(decodePassword(trackitPassword)).build();
    }

    @Bean(name = "trackItJdbcTemplate")
    public JdbcTemplate customJdbcTemplate(@Qualifier("trackitDB") DataSource ds) {
        return new JdbcTemplate(ds);
    }
    
    private String decodePassword(String encryptedPassword) {
		byte[] byteValueBase64Decoded = Base64.getDecoder().decode(encryptedPassword);
		String stringValueBase64Decoded = new String(byteValueBase64Decoded);
		return stringValueBase64Decoded;
	}


}
