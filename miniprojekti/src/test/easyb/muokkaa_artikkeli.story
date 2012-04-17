import org.openqa.selenium.*
import org.openqa.selenium.htmlunit.HtmlUnitDriver

description "Käyttäjä voi muokata artikkeli-viitettä"

scenario "Käyttäjä muokkaa viitettä", {
    given "Talletettuna on yksi artikkeli", {
        driver = new HtmlUnitDriver()
        driver.get("http://localhost:8080/miniprojekti")
        elem = driver.findElement(By.id("add_article"))
        elem.click()
        elem = driver.findElement(By.name("title"))
        elem.sendKeys("Go To Statement Considered Harmful")
        elem = driver.findElement(By.name("author"))
        elem.sendKeys("Dijkstra, Edsger")
        elem = driver.findElement(By.name("publicationYear"))
        elem.sendKeys("968")
        elem = driver.findElement(By.name("journal"))
        elem.sendKeys("Communications of the ACM")
        elem.submit()
        
    }
    when "Käyttäjä muokkaa viitettä", {
        driver.get("http://localhost:8080/miniprojekti")
        driver.findElement(By.id("listing")).click()
        count = driver.findElements(By.linkText("edit")).size()
        driver.findElement(By.linkText("edit")).click()
        
        elem = driver.findElement(By.name("author"))
        elem.sendKeys("muutos")
        elem.submit()
        //System.out.println(driver.getPageSource())

    }
    then "Järjestelmä tallettaa muokkauksen onnistuneesti eikä luo kloonia",{
        driver.findElement(By.id("listing")).click()
        newCount = driver.findElements(By.linkText("edit")).size()
        (newCount==count).shouldBe true
        driver.getPageSource().contains("muutos").shouldBe true        
    }
}

