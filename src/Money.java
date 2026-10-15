public class Money {
    public long bills;
    public byte coins;

    public Money(long bills, int coins){

        byte remainingCoins = (byte) (coins % 100);
        int billsFromCoins = coins / 100;

        this.bills = bills + billsFromCoins;
        this.coins = remainingCoins;
    }

    public Money(double money){
        this.bills = (long) money;
        this.coins = (byte) ((money - bills)* 100);
    }

    public Money sum(Money other){
        return new Money(other.bills + bills, other.coins + coins);
    }

    public Money sub(Money other){

        return new Money(bills - other.bills, coins - other.coins);
    }

    public Money div(double scalar){
        double money = bills + (double) coins / 100;
        money /= scalar;

        return new Money((long) money, (int) ((money - bills)* 100));
    }

    public Money div(Money other){
        long bills = this.bills / other.bills;
        int coin = this.coins / other.coins;

        return new Money(bills, coin);
    }

    @Override
    public String toString() {
        return String.format("%d грн, %d коп", this.bills, this.coins);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Money other)
            return (this.bills == other.bills && this.coins == other.coins);
        return super.equals(obj);
    }

    public boolean isGreater(Money other){
        double money = bills + (double) coins / 100;
        double otherMoney = other.bills + (double) other.coins / 100;
        return money > otherMoney;
    }

    public boolean isLesser(Money other){
        double money = bills + (double) coins / 100;
        double otherMoney = other.bills + (double) other.coins / 100;
        return money < otherMoney;
    }
}