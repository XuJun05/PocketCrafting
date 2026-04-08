package gay.xujun05.pocketcrafting;

import net.minecraft.core.entity.player.Player;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;

public class ItemPocketWorkbench extends Item {
	public ItemPocketWorkbench(String name, String namespaceId, int id) {
		super(name, namespaceId, id);
		this.setMaxStackSize(1);
	}

	@Override
	public ItemStack onUseItem(ItemStack itemstack, World world, Player player) {
		player.displayWorkbenchScreen((int)player.x, (int)player.y, (int)player.z);
		return itemstack;
	}

	@Override
	public boolean onUseItemOnBlock(ItemStack itemstack, Player player, World world, int blockX, int blockY, int blockZ, Side side, double xPlaced, double yPlaced) {
		player.displayWorkbenchScreen((int)player.x, (int)player.y, (int)player.z);
		return true;
	}
}
