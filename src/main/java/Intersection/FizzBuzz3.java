package Intersection;

import java.util.HashMap;
import java.util.Map;

import static Intersection.StringConstants.*;

public class FizzBuzz3 {
    private int start = 0;
    private int end = 0;

    private String outputList = null;

    private Map<String,Integer> statistics = new HashMap<>();

    /**
     * Initializes the start and end values for the range of ints
     * The statistics map is indirectly created as an empty map
     * The output list needs to created by running setOutputList()
     * or getOutputList()
     * If the integers are out of order, the lowest value is used for start
     *
     * @param start - start value of the range
     * @param end - end value of the range
     */
    public FizzBuzz3( int start, int end ) {
        if( start <= end ) {
            this.start = start;
            this.end = end;
        } else {
            this.start = end;
            this.end = start;
        }
    }

    /**
     * Creates the output list for the object's range of integers
     * If the output list is already created, that list will be returned
     */
    public void setOutputList() {
        // only allow output to be run once to keep statistics accurate
        if( outputList != null ) {
            return;
        }

        StringBuilder sb = new StringBuilder();

        // order matters:
        // smaller numbers can have the same multiples as larger numbers
        // so evaluate larger multiples first
        for( int i = start; i <= end; i++ ) {
            if( containsThree( i ) ) {
                sb.append( CONTAINS_THREE_TEXT );
                incrementStatistic( CONTAINS_THREE_TEXT );
            } else if( isMultipleOfFifteen( i ) ) {
                sb.append( MULTIPLE_OF_FIFTEEN_TEXT );
                incrementStatistic( MULTIPLE_OF_FIFTEEN_TEXT );
            } else if( isMultipleOfFive( i ) ) {
                sb.append( MULTIPLE_OF_FIVE_TEXT );
                incrementStatistic( MULTIPLE_OF_FIVE_TEXT );
            } else if( isMultipleOfThree( i ) ) {
                sb.append( MULTIPLE_OF_THREE_TEXT);
                incrementStatistic( MULTIPLE_OF_THREE_TEXT );
            } else {
                sb.append( i );
                incrementStatistic( INTEGER_TEXT );
            }

            sb.append( " " );
        }

        this.outputList = sb.toString().trim();
    }

    /**
     * Gets the output list for the given range of integers
     * setOutputlist() will be called if the outputList has
     * not been initialized
     */
    public String getOutputList() {
        if( outputList == null ) {
            setOutputList();
        }

        return outputList;
    }

    /**
     * Checks if the given parameter is a multiple of three
     *
     * @param num - value to check
     * @return - true if the parameter is a multiple of three
     */
    public boolean isMultipleOfThree( int num ) {
        if( num == 0 ) {
            return false;
        }

        return num % 3 == 0;
    }

    /**
     * Checks if the given parameter is a multiple of five
     *
     * @param num - value to check
     * @return - true if the parameter is a multiple of five
     */
    public boolean isMultipleOfFive( int num ) {
        if( num == 0 ) {
            return false;
        }

        return num % 5 == 0;
    }

    /**
     * Checks if the given parameter is a multiple of fifteen
     *
     * @param num - value to check
     * @return - true if the parameter is a multiple of fifteen
     */
    public boolean isMultipleOfFifteen( int num ) {
        if( num == 0 ) {
            return false;
        }

        return num % 15 == 0;
    }

    /**
     * Checks if the given parameter contains a 3 digit
     *
     * @param num - value to check
     * @return - true if the parameter contains a 3, false otherwise
     */
    public boolean containsThree( int num ) {
        while( num != 0 ) {
            int mod = num % 10;
            if( mod == 3 || mod == -3 ) {
                return true;
            }

            num = num / 10;
        }

        return false;
    }

    /**
     * Increments the count of each key in the statistics map
     *
     * @param key - the key to increment
     */
    public void incrementStatistic( String key ) {
        Integer count = statistics.get( key );
        if( count == null ) {
            count = new Integer( 1 );
        } else {
            count++;
        }

        statistics.put( key, count );
    }

    /**
     * Gets a String representation of the statistics for the output
     *
     * @return - @key: @value for each key in the statistics map
     */
    public String getStatistics() {
        StringBuilder sb = new StringBuilder();

        Integer multipleOfThreeCount = statistics.get( MULTIPLE_OF_THREE_TEXT );
        if( multipleOfThreeCount != null ) {
            sb.append( MULTIPLE_OF_THREE_TEXT + ": " + multipleOfThreeCount + " " );
        }

        Integer multipleOfFiveCount = statistics.get( MULTIPLE_OF_FIVE_TEXT );
        if( multipleOfFiveCount != null ) {
            sb.append( MULTIPLE_OF_FIVE_TEXT + ": " + multipleOfFiveCount + " " );
        }

        Integer multipleOfFifteenCount = statistics.get( MULTIPLE_OF_FIFTEEN_TEXT );
        if( multipleOfFifteenCount != null ) {
            sb.append( MULTIPLE_OF_FIFTEEN_TEXT + ": " + multipleOfFifteenCount + " " );
        }

        Integer containsThreeCount = statistics.get( CONTAINS_THREE_TEXT );
        if( containsThreeCount != null ) {
            sb.append( CONTAINS_THREE_TEXT + ": " + containsThreeCount + " " );
        }

        Integer integerCount = statistics.get( INTEGER_TEXT );
        if( integerCount != null ) {
            sb.append( INTEGER_TEXT + ": " + integerCount );
        }

        return sb.toString().trim();
    }

    /**
     * Returns the outputList and the statistics (on a new line)
     *
     * @return
     */
    @Override
    public String toString() {
        return getOutputList() + "\n" + getStatistics();
    }
}
