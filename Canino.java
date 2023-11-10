/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula;

/**
 *
 * @author Alunodev07
 */
public class Canino extends Animal{
    public Canino(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void fazerBarulho() {
        System.out.println("Barulho genérico de um canino.");
    }

    public void farejar() {
        System.out.println("Canino está farejando.");
    }
}
