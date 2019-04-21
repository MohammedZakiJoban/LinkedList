
package javaapplication13;

public class info {
    private String name,nationalty,passport,email;
    private int age,id;
    
    info(String n,int a,String na,String p,String e,int id){
        name = n;
        age = a;
        nationalty = na;
        passport = p;
        email = e;
        this.id = id;
    }
    public void setId(int id){
        this.id = id;    
    }
    public int getId(){
    return this.id;
    }
    public String getName(){
    return name;
    }
    public int getAge(){
    return age;
    }
    public String getNationlty(){
    return nationalty;
    }
    public String getPassport(){
    return passport;
    }
    public String getEmail(){
    return email;
    }
   
    
}
