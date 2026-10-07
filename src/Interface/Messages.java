package Interface;

public class Messages implements Notification {
public void SendNotification() {
	System.out.println("Notification Messages :");
}
public static void main(String[] args) {
	Notification n= new Messages();
	n.EmailNotification();
	n.SMSNotification();
	n.sendNotification();
}








@Override
public void sendNotification() {
	// TODO Auto-generated method stub
	
}
}

