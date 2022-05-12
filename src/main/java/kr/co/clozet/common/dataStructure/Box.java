package kr.co.clozet.common.dataStructure;

import lombok.Data;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component @Data @Lazy
public class Box<T> {
    private ArrayList<T> list; // 내가 넣는 타입으로 그때그때 바뀐다.
    public Box(){this.list=new ArrayList<>();}

    public void add(T t){ //T는 타입 , Ex Stiring 과 같음
        list.add(t);
    }
    public void set(int i, T t){
        list.set(i,t);
    }
    public void remove(T t){
        list.remove(t);
    }
    public T get(int i){
        return list.get(i);
    }
    public List<T> get(T t){
        return null;
    }
    public void clear(){
        list.clear();
    }
    public int size(){
        return list.size();
    }


}
