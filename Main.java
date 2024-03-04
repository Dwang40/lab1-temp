import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.lang.Math; 
import java.io.*;
import java.util.Arrays;
public class Main {
  File alicea = new File("text/alice.txt");
  int key;
  public double[] frequency2 = new double[26];
  char none = 0;
  int n = 0;
  double counter;
  String y = "";
  String scans = "";
  String count = "";
  double A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z;
  double wordCount;
  public static final String alpha = "abcdefghijklmnopqrstuvwxyz";
  File alice = new File ("alice.txt");
  File othello = new File ("othello.txt");
  
  public String rotate(String text, int shift) {
    String result = "";
        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) {
                char ch = (char)(((int)text.charAt(i) + shift - 65) % 26 + 65);
                result += ch;
            } 
            if (Character.isLowerCase(text.charAt(i))) {
                char ch = (char)(((int)text.charAt(i) + shift - 97) % 26 + 97);
                result += ch;
            }
            if (Character.isWhitespace(text.charAt(i))) {
              result += " ";
            }
        }
        return result.toString();
    }

  public String scan (File txt) {
    try {
      Scanner sc2 = new Scanner(txt);
      while(sc2.hasNextLine()){
      scans += sc2.nextLine();
    }
    sc2.close();
  }
    catch(FileNotFoundException exception) {
      System.out.println("file not found");
    }
    return scans;
  }

  public double[] Freq(String sentence) {
    double[] frequency = new double[26];
    scans = "";
    Scanner sc = new Scanner(sentence);
    while(sc.hasNext() && n != sentence.length()){
      char x = sentence.charAt(n);
        if (x == 'a' || x =='A'){
          A++;
        }
        if (x == 'b' || x == 'B'){
          B++;
        }
        if (x == 'c' || x == 'C'){
          C++;
        }
        if (x == 'd' || x == 'D'){
          D++;
        }
        if (x == 'e' || x == 'E'){
          E++;
        }
        if (x == 'f' || x == 'F'){
          F++;
        }
        if (x == 'g' || x == 'G'){
          G++;
        }
        if (x == 'h' || x == 'H'){
          H++;
        }
        if (x == 'i' || x == 'I'){
          I++;
        }
        if (x == 'j' || x == 'J'){
          J++;
        }
        if (x == 'k' || x == 'K'){
          K++;
        }
        if (x == 'l' || x == 'L'){
          L++;
        }
        if (x == 'm' || x == 'M'){
          M++;
        }
        if (x == 'n' || x == 'N'){
          N++;
        }
        if (x == 'o' || x == 'O'){
          O++;
        }
        if (x == 'p' || x == 'P'){
          P++;
        }
        if (x == 'q' || x == 'Q'){
          Q++;
        }
        if (x == 'r' || x == 'R'){
          R++;
        }
        if (x == 's' || x == 'S'){
          S++;
        }
        if (x == 't' || x == 'T'){
          T++;
        }
        if (x == 'u' || x == 'U'){
          U++;
        }
        if (x == 'v' || x == 'V'){
          V++;
        }
        if (x == 'w' || x == 'W'){
          W++;
        }
        if (x == 'x' || x == 'X'){
          X++;
        }
        if (x == 'y' || x == 'Y'){
          Y++;
        }
        if (x == 'z' || x == 'Z'){
          Z++;
        }
        n++;
    }
    n = 0;
        wordCount = (A + B + C + D + E + F + G + H + I + J + K + L + M + N + O + P + Q + R + S + T + U + V + W + X + Y + Z);
        frequency[0] = (Math.round((A/wordCount) * 100000d) / 100000d);
        frequency[1] = (Math.round((B/wordCount) * 100000d) / 100000d);
        frequency[2] = (Math.round((C/wordCount) * 100000d) / 100000d);
        frequency[3] = (Math.round((D/wordCount) * 100000d) / 100000d);
        frequency[4] = (Math.round((E/wordCount) * 100000d) / 100000d);
        frequency[5] = (Math.round((F/wordCount) * 100000d) / 100000d);
        frequency[6] = (Math.round((G/wordCount) * 100000d) / 100000d);
        frequency[7] = (Math.round((H/wordCount) * 100000d) / 100000d);
        frequency[8] = (Math.round((I/wordCount) * 100000d) / 100000d);
        frequency[9] = (Math.round((J/wordCount) * 100000d) / 100000d);
        frequency[10] = (Math.round((K/wordCount) * 100000d) / 100000d);
        frequency[11] = (Math.round((L/wordCount) * 100000d) / 100000d);
        frequency[12] = (Math.round((M/wordCount) * 100000d) / 100000d);
        frequency[13] = (Math.round((N/wordCount) * 100000d) / 100000d);
        frequency[14] = (Math.round((O/wordCount) * 100000d) / 100000d);
        frequency[15] = (Math.round((P/wordCount) * 100000d) / 100000d);
        frequency[16] = (Math.round((Q/wordCount) * 100000d) / 100000d);
        frequency[17] = (Math.round((R/wordCount) * 100000d) / 100000d);
        frequency[18] = (Math.round((S/wordCount) * 100000d) / 100000d);
        frequency[19] = (Math.round((T/wordCount) * 100000d) / 100000d);
        frequency[20] = (Math.round((U/wordCount) * 100000d) / 100000d);
        frequency[21] = (Math.round((V/wordCount) * 100000d) / 100000d);
        frequency[22] = (Math.round((W/wordCount) * 100000d) / 100000d);
        frequency[23] = (Math.round((X/wordCount) * 100000d) / 100000d);
        frequency[24] = (Math.round((Y/wordCount) * 100000d) / 100000d);
        frequency[25] = (Math.round((Z/wordCount) * 100000d) / 100000d);
        ///*
        System.out.print("A: " + frequency[0] + ", ");
        System.out.print("B: " + frequency[1] + ", ");
        System.out.print("C: " + frequency[2] + ", ");        
        System.out.print("D: " + frequency[3] + ", ");
        System.out.print("E: " + frequency[4] + ", ");
        System.out.print("F: " + frequency[5] + ", ");
        System.out.print("G: " + frequency[6] + ", ");
        System.out.print("H: " + frequency[7] + ", ");
        System.out.print("I: " + frequency[8] + ", ");
        System.out.print("J: " + frequency[9] + ", ");
        System.out.print("K: " + frequency[10] + ", ");
        System.out.print("L: " + frequency[11] + ", ");
        System.out.print("M: " + frequency[12] + ", ");
        System.out.print("N: " + frequency[13] + ", ");
        System.out.print("O: " + frequency[14] + ", ");
        System.out.print("P: " + frequency[15] + ", ");
        System.out.print("Q: " + frequency[16] + ", ");
        System.out.print("R: " + frequency[17] + ", ");
        System.out.print("S: " + frequency[18] + ", ");
        System.out.print("T: " + frequency[19] + ", ");
        System.out.print("U: " + frequency[20] + ", ");
        System.out.print("V: " + frequency[21] + ", ");
        System.out.print("W: " + frequency[22] + ", ");
        System.out.print("X: " + frequency[23] + ", ");
        System.out.print("Y: " + frequency[24] + ", ");
        System.out.print("Z: " + frequency[25]);
        System.out.print("\n");
        //*/
       A=0;B=0;C=0;D=0;E=0;F=0;G=0;H=0;I=0;J=0;K=0;L=0;M=0;N=0;O=0;P=0;Q=0;R=0;S=0;T=0;U=0;V=0;W=0;X=0;Y=0;Z=0;
       wordCount = 0;
      sc.close();
      return frequency;
  }
  
  public double distance(double[] f1, double[] f2){
    double dista;
    for(int i = 0; i < 25; i++){
      counter += Math.pow(f1[i] - f2[i], 2);
    }
    dista = Math.sqrt(counter);
    counter = 0;
    System.out.println(dista);
    return dista;
  }

  public String atbash(String Text) {
    StringBuilder sb = new StringBuilder();
    String str = Text.toUpperCase();
    boolean b = false;
    
    for (int i =  0; i < str.length(); i++) {
        char ch = str.charAt(i);
        if (ch >= 'A' && ch <= 'Z') {
            char cipher = (char) ('Z' - (ch - 'A'));
            sb.append(cipher);
            b = true;
        } else if (Character.isDigit(ch)) {
            sb.append(ch);
            b = true;
        }
        if(ch == ' ') {
          sb.append(' ');
        }
    }
    return sb.toString();
}

  public String decode(String text){
    String altxt = text;
    double curdist = 1.0;
    double bashdist = 1.0;
    double[] altfreq;
    double[] altfrequ;
    String solved;
    int key = 0;
    int bashkey = 0;
    double[] normalFreq = Freq(scan(alicea));
    for(int i = 0; i < 52; i++){
      altxt = rotate(text, i);
      altfreq = Freq(altxt);
      double newdist = distance(altfreq, normalFreq);
      if (newdist < curdist) {
        curdist = newdist;
        key = i;
      } 
      if (i >= 26){
        altxt = atbash(rotate(text, i-26));
        altfrequ = Freq(altxt);
        double bashdista = distance(altfrequ, normalFreq);
        if (bashdista < bashdist){
          bashdist = bashdista;
          bashkey = i - 26;
        }
      }
    }
    if(curdist < bashdist){
      solved = rotate(text, key);
      System.out.println(solved);
      return solved;
    }
    else {
      solved = atbash(rotate(text, bashkey));
      System.out.println(solved);
      return solved;
    }
  
}
    public static void main(String []args) throws FileNotFoundException {
      Main a = new Main();
      File tmp = new File(args[1]);
      if (args[0].equals("Freq")){
        a.Freq(a.scan(tmp));
      }
      if (args[0].equals("distance")){
        File tmp2 = new File(args[2]);
        a.distance(a.Freq(a.scan(tmp)), a.Freq(a.scan(tmp2)));
      }
      if (args[0].equals("decode")){
        a.decode(a.scan(tmp));
      }
  }
}
