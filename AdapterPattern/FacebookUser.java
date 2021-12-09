package AdapterPattern;

public class FacebookUser implements AdvancedPlatformUser{
   //kedua method dibawah ini akan meng-override method yang ada pada class AdvancedPlatformUser
   @Override
   public void RegistGoogle(String platformname) {
   }

   @Override
   public void RegistFacebook(String platformname) {
      System.out.println("Mulai pasang iklan di Facebook Ads, dengan biaya mulai dari : "+ platformname);		
   }
}