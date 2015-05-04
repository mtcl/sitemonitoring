package com.mtcl.sitemonitoring;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.hibernate.jpa.HibernatePersistenceProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan
@EnableTransactionManagement
@EnableJpaRepositories
public class SpringConfiguration {

	@Bean
	public DataSource dataSource() {

		HikariDataSource dataSource = new HikariDataSource();
		dataSource.setJdbcUrl("jdbc:hsqldb:mem:test");
		dataSource.setUsername("sa");
		dataSource.setPassword("");
		return dataSource;

	}

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(
			DataSource dataSource) {
		LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
		emf.setDataSource(dataSource);
		Properties jpaProperties = new Properties();
		jpaProperties.put("hibernate.hbm2ddl.auto", "create-drop");
		jpaProperties.put("hibernate.show_sql", "true");
		emf.setJpaProperties(jpaProperties);
		emf.setPackagesToScan("com.mtcl.sitemonitoring.entity");
		emf.setPersistenceProvider(new HibernatePersistenceProvider());
		return emf;
	}
	
	@Bean
	public JpaTransactionManager transactionManager(DataSource dataSource, EntityManagerFactory emf){
		JpaTransactionManager transactionManager = new JpaTransactionManager(emf);
		transactionManager.setDataSource(dataSource);
		return transactionManager;
	}
}
