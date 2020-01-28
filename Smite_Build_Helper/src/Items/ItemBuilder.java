package Items;

public class ItemBuilder {
    private String category = "None";
    private Integer tier = 0;
    private int health = 0;
    private int physicalProtection = 0;
    private int magicalProtection = 0;
    private int ccReduction = 0;
    private int healthPer5 = 0;
    private int physicalPower = 0;
    private int magicalPower = 0;
    private int attackSpeed = 0;
    private int physicalLifeSteal = 0;
    private int magicalLifeSteal = 0;
    private int physicalPenetration = 0;
    private int critChance = 0;
    private int movementSpeed = 0;
    private int cooldownReduction = 0;
    private int mana = 0;
    private int manaPer5 = 0;
    private int cost = 0;
    private String passive = "None";

    public ItemBuilder setCategory(String category) {
        this.category = category;
        return this;
    }

    public ItemBuilder setTier(Integer tier) {
        this.tier = tier;
        return this;
    }

    public ItemBuilder setHealth(int health) {
        this.health = health;
        return this;
    }

    public ItemBuilder setPhysicalProtection(int physicalProtection) {
        this.physicalProtection = physicalProtection;
        return this;
    }

    public ItemBuilder setMagicalProtection(int magicalProtection) {
        this.magicalProtection = magicalProtection;
        return this;
    }

    public ItemBuilder setCCReduction(int ccReduction) {
        this.ccReduction = ccReduction;
        return this;
    }

    public ItemBuilder setHealthPer5(int healthPer5) {
        this.healthPer5 = healthPer5;
        return this;
    }

    public ItemBuilder setPhysicalPower(int physicalPower) {
        this.physicalPower = physicalPower;
        return this;
    }

    public ItemBuilder setMagicalPower(int magicalPower) {
        this.magicalPower = magicalPower;
        return this;
    }

    public ItemBuilder setAttackSpeed(int attackSpeed) {
        this.attackSpeed = attackSpeed;
        return this;
    }

    public ItemBuilder setPhysicalLifeSteal(int physicalLifeSteal) {
        this.physicalLifeSteal = physicalLifeSteal;
        return this;
    }

    public ItemBuilder setMagicalLifeSteal(int magicalLifeSteal) {
        this.magicalLifeSteal = magicalLifeSteal;
        return this;
    }

    public ItemBuilder setPhysicalPenetration(int physicalPenetration) {
        this.physicalPenetration = physicalPenetration;
        return this;
    }

    public ItemBuilder setCritChance(int critChance) {
        this.critChance = critChance;
        return this;
    }

    public ItemBuilder setMovementSpeed(int movementSpeed) {
        this.movementSpeed = movementSpeed;
        return this;
    }

    public ItemBuilder setCooldownReduction(int cooldownReduction) {
        this.cooldownReduction = cooldownReduction;
        return this;
    }

    public ItemBuilder setMana(int mana) {
        this.mana = mana;
        return this;
    }

    public ItemBuilder setManaPer5(int manaPer5) {
        this.manaPer5 = manaPer5;
        return this;
    }

    public ItemBuilder setPassive(String passive) {
        this.passive = passive;
        return this;
    }

    public ItemBuilder setCost(int cost) {
        this.cost = cost;
        return this;
    }

    public Item createItem() {
        return new Item(category, tier, health, physicalProtection, magicalProtection, ccReduction, healthPer5,
                physicalPower, magicalPower, attackSpeed, physicalLifeSteal, magicalLifeSteal, physicalPenetration,
                critChance, movementSpeed, cooldownReduction, mana, manaPer5, cost, passive);
    }
}