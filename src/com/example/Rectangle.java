package com.example;

public class Rectangle {
    /**
     * 6 точек я беру как,2 клетки ,передаем количество клеток в параметор метода countRect.
     * @param cell
     * @return количество прямоугольников(квадратов)
     */
    static int countRect(int cell) {
        int ans = 0;

        for (int length = 1; length <= Math.sqrt(cell);
             ++length) {
            for (int height = 0; height * length <= cell && length > height;
                 ++height) {
                ans++;
            }
            int height;
                for (height = length; height * length <= cell;
                     ++height) {
                    ans++;

                }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.print(countRect(2));
    }
}

