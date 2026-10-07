package Interface;
//Create an interface Notification with a method sendNotification().

//Create an interface Notification.
//Create: EmailNotification , SMSNotification classes
//Implement the method.
//Display appropriate messages.
//Email notification sent. SMS notification sent

public interface Notification {
	void sendNotification();

	default void EmailNotification() {
		System.out.println("Email sent");
	}

	default void SMSNotification() {
		System.out.println("SMS sent");
	}
}





