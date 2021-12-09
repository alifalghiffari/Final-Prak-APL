package AdapterPattern;

//Dibawah ini Class public interface yang berisi Method yang akan digunakan pada Class yang lain
public interface AdvancedPlatformUser {	
   //method dibawah ini akan di overide pada Class yang lain
   public void RegistGoogle(String platformname);
   public void RegistFacebook(String platformname);
}