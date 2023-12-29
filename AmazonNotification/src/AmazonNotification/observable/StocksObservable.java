package AmazonNotification.observable;

import AmazonNotification.observer.NotificationObserver;

public interface StocksObservable {

	public void add(NotificationObserver obs);
	public void remove(NotificationObserver obs);
	public void notifySubscriber();
	public void setStock(int StockCount);
	public int getStock();
}
