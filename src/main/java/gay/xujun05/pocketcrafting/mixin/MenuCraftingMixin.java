package gay.xujun05.pocketcrafting.mixin;

import net.minecraft.core.entity.player.Player;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.player.inventory.menu.MenuCrafting;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import gay.xujun05.pocketcrafting.ItemPocketWorkbench;

@Mixin(value = MenuCrafting.class, remap = false)
public class MenuCraftingMixin {

	@Inject(method = "stillValid", at = @At("HEAD"), cancellable = true)
	public void stillValid(Player player, CallbackInfoReturnable<Boolean> cir) {
		for (ItemStack stack : player.inventory.mainInventory) {
			if (stack != null && stack.getItem() instanceof ItemPocketWorkbench) {
				cir.setReturnValue(true);
				return;
			}
		}
	}
}
