package com.l3.gl.controller;
import com.l3.gl.model.product;
import com.l3.gl.model.user;
import com.l3.gl.view.ui;
public class controller {
private ui view;
private product product;
private user user;
public controller(product product, user user) {
this.product = product;
this.user = user;
}
public String sayHello() {
return "hello from controller";
}
private void showDetails() {
// your work
}
}