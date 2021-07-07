package step_definitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.HomePage;
import pages.RedeCredPage;
import pages.SocNetPage;

public class HomeSteps {
    HomePage homePage = new HomePage();
    SocNetPage socNetPage = new SocNetPage();
    RedeCredPage redeCredPage = new RedeCredPage();

    @Dado("que estou na na pagina principal da SOC")
    public void que_estou_na_na_pagina_principal_da_soc() {
        homePage.acessarPaginaPrincipal();
        homePage.clicarEmAceitarCookies();
    }

    @Dado("clico no link da SOCNET")
    public void clico_no_link_da_socnet() {
        homePage.clicarNoLinkSocNet();
    }

    @Dado("sou redirecionado para a pagina da SOCNET")
    public void sou_redirecionado_para_a_pagina_da_socnet() {
        socNetPage.verificarTextoPaginaSocNet();
    }

    @Dado("clico no link Buscar credenciados")
    public void clico_no_link_buscar_credenciados() {
        socNetPage.clicarNoLinkBuscarCredenciados();
    }

    @Quando("eu digito o CEP {string}")
    public void euDigitoOCEP(String cep) {
        redeCredPage.inserirCEPValido(cep);
    }

    @Quando("clico no botao Pesquisar")
    public void clicoNoBotaoPesquisar() {
        redeCredPage.clicarNoBotaoPesquisar();
    }

    @Entao("e exibido o conteudo da minha busca dos prestadores credenciados")
    public void eExibidoOConteudoDaMinhaBuscaDosPrestadoresCredenciados() {
        redeCredPage.verificarPrestadorCredenciado();
    }
}
