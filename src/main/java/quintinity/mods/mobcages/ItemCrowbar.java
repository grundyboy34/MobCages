package quintinity.mods.mobcages;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

public class ItemCrowbar extends Item
{
	public ItemCrowbar()
	{
		super();
		this.setCreativeTab(CreativeTabs.tabTools);
		this.setUnlocalizedName("crowbar");
		this.setTextureName(MobCages.MODID + ":crowbar");
		this.setFull3D();
		this.setMaxDamage(10);
		this.setMaxStackSize(1);
	}
	
	public void usedOnCage(ItemStack stack, EntityPlayer player, World world, int x, int y, int z)
	{
		stack.damageItem(1, player);
		player.swingItem();
	}
}
