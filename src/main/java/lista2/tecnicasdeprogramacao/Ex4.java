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
 * @brief Class Ex4
 */
public class Ex4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

	
        int X, Y;
        float Z;

	// ler os valores
        System.out.println("Informe o valor de X: ");
        X = sc.nextInt();
        System.out.println("Informe o valor de Y: ");
        Y = sc.nextInt();
        System.out.println("Informe o valor de Z: ");
        Z = sc.nextFloat();

	// Efetuar o cálculo do produto de X por Y e a divisão por Z, após isso, apresentar o resultado na tela
        System.out.println((X * Y) / Z);
    }
}
