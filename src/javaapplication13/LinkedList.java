/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

import java.util.Date;
import static javaapplication13.insert.l1;
import static javaapplication13.search.previous;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

class LinkedList

{

        protected Node start;

    public int size;

 

    /* Constructor */

    public LinkedList()

    {

        start = null;

        size = 0;

    }

    /* Function to check if list is empty */

    public boolean isEmpty()

    {

        return start == null;

    }

    /* Function to get size of list */

    public int getSize()

    {

        return size;

    }

    /* Function to insert element */

    public void insert(info val)

    {

        Node nptr = new Node(val, null, null);
        Node tmp, ptr;        
        boolean ins = false;
        if(start == null)
            start = nptr;
        else if (val.getName().compareTo(start.getData().getName()) < 0)
        {
            nptr.setLinkNext(start);
            start.setLinkPrev(nptr);
            start = nptr;
        }
        else
        {
            tmp = start;
            ptr = start.getLinkNext();
            while(ptr != null)
            {                            
                if(val.getName().compareTo( tmp.getData().getName()) > 0 && val.getName().compareTo( ptr.getData().getName()) < 0)
               {
                    tmp.setLinkNext(nptr);
                    nptr.setLinkPrev(tmp);
                    nptr.setLinkNext(ptr);
                    ptr.setLinkPrev(nptr);
                    ins = true;
                    break;
               }
                else
                {
                    tmp = ptr;
                    ptr = ptr.getLinkNext();
                }
            }
            if(!ins)
            {
                tmp.setLinkNext(nptr);
                nptr.setLinkPrev(tmp);
            }
        }
        size++;
    }

    /* Function to delete node at position */
public void delete(String str,int ad)
    {
        Node temp = start;      
        Node prev = temp;       
        if(start == null)
        {
            JOptionPane.showMessageDialog(null,"The list is empty");
            return ;
        }
        info in = temp.getData();
        if(start != null)
        {
            while(!(in.getName().equalsIgnoreCase(str)) && temp.getLinkNext() != start)
            {
                prev = temp;
                temp = temp.getLinkNext();
                in = temp.getData();
            
        }       
       while((prev == temp) && (in.getName().equalsIgnoreCase(str)))
        {
            if(in.getId()== ad){
            start = start.getLinkNext();           
            size--;
            JOptionPane.showMessageDialog(null, "Record for " + str + " has been deleted"); 
            return;
            }
            else{
                temp = temp.getLinkNext();
                in = temp.getData();
            } 
                
       }      
     while (in.getName().equalsIgnoreCase(str))
       {
           if(in.getId()== ad){
            prev.setLinkNext(temp.getLinkNext());
           size--;
            JOptionPane.showMessageDialog(null, "Record for " + str + " has been deleted"); 
          
        }
      else{
                temp = temp.getLinkNext();
                in = temp.getData();
            } 
        
      //  else
      //  {
      //  JOptionPane.showMessageDialog(null, "Record for " + str + " has not been deleted");
      //  return ;
     //   }
        
       
    }
        
    }

    }

    public String display()

    {      
    
       Node temp = l1.start;
         String str1 ;
         String str2 = "";
        
         
         if (temp == null)
             str2 = "Linked List is Empty";
         else{
         while(temp!= null){
             
             str1 =  "|   "+temp.getData().getId()+"\t|   "+temp.getData().getName()+"\t|   "
                 +temp.getData().getAge()
                +"\t|   "+temp.getData().getNationlty()+"\t|   "+temp.getData().getPassport()+"\t|   "
                 +temp.getData().getEmail()
                 +"\t|\n";
        str2 = str2 + str1;
             temp = temp.getLinkNext();
         }
         
         } 
        return str2;  
    }
    
    
    
    
    
        public String Search(String str, int id) {           
Node temp = start;
   String str1;   
   
        if (temp == null) {       
            str1= "sorry there is no record currently in the system";  
            return str1;           
        }     
         info in = temp.getData();        
        if (start != null)
        {
             while(!(in.getName().equalsIgnoreCase(str)) && temp.getLinkNext() != start )
            {
                temp = temp.getLinkNext();
                in  = temp.getData();
            }
        }
        while(in.getName().equalsIgnoreCase(str)){
        if(in.getId() != id ){
            
            temp = temp.getLinkNext();
            in  = temp.getData();
            continue;
        }
        str1 = "ID: "+in.getId()+"\nName: "+in.getName()+"\nAge: "
                +in.getAge()
                +"\nNationality: "+in.getNationlty()+"\nPassport: "+in.getPassport()
                +"\nEmail: "+in.getEmail(); 
        return str1;
        }
        
       
            
            showMessageDialog(null,str+" is not in the list"); 
            str1 = str+" is not found";    
        
        
        
        return str1;
        }
 
}
 