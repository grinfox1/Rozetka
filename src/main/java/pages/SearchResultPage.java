package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultPage extends BasePage {
    @FindBy(xpath = "//app-goods-tile-default/div/div/a/span")
    List<WebElement> searchResultList;

    public List<WebElement> getSearchResultList() {
        return searchResultList;
    }

    public void setSearchResultList(List<WebElement> searchResultList) {
        this.searchResultList = searchResultList;
    }
}
