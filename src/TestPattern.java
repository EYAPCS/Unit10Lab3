/**
 * Created by emma on 7/9/17.
 */
public class TestPattern
{
    public static void main( String [] args )
    {
        // Create Publisher & Subscriber objects
        MySubscriber aSubscriber = new MySubscriber(); MyPublisher aPublisher = new MyPublisher( 2 );
        // Register a Subscriber
        aPublisher.register( aSubscriber );
// Increment Publisher object to cause state changes
        aPublisher.increment();
        aPublisher.increment();
        aPublisher.increment();
        aPublisher.increment();
    } }

