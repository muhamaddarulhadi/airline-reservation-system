
package airlinereservationsystem;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class personlist
{
    
    Node head;
    int count;
    int no=1;
    
    personlist()
    {
        head=null;
        count=0;
    }
    
    public void add(person obj)
    {
        Node newNode=new Node(obj);
        if(head==null) {                     //add to first
            head=newNode;
        } else
        {
            Node current=head;
            while(current.getLink()!=null) {
                current=current.getLink();
            }
            current.setLink(newNode);
        }
        count++;
    }
    
    public void display(DefaultTableModel model)//draft
    { 
        Node current=head;
        person temp;

            while(current!=null)
            {
                temp=(person)current.getObj();
                model.addRow(new Object[]{no,temp.getName(),temp.getPassport(),temp.getDestination(),temp.getSeat()});
                current=current.getLink();
                no++;
            }
    }
    
    public void removeRow(DefaultTableModel model)
    {
        for(int remove=model.getRowCount()-1; remove>=0; remove--)
        model.removeRow(remove);
        no=1;
    }
    
    public void update(int oldpassport,String setseat)
    {
        Node current=head;   
        person tempobj;
        while(current!=null)
        {
            tempobj=(person)current.getObj();
            if(oldpassport==tempobj.getPassport())
            {
                tempobj.setSeat(setseat);
            }
            current=current.getLink();
        }
    }
    
    
    public void delete(int passport)
    {
        Node before = null;
        Node current = head;
        person tempobj1;
        boolean delete=false;
        boolean loop=false;
        
        person test=(person)head.getObj();
        
        if(head==null)
            JOptionPane.showMessageDialog(null, "List is empty", "Error",JOptionPane.ERROR_MESSAGE);
        else if((test.getPassport()==passport))
            head=head.getLink();
        else
        {
        while(delete==false && current!=null)
        {
            tempobj1=(person)current.getObj();
            loop=false;
            while((tempobj1.getPassport()!=passport))
            {
                before=current;
                current=current.getLink();
                loop=true;
            }
            if((tempobj1.getPassport()==passport))
            {
                before.link=current.link;
                delete=true;
            }
        }
    } 
    }
}
