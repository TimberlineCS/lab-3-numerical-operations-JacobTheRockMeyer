public class gamer{

public static void main(String args[]){
double d1 = 37.9;
double d2 = 1004.128;
int i1 = 12;
int i2 = 18;
double awnser1 = 57.2 * (i1 / i2) + 1;
double awnser2 = 57.2 * ((double)i1 / i2) + 1;
double awnser3 = 15 - i1 * (d1 * 3) + 4;
double awnser4 = 15 - i1 * ((int)d1 * 3) + 4;
double awnser5 = 15 - i1 * (int)(d1 * 3) + 4;
System.out.println(awnser1);
System.out.println(awnser2);
System.out.println(awnser3);
System.out.println(awnser4);
System.out.println(awnser5);
}

}