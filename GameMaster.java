public class GameMaster {
    
    public void calcDamage(Enemy e,Status c){
        double damage_notcrit = c.display_atk * c.talent_magnifi * (1) * (1 + c.damebuff) * 1 * ((100 + c.char_lv)/((1 - c.difense_debuff)*(100 + e.enemy_lv) + (100 + c.char_lv)))*((1 -(e.enemy_resist-c.resist_debuff)));
        double damage_of_crit = c.display_atk * c.talent_magnifi * (1 + c.crit_dame) * (1 + c.damebuff) * 1 * ((100 + c.char_lv)/((1 - c.difense_debuff)*(100 + e.enemy_lv) + (100 + c.char_lv)))*((1 -(e.enemy_resist-c.resist_debuff)));
        System.out.println(damage_of_crit);
        System.out.println("期待値は多分これ:"+ damage_of_crit*c.crit_rate + damage_notcrit*(1-c.crit_rate));
    }
}
