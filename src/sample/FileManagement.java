package sample;

import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

public class FileManagement{
	public static void createFile(String str) throws IOException{
		File myObj=new File(str);
		if(myObj.createNewFile()){
			System.out.println("File created: "+myObj.getName());
		}else{
			System.out.println("File already exists.");
		}
	}
	public static void writeFile(String str) throws IOException{
		FileWriter myWriter=new FileWriter(str);
		myWriter.write("The queue");
		myWriter.close();
		System.out.println("Successfully wrote to the file.");
	}
	public static void read(String str){
		try{
			File myObj=new File(str);
			Scanner myReader=new Scanner(myObj);
			while(myReader.hasNextLine()){
				String data=myReader.nextLine();
				System.out.println(data);
			}
			myReader.close();
		}catch(FileNotFoundException e){
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}
