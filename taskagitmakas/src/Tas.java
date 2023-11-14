

import java.util.ArrayList;

public class Tas extends Nesne{
    
    static int katilik=2;
    static int tasEtkisi;
    
    static int tasSeviye=0;
    
    static int tasSeviye2=0;


    public Tas()
    {
        
        super(20,0);
    }
    
    public Tas(int dayaniklilik, int seviyePuani)
    {
	super(dayaniklilik, seviyePuani);
    }
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

        
        tasEtkisi=(int)((katilik)/((0.2)*(Makas.keskinlik)+(0.2)*Kagit.nufuz));
        
    return tasEtkisi;
    
    }
    @Override
    public int durumGuncelle()
    {
    Tas.dayaniklilik=(int)(30-Tas.tasEtkisi);
   return durumGuncelle();
    }
}
