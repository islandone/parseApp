/*
 * This Spock specification was auto generated by running the Gradle 'init' task
 * by 'holiday' at '16-7-8 下午10:53' with Gradle 2.12
 *
 * @author holiday, @date 16-7-8 下午10:53
 */

import spock.lang.Specification

class LibraryTest extends Specification{
    def "someLibraryMethod returns true"() {
        setup:
        Test lib = new Test()
        when:
        def result = lib.someLibraryMethod()
        then:
        result == true
    }
}