package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){

        for(int row = 1; row <= height; row++){
            for (int count = 1; count <= length; count++){
                if(row == 1 || row == height || count == 1 || count == length){
                    System.out.print('8');
                }else {
                    System.out.println(' ');
                }
            }
            System.out.println();
        }

    }
}
