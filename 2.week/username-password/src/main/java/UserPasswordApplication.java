import java.util.Scanner;

public class UserPasswordApplication {
    public static void main(String[] args) {
        String username, password;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kullanıcı adınızı giriniz: ");
        username = scanner.nextLine();

        System.out.println("Şifrenizi giriniz: ");
        password= scanner.nextLine();


        if (username.equals("hasanaktas") && password.equals("123456")){
            System.out.println("Giriş başarılı!!");
        }else{
            System.out.println("Bilgiler hatalı!!\nŞifrenizi sıfırlamak ister misiniz?\nSıfırlamak için\n1-Evet\n2-Hayır");
            int select = scanner.nextInt();

            switch (select){
                case 1:
                    String newPassword;
                    System.out.println("Yeni şifrenizi giriniz: ");
                    scanner.nextLine();
                    newPassword = scanner.nextLine();

                    if (newPassword.equals("123456")){
                        System.out.println("Yeni şifre eski şifre ile aynı olamaz.");
                    }else{
                        System.out.println("Şifre başarıyla oluşturuldu.");
                    }
                    break;
                case 2:
                    System.out.println("Şifre değiştirme işlemi kapanıyor...");
                    break;
            }
        }




    }
}
