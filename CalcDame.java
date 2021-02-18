public class CalcDame extends Status{
    Character character;
    Enemy enemy;
    Weapon weapon;
    Status[] artifacts;

    double def_debuff = 0;
    double resist_debuff = 0;

    double damage;
    CalcDame(Character _charcter,Enemy _enemy,Weapon _weapon){
        character = _charcter;
        enemy = _enemy;
        weapon = _weapon;
        this.atk_per = _charcter.atk_per + _weapon.atk_per + 0;
        this.atk = 0;
        this.crit_rate = _charcter.crit_rate + _weapon.crit_rate + 0;
        this.crit_dame = _charcter.crit_dame + _weapon.crit_dame + 0;
        this.phy_buff = _charcter.phy_buff + _weapon.phy_buff + 0;
        this.ele_buff = _charcter.ele_buff + _weapon.ele_buff + 0;
        this.em = _charcter.em + _weapon.em + 0;
    }

    // double damage = ((character.atk + weapon.atk)*(1 + this.atk_per*0.01) + this.atk)* talent * (1 + this.crit_dame*0.01) * (1 + this.phy_buff*0.01) * 1 * ((100 + character.lv)/((1 - def_debuff)*(100 + enemy.lv) + (100 + character.lv)))*((1 -(enemy.debuff_resist*0.01-resist_debuff)));

    void print_normal_damege(){
        //System.out.println(character.normal_talent_name[0]);
        //System.out.println(character.normal_talent_name[1]);
        for(int i = 0;i < character.normal_talent_name.length;i++){
            switch(character.normal_talent_buff[i]){
                case "0":
                System.out.println(character.normal_talent_name[i]);
                break;

                case "1":
                damage = ((character.atk + weapon.atk)*(1 + this.atk_per*0.01) + this.atk) * character.normal_talent_magnification[i - 2] *0.01 * (1 + this.crit_dame*0.01) * (1 + this.phy_buff*0.01) * 1 * ((100 + character.lv)/((1 - def_debuff)*(100 + enemy.lv) + (100 + character.lv)))*((1 -(enemy.debuff_resist*0.01-resist_debuff)));
                System.out.println(character.normal_talent_name[i]+":"+damage);
                break;

                case "2":
                damage = ((character.atk + weapon.atk)*(1 + this.atk_per*0.01) + this.atk) * character.normal_talent_magnification[i - 2] *0.01 * (1 + this.crit_dame*0.01) * (1 + this.ele_buff*0.01) * 1 * ((100 + character.lv)/((1 - def_debuff)*(100 + enemy.lv) + (100 + character.lv)))*((1 -(enemy.debuff_resist*0.01-resist_debuff)));
                System.out.println(character.normal_talent_name[i]+":"+damage);
                break;
            }
        }
    }
}
