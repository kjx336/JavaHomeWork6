/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework6;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author kjx33
 */
class Echoing{
    String me;
    int len;
    int half;
    boolean result;
        Echoing(String str){
        this.me = str;
        this.len = str.length();
        this.half = len/2;
        judge();
    }
    void judge(){
        result = true;
        for(int i = 0;i<half;i++){
            if(me.charAt(i)!=me.charAt(len-1-i)){
                result = false;
                break;
            }
        }
        if(result){
            System.out.println("字符串是回文");
        }else{
            System.out.println("字符串不是回文");
        }
    }
}
public class Echo {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try{
            String str = bufferedReader.readLine();
            Echoing ECHO = new Echoing(str);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
