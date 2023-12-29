package AmazonNotification;

import AmazonNotification.observable.IphoneStockObservable;
import AmazonNotification.observable.StocksObservable;
import AmazonNotification.observer.EmailNotificationObserver;
import AmazonNotification.observer.NotificationObserver;

public class Store {
	public static void main(String args[]) {
		StocksObservable iphoneObservable = new IphoneStockObservable();
		
		NotificationObserver iphoneNotificationObserver = new EmailNotificationObserver("abc@gmail.com", iphoneObservable);
		NotificationObserver iphoneNotificationObserver2 = new EmailNotificationObserver("xyz@gmail.com", iphoneObservable);
	
		iphoneObservable.add(iphoneNotificationObserver);
		iphoneObservable.add(iphoneNotificationObserver2);
		
		iphoneObservable.setStock(20);
		
	}
}
