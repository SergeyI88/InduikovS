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
		if (array.length == 3) {
			for (int i = 0; i < 1; i++) {
				for (int j = i; j < 3 - 1 - i; j++) {
				temp = array[i][j];
                array[i][j] = array[3 - j - 1][i];
                array[3 - j - 1][i] = array[3 - 1 - i][3 - 1 - j];
                array[3 - 1 - i][3 - 1 - j] = array[j][3 - i - 1];
                array[j][3 - i - 1] = temp;
				}
			}
		} else {
				temp = array[0][0];
				array[0][0] = array[1][0];
				array[1][0] = array[1][1];
				array[1][1] = array[0][1];
				array[0][1] = temp;
		}
			//2. При решении задачи без использования дополнительного массива необходимо выполнять на каждой итерации сразу 4 шага.
			//К примеру для массива размером 3 на 3 первая итерация будет состоять из следующих шагов [0][0] -> [2][0] -> [2][2] -> [0][2] -> [0][0].}*/
		return array;
	}
}