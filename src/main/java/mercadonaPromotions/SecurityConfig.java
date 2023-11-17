package mercadonaPromotions;

import java.net.URI;
import java.util.Collection;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;


@Configuration
@EnableWebSecurity
public class SecurityConfig {

private static final HttpSecurity SecurityContextHolder = null;

@Bean
	public PasswordEncoder passwordEncoder() {
	return new BCryptPasswordEncoder();
}
	
//Cette version utilise la mise en mémoire interne d'identifiants de connexion
@Bean
public InMemoryUserDetailsManager userDetailsService() {
	
	
	UserDetails admin = User.builder()
		.password(passwordEncoder().encode("adminPass"))
		.username("admin")
		.roles("ADMIN")
		.build();
	

return new InMemoryUserDetailsManager(admin);
}


@Bean
public SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {

http.authorizeHttpRequests((auth) -> auth

.requestMatchers("/**").permitAll()
.requestMatchers("/login", "/home").permitAll()
.requestMatchers("/dashboard").hasRole("ADMIN")


)


.formLogin(formLogin ->
formLogin
.defaultSuccessUrl("/dashboard", true)
.permitAll()
)

.logout(logout ->
logout
.permitAll()
);

return http.build();
}


	
}
