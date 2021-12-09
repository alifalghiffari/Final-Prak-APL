package AdapterPattern;

public class PlatformAdapter implements PlatformUser {

   AdvancedPlatformUser advancedAdsUser;
   //Method dibawah akan mengecekan apakan termasuk ke Google atau Facebook
   public PlatformAdapter(String AdsType){
   
      if(AdsType.equalsIgnoreCase("Google") ){
         advancedAdsUser = new GoogleUser();			
         
      }else if (AdsType.equalsIgnoreCase("Facebook")){
         advancedAdsUser = new FacebookUser();
      }	
   }
   //meng-override method yang ada pada class PlatformUser
   @Override
   public void Regist(String AdsType, String platformname) {
   
      if(AdsType.equalsIgnoreCase("Google")){
         advancedAdsUser.RegistGoogle(platformname);
      }
      else if(AdsType.equalsIgnoreCase("Facebook")){
         advancedAdsUser.RegistFacebook(platformname);
      }
   }
}