package jp.ac.uryukyu.ie.e165726;

public class Main {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        }catch (NullPointerException e) {
            System.out.println("NullPointerException has occurred. ");
            e.printStackTrace();
        }
    }
}
