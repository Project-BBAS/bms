package com.bbas.bms.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.csrf.HttpSessionCsrfTokenRepository;
import static org.springframework.security.web.util.matcher.AntPathRequestMatcher.antMatcher;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf
                        .csrfTokenRepository(new HttpSessionCsrfTokenRepository()) // 기본 세션 기반 CSRF 토큰 저장소 사용
                )
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers(antMatcher("/login"), antMatcher("/register")).permitAll() // 로그인 및 회원가입 페이지는 인증 없이 접근 허용
                        .anyRequest().authenticated() // 그 외의 요청은 인증된 사용자만 접근 가능
                )
                .formLogin(formLogin -> formLogin
                        .permitAll() // 기본 폼 로그인 설정
                ); 

        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}