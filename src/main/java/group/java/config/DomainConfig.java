package group.java.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EntityScan("group.java.domain")
@EnableJpaRepositories("group.java.repos")
@EnableTransactionManagement
public class DomainConfig {
}
