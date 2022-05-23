package kr.co.clozet.security.domain;

import lombok.RequiredArgsConstructor;
import lombok.Value;
import lombok.extern.java.Log;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

/**
 * packageName   :   kr.co.clozet.security.domain
 * fileName      :   SecurityProvider.java
 * author        :   Kimseunghyun
 * date          :   2022-05-23
 * desc          :
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-05-23       Kimseunghyun         최초 생성
 */
@Log
@Component
@RequiredArgsConstructor
public class SecurityProvider implements AuthenticationProvider {
    private final UserDetailsServiceImpl service;

    @Value("${security.jwt.token.security-key:secret-key}")
    private String securityKey;

    @Value("${security.jwt.token.expiration-length:3600000}")
    private long validityInMs = 3600000; //1h


    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        return null;
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return false;
    }
}
