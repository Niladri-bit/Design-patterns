package AmazonNotification.observer;

import AmazonNotification.observable.StocksObservable;

public class EmailNotificationObserver implements NotificationObserver{
	
	String emailId;
	StocksObservable obs;
	public EmailNotificationObserver(String emailId, StocksObservable obs) {
		this.emailId = emailId;
		this.obs = obs;
	}

	@Override
	public void update() {
		obs.getStock();
		System.out.println("email notification sent to "+ emailId);
	}

}
