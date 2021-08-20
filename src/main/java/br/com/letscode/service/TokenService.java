package br.com.letscode.service;

import br.com.letscode.entity.Usuario;
import br.com.letscode.repository.UsuarioRepository;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class TokenService {

    @Value("${config.token.secret}")
    private String secret;

    @Autowired
    UsuarioRepository usuarioRepository;

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

    public Optional<Usuario> getUser(String token) {
        Claims body = Jwts.parser().setSigningKey(this.secret).parseClaimsJws(token).getBody();
        Integer id = Integer.parseInt(body.getSubject());
        return usuarioRepository.findById(id);

    }
}
