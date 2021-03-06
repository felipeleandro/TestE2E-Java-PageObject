package com.cit.howtopageobjectse2etest.testes;

import com.cit.howtopageobjectse2etest.pages.LoginPage;
import com.cit.howtopageobjectse2etest.suporte.Navegador;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class TaskIt {

    private WebDriver navegador;

    @Before
    public void before () {
        this.navegador = Navegador.criarNavegador();
    }

    @Test
    public void addMaisInformacoes () throws Exception {
        this.navegador.get("http://www.juliodelima.com.br/taskit");

        String textoToast = new LoginPage(navegador)
                .clicarSignIn()
                .digitarLogin("julio0001")
                .digitarSenha("123456")
                .clicarSignIn()
                .clicarLinkMe()
                .clicarAbaMoreData()
                .clicarAddMoreData()
                .digitarComboBox("phone")
                .digitarTelefone("5511999999999")
                .clicarSalvar();

        Assert.assertEquals("Your contact has been added!", textoToast);
    }

    @After
    public void after () {
        this.navegador.quit();
    }
}
