package jp.ac.ait.k22121;

public class PasswordManager {
    public static boolean validate(String password) throws PasswordRulesViolationException {
        if(password.length()<16 || password.length()>128) throw new PasswordRulesViolationException("パスワードは16文字以上128文字以下に設定してください");
        else if(!password.matches(".*[a-z].*")) throw new PasswordRulesViolationException("小文字アルファベットを1文字以上入れてください");
        else if(!password.matches(".*[A-Z].*")) throw new PasswordRulesViolationException("大文字アルファベットを1文字以上入れてください");
        else if(!password.matches(".*[1-9].*")) throw new PasswordRulesViolationException("数字を1文字以上入れてください");
        else if(!password.matches(".*[ ,.+*/=_#!?@-].*")) throw new PasswordRulesViolationException("いずれかの記号を含めてください(',','.','+','-','*','/','=','_','#','!','?','@',' ')");
        else if(password.matches(".*(?i)password.*|.*(?i)p@ssw0rd.*|.*(?i)p@55w0rd.*|.*(?i)qwerty.*|.*(?i)asdfgh.*|.*(?i)zxcvbn.*|.*(?i)abcdef.*|.*(?i)123456.*")){
            throw new PasswordRulesViolationException("使用できない文字列を含んでいます");
        }
        else return true;
    }
}