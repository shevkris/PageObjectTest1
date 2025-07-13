import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class SearchPage {

    private final SelenideElement successSearchIndicator = $x("//*[@class='mgAbYb RES9jf IFnjPb JGD2rd']");
    private final SelenideElement picButton = $x("//*[@class='YmvwI'][contains(text(), 'Картинки')]");

    public String getWelcomeMessage() {
        return successSearchIndicator.getText();
    }

    public boolean isSuccessSearchIndicatorDisplayed(){
        return successSearchIndicator.isDisplayed();
    }

    public void openPicTab(){
        picButton.click();
    }

}
