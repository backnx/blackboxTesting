/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Kiemthuhopden {
    public static void main(String[] args) {
        // System.out.println("Hello World!");
    }
    public String maxLength(String gioi_tinh, int age) {
        String res;
        if (gioi_tinh.equals("M")) {
            if (age < 0 || age > 16 || Math.ceil(age) != Math.floor(age)) {
                res = "Invalid Input";
            } else if (age < 2) {
                res = "8.6 cm";
            } else if (age < 4) {
                res = "9 cm";
            } else if (age < 6) {
                res = "10.3 cm";
            } else if (age < 8) {
                res = "10.8 cm";
            } else if (age < 10) {
                res = "11.9 cm";
            } else {
                res = "12.6 cm";
            }
        } else {
            if (age < 0 || age > 16 || Math.ceil(age) != Math.floor(age)) {
                res = "Invalid Input";
            } else if (age < 2) {
                res = "8.5 cm";
            } else if (age < 4) {
                res = "8.9 cm";
            } else if (age < 6) {
                res = "9.8 cm";
            } else if (age < 8) {
                res = "10.9 cm";
            } else if (age < 10) {
                res = "11.7 cm";
            } else {
                res = "12.3 cm";
            }
        }
        return res;
    }
}
