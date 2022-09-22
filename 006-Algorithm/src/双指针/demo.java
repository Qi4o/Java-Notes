package 双指针;

/**
 * @Author Qiao
 * @Create 2021-10-28 22:40
 */

//获取两个字符串中最大相同串
    //双指针滑动窗口搜索
public class demo {
    public static void main(String[] args) {
        String result = getMaxSameArr("abadbhellobsd", "dsadbhelloddc");
        System.out.println(result);
    }
    public static String getMaxSameArr(String str1, String str2){
        String maxStr = (str1.length() >= str2.length())? str1:str2;
        String minStr = (str1.length() < str2.length())? str1:str2;
        int length = minStr.length();
        for (int i = 0; i < length; i++) {
            for (int x=0,y=length-i; y <= length;x++,y++){
                String subStr = minStr.substring(x,y);
                if(maxStr.contains(subStr)){
                    return subStr;
                }
            }
        }
        return null;
    }
}
