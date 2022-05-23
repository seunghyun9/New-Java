package kr.co.clozet.security.domain;

import lombok.Builder;
import lombok.Getter;


/**
 * packageName   :   kr.co.clozet.security.domain
 * fileName      :   Messenger.java
 * author        :   Kimseunghyun
 * date          :   2022-05-23
 * desc          :
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-05-23       Kimseunghyun         최초 생성
 */

@Getter
@Builder
public class Messenger {
    private String message, code;
    private int status;
}
