/**
 * Created by emma on 7/9/17.
 */

public class Publisher
{
    private Subscriber [] subscriberList;
    private int maximumSubscribers;
    private int nextIndex;
    public Publisher( int max )
    {
// An array stores subscribers
// Maximum number of subscribers
// Array index of next subscriber
// Initialize attributes & create subscriber array
        maximumSubscribers = max;
        subscriberList = new Subscriber[ maximumSubscribers ]; nextIndex = 0;
    }
    public void register( Subscriber s )
    {
// Register a subscriber unless the subscriber array is full
        if ( nextIndex < maximumSubscribers )
            subscriberList[ nextIndex++ ] = s;
        else
            System.out.println( "ERROR: Subscriber List is full" );
    }
    public void notifySubscribers()
    {
// Iterate through the subscriber array & invoke update() methods
        for ( int i = 0; i < nextIndex; i++ )
            subscriberList[ i ].update();
    } }
