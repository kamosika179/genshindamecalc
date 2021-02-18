class Main{
    public static void main(String[] args) {
    {
        int char_atk = 0; //キャラの基礎攻撃力
        int weapon_atk = 0;//武器の基礎攻撃力
        double atk_par = 0;//攻撃%
        int artifact_atk = 0;//聖遺物の攻撃力（固定値）

        /*https://wikiwiki.jp/genshinwiki/%E3%83%80%E3%83%A1%E3%83%BC%E3%82%B8%E8%A8%88%E7%AE%97%E5%BC%8F */
        int base_atk = char_atk + weapon_atk; //基礎攻撃力
        double display_atk = base_atk*(1 + atk_par) + artifact_atk; //表示攻撃力

        double talent_magnifi = 0; //天賦倍率

        double crit_dame = 0; //クリティカルダメ

        double damebuff = 0; //ダメージバフ

        int char_lv = 0; //キャラクターレベル

        int enemy_lv = 0; //敵レベル

        double difense_debuff = 0; //防御デバフ

        double enemy_resist = 0; //耐性

        double resist_debuff = 0;//耐性デバフ

                //お試し ためうち2段め15094
                display_atk = 1861;
                crit_dame = 226.6 * 0.01;
                damebuff = 61.6 * 0.01;
                talent_magnifi = 348 * 0.01;
                char_lv = 80;
                enemy_lv = 87;
                enemy_resist = 10 * 0.01;

        double damage = display_atk * talent_magnifi * (1 + crit_dame) * (1 + damebuff) * 1 * ((100 + char_lv)/((1 - difense_debuff)*(100 + enemy_lv) + (100 + char_lv)))*((1 -(enemy_resist-resist_debuff)));

        //お試し ためうち2段め15094
        display_atk = 1861;
        crit_dame = 226.6;
        damebuff = 61.6;
        talent_magnifi = 348;
        char_lv = 80;
        enemy_lv = 87;
        enemy_resist = 10;
        System.out.println(damage);

        /*GameMaster gm = new GameMaster();
        IceSlime ice = new IceSlime(87, 10);
        Status ganyu = new Ganyutest(1861, 348,32.2,226.6, 61.6, 80);
        gm.calcDamage(ice, ganyu);*/

        Hillchurl hill = new Hillchurl();
        Ganyu ganyu = new Ganyu();
        Blackcliff blackcliff = new Blackcliff();

        //ganyu.ele_buff = 0;
        CalcDame calcDame = new CalcDame(ganyu,hill,blackcliff);
        calcDame.print_normal_damege();
    }
}
}