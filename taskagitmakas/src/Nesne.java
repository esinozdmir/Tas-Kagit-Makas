import java.util.ArrayList;

    public abstract class Nesne {
    
    static int dayaniklilik;
    static int seviyePuani;
    
    public Nesne(){
    this.setDayaniklilik();
    this.setSeviyePuani();
    }
    
    public Nesne(int dayaniklilik,int seviyePuani){
    this.setDayaniklilik(dayaniklilik);
    this.setSeviyePuani(seviyePuani);
    }
    public static int nesneSec(int index){

        return 0;
    }
    
    public int nesnePuaniGoster(){
    return 0;
    }
    
    public int etkiHesapla(){
    return 0;
    }
    
    public int durumGuncelle(){
    return 0;
    }
    

    private void setDayaniklilik() {
        this.dayaniklilik=dayaniklilik;
    }

    private void setSeviyePuani() {
        this.seviyePuani=seviyePuani;
    }

    private int setDayaniklilik(int dayaniklilik) {
        return dayaniklilik;
    }

    private int setSeviyePuani(int seviyePuani) {
        return seviyePuani;
    }
              static ArrayList<Nesne> nesneList;
    public  void nesneEkleme (ArrayList<Nesne> nesneList){
        
        nesneList.add(new Tas(20,0));
        nesneList.add(new Kagit(20,0));
        nesneList.add(new Makas());
       
        Nesne tas1 = new Tas();
        Nesne tas2 = new Tas();
        Nesne kagit = new Kagit();
        Nesne makas1 = new Makas();
        Nesne makas2 = new Makas();
	}
    
   
    
}

