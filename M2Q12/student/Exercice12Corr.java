/**
 *  Copyright (c)  2016 Ludovic Taffin
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Affero General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Affero General Public License for more details.
 *
 *  You should have received a copy of the GNU Affero General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package student;

public class Exercice12Corr {

    /*
    * @pre : -
    * @post : Détermine le siècle d'une année
    *
    */
    public static int century(int annee){
	int siecle=0;
	double calcul = annee/100;
	siecle =(int)calcul;	
	calcul -= (int)calcul;
	if(calcul !=0){
		siecle++;
	} 
	
	return siecle;

    }
}
