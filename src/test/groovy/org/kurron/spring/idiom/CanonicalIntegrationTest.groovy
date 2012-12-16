package org.kurron.spring.idiom

import org.junit.Test
import org.springframework.beans.factory.annotation.Value
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests

/**
 * A prototypical Spring integration test.
 */
@ContextConfiguration
class CanonicalIntegrationTest extends AbstractJUnit4SpringContextTests {

    @Value( "#{example.qb}" )
    private String message

    @Test
    public void given_when_then() {
        println message
    }
}
