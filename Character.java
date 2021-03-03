abstract public class Character extends Status{
    /*ファイルを読み込んで設定する。
    ・normal_talent_name は　talent_name talent lv 一段目 ...などが入っている入れる（一行目）
    ・normal_talent_magnificatino は　8 54.2 60.9 などが入っている　（二行目、数値だけ入ってる→長さが２短い）
    ・normal_talent_buff は 0 1 2 の数値が入っている（0は名称、1は物理、2は元素） 
    */
    String[] normal_talent_name;
    double[] normal_talent_magnification;
    String[] normal_talent_buff; // 0は文字,1なら物理攻撃.2なら属性攻撃
}
