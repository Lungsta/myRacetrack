package racetrack



import grails.test.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
//@TestFor(Race)
class RaceTests extends GrailsUnitTestCase {

    void testSomething() {
       fail "Implement me"
    }
	
	protected void setUp() {
		super.setUp()
		}
	protected void tearDown() {
		super.tearDown()
		}
	void testInMiles(){
			def race = new Race(distance: 5.0)
			assertEquals 3.107, race.inMIles()
		}
}
