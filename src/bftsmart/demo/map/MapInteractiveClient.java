package bftsmart.demo.map;

import java.io.Console;
import java.util.Set;

public class MapInteractiveClient {
	
	// public static void main(String[] args) {
	// 	if(args.length < 1) {
	// 		System.out.println("Usage: demo.map.MapInteractiveClient <client id> <limit operations>");
	// 	}
		
	// 	int clientId = Integer.parseInt(args[0]);
	// 	int operations = Integer.parseInt(args[1]);
	// 	MapClient<String, String> map = new MapClient<>(clientId, operations);
	// 	Console console = System.console();
		
	// 	boolean exit = false;
	// 	String key, value, result;
	// 	while(!exit) {
	// 		System.out.println("Select an option:");
	// 		System.out.println("0 - Terminate this client");
	// 		System.out.println("1 - Insert value into the map");
	// 		System.out.println("2 - Retrieve value from the map");
	// 		System.out.println("3 - Removes value from the map");
	// 		System.out.println("4 - Retrieve the size of the map");
	// 		System.out.println("5 - List all keys available in the table");
			
	// 		int cmd = Integer.parseInt(console.readLine("Option:"));
	// 		switch (cmd) {
	// 			case 0:
	// 				map.print_results();
	// 				map.close();
	// 				exit = true;
	// 				break;
	// 			case 1:
	// 				System.out.println("Putting value in the map");
	// 				key = console.readLine("Enter the key:");
	// 				value = console.readLine("Enter the value:");
	// 				result =  map.put(key, value);
	// 				System.out.println("Previous value: " + result);
	// 				break;
	// 			case 2:
	// 				System.out.println("Reading value from the map");
	// 				key = console.readLine("Enter the key:");
	// 				result =  map.get(key);
	// 				System.out.println("Value read: " + result);
	// 				break;
	// 			case 3:
	// 				System.out.println("Removing value in the map");
	// 				key = console.readLine("Enter the key:");
	// 				result =  map.remove(key);
	// 				System.out.println("Value removed: " + result);
	// 				break;
	// 			case 4:
	// 				System.out.println("Getting the map size");
	// 				int size = map.size();
	// 				System.out.println("Map size: " + size);
	// 				break;
	// 			case 5:
	// 				System.out.println("Getting all keys");
	// 				Set<String> keys = map.keySet();
	// 				System.out.println("Total number of keys found: " + keys.size());
	// 				for (String k : keys)
	// 					System.out.println("---> " + k);
	// 				break;
	// 			default:
	// 				break;
	// 		}
	// 		if(operations == 0){
	// 			map.print_results();
	// 			map.close();
	// 			exit = true;
	// 			break;
	// 		}
	// 		operations--;
	// 	}
	// }

	public static void main(String[] args) {
		if(args.length < 2) {
			System.out.println("Usage: demo.map.MapInteractiveClient <client id> <limit operations>");
		}
		
		int clientId = Integer.parseInt(args[0]);
		int operations = Integer.parseInt(args[1]);
		MapClient<String, String> map = new MapClient<>(clientId, operations);
	
		for(int i = 0; i< operations;i++){
			map.put(i+"", i+"");
			map.get(i+"");
		}
		// if(operations != 0){
		// 	int keySize = map.keySet().size();
		// 	map.deleteLastInstant();
		// 	operations += keySize;

		// 	while(keySize < operations) {
		// 		map.put(keySize+"", keySize+"");
		// 		keySize++;
		// 	}
		// }				

		// Set<String> keys = map.keySet();
		// map.deleteLastInstant();
		// System.out.println("Total number of keys found: " + keys.size());
		map.print_results();
		map.close();
	}
}

