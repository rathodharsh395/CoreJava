package classComponents.Constructor;
//Parameterized Constructor
//User defined Constructor
 class ParameterizedConstructor {
    String name;
    int id;
    ParameterizedConstructor(String n,int i){
        name = n;
        id = i;
    }
}
 class Java
{
  public static void main(String[] args) {
      ParameterizedConstructor  par = new ParameterizedConstructor("Harish",395);
      System.out.println("name="+par.name+"\n"+"id="+par.id);
  }
}