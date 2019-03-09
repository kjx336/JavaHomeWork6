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
import java.util.*;
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
        if(UserName.equals(u.UserName))return true;
        else return false;
    }
    public static User readUser(){
        Scanner in = new Scanner(System.in,"GB2312");
        System.out.print("输入用户名");
        String nm = in.nextLine();
        System.out.print("输入备注信息");
        String nt = in.nextLine();
        return new User(nm,nt);
    }
}

class PhoneNumber{
    private String Number;
    private String Type;
    public PhoneNumber(String PhoneNumber,String Type){
        this.Number = PhoneNumber;
        this.Type = Type;
    }
    public String toString(){
        return Number + " " + Type;
    }
    public boolean equals(Object phoneNumber){
        PhoneNumber p = (PhoneNumber)phoneNumber;
        if(Number.equals(p.Number))return true;
        else return false;
    }
    public static PhoneNumber readPhoneNumber(){
        Scanner in = new Scanner(System.in,"GB2312");
        System.out.print("请输入号码");
        String n = in.nextLine();
        System.out.print("输入号码类型");
        String t = in.nextLine();
        return new PhoneNumber(n,t);
    }
}

public class PhoneBook {
    private User user;
    private PhoneNumber phoneNumber;
    public PhoneBook(User user,PhoneNumber phone){
        this.user = user;
        this.phoneNumber = phone;
    }

    public User getUser(){
        return user;
    }
    public PhoneNumber getPhoneNumber(){
        return phoneNumber;
    }
    public String toString(){
        return "用户信息："+ user + "\t号码信息：" + phoneNumber;
    }
    public static PhoneBook readPhoneBook(){
        return new PhoneBook(User.readUser(),PhoneNumber.readPhoneNumber());
    }
}
