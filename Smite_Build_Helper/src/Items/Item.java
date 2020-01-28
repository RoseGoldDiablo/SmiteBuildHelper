package Items;

public class Item {
    // All the basic properties of items are instantiated here.
    public String Category, Passive;
    public int Tier, Health, PhysicalProtection, MagicalProtection, CCReduction, HealthPer5;
    public int PhysicalPower, MagicalPower;
    public int AttackSpeed, PhysicalLifeSteal, MagicalLifeSteal, PhysicalPenetration, CritChance, MovementSpeed;
    public int CooldownReduction, Mana, ManaPer5, Cost;


    // Constructor for the Item class. Here I define the Category and Tier through the parameters.
    public Item(  String Category, Integer Tier, int Health, int PhysicalProtection, int MagicalProtection
    , int CCReduction, int HealthPer5, int PhysicalPower, int MagicalPower, int AttackSpeed, int PhysicalLifeSteal
    , int MagicalLifeSteal, int PhysicalPenetration, int CritChance, int MovementSpeed, int CooldownReduction
    , int Mana, int ManaPer5, int Cost, String Passive  )
    {
            this.Category = Category;
            this.Tier = Tier;
            this.Health = Health;
            this.PhysicalProtection = PhysicalProtection;
            this.MagicalProtection = MagicalProtection;
            this.CCReduction = CCReduction;
            this.HealthPer5 = HealthPer5;
            this.PhysicalPower = PhysicalPower;
            this.MagicalPower = MagicalPower;
            this.AttackSpeed = AttackSpeed;
            this.PhysicalLifeSteal = PhysicalLifeSteal;
            this.MagicalLifeSteal = MagicalLifeSteal;
            this.PhysicalPenetration = PhysicalPenetration;
            this.CritChance = CritChance;
            this.MovementSpeed = MovementSpeed;
            this.CooldownReduction = CooldownReduction;
            this.Mana = Mana;
            this.ManaPer5 = ManaPer5;
            this.Cost = Cost;
            this.Passive = Passive;
    }




}

