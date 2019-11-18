import java.util.Arrays;
import java.util.Scanner;
public class zifuchuan {
 
 public static void main(String[] args) {
  String str = "汉皇重色思倾国御宇多年求不得杨家有女初长成养在深闺人未识天生丽质难自弃一朝选在君王侧回眸一笑百媚生六宫粉黛无颜色春寒赐浴华清池温泉水滑洗凝脂侍儿扶起娇无力始是新承恩泽时云鬓花颜金步摇芙蓉帐暖度春宵春宵苦短日高起从此君王不早朝承欢侍宴无闲暇春从春游夜专夜后宫佳丽三千人三千宠爱在一身金屋妆成娇侍夜玉楼宴罢醉和春姊妹弟兄皆列士可怜光采生门户遂令天下父母心不重生男重生女骊宫高处入青云仙乐风飘处处闻缓歌慢舞凝丝竹尽日君王看不足渔阳鼙鼓动地来惊破霓裳羽衣曲九重城阙烟尘生千乘万骑西南行";
  char a[] = str.toCharArray();
  int count = a.length/7;
  char[] zifu=str.toCharArray();
 try {                                 //异常处理
   for (int i=0; i<count; i++) {       //进行排字符串为古诗的形式
   System.out.print(zifu[(i*7)]);
   System.out.print(zifu[(i*7)+1]);
   System.out.print(zifu[(i*7)+2]);
   System.out.print(zifu[(i*7)+3]);
   System.out.print(zifu[(i*7)+4]);
   System.out.print(zifu[(i*7)+5]);
   System.out.print(zifu[(i*7)+6]);
   if (i % 2 == 0) 
       System.out.print(',');
   else
       System.out.println('.');
  }
}
 catch(Exception e) {
  System.err.println("若发生了异常."+e.toString());
}
  Scanner input=new Scanner(System.in);
  String p=input.next();

  
        countString(str,p);
        
       }

 
 
 
 System.out.print("请输入查询的字：");   
 private static void countString(String str,String b) {
     int length=str.length();
     int count = 0;
     int x = 0;
     for(int i= 0; i<=length; i++){
         if(str.indexOf(s) == (i-x)){
             str = str.substring(i-x+1,str.length());
             count++;
             x = i+1;
         }
     } 
     System.out.println(b+"出现的次数为"+count+"次");
   }
} //查字的次数