/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistcopyhw;


import java.util.*;
import java.util.ArrayList;
public class ArrayListCopyHw {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);//create a scanner
		    
		    MyStack stack = new MyStack();//宣告mystack類別
		  		    
		    for (int i = 0; i < 5; i++)//連續輸入五個字串元素
		    { 
		    	System.out.println("請輸入第"+(i+1)+"個元素" );
		     	stack.push(input.nextLine());//把元素放在堆疊陣列,從頂端開始,索引值0~4
                        
		    }
		    
		    System.out.println(stack.getSize() + " strings are: ");//輸出字串陣列的大小
                    
		    if(!stack.isEmpty())//確認堆疊是否為空
                    {
                            stack.copyfromlist();//如果堆疊不為空,將深度複製的五個字串依輸入順序顯示
                                 
                    }
                }
    
}
