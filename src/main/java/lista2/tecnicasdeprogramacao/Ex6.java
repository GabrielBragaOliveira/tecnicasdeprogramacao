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
 * @brief Class Ex6
 */
public class Ex6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

	// Definir a variável e ler seu valor
        System.out.println("Qual o valor de X1: ");
        int X1 = ler.nextInt();
        System.out.println("Qual o valor de X1: ");
        int Y1 = ler.nextInt();
        System.out.println("Qual o valor de X2: ");
        int X2 = ler.nextInt();
        System.out.println("Qual o valor de Y2: ");
        int Y2 = ler.nextInt();

        double D;

	// Math.pow serve pra fazer espoente
        D = Math.pow(X1 - X2, 2) + Math.pow(Y1 - Y2, 2);

	
        System.out.println("A distância entre os pontos é: " + D);
    }
}
