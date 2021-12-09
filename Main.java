// Nama : Alif Alghiffari
// NPM : 1908107010063

import java.util.Scanner;
import AdapterPattern.*;
import StrategyPattern.*;

public class Main {
   public static void main(String[] args) {

      System.out.println("Pilih Platform yang akan dipasang iklan\n");
      System.out.println("1. Facebook");
      System.out.println("2. Google");
      Scanner in = new Scanner(System.in);
      System.out.print("\nInput Platform yang dipilih : ");
      String Platform = in.next();
      System.out.println("\nPlatform Yang dipilih : " + Platform);

      AdsUser AdsUser = new AdsUser();
      User register = null;
      register = new User();

      //Fungsi untuk memilih method yang akan memlilih platform yang akan dipasang iklan
      if( "Facebook".equalsIgnoreCase(Platform)){
         register.setRegistMethod(new UserFacebook());
         register.RegAds();
         AdsUser.Regist("Facebook", "Rp. 59.000");

      }else if("Google".equalsIgnoreCase(Platform)){
         register.setRegistMethod(new UserGoogle());
         register.RegAds();
         AdsUser.Regist("Google", "Rp. 149.000");
      }
   }
}