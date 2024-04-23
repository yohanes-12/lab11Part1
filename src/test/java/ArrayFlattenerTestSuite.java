import org.junit.platform.suite.api.Suite;

import org.junit.platform.suite.api.SelectClasses;

import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SelectClasses({ArrayFlattenerTest.class, ArrayFlutternNullTest.class})
@SuiteDisplayName("ArrayFlattener Test Suite")
public class ArrayFlattenerTestSuite {}