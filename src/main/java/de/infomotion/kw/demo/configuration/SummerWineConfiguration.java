package de.infomotion.kw.demo.configuration;

import org.apache.commons.dbcp.BasicDataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import javax.sql.DataSource;

@Configuration
@EnableJpaRepositories(basePackages = "de.infomotion.kw.demo.repository.summerwine",
        entityManagerFactoryRef = "summerWineEntityManagerFactory",
        transactionManagerRef= "summerWineTransactionManager")
public class SummerWineConfiguration {

    @Bean
    @ConfigurationProperties("app.datasource.summerwine")
    public DataSourceProperties summerWineDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean
    @ConfigurationProperties("app.datasource.summerwine.configuration")
    public DataSource summerwineDataSource() {
        return summerWineDataSourceProperties().initializeDataSourceBuilder()
                .type(BasicDataSource.class).build();
    }

    @Bean(name = "summerWineEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean summerWineEntityManagerFactory(
            EntityManagerFactoryBuilder builder) {
        return builder.dataSource(summerwineDataSource()).packages("de.infomotion.kw.demo.model.summerwine").build();
    }

    @Bean
    public PlatformTransactionManager summerWineTransactionManager(
            final @Qualifier("summerWineEntityManagerFactory") LocalContainerEntityManagerFactoryBean summerWineEntityManagerFactory) {
        return new JpaTransactionManager(summerWineEntityManagerFactory.getObject());
    }
}