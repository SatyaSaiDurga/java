// Importing File class  
import java.io.File;  
// Importing the IOException class for handling errors  
import java.io.IOException;   
 class CreateFile {  
               public static void main(String args[]) {  
               try {  
                       // Creating an object of a file  
                       File f0 = new File("D:FileOperationExample.txt");   
                       if (f0.createNewFile()) {  
                                  System.out.println("File " + f0.getName() + " is created successfully.");  
                       } else {  
                                  System.out.println("File is already exist in the directory.");  
                       }  
                     } catch (IOException exception) {  
                              System.out.println("An unexpected error is occurred.");  
                              exception.printStackTrace();  
                  }   
        }  
} 

// Importing the FileWriter class  
import java.io.FileWriter;   
   
// Importing the IOException class for handling errors  
import java.io.IOException;   
   
class WriteToFile {  
    public static void main(String[] args) {  
      
    try {  
        FileWriter fwrite = new FileWriter("D:FileOperationExample.txt");  
        // writing the content into the FileOperationExample.txt file  
        fwrite.write("A named location used to store related information is referred to as a File.");   
   
        // Closing the stream  
        fwrite.close();   
        System.out.println("Content is successfully wrote to the file.");  
    } catch (IOException e) {  
        System.out.println("Unexpected error occurred");  
        e.printStackTrace();  
        }  
    }  
}   

// Importing the File class  
import java.io.File;   
// Importing FileNotFoundException class for handling errors  
import java.io.FileNotFoundException;   
// Importing the Scanner class for reading text files  
import java.util.Scanner;   
   
class ReadFromFile {  
    public static void main(String[] args) {  
        try {  
            // Create f1 object of the file to read data  
            File f1 = new File("D:FileOperationExample.txt");    
            Scanner dataReader = new Scanner(f1);  
            while (dataReader.hasNextLine()) {  
                String fileData = dataReader.nextLine();  
                System.out.println(fileData);  
            }  
            dataReader.close();  
        } catch (FileNotFoundException exception) {  
            System.out.println("Unexcpected error occurred!");  
            exception.printStackTrace();  
        }  
    }  
}  

// Importing the File class  
import java.io.File;   
class DeleteFile {  
  public static void main(String[] args) {   
    File f0 = new File("D:FileOperationExample.txt");   
    if (f0.delete()) {   
      System.out.println(f0.getName()+ " file is deleted successfully.");  
    } else {  
      System.out.println("Unexpected error found in deletion of the file.");  
    }   
  }   
}  
