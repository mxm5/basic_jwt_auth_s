package com.example.sayehwebservices.Config;

import com.example.sayehwebservices.services.UsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import java.util.regex.Pattern;


@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
@RequiredArgsConstructor
public class Security extends WebSecurityConfigurerAdapter {

    private final JwtFilter jwtFilter;
    private final UsersService userService;
    private final AuthenticationEntryPointHandler authenticationEntryPointHandler;
//    private final AccessDeniedResponseHandler accessDeniedResponseHandler;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .cors()
                .and()
                .authorizeRequests()
                .antMatchers(
                        "/api/v1/auth/register",
                        "/api/v1/auth/login",
//                      "/api/verification",
//                      "/api/signup",
//                      "/api/media/download/**",
//                      "/api/logout",
//                      "/api/v2/api-docs",
//                      "/api/configuration/ui",
//                      "/api/swagger-resources/**",
//                      "/api/configuration/security",
//                      "/api/swagger-ui.html",
                        "/api/webjars/**"
                ).permitAll()
                .antMatchers("/api/v1/chapar/secured").authenticated()
                .and()
                .exceptionHandling()
//                .accessDeniedHandler(accessDeniedResponseHandler)
                .authenticationEntryPoint(authenticationEntryPointHandler)
                .and()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and().addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userService).passwordEncoder(passwordEncoder());
    }



//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//        // configure AuthenticationManager so that it knows from where to load
//        // user for matching credentials
//        // Use BCryptPasswordEncoder
//        auth.userDetailsService(userService).passwordEncoder(passwordEncoder());
//    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Autowired
    UsersService usersService;

    @Bean
    public DaoAuthenticationProvider getAuthenticationProvider() {
        DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
        authenticationProvider.setUserDetailsService(usersService);
        authenticationProvider.setPasswordEncoder(passwordEncoder());
        return authenticationProvider;
    }


}

class testp {
    public static void main(String[] args) {


        Pattern BCRYPT_PATTERN = Pattern.compile("\\A\\$2(a|y|b)?\\$(\\d\\d)\\$[./0-9A-Za-z]{53}");
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String encode = bCryptPasswordEncoder.encode("123456789");
        boolean matches = BCRYPT_PATTERN.matcher(encode).matches();


        String s = "$2a$10$acSEDlTWcSfRJODehRBkD.cl8HvgPAmcywEt6gm8JsFK0ZtfcM6GG";
        boolean m = BCRYPT_PATTERN.matcher(encode).matches();
        System.out.println(m);
        System.out.println(encode);
        System.out.println(matches);

    }
}