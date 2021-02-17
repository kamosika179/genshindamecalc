import java.io.*;

public class Ganyu extends Character{
    Ganyu(){
        set_value(".//キャラ/甘雨.csv");
        set_talent(".//天賦/甘雨天賦通常.csv");
    }

    void set_talent(String name){
        File file = new File(name);
        try(BufferedReader br = new BufferedReader(new FileReader(file));){
        String normal_talent_name_raw = br.readLine();
        normal_talent_name = normal_talent_name_raw.split(",");
        
        String normal_talent_magnification_raw;
        String[] normal_talent_magnification_string;

        while((normal_talent_magnification_raw = br.readLine()) != null){
            normal_talent_magnification_string = normal_talent_magnification_raw.split(",");
            normal_talent_magnification = new double[normal_talent_magnification_string.length - 2];
            for(int i = 0;i < normal_talent_magnification_string.length - 2;i++){
                normal_talent_magnification[i] = Double.parseDouble(normal_talent_magnification_string[i + 2]);
            }
        }
        br.close();
        }catch(FileNotFoundException e){
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
