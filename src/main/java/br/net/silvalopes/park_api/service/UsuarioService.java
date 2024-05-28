package br.net.silvalopes.park_api.service;

import java.util.List;
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

    public Usuario buscarPorId(Long id) {
        return usuarioRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Usuário não encontrado."));
    }

    @Transactional
    public Usuario editarSenha(Long id, String password) {
        Usuario usuario = buscarPorId(id);
        usuario.setPassword(password);
        return usuario;
    }

    public List<Usuario> buscarTodos() {
        return usuarioRepository.findAll();
    }

}
