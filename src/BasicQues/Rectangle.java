package BasicQues;

import javax.swing.text.html.StyleSheet;

/*
Create a class Rectangle

Data members:

length
breadth

Constructor should initialize values.

Create method to calculate area.

 */
public class Rectangle {
    int length;
    int width;

    Rectangle(int len,int wid){
        this.length = len;
        this.width = wid;
    }

    int area(){
        return this.length * this.width;
    }

    public static void main(String[] args){
        Rectangle a = new Rectangle(5,10);

        System.out.println("Area : " + a.area());
    }

}
