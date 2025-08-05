package solid.ocp;

public class MobileNotification implements Notificationservice{
    @Override
    public void sendOtp(String type) {
        //send the on the mobile
    }

    @Override
    public void sendTransactionreport(double acc) {
// send on the mobile last 10 transaction
    }
}
