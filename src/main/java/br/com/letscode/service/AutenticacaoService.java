package br.com.letscode.service;

import br.com.letscode.entity.Usuario;
import br.com.letscode.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AutenticacaoService implements UserDetailsService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
       Usuario user =  usuarioRepository.findByEmail(email).orElseThrow(() -> new UsernameNotFoundException("email nao encontrado"+email));
       return  user;
    }
}
