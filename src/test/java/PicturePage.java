import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class PicturePage {
    private final SelenideElement pictureElement = $x("//*[@class='H8Rx8c']");

    public boolean isPictureElementDisplayed(){
        return pictureElement.isDisplayed();
    }

}
