package utils;

import java.io.*;

public class CommandLineRunner {
	public static String EnterCommand(String commandLine) throws Exception {
		System.out.println("CommandLineRunner > EnterCommand() was invoked.");
		
		//Declare Process runtime
		Process runtime = Runtime.getRuntime().exec(commandLine);
		System.out.println("Process runtime was declared.");
		
		//Store command line output
		String output = Show_Output(runtime);
		System.out.println("Command line output '"+output+"' was stored.");

		return output;
	}
	
	public static String Show_Output(Process process) throws IOException {
		System.out.println("CommandLineRunner > Show_Output() was invoked.");
		
		//Declare Buffered Reader
		BufferedReader output_reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
		System.out.println("Buffered Reader was declared.");
		
		//Declare output
		String output = null;
		System.out.println("String output was declared.");
		
		//Declare String output return
		String output_ret = null;
		System.out.println("String output return was declared.");
		
		//Store command line output
		while((output = output_reader.readLine()) != null) {
			output_ret = output;
			System.out.println("Command line output return '"+output_ret+"' was stored.");
		}
		
		return output_ret;
	}
}
