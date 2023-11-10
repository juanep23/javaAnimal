/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula;

/**
 *
 * @author Alunodev07
 */
public class Leao extends Felino{
    public Leao(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void fazerBarulho() {
        System.out.println("Rugido de um leão!");
    }

    public void dominarTerritorio() {
        System.out.println("Leão está dominando seu território.");
    }
}
