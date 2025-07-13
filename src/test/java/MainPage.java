import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class MainPage {

    private final SelenideElement searchBar = $x("//*[@name='q']");

    public MainPage(String url) {
        Selenide.open(url);
    }

    public void searchGoogle(String searchText){
        searchBar.setValue(searchText).pressEnter();
    }

    public void openWebSite (String url){
        Selenide.open(url);
    }
}
