//******
//*****
//****
//***
//**
//*
import java.util.*;
public class prob16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=0;j<=i;j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
// This code prints a reverse pattern of stars based on the input number n.