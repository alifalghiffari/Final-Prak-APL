package StrategyPattern;

//Mendelkarasikan sebuah variabel UserMethod
public class User{
    private UserMethod UserMethod;
    
    //Method untuk merubah Method Regist
    public void setRegistMethod(UserMethod Regist){
        this.UserMethod = Regist;
    }
    //Method untuk mendapatkan Method Regist
    public UserMethod getRegistMethod(){
        return UserMethod;
    }
    //Method untuk melakukan Regist ads dengan method RegAds
    public void RegAds(){
        UserMethod.RegAds();
    }
}