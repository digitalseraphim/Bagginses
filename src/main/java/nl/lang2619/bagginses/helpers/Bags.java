package nl.lang2619.bagginses.helpers;

import net.minecraft.item.Item;

/**
 * Created by Alex on 28/01/2017.
 */
public class Bags {

  private Item tier1;
  private Item tier2;
  private Item tier3;
  private String color;
  private boolean registered;
  private String desc;
  private String serverDesc;

  public Bags(Item tier1, Item tier2, Item tier3, String color, boolean registered) {
      this.tier1 = tier1;
      this.tier2 = tier2;
      this.tier3 = tier3;
      this.color = color;
      this.registered = registered;
  }

  public Item getTier1() {
    return tier1;
  }

  public Item getTier2() {
    return tier2;
  }

  public Item getTier3() {
    return tier3;
  }

  public String getColor() {
    return color;
  }

  public boolean isRegistered() {
    return registered;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public String getDesc() {
    return this.desc;
  }

  public void setServerDesc(String desc) {
    this.serverDesc = desc;
  }

  public String getServerDesc() {
    return this.serverDesc;
  }

}
