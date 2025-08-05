package solid.ocp;

public interface Notificationservice {
    public void sendOtp(String type);
    public void sendTransactionreport(double acc);
}
