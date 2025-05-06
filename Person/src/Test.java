
public class Test {

	public static void main(String[] args) {
Person taro =new Person();
taro.name = "山田太朗" ;
taro.age = 20;
taro.phoneNumber = "080-1234-5678" ;
taro.address = "taro@gmail.jp" ;


Person jiro = new Person();
jiro.name = "木村次郎" ;
jiro.age = 18;
jiro.phoneNumber = "090-1234-5678" ;
jiro.address = "jiro@gmail.jp" ;

Person hanako = new Person();
hanako.name = "鈴木花子" ;
hanako.age = 16;
hanako.phoneNumber = "070-1234-5678" ;
hanako.address = "hanako@gmail.jp" ;


Person tomomi = new Person();
tomomi.name = "杉村朋美";
tomomi.age =27;
tomomi.phoneNumber = "080-5678-1234" ;
tomomi.address = "tomomi@gmail.jp" ;


System.out.println(taro.name);
System.out.println(taro.age);
System.out.println(taro.phoneNumber);
System.out.println(taro.address);
taro.talk();
taro.walk();
taro.run();
System.out.println(jiro.name);
System.out.println(jiro.age);
System.out.println(jiro.phoneNumber);
System.out.println(jiro.address);
jiro.talk();
jiro.walk();
jiro.run();
System.out.println(hanako.name);
System.out.println(hanako.age);
System.out.println(hanako.phoneNumber);
System.out.println(hanako.address);
hanako.talk();
hanako.walk();
hanako.run();
System.out.println(tomomi.name);
System.out.println(tomomi.age);
System.out.println(tomomi.phoneNumber);
System.out.println(tomomi.address);
tomomi.talk();
tomomi.walk();
tomomi.run();
 }

}

