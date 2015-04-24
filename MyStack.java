/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arraylistcopyhw;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.lang.Object;

public class MyStack implements Cloneable  {//MyStack 類別實作package java.lang 裡的Cloneable介面做物件的深度複製;

   private ArrayList<Object> list = new ArrayList<Object>();
  
  
  public boolean isEmpty() {//確認ArrayList是否為空,若堆疊是空的,則回傳true
    return list.isEmpty();
  }

  public int getSize() {//回傳堆疊的元素個數
    return list.size();
  }

  public Object peek() {//回傳堆疊頂端的元素,但不加以刪除
    return list.get(getSize() - 1);
  }

  public Object pop() {//回傳並刪除堆疊頂端的元素
    Object o = list.get(getSize() - 1);
    list.remove(getSize() - 1);
    return o;
  }

  public void push(Object o) {//加一元素於堆疊頂端
    list.add(o);
   
     }

  public void copyfromlist(){//以實作cloneable介面深度複製字串陣列list的元素到字串陣列listB
   
      ArrayList<Object> listB = (ArrayList<Object>)list.clone();
      System.out.println("Cloned ArrayList " + listB);
  
  }

  @Override /** Override the toString in the Object class */
  public String toString() {
    return "stack: " + list.toString();
  }
}
