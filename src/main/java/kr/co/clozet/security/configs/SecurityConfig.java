package kr.co.clozet.security.configs;

import lombok.RequiredArgsConstructor;
import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.DefaultSecurityFilterChain;

/**
 * packageName   :   kr.co.clozet.config
 * fileName      :   SecurityConfig.java
 * author        :   Kimseunghyun
 * date          :   2022-05-23
 * desc          :
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-05-23       Kimseunghyun         최초 생성
 */
@RequiredArgsConstructor
public class SecurityConfig extends SecurityConfigurerAdapter<DefaultSecurityFilterChain, HttpSecurity> {
    @Override
    public void configure(HttpSecurity builder) throws Exception {
        super.configure(builder);
    }
}
