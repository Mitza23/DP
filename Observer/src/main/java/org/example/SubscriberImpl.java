package org.example;

public class SubscriberImpl implements Subscriber{
	private int id;

	public SubscriberImpl(int id) {
		this.id = id;
	}

	@Override
	public void update(String state) {
		System.out.println("Subscriber " + id + " new update: " + state);
	}
}
