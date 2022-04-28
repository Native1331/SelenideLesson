import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.files.DownloadActions.click;

public class SearchForSoftAssertionsTest {
    @Test
    void shouldFindSoftAssertionsPage() {
        //Откройте страницу Selenide в Github
        open("https://github.com/selenide/selenide");
        //Перейти в раздел Wiki проекта
        $("#repository-container-header").$("#wiki-tab").pressEnter();
        //Убедится, что в списке страниц (Pages) есть страница SoftAssertions
        $(".markdown-body").shouldHave(Condition.text("Soft assertions"));
        //Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5**/
        $(".markdown-body").$(byText("Soft assertions")).click();
        $(".markdown-body").shouldHave(Condition.text("JUnit5"));
    }


/**





 - Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5**/
}
