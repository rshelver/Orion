/**
*
*
* @version 1.0.0
* @Author Mutiny27
*
**/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Orion {
    public static void main(String[] args) {
        System.out.println("Orion Encryption");
        System.out.println("Version 1.0");
        System.out.println("Developed by Mutiny27\n");


        System.out.println("[1] Encrypt text");
        System.out.println("[2] Decrypt text");
        System.out.println("Enter one of the options [1-2]: ");

        //initialize scanner
        Scanner in = new Scanner(System.in);
        int mainChoice = in.nextInt();



        //encryption
        if (mainChoice == 1) {
            System.out.println("\n\n\n\nEncrypt");
            Integer[] singles = new Integer[9];
            for (int i = 0; i < singles.length; i++) {
                singles[i] = i;

            }
            Collections.shuffle(Arrays.asList(singles));
            String singlesComplete = Arrays.toString(singles);



            //double digits generation and definition
            //double digits generation and definition
            var firstLoop = true;

            ArrayList<String> mylist = new ArrayList<>();

            String doublesConfirmed = "10";
            int firstLoopCounter = 0;
            int c = 10;
            while (firstLoop) {
                c++;
                doublesConfirmed = String.valueOf(c);

                mylist.add(doublesConfirmed);

                firstLoopCounter++;
                if (firstLoopCounter == 17) {
                    firstLoop = false;
                }


            }
            //System.out.println(mylist);
            Collections.shuffle(mylist);
            //System.out.println(mylist);
            String completedMylist = mylist.toString();






            //Encryption


            singlesComplete = singlesComplete.replace("]", ",");
            completedMylist = completedMylist.replace("[", " ");

            String securityCode = singlesComplete + completedMylist;

            System.out.println("You're security code for this encryption is (make sure you save this): " + securityCode);


            Scanner encryption = new Scanner(System.in);
            System.out.println("Enter Text (lowercase only): ");
            String test = encryption.nextLine();

            //singles defining
            String singleOne = singlesComplete.substring(1,2);
            String singleTwo = singlesComplete.substring(4,5);
            String singleThree = singlesComplete.substring(7,8);
            String singleFour = singlesComplete.substring(10,11);
            String singleFive = singlesComplete.substring(13, 14);
            String singleSix = singlesComplete.substring(16, 17);
            String singleSeven = singlesComplete.substring(19, 20);
            String singleEight = singlesComplete.substring(22, 23);
            String singleNine = singlesComplete.substring(25, 26);




            //singles conversion fix
            String conSingleOne = singleOne.replace(singleOne, "!" + singleOne);
            String conSingleTwo = singleTwo.replace(singleTwo, "!" + singleTwo);
            String conSingleThree = singleThree.replace(singleThree, "!" + singleThree);
            String conSingleFour = singleFour.replace(singleFour, "!" + singleFour);
            String conSingleFive = singleFive.replace(singleFive, "!" + singleFive);
            String conSingleSix = singleSix.replace(singleSix, "!" + singleSix);
            String conSingleSeven = singleSeven.replace(singleSeven, "!" + singleSeven);
            String conSingleEight = singleEight.replace(singleEight, "!" + singleEight);
            String conSingleNine = singleNine.replace(singleNine, "!" + singleNine);

            //doubles defining
            String conDoubleOne = completedMylist.substring(1, 3);
            String conDoubleTwo = completedMylist.substring(5, 7);
            String conDoubleThree = completedMylist.substring(9, 11);
            String conDoubleFour = completedMylist.substring(13, 15);
            String conDoubleFive = completedMylist.substring(17, 19);
            String conDoubleSix = completedMylist.substring(21, 23);
            String conDoubleSeven = completedMylist.substring(25, 27);
            String conDoublesEight = completedMylist.substring(29, 31);
            String conDoublesNine = completedMylist.substring(33, 35);
            String conDoublesTen = completedMylist.substring(37, 39);
            String conDoublesEleven = completedMylist.substring(41, 43);
            String conDoublesTwelve = completedMylist.substring(45, 47);
            String conDoublesThirteen = completedMylist.substring(49, 51);
            String conDoublesFourteen = completedMylist.substring(53, 55);
            String conDoublesFifteen = completedMylist.substring(57, 59);
            String conDoublesSixteen = completedMylist.substring(61, 63);
            String conDoublesSeventeen = completedMylist.substring(65, 67);

            //doubles defining fix
            conDoubleOne = conDoubleOne.replace(conDoubleOne, "?" + conDoubleOne);
            conDoubleTwo = conDoubleTwo.replace(conDoubleTwo, "?" + conDoubleTwo);
            conDoubleThree = conDoubleThree.replace(conDoubleThree, "?" + conDoubleThree);
            conDoubleFour = conDoubleFour.replace(conDoubleFour, "?" + conDoubleFour);
            conDoubleFive = conSingleFive.replace(conDoubleFive, "?" + conDoubleFive);
            conDoubleSix = conDoubleSix.replace(conDoubleSix, "?" + conDoubleSix);
            conDoubleSeven = conDoubleSeven.replace(conDoubleSeven, "?" + conDoubleSeven);
            conDoublesEight = conDoublesEight.replace(conDoublesEight, "?" +conDoublesEight);
            conDoublesNine = conDoublesNine.replace(conDoublesNine, "?" + conDoublesNine);
            conDoublesTen = conDoublesTen.replace(conDoublesTen, "?" + conDoublesTen);
            conDoublesEleven = conDoublesEleven.replace(conDoublesEleven, "?" + conDoublesEleven);
            conDoublesTwelve = conDoublesTwelve.replace(conDoublesTwelve, "?" + conDoublesTwelve);
            conDoublesThirteen = conDoublesThirteen.replace(conDoublesThirteen, "?" + conDoublesThirteen);
            conDoublesFourteen = conDoublesFourteen.replace(conDoublesFourteen, "?" + conDoublesFourteen);
            conDoublesFifteen = conDoublesFifteen.replace(conDoublesFifteen, "?" + conDoublesFifteen);
            conDoublesSixteen = conDoublesSixteen.replace(conDoublesSixteen, "?" + conDoublesSixteen);
            conDoublesSeventeen = conDoublesSeventeen.replace(conDoublesSeventeen, "?" + conDoublesSeventeen);



            String encrypted0 = test.replace(" ", "-");
            String encrypted1 = encrypted0.replace("a", conSingleOne);
            String encrypted2 = encrypted1.replace("b", conSingleTwo);
            String encrypted3 = encrypted2.replace("c", conSingleThree);
            String encrypted4 = encrypted3.replace("d", conSingleFour);
            String encrypted5 = encrypted4.replace("e", conSingleFive);
            String encrypted6 = encrypted5.replace("f", conSingleSix);
            String encrypted7 = encrypted6.replace("g", conSingleSeven);
            String encrypted8 = encrypted7.replace("h", conSingleEight);
            String encrypted9 = encrypted8.replace("i", conSingleNine);
            String encrypted10 = encrypted9.replace("j", conDoubleOne);
            String encrypted11 = encrypted10.replace("k", conDoubleTwo);
            String encrypted12 = encrypted11.replace("l", conDoubleThree);
            String encrypted13 = encrypted12.replace("m", conDoubleFour);
            String encrypted14 = encrypted13.replace("n", conDoubleFive);
            String encrypted15 = encrypted14.replace("o", conDoubleSix);
            String encrypted16 = encrypted15.replace("p", conDoubleSeven);
            String encrypted17 = encrypted16.replace("q", conDoublesEight);
            String encrypted18 = encrypted17.replace("r", conDoublesNine);
            String encrypted19 = encrypted18.replace("s", conDoublesTen);
            String encrypted20 = encrypted19.replace("t", conDoublesEleven);
            String encrypted21 = encrypted20.replace("u", conDoublesTwelve);
            String encrypted22 = encrypted21.replace("v", conDoublesThirteen);
            String encrypted23 = encrypted22.replace("w", conDoublesFourteen);
            String encrypted24 = encrypted23.replace("x", conDoublesFifteen);
            String encrypted25 = encrypted24.replace("y", conDoublesSixteen);
            String encrypted26 = encrypted25.replace("z", conDoublesSeventeen);


            System.out.println(encrypted26);

            System.out.println("\nPress Enter to continue...");
            encryption.nextLine();


        }

        //decryption
        if (mainChoice == 2) {
            System.out.println("\n\n\n\nDecrypt");

            Scanner decrypt = new Scanner(System.in);
            System.out.println("Please enter the encrypted text: ");
            String encryptedText = decrypt.nextLine();

            System.out.println("Please enter security code used for encrpytion: ");
            String securityCode = decrypt.nextLine();





            String singleOne = securityCode.substring(1, 2);
            String singleTwo = securityCode.substring(4, 5);
            String singleThree = securityCode.substring(7, 8);
            String singleFour = securityCode.substring(10, 11);
            String singleFive = securityCode.substring(13, 14);
            String singleSix = securityCode.substring(16, 17);
            String singleSeven = securityCode.substring(19, 20);
            String singleEight = securityCode.substring(22, 23);
            String singleNine = securityCode.substring(25, 26);


            String conSingleOne = singleOne.replace(singleOne, "!" + singleOne);
            String conSingleTwo = singleTwo.replace(singleTwo, "!" + singleTwo);
            String conSingleThree = singleThree.replace(singleThree, "!" + singleThree);
            String conSingleFour = singleFour.replace(singleFour, "!" + singleFour);
            String conSingleFive = singleFive.replace(singleFive, "!" + singleFive);
            String conSingleSix = singleSix.replace(singleSix, "!" + singleSix);
            String conSingleSeven = singleSeven.replace(singleSeven, "!" + singleSeven);
            String conSingleEight = singleEight.replace(singleEight, "!" + singleEight);
            String conSingleNine = singleNine.replace(singleNine, "!" + singleNine);


            String conDoubleOne = securityCode.substring(28, 30);
            String conDoubleTwo = securityCode.substring(32, 34);
            String conDoubleThree = securityCode.substring(36, 38);
            String conDoubleFour = securityCode.substring(40, 42);
            String conDoubleFive = securityCode.substring(44, 46);
            String conDoubleSix = securityCode.substring(48, 50);
            String conDoubleSeven = securityCode.substring(52, 54);
            String conDoublesEight = securityCode.substring(56, 58);
            String conDoublesNine = securityCode.substring(60, 62);
            String conDoublesTen = securityCode.substring(64, 66);
            String conDoublesEleven = securityCode.substring(68, 70);
            String conDoublesTwelve = securityCode.substring(72, 74);
            String conDoublesThirteen = securityCode.substring(76, 78);
            String conDoublesFourteen = securityCode.substring(80, 82);
            String conDoublesFifteen = securityCode.substring(84, 86);
            String conDoublesSixteen = securityCode.substring(88, 90);
            String conDoublesSeventeen = securityCode.substring(92, 94);


            conDoubleOne = conDoubleOne.replace(conDoubleOne, "?" + conDoubleOne);
            conDoubleTwo = conDoubleTwo.replace(conDoubleTwo, "?" + conDoubleTwo);
            conDoubleThree = conDoubleThree.replace(conDoubleThree, "?" + conDoubleThree);
            conDoubleFour = conDoubleFour.replace(conDoubleFour, "?" + conDoubleFour);
            conDoubleFive = conSingleFive.replace(conDoubleFive, "?" + conDoubleFive);
            conDoubleSix = conDoubleSix.replace(conDoubleSix, "?" + conDoubleSix);
            conDoubleSeven = conDoubleSeven.replace(conDoubleSeven, "?" + conDoubleSeven);
            conDoublesEight = conDoublesEight.replace(conDoublesEight, "?" +conDoublesEight);
            conDoublesNine = conDoublesNine.replace(conDoublesNine, "?" + conDoublesNine);
            conDoublesTen = conDoublesTen.replace(conDoublesTen, "?" + conDoublesTen);
            conDoublesEleven = conDoublesEleven.replace(conDoublesEleven, "?" + conDoublesEleven);
            conDoublesTwelve = conDoublesTwelve.replace(conDoublesTwelve, "?" + conDoublesTwelve);
            conDoublesThirteen = conDoublesThirteen.replace(conDoublesThirteen, "?" + conDoublesThirteen);
            conDoublesFourteen = conDoublesFourteen.replace(conDoublesFourteen, "?" + conDoublesFourteen);
            conDoublesFifteen = conDoublesFifteen.replace(conDoublesFifteen, "?" + conDoublesFifteen);
            conDoublesSixteen = conDoublesSixteen.replace(conDoublesSixteen, "?" + conDoublesSixteen);
            conDoublesSeventeen = conDoublesSeventeen.replace(conDoublesSeventeen, "?" + conDoublesSeventeen);


            //Decryption

            String decrypt0 = encryptedText.replace("-", " ");
            String decrypt1 = decrypt0.replace(conSingleOne, "a");
            String decrypt2 = decrypt1.replace(conSingleTwo, "b");
            String decrypt3 = decrypt2.replace(conSingleThree, "c");
            String decrypt4 = decrypt3.replace(conSingleFour, "d");
            String decrypt5 = decrypt4.replace(conSingleFive, "e");
            String decrypt6 = decrypt5.replace(conSingleSix, "f");
            String decrypt7 = decrypt6.replace(conSingleSeven, "g");
            String decrypt8 = decrypt7.replace(conSingleEight, "h");
            String decrypt9 = decrypt8.replace(conSingleNine, "i");
            String decrypt10 = decrypt9.replace(conDoubleOne, "j");
            String decrypt11 = decrypt10.replace(conDoubleTwo, "k");
            String decrypt12 = decrypt11.replace(conDoubleThree, "l");
            String decrypt13 = decrypt12.replace(conDoubleFour, "m");
            String decrypt14 = decrypt13.replace(conDoubleFive, "n");
            String decrypt15 = decrypt14.replace(conDoubleSix, "o");
            String decrypt16 = decrypt15.replace(conDoubleSeven, "p");
            String decrypt17 = decrypt16.replace(conDoublesEight, "q");
            String decrypt18 = decrypt17.replace(conDoublesNine, "r");
            String decrypt19 = decrypt18.replace(conDoublesTen, "s");
            String decrypt20 = decrypt19.replace(conDoublesEleven, "t");
            String decrypt21 = decrypt20.replace(conDoublesTwelve, "u");
            String decrypt22 = decrypt21.replace(conDoublesThirteen, "v");
            String decrypt23 = decrypt22.replace(conDoublesFourteen, "w");
            String decrypt24 = decrypt23.replace(conDoublesFifteen, "x");
            String decrypt25 = decrypt24.replace(conDoublesSixteen, "y");
            String decrypt26 = decrypt25.replace(conDoublesSeventeen, "z");




            System.out.println(decrypt26);

            System.out.println("\nPress Enter to Continue...");
            decrypt.nextLine();




        }


    }
}

