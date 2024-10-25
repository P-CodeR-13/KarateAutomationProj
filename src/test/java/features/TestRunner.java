package features;

import com.intuit.karate.junit5.Karate;

class TestRunner {
    
    @Karate.Test
    Karate testRunner() {
        return Karate.run().tags("@TestGitHub").relativeTo(getClass());
    }    

}
