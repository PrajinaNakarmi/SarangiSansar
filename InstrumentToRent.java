//Defining InstrumentToRent class as a sub class
public class InstrumentToRent extends Instrument//creating subclass that inheritances from instrument
   {
    private int ChargePerDay;// chargePerDay is determined by the datatype int.
    private String dateOfRent;// dateofRent is determined by the datatype String.
    private String dateOfReturn;//dateofReturn is determined by the datatype String.
    private int noOfDays;// noOfDays is determined by datatype int.
    private boolean isRented;// isRented is determined by datatype boolean.
    public InstrumentToRent (String instrumentName, int ChargePerDay)
    {
     super(instrumentName); //calling super class with one parameter
     this.ChargePerDay= ChargePerDay;
     this.dateOfRent="";
     this.dateOfReturn="";
     this.noOfDays=0;
     this.isRented= false;
    }
    //creating accessor method
    public int getchargePerDay()//getter method for ChargePerDay
    {
        return this.ChargePerDay;
    }
    public String getDateOfRent()// getter method for DateOfRent
    {
        return this.dateOfRent;
    }
    public String getDateOfReturn()//getter method for DateofReturn
    {
        return this.dateOfReturn;
    }
    public int getNoOfDays()//getter method for NoOfDays
    {
        return this.noOfDays;
    }
    public boolean getIsRented()//getter method for IsRented
    {
        return this.isRented;
    }
    // creating setter method to all the attributes
    public void setChargePerday(int ChargePerday)//setter method for ChargePerDay
    {
        this.ChargePerDay=ChargePerDay;
    }
    public void setdateOfRent(String dateOfRent)//Setter method for dateOfRent
    {
       this.dateOfRent=dateOfRent;
    }
    public void setdateOfReturn(String dateOfReturn)//Setter method for dateOfReturn
    {
        this.dateOfReturn= dateOfReturn;
    }
    public void setnoOfDays( int noOfDays)//setter method for noOfDays
    {
        this.noOfDays= noOfDays;
    }
    public void setisRented( boolean isRented)//Setter method for isRented
    {
        this.isRented= isRented;
    }
     /** Method to rent out the instrument to a customers*/
     public void Rent (String CustomerName, String CustomerMobileNumber, int PANNo, String dateOfRent, String dateOfReturn, int noOfDays)
     {
         if(this.isRented == true) // if the instrument is not available
           {  System.out.println(" The instrument is not available. It is rented at the moment.");
             System.out.println(" Customer Name: "+getcustomerName());//
             System.out.println(" Customer Mobile number: "+getcustomerMobileNumber());
             System.out.println(" Return date: "+dateOfReturn);
            }
             else// if the instrument is available
                    {
                    super.setCustomerName(CustomerName);
                     super.setCustomerMobileNumber(CustomerMobileNumber);
                     super.setPANNo(PANNo);
                     this.dateOfRent = dateOfRent;
                     this.dateOfReturn = dateOfReturn;
                     this.noOfDays= noOfDays;
                     this.isRented= true;
                     float totalCharge= noOfDays * ChargePerDay;   
             }
         }
         /** method to return the instrument*/
    //this is the method to return the instrument
        public void Return()
        {
               if(isRented==true) {
                setCustomerName("");
                setCustomerMobileNumber("");
                setPANNo(0);
                dateOfRent="";
                dateOfReturn="";
                isRented=false;
                System.out.println("Returned Successfully.");
            }
            else {
                System.out.println("Is not rented.");
            }
        }
        
        /** Method to display the details*/
    // This is a display method of subclass InstrumentToRent
        public void Display()
        {
           super.display1(); //calling the display method of Instrument class to display the InstrumentID and InstrumentName
           if(isRented == true) {
               System.out.println("Customer Name: "+ getcustomerName());
               System.out.println("Customer Mobile Number: "+getcustomerMobileNumber());
               System.out.println(" Customer PAN no: "+getC_PANNo());
               System.out.println(" Date of renting: "+getDateOfRent());
               System.out.println(" Date of returning: "+getDateOfReturn());
           }
        }
     }
     