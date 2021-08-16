package helpers;

import pages.HeaderPage;

public class HeaderHelper {
    private static HeaderPage headerPage = new HeaderPage();

    public void search(String searchText) {
        headerPage.getSearchInput().sendKeys(searchText);
        headerPage.getSearchButton().click();
    }
}
