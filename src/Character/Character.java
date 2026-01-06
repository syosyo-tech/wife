package Character;

// 各キャラクターの親クラス
public class Character {

    String name;
    int hp;

    // hpが0になったらゲームオーバー
    public boolean isAlive() {
        return hp > 0;
    }
}
