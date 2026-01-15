package br.com.gustavoInagaki.CadastroPessoas.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class CadastroController {


    @GetMapping("/boasVindas")
    public String boasVindas(){
        return "Olá galera.";
    }

}
