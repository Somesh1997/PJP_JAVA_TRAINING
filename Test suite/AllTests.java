package suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ Demo1Test.class, EmployeeTest.class, TestDemo2.class })
public class AllTests {

}
