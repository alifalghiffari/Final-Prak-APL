package AdapterPattern;

public class AdsUser implements PlatformUser {
   PlatformAdapter PlatformAdapter; 
   //meng-override method yang ada pada class PlatformUser
   @Override
   public void Regist(String AdsType, String platformname) {		
      
      //PlatformAdapter menyediakan dukungan untuk menjalankan method regist pada format file lain
      if(AdsType.equalsIgnoreCase("Google") || AdsType.equalsIgnoreCase("Facebook")){
         PlatformAdapter = new PlatformAdapter(AdsType);
         PlatformAdapter.Regist(AdsType, platformname);
      }
   }
}