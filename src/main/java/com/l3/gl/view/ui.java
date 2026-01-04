package com.l3.gl.view;
import javax.swing.*;
public class ui {

private JFrame frame;
public ui() {

frame = new JFrame("Simple UI");
frame.setSize(400, 300);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JPanel panel = new JPanel();
JButton button = new JButton("Click Me");
panel.add(button);
frame.add(panel);

}
public void show() {

frame.setVisible(true);

}
public static void main(String[] args) {

ui ui = new ui();
ui.show();

}

}