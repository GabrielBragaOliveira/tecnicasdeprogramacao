/*
 * Copyright (C) 2024 Gabriel Braga <ninjagamer9795286@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package lista2.tecnicasdeprogramacao;
import java.util.*;
/**
 *
 * @author Gabriel Braga <ninjagamer9795286@gmail.com>
 * @date 03/03/2024
 * @brief Class Ex13
 */
public class Ex13 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

	// Declarar variáveis
        int X, Y;

	//ler os valores
        System.out.println("Informe o valor de X: ");
        X = ler.nextInt();
        System.out.println("Informe o valor Y: ");
        Y = ler.nextInt();

	// Declarar variável result de valor 1
        int result = 1;

	// estrutura de repetição
        for (int i = 0; i < Y; i++) {
	// resultado é ele vezes X
            result = result * X;
        }
        System.out.println(result);
    }
}
