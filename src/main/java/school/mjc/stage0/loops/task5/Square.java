package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength){

        for (int row = 1; row <= sideLength; row++){
            for (int count = 1; count <= sideLength; count++){
                if (row == 1 || row == sideLength || count == 1 || count == sideLength) {
                    System.out.print('8');
                }else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }

                }
            }
