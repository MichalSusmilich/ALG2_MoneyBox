package MoneyBox;

/**
 *
 * @author susmi
 */
public class MoneyBox {
    //private String jmeno;
    private String majitel;
    //private int suma;
    private int koruna;
    private int dvoukoruna;

    public MoneyBox(int koruna, int dvoukoruna, String majitel) {
        //this.jmeno = jmeno;
        this.majitel = majitel;
        //this.suma = suma;
        this.koruna = koruna;
        this.dvoukoruna = dvoukoruna;
    }
    public MoneyBox(String majitel){
        this(0,0,majitel);
    }

    public String getMajitel() {
        return majitel;
    }

    public int getKoruna() {
        return koruna;
    }

    public int getDvoukoruna() {
        return dvoukoruna;
    }

    public void setMajitel(String majitel) {
        this.majitel = majitel;
    }

    public int moneySum() {
        return koruna + 2*dvoukoruna;
    }

    public void addKoruna(int koruna) {
        this.koruna += koruna;
    }

    public void addDvoukoruna(int dvoukoruna) {
        this.dvoukoruna += dvoukoruna;
    }
    public void addMoney(int koruna, int dvoukoruna){
        addKoruna(koruna);
        addDvoukoruna(dvoukoruna);
        /*this.koruna += koruna;
        this.dvoukoruna += dvoukoruna;*/
        
    }
    @Override
    public String toString(){
        return majitel + " ma v pokladničce " + moneySum() + "Kč - " + koruna + "x1Kč, " + dvoukoruna + "x2Kč";
    }
    public boolean canBuy(int num){
        if(moneySum()>=num){
            return true;
        }
        return false;
    }
    public void transferMoney(MoneyBox komu, int koruna, int dvoukoruna){
        if(this.koruna<koruna){
            throw new IllegalArgumentException("Nedostatek peněz");
        }
        if(this.dvoukoruna<dvoukoruna){
            throw new IllegalArgumentException("Nedostatek peněz");
            
        }
        if(komu == null){
            throw new IllegalArgumentException("Účet neexistuje");
        }
        komu.addKoruna(koruna);
        komu.addDvoukoruna(dvoukoruna);
        this.addKoruna(-koruna);
        this.addDvoukoruna(-dvoukoruna);
    }
    
    
    
}
