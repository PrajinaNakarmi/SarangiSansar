import java.awt.event.*;// for dealing with different types of events by awt components
import javax.swing.*;//provides interface
import java.awt.Color;//for color
import java.awt.Font;//for designing
import java.util.ArrayList;//to store collection of elements
public class SarangiSansar implements ActionListener  
 
/* 
 * Creating class SarangiSansar
 * By ActionListener action will be triggered on clicking the button.
 */
{
  JFrame j;//creating JFrame
  JLabel t1,r,r1,r2,r3,r4,r5,r6,r7,r8,s1,s2,s3,s4,s5,s6,s7,s8;//JLabel
  JTextField t2,t3,t4,t5,t6,t7,tf1,tf2,tf3,tf4,tf5,tf6;//JTextField
  JButton a,rent,rt2,a2,sell,dis,clr,dis2;//JButton
  JComboBox date,month,year,date1,month1,year1,date2,month2,year2;//JComboBox
  
  ArrayList <Instrument> instrument = new ArrayList <Instrument>();//arraylist to store InstrumentToRent and InstrumentToSell
  public SarangiSansar()//constructor of SarangiSansar class
  {
      j = new JFrame("Sarangi Sansar");
      Color c1= new Color(182,205,242);
      j.getContentPane().setBackground(c1);//setting background
      
      t1 = new JLabel("Sarangi Sansar");
      t1.setBounds(501,42,225,46); //giving position and size 
      t1.setFont(new Font("Times New Roman",Font.PLAIN,36));
      
      r= new JLabel("Rent");
      r.setBounds(154,107,100,56);
      r.setFont(new Font("Georgia",Font.PLAIN,30));
      
      r1= new JLabel("Instrument Name");
      r1.setBounds(154,166,145,25);
      r1.setFont(new Font("helvetica",Font.PLAIN,18));
      
      t2= new JTextField();
      t2.setBounds(349,170,192,21);
      
      r2= new JLabel("Charge Per Day");
      r2.setBounds(597,170,140,21);
      r2.setFont(new Font("helvetica",Font.PLAIN,18));
      
      t3= new JTextField();
      t3.setBounds(768,170,192,22);
      
      a= new JButton("Add");
      a.setBounds(1025,170,100,25);
      a.setFont(new Font("helvetica",Font.PLAIN,18));
      
      
      r3= new JLabel("Customer Name");
      r3.setBounds(154,223,133,25);
      r3.setFont(new Font("helvetica",Font.PLAIN,18));
      
      t4= new JTextField();
      t4.setBounds(349,222,192,21);
      
      r4= new JLabel("Customer Phone No.");
      r4.setBounds(154,272,171,25);
      r4.setFont(new Font("helvetica",Font.PLAIN,18));
      
      t5=new JTextField();
      t5.setBounds(349,274,192,21);
      
      r5= new JLabel("Rent Date");
      r5.setBounds(154,322,96,21);
      r5.setFont(new Font("helvetica",Font.PLAIN,18));
      // creating a drop-down list for combobox
      String Date[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29",
          "30"};
      date = new JComboBox(Date);
      date.setBounds(345,318,53,25);
      date.setFont(new Font("helvetica",Font.PLAIN,18));
      
      String Month[]={"jan","feb","mar","apr","may","jun","jul","aug","sept","oct",
          "nov","dec"};
      month= new JComboBox(Month);
      month.setBounds(408,318,58,25);
      month.setFont(new Font("helvetica",Font.PLAIN,18));
      
      String Year[]={"2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010"};
      year=new JComboBox(Year);
      year.setBounds(476,318,69,26);
      year.setFont(new Font("helvetica",Font.PLAIN,18));
      
      r6= new JLabel("Customer Pan No");
      r6.setBounds(597,218,149,25);
      r6.setFont(new Font("helvetica",Font.PLAIN,18));
      
      t6= new JTextField();
      t6.setBounds(768,218,192,21);
      
      r7= new JLabel("Return Date");
      r7.setBounds(599,268,98,25);
      r7.setFont(new Font("helvetica",Font.PLAIN,18));
      
      String Date1[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29",
          "30"};
      date1=new JComboBox(Date1);
      date1.setBounds(771,265,53,25);
      date1.setFont(new Font("helvetica",Font.PLAIN,18));
      
      String Month1[]={"jan","feb","mar","apr","may","jun","jul","aug","sept","oct",
          "nov","dec"};
      month1= new JComboBox(Month1);
      month1.setBounds(835,265,58,25);
      month1.setFont(new Font("helvetica",Font.PLAIN,18));
      
      
      String Year1[]={"2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010"};
      year1=new JComboBox(Year1);
      year1.setBounds(904,265,69,25);
      year1.setFont(new Font("helvetica",Font.PLAIN,18));
      
      r8= new JLabel("No of Renting Days");
      r8.setBounds(154,372,164,25);
      r8.setFont(new Font("helvetica",Font.PLAIN,18));
      
      t7=new JTextField();
      t7.setBounds(345,376,192,21);
      
      rent= new JButton("Rent");
      rent.setBounds(758,366,100,25);
      rent.setFont(new Font("helvetica",Font.PLAIN,18));
      
      rt2= new JButton("Return");
      rt2.setBounds(873,366,100,25);
      rt2.setFont(new Font("helvetica",Font.PLAIN,18));
      
      s1= new JLabel("Sell");
      s1.setBounds(154,419,49,34);
      s1.setFont(new Font("Georgia",Font.PLAIN,30));
      
      s2=new JLabel("Instrument Name");
      s2.setBounds(154,471,192,25);
      s2.setFont(new Font("helvetica",Font.PLAIN,18));
      
      tf1= new JTextField();
      tf1.setBounds(345,471,192,21);
      
      s3= new JLabel("Customer Name");
      s3.setBounds(154,519,153,25);
      s3.setFont(new Font("helvetica",Font.PLAIN,18));
      
      tf2= new JTextField();
      tf2.setBounds(345,519,192,21);
      
      s4= new JLabel("Customer Phone No.");
      s4.setBounds(154,571,171,25);
      s4.setFont(new Font("helvetica",Font.PLAIN,18));
      
      tf3=new JTextField();
      tf3.setBounds(345,567,192,21);
      
      s5=  new JLabel("Sell Date");
      s5.setBounds(154,616,74,25);
      s5.setFont(new Font("helvetica",Font.PLAIN,18));
      
       String Date2[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29",
          "30"};
      date2= new JComboBox(Date2);
      date2.setBounds(345,616,53,25);
      date2.setFont(new Font("helvetica",Font.PLAIN,18));
      
      String Month2[]={"jan","feb","mar","apr","may","jun","jul","aug","sept","oct",
          "nov","dec"};
      month2= new JComboBox(Month2);
      month2.setBounds(408,616,58,25);
      month2.setFont(new Font("helvetica",Font.PLAIN,18));
      
      String Year2[]={"2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010"};
      year2=new JComboBox(Year2);
      year2.setBounds(476,616,69,26);
      year2.setFont(new Font("helvetica",Font.PLAIN,18));
      
      s6=new JLabel("Price");
      s6.setBounds(599,471,42,25);
      s6.setFont(new Font("helvetica",Font.PLAIN,18));
      
      tf4=new JTextField();
      tf4.setBounds(781,472,192,21);
      
      a2=new JButton("Add");
      a2.setBounds(1038,468,100,25);
      a2.setFont(new Font("helvetica",Font.PLAIN,18));
      
      s7= new JLabel("Customer PAN No.");
      s7.setBounds(595,521,167,25);
      s7.setFont(new Font("helvetica",Font.PLAIN,18));
      
      tf5= new JTextField();
      tf5.setBounds(781,519,192,21);
      
      s8= new JLabel("Discount Percentage");
      s8.setBounds(591,565,180,25);
      s8.setFont(new Font("helvetica",Font.PLAIN,18));
      
      tf6= new JTextField();
      tf6.setBounds(781,565,192,21);
      
      sell=new JButton("Sell");
      sell.setBounds(154,664,100,25);
      sell.setFont(new Font("helvetica",Font.PLAIN,18));
      
      dis= new JButton("Display");
      dis.setBounds(923,664,100,25);
      dis.setFont(new Font("helvetica",Font.PLAIN,18));
      
      clr= new JButton("Clear");
      clr.setBounds(1038,664,100,25);
      clr.setFont(new Font("helvetica",Font.PLAIN,18));
      
      dis2 = new JButton("Display");
      dis2.setBounds(1025,365,100,25);
      dis2.setFont(new Font("helvetica",Font.PLAIN,18));
      // adding components to the frame
      j.add(t1);
      j.add(r);
      j.add(r1);
      j.add(t2);
      j.add(r2);
      j.add(t3);
      j.add(a);
      j.add(r3);
      j.add(t4);
      j.add(r4);
      j.add(t5);
      j.add(r5);
      j.add(date);
      j.add(month);
      j.add(year);
      j.add(r6);
      j.add(t6);
      j.add(r7);
      j.add(date1);
      j.add(month1);
      j.add(year1);
      j.add(r8);
      j.add(t7);
      j.add(s1);
      j.add(s2);
      j.add(tf1);
      j.add(s3);
      j.add(tf2);
      j.add(s4);
      j.add(tf3);
      j.add(date2);
      j.add(month2);
      j.add(year2);
      j.add(s5);
      j.add(tf4);
      j.add(s6);
      j.add(tf5);
      j.add(s7);
      j.add(tf6);
      j.add(rent);
      j.add(rt2);
      j.add(a2);
      j.add(sell);
      j.add(dis);
      j.add(clr);
      j.add(s8);
      j.add(dis2);
        
      //declaring size, visibility and turning auto layout off
      j.setLayout(null);
      j.setSize(1249,769);
      j.setVisible(true);
      //execute codes whenever a user clicks the buttons
      clr.addActionListener(this);
      a.addActionListener(this);
      a2.addActionListener(this);
      sell.addActionListener(this);
      rent.addActionListener(this); 
      rt2.addActionListener(this);
      dis2.addActionListener(this);
      dis.addActionListener(this);
    }
  public void actionPerformed(ActionEvent e)//invokes automatically whenever you click the button
    {
         if(e.getSource() ==clr)// determining clear button was clicked
        {
            t2.setText("");
            t3.setText("");
            tf1.setText("");
            tf4.setText("");
            t4.setText("");
            t5.setText("");
            t6.setText("");
            t7.setText("");
            tf2.setText("");
            tf3.setText("");
            tf5.setText("");
            tf6.setText("");
        }
         if(e.getSource() == a)  // determining AddInstrumentToRent button was clicked
        {
            boolean value = false;  // assigning false to a boolean variable value
            //checking if instrument name and charge per day textfield is empty or not
            if(t2.getText().isEmpty() && t3.getText().isEmpty())
            {
                // if they are empty then display message in gui
                JOptionPane.showMessageDialog(j,"please fill both instrument name and charge per day","error",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                try{
                    String rent= t2.getText();
                    int charge = Integer.parseInt(t3.getText());
                    if(instrument.size()==0)  // checking if arraylist is empty
                    {
                        // creating a object for InstrumentToRent class
                        InstrumentToRent insR = new InstrumentToRent(t2.getText(),Integer.parseInt(t3.getText()));
                        instrument.add(insR); // add input to arraylist
                        JOptionPane.showMessageDialog(j,"your instrument for rent has been added!");
                    }
                    else
                    {
                        for(Instrument inst: instrument )  
                        {
                            // checking whether instrument is instance of InstrumentToRent class or not
                            if(inst instanceof InstrumentToRent)
                            {
                                //checking if same instrument is being added or not
                                if(inst.getInstrumentName().equals(t2.getText()))
                                {
                                    value = true;
                                    break;
                                }
                            }
                        }
                        if(value == false)
                        {
                            // creating a object for InstrumentToRent class
                            InstrumentToRent obj1 = new InstrumentToRent(t2.getText(), Integer.parseInt(t3.getText()));
                            instrument.add(obj1);  // adding in arraylist
                            JOptionPane.showMessageDialog(j,"your instrument for rent has been added!");
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(j,"You cannot add same instrument","ALERT",JOptionPane.WARNING_MESSAGE);//displaying error message
                        }
                    }
                }
                catch(NumberFormatException r)//this code is executed if the exception handler is invoked
                {
                    JOptionPane.showMessageDialog(j,"You have to enter Integer in charge per day!","error",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        if(e.getSource() == a2)// determining AddInstrumentSell button was clicked
        {
            boolean value = false;// assigning false to a boolean variable value
            if(tf1.getText().isEmpty() && tf4.getText().isEmpty()){
                JOptionPane.showMessageDialog(j,"please fill Instrument Name and Price!!","error",JOptionPane.ERROR_MESSAGE);
            }
            else{
                try
                {
                     // if user inputs string in textfield in which we want as integer than throws NumberFormatException
                    String s2 = tf1.getText();
                    Float price = Float.parseFloat(tf4.getText());
                    if(instrument.size()==0){
                        InstrumentToSell inSr = new InstrumentToSell(tf1.getText(),Float.parseFloat(tf4.getText()));
                        instrument.add(inSr);
                        JOptionPane.showMessageDialog(j,"Your instrument for sell has been added to sell!!");
                    }
                    else{
                        for(Instrument inst : instrument)
                        {
                             // checking weather instrument is instance of InstrumentToSell class or not
                            if(inst instanceof InstrumentToSell){
                                if(inst.getInstrumentName().equals(tf1.getText()))
                                {
                                    value = true;
                                    break;
                                }
                            }
                        }    
                        if(value == false)
                            {
                            InstrumentToSell obj2 = new InstrumentToSell(tf1.getText(), Float.parseFloat(tf4.getText()));
                            instrument.add(obj2);
                            JOptionPane.showMessageDialog(j,"Your instrument has been added to sell!!");
                        }
                        else{
                            JOptionPane.showMessageDialog(j,"Instrument is not available!!");
                        }
                    }
                }
                catch(NumberFormatException r)
                {
                    JOptionPane.showMessageDialog(j,"You have to enter number in price!","error",JOptionPane.ERROR_MESSAGE);
                    
                }
            }  
        }
        if(e.getSource() == rent)
        {
            boolean rent = false; //assigning false to a boolean variable rent
            if(t4.getText().isEmpty() && t5.getText().isEmpty() && t6.getText().isEmpty() && t7.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(j,"Please fill Customer name,Phone No,Customer PAN no and no of renting days!","error",JOptionPane.ERROR_MESSAGE);
            }
            else
                {
                  try
                {
                    // if user inputs string in textfield in which we want as integer than throws NumberFormatException
                    String name = t4.getText();
                    String phone = t5.getText();
                    int pan = Integer.parseInt(t6.getText());
                    int days = Integer.parseInt(t6.getText());
                    // using for each loop to iterate through the arraylist
                for(Instrument inst : instrument)
                {
                    String r5 = date.getSelectedItem()+" "+month.getSelectedItem()+" "+year.getSelectedItem();
                    String r7 = date1.getSelectedItem()+" "+month1.getSelectedItem()+" "+year1.getSelectedItem();
                    if(inst instanceof InstrumentToRent){
                        //downcasting
                        InstrumentToRent c  = (InstrumentToRent) inst;
                        if(c.getInstrumentName().equals(t2.getText()))
                        {
                            if(c.getIsRented() == true){
                                JOptionPane.showMessageDialog(j,"Instrument is already rented!","ALERT",JOptionPane.WARNING_MESSAGE);
                            }
                            else{
                                JOptionPane.showMessageDialog(j,"Instrument is rented!");
                            }
                            c.Rent(t4.getText(),t5.getText(),Integer.parseInt(t6.getText()),r5,r7,Integer.parseInt(t7.getText()));
                            rent = true;
                            break;
                        }
                    }
                }
                if(rent == false){
                    JOptionPane.showMessageDialog(j,"instrument is not available!!","error",JOptionPane.ERROR_MESSAGE);
                }
            }
             // this code is executed if the exception handler is invoked i.e NumberFormatException
                catch(NumberFormatException r)
                {
                    JOptionPane.showMessageDialog(j,"Customer pan no and No of renting days must be in integer!","error",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
         else if (e.getSource() == sell) { // to sell
            try {
                String instName = tf1.getText();
                String CustName = tf2.getText();
                String Phone = tf3.getText();
                String PAN = tf5.getText();
                String discount = tf6.getText();
                
                String date = date2.getSelectedItem() + " " + month2.getSelectedItem() + " " + year2.getSelectedItem();
                

                boolean checker = false; // assigning false to a boolean variable sell
                if (instName.isEmpty() || CustName.isEmpty() || Phone.isEmpty() || PAN.isEmpty()
                        || discount.isEmpty() || date.isEmpty()) //checking if customer name, customer phone, customer PAN and discount percentage textfield is empty or not
                        {
                    throw new Exception();
                } else {
                    if (instrument.isEmpty())   // if they are empty then display message in gui
                    {
                        JOptionPane.showMessageDialog(j, "No instruments are added to sell.", "INFO",
                                JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        for (Instrument inst : instrument) {
                            if (inst instanceof InstrumentToSell && instName.equals(inst.getInstrumentName())) {
                                InstrumentToSell c = (InstrumentToSell) inst;  // downcasting is performed of Instrument as InstrumentToSell
                                if (c.getIsSold()) {
                                    JOptionPane.showMessageDialog(j, "The instrument is already sold.", "INFO",
                                            JOptionPane.INFORMATION_MESSAGE);
                                    checker = true;    // checking if instrument is sold
                                } else {
                                    c.Sell(CustName, Phone, Integer.parseInt(PAN), date, Float.parseFloat(discount));// calling sell method of InstrumentToSell class by object of Instrument class
                                    JOptionPane.showMessageDialog(j,"Thankyou! The instrument is sold!",
                                            "INFO", JOptionPane.INFORMATION_MESSAGE);
                                }

                            }
                        }
                    }
                }
            } catch (NumberFormatException es) // this code is executed if the exception handler is invoked
            {
                JOptionPane.showMessageDialog(j, "Enter integer value in PAN field!!", "Warning Message",
                        JOptionPane.ERROR_MESSAGE);

            } catch (Exception es) {
                JOptionPane.showMessageDialog(j,
                        "Enter value in Instrument name field, Customer name field, Phone field, PAN field, Discount and Date Field!!",
                        "Warning Message", JOptionPane.ERROR_MESSAGE);

            }
        }
          if(e.getSource() == rt2)   // // determining return button was clicked
           {
            boolean retn_ = false;
            InstrumentToRent instr=null;
            try
            {
                for(Instrument inst : instrument)
                {
                    if(inst instanceof InstrumentToRent)
                    {
                        InstrumentToRent c  = (InstrumentToRent) inst;
                        if(c.getInstrumentName().equals(t2.getText()))    
                        {
                            retn_=true;
                            instr = c;
                           
                        }
                    }
            }
        if(retn_ == true)
            {
        InstrumentToRent ins  = (InstrumentToRent) instr;
            if(ins.getIsRented() == true)
            {
              ins.Return();
                JOptionPane.showMessageDialog(j,"Instrument is returned!");
            }
        else{
                JOptionPane.showMessageDialog(j,"Instrument was not rented!","error",JOptionPane.ERROR_MESSAGE);
                 }
             }
        }
          catch(NumberFormatException r) // this code is executed if the exception handler is invoked 
            {
                JOptionPane.showMessageDialog(j,"INVALID INPUT","error",JOptionPane.ERROR_MESSAGE);
            }
        }
        if(e.getSource() == dis2)
        {
             // using for each loop to iterate through the arraylist
            for(Instrument inst : instrument)
            {
                  // checking weather instrument is instance of InstrumentToRent class or not
                if(inst instanceof InstrumentToRent)
                {
                    //downcasting
                    InstrumentToRent c  = (InstrumentToRent) inst;
                    c.Display();
                }
            }
        }
               else if(e.getSource() == dis)
        {
             // using for each loop to iterate through the arraylist
            for(Instrument inst : instrument)
            {                
                if(inst instanceof InstrumentToSell)
                {
                       // downcasting
                    InstrumentToSell c  = (InstrumentToSell) inst;
                    c.display();
                }
            }
        }
    }  

  public static void main(String[] args)   // main method
    {
        // constructor is called
        new SarangiSansar();
    }
}
