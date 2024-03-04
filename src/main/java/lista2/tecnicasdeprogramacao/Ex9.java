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
 * @brief Class Ex9
 */
public class Ex9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
    	int A, B, C;
        System.out.println("Primeiro lado");
   	A = ler.nextInt();
  	System.out.println("Segundo lado");
   	B = ler.nextInt();
   	System.out.println("Terceiro lado");
  	C = ler.nextInt();
    
	//fala se é um triângulo equilátero
  	if(A == B && A==C && B==C){
    	System.out.println("Equilátero");
    	}else{
	// fala se é um triângulo escaleno
   	if(A!=B && A!=C && B!=C){
        System.out.println("Escaleno");
    	}else{
	// fala se é um triângulo isócelos
        System.out.println("isócelos");
       }
    }
    }
}
