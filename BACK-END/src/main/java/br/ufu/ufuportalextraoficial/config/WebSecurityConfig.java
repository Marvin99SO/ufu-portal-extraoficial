package br.ufu.ufuportalextraoficial.config;

import br.ufu.ufuportalextraoficial.services.UserDetailsServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
  
  @Bean
  public UserDetailsService userDetailsService() {
    return new UserDetailsServiceImpl();
  }
  
  @Bean
  public BCryptPasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  }
  
  @Bean
  public DaoAuthenticationProvider authenticationProvider() {
    DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
    authProvider.setUserDetailsService(userDetailsService());
    authProvider.setPasswordEncoder(passwordEncoder());
    
    return authProvider;
  }
  
  @Override
  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    auth.authenticationProvider(authenticationProvider());
  }
  
  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http.csrf().disable().authorizeRequests()
        .antMatchers("/api/home").permitAll()
        .antMatchers("/user/cadastrar").permitAll()
        .antMatchers("/user/").permitAll()
            //Classificados
        .antMatchers("/sales/").permitAll()
        .antMatchers("/sales/cadastrar").hasAnyAuthority("USER", "CREATOR", "EDITOR", "ADMIN")
        .antMatchers("/sales/editar").hasAnyAuthority("EDITOR", "ADMIN")
            //Noticias
        .antMatchers("/news/").permitAll()
        .antMatchers("/news/cadastrar").hasAnyAuthority("USER", "CREATOR", "EDITOR", "ADMIN")
        .antMatchers("/news/cadastrar").hasAnyAuthority("USER", "CREATOR", "EDITOR", "ADMIN")
            //Projetos
        .antMatchers("/projects/").permitAll()
        .antMatchers("/projects/cadastrar").hasAnyAuthority("USER", "CREATOR", "EDITOR", "ADMIN")
        .antMatchers("/projects/cadastrar").hasAnyAuthority("USER", "CREATOR", "EDITOR", "ADMIN")
            //Vagas
        .antMatchers("/jobs/").permitAll()
        .antMatchers("/jobs/cadastrar").hasAnyAuthority("USER", "CREATOR", "EDITOR", "ADMIN")
        .antMatchers("/jobs/cadastrar").hasAnyAuthority("USER", "CREATOR", "EDITOR", "ADMIN")
            //Demais rotas
        .antMatchers("/").hasAnyAuthority("USER", "CREATOR", "EDITOR", "ADMIN")
        .antMatchers("/new").hasAnyAuthority("ADMIN", "CREATOR")
        .antMatchers("/edit/**").hasAnyAuthority("ADMIN", "EDITOR")
        .antMatchers("/delete/**").hasAuthority("ADMIN")
        .antMatchers("/user/**").hasAuthority("ADMIN")
        .anyRequest().authenticated()
        .and()
//        .formLogin().permitAll()
        .httpBasic()
        .and()
        .logout().permitAll()
        .and()
        .exceptionHandling().accessDeniedPage("/403")
    ;
  }
}
