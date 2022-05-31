package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {
    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("yarus.ru")
    void generatedTest() {
        step("открыть https://yarus.ru/", () -> {
            step("// todo: just add selenium action");
        });

        step("В поле поиска ввести рыба", () -> {
            step("// todo: just add selenium action");
        });

        step("проверить что открылась страница с словом рыба", () -> {
            step("// todo: just add selenium action");
        });

        step("открыть вкладку https://yarus.ru/news/trends", () -> {
            step("// todo: just add selenium action");
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://yarus.ru/'", () ->
            open("https://yarus.ru/"));

        step("Page title should have text 'ЯRUS'", () -> {
            String expectedTitle = "ЯRUS";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://yarus.ru/'", () ->
            open("https://yarus.ru/"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}