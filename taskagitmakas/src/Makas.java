
import java.lang.Math;

import java.util.ArrayList;


public class Makas extends Nesne{
    
    static int keskinlik=2;
    static int makasEtkisi;

    static int makasSeviye=0;
    static int makasSeviye2=0;


    
    
    public Makas()
    {
       // super(20,0);
       int dayaniklilik=30;
       int seviyePuani=0;
    }
    
    /*public Makas(int dayaniklilik, int seviyePuani)
    {
        dayaniklilik=30;
        seviyePuani=0;
	//super(dayaniklilik, seviyePuani);
    }*/
    @Override 
        public void nesneEkleme(ArrayList<Nesne> nesneList)
    { 
       nesneList.add(new Makas());
    }
    
    
    @Override
    public int nesnePuaniGoster()
    {
        
        int dayaniklilik=20;
        int seviyePuani=0;
    
        return 0;
    
    }
       
    
    @Override
    public int etkiHesapla()
    {
        

        Tas obj2 = new Tas();
        Kagit obj3 = new Kagit();

        
        makasEtkisi=(int)((keskinlik)/((0.2)*(obj3.nufuz)+(0.2)*obj2.katilik));
        
    return makasEtkisi;
    
    }
    @Override
    public int durumGuncelle()
    {
    Makas.dayaniklilik=(int)(30-Makas.makasEtkisi);
   return durumGuncelle();
    }
}
