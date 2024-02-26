package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {

        for (int row = 1; row <= cathetusLength; row++){
            for (int count = 1; count <= row; count++){
                if(count == 1 || row == cathetusLength || row == count){
                    System.out.print('8');
                }else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }

    }
}
