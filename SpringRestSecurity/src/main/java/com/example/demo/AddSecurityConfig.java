package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

//@Configurable
@EnableWebSecurity
public class AddSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		auth.inMemoryAuthentication().withUser("seed")
				.password("$2a$10$4pd58WuiFe21pHObEQuMWeRswLmH7CPuznBTqUGwuRQw6soMi6wHW").roles("ADMIN");
	}

	@Bean
	public PasswordEncoder encoder() {
		return new BCryptPasswordEncoder();
	}

	
//	  @Bean
//	  
//	  @Override public UserDetailsService userDetailsService() { List<UserDetails>
//	  user=new ArrayList<>();
//	  user.add(User.withDefaultPasswordEncoder().username("khimam").password("k123"
//	  ).roles("USER").build()); return new InMemoryUserDetailsManager(user); }
//	 
}
