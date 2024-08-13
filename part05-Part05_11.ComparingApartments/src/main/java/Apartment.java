
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public int getRooms() {
        return rooms;
    }
    
    

    public boolean largerThan(Apartment compared){
        if(this.squares > compared.squares){
            return true;
        }
        return false;
    }
    
    public int totalAreaPrice(){
        int totalAreaPrice = this.squares * this.pricePerSquare;
        return totalAreaPrice;
    }
    
    public int priceDifference(Apartment compared){
        
        
        int priceDiff = Math.abs(totalAreaPrice() - compared.totalAreaPrice());
        
        return priceDiff;
        
    }
    
    public boolean moreExpensiveThan(Apartment compared){
        if(totalAreaPrice()>compared.totalAreaPrice()){
            return true;
        }
        return false;
    }
}
