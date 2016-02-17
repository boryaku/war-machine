package slayer.pages

import geb.Page
import org.openqa.selenium.JavascriptExecutor

class GoogleResultsPage extends Page {
    static at = { waitFor { title.endsWith("Google Search") } }
    static content = {
        results {
            $(".ads-ad", text: contains('nwfighting.com')).find("a")[1]
        }
        result {index -> results[index]
        }
    }
}
