package day22;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject implements EchoService{


	public Server() throws RemoteException {
	}

	public String echo(String s) throws RemoteException {

		System.out.println("Replying to client "+s);
		return s;
	}

	
	
}
