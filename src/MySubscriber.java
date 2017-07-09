/**
 * Created by emma on 7/9/17.
 */
public class MySubscriber extends Subscriber {

    private int subscriberNumber;

    public MySubscriber(int newNumber) {
        super();
        setSubscriberNumber(newNumber);
    }

    public int getSubscriberNumber() {
        return subscriberNumber;
    }

    public void setSubscriberNumber(int subscriberNumber) {
        this.subscriberNumber = subscriberNumber;
    }

    public void update() {
        System.out.println( "Suscriber " + getSubscriberNumber() + " has been notified" );
    }

}
