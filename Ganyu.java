import java.io.*;

public class Ganyu extends Character{
    Ganyu(){
        set_value(".//キャラ/甘雨.csv");
        set_talent(".//天賦/甘雨天賦通常.csv");
    }

    /*@Override
    void set_value(String name){
        File file = new File(name);
        try(BufferedReader br = new BufferedReader(new FileReader(file));){
        String status_str = br.readLine();

            String[] status_str_matrix = status_str.split(",");
            this.name = status_str_matrix[0];
            this.name_english = status_str_matrix[1];
            this.lv = Integer.parseInt(status_str_matrix[2]);
            this.hp = Integer.parseInt(status_str_matrix[3]);
            this.def = Integer.parseInt(status_str_matrix[4]);
            this.atk = Integer.parseInt(status_str_matrix[5]);
            this.atk_per = Double.parseDouble(status_str_matrix[6]);
            this.def_per = Double.parseDouble(status_str_matrix[7]);
            this.hp_par = Double.parseDouble(status_str_matrix[8]);
            this.em = Integer.parseInt(status_str_matrix[9]);
            this.crit_rate = Double.parseDouble(status_str_matrix[10]);
            this.crit_dame = Double.parseDouble(status_str_matrix[11]);
            this.phy_buff = Double.parseDouble(status_str_matrix[12]);
            this.ele_buff = Double.parseDouble(status_str_matrix[13]);
            
        br.close();
        }catch(FileNotFoundException e){
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }
    }
    */
    
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
            normal_talent_buff = br.readLine().split(",");
        }
        br.close();
        }catch(FileNotFoundException e){
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }
    }

}
