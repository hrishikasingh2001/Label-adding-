import java.awt.*;
class AWTExample extends Frame{
AWTExample()
{
Label l = new Label("hello everyone");
l.setBounds(60,140,150,120);
add(l);
Button b = new Button("click me");
b.setBounds(50,40,50,20);
add(b);
setSize(300,300);
setLayout(null);
setVisible(true);
setTitle("Hrishika singh window paage creation");
}
public static void main(String args[])
{
AWTExample a = new AWTExample();
}
}