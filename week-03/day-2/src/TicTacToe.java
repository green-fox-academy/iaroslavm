//import java.io.IOException;
//import java.lang.reflect.Array;
//import java.nio.file.Files;
//import java.nio.file.NoSuchFileException;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.sql.SQLOutput;
//import java.util.Arrays;
//import java.util.List;
//
//public class TicTacToe {
//
//    public static void main(String[] args) {
//
//        System.out.println(check("assets/winX.txt"));
//
//    }
//
//    public static String check(String a) {
//
//
//        try {
//            Path filePath = Paths.get(a);
//            List<String> file = Files.readAllLines(filePath);
//            String winner = "none";
//
//
//            for (int i = 0; i < 3; i++) {
//
//                if (file.get(i).substring(0, 1).equals(file.get(i).substring(1, 2)) &&
//                        file.get(i).substring(1, 2).equals(file.get(i).substring(2, 3))) {
//                    winner = file.get(i).substring(0,1);
//                    return winner;
//
//                }
//            }
//
//            for (int j = 0; j < 3; j++) {
//
//                if (file.get(0).substring(j, j+1).equals(file.get(1).substring(j, j+1)) &&
//                        file.get(1).substring(j,j+1).equals(file.get(2).substring(j, j+1))) {
//                    winner = file.get(0).substring(j,j+1);
//                    return winner;
//
//
//                }
//            }
//
//            if (file.get(0).substring(0, 1).equals(file.get(1).substring(1, 2)) &&
//                    file.get(1).substring(1,2).equals(file.get(2).substring(2, 3))) {
//                winner = file.get(0).substring(0,1);
//
//                return winner;
//
//            }
//            if (file.get(2).substring(0, 1).equals(file.get(1).substring(1, 2)) &&
//                    file.get(1).substring(1,2).equals(file.get(0).substring(2, 3))) {
//                winner = file.get(2).substring(0,1);
//                return winner;
//            }
//
//            if (winner.equals("none")) {
//                winner = "draw";
//                return winner;
//            }
//
//
//        } catch (NoSuchFileException e) {
//            System.out.println("No Such File");
//        }
//    }
//}
//
//
////    String [] [] board = new String [3][3];
//////            board[0][0] = file.get(0).substring(0,1);
//////            board[0][1] = file.get(0).substring(1,2);
//////            board[0][2] = file.get(0).substring(2,3);
////            for (int i = 0; i < 3; i++) {
////        for (int j = 0; j < 3; j++) {
////        board[i][j] = file.get(i).substring(j,j+1);
////        }
////        }
//////            System.out.println((board[0][0]));
////        int [][] boardNum = new int [3][3];
////        for (int i = 0; i < 3; i++) {
////        for (int j = 0; j < 3; j++) {
////        if (board[i][j].equals("X")) {
////        boardNum[i][j] = 1;
////        } else {
////        boardNum[i][j] = 0;
////        }
////        }
////        }
////        System.out.println(Arrays.toString(boardNum[1]));
////        int rawSum = 0;
////        for (int i = 0; 0 < 3; i++) {
////        rawSum = boardNum[i][0] + boardNum[i][1] + boardNum[i][2];
////        if (rawSum == 3) {
////        return 'X';
////        } if (rawSum == 0) {
////        return 'O';
////        }
////        }
////
////        if (rawSum < 3 && rawSum > 0) {
////        for (int i = 0; i < 3; i++) {
////        rawSum = boardNum[i][0] + boardNum[i][1] + boardNum[i][2];
////        if (rawSum == 3) {
////        return 'X';
////        } if (rawSum == 0) {
////        return 'O';
////        }
////        }
////
////        }
