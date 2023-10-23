package ie.atu.io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;	
import java.io.BufferedWriter; 
import java.io.FileNotFoundException; 
import java.io.IOException; 
import java.util.concurrent.TimeUnit; // Used to slow read process

public class CopyFileByteSimple {

	public static void main(String[] args) {
		File inputFile = null;
		File outputFile = null;
		FileReader charInputStream = null;
		FileWriter charOutputStream = null;
		BufferedReader charInputStreamBuffer = null;
		BufferedWriter charOutputStreamBuffer = null;
		String bufferData = null; // Used to store data read from buffer

		try {
			// Create file instances
			inputFile = new File("./resources/input.txt");
			outputFile = new File("./resources/output.txt");
			// Create streams
			charInputStream = new FileReader(inputFile);
			charOutputStream = new FileWriter(outputFile);
			// Buffer the streams
			charInputStreamBuffer = new BufferedReader(charInputStream);
			charOutputStreamBuffer = new BufferedWriter(charOutputStream);
			// Read in buffer from file
			while ((bufferData = charInputStreamBuffer.readLine()) != null) {
				// Show buffer data
				System.out.println(bufferData);
				// Write buffer data to file
				charOutputStreamBuffer.write(bufferData);
				// Write new line to file (as readLine() strips new line character)
				charOutputStreamBuffer.newLine();
				// Flushes buffer, which transfers buffer data from the buffer to the file
				charOutputStreamBuffer.flush();
				// Sleep for 500 milliseconds (i.e. half a second) so we can watch write process
				TimeUnit.MILLISECONDS.sleep(500);
			}
			System.out.println("---------------------------------");
			System.out.println("Copy completed sucessfully! See resources/output.txt");
		} catch (NullPointerException nullPtExc) {
			nullPtExc.printStackTrace();
		} catch (FileNotFoundException fnfExc) {
			fnfExc.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (InterruptedException intExc) {
			intExc.printStackTrace();
		} finally {
			// Close streams and buffers
			try {
				if (charInputStreamBuffer != null) {
					charInputStreamBuffer.close();
				}
				if (charOutputStreamBuffer != null) {
					charOutputStreamBuffer.close();
				}
				if (charInputStream != null) {
					charInputStream.close();
				}
				if (charOutputStream != null) {
					charOutputStream.close();
				}
			} catch (IOException ioe) {
				ioe.printStackTrace();
			} // End catch

		} // End finally
		
	} //End main
} //End Class
