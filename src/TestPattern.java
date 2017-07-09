/**
 * Created by emma on 7/9/17.
 */
public class TestPattern
{
    public static void main( String [] args )
    {
        // Create Publisher & Subscriber objects
        MySubscriber Subscriber1 = new MySubscriber(1);
        MySubscriber Subscriber2 = new MySubscriber(2);
        MySubscriber Subscriber3 = new MySubscriber(3);

        MyPublisher aPublisher = new MyPublisher( 3 );
        aPublisher.register( Subscriber1 ); // Register a Subscriber
        aPublisher.register( Subscriber2 ); // Register a Subscriber
        aPublisher.register( Subscriber3 ); // Register a Subscriber
        // Increment Publisher object to cause state changes
        aPublisher.increment();
        aPublisher.increment();
        aPublisher.increment();
        aPublisher.increment();
    } }

