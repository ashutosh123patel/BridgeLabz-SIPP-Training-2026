public class Main {

    public static void main(String[] args) {

        Notification[] n = {

                new EmailNotification(
                        "Ashutosh",
                        "Welcome to our company"),

                new SMSNotification(
                        "Rahul",
                        "Your OTP is 1234"),

                new PushNotification(
                        "Aman",
                        "Your order has been delivered")

        };

        for (Notification x : n) {

            x.sendNotification();
        }

    }
}