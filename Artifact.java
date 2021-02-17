import java.util.Map;
import java.util.HashMap;
import java.util.*;

public class Artifact {
    public int atk;
    int def;
    int hp;
    double atk_par;
    double def_par;
    double hp_par;
    double damebuff;
    int Elemental_Mastery;
    double crit_rate;
    double crit_dame;
    static Map<String,Double> grouth_rate = new HashMap<>();
    
    Artifact(){
        grouth_rate.put("atk",18.0);
        grouth_rate.put("atk_per",5.3);
        grouth_rate.put("def",21.0);
        grouth_rate.put("def_per",6.6);
        grouth_rate.put("hp",269.0);
        grouth_rate.put("hp_per",5.3);
        grouth_rate.put("elemental_Mastery",21.0);
        grouth_rate.put("crit_rate",3.5);
        grouth_rate.put("crit_dame",7.0);
    }

    void set_main_hp(){
        hp = 4780;
    }
    void set_main_hp_per(){
        hp_par = 46.6;
    }

    void set_main_atk(){
        atk =311;
    }

    void set_main_atk_per(){
        atk_par = 46.6; 
    }
    void set_main_def_per(){
        def_par = 58.3;
    }

    void set_main_elemental_mastery(){
        Elemental_Mastery = 187;
    }

    void set_main_element_damebuff(){
        damebuff = 46.6;
    }

    void set_main_physics_damebuff(){
        damebuff = 58.3;
    }

    void set_main_crit_rate(){
        crit_rate = 31.1;
    }

    void set_main_crit_dame(){
        crit_dame = 62.2;
    }


}
