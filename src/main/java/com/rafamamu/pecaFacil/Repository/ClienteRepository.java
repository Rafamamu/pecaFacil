package com.rafamamu.pecaFacil.Repository;

import com.rafamamu.pecaFacil.Model.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<ClienteModel,String> {
}
