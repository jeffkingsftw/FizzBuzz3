package Intersection;

import static Intersection.StringConstants.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FizzBuzz3Test {

    /**
     * Tests to validate the isMultipleOfThree() method
     * For any number n should return true if
     * the number is a multiple of 3
     * Examples:
     *  3 => true
     *  -3 => true
     *  15 => true
     *  0 => false
     *  5 => false
     */
    @Test
    public void whenMultipleOfThree() {
        FizzBuzz3 fb1 = new FizzBuzz3( 0, 0 );
        boolean result = false;

        int num = -33;
        result = fb1.isMultipleOfThree( num );
        assertEquals( true, result );

        num = -30;
        result = fb1.isMultipleOfThree( num );
        assertEquals( true, result );

        num = -20;
        result = fb1.isMultipleOfThree( num );
        assertEquals( false, result );

        num = -15;
        result = fb1.isMultipleOfThree( num );
        assertEquals( true, result );

        num = -9;
        result = fb1.isMultipleOfThree( num );
        assertEquals( true, result );

        num = -5;
        result = fb1.isMultipleOfThree( num );
        assertEquals( false, result );

        num = -3;
        result = fb1.isMultipleOfThree( num );
        assertEquals( true, result );

        num = -1;
        result = fb1.isMultipleOfThree( num );
        assertEquals( false, result );

        num = 0;
        result = fb1.isMultipleOfThree( num );
        assertEquals( false, result );

        num = 1;
        result = fb1.isMultipleOfThree( num );
        assertEquals( false, result );

        num = 3;
        result = fb1.isMultipleOfThree( num );
        assertEquals( true, result );

        num = 5;
        result = fb1.isMultipleOfThree( num );
        assertEquals( false, result );

        num = 9;
        result = fb1.isMultipleOfThree( num );
        assertEquals( true, result );

        num = 15;
        result = fb1.isMultipleOfThree( num );
        assertEquals( true, result );

        num = 20;
        result = fb1.isMultipleOfThree( num );
        assertEquals( false, result );

        num = 30;
        result = fb1.isMultipleOfThree( num );
        assertEquals( true, result );

        num = 33;
        result = fb1.isMultipleOfThree( num );
        assertEquals( true, result );
    }

    /**
     * Tests to validate the isMultipleOfFive() method
     * For any number n should return true if
     * the number is a multiple of 5
     * Examples:
     *  5 => true
     *  -5 => true
     *  15 => true
     *  0 => false
     *  6 => false
     */
    @Test
    public void whenMultipleOfFive() {
        FizzBuzz3 fb1 = new FizzBuzz3( 0, 0 );
        boolean result = false;

        int num = -33;
        result = fb1.isMultipleOfFive( num );
        assertEquals( false, result );

        num = -30;
        result = fb1.isMultipleOfFive( num );
        assertEquals( true, result );

        num = -20;
        result = fb1.isMultipleOfFive( num );
        assertEquals( true, result );

        num = -15;
        result = fb1.isMultipleOfFive( num );
        assertEquals( true, result );

        num = -9;
        result = fb1.isMultipleOfFive( num );
        assertEquals( false, result );

        num = -5;
        result = fb1.isMultipleOfFive( num );
        assertEquals( true, result );

        num = -3;
        result = fb1.isMultipleOfFive( num );
        assertEquals( false, result );

        num = -1;
        result = fb1.isMultipleOfFive( num );
        assertEquals( false, result );

        num = 0;
        result = fb1.isMultipleOfFive( num );
        assertEquals( false, result );

        num = 1;
        result = fb1.isMultipleOfFive( num );
        assertEquals( false, result );

        num = 3;
        result = fb1.isMultipleOfFive( num );
        assertEquals( false, result );

        num = 5;
        result = fb1.isMultipleOfFive( num );
        assertEquals( true, result );

        num = 9;
        result = fb1.isMultipleOfFive( num );
        assertEquals( false, result );

        num = 15;
        result = fb1.isMultipleOfFive( num );
        assertEquals( true, result );

        num = 20;
        result = fb1.isMultipleOfFive( num );
        assertEquals( true, result );

        num = 30;
        result = fb1.isMultipleOfFive( num );
        assertEquals( true, result );

        num = 33;
        result = fb1.isMultipleOfFive( num );
        assertEquals( false, result );
    }

    /**
     * Tests to validate the isMultipleOfFifteen() method
     * For any number n should return true if
     * the number is a multiple of 15
     * Examples:
     *  15 => true
     *  -15 => true
     *  30 => true
     *  0 => false
     *  40 => false
     */
    @Test
    public void whenMultipleOfFifteen() {
        FizzBuzz3 fb1 = new FizzBuzz3( 0, 0 );
        boolean result = false;

        int num = -33;
        result = fb1.isMultipleOfFifteen( num );
        assertEquals( false, result );

        num = -30;
        result = fb1.isMultipleOfFifteen( num );
        assertEquals( true, result );

        num = -20;
        result = fb1.isMultipleOfFifteen( num );
        assertEquals( false, result );

        num = -15;
        result = fb1.isMultipleOfFifteen( num );
        assertEquals( true, result );

        num = -9;
        result = fb1.isMultipleOfFifteen( num );
        assertEquals( false, result );

        num = -5;
        result = fb1.isMultipleOfFifteen( num );
        assertEquals( false, result );

        num = -3;
        result = fb1.isMultipleOfFifteen( num );
        assertEquals( false, result );

        num = -1;
        result = fb1.isMultipleOfFifteen( num );
        assertEquals( false, result );

        num = 0;
        result = fb1.isMultipleOfFifteen( num );
        assertEquals( false, result );

        num = 1;
        result = fb1.isMultipleOfFifteen( num );
        assertEquals( false, result );

        num = 3;
        result = fb1.isMultipleOfFifteen( num );
        assertEquals( false, result );

        num = 5;
        result = fb1.isMultipleOfFifteen( num );
        assertEquals( false, result );

        num = 9;
        result = fb1.isMultipleOfFifteen( num );
        assertEquals( false, result );

        num = 15;
        result = fb1.isMultipleOfFifteen( num );
        assertEquals( true, result );

        num = 20;
        result = fb1.isMultipleOfFifteen( num );
        assertEquals( false, result );

        num = 30;
        result = fb1.isMultipleOfFifteen( num );
        assertEquals( true, result );

        num = 33;
        result = fb1.isMultipleOfFifteen( num );
        assertEquals( false, result );
    }

    /**
     * Tests to validate the containsThree() method
     * For any number n should return true if
     * the number is contains 3
     * Examples:
     *  3 => true
     *  -3 => true
     *  13 => true
     *  0 => false
     *  6 => false
     */
    @Test
    public void whenContainsThree() {
        FizzBuzz3 fb1 = new FizzBuzz3( 0, 0 );
        boolean result = false;

        int num = -33;
        result = fb1.containsThree( num );
        assertEquals( true, result );

        num = -30;
        result = fb1.containsThree( num );
        assertEquals( true, result );

        num = -20;
        result = fb1.containsThree( num );
        assertEquals( false, result );

        num = -15;
        result = fb1.containsThree( num );
        assertEquals( false, result );

        num = -9;
        result = fb1.containsThree( num );
        assertEquals( false, result );

        num = -5;
        result = fb1.containsThree( num );
        assertEquals( false, result );

        num = -3;
        result = fb1.containsThree( num );
        assertEquals( true, result );

        num = -1;
        result = fb1.containsThree( num );
        assertEquals( false, result );

        num = 0;
        result = fb1.containsThree( num );
        assertEquals( false, result );

        num = 1;
        result = fb1.containsThree( num );
        assertEquals( false, result );

        num = 3;
        result = fb1.containsThree( num );
        assertEquals( true, result );

        num = 5;
        result = fb1.containsThree( num );
        assertEquals( false, result );

        num = 9;
        result = fb1.containsThree( num );
        assertEquals( false, result );

        num = 15;
        result = fb1.containsThree( num );
        assertEquals( false, result );

        num = 20;
        result = fb1.containsThree( num );
        assertEquals( false, result );

        num = 30;
        result = fb1.containsThree( num );
        assertEquals( true, result );

        num = 33;
        result = fb1.containsThree( num );
        assertEquals( true, result );
    }

    /**
     * Tests to validate the getOutputList() method
     * with a list of a single value: n - n
     * Examples:
     *  ( 0, 0 ) => 0
     *  ( 3, 3 ) => lucky
     *  ( 5, 5 ) => buzz
     *  ( 6, 6 ) => fizz
     *  ( -15, -15 ) => fizzbuzz
     */
    @Test
    public void whenSingleNumberInList() {
        FizzBuzz3 fb1 = new FizzBuzz3( -1, -1 );
        String expectedResult = "-1";
        String actualResult = fb1.getOutputList();
        assertEquals( expectedResult, actualResult );

        FizzBuzz3 fb2 = new FizzBuzz3( 0, 0 );
        expectedResult = "0";
        actualResult = fb2.getOutputList();
        assertEquals( expectedResult, actualResult );

        FizzBuzz3 fb3 = new FizzBuzz3( 2, 2 );
        expectedResult = "2";
        actualResult = fb3.getOutputList();
        assertEquals( expectedResult, actualResult );

        FizzBuzz3 fb4 = new FizzBuzz3( 3, 3 );
        actualResult = fb4.getOutputList();
        assertEquals( CONTAINS_THREE_TEXT, actualResult );

        FizzBuzz3 fb5 = new FizzBuzz3( 5, 5 );
        actualResult = fb5.getOutputList();
        assertEquals( MULTIPLE_OF_FIVE_TEXT, actualResult );

        FizzBuzz3 fb6 = new FizzBuzz3( 15, 15 );
        actualResult = fb6.getOutputList();
        assertEquals( MULTIPLE_OF_FIFTEEN_TEXT, actualResult );

        FizzBuzz3 fb7 = new FizzBuzz3( 6, 6 );
        actualResult = fb7.getOutputList();
        assertEquals( MULTIPLE_OF_THREE_TEXT, actualResult );
    }

    /**
     * Tests to validate the getOutputList() method when a range of numbers
     * is used as input
     * Example:
     *  (-3, 3) => lucky -2 -1 0 1 2 lucky
     */
    @Test
    public void whenRangeOfNumbers() {
        FizzBuzz3 allNegative = new FizzBuzz3( -1, -15 );
        String expectedResult = MULTIPLE_OF_FIFTEEN_TEXT + " -14 " + CONTAINS_THREE_TEXT
                + " " + MULTIPLE_OF_THREE_TEXT + " -11 " + MULTIPLE_OF_FIVE_TEXT
                + " " + MULTIPLE_OF_THREE_TEXT + " -8 -7 " + MULTIPLE_OF_THREE_TEXT
                + " " + MULTIPLE_OF_FIVE_TEXT + " -4 " + CONTAINS_THREE_TEXT + " -2 -1";
        String actualResult = allNegative.getOutputList();
        assertEquals( expectedResult, actualResult );

        FizzBuzz3 allPositive = new FizzBuzz3( 1, 15 );
        expectedResult = "1 2 " + CONTAINS_THREE_TEXT + " 4 " + MULTIPLE_OF_FIVE_TEXT
                + " " + MULTIPLE_OF_THREE_TEXT + " 7 8 " + MULTIPLE_OF_THREE_TEXT
                + " " + MULTIPLE_OF_FIVE_TEXT + " 11 " + MULTIPLE_OF_THREE_TEXT
                + " " + CONTAINS_THREE_TEXT + " 14 " + MULTIPLE_OF_FIFTEEN_TEXT;
        actualResult = allPositive.getOutputList();
        assertEquals( expectedResult, actualResult );

        FizzBuzz3 negativeToPositive = new FizzBuzz3( -15, 15 );
        expectedResult = MULTIPLE_OF_FIFTEEN_TEXT + " -14 " + CONTAINS_THREE_TEXT
                + " " + MULTIPLE_OF_THREE_TEXT + " -11 " + MULTIPLE_OF_FIVE_TEXT
                + " " + MULTIPLE_OF_THREE_TEXT + " -8 -7 " + MULTIPLE_OF_THREE_TEXT
                + " " + MULTIPLE_OF_FIVE_TEXT + " -4 " + CONTAINS_THREE_TEXT + " -2 -1 0 1 2 "
                + CONTAINS_THREE_TEXT + " 4 " + MULTIPLE_OF_FIVE_TEXT + " " + MULTIPLE_OF_THREE_TEXT
                + " 7 8 " + MULTIPLE_OF_THREE_TEXT + " " + MULTIPLE_OF_FIVE_TEXT + " 11 "
                + MULTIPLE_OF_THREE_TEXT + " " + CONTAINS_THREE_TEXT + " 14 " + MULTIPLE_OF_FIFTEEN_TEXT;
        actualResult = negativeToPositive.getOutputList();
        assertEquals( expectedResult, actualResult );

        FizzBuzz3 negativePositiveThirty = new FizzBuzz3( -33, 33 );
        expectedResult = CONTAINS_THREE_TEXT + " " + CONTAINS_THREE_TEXT + " " + CONTAINS_THREE_TEXT + " " + CONTAINS_THREE_TEXT
                + " -29 -28 " + MULTIPLE_OF_THREE_TEXT + " -26 " + MULTIPLE_OF_FIVE_TEXT + " " + MULTIPLE_OF_THREE_TEXT
                + " " + CONTAINS_THREE_TEXT + " -22 " + MULTIPLE_OF_THREE_TEXT + " " + MULTIPLE_OF_FIVE_TEXT
                + " -19 " + MULTIPLE_OF_THREE_TEXT + " -17 -16 " + MULTIPLE_OF_FIFTEEN_TEXT + " -14 " + CONTAINS_THREE_TEXT
                + " " + MULTIPLE_OF_THREE_TEXT + " -11 " + MULTIPLE_OF_FIVE_TEXT + " " + MULTIPLE_OF_THREE_TEXT + " -8 -7 "
                + MULTIPLE_OF_THREE_TEXT + " " + MULTIPLE_OF_FIVE_TEXT + " -4 " + CONTAINS_THREE_TEXT + " -2 -1 0"
                + " 1 2 " + CONTAINS_THREE_TEXT + " 4 " + MULTIPLE_OF_FIVE_TEXT + " " + MULTIPLE_OF_THREE_TEXT + " 7 8 "
                + MULTIPLE_OF_THREE_TEXT + " " + MULTIPLE_OF_FIVE_TEXT + " 11 " + MULTIPLE_OF_THREE_TEXT
                + " " + CONTAINS_THREE_TEXT + " 14 " + MULTIPLE_OF_FIFTEEN_TEXT + " 16 17 " + MULTIPLE_OF_THREE_TEXT
                + " 19 " + MULTIPLE_OF_FIVE_TEXT + " " + MULTIPLE_OF_THREE_TEXT + " 22 " + CONTAINS_THREE_TEXT
                + " " + MULTIPLE_OF_THREE_TEXT + " " + MULTIPLE_OF_FIVE_TEXT + " 26 " + MULTIPLE_OF_THREE_TEXT
                + " 28 29 " + CONTAINS_THREE_TEXT + " " + CONTAINS_THREE_TEXT + " " + CONTAINS_THREE_TEXT + " " + CONTAINS_THREE_TEXT;
        actualResult = negativePositiveThirty.getOutputList();
        assertEquals( expectedResult, actualResult );
    }

    /**
     * Tests to validate the getStatistics() method reports accurate
     * statistics in the list
     * Example:
     *  (-3, 3) => lucky: 2 integer: 5
     */
    @Test
    public void testGetStatistics() {
        FizzBuzz3 onlyInts = new FizzBuzz3( -2, 2 );
        onlyInts.setOutputList();
        String expectedResult = INTEGER_TEXT + ": 5";
        String actualResult = onlyInts.getStatistics();
        assertEquals( expectedResult, actualResult );

        FizzBuzz3 multipleOfThree = new FizzBuzz3( 6, 6 );
        multipleOfThree.setOutputList();
        expectedResult = MULTIPLE_OF_THREE_TEXT + ": 1";
        actualResult = multipleOfThree.getStatistics();
        assertEquals( expectedResult, actualResult );

        FizzBuzz3 multipleOfFive = new FizzBuzz3( 5, 5 );
        multipleOfFive.setOutputList();
        expectedResult = MULTIPLE_OF_FIVE_TEXT + ": 1";
        actualResult = multipleOfFive.getStatistics();
        assertEquals( expectedResult, actualResult );

        FizzBuzz3 multipleOfFifteen = new FizzBuzz3( 15, 15 );
        multipleOfFifteen.setOutputList();
        expectedResult = MULTIPLE_OF_FIFTEEN_TEXT + ": 1";
        actualResult = multipleOfFifteen.getStatistics();
        assertEquals( expectedResult, actualResult );

        FizzBuzz3 containsThree = new FizzBuzz3( 33, 33 );
        containsThree.setOutputList();
        expectedResult = CONTAINS_THREE_TEXT + ": 1";
        actualResult = containsThree.getStatistics();
        assertEquals( expectedResult, actualResult );

        FizzBuzz3 smallRange = new FizzBuzz3( -3, 3 );
        smallRange.setOutputList();
        expectedResult = CONTAINS_THREE_TEXT + ": 2 " + INTEGER_TEXT + ": 5";
        actualResult = smallRange.getStatistics();
        assertEquals( expectedResult, actualResult );

        FizzBuzz3 mediumRange = new FizzBuzz3( -6, 6 );
        mediumRange.setOutputList();
        expectedResult = MULTIPLE_OF_THREE_TEXT + ": 2"
                + " " + MULTIPLE_OF_FIVE_TEXT + ": 2"
                + " " + CONTAINS_THREE_TEXT + ": 2"
                + " " + INTEGER_TEXT + ": 7";
        actualResult = mediumRange.getStatistics();
        assertEquals( expectedResult, actualResult );

        FizzBuzz3 largeRange = new FizzBuzz3( -33, 33 );
        largeRange.setOutputList();
        expectedResult = MULTIPLE_OF_THREE_TEXT + ": 14"
                + " " + MULTIPLE_OF_FIVE_TEXT + ": 8"
                + " " + MULTIPLE_OF_FIFTEEN_TEXT + ": 2"
                + " " + CONTAINS_THREE_TEXT + ": 14"
                + " " + INTEGER_TEXT + ": 29";
        actualResult = largeRange.getStatistics();
        assertEquals( expectedResult, actualResult );
    }

    /**
     * Tests to validate the toString() method
     * which gets the output and statistics
     */
    @Test
    public void testToString() {
        FizzBuzz3 smallRange = new FizzBuzz3( -3, 3 );
        String expectedResult = CONTAINS_THREE_TEXT + " -2 -1 0 1 2 " + CONTAINS_THREE_TEXT
                + "\n"
                + CONTAINS_THREE_TEXT + ": 2 " + INTEGER_TEXT + ": 5";
        String actualResult = smallRange.toString();
        assertEquals( expectedResult, actualResult );

        FizzBuzz3 mediumRange = new FizzBuzz3( -5, 5 );
        expectedResult = MULTIPLE_OF_FIVE_TEXT + " -4 " + CONTAINS_THREE_TEXT + " -2 -1"
                + " 0 1 2 " + CONTAINS_THREE_TEXT + " 4 " + MULTIPLE_OF_FIVE_TEXT
                + "\n"
                + MULTIPLE_OF_FIVE_TEXT + ": 2 " + CONTAINS_THREE_TEXT + ": 2 " + INTEGER_TEXT + ": 7";
        actualResult = mediumRange.toString();
        assertEquals( expectedResult, actualResult );

        FizzBuzz3 largeRange = new FizzBuzz3( -15, 15 );
        expectedResult = MULTIPLE_OF_FIFTEEN_TEXT + " -14 " + CONTAINS_THREE_TEXT
                + " " + MULTIPLE_OF_THREE_TEXT + " -11 " + MULTIPLE_OF_FIVE_TEXT
                + " " + MULTIPLE_OF_THREE_TEXT + " -8 -7 " + MULTIPLE_OF_THREE_TEXT
                + " " + MULTIPLE_OF_FIVE_TEXT + " -4 " + CONTAINS_THREE_TEXT + " -2 -1 0 1 2 "
                + CONTAINS_THREE_TEXT + " 4 " + MULTIPLE_OF_FIVE_TEXT + " " + MULTIPLE_OF_THREE_TEXT
                + " 7 8 " + MULTIPLE_OF_THREE_TEXT + " " + MULTIPLE_OF_FIVE_TEXT + " 11 "
                + MULTIPLE_OF_THREE_TEXT + " " + CONTAINS_THREE_TEXT + " 14 " + MULTIPLE_OF_FIFTEEN_TEXT
                + "\n"
                + MULTIPLE_OF_THREE_TEXT + ": 6 "
                + MULTIPLE_OF_FIVE_TEXT + ": 4 "
                + MULTIPLE_OF_FIFTEEN_TEXT + ": 2 "
                + CONTAINS_THREE_TEXT + ": 4 "
                + INTEGER_TEXT + ": 15";
        actualResult = largeRange.toString();
        assertEquals( expectedResult, actualResult );
    }
}
