package de.infomotion.kw.demo.configuration;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "de.infomotion.kw.demo.repository.kwdb",
        entityManagerFactoryRef = "kwDbEntityManagerFactory",
        transactionManagerRef= "kwDbTransactionManager"
)
public class KwDbConfiguration {

    @Bean
    @Primary
    @ConfigurationProperties("app.datasource.kwdb")
    public DataSourceProperties kwDbDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean
    @Primary
    @ConfigurationProperties("app.datasource.kwdb.configuration")
    public DataSource kwDbDataSource() {
        return kwDbDataSourceProperties().initializeDataSourceBuilder()
                .type(HikariDataSource.class).build();
    }

    @Primary
    @Bean(name = "kwDbEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean kwDbEntityManagerFactory(EntityManagerFactoryBuilder builder) {
        return builder
                .dataSource(kwDbDataSource())
                .packages("de.infomotion.kw.demo.model.kwdb")
                .build();
    }

    @Primary
    @Bean
    public PlatformTransactionManager kwDbTransactionManager(
            final @Qualifier("kwDbEntityManagerFactory") LocalContainerEntityManagerFactoryBean kwDbEntityManagerFactory) {
        return new JpaTransactionManager(kwDbEntityManagerFactory.getObject());
    }

}