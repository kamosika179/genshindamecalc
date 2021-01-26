class Main{
    public static void main(String[] args) {
    {
        int char_atk = 0;
        int weapon_atk = 0;
        double atk_par = 0;
        int artifact_atk = 0;

        /*基礎攻撃力が上がれば上がるほど、攻撃力固定値よりも攻撃力％の効果が高くなる
キャラボーナスの攻撃力％も武器・聖遺物の攻撃力％合計に含まれる
味方の攻撃力％を上昇させる料理・スキル・武器効果等もここで加算され、戦闘中にステータスを開くことで攻撃力が上昇していることを確認できる */
        int base_atk = char_atk + weapon_atk;
        double display_atk = base_atk*(1 + atk_par) + artifact_atk;

        double talent = 0;

        double crit_dame = 0;

        double damebuff = 0;

        int char_lv = 0;

        int enemy_lv = 0;

        double difense_debuff = 0;

        double enemy_resist = 0;

        double resist_debuff = 0;

        double damage = display_atk * talent * (1 + crit_dame) * (1 + damebuff) * 1 * (((100 + char_lv)/(1 - difense_debuff)*(100 + enemy_lv) + (100 + char_lv)))*((1 -(enemy_resist-resist_debuff)));
    }
}
}