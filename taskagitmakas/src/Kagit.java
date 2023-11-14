
import java.lang.Math;

class Kagit extends Nesne{
    
    static int nufuz=2;
    static int a=2;
     static int kalinlik=2;
    static int kagit_etkisi;
    static int kagitSeviye=0;
     static int yeni_dayaniklilik;
     static int sicaklik=2;
         static int direnc=2;
   public Kagit()
    {
        super(20,0);

    }
    
    public Kagit(int dayaniklilik, int seviyePuani)
    {
	super(dayaniklilik, seviyePuani);
           kagit_etkisi=(int) (Kagit.nufuz/(a*Tas.katilik+(1-a)*Makas.keskinlik));


    }
     public static int ozelKagit(){
         
    
 
     kagit_etkisi=((Kagit.nufuz*Kagit.kalinlik)/(Kagit.a*Tas.katilik*sicaklik+(1-a)*Makas.keskinlik*direnc));
                  yeni_dayaniklilik=20-kagit_etkisi;
                  return kagit_etkisi;
                 
            }
           
    
}