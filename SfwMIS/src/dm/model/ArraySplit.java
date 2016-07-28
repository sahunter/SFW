package dm.model;
import java.util.ArrayList;  
import java.util.List;

import onlineOrder.model.OnlineOrder;  
public class ArraySplit {

  
    /** 
     * splitAry方法<br> 
     * 2014-8-4 上午10:45:36 
     * @param ary 要分割的数组 
     * @param subSize 分割的块大小 
     * @return 
     * 
     */  
    public Object[] splitAry(OnlineOrder[] ary, int subSize) {  
          int count = ary.length % subSize == 0 ? ary.length / subSize: ary.length / subSize + 1;  
  
          List<List<OnlineOrder>> subAryList = new ArrayList<List<OnlineOrder>>();  
  
          for (int i = 0; i < count; i++) {  
           int index = i * subSize;  
           List<OnlineOrder> list = new ArrayList<OnlineOrder>();  
           int j = 0;  
               while (j < subSize && index < ary.length) {  
                    list.add(ary[index++]);  
                    j++;  
               }  
           subAryList.add(list);  
          }  
            
          Object[] subAry = new Object[subAryList.size()];  
            
          for(int i = 0; i < subAryList.size(); i++){  
               List<OnlineOrder> subList = subAryList.get(i);  
               OnlineOrder[] subAryItem = new OnlineOrder[subList.size()];  
               for(int j = 0; j < subList.size(); j++){  
                   subAryItem[j] = subList.get(j);  
               }  
               subAry[i] = subAryItem;  
          }  
            
          return subAry;  
         }  
}
