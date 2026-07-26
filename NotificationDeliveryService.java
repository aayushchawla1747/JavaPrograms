/*4. Notification Delivery Service

Setup:

Create an abstract class NotificationSender with:

* A concrete method send(String recipient, String message) that formats the message and calls deliver(recipient, formattedMessage).
* An abstract method deliver(String recipient, String message).

Implement EmailNotification and SMSNotification subclasses to handle the specific delivery logic.

Task:
Create a NotificationSender reference pointing to an EmailNotification object and send a notification.
*/

abstract class NotificationSender{
	String recipient;
	String message;
	NotificationSender(String recipient,String message){
		this.recipient=recipient;
		this.message=message;
	}
	public void send(String recipient,String message){
		String formattedMessage;
		formattedMessage=message+"is the formatted message.";
	}
	abstract void deliver(String recipient,String formattedMessageessage);
}