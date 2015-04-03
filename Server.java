package day22;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject implements EchoService{


	protected Server() throws RemoteException {
		super();
	}

	public String echo(String s) throws RemoteException {

		
		return s;
	}

	
	
}
