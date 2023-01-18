public class CommercialPlan

{

    private int parcelNumber;

    private String address;

    private String businessType;

    private double area;

   public CommercialPlan( parcelNumber String,  address String businessType, double area) {
   super  ( parcelNumber, String address, String businessType, double area);
   
   }
 

    
    this.parcelNumber = parcelNumber;
    this.String address = String address;
    this.String businessType = String businessType;
    this.double area = double area;
    
    
    public void setParcel(int parcelNumber){
    Parcel = parcelNumber;
    }
    
    public String getParcel() {
   return Parcel;
   }
   
   
   
     public void setAddress(String address){
    Address = String Address;
    }
    
    public String getAddress() {
   return Address;
   }
   

    public void setBusiness(String businessType){
    Business = businessType;
    }
    
    public String getBusiness() {
   return Business;
   }

      public void setArea(double area){
    area = Area;
    }
    
    public String getArea() {
   return Area;
   }
  
    
    
   
   
   
   
    public String approvalProcess()

    {

        String result;

        if(area < 3000)

            result = "\n\t1-Get permit from the city commercial unit";

        else

            result = "\n\t1-Get permit from the city commercial unit\n\t2-Get approval from business office";

        return result;

    }

     public String toString()        

     System.out.println("Parcel: " + Parcel);
      System.out.println("Address: " + Address);
      System.out.println("Business: " + Business);
      System.out.println("Area: " + Area);




}