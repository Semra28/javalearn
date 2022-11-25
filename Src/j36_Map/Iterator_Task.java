package j36_Map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;



public class Iterator_Task {
    public static void main(String[] args) {



    /*
        verilen bir integer listin tek elemanlarının karesini tersten iterator print eden code create edin
        */

  List<Integer>j1= new ArrayList<>(List.of(1,5,9,0,20,12,14));
        ArrayList<Object> l1;
        ListIterator<Integer> it1=l1.listIterator();
  while(it1.hasNext()){
      int num=it1.next();

      if (num%2==1){
          it1.set((int)Math.pow(num,2);

      }else it1.remove();

    }while (it1.hasPrevious())
            System.out.println(it1.previous());
      //istenen sayı aralığındaki elemanları silme
      //[2,13,56,23,45,14,40]->istenen aralık 20-40(sınırlar dahil
        //20 den küçük 40 dan büyük elemanları sileceğiz
        List<Integer> list=new ArrayList<>(List.of(2,13,56,23,45,14,40));
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()) {
            int num=it.next();
            if (num<20||num>40){
                it.remove();
            }
        }
        System.out.println(list);
    }




}}
