package ru.netology.sqr;

public class SQRService {
    public int calcRangeSQRService(int x, int y) {
        int inRange = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= x && i * i <= y) {
                inRange = inRange + 1;
            }
        }
        return inRange;
    }
}
