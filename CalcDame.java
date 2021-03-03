public class CalcDame extends Status{
    Character character;
    Enemy enemy;
    Weapon weapon;
    Artifact[] artifacts = new Artifact[5];

    double def_debuff = 0;
    double resist_debuff = 0;

    double damage;
    CalcDame(Character _charcter,Enemy _enemy,Weapon _weapon){
        character = _charcter;
        enemy = _enemy;
        weapon = _weapon;
        this.atk_per = _charcter.atk_per + _weapon.atk_per;
        this.atk = 0;
        this.crit_rate = _charcter.crit_rate + _weapon.crit_rate + 0;
        this.crit_dame = _charcter.crit_dame + _weapon.crit_dame + 0;
        this.phy_buff = _charcter.phy_buff + _weapon.phy_buff + 0;
        this.ele_buff = _charcter.ele_buff + _weapon.ele_buff + 0;
        this.em = _charcter.em + _weapon.em + 0;
    }



    /*通常攻撃のダメージを表示します*/
    void print_normal_damege(){
        for(int i = 0;i < character.normal_talent_name.length;i++){
            switch(character.normal_talent_buff[i]){
                //0は物理攻撃でもない、元素攻撃でもない
                case "0":
                System.out.println(character.normal_talent_name[i]);
                break;

                //1は物理攻撃を表示
                case "1":
                damage = ((character.atk + weapon.atk)*(1 + this.atk_per*0.01) + this.atk) * character.normal_talent_magnification[i - 2] *0.01 * (1 + this.crit_dame*0.01) * (1 + this.phy_buff*0.01) * 1 * ((100 + character.lv)/((1 - def_debuff)*(100 + enemy.lv) + (100 + character.lv)))*((1 -(enemy.resist*0.01-resist_debuff)));
                System.out.println(character.normal_talent_name[i]+":"+damage);
                break;

                //2は属性攻撃を表示
                case "2":
                damage = ((character.atk + weapon.atk)*(1 + this.atk_per*0.01) + this.atk) * character.normal_talent_magnification[i - 2] *0.01 * (1 + this.crit_dame*0.01) * (1 + this.ele_buff*0.01) * 1 * ((100 + character.lv)/((1 - def_debuff)*(100 + enemy.lv) + (100 + character.lv)))*((1 -(enemy.resist*0.01-resist_debuff)));
                System.out.println(character.normal_talent_name[i]+":"+damage);
                break;

                default:
                System.out.println("default");
                break;
            }
        }
    }

    void setArtifact(Artifact ar1){
        atk += ar1.atk;
        def += ar1.def;
        hp += ar1.hp;
        atk_per += ar1.atk_par;
        def_per += ar1.def_par;
        hp_par += ar1.hp_par;
        phy_buff += ar1.phy_buff;
        ele_buff += ar1.ele_buff;
        em += ar1.Elemental_Mastery;
        crit_rate += ar1.crit_rate;
        crit_dame += ar1.crit_dame;
    }

    void print_status(){
        System.out.println(character.name);
        System.out.println(hp +":"+ (1 + hp_par)*0.01 );
        System.out.println(character.atk);
        System.out.println(weapon.atk);
        System.out.println(atk_per);
        System.out.println((character.atk + weapon.atk)*(1 + atk_per*0.01));
        System.out.println(crit_dame);
        System.out.println(ele_buff);
        System.out.println(phy_buff);
    }
}
