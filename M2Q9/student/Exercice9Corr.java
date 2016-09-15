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

public class Exercice9Corr {

    /*
    * @pre : -
    * @post : Donne la saison de l'année
    *
    */
    public static int sais(int jour, int mois){
	String saison;
	if (((y == 12)&&(x>=21))||((y<=3)&&(x<20))){
            season = "Hiver";
        }          
        else if (((y >= 3)&&(x>=20))||((y<=6)&&(x<20))){
            season = "Printemps";
        }
        else if (((y >= 6)&&(x>=20))||((y<=9)&&(x<22))){
            season = "Eté";
        } 
        else if (((y >= 9)&&(x>=22))||((y<=12)&&(x<21))){
            season = "Automne";
        }
	return saison;

    }
}
