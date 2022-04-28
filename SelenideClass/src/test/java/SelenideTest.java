import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static java.lang.Thread.sleep;

public class SelenideTest {

    @Test
    void shouldFindSelenideAsFirstRepository() throws InterruptedException {
        //открыть страницу github.com
        open("https://github.com");
        //ввести в поле поиска selenide и нажать Enter
        $("[data-test-selector=nav-search-input]").setValue("selenide").pressEnter();
        sleep(5000);
        //нажать на линк от первого результата поиска
        $$("ul.repo-list li").first().$("a").click();
        //проверка:
        $("h2").shouldHave(Condition.text("selenide / selenide"));
    }
}
