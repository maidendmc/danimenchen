/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git;

/**
 *
 * @author Daniel Menchen
 */
public class Cercle {

 private float x;
 private float y;
 
 public Cercle () {
     this.x = 4.3f;
     this.y = 4.3f;
 }
 
 public Cercle (Cercle cercle) {
     this.x = cercle.x;
     this.y = cercle.y;
 }

 Cercle(float xx, float yy)

  {

     x=xx;

     y=yy;     

  }

public void setX(float valor) {
	this.x = valor;
}

public void setY(float valor) {
	this.y = valor;
}

public Float getX() {
	return this.x;
}

public Float getY() {
	return this.y;
}

 @Override
 public String toString() {
    String valor = "Propietat X: " + this.x + " Propietat: " + this.y;
    return valor;
 }

 public Boolean equals (Cercle objecte) {
 return this.equals(objecte);
 }
 
public static void main () {
Cercle cercle1 = new Cercle();
}
}
