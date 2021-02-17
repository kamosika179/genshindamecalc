abstract public class Char {
    int char_atk; //キャラの基礎攻撃力
    int hp; //HP
    double talent_magnifi;//天賦倍率
    int char_lv; //キャラクターのレベル

    Weapon weapon = new Weapon();
    static final String ATK = "atk";
    static final String ATK_PER = "atk_per";
    static final String DEF = "def";
    static final String DEF_PER = "def_per";
    static final String HP_CONST = "hp";
    static final String HP_PER = "hp_per";
    static final String ELEMENTAL_MASTERY = "elemental_Mastery";
    static final String CRIT_RATE = "crit_rate";
    static final String CRIT_DAME  = "crit_dame";

    Artifact[] artifacts = new Artifact[5];
    
    Char(int _char_atk,int _hp,double _talent_magnifi,int _level){
        char_atk = _char_atk;
        hp = _hp;
        talent_magnifi = _talent_magnifi;
        char_lv = _level;
    }

    void make_artifacts(){
        artifacts[0].set_main_hp();
        artifacts[1].set_main_atk();
        artifacts[2].set_main_atk();
        artifacts[3].set_main_physics_damebuff();
        artifacts[4].set_main_crit_rate();

        artifacts[0].crit_dame = Artifact.grouth_rate.get(CRIT_DAME)*2;
        artifacts[0].crit_rate = Artifact.grouth_rate.get(CRIT_RATE);
        artifacts[0].atk_par = Artifact.grouth_rate.get(ATK_PER);

        artifacts[1].crit_dame = Artifact.grouth_rate.get(CRIT_DAME)*2;
        artifacts[1].crit_rate = Artifact.grouth_rate.get(CRIT_RATE);
        artifacts[1].atk_par = Artifact.grouth_rate.get(ATK_PER);

        artifacts[2].crit_dame = Artifact.grouth_rate.get(CRIT_DAME);
        artifacts[2].crit_rate = Artifact.grouth_rate.get(CRIT_RATE);

        artifacts[3].atk_par = Artifact.grouth_rate.get(ATK_PER);

        artifacts[4].crit_dame = Artifact.grouth_rate.get(CRIT_DAME);
        artifacts[4].atk_par = Artifact.grouth_rate.get(ATK_PER);

    }
}
