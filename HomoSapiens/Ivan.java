package HomoSapiens;
class Body{
    String Head;
    String Legs;
    String Hands;
}
class Person{
    HomoSapiens.Body body;
    String name;
    int age;

    @Override
    public String toString(){
        return name + " , "+ age + " years " + body.Head +" , " + body.Legs +" "+ body.Hands+".";
    }
}
public class Ivan {
    public static void main(String[] args) {
        HomoSapiens.Person HomoSapiens = new HomoSapiens.Person();
        HomoSapiens.body = new HomoSapiens.Body();

        HomoSapiens.body.Head = "round" ;
        HomoSapiens.body.Legs = "long";
        HomoSapiens.body.Hands = "strong";
        HomoSapiens.name = "Ivan";
        HomoSapiens.age = 40;

        System.out.println(HomoSapiens.toString());
    }
}
