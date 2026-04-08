package gay.xujun05.pocketcrafting;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.util.GameStartEntrypoint;
import turniplabs.halplibe.util.RecipeEntrypoint;

public class PocketCrafting implements ModInitializer, RecipeEntrypoint, GameStartEntrypoint {
	public static final String MOD_ID = "pocketcrafting";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	@Override
	public void onInitialize() {
		LOGGER.info("诶 醒醒醒醒 该起床了！");
	}

	@Override
	public void onRecipesReady() {
		new PocketRecipes().onRecipesReady();
	}

	@Override
	public void initNamespaces() {
		new PocketRecipes().initNamespaces();
	}

	@Override
	public void beforeGameStart() {
	}

	@Override
	public void afterGameStart() {}
}
