/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createstakeholderser.java;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Siwaphiwe Mpafa
 */
public class RunCustomer {
    public class ReadStakeholderSer implements Serializable {

 private ObjectInputStream input;
    Stakeholder stakeholder;
    Stakeholder[] stakeholderArray = new Stakeholder[0];
    
     ArrayList<Customer> cust;
    ArrayList<Supplier> supp;
    ArrayList<Integer> age;
    int c = 0;
    
    public void readStakeholder(){
        cust = new ArrayList();
        supp = new ArrayList();
        age = new ArrayList();
    }
    

    public void openFile() {
        try {
            input = new ObjectInputStream(new FileInputStream("stakeholder.ser"));
            System.out.println(" ======== file open for reading ============");
        } catch (IOException ioe) {
            System.out.println(" ========== error opening file =============== " + ioe.getMessage());
        }
    }

    public void closeFile() {
        try {
            input.close();
        } catch (IOException ioe) {
            System.out.println(" ============ error closing the file ============" + ioe.getMessage());
        }
    }

    public void readFromFile() {
        try {
            while (true) {
                stakeholder = (Stakeholder) input.readObject();
                System.out.println(stakeholder);

            }
        }
            catch (IOException eofe) { 
            System.out.println("eof reached");     

        }
            catch (ClassNotFoundException ioe) {
            System.out.println(" class error reading " + ioe);

       
        }
            finally { 
            closeFile();
            System.out.println("file has been closed");
        }
    }
           public static void main(String args[])  {
            ReadStakeholderSer obj = new ReadStakeholderSer();
            obj.openFile();
            obj.readFromFile();
        }
    }
    
}
