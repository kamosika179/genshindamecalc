public class Blackcliff extends Weapon{
    Blackcliff(){
        set_value(".//弓/黒岩の戦弓.csv");
    }

    //敵を倒した後、攻撃力+12％、継続時間30秒。最大3重まで、
    //続時間は加算されず、重ごとに別カウントされる。
    void unique_ability(CalcDame c){

    }
}
