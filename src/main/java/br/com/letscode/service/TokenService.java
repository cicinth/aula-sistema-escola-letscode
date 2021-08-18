package br.com.letscode.service;

import br.com.letscode.entity.Usuario;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class TokenService {

    @Value("${config.token.secret}")
    private String secret;

    public String gerarToken(Authentication authentication){
        Usuario user = (Usuario) authentication.getPrincipal();
        Date criacao = new Date();
        Date expiracao = new Date(criacao.getTime() + 1800000);

        return Jwts.builder().setIssuer("Lets code")
                .setSubject(user.getId().toString())
                .setIssuedAt(criacao)
                .setExpiration(expiracao)
                .signWith(SignatureAlgorithm.HS256, secret)
                .compact();
    }

    public boolean validarToken(String token){
        try {
            Jwts.parser().setSigningKey(this.secret).parseClaimsJws(token);
            return true;
        } catch (Exception e){
            return false;
        }
    }
}
