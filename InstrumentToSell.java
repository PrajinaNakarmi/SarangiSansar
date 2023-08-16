// Defining InstrumentToSell as sub class 
public class InstrumentToSell extends Instrument//creating a sub class that inheritances from Instrument class
     {
    private float price; 
    private String sellDate;
    private float discountPercent;
    private boolean isSold;
    public InstrumentToSell(String InstrumentName, float price)// constructor for InstrumentRToSell class with 2 parameters.
    {
        super(InstrumentName);// to call InstrumentName constructor
        this.price= price;
        this.sellDate="";
        this.discountPercent=0;
        this.isSold= false;
    }
    //Accessor Method
    public float getPrice() //Getter to return the value of a private field
    {
        return price;
    }
    public String getSellDate() //Getter to return the value of a private field
    {
        return sellDate;
    }
    public float getdiscountPercent() //Getter to return the value of a private field
    {
        return discountPercent;
    }
    public boolean getIsSold() //Getter to return the value of a private field
    {
        return isSold;
    }
    //Mutator method
    public void setPrice (float price) //Setter to set teh value of the private field
    {
       if(isSold == false)
        {
            this.price= price;
        }
        else 
       { 
        System.out.println("It is not possible to change the price!");
           }
    }
     public void setsellDate(String sellDate) //Setter to set the value of the private field
    {
       this.sellDate=sellDate;
     }
    public void setdiscountPercent(float discountPercent)//Setter to set the value of the private field
    {
       this.discountPercent=discountPercent;
    
    }
    public void setisSold (boolean isSold)//Setter to set the value of the private field
    {
     this.isSold = isSold;
    }
    //This is the method to sell the instrument
    public void Sell (String CustomerName, String CustomerMobileNumber, int PANNo ,String sellDate, float DiscountPercent)
    {
            if(isSold==true) {
               this.sellDate=sellDate;
               this.discountPercent = discountPercent;
               this.isSold = true;
               super.setCustomerName(CustomerName);
               super.setPANNo(PANNo);
               float Discountamount = price - (discountPercent * price);
            }
            else {
                setCustomerName(CustomerName);
                setCustomerMobileNumber(CustomerMobileNumber);
                setPANNo(PANNo);
                this.sellDate=sellDate;
                this.discountPercent=discountPercent;
                isSold=true;
                System.out.println("Successfully Sold.");
            }

        }

        public void display() {
            super.display1();
            System.out.println("Price:"+price);
            if(isSold==true) {
                System.out.println("Customer Name:"+getcustomerName());
                System.out.println("Customer Number:"+getcustomerMobileNumber());
                System.out.println("PAN number:"+getC_PANNo());
                System.out.println("Sold Date:"+sellDate);
                System.out.println("Discounted Price:"+((100-discountPercent)*price/100));

            }
        }
}