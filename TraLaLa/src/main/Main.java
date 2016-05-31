package main;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;

import remote.GlobalService;
import remote.IGlobalService;

public class Main {
	
	public static void main(String[] args) {	
		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new RMISecurityManager());
		}

		String name = "//" + args[0] + ":" + args[1] + "/" + args[2];		

		try {
			IGlobalService remoteFašade = GlobalService.getInstance();

			Naming.rebind(name, remoteFašade);
			System.out.println(" * Auction server '" + name + "' started!!");
		} catch (Exception ex) {
			System.err.println(" # Auction Server Exception: " + ex.getMessage());
		}
	}

}
