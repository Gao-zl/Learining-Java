/**以下实例中我们通过字符串函数 strOrig.lastIndexOf(Stringname) 来查找子字符串 Stringname 在 strOrig 出现的位置
 *
 *@author:gaozhl
 *
 *
 */
public class SearchLastString { 
    public static void main(String[] args) { 
        String strOrig = "Hello Catty, Hello Puppy.";
        int lastIndex = strOrig.lastIndexOf("Puppy");
        if(lastIndex == -1) { 
            System.out.println("没有找到字符串Puppy");
        } else { 
            System.out.println("Puppy最后出现的位置： " + lastIndex);
        }
    }
}
