
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }
    
   
    
    public Money plus(Money addition){
       int eurosAdded = addition.euros()+this.euros;
       int centsAdded = addition.cents()+this.cents;
       if(centsAdded >= 100){
           eurosAdded = eurosAdded + 1;
           centsAdded = centsAdded - 100;
       }
       Money newMoney = new Money(eurosAdded, centsAdded);
       return newMoney;
    }
    
    public boolean lessThan(Money compared){
        Money newMoney = new Money(this.euros, this.cents);
        if(compared.euros() > newMoney.euros()){
            return true;
            
        }
        if(compared.euros() == newMoney.euros() && compared.cents() > newMoney.cents()){
            return true; 
        }
        return false;
    }
    
    public Money minus(Money decreaser){
        int eurosMins = 0;
        int centsMins = 0;
        if(this.cents < decreaser.cents()){
            eurosMins = this.euros - 1;
            centsMins = this.cents + 100;
            eurosMins = eurosMins - decreaser.euros();
            centsMins = centsMins - decreaser.cents();
            
        } else {
            eurosMins = this.euros - decreaser.euros();
            centsMins = this.cents - decreaser.cents();
        }
        
        
        Money newMoney = new Money(eurosMins, centsMins);
        if(newMoney.euros() < 0){
            newMoney = new Money(0,0);
        }
        return newMoney;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
