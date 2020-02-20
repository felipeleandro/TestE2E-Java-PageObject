package com.cit.howtopageobjectse2etest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AddContactPage extends BasePage  {

    public AddContactPage(WebDriver navegador) {
        super(navegador);
    }

    public AddContactPage digitarComboBox(String type) {
        navegador.findElement(By.id("addmoredata")).findElement(By.name("type")).sendKeys(type);

        return this;
    }

    public AddContactPage digitarTelefone(String phone) {
        navegador.findElement(By.id("addmoredata")).findElement(By.name("contact")).sendKeys(phone);

        return this;
    }

    public String clicarSalvar() {
        navegador.findElement(By.id("addmoredata")).findElement(By.xpath("/html/body/div[2]/div[2]/a")).click();

        return navegador.findElement(By.xpath("//*[@id=\"toast-container\"]/div")).getText();
    }


}
