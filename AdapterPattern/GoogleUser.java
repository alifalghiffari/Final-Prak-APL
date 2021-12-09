package AdapterPattern;

public class GoogleUser implements AdvancedPlatformUser{
   //kedua method dibawah ini akan meng-override method yang ada pada class AdvancedPlatformUser
   @Override
   public void RegistFacebook(String platformname) {
   }
   
   @Override
   public void RegistGoogle(String platformname) {
      System.out.println("Mulai pasang iklan di Google Ads, dengan biaya mulai dari : "+ platformname);		
   }
}