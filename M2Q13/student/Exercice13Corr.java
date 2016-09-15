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

public class Exercice13Corr {

    /*
    * @pre : -
    * @post : Donne la valeur absolue
    *
    */
    public static double abs(double number) {
	double abs_number =0; 
	abs_number =(number < 0) ? -number : number;
        return abs_number;
    }
   /*
    * @pre : -
    * @post : Donne la valeur à l'entier supérieur
    *
    */
    public static int ceil(double number) {
	int ceil_number =0; 
	if(number - int(number) == 0) ceil_number=number;
	else ceil_number = int(number)+1;
        return ceil_number;
    }
    /*
    * @pre : -
    * @post : Donne la valeur arrondie
    *
    */
    public static int round(double number) {
	int round_number =0; 
	int ent = int(number);
	if(number-ent >=0.5) round_number = ent+1;
	else round_number = ent;
        return round_number;
    }
    /*
    * @pre : -
    * @post : Donne la valeur à l'entier inférieur
    *
    */
    public static int floor(double number) {
	int floor_number =0; 
	floor_number = int(number);
        return floor_number;
    }
}
