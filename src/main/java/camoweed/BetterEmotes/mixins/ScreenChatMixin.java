package camoweed.BetterEmotes.mixins;

import net.minecraft.client.gui.chat.ScreenChat;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

// this prevents the menu from closing ⚠
@Mixin(ScreenChat.class)
public abstract class ScreenChatMixin {

	@Shadow(remap = false) protected boolean showEmotePicker;
	@Shadow(remap = false) protected net.minecraft.client.gui.chat.GuiElementChatEmotePicker emotePicker;
	@Shadow(remap = false) protected net.minecraft.client.gui.text.TextFieldEditor editor;

	@Inject(
		method = "mouseClicked",
		at = @At("HEAD"),
		cancellable = true,
		remap = false
	)
	private void keepPickerOpen(int mx, int my, int button, CallbackInfo ci) {
		if (button != 0 || !this.showEmotePicker) return;

		int h = ((net.minecraft.client.gui.Screen)(Object)this).height;

		Character c = this.emotePicker.click(
			mx - 2,
			my - (h - 16 - this.emotePicker.getHeight())
		);

		if (c != null) {
			this.editor.handleInput(0, c);
			ci.cancel(); // prevents closing
		}
	}
}
