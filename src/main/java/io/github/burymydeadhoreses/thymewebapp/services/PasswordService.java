package io.github.burymydeadhoreses.thymewebapp.services;

import io.github.burymydeadhoreses.thymewebapp.exceptions.EmptyPasswordException;
import org.springframework.stereotype.Service;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

@Service
public class PasswordService {

    public String hash(String password) {

        if(password == null || password.isEmpty())
            throw new EmptyPasswordException("Password cannot be null or empty");

        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }

        byte[] hashedPassword = md.digest(password.getBytes());
        return Base64.getEncoder().encodeToString(hashedPassword);
    }
}
