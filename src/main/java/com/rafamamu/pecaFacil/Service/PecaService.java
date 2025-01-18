package com.rafamamu.pecaFacil.Service;

import com.rafamamu.pecaFacil.Model.PecaModel;
import com.rafamamu.pecaFacil.Repository.PecaRepository;
import org.springframework.stereotype.Service;

@Service
public class PecaService {

    private PecaRepository pecaRepository;


    public PecaModel savePeca(PecaModel pecaModel) {
        return pecaRepository.save(pecaModel);
    }




}
