package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {

        for (int row = 1; row <= sideLength; row++){
            for (int count = 1; count <= sideLength; count++){
                if(row == count || row + count == sideLength + 1){
                    System.out.print('8');
                }else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }

    }
}