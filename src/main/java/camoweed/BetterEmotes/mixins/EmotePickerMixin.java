package camoweed.BetterEmotes.mixins;

import net.minecraft.client.gui.chat.GuiElementChatEmotePicker;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

// this is to put emotes in a reasonable order
@Mixin(GuiElementChatEmotePicker.class)
public class EmotePickerMixin {
	@Inject(method = "<init>", at = @At("TAIL"), remap = false)
	private void sortEmotesAfterInit(
		net.minecraft.client.Minecraft mc,
		net.minecraft.client.gui.chat.ScreenChat parent,
		int xCells,
		int yCells,
		CallbackInfo ci) {
		try {
			java.lang.reflect.Field emotesField = GuiElementChatEmotePicker.class.getDeclaredField("emotes");
			emotesField.setAccessible(true);
			Map.Entry<String, Character>[][] grid = (Map.Entry<String, Character>[][]) emotesField.get(this);
			List<Map.Entry<String, Character>> list = new ArrayList<>();
			for (Map.Entry<String, Character>[] row : grid) {
				for (Map.Entry<String, Character> e : row) {
					if (e != null) list.add(e);
				}
			}
			list.sort(Comparator.comparing(Map.Entry::getKey));

			int i = 0;
			for (int y = 0; y < grid.length; y++) {
				for (int x = 0; x < grid[y].length; x++) {
					if (i < list.size()) grid[y][x] = list.get(i++);
					else grid[y][x] = null;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
