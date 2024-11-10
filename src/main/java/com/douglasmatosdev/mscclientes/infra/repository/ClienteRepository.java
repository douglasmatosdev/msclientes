package com.douglasmatosdev.mscclientes.infra.repository;

import com.douglasmatosdev.mscclientes.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
