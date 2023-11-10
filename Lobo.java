/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula;

/**
 *
 * @author Alunodev07
 */
public class Lobo extends Canino{
    public Lobo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void fazerBarulho() {
        System.out.println("Uivo de um lobo!");
    }

    public void caçarEmMatilha() {
        System.out.println("Lobo está caçando em matilha.");
    }
}
