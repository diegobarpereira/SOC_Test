package step_definitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.BlogPage;
import pages.BlogResultPage;

public class BlogSteps {
    BlogPage blogPage = new BlogPage();
    BlogResultPage blogResultPage = new BlogResultPage();

    @Dado("que estou na na pagina do Blog da SOC")
    public void que_estou_na_na_pagina_do_blog_da_soc() {
        blogPage.acessarBlogSOC();
    }

    @Dado("tenho um campo de busca")
    public void tenho_um_campo_de_busca() {
        blogPage.encontrarCampoDeBusca();
    }

    @Quando("eu procuro pelo texto {string}")
    public void eu_procuro_pelo_texto(String pesquisa) {
        blogPage.inserirTextoNoCampoDeBusca(pesquisa);
    }

    @Quando("clico no botao pesquisar")
    public void clico_no_botao_pesquisar() {
        blogPage.clicarNoBotaoPesquisar();
    }

    @Entao("e exibido o conteudo da minha busca")
    public void e_exibido_o_conteudo_da_minha_busca() {
        blogResultPage.verificarTextoProcurado();
    }
}
