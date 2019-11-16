package p2_wife;

import java.util.List;

//备忘录的管理者
public class GirlStack {
    private Girl[] list = null;
    private int index;

    public GirlStack(){
        list = new Girl[5];
        index = -1;
    }

    //添加到栈，最多添加5个（包括空白），再多久返回false
    public boolean push(Girl girl){
        if(index < 4){
            list[++index] = girl;
            return true;
        }else{
            System.out.println("你太花心了，不能再选了！");
            return false;
        }
    }

    public Girl pop(){
        if(index > 0){
            return list[index--];
        }else{
            System.out.println("美女栈空了");
            return list[0];
        }
    }
}
