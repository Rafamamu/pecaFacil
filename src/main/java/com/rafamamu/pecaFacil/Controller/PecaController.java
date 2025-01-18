package com.rafamamu.pecaFacil.Controller;

import com.rafamamu.pecaFacil.Model.PecaModel;
import com.rafamamu.pecaFacil.Service.PecaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/pecas")
public class PecaController {

    @Autowired
    private PecaService pecaService;






}
