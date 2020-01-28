package Items;

public class ItemList{
    // Item: Iron Mail
    public static final Item IronMail = new ItemBuilder()
            .setCategory(  "Defensive"  )
            .setTier(1)
            .setHealth(75)
            .setPhysicalProtection(10)
            .setCost( 650 )
            .createItem();
    // Item: Steel Mail
    public static final Item SteelMail = new ItemBuilder()
            .setCategory(  "Defensive"  )
            .setTier(  2  ).setHealth(  200  )
            .setPhysicalProtection(20)
            .setCost( 750 )
            .createItem();
    // Item: Sovereignty
    public static final Item Sovereignty = new ItemBuilder()
            .setCategory(  "Defensive"  )
            .setTier(  3  )
            .setHealth(  250  )
            .setPhysicalProtection(  45  )
            .setCost( 700 )
            .setPassive( "AURA - Allied gods within 70 units have their Physical Protections " +
                        "increased by 15 and their HP5 increased by 25.")
            .createItem();

    // Item: Mystical Mail
    public static final Item MysticalMail = new ItemBuilder()
            .setCategory(  "Defensive"  )
            .setTier( 3 )
            .setHealth( 300 )
            .setPhysicalProtection( 40 )
            .setCCReduction( 20 )
            .setCost( 1300 )
            .setPassive( "AURA - ALL enemies within 25 units are dealt 40 Magical Damage per second." )
            .createItem();

    // Item: Midgardian Mail
    public static final Item MidgardianMail = new ItemBuilder()
            .setCategory( "Defensive" )
            .setTier( 3 )
            .setHealth( 300 )
            .setPhysicalProtection( 40 )
            .setCost( 900 )
            .setPassive(  "PASSIVE - Enemies that successfully land a basic attack on you have their " +
                    "Movement Speed and Attack Speed reduced by 8% for 2 seconds. This effect can " +
                    "stack up to 3 times and can stack with other item slow effects."  )
            .createItem();

    // Item: Emperor's Armor
    public static final Item EmperorsArmor = new ItemBuilder()
            .setCategory( "Defensive" )
            .setTier( 3 )
            .setHealth( 250 )
            .setPhysicalProtection( 40 )
            .setCost( 600 )
            .setPassive( "AURA - Damageable enemy structures within 55 units have their Attack Speed" +
                    "reduced by 30%. Damageable allied structures within 55 units have their Attack" +
                    "Speed increased by 40%" )
            .createItem();

    // Item: Light Blade
    public static final Item LightBlade = new ItemBuilder()
            .setCategory( "Offensive" )
            .setTier( 1 )
            .setPhysicalPower( 5 )
            .setAttackSpeed( 10 )
            .setCost( 600 )
            .createItem();

    // Item: Balanced Blade
    public static final Item BalancedBlade = new ItemBuilder()
            .setCategory( "Offensive" )
            .setTier( 2 )
            .setPhysicalPower( 15 )
            .setAttackSpeed( 15 )
            .setCost( 650 )
            .createItem();

    // Item: Asi
    public static final Item Asi = new ItemBuilder()
            .setCategory( "Offensive" )
            .setTier( 3 )
            .setPhysicalPower( 20 )
            .setPhysicalLifeSteal( 20 )
            .setAttackSpeed( 25 )
            .setPhysicalPenetration( 15 )
            .setCost( 1300 )
            .setPassive( "PASSIVE - If you drop below 35% Health, you gain an additional 30%" +
                    "Physical LifeSteal for 5 seconds. Can occur once every 15 seconds" )
            .createItem();

    // Item: The Executioner
    public static final Item TheExecutioner = new ItemBuilder()
            .setCategory( "Offensive" )
            .setTier( 3 )
            .setPhysicalPower( 30 )
            .setAttackSpeed( 25 )
            .setCost( 1100 )
            .setPassive( "Passive - Basic Attacks against an enemy reduce your target's Physical" +
                    "Protection by 12% for 3 seconds ( max. 3 Stacks )." )
            .createItem();

    // Item: Qin's Sais
    public static final Item QinsSais = new ItemBuilder()
            .setCategory( "Offensive" )
            .setTier( 3 )
            .setPhysicalPower( 40 )
            .setAttackSpeed( 20 )
            .setCost( 1450 )
            .setPassive( "Passive - On Basic Attack hits, deal Physical Damage equal to 3% of the" +
                    "target's maximum Health. If the target has over 2000 Health, the bonus damage" +
                    "scales up. This effects reaches a maximum of 5% of the targets Maximum Health" +
                    "at 2750." )
            .createItem();

    // Item: Tiny Trinket
    public static final Item TinyTrinket = new ItemBuilder()
            .setCategory( "Offensive" )
            .setTier( 1 )
            .setMagicalPower( 20 )
            .setMagicalLifeSteal( 6 )
            .setCost( 550 )
            .createItem();

    // Item: Enchanted Trinket
    public static final Item EnchantedTrinket = new ItemBuilder()
            .setCategory( "Offensive" )
            .setTier( 2 )
            .setMagicalPower( 30 )
            .setHealth( 100 )
            .setMagicalLifeSteal( 12 )
            .setCost( 550 )
            .createItem();

    // Item: Talon Trinket
    public static final Item TalonTrinket = new ItemBuilder()
            .setCategory( "Offensive" )
            .setTier( 2 )
            .setMagicalPower( 60 )
            .setMana( 100 )
            .setMagicalLifeSteal( 8 )
            .setCost( 850 )
            .createItem();

    // Item: Pythagorem's Piece
    public static final Item PythagoremsPiece = new ItemBuilder()
            .setCategory( "Offensive" )
            .setTier( 3 )
            .setMagicalPower( 40 )
            .setHealth( 200 )
            .setMagicalLifeSteal( 12 )
            .setCooldownReduction( 10 )
            .setCost( 1200 )
            .setPassive( "AURA - Allied gods within 70 units have their Magical LifeSteal increased by " +
                    "12% and their Magical Power increased by 30 or their Physical LifeSteal increased by" +
                    "10% and their Physical Power increased by 20." )
            .createItem();

    // Item: Bancroft's Talon
    public static final Item BancroftsTalon = new ItemBuilder()
            .setCategory( "Offensive" )
            .setTier( 3 )
            .setMagicalPower( 100 )
            .setMagicalLifeSteal( 15 )
            .setMana( 150 )
            .setCost( 1100 )
            .setPassive( "PASSIVE - You gain additional Magical Power and LifeSteal scaled from missing" +
                    "Health. This caps 100 power and 20% LifeSteal at 25% Health" )
            .createItem();

    // Item: Typhon's Fang
    public static final Item TyphonsFang = new ItemBuilder()
            .setCategory( "Offensive" )
            .setTier( 3 )
            .setMagicalPower( 80 )
            .setMana( 200 )
            .setMagicalLifeSteal( 15 )
            .setCost( 1400 )
            .setPassive( "PASSIVE - Your Healing obtained from Magical LifeSteal is increased by 40%." +
                    "Your Magical Power is increased by twice the amount of Magical LifeSteal you have" )
            .createItem();

    // Item: Soul Gem
    public static final Item SoulGem = new ItemBuilder()
            .setCategory( "Offensive" )
            .setTier( 3 )
            .setMagicalPower( 65 )
            .setHealth( 150 )
            .setMagicalLifeSteal( 12 )
            .setCooldownReduction( 10 )
            .setCost( 1200 )
            .setPassive( "PASSIVE - On successful hit of an Ability you gain 1 stack. At 4 Stacks your" +
                    "next Ability that damages an enemy God will deal bonus damage equal to 30% of your" +
                    "Magical Power to each God hit, and will heal yourself and allies within 20 units for" +
                    "40% of your Magical Power and will consume the 4 stacks." )
            .createItem();

    // Item: Mace
    public static final Item Mace = new ItemBuilder()
            .setCategory( "Offensive" )
            .setTier( 1 )
            .setPhysicalPower( 15 )
            .setCost( 700 )
            .createItem();

    // Item: Warriors Bane
    public static final Item WarriorsBane = new ItemBuilder()
            .setCategory( "Offensive" )
            .setTier( 2 )
            .setPhysicalPower( 20 )
            .setCost( 800 )
            .setPassive( "PASSIVE - Your Physical Damage ignores 15% of enemy gods' Physical Protection." )
            .createItem();

    // Item: Heavy Mace
    public static final Item HeavyMace = new ItemBuilder()
            .setCategory( "Offensive" )
            .setTier( 2 )
            .setPhysicalPower( 25 )
            .setPhysicalPenetration( 10 )
            .setCost( 850 )
            .createItem();

    // Item: Titan's Bane
    public static final Item TitansBane = new ItemBuilder()
            .setCategory( "Offensive" )
            .setTier( 3 )
            .setPhysicalPower( 30 )
            .setCost( 800 )
            .setPassive( "PASSIVE - Your Physical Damage ignores 15% of enemy gods' Physical Protection." +
                    "If the god has over 65 Physical Protections, this effect scales up to ignore a larger" +
                    "percentage of their protection. This caps at 40% Physical Penetration at 200 or more" +
                    "Physical Protection." )
            .createItem();

    // Item: Brawler's Beat Stick
    public static final Item BrawlersBeatStick = new ItemBuilder()
            .setCategory( "Offensive" )
            .setTier( 3 )
            .setPhysicalPower( 40 )
            .setPhysicalPenetration( 15 )
            .setCost( 3 )
            .setPassive( "PASSIVE - Enemies hit by your Abilities have 40% reduced healing and regeneration" +
                    "for 8 seconds" )
            .createItem();

    // Item: Jotunn's Wrath
    public static final Item JotunnsWrath = new ItemBuilder()
            .setCategory( "Offensive" )
            .setTier( 3 )
            .setPhysicalPower( 40 )
            .setMana( 150 )
            .setPhysicalPenetration( 10 )
            .setCooldownReduction( 20 )
            .setCost( 800 )
            .createItem();

    // Item: The Crusher
    public static final Item TheCrusher = new ItemBuilder()
            .setCategory( "Offensive" )
            .setTier( 3 )
            .setPhysicalPower( 30 )
            .setAttackSpeed( 20 )
            .setPhysicalPenetration( 15 )
            .setCost( 850 )
            .setPassive( "Enemies hit by your damaging abilites take an additional 20 Physical Damage" +
                    "+ 15% of your Physical Power over 2s." )
            .createItem();
}