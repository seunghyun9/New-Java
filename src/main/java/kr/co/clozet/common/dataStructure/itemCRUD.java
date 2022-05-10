package kr.co.clozet.common.dataStructure;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Scanner;


public class itemCRUD {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

    }
}
@Data @AllArgsConstructor @Component
class Item{
    protected String userid, name, password, phone, email;
    @Override public String toString(){
        return String.format("userid:%s",userid);
    }
}
interface ItemService{
    void save(Item item);
    void delete(Item item);
}

@RequiredArgsConstructor @Service
class ItemServiceImpl implements ItemService{
    private final Map<String,Item> map;

    @Override
    public void save(Item item) {

    }

    @Override
    public void delete(Item item) {

    }
}