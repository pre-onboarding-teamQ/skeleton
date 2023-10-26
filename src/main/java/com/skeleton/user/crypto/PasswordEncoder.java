package com.skeleton.user.crypto;

import org.springframework.security.crypto.scrypt.SCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class PasswordEncoder {

    private static final SCryptPasswordEncoder encoder = new SCryptPasswordEncoder(
            16,
            8,
            1,
            32,
            64);

    //암호화

    public String encrypt(String rawPassword) {
        return encoder.encode(rawPassword);
    }

    public boolean matches(String rawPassword, String encryptedPassword) {
        return encoder.matches(rawPassword, encryptedPassword);
    }
}
