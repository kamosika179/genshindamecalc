import java.io.*;

public class Status{
    String name;
    String name_english;
    int lv;
    int hp;
    int atk;
    double atk_per;
    int def;
    double def_per;
    double hp_par;
    int em;
    double crit_rate;
    double crit_dame;

    void set_value(String name){
        File file = new File(name);
        try(BufferedReader br = new BufferedReader(new FileReader(file));){
        String status_str = br.readLine();
        System.out.println(status_str);
        
        while((status_str = br.readLine()) != null){
            String[] status_str_matrix = status_str.split(",");
            this.name = status_str_matrix[0];
            this.name = status_str_matrix[1];
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
        }
        br.close();
        }catch(FileNotFoundException e){
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }

    }

    void printStatus(){
        System.out.println(this.hp);
        System.out.println(this.crit_dame);
    }
}
