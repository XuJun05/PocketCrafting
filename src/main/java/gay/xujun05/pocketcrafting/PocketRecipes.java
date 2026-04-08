package gay.xujun05.pocketcrafting;

import net.minecraft.core.block.Blocks;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.Items;
import turniplabs.halplibe.helper.RecipeBuilder;
import turniplabs.halplibe.util.RecipeEntrypoint;

public class PocketRecipes implements RecipeEntrypoint {
	@Override
	public void onRecipesReady() {
		RecipeBuilder.Shaped(PocketCrafting.MOD_ID, "W", "S")
			.addInput('W', Blocks.WORKBENCH)
			.addInput('S', Items.STICK)
			.create("pocket_workbench", new ItemStack(PocketItems.pocketWorkbench));
	}

	@Override
	public void initNamespaces() {
		RecipeBuilder.initNameSpace(PocketCrafting.MOD_ID);
	}
}
