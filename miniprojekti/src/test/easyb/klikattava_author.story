import org.openqa.selenium.*
import org.openqa.selenium.htmlunit.HtmlUnitDriver

description "Käyttäjä voi hakea tietyn authorin viitteet klikkaamalla authoria"

scenario "Kaksi viitettä klikatulta authorilta", {
    given "Talletettuna on yksi artikkeli authorilta Xxx, Yyy ja yksi artikkeli authoreilta Xxx, Yyy ja Sss, Ttt", {
        driver = new HtmlUnitDriver()

        driver.get("http://localhost:7777/miniprojekti")
        elem = driver.findElement(By.id("add_article"))
        elem.click()
        elem = driver.findElement(By.name("title"))
        elem.sendKeys("title1")
        elem = driver.findElement(By.name("author0"))
        elem.sendKeys("Xxx, Yyy")
        elem = driver.findElement(By.name("publicationYear"))
        elem.sendKeys("2000")
        elem = driver.findElement(By.name("journal"))
        elem.sendKeys("journal1")
        elem.submit()

        driver.get("http://localhost:7777/miniprojekti")
        elem = driver.findElement(By.id("add_article"))
        elem.click()
        elem = driver.findElement(By.name("title"))
        elem.sendKeys("title2")
        elem = driver.findElement(By.name("author0"))
        elem.sendKeys("Xxx, Yyy")
        elem = driver.findElement(By.name("author1"))
        elem.sendKeys("Sss, Ttt")
        elem = driver.findElement(By.name("publicationYear"))
        elem.sendKeys("2002")
        elem = driver.findElement(By.name("journal"))
        elem.sendKeys("journal2")
        elem.submit()

        
    }
    when "Käyttäjä klikkaa authoria Xxx, Yyy", {
        driver.get("http://localhost:7777/miniprojekti")
        driver.findElement(By.id("listing")).click()
        driver.findElement(By.linkText("Xxx, Yyy")).click()

    }
    then "Käyttäjä näkee molemmat artikkelit",{
        driver.getPageSource().contains("title1").shouldBe true
        driver.getPageSource().contains("title2").shouldBe true
    }

}

scenario "Yksi viite klikatulta authorilta", {
    given "Talletettuna on yksi artikkeli authorilta Xxx, Yyy ja yksi artikkeli authoreilta Xxx, Yyy ja Sss, Ttt", {
        driver = new HtmlUnitDriver()
        //viitteet talletettu edellisessä scenariossa
    }
    when "Käyttäjä klikkaa authoria Sss, Ttt", {
        driver.get("http://localhost:7777/miniprojekti")
        driver.findElement(By.id("listing")).click()
        driver.findElement(By.linkText("Sss, Ttt")).click()

    }
    then "Käyttäjä näkee vain toisen artikkelin",{
        System.out.println(driver.getPageSource())
        driver.getPageSource().contains("title1").shouldNotBe true
        driver.getPageSource().contains("title2").shouldBe true
    }

}

