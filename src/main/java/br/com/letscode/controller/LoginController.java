package br.com.letscode.controller;

import br.com.letscode.request.LoginRequest;
import br.com.letscode.response.LoginResponse;
import br.com.letscode.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private  TokenService tokenService;

    @PostMapping
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest user){
        UsernamePasswordAuthenticationToken login = new UsernamePasswordAuthenticationToken(user.getEmail(), user.getSenha());
        try {
            Authentication authentication = authenticationManager.authenticate(login);
            String tokeJwt = tokenService.gerarToken(authentication);
            return ResponseEntity.ok(new LoginResponse(tokeJwt, "Bearer"));
        }catch (AuthenticationException e){
            return ResponseEntity.badRequest().build();
        }
    }
}
