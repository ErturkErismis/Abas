import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Siparisler {
    // nitelikler
    String Siparis;
    String MalNumarası;
    int Miktar;
    double BirimFiyat;

    public String getSiparis()
		{
			return Siparis;
		}
		
		public void setSiparis(String Siparis)
		{
			this.Siparis=Siparis;
		}
		
		public String getMalNumarası()
		{
			return MalNumarası;
		}
		
		public void setMalNumarası(String MalNumarası)
		{
			this.MalNumarası=MalNumarası;
		}
		
		public int getMiktar()
		{
			return Miktar;
		}
		
		public void setMiktar(int Miktar)
		{
			this.Miktar=Miktar;
		}
	
		public double getBirimFiyat()
		{
			return BirimFiyat;
		}
		
		public void setBirimFiyat(double BirimFiyat)
		{
			this.BirimFiyat=BirimFiyat;
		}
}


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        List<Siparisler> siparisler=new ArrayList<>();

        Siparisler siparis=new Siparisler();
        siparis.setSiparis("1000");
        siparis.setMalNumarası("2000");
        siparis.setMiktar(12);
        siparis.setBirimFiyat(100.51);

        siparisler.add(siparis);

        Siparisler siparis2=new Siparisler();
        siparis2.setSiparis("1000");
        siparis2.setMalNumarası("2001");
        siparis2.setMiktar(31);
        siparis2.setBirimFiyat(200);

        siparisler.add(siparis2);

        Siparisler siparis3=new Siparisler();
        siparis3.setSiparis("1000");
        siparis3.setMalNumarası("2002");
        siparis3.setMiktar(22);
        siparis3.setBirimFiyat(150.86);

        siparisler.add(siparis3);

        Siparisler siparis4=new Siparisler();
        siparis4.setSiparis("1000");
        siparis4.setMalNumarası("2003");
        siparis4.setMiktar(41);
        siparis4.setBirimFiyat(250);

        siparisler.add(siparis4);

        Siparisler siparis5=new Siparisler();
        siparis5.setSiparis("1000");
        siparis5.setMalNumarası("2004");
        siparis5.setMiktar(55);
        siparis5.setBirimFiyat(244);

        siparisler.add(siparis5);

        Siparisler siparis6=new Siparisler();
        siparis6.setSiparis("1001");
        siparis6.setMalNumarası("2001");
        siparis6.setMiktar(88);
        siparis6.setBirimFiyat(44.531);

        siparisler.add(siparis6);

        Siparisler siparis7=new Siparisler();
        siparis7.setSiparis("1001");
        siparis7.setMalNumarası("2002");
        siparis7.setMiktar(121);
        siparis7.setBirimFiyat(88.11);

        siparisler.add(siparis7);

        Siparisler siparis8=new Siparisler();
        siparis8.setSiparis("1001");
        siparis8.setMalNumarası("2004");
        siparis8.setMiktar(74);
        siparis8.setBirimFiyat(211);

        siparisler.add(siparis8);

        Siparisler siparis9=new Siparisler();
        siparis9.setSiparis("1001");
        siparis9.setMalNumarası("2002");
        siparis9.setMiktar(14);
        siparis9.setBirimFiyat(88.11);

        siparisler.add(siparis9);

        Siparisler siparis10=new Siparisler();
        siparis10.setSiparis("1002");
        siparis10.setMalNumarası("2003");
        siparis10.setMiktar(2);
        siparis10.setBirimFiyat(12.21);

        siparisler.add(siparis10);

        Siparisler siparis11=new Siparisler();
        siparis11.setSiparis("1002");
        siparis11.setMalNumarası("2004");
        siparis11.setMiktar(3);
        siparis11.setBirimFiyat(22.3);

        siparisler.add(siparis11);


        Siparisler siparis12=new Siparisler();
        siparis12.setSiparis("1002");
        siparis12.setMalNumarası("2003");
        siparis12.setMiktar(8);
        siparis12.setBirimFiyat(12.1);

        siparisler.add(siparis12);

        Siparisler siparis13=new Siparisler();
        siparis13.setSiparis("1002");
        siparis13.setMalNumarası("2002");
        siparis13.setMiktar(16);
        siparis13.setBirimFiyat(94);

        siparisler.add(siparis13);

        Siparisler siparis14=new Siparisler();
        siparis14.setSiparis("1002");
        siparis14.setMalNumarası("2005");
        siparis14.setMiktar(9);
        siparis14.setBirimFiyat(44.1);

        siparisler.add(siparis14);

        Siparisler siparis15=new Siparisler();
        siparis15.setSiparis("1002");
        siparis15.setMalNumarası("2006");
        siparis15.setMiktar(19);
        siparis15.setBirimFiyat(90);

        siparisler.add(siparis15);

        



        BirinciSoruASikki(siparisler);
        BirinciSoruBSikki(siparisler);
        BirinciSoruCSikki(siparisler);
        BirinciSoruDSikki(siparisler);




        
    }

    private static void BirinciSoruDSikki(List<Siparisler> siparisler) {

        HashMap<String,Integer> MalinAdeti=new HashMap<String,Integer>();
        double toplamTutar=0;
        int count=0;
       
        List<String> Mallar=new ArrayList<>();
        List<String> Siparis=new ArrayList<>();

       
        for(int z=0;z<siparisler.size();z++)
        {
           
            if(MalinAdeti.containsKey(siparisler.get(z).getSiparis()+"_"+siparisler.get(z).getMalNumarası()))
            {
                MalinAdeti.put(siparisler.get(z).getSiparis()+"_"+siparisler.get(z).getMalNumarası(), MalinAdeti .get(siparisler.get(z).getSiparis()+"_"+siparisler.get(z).getMalNumarası())+1);
            }

            else{
                MalinAdeti.put(siparisler.get(z).getSiparis()+"_"+siparisler.get(z).getMalNumarası(),1);

            }

            if(!Mallar.contains(siparisler.get(z).getMalNumarası()))
            {
                Mallar.add(siparisler.get(z).getMalNumarası());
            }
            
            if(!Siparis.contains(siparisler.get(z).getSiparis()))
            {
                Siparis.add(siparisler.get(z).getSiparis());
            }

        }

        for(int k=0;k<Siparis.size();k++)
        {
            for(int x=0;x<Mallar.size();x++)
            {
                if(MalinAdeti.containsKey(Siparis.get(k)+"_"+Mallar.get(x)))
                {
                    System.out.println(Siparis.get(k)+" numaralı siparişte "+Mallar.get(x)+" nolu mal "+MalinAdeti.get(Siparis.get(k)+"_"+Mallar.get(x))+" adettir");

                }
            }
        }
       

    }

    private static void BirinciSoruCSikki(List<Siparisler> siparisler) {

        HashMap<String,Double> MalinTutari=new HashMap<String,Double>();

        HashMap<String,Integer> MalinAdeti=new HashMap<String,Integer>();
        double toplamTutar=0;
        int count=0;
       
        List<String> Mallar=new ArrayList<>();

       
        for(int z=0;z<siparisler.size();z++)
        {
           

            if(MalinTutari.containsKey(siparisler.get(z).getMalNumarası()))
            {
                MalinTutari.put(siparisler.get(z).getMalNumarası(), MalinTutari.get(siparisler.get(z).getMalNumarası())+(siparisler.get(z).getMiktar()*siparisler.get(z).getBirimFiyat()));
            }

            else{
                MalinTutari.put(siparisler.get(z).getMalNumarası(),(siparisler.get(z).getMiktar()*siparisler.get(z).getBirimFiyat()));

            }
           
            if(MalinAdeti.containsKey(siparisler.get(z).getMalNumarası()))
            {
                MalinAdeti.put(siparisler.get(z).getMalNumarası(), MalinAdeti .get(siparisler.get(z).getMalNumarası())+siparisler.get(z).getMiktar());
            }

            else{
                MalinAdeti.put(siparisler.get(z).getMalNumarası(),siparisler.get(z).getMiktar());

            }

            if(!Mallar.contains(siparisler.get(z).getMalNumarası()))
            {
                Mallar.add(siparisler.get(z).getMalNumarası());
            }
            

        }

        for(int x=0;x<Mallar.size();x++)
        {
            System.out.println(Mallar.get(x)+" Numaralı Malın Ortalama Fiyat: "+MalinTutari.get(Mallar.get(x))/MalinAdeti.get(Mallar.get(x)));
        }
        


    }

    private static void BirinciSoruBSikki(List<Siparisler> siparisler) {

        double toplamTutar=0;
        int miktar=0;
        for(int z=0;z<siparisler.size();z++)
        {
            toplamTutar+=siparisler.get(z).getMiktar()*siparisler.get(z).getBirimFiyat();
            
            miktar+=siparisler.get(z).getMiktar();
        }

        System.out.println("Malların Ortalama Tutarı: "+toplamTutar/miktar);

    }

    private static void BirinciSoruASikki(List<Siparisler> siparisler) {


        double toplamTutar=0;
        for(int z=0;z<siparisler.size();z++)
        {
            toplamTutar+=siparisler.get(z).getMiktar()*siparisler.get(z).getBirimFiyat();


        }

        System.out.println("Malların Toplam Tutarı: "+toplamTutar);

    }
}
