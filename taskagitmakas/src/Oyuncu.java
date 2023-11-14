
    abstract class Oyuncu {
    
    private int user_id;
    private String oyuncuAdi;
    private int Skor;
    public Nesne[] nesneListesi = new Nesne[3];
    
    
    public Oyuncu()
	{
		this.setUser_id(-1);
		this.setOyuncuAdi("Bilinmeyen");
		this.setSkor(0);
	}

	public Oyuncu(int oyuncuID, String oyuncuAdi, int Skor)
	{
		this();
		this.setUser_id(user_id);
		this.setOyuncuAdi(oyuncuAdi);
		this.setSkor(Skor);
	}
        
        
        public int getOyuncuID()
    {
	return user_id;
    }    
                
    public void setUser_id(int oyuncuID) {
        this.user_id = user_id;
    }
    
    
    public String getOyuncuAdi()
    {
	return oyuncuAdi;
    }

    public void setOyuncuAdi(String oyuncuAdi) {
        this.oyuncuAdi = oyuncuAdi;
    }
    
    public int getSkor()
    {
	return Skor;
    }

    public void setSkor(int skor) {
       Skor = skor; 
    }
    
}

