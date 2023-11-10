/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula;

/**
 *
 * @author Alunodev07
 */
public class Tigre extends Felino{
    public Tigre(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void fazerBarulho() {
        System.out.println("Rugido de um tigre!");
    }

    public void cacar() {
        System.out.println("Tigre está caçando.");
    }
}
