import org.openqa.selenium.*
import org.openqa.selenium.htmlunit.HtmlUnitDriver

description "Käyttäjä voi tallettaa viitteen artikkeliin"

scenario "Käyttäjä tallettaa viitteen, jossa on kaikki pakolliset viitteet", {
    given "Viitteenlisäyslomake on avattu", {
        driver = new HtmlUnitDriver()
        driver.get("http://localhost:7777/miniprojekti")
        elem = driver.findElement(By.id("add_article"))
        elem.click()
        
    }
    when "Kaikki viitteen pakolliset tiedot annetaan", {
        elem = driver.findElement(By.name("title"))
        elem.sendKeys("Go To Statement Considered Harmful")
        elem = driver.findElement(By.name("author0"))
        elem.sendKeys("Dijkstra, Edsger")
        elem = driver.findElement(By.name("publicationYear"))
        elem.sendKeys("1968")
        elem = driver.findElement(By.name("journal"))
        elem.sendKeys("Communications of the ACM")
        elem.submit()

    }
    then "Järjestelmä tallettaa viitteen onnistuneesti",{
	driver.get("http://localhost:7777/listaus");	
	driver.getPageSource().contains("Go To Statement Considered Harmful").shouldBe true        
    }
}

scenario "Käyttäjä tallettaa viitteen, josta puuttuu yksi pakollinen tieto", {
    given "Viitteenlisäyslomake on avattu", {
        driver = new HtmlUnitDriver()
        driver.get("http://localhost:7777/miniprojekti")
        elem = driver.findElement(By.id("add_article"))
        elem.click()
    }
    when "Jokin pakollinen kenttä on tyhjä", {
        elem = driver.findElement(By.name("title"))
        elem.sendKeys("Go To Statement Considered Harmful")
        elem = driver.findElement(By.name("author0"))
        elem.sendKeys("Edsger W. Dijkstra")
        elem = driver.findElement(By.name("publicationYear"))
        elem.sendKeys("1968");
        elem.submit()
    }
    then "Järjestelmä ei talleta viitettä, ja palauttaa käyttäjän lomakkeelle", {
        driver.getPageSource().contains("New/Edit entry (Article)").shouldBe true
    }
}
