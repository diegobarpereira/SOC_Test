#language: pt

Funcionalidade: Buscar credenciado

  Cenario: Visualizar prestadores na rede credenciada da SOC
    Dado que estou na na pagina principal da SOC
    E clico no link da SOCNET
    E sou redirecionado para a pagina da SOCNET
    E clico no link Buscar credenciados
    Quando eu digito um CEP valido
    E clico no botao Pesquisar
    Entao e exibido o conteudo da minha busca dos prestadores credenciados