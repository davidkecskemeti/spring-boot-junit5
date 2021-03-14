#JUnit 5

##@Test annotation
@Test annoation is applied over methods to mark them as test methods.
It is present in org.junit.jupiter.api

###Assertions
assertTrue
assertFalse
assertNull
assertNotNull
assertEquals
assertNotEqual
assertArrayEquals
assertIterableEquals
assertTimeout
assertTimeoutPreemptively
(difference between Timeout and TimeoutP... is that TimeoutP will stops the thread)
assertThrows
@DisplayName
@Disabled

###Assumption
Assumptions are preconditions that need to be satisfied to run subsequest assertions in test
If the assumptions are not satisfied then, TestAbortedException is thrown and test is skipped
assumeTrue
assumeFalse
assumeThat
Takes in two things boolean assuption and an Executable
If the assumption condition is true then it executes the supplied executable

###TestInstance Lifecycle
IT has two modes
   * @TestInstance(Lifecycle.PER_METHOD) If @TestInstance is not
    declared on a test class, the lifecycle mode will implicitly
    default to PER_METHOD. In this mode JUnit creates a new instance
    of test class before executing each test method
    
   * @TestInstance(Lifecycle.PER_CLASS) In this mode JUnit creates
    a new isntance test class only once
     
The lifecycle hooks are:
Constructor
@BeforeAll
@AfterAll
@BeforeEach
@AfterEach


###Parameterized tests
Allow developer to run same tests multiple times with different arguments
@ParameterizedTest annotation
We need to provide a source which is simply collection of different arguments
Types of Sources:
* @ValueSource: allows passing of different values in form of an array
* @NullSource, @EmptySource and NUllAndEmptySource
* @EnaumSource
* @MethodSource
* @CsvSource
* @CsvFileSource

###Repeated Tests in JUnit 5
Ability to repat a test by specified number of times
@RepeatTest

###Conditional Test Execution
Allows to disable tests based on cretain conditions
DisabledCondition is built in condition taht supports @Disabled annotiatoon
JUnit jupiter supports many other annotation based conditions preset in package
org.junit.jupiter.api.condition
For isntance: Operation System Condition, Java RuntimeEnviromentCOnditions, SystemPropertyCondition
etc..

###Dynamic test
Generated during runtime.
These dynamic tests are genenrated by factory method annotated with @TestFactory
and must return a single DynamicNode or Stream Colleantion, Iterator, Iterable or Array of
DynamicNode instances. In anything else in return JUnitException is thrown.
Consists of two parts - displayName and Executable
Those not support lifecycle methods

###Maven
