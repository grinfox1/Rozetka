package helpers;

import pages.SearchResultPage;

import java.util.List;
import java.util.stream.Collectors;

public class SearchResultHelper {
    SearchResultPage searchResultPage = new SearchResultPage();

    public List<String> getResultTitle() {
        return searchResultPage.getSearchResultList().stream().map(x -> x.getText()).collect(Collectors.toList());
    }
}
