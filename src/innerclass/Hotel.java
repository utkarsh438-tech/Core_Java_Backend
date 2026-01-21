package innerclass;

public class Hotel {
    private String hotelName;
    private int hotelRooms;
    private int hotelPrice;

    public Hotel(String hotelName, int hotelRooms, int hotelPrice) {
        this.hotelName = hotelName;
        this.hotelRooms = hotelRooms;
        this.hotelPrice = hotelPrice;
    }
    public void reserved(String Guest,int NumberRooms ) {
        class ReservationValidator{
            boolean isValid(){
                if(Guest==null || Guest.isBlank()){
                    System.out.println("Guest is blank");
                    return false;
                }
                if(NumberRooms<1 || NumberRooms>20){
                    System.out.println("Number rooms must be between 1 and 20");
                    return false;
                }
                if(NumberRooms>hotelRooms){
                    System.out.println("Number rooms must be between 1 and hotel rooms");
                    return false;
                }
                return true;
            }

        }
        ReservationValidator validator= new ReservationValidator();
        if(validator.isValid()){
            System.out.println("Reservation Successful" + Guest + "for"+ NumberRooms + " " + hotelPrice) ;
        }else{
            System.out.println("Reservation Failed");
        }
    }
}
