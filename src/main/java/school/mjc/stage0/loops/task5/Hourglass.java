package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for (int row = 1; row <= height; row++) {
            for (int count = 1; count <= height; count++) {
                if (row <= height / 2) { // Верхняя половина песочных часов
                    if (count >= row && count <= height - row + 1) {
                        System.out.print('8');
                    } else {
                        System.out.print(' ');
                    }
                } else { // Нижняя половина песочных часов
                    if (count <= row && count >= height - row + 1) {
                        System.out.print('8');
                    } else {
                        System.out.print(' ');
                    }
                }
            }
            System.out.println();
        }
    }
}
