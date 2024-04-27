package com.e2etests.automation.step_definitions;

import org.junit.Assert;
import com.e2etests.automation.page_objects.LoginPageObject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {

	private LoginPageObject loginPageObject;

	public LoginStepDefinition() {
		loginPageObject = new LoginPageObject();
	}

	@Given("Je me connecte sur lapplication SWAGLABS")
	public void jeMeConnecteSurLapplicationSWAGLABS() {
		loginPageObject.connectToApplication();

	}

	@When("Je saisi le username {string}")
	public void jeSaisiLeUsername(String usr) {
		loginPageObject.saisiUserName(usr);
	}

	@When("Je clique sur le bouton login")
	public void jeCliqueSurLeBoutonLogin() {
		loginPageObject.clicBoutton();
	}

	@When("Je saisi le mot de passe {string}")
	public void jeSaisiLeMotDePasse(String pwd) {
		loginPageObject.saisiPasseword(pwd);

	}

	@Then("je me rederige vers la page daccueil {string}")
	public void jeMeRederigeVersLaPageDaccueil(String attendu) {
		String obtenu = LoginPageObject.title.getText();
		Assert.assertEquals(obtenu, attendu);

	}

	@When("Je clique sur le burger")
	public void jeCliqueSurLeBurger() throws InterruptedException {
		loginPageObject.clicMenu();
		Thread.sleep(3000);

	}

	@When("Je clique sur le Logout")
	public void jeCliqueSurLeLogout() {
		loginPageObject.logOut();
	}

	@Then("Un message derreur saffiche {string}")
	public void unMessageDerreurSaffiche(String msgattendu) {
		String msgobtenu = LoginPageObject.msgderreur.getText();
		Assert.assertEquals(msgobtenu, msgattendu);
	}

	@Then("je me suis deconnecte de lapplication et jai atterri sur la page de connexion.")
	public void jeMeSuisDeconnecteDeLapplicationEtJaiAtterriSurLaPageDeConnexion() {
		String Url = loginPageObject.verificationurl();
		Assert.assertEquals(Url, "https://www.saucedemo.com/");

	}

	@When("Je saisi le username")
	public void jeSaisiLeUsername() {
		loginPageObject.FillUsername();

	}

	@When("Je saisi le mot de passe")
	public void jeSaisiLeMotDePasse() {
		loginPageObject.FillPassword();

	}

}
