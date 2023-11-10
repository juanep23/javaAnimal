/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula;

/**
 *
 * @author Alunodev07
 */
public class Cachorro extends Canino implements Pet{
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void fazerBarulho() {
        System.out.println("Au Au!");
    }

    @Override
    public void brincar() {
        System.out.println("Cachorro está brincando.");
    }

    @Override
    public void serCarinhoso() {
        System.out.println("Cachorro está sendo carinhoso.");
    }
}
