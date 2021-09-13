package DesignPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.Queue;

// which is also the subject
interface IObservable {

	public void register(IObserver obj);

	public void unregister(IObserver obj);

	public void notifyObservers(String new_payload);

}

// An observable is an object which notifies observers about the changes in its state
class KafkaServer implements IObservable {

	public List<IObserver> clients;
	String message;

	public KafkaServer() {
		this.clients = new ArrayList<IObserver>();
		message = "";
	}

	@Override
	public void register(IObserver client) {
		if (!clients.contains(client))
			clients.add(client);
	}

	@Override
	public void unregister(IObserver client) {
		clients.remove(client);
	}

	// here it is updating observers about changes
	@Override
	public void notifyObservers(String new_message) {
		for (IObserver client : clients) {
			client.update(new_message);
		}
	}

}

interface IObserver {

	public void update(String payload);

}

//class ClientObserver implements IObserver {
class FunctionizeRuntimeServer implements IObserver {

	public Queue<String> message_queue;
	String id;

	public FunctionizeRuntimeServer(String id) {
		this.id = id;
		message_queue = new LinkedList<>();
	}

	/* This is the onUpdateListner for every Client */
	@Override
	public void update(String message) {
		message_queue.add(message);
		System.out.println("Message : " + message + " has been received by Runtime observer");
	}

}

//class ClientObserver implements IObserver {
class FunctionizeUIServer implements IObserver {

	public Queue<String> message_queue;
	String id;

	public FunctionizeUIServer(String id) {
		this.id = id;
		message_queue = new LinkedList<>();
	}

	/* This is the onUpdateListner for every Client */
	@Override
	public void update(String message) {
		message_queue.add(message);
		System.out.println("Message : " + message + " has been received by UI observer");
	}

}

public class ObserverPattern {
	public static void main(String[] args) {

		KafkaServer server = new KafkaServer();
		FunctionizeUIServer ui = new FunctionizeUIServer("php node");
		FunctionizeRuntimeServer runtime = new FunctionizeRuntimeServer("spring app");
		server.register(ui);
		server.register(runtime);
		server.notifyObservers("test has been completed");

	}

}

//When to use this pattern?
//You should consider using this pattern in your application when multiple objects are dependent on the state 
//of one object as it provides a neat and well tested design for the same.

//Subject: This class provides an interface for registering and deregistering observers. 
//This has a list of observers that has registered with it.
//
//Observer: This class defines an interface that gets called when an subject changes. Based on a subject’s implementation, 
//the new data gets pushed to the observer or it is the duty of the observer to get the refreshed state of the subject.
//
//ConcreteSubject: This class is a subclass of Subject and contains the state which the observers are interested in. This sends a notification to its observers when its state changes.
//
//ConcreteObserver: This class is a subclass of Observer and stores a copy of the subject’s state that it is interested in. This has a reference to the subject so that, it can query the latest state of the subject. This object implements 
//the interface that gets called when the subject state’s changes.