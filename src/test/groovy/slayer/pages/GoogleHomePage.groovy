package slayer.pages

import geb.Page

class GoogleHomePage extends Page {
    static url = "http://google.com/?complete=0"

    static at = { title == "Google" }

    static content = {
        searchField { $("input[name=q]") }
        searchButton(to: GoogleResultsPage) { $("input[value='Google Search']") }
    }

    void search(String searchTerm) {
        searchField.value searchTerm
        searchButton.click()
    }
}
