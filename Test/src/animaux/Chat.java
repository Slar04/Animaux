/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animaux;

/**
 *
 * @author Rigo
 */
public class Chat extends Felin {
 
  public Chat(){

  }
  public Chat(String couleur, int poids){
    this.couleur = couleur;
    this.poids = poids;
  }
        
  void crier() {
    System.out.println("Je miaule sur les toits !");
  } 
}
