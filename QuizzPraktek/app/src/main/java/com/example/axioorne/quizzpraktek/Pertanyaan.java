package com.example.axioorne.quizzpraktek;

/**
 * Created by Axioo RNE on 10/16/2018.
 */

public class Pertanyaan {
    public static String soal []={
            "\"Hidung digunakan untuk membedakan...\"",
            "\"Orang yang melahirkan kita adalah...\"",
            "\"Hidup seadanya disebut...\"",
            "\"Pakaian yang baik adalah pakaian yang...\"",
            "\"Alwan  mempunyai banyak teman karena dia...\"",
            "\"Kegiatan tang menggunakan mata adalah...v",
            "\"Kuman membuat kita...\"",
            "\"Saat mencuci tangan kita menggunakan...\"",
            "\"Mata kita berjumlah...\"",
            "\"Sepatu digunaan untuk menutup...\"",
    };
    private String pilihan [][]={
            {"Panas dan Dingin", "Asin dan Manis", "Bau dan Harum", "Aku dan Kamu"},
            {"Ayah", "Ibu", "Kakak", "Tetangga Sebelah"},
            {"Sederhana", "Mewah", "Riya", "Boros"},
            {"Kotor", "Kebal Dosa", "Bau", "Bersih"},
            {"Baik", "Suka ribut", "Mirip Baghiz", "Nakal"},
            {"Makan", "Membaca", "Jalan", "Sepak Bola"},
            {"Sehat", "Bahagia", "Sakit", "Bersemangat"},
            {"Sabun", "Tai kucing", "Pasta Gigi", "Minyak Goreng"},
            {"1", "2", "3", "4"},
            {"Mulut", "Kaki", "Tangan", "Aurat"},
    };
    private String jawabanBenar[]={
            "Bau dan Harum","Ibu","Sederhana","Bersih","Baik","Membaca","Sakit","Sabun","2","Kaki"
    };
    //soal
    public String getsoal(int nomor){
        String soall = soal[nomor];
        return soall;}

    //pilihan
    public String getpilihan1(int nomor) {
        String pilihann = pilihan[nomor][0];
        return pilihann;
    }
    public String getpilihan2(int nomor) {
        String pilihann = pilihan[nomor][1];
        return pilihann;
    }
    public String getpilihan3(int nomor) {
        String pilihann = pilihan[nomor][2];
        return pilihann;
    }
    public String getpilihan4(int nomor) {
        String pilihann = pilihan[nomor][3];
        return pilihann;}

    //jawaban benar
    public String getjawaban(int nomor){
        String jawaban = jawabanBenar[nomor];
        return jawaban;}

}

