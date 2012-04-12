import org.openqa.selenium.*
import org.openqa.selenium.htmlunit.HtmlUnitDriver

description "Käyttäjä voi tallettaa viitteen artikkeliin"

scenario "Käyttäjä tallettaa viitteen, jossa on kaikki pakolliset viitteet", {
    given "Viitteenlisäyslomake on avattu", {
        driver = new HtmlUnitDriver()
        driver.get("http://localhost:8084/miniprojekti/home")
        elem = driver.findElement(By.linkText("Lisää artikkeli"))
        elem.click()
    }
    when "Kaikki viitteen pakolliset tiedot annetaan", {
        elem = driver.findElement(By.name("title"))
        elem.sendKeys("Go To Statement Considered Harmful")
        elem = driver.findElement(By.name("author"))
        elem.sendKeys("Edsger W. Dijkstra")
        elem = driver.findElement(By.name("publicationYear"))
        elem.sendKeys("1968")
        elem = driver.findElement(By.name("publisher"))
        elem.sendKeys("ACM")
        elem = driver.findElement(By.name("journal"))
        elem.sendKeys("Communications of the ACM")
        elem.submit()
    }
    then "Järjestelmä tallettaa viitteen onnistuneesti"
}

scenario "Käyttäjä tallettaa viitteen, josta puuttuu yksi pakollinen tieto", {
    given "Viitteenlisäyslomake on avattu", {
        driver = new HtmlUnitDriver()
        driver.get("http://localhost:8084/miniprojekti/home")
        elem = driver.findElement(By.linkText("Lisää artikkeli"))
        elem.click()
    }
    when "Jokin pakollinen kenttä on tyhjä", {
        elem = driver.findElement(By.name("title"))
        elem.sendKeys("Go To Statement Considered Harmful")
        elem = driver.findElement(By.name("author"))
        elem.sendKeys("Edsger W. Dijkstra")
        elem = driver.findElement(By.name("publicationYear"))
        elem.sendKeys("1968")
        elem = driver.findElement(By.name("publisher"))
        elem.sendKeys("ACM")
        elem.submit()
    }
    then "Järjestelmä ei talleta viitettä, ja palauttaa käyttäjän lomakkeelle", {
        driver.getPageSource().contains("Uusi viite").shouldBe true
    }
}
