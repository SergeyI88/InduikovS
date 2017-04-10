package ru.job4j.array;
/**
* RotateArray.
*
* @author Sergey Indyukov (onl.ont@mail.ru)
* @version $Id$
* @since 0.1
*/
public class RotateArray {
/**
* Method rotate.
* @param array первый аргумент
* @return array
*/
	public int[][] rotate(int[][] array) {
		int temp = 0;
			for (int i = 0; i < array.length / 2; i++) {
				for (int j = i; j < array.length - 1 - i; j++) {
				temp = array[i][j];
                array[i][j] = array[array.length - j - 1][i];
                array[array.length - j - 1][i] = array[array.length - 1 - i][array.length - 1 - j];
                array[array.length - 1 - i][array.length - 1 - j] = array[j][array.length - i - 1];
                array[j][array.length - i - 1] = temp;
				}
			}
			//2. При решении задачи без использования дополнительного массива необходимо выполнять на каждой итерации сразу 4 шага.
			//К примеру для массива размером 3 на 3 первая итерация будет состоять из следующих шагов [0][0] -> [2][0] -> [2][2] -> [0][2] -> [0][0].}*/
		return array;
	}
}