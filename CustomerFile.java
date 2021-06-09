/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import createstakeholderser.java.Customer;
import java.io.EOFException; 
import java.io.File; 
import java.io.FileInputStream; 
import java.io.FileNotFoundException; 
import java.io.FileOutputStream; 
import java.io.IOException; 
import java.io.ObjectInputStream; 
import java.io.ObjectOutputStream; 
import java.io.Serializable; 
import java.util.ArrayList; 
import java.util.function.Supplier;
/**
 *
 * @author Siwaphiwe Mpafa
 */
public class CustomerFile {
    private ObjectInputStream input;
    Customer customer;
    Supplier supplier;
    ArrayList<customer> customerLst new ArrayList<>();
    ArrayList<supplier> supplierLst new ArrayList<>();
    
    public void openFile() {
        try {
            input = new ObjectInputStream(new FileInputStream("stakeholder.ser"));
            System.out.println("ser file open for reading");
        }catch (IOException ioe) {
            System.out.println("fail opening ser file" + ioe.getMessage());
            
            
        }
    }

    private void closeFile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class supplier {

        public supplier() {
        }
    }
    public void close File(){
        try{
            input.close();
        }catch (IOException ioe) {
            System.out.println("fail closing ser file");
        }
    }

        public void readFile() throws IOException {
   try {
       
       while (true){
           customer = (Customer) input.readObject();
           supplier = (Supplier) input.readObject();
           System.out.println(customer);
           boolean Supplier = false;
           System.out.println(Supplier);
       }
   }catch (ClassCastException ioe) {
       System.out.println("Class cast exception handled:" +ioe);
   }catch (EOFException eofe){
       System.out.println("EOF reached");
   }catch (ClassNotFoundException ioe){
       System.out.println("class error readingser file");
   }finally {
       closeFile();
       System.out.println("file is closed");
   }
        }
}

