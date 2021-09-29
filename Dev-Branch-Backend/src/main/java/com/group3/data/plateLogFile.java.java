package com.group3.data;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

import com.group3.rest.VehicleRegController;

public class plateLogFile {
	private static VehicleRegController controller;

	public static void main(String args[]) throws IOException {
		// Instantiating the File class
		File platesearchfile = new File("D:\\searchoutput.txt");
		// Instantiating the PrintStream class
		PrintStream stream = new PrintStream(platesearchfile);
		System.out.println("log plate searches to" + platesearchfile.getAbsolutePath());
		System.setOut(stream);
		// print values to file
		System.out.println(controller.getPlateInfo());
	}
}