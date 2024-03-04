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
 * @brief Class Ex7
 */
public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

	int A, B;

	// Ler os valoers 
        System.out.println("Informe o primeiro valor: ");
        A = sc.nextInt();
        System.out.println("Informe o segundo valor: ");
        B = sc.nextInt();

	// Se A for maior que B mostra os dois e quem é maior
        if (A > B) {
            System.out.println("Valor de A:" + A);
            System.out.println("Valor de B:" + B);
            System.out.println("Maior:" + A);
	
        } else {
            System.out.println("Valor de A:" + A);
            System.out.println("Valor de B:" + B);
            System.out.println("Maior:" + B);
        }
    }
}
