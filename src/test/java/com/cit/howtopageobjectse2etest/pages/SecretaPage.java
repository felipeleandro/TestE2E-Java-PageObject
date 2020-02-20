package com.cit.howtopageobjectse2etest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecretaPage extends BasePage {

    public SecretaPage(WebDriver navegador)
    {
        super(navegador);
    }

    public MePage clicarLinkMe() throws Exception {
        Thread.sleep(500);
        navegador.findElement(By.xpath("/html/body/nav/div/div/ul[1]/li[1]/a")).click();

        return new MePage(navegador);
    }
}
