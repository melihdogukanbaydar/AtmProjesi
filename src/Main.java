import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, passWord;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;

        while ( right > 0){

            System.out.print("Kullanıcı Adınız : ");
            userName = input.nextLine();
            System.out.print(" Parolanız : ");
            passWord = input.nextLine();
            if (userName.equals("patika") && passWord.equals("dev123")){
                System.out.println("Merhaba Kodluyoruz Bankasına Hoşgeldiniz");
                do {
                    System.out.println("1-Para Yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print(" Lütfen Yapmak İstediğiniz İşlemi Seçiniz");
                    select = input.nextInt();
                    switch (select){
                        case 1:{
                            System.out.println("Para Miktarı");
                            int price = input.nextInt();
                            balance += price;
                            break;
                        }
                        case 2:{
                            System.out.println("Para Miktarı");
                            int price = input.nextInt();
                            if (price > balance){
                                System.out.println("Yetersiz Bakiye");
                            }else{
                                balance -= price;
                                break;
                            }
                        }
                        case 3:{
                            System.out.println("Güncel Bakiyeniz : " + balance);
                            break;
                        }
                    }
                }while ( select != 4);
                System.out.println("Tekrar Görüşmek Üzere");

                break;
            }else {
                right--;
                System.out.println(" Hatalı Kullanıcı Adı veya Şifre Girdiniz");
                switch (right){
                    case 0:{
                        System.out.println("Hesabınız Bloke Edilmiştir.Lütfen Banka ile İletişime Geçiniz");
                        break;
                    }
                    default:{
                        System.out.println("Kalan Hakkınız : " + right);
                    }
                }


            }
        }


    }
}