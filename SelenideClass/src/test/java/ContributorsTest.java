import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class ContributorsTest {
    @Test
    void solntsevShouldBeFirstConstributor() {
        //open repository page
        open("https://github.com/selenide/selenide");
        //bring mouse over the first avatar on contributors tab
        $(".Layout-sidebar").$(byText("Contributors")).ancestor("div")
             .$$("ul li").first().hover();
        $$("Popover-message").findBy(Condition.visible).shouldHave(text("Andrey Solntsev"));
        sleep(5000);


        //check: popup is showing Andrey Solntsev


    }
//private  void  open (String)
}

