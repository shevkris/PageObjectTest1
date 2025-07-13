
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BaseTest{
    private final static String BASE_URL = "https://google.com/";
    private final String SEARCH_TEXT = "Привет";
    // @BeforeAll
//    public static void beforeAll(){
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--start-maximized");
//        options.addArguments("--disable-extensions");
//        options.addArguments("--no-sandbox");
//        WebDriver driver = new ChromeDriver(options);
//    }

    @Test
    public void search(){
        //Поиск
        MainPage mainPage = new MainPage(BASE_URL);
        mainPage.searchGoogle(SEARCH_TEXT);

        //Проверка, что результат поиска не пустой
        SearchPage searchPage = new SearchPage();

        assertTrue(searchPage.isSuccessSearchIndicatorDisplayed());
        assertEquals("Словарь", searchPage.getWelcomeMessage());

        //Переход на табу "Картинки" и проверка, что она не пустая
        searchPage.openPicTab();

        PicturePage picturePage = new PicturePage();

        assertTrue(picturePage.isPictureElementDisplayed());

    }




}