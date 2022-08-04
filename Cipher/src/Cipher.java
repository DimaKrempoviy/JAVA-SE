import java.util.Scanner;

public class Cipher {

    public static void main(String[] args) {
        System.out.println("[D - Decrypt] [E - Encryption], please choose one option ");
        Scanner c = new Scanner(System.in);
        String s1 = c.nextLine();
        if(s1.equalsIgnoreCase("D")) {
            System.out.println("Please enter plain text: ");
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            System.out.println("Please enter the key: ");
            Scanner sc1 = new Scanner(System.in);
            int key = sc1.nextInt();
            Encryption(s,key);
        }else if(s1.equalsIgnoreCase("E")) {
            System.out.println("Please enter encrypted text: ");
            Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
            System.out.println("Please enter the key: ");
            Scanner sc1=new Scanner(System.in);
            int key=sc1.nextInt();
            Decrypt(s,key);
        }
    }

    public static void Decrypt(String str, int n) {
        int k=Integer.parseInt("-"+n);
        String string="";
        for(int i=0;i<str.length();i++) {
            char c=str.charAt(i);
            if(c>='a'&&c<='z')
            {
                c += k%26;
                if(c<'a')
                    c += 26;
                if(c>'z')
                    c -= 26;
            }else if(c>='A'&&c<='Z')
            {
                c += k%26;
                if(c<'A')
                    c += 26;
                if(c>'Z')
                    c -= 26;
            }
            string += c;
        }
        System.out.println(str + " After decryption: " + string);
    }

    public static void Encryption(String str, int k) {
        String string="";
        for(int i=0;i<str.length();i++) {
            char c=str.charAt(i);
            if(c>='a'&&c<='z')
            {
                c += k%26;
                if(c<'a')
                    c += 26;
                if(c>'z')
                    c -= 26;
            }else if(c>='A'&&c<='Z')
            {
                c += k%26;
                if(c<'A')
                    c += 26;
                if(c>'Z')
                    c -= 26;
            }
            string += c;
        }
        System.out.println(str + " After encryption: " + string);
    }


}