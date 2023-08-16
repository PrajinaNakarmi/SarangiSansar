public class Instrument{
    private int instrumentID; // Instrument ID is determined by the datatype integer.
    private String instrumentName;// Name of instrument determined by datatype String.
    private String CustomerName;// Name of customer is determined by datatype String.
    private String CustomerMobileNumber;// Mobile number is determined by datatype String.
    private int PANNo;// Customer permanent account number determined by datatype int.

    // Parameterized Constructor 
      public Instrument(String instrumentName)
          {
              // the values of attributes are assigned here
         this.instrumentID=instrumentID;
         this.instrumentName=instrumentName;
         this.CustomerName="";
         this.CustomerMobileNumber="";
         this.PANNo=0;
         }
     //Accessor Method
     public int getInstrumentID()//Getter to return the value of a private field
     {
         return instrumentID;
     }
     public String getInstrumentName()//Getter to return the value of private field
     {
        return instrumentName;
     }
     public String getcustomerName()// Getter to return the value of private field
     { 
         return CustomerName;
     }
    public String getcustomerMobileNumber()// Getter to return the value of private field
    {
        return CustomerMobileNumber;
    }
    public int getC_PANNo()//Getter to return the value of private field
    {
        return PANNo;
    }
    //Setter Method
    public void setinstrumentID(int instrumentID)// Setter to set the value of private field
    {
        this.instrumentID=instrumentID;
    }
    public void setinstrumentName(String instrumentName)// Setter to  set the value of private field
    {
        this.instrumentName=instrumentName;
    }
    public void setCustomerName(String CustomerName)// Setter to set the value of the private field
    { 
        this.CustomerName=CustomerName;
    }
    public void setCustomerMobileNumber( String CustomerMobileNumber)// Setter to set the value of private field
    {
        this.CustomerMobileNumber=CustomerMobileNumber;
    }
    public void setPANNo ( int PANNo)// Setter to set the value of the private field
    {
        this.PANNo=PANNo;
    }
    // Displaying the details
    public void display1() //Display method
    {
        System.out.println(" the instrument ID:"+instrumentID);
        System.out.println(" the instrument name:"+instrumentName);
        
        if(!CustomerName.equals(""))
        {
            System.out.println("Customer's Name is:"+CustomerName);
        }
        if( !CustomerMobileNumber.equals(""))
        {
            System.out.println("Customer's Mobile number is:"+CustomerMobileNumber);
    
        }
        if(PANNo !=0)
        {
            System.out.println("The Customer Permanent Account Number is:"+PANNo);

        }
    }
}
