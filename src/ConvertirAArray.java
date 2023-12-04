import java.util.*;

public class ConvertirAArray {
    public static void main(String args[]) {

      ArrayList<String> marcas = new ArrayList<>();
      marcas.add("Huawei");
      marcas.add("Samsung");
      marcas.add("Xiamoi");
      marcas.add("Apple");

      String[] str = new String[marcas.size()];
      for(int i=0; i < marcas.size(); i++) {
          str[i] = marcas.get(i);
      }

      for(String s : str) {
        System.out.println(s);      
      }
    }
}
