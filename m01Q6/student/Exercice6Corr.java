/**
 *  Copyright (c) 2015, 2016 François Michel, Ludovic Taffin
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

public class Exercice6Corr {

    // Code a verifier
    public static String[] fizzbuzz(int n){
        String[] tableau = new String[n+1];
        int i=1;
        while(i <= n){
            String temp ="";
            if(i%15==0) temp = "fizzbuzz";
            else{
                if(i%3==0) 
                	temp="fizz";
                else {     
               	 if(i%5==0) 
                 	temp="buzz";
                 else 
                 	temp="non";
                }
            }
            tableau[i]= temp;
            i++;

        }
        return tableau;
    }
}
