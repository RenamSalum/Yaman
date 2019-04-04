Feature: Cadastro de novo usuário
 
Scenario Outline: Cadastro de novo usuário
Given Acessar o site: "<URL>"
When Na aba “Novo usuário” insira um nome "<Nome>"
And Na aba “Novo usuário” insira um e-mail "<Email>"
And Na aba “Novo usuário” insira a senha "<Senha>"
And Clique no botão “Cadastrar”
Then Validar texto “Usuário inserido com sucesso”
    
Examples:
|URL|Nome|Email|Senha|
|https://srbarriga.herokuapp.com/cadastro|Renam|renan_apolinario_1@hotmail.com|123456|


 
Scenario Outline: Acesso a conta
Given Acessar o site: "<URL>"
When Acessar aba Login
And Na aba “Novo usuário” insira um e-mail "<Email>"
And Na aba “Novo usuário” insira a senha "<Senha>"
And Clicar no botão “Entrar”
And Validar o texto “Bem vindo, + nomeInserido!” "<Nome>"
And Clicar em Sair;
Then Validar logout

Examples:
|URL|Nome|Email|Senha|
|https://srbarriga.herokuapp.com/cadastro|Renam|renan_apolinario_1@hotmail.com|123456|


Scenario Outline: Cadastro de conta
Given Acessar o site: "<URL>"
When Acessar aba Login
And Na aba “Novo usuário” insira um e-mail "<Email>"
And Na aba “Novo usuário” insira a senha "<Senha>"
And Clicar no botão “Entrar”
And Validar o texto “Bem vindo, + nomeInserido!” "<Nome>"
And Clicar no menu “Contas”
And Clicar no botão “Adicionar”
When Na aba “Novo usuário” insira um nome "<Nomenovo>"
And Clicar no botão “Salvar”
And Validar texto “Conta adicionada com sucesso!”
And Clicar em Sair;
Then Validar logout

|URL|Nome|Email|Senha|Nomenovo|
|https://srbarriga.herokuapp.com/cadastro|Renam|renan_apolinario_1@hotmail.com|123456|João|

 