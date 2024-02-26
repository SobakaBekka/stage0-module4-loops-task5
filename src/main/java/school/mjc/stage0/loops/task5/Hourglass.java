package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {

        for (int row = 1; row <= height; row++){
            for (int count = 1; count <= height; count++){
                if(row == count || row + count == height + 1 || row == 1 || row == height){
                    System.out.print('8');
                }else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }

    }
}
