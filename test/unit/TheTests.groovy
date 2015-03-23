import spock.lang.Specification

class TheTests extends Specification {

	def 'the test'() {
		when:
			int x = 1
		then:
			x == 1
	}
}
