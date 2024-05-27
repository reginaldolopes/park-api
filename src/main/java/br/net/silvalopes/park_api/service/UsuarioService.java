package br.net.silvalopes.park_api.service;

import org.springframework.stereotype.Service;

import br.net.silvalopes.park_api.entity.Usuario;
import br.net.silvalopes.park_api.repository.UsuarioRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    @Transactional
    public Usuario salvar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

}
