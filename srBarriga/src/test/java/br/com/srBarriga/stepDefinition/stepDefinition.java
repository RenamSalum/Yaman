package br.com.srBarriga.stepDefinition;

import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import br.com.srBarriga.pageObject.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;

public class stepDefinition {
	
	private WebDriver driver;
	
	@Steps
	pageObject step;
	
	@Before
	public void beforeTest(WebDriver driver) {
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		this.driver = driver;
		driver.manage().window().maximize();
	}
	
	@After
	public void afterTest() {
		driver.close();
	}
	
	
	@Given("Acessar o site: {string}")
	public void acessar_o_site(String url) {
	    driver.get(url);
	}

	@When("Na aba “Novo usuário” insira um nome {string}")
	public void na_aba_Novo_usuário_insira_um_nome(String nome) {
	    step.preencherNome(nome);
	}

	@When("Na aba “Novo usuário” insira um e-mail {string}")
	public void na_aba_Novo_usuário_insira_um_e_mail(String email) {
	    step.preencherEmail(email);	    
	}

	@When("Na aba “Novo usuário” insira a senha {string}")
	public void na_aba_Novo_usuário_insira_a_senha(String senha) {
	    step.preencherSenha(senha);	    
	}

	@When("Clique no botão “Cadastrar”")
	public void clique_no_botão_Cadastrar() {
	    step.clicarBtnCadastrar();
	    
	}

	@Then("Validar texto “Usuário inserido com sucesso”")
	public void validar_texto_Usuário_inserido_com_sucesso() throws IOException {
	    step.ValidaMensagemSucesso();
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("screenshot.png"));
	}
    
	@When("Acessar aba Login")
	public void acessar_aba_Login() {
		step.clicaAbaLogin();
	}

	@When("Clicar no botão “Entrar”")
	public void clicar_no_botão_Entrar() {
		step.clicaBtnEntrar();
	}

	@When("Validar o texto “Bem vindo, + nomeInserido!” {string}")
	public void validar_o_texto_Bem_vindo_nomeInserido(String nome) throws IOException {
		step.ValidaNome(nome);
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("screenshot2.png"));
	}

	@When("Clicar em Sair;")
	public void clicar_em_Sair() {
		step.clicaBtnLogout();
	}

	
	
	
	@Then("Validar logout")
	public void validar_logout() {

	}
	

}
