
public class Robot {

 public String name = null;

 public Robot(String name){
	 this.name =name;
 }

 public void talk(){
    System.out.println(name + "は話しています。");
 }
 public void walk(){
	System.out.println(name + "は歩いています。");
 }
 public void run(){
	 System.out.println(name + "は走っています。");
 }
 }


