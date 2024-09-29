package Praktikum05;
import java.util.Scanner;
public class siakad10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, nim, nilaihuruf, kelas, kualifikasi;
        byte absen;
        double nilaikuis, nilaitugas, nilaiujian, nilaiakhir;

        System.out.print("masukkan nama: ");
        nama = sc.nextLine();
        System.out.print("masukkan nim: ");
        nim = sc.nextLine();
        System.out.print("masukkan kelas: ");
        kelas = sc.nextLine();
        System.out.print("masukkan nomor absen: ");
        absen = sc.nextByte();
        System.out.print("masukkan nilai kuis: ");
        nilaikuis = sc.nextDouble();
        System.out.print("masukkan nilai tugas: ");
        nilaitugas = sc.nextDouble();
        System.out.print("masukkan nilai ujian: ");
        nilaiujian = sc.nextDouble();

        nilaiakhir = (nilaikuis + nilaitugas + nilaiujian) / 3;
        if (nilaiakhir >= 80 && nilaiakhir <=100) {
            nilaihuruf = "A";
            kualifikasi = "sangat baik";
        } else if (nilaiakhir >= 73 && nilaiakhir < 80) {
            nilaihuruf = "B+";
            kualifikasi = "Lebih dari baik";
        } else if (nilaiakhir >= 65 && nilaiakhir < 73) {
            nilaihuruf = "B";
            kualifikasi = "Baik";
        } else if (nilaiakhir >= 60 && nilaiakhir < 65) {
            nilaihuruf ="C+";
            kualifikasi = "Lebih dari cukup";
        } else if (nilaiakhir >= 50 && nilaiakhir < 60) {
            nilaihuruf = "C";
            kualifikasi = "Cukup";
        } else if (nilaiakhir >= 39 && nilaiakhir < 50) {
            nilaihuruf = "D";
            kualifikasi = "Kurang";
        } else {
            nilaihuruf = "E";
            kualifikasi = "Gagal";
        }


        System.out.println(String.format("mahasiswa dengan nama %s (nim %s) kelas %s absen %s ", nama, nim, kelas, absen));
        System.out.println("nilai akhir: " + nilaiakhir);
        System.out.println("nilai akhir huruf: " + nilaihuruf);
        System.out.println("kualifikasi: " + kualifikasi);


    }
}