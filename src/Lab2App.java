import java.util.Scanner;

/**
 * Title: Lab2App 
 * Description: Parsing a URL.  Ask the user to enter a URL and it will display
 * details about the URL.  [add more text here to describe what specifically is 
 * displayed in this program.]
 * 
 * @author 
 */

public class Lab2AppOriginal 
{
	public static void main(String[] args)
	{
		//
		String url;
		int positionOfColon;
		String protocol;
		String restOfUrl;
		String domainName;
		String fileName;
		int positionOfSlash;
		int positionOfPeriod;
		int fileNameLength;
		char firstLetter;
		char lastLetter;
		
		// set up the Scanner object for reading user input
		Scanner scnr = new Scanner(System.in);
		
		// prompt the user to enter a URL
		System.out.println("Please enter a URL:"); 
		url = scnr.nextLine();  
		
		// Code below this line may need to be modified for the program to output correctly
		
		//
		positionOfColon = url.indexOf(":");
		
		//
		protocol = url.substring(0, positionOfColon);
		
		//
		restOfUrl = url.substring(positionOfColon + 1);
		
		//
		positionOfPeriod = url.indexOf('.');
		
		//
		positionOfSlash = url.indexOf("/");
		
		//
		domainName = url.substring(0, positionOfSlash - 1);
		
		//
		fileName = restOfUrl.substring(positionOfSlash);

		//
		fileNameLength = protocol.length();
		
		//
		firstLetter = domainName.charAt(1);
		
		// find the last letter
		
		
		// output
		System.out.println("The URL is " + url);
		System.out.println("The position of the colon is " + positionOfColon);
		System.out.println("The protocol is " + domainName);
		System.out.println("The rest of the URL is " + restOfUrl);
		System.out.println("The position of the period is " + positionOfPeriod);
		System.out.println("The position of the slash is " + positionOfSlash);
		System.out.println("The domain name is " + domainName);
		System.out.println("The file name is " + protocol);
		System.out.println("The length of the file name is " + firstLetter);
		System.out.println("The first letter of the file name is " + firstLetter);
		
		// output the last letter
		System.out.println("The last letter of the file name is " + firstLetter);
		
		// close the Scanner object
		scnr.close();
	}
}
