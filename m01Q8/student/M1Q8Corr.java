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

public class M1Q8Corr {

	// Code a verifier
	public static int mediane(int a,int b,int c,int d, int e){
		int un=0,deux=0, trois=0,quatre=0,cinq=0;
		int mediane=0;
		int temp=0;
		un=a;
		if( a>b){
			un=b;
			deux=a;
		}else{
			deux=b;
		}
		if (c<deux){
			temp=deux;
			deux=c;
			trois= temp;
			if( c<un){
				temp=un;
				un=c;
				deux=temp;
			}
		}else{
			trois=c;
		}

		if (d< trois){
			temp=trois;
			trois=d;
			quatre=temp;
			if (d<deux){
				temp=deux;
				deux=d;
				trois= temp;
				if(d<un){
					temp=un;
					un=d;
					deux=temp;
				}
			}
		}else{
			quatre=d;
		}
		if (e< quatre){
			temp=quatre;
			quatre=e;
			cinq=temp;
			if (e< trois){
				temp=trois;
				trois=e;
				quatre=temp;
				if (e<deux){
					temp=deux;
					deux=e;
					trois= temp;
					if (e<un){
						temp=un;
						un=e;
						deux=temp;
					}
				}
			}
		}else{
			cinq=e;
		}
		mediane=trois;
		return mediane;
	}
}
