package br.net.silvalopes.park_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.net.silvalopes.park_api.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
