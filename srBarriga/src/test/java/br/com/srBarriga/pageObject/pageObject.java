package br.com.srBarriga.pageObject;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class pageObject {
	
	@FindBy(name ="nome")
	private WebElement campoNome;
	
	@FindBy(name ="email")
	private WebElement campoEmail;
	
	@FindBy(id ="senha")
	private WebElement campoSenha;
	
	@FindBy(xpath ="//input[@value='Cadastrar']")
	private WebElement btnCadastrar;
	
	@FindBy(xpath ="//div[@class ='alert alert-success']")
	private WebElement alertaSucesso;
	
	@FindBy(xpath ="//a[@href ='/login']")
	private WebElement menuLogin;
	
	@FindBy(xpath ="//button[@type ='submit']")
	private WebElement btnEntrar;
	
	@FindBy(xpath ="//a[@href ='/login']")
	private WebElement btnLogout;
	
	
	public void preencherNome(String nome) {
		campoNome.sendKeys(nome);
	}
	
	public void preencherEmail(String email) {
		campoEmail.sendKeys(email);
	}
	
	public void preencherSenha(String senha) {
		campoSenha.sendKeys(senha);
	}

	public void clicarBtnCadastrar() {
		btnCadastrar.click();
	}
	
	public void ValidaMensagemSucesso() {
		Assert.assertTrue(alertaSucesso.getText().contains("Usuário inserido com sucesso"));
	}

	public void clicaAbaLogin() {
		menuLogin.click();
	}
	
	public void clicaBtnEntrar() {
		btnEntrar.click();
	}
	
	public void ValidaNome(String nome) {
		Assert.assertTrue(alertaSucesso.getText().contains(nome));
	}
	
	public void clicaBtnLogout() {
		btnLogout.click();
	}
	
}
