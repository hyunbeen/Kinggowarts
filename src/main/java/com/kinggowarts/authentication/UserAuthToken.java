package com.kinggowarts.authentication;

import java.util.Collection;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

@Data
public class UserAuthToken {

    private String userId;
    private Long memberSeq;
    private Collection<? extends GrantedAuthority> authorities;
    private String token;
    private String nickname;
    private Character type;


    public UserAuthToken(String username, Collection<? extends GrantedAuthority> collection, String token, String nickname, Character type, Long memberSeq) {
        this.userId = username;
        this.authorities = collection;
        this.token = token;
        this.nickname = nickname;
        this.type = type;
        this.memberSeq = memberSeq;
    }
}