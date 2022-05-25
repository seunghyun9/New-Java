package kr.co.clozet.user.domains;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * packageName:kr.co.clozet.user.domains
 * fileName        :UserDTO.java
 * author          : kimseunghyun
 * date            :2022-05-24
 * desc            :검증되지 않은 유저
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-24           kimseunghyun      최초 생성
 **/
@Component @Data
public class UserDTO {
    @ApiModelProperty(position = 1) private long userId;
    @ApiModelProperty(position = 2) String username;
    @ApiModelProperty(position = 3) String password;
    @ApiModelProperty(position = 4) String name;
    @ApiModelProperty(position = 5) String email;
    @ApiModelProperty(position = 6) private String regDate;
    @ApiModelProperty(position = 7) private String token;
    @ApiModelProperty(position = 8) private List<Role> roles;
}
