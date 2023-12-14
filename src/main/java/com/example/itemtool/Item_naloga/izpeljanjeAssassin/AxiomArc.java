package com.example.itemtool.Item_naloga.izpeljanjeAssassin;

import com.example.itemtool.Item_naloga.Osnova.AssassinItem;
//dedovanje iz Assassin itema
public class AxiomArc extends AssassinItem {
    public AxiomArc(){
        super();
        name="Axiom Arc";
        AD=55;
        AP=0;
        HP=0;
        AbilityHaste=25;
        Lethality=18;
        Effect="Scoring a takedown against an enemy champion within 3 seconds of damaging them refunds 20% of your ultimate ability's maximum cooldown. Does not reduce cooldown below 0.5 seconds.";
    }
}
