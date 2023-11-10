/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula;

/**
 *
 * @author Alunodev07
 */
public class Gato extends Felino implements Pet{
    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void fazerBarulho() {
        System.out.println("Miau!");
    }

    @Override
    public void brincar() {
        System.out.println("Gato está brincando.");
    }

    @Override
    public void serCarinhoso() {
        System.out.println("Gato está sendo carinhoso.");
    }
}
