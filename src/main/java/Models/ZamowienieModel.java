/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author andrz
 */
import java.util.ArrayList;
import java.util.List;

public class ZamowienieModel {
    private static int nextId = 1;
    private int id;
    private String nazwa;
    private String nazwaKontrahenta;
    private int pozycjaNaLiscie;
    private ArrayList<TowarModel> listaTowarow;

    public ZamowienieModel(String nazwa, String nazwaKontrahenta, int pozycjaNaLiscie) {
        this.id = nextId++;
        this.nazwa = nazwa;
        this.nazwaKontrahenta = nazwaKontrahenta;
        this.pozycjaNaLiscie = pozycjaNaLiscie;
        this.listaTowarow = new ArrayList<>();
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getNazwaKontrahenta() {
        return nazwaKontrahenta;
    }

    public void setNazwaKontrahenta(String nazwaKontrahenta) {
        this.nazwaKontrahenta = nazwaKontrahenta;
    }

    public int getPozycjaNaLiscie() {
        return pozycjaNaLiscie;
    }

    public void setPozycjaNaLiscie(int pozycjaNaLiscie) {
        this.pozycjaNaLiscie = pozycjaNaLiscie;
    }

    public ArrayList<TowarModel> getListaTowarow() {
        return listaTowarow ;
    }

    public void setListaTowarow(ArrayList<TowarModel> listaTowarow) {
        this.listaTowarow = listaTowarow;
    }
}