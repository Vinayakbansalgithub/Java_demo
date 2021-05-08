package DesignPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

interface ISubject {

	public void register(IObserver obj);

	public void unregister(IObserver obj);

	public void notifyObservers(String new_payload);

}

class MessageServer implements ISubject {

	public List<IObserver> clients;
	String message;

	public MessageServer() {
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

	@Override
	public void notifyObservers(String new_message) {
		for (IObserver client : clients) {
			client.updateListener(new_message);
		}
	}

	public void postMessage(String new_message) {
		this.message = new_message;
		notifyObservers(this.message);
	}

}

interface IObserver {

	public void updateListener(String payload);

	public void registerToSubject(ISubject sub);
}

class ClientObserver implements IObserver {

	public Queue<String> message_queue;
	private ISubject message_server;
	String id;

	public ClientObserver(String id) {
		this.id = id;
		message_queue = new LinkedList<>();
	}

	@Override
	public void updateListener(String message) {
		/* This is the onUpdateListner for every Client */
		message_queue.add(message);
	}

	@Override
	public void registerToSubject(ISubject subject) {
		message_server = subject;
	}

	// When your device gets connected to the server, call this function
	public void onConnect() {

		if (!message_queue.isEmpty()) {

			Iterator<String> iter = message_queue.iterator();
			while (iter.hasNext()) {
				System.out.println(id + " recieved " + iter.next()); // send messages to the device via MQTT
			}

			message_queue.clear();
		}

	}

}

public class ObserverPattern {
	public static void main(String[] args) {

		MessageServer server = new MessageServer();

		// for DEMO, instantiating device connections locally
		ClientObserver device1 = new ClientObserver("device1");
		device1.registerToSubject(server);

		ClientObserver device2 = new ClientObserver("device2");
		device2.registerToSubject(server);

		ClientObserver device3 = new ClientObserver("device3");
		device3.registerToSubject(server);

		server.register(device1);
		server.register(device2);
		server.register(device3);

		server.postMessage("Hi Groupmates");
		server.postMessage("How are you?");

		device1.onConnect();
		device2.onConnect();
		device3.onConnect();

	}

}

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