/*
 * Copyright (C) 2019 kjx33
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */

/**
 *
 * @author kjx33
 */
class User{
    private String UserName;
    private String note;
    User(String UserName,String note){
        this.UserName = UserName;
        this.note = note;
    }
    public String toString(){
        return this.UserName + " "+ this.note;
    }
    public boolean equals(Object user){
        User u =(User)user;
        if(name.equals(u.name))return true;
        else return false;
    }
    public static User Getuser(){
        
    }
}
public class PhoneBook {
    
}
