//package rest.API.security;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@EnableWebSecurity
//public class userSecurity extends WebSecurityConfigurerAdapter {
//
//    //method to enable Authorization specify mapping of path to role
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//http.authorizeRequests()
//        .antMatchers("/admin").hasRole("ADMIN").
//        antMatchers("/user").hasAnyRole("USER","ADMIN").
//        antMatchers("/").permitAll()
//        .and().formLogin();
//
//    }
//
//    @Bean
//    PasswordEncoder passwordEncoder(){
////        return new BCryptPasswordEncoder();
//        return NoOpPasswordEncoder.getInstance();
//    }
//
//
//    //in Memory Authentication method to configure authentication
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//       //set configurations
//        auth.inMemoryAuthentication()
//                .withUser("user")
//                .password("password")
//                .roles("USER")
//                .and()
//                .withUser("foo")
//                .password("foo")
//                .roles("ADMIN");
//    }
//}
