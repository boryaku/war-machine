package slayer

import geb.junit4.GebReportingTest
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import slayer.pages.GoogleHomePage
import slayer.pages.GoogleResultsPage



@RunWith(JUnit4)
class WarMachineTest extends GebReportingTest {

    final Logger log = LoggerFactory.getLogger(WarMachineTest.class);

    Random rand = new Random()

    String[] keywords = ["ji jitsu portland",
                         "jiu jitsu portland",
                         "muy thai portland",
                         "muay thai portland",
                         "martial arts portland",
                         "boxing portland"
                        ]

    @Test
    void run() {
        UUID id = UUID.randomUUID()
        log.info("processing begins id=${id}");

        to GoogleHomePage

        search keywords[rand.nextInt(keywords.length)]

        at GoogleResultsPage

        result(0).click()
    }

}
