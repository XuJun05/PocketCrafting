package gay.xujun05.pocketcrafting;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.material.ToolMaterial;
import net.minecraft.core.item.tag.ItemTags;
import turniplabs.halplibe.helper.ItemBuilder;
import turniplabs.halplibe.util.ItemInitEntrypoint;

public class PocketItems implements ItemInitEntrypoint {
	public static Item pocketWorkbench;

	@Override
	public void afterItemInit() {
		initializeItems();
	}

	private static void initializeItems() {
		pocketWorkbench = new ItemBuilder(PocketCrafting.MOD_ID)
			.build(new ItemPocketWorkbench("pocket_workbench", PocketCrafting.MOD_ID + ":item/pocket_workbench", 20100));
	}
}
