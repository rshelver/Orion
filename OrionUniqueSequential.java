import java.util.Scanner;

public class OrionUniqueSequential {



    public static unique[] genUnique(String[] alphabet) {
        unique[] test = new unique[alphabet.length];
//        System.out.println(test.length);
        for (int i = 0; i < alphabet.length; i++) {
            test[i] = new unique(alphabet[i], false);
        }
        return test;
    }

    public static unique[] searchUnique(unique[] uni, String input) {
        unique[] test = new unique[uni.length];
        for (int i = 0; i < input.length(); i++) {
            for (int x = 0; x < uni.length; x++) {
                if (uni[x].getLetter().equalsIgnoreCase(input.substring(i,i+1))) {
                    uni[x].setCheck(true);
                }
                test[x] = uni[x];
            }
        }
        return test;
    }

    public static void getBoolean(String str[], String input) {
        for (int i = 0; i < input.length(); i++) {
            for (int x = 0; x < str.length; x++) {
                if (str[x].equalsIgnoreCase(input.substring(i, i + 1))) {
//                    System.out.println("[+] " + str[x] + " : " + input.charAt(i));
                    break;
                }
//                else{
//                    System.out.println(str[x] + " : " + input.charAt(i));
//                }
            }
        }
    }

    public static void genCode(unique[] alpha) {
        int[] replace = new int[alpha.length];
        for (int i = 0; i < alpha.length; i++) {
            String Conversion = alpha[i].getLetter();
            char[] charset = Conversion.toCharArray();
            char charConversion = charset[0];
            alpha[i].setCode((int) charConversion);
//            System.out.println(alpha[i].getCheck());
        }
    }

    public static password[] encryptPass(String pass) { // iPass = injection password
        password[] iPass = new password[pass.length()];
        for (int i = 0; i < pass.length(); i++) {
//            System.out.println("TEST 2: " + iPass.length);
//            System.out.println("TEST ! : " + i);
            if (i+1 > pass.length()) {
//                System.out.println("Catch : " + i);
            }
            else {
                String Conversion = pass.substring(i, i + 1);
                char[] charset = Conversion.toCharArray();
                char charConversion = charset[0];
                int charConvert = (int) charConversion;
                iPass[i] = new password(charConvert);
//                System.out.println("[+] Setcode Test: " + iPass[i].getCode());
            }
        }
        return iPass;
    }

    public static unique[] cipherSetCode(unique[] lArray, password[] iPass) {
        int passN = 0;
        for (int i = 0; i < lArray.length; i++) {
            if (passN > iPass.length) {
                passN = 0;
                --i;
            }
            else if (lArray[i].getCheck()) {
//                System.out.println("FINAL: " + lArray[i].getLetter() + " : " + lArray[i].getCheck() + " : " + lArray[i].getCode());
                lArray[i].setCode(lArray[i].getCode() * iPass[passN].getCode());
//                System.out.println("FINAL 2: " + lArray[i].getLetter() + " : " + lArray[i].getCheck() + " : " + lArray[i].getCode() + "\n");
            }
        }
        return lArray;
    }

    public static double[] encrypt(unique[] eArray, String mText) {
//        System.out.println("Test Encrypt!!!!");
        double[] finalE = new double[mText.length()];
        for (int i = 0; i < mText.length(); i++) {
//            System.out.println(i + ": " + mText.substring(i,i+1));
            for (int x = 0; x < eArray.length; x++) {
                if (eArray[x].getLetter().equals(mText.substring(i, i+1))) {
//                    System.out.println("[+X+]: " + mText.substring(i,i+1) + " : " + eArray[x].getLetter());
                    finalE[i] = eArray[x].getCode();
//                    System.out.println("Test Final: " + eArray[x].getCode());
                }
            }
        }
        return finalE;
    }

    public static void main(String[] args) {

        String versionNumber = "1.1";


        Scanner in = new Scanner(System.in);
        System.out.println("   ____       _                  ______                             _   _            " +
                "\n  / __ \\     (_)                |  ____|                           | | (_)           " +
                "\n | |  | |_ __ _  ___  _ __      | |__   _ __   ___ _ __ _   _ _ __ | |_ _  ___  _ __ " +
                "\n | |  | | '__| |/ _ \\| '_ \\     |  __| | '_ \\ / __| '__| | | | '_ \\| __| |/ _ \\| '_ \\ " +
                "\n | |__| | |  | | (_) | | | |    | |____| | | | (__| |  | |_| | |_) | |_| | (_) | | | |" +
                "\n  \\____/|_|  |_|\\___/|_| |_|    |______|_| |_|\\___|_|   \\__, | .__/ \\__|_|\\___/|_| |_|" +
                "\n                                                         __/ | |                      " +
                "\n                                                        |___/|_|                      ");

        System.out.println("Version " + versionNumber);
        System.out.println("Developed by Mutiny27");
        System.out.println("https://github.com/rshelver\n");


        System.out.println("[1] Encrypt");
        System.out.println("[2] Decrypt");
        System.out.print("Please Enter one of the options [1-2]: ");
        String mainChoice = in.next() + in.nextLine();
        if (mainChoice.equalsIgnoreCase("1")) {
            System.out.print("\nPlease Enter the text you wish to encrypt: ");
            String input = in.next() + in.nextLine();
            System.out.print("\nPlease Enter the password to encrypt with: ");
            String passwordIn = in.next() + in.nextLine();



            password[] ePass = encryptPass(passwordIn);


            String[] alpha = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", " ", "|"};


            getBoolean(alpha, input);

            unique[] tempGen = genUnique(alpha);

            unique[] permGen = searchUnique(tempGen, input);

            genCode(permGen);


//        Outputs Entire alphabet and Boolean
//            for (int i = 0; i < permGen.length; i++) {
//                System.out.println(permGen[i].getLetter() + " : " + permGen[i].getCode() + " : " +  permGen[i].getCheck());
//            }

//            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            permGen = cipherSetCode(permGen, ePass);

            double[] encryptedText = encrypt(permGen, input);

            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            for (int x = 0; x < encryptedText.length; x++) {
                System.out.print(encryptedText[x] + ", ");
            }
        }
    }
}
