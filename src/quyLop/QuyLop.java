/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quyLop;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author nnd2890
 */
public class QuyLop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
//       ghiFile();
       docFile();
//       sumMoney();
    }
     //Ghi file
    public static ArrayList<User> ghiFile() throws FileNotFoundException, IOException {
        ArrayList<User> listUser = new ArrayList<User>();
        listUser.add(new User("A001", "Nguyen Van A", 500000, "22/12/2016"));
        listUser.add(new User("A002", "Tran Thi B", 200000, "20/10/2016"));
        listUser.add(new User("A003", "Nguyen Thi C", 350000, "19/12/2016"));
        listUser.add(new User("A001", "Nguyen Van A", 700000, "30/12/2016"));
        listUser.add(new User("A004", "Tran Ngoc D", 200000, "18/12/2016"));
        listUser.add(new User("A005", "Phan Van E", 200000, "19/12/2016"));
        listUser.add(new User("A002", "Tran Thi B", 150000, "01/01/2017"));
        listUser.add(new User("A001", "Nguyen Van A", 300000, "03/01/2017"));
        listUser.add(new User("A004", "Tran Ngoc D", 200000, "04/01/2017"));
        listUser.add(new User("A003", "Nguyen Thi C",300000, "07/01/2017"));
        
        
        File f = new File("quyLop.txt");
        FileWriter fr = new FileWriter(f);
        PrintWriter pw = new PrintWriter(new FileOutputStream(f));
        pw.println("Msv  \tTen  \t\tSo tien  \tNgay dong ");
        for (User user : listUser) {
            pw.print(user.getMsv() + "  \t");
            pw.print(user.getName() + "  \t");
            pw.print(user.getMoney() + "  \t");
            pw.println(user.getDate() + "  \t");
        }
        pw.close();
        return listUser;
    }
    
    public static void docFile() throws IOException{
        ArrayList<User> listUser = ghiFile();
        File f = new File("quyLop.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(f))){
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // Tính tổng tiền sinh viên đã đóng
    public static void sumMoney() throws IOException{
        ArrayList<User> listUser = ghiFile();
        ArrayList<User> listUserSum = new ArrayList<>();
        // Tổng số tiền theo MSV: A001
        int totalAmount1=0;
        for (int i=0; i<listUser.size(); i++){
            if ("A001".equals(listUser.get(i).getMsv())) {
            int totalprice = listUser.get(i).getMoney();
            totalAmount1 += totalprice;  
            }
        }
        listUserSum.add(new User("A001", "Nguyen Van A", totalAmount1, ""));
        
        // Tổng số tiền theo MSV: A002
        int totalAmount2=0;
        for (int i=0; i<listUser.size(); i++){
            if ("A002".equals(listUser.get(i).getMsv())) {
            int totalprice = listUser.get(i).getMoney();
            totalAmount2 += totalprice;  
            }
        }
        listUserSum.add(new User("A002", "Tran Thi B", totalAmount2,  ""));
        
        // Tổng số tiền theo MSV: A003
        int totalAmount3=0;
        for (int i=0; i<listUser.size(); i++){
            if ("A003".equals(listUser.get(i).getMsv())) {
            int totalprice = listUser.get(i).getMoney();
            totalAmount3 += totalprice;  
            }
        }
        listUserSum.add(new User("A003", "Nguyen Thi C", totalAmount3,  ""));
        
        // Tổng số tiền theo MSV: A004
        int totalAmount4=0;
        for (int i=0; i<listUser.size(); i++){
            if ("A003".equals(listUser.get(i).getMsv())) {
            int totalprice = listUser.get(i).getMoney();
            totalAmount4 += totalprice;  
            }
        }
        listUserSum.add(new User("A004", "Tran Ngoc D", totalAmount4,  ""));
        
        // Tổng số tiền theo MSV: A005
        int totalAmount5=0;
        for (int i=0; i<listUser.size(); i++){
            if ("A003".equals(listUser.get(i).getMsv())) {
            int totalprice = listUser.get(i).getMoney();
            totalAmount5 += totalprice;  
            }
        }
        listUserSum.add(new User("A005", "Phan Van E", totalAmount5,  ""));
        
        // Tổng số tiền đã đóng
        int totalAmount6 = totalAmount1 + totalAmount2 + totalAmount3 + totalAmount4 + totalAmount5;
        
        
        // Save the List
        File f = new File("quyLop2.txt");
        FileWriter fr = new FileWriter(f);
        PrintWriter pw = new PrintWriter(new FileOutputStream(f));
        pw.println("Msv  \tTen  \t\tTong so tien  ");
        for (User user : listUserSum) {
            pw.print(user.getMsv() + "  \t");
            pw.print(user.getName() + "  \t");
            pw.print(user.getMoney() + "  \t");
            pw.println(user.getDate() + "  \t");
        }
        pw.println("------------------------------");
        pw.println("Tong so tien da dong: " + totalAmount6);
        pw.close();
         
        //Read File
        try (BufferedReader br = new BufferedReader(new FileReader(f))){
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
