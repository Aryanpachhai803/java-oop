package Day_33;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class CalculatorDemo extends Applet implements ActionListener {

    TextField t1, t2, result;
    Button add, sub, mul, div;

    public void init() {
        setLayout(new GridLayout(5, 2));
        t1 = new TextField();
        t2 = new TextField();
        result = new TextField();
        result.setEditable(false);

        add = new Button("+");
        sub = new Button("-");
        mul = new Button("*");
        div = new Button("/");

        add(new Label("Enter first number:"));
        add(t1);

        add(new Label("Enter second number:"));
        add(t2);

        add(add);
        add(sub);
        add(mul);
        add(div);

        add(new Label("Result:"));
        add(result);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
    }

    }
