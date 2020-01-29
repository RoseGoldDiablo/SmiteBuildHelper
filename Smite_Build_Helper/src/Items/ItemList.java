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

    // Item: Morningstar
    public static final Item Morningstar = new ItemBuilder()
            .setCategory( "Offensive" )
            .setTier( 1 )
            .setPhysicalPower( 10 )
            .setManaPer5( 5 )
            .setCost( 600 )
            .createItem();

    // Item: Charged Morningstar
    public static final Item ChargedMorningstar = new ItemBuilder()
            .setCategory( "Offensive" )
            .setTier( 2 )
            .setPhysicalPower( 20 )
            .setMana( 150 )
            .setManaPer5( 7 )
            .setCost( 600 )
            .createItem();

    // Item: Hydra's Star
    public static final Item HydrasStar = new ItemBuilder()
            .setCategory( "Offensive" )
            .setTier( 3 )
            .setPhysicalPower( 20 )
            .setCooldownReduction( 5 )
            .setManaPer5( 7 )
            .setCost( 600 )
            .setPassive( "PASSIVE - For 8 seconds after using an ability, your next basic attack " +
                    "will deal an additional 10% damage. The effect can only occur every 3 seconds." )
            .createItem();

    // Item: Transcendence
    public static final Item Transcendence = new ItemBuilder()
            .setCategory( "Offensive" )
            .setTier( 3 )
            .setPhysicalPower( 35 )
            .setMana( 300 )
            .setManaPer5( 10 )
            .setCooldownReduction( 10 )
            .setCost( 1400 )
            .setPassive( "PASSIVE - You permanently gain 15 Mana per Stack, and receive 5 Stacks for " +
                    "a god kill, and 1 Stack for a minion kill (max. 50 stacks). Additionally, 3% of your" +
                    " Mana is converted to Physical Power." )
            .createItem();

    // Item: Hydra's Lament
    public static final Item HydrasLament = new ItemBuilder()
            .setCategory( "Offensive" )
            .setTier( 3 )
            .setPhysicalPower( 40 )
            .setCooldownReduction( 10 )
            .setManaPer5( 10 )
            .setCost( 950 )
            .setPassive( "PASSIVE - For 8s after using an ability, your next Basic Attack will deal an " +
                    "additional 50% damage. Abilities that function like basic attacks do not benefit from" +
                    " this. PASSIVE - This item grants 2.5 MP5 per 10% of your missing Mana." )
            .createItem();

    // Item: Heartseeker
    public static final Item Heartseeker = new ItemBuilder()
            .setCategory( "Offensive" )
            .setTier( 3 )
            .setPhysicalPower( 75 )
            .setPhysicalPenetration( 10 )
            .setMana( 200 )
            .setManaPer5( 20 )
            .setCost( 1900 )
            .setPassive( "PASSIVE - Your abilities deal an additional 3% of the targets maximum Health " +
                    "as Physical Damage. If you have over 200 Physical Power, your ability bonus damage " +
                    "scales up. This effect reaches a maximum of 6% Maximum Health damage at 400 Physical Power." )
            .createItem();

    // Item: Magic Acorn
    public static final Item MagicAcorn = new ItemBuilder()
            .setCategory( "Utility" )
            .setTier( 1 )
            .setMovementSpeed( 8 )
            .setCost( 0 )
            .setPassive( "This item can be upgraded from anywhere and replaces Boots for Ratatoskr" )
            .createItem();

    // Item: Acorn of Swiftness
    public static final Item AcornOfSwiftness = new ItemBuilder()
            .setCategory( "Utility" )
            .setTier( 2 )
            .setPhysicalPower( 10 )
            .setMovementSpeed( 10 )
            .setCost( 700 )
            .createItem();

    // Item: Acorn of Yggdrasil
    public static final Item AcornOfYggdrasil = new ItemBuilder()
            .setCategory( "Utility" )
            .setTier( 3 )
            .setPhysicalPower( 50 )
            .setMovementSpeed( 20 )
            .setCost( 900 )
            .setPassive( "PASSIVE - Any time Ratatoskr uses an ability that successfully hits any target," +
                    "he is healed." )
            .createItem();

    // Item: Boots
    public static final Item Boots = new ItemBuilder()
            .setCategory( "Utility" )
            .setTier( 1 )
            .setMovementSpeed( 6 )
            .setCost( 500 )
            .createItem();

    // Item: Combat Boots
    public static final Item CombatBoots = new ItemBuilder()
            .setCategory( "Utility" )
            .setTier( 2 )
            .setPhysicalPower( 10 )
            .setMovementSpeed( 12 )
            .setCost( 400 )
            .createItem();

    // Item: Warrior Tabi
    public static final Item WarriorTabi = new ItemBuilder()
            .setCategory( "Utility" )
            .setTier( 3 )
            .setPhysicalPower( 40 )
            .setMovementSpeed( 18 )
            .setCost( 700 )
            .createItem();

    // Item: Ninja Tabi
    public static final Item NinjaTabi = new ItemBuilder()
            .setCategory( "Utility" )
            .setTier( 3 )
            .setPhysicalPower( 20 )
            .setMana( 100 )
            .setAttackSpeed( 25 )
            .setMovementSpeed( 18 )
            .setCost( 650 )
            .createItem();

    // Item: Reinforced Greaves
    public static final Item ReinforcedGreaves = new ItemBuilder()
            .setCategory( "Utility" )
            .setTier( 3 )
            .setPhysicalPower( 10 )
            .setHealth( 100 )
            .setCCReduction( 20 )
            .setMovementSpeed( 18 )
            .setCost( 650 )
            .setPassive( "PASSIVE - Every tine you are damaged by god you gain a stack that provides" +
                    "3 Physical and Magical Protections. Stack up to 7 times, Lasts 6s" )
            .createItem();

    // Item: Talaria Boots
    public static final Item TalariaBoots = new ItemBuilder()
            .setCategory( "Utility" )
            .setTier( 3 )
            .setPhysicalPower( 15 )
            .setManaPer5( 15 )
            .setMovementSpeed( 25 )
            .setCost( 700 )
            .setPassive( "PASSIVE - You gain +20% additional Movement Speed after leaving the Fountain." +
                    " This effect lasts 7s." )
            .createItem();

    // Item: Mask
    public static final Item Mask = new ItemBuilder()
            .setCategory( "Utility" )
            .setTier( 1 )
            .setHealth( 50 )
            .setMana( 50 )
            .setCost( 500 )
            .createItem();

    // Item: Fighter's Mask
    public static final Item FightersMask = new ItemBuilder()
            .setCategory( "Utility" )
            .setTier( 2 )
            .setPhysicalPower( 30 )
            .setMagicalPower( 60 )
            .setCost( 700 )
            .setPassive( "PASSIVE - Only can be bought by Warriors, Guardians." )
            .createItem();

    // Item: Rangda's Mask
    public static final Item RandgasMask = new ItemBuilder()
            .setCategory( "Utility" )
            .setTier( 3 )
            .setPhysicalPower( 60 )
            .setMagicalPower( 100 )
            .setCost( 1300 )
            .setPassive( "PASSIVE - GAIN DAMAGE, SACRIFICE DEFENSE. Only can be bought by Warriors" +
                    ", Guardians +20% Damage Dealt +25 Damage Taken")
            .createItem();

    // Item: Messenger's Mask
    public static final Item MessengersMask = new ItemBuilder()
            .setCategory( "Utility" )
            .setTier( 2 )
            .setPhysicalPower( 10 )
            .setMagicalPower( 20 )
            .setMovementSpeed( 10 )
            .setCooldownReduction( 10 )
            .setCost( 700 )
            .createItem();

    // Item: Bumba's Mask
    public static final Item BumbasMask = new ItemBuilder()
            .setCategory( "Utility" )
            .setTier( 3 )
            .setPhysicalPower( 30 )
            .setMagicalPower( 65 )
            .setCooldownReduction( 10 )
            .setMovementSpeed( 35 )
            .setCost( 1300 )
            .setPassive( "PASSIVE - GAIN MOBILITY, SACRIFICE DEFENSE & DAMAGE +15% Damage Taken -15%" +
                    "Damage Dealt" )
            .createItem();

    // Item: Protector's Mask
    public static final Item ProtectorsMask = new ItemBuilder()
            .setCategory( "Utility" )
            .setTier( 2 )
            .setHealth( 50 )
            .setPhysicalProtection( 15 )
            .setMagicalProtection( 15 )
            .setCCReduction( 10 )
            .setCost( 700 )
            .setPassive( "PASSIVE - Only cann be bought by Mages, Hunters, and Assassins" )
            .createItem();




}