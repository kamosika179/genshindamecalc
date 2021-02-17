public abstract class Enemy {
    int enemy_lv; //敵レベル

    double enemy_resist; //耐性

    Enemy(int lv,double resist){
        this.enemy_lv = lv;
        this.enemy_resist = resist * 0.01;
    }

}
