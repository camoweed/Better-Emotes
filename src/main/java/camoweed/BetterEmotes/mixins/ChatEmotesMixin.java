package camoweed.BetterEmotes.mixins;

import camoweed.BetterEmotes.BetterEmotes;
import net.minecraft.core.net.ChatEmotes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

// emotes appear alphabetically AFTER vanilla emotes
@Mixin(ChatEmotes.class)
public class ChatEmotesMixin {

	@Inject(method = "<clinit>", at = @At("TAIL"))
	private static void registerExtras(CallbackInfo ci) {
		if (BetterEmotes.Cute) {
			configCute();
		}
		if (BetterEmotes.Casino) {
			configCasino();
		}
		if (BetterEmotes.Punctuation) {
			configPunctuation();
		}
		if (BetterEmotes.BoldLetters) {
			configBoldLetters();
		}
		if (BetterEmotes.BoldNumbers) {
			configBoldNumbers();
		}
		if (BetterEmotes.StandardGalaticAlphabet) {
			configSGA();
		}
		if (BetterEmotes.BoxDrawing) {
			configBoxDraw();
		}
		if (BetterEmotes.Mathematics) {
			configMath();
		}
		if (BetterEmotes.EncircledLetters) {
			configEncircledLetters();
		}
		if (BetterEmotes.EncircledNumbers) {
			configEncircledNumbers();
		}
		if (BetterEmotes.GreekLetters) {
			configGreekLetters();
		}
		if (BetterEmotes.Shapes) {
			configShapes();
		}
		if (BetterEmotes.Symbols) {
			configSymbols();
		}
		if (BetterEmotes.Arrows) {
			configArrows();
		}
		if (BetterEmotes.MediaControls) {
			configMediaControls();
		}
		if (BetterEmotes.MusicalNotation) {
			configMusicalNotation();
		}
		if (BetterEmotes.Religious) {
			configReligious();
		}
	}
		@Unique
		private static void configReligious() {
		ChatEmotes.register("ΩEmotes-cross", '†');
		ChatEmotes.register("ΩEmotes-cross-upside-down", '⸸');
		ChatEmotes.register("ΩEmotes-cross-orthodox", '‡');
		ChatEmotes.register("ΩEmotes-cross-triple", '⹋');
}
		@Unique
		private static void configMusicalNotation() {
		ChatEmotes.register("ΩEmotes-08music-note-quarter-alt", '♩');
		ChatEmotes.register("ΩEmotes-08music-note-sixteenth-alt", '♬');
		ChatEmotes.register("ΩEmotes-08music-note-flat", '♭');
		ChatEmotes.register("ΩEmotes-08music-note-sharp", '♯');
		ChatEmotes.register("ΩEmotes-08music-note-natural", '♮');
}
		@Unique
		private static void configCasino() {
		ChatEmotes.register("ΩEmotes-05-lucky-dice-1", '⚀');
		ChatEmotes.register("ΩEmotes-05-lucky-dice-2", '⚁');
		ChatEmotes.register("ΩEmotes-05-lucky-dice-3", '⚂');
		ChatEmotes.register("ΩEmotes-05-lucky-dice-4", '⚃');
		ChatEmotes.register("ΩEmotes-05-lucky-dice-5", '⚄');
		ChatEmotes.register("ΩEmotes-05-lucky-dice-6", '⚅');
		ChatEmotes.register("ΩEmotes-06-suit-spades-inverted", '♤');
		ChatEmotes.register("ΩEmotes-06-suit-clubs-inverted", '♧');
		ChatEmotes.register("ΩEmotes-06-suit-hearts-inverted", '♡');
		ChatEmotes.register("ΩEmotes-06-suit-diamonds-inverted", '♢');
}
		@Unique
		private static void configPunctuation() {
		ChatEmotes.register("ΩEmotes-punctuation-exclamation-double", '‼');
		ChatEmotes.register("ΩEmotes-punctuation-exclamation-upside-down", '¡');
		ChatEmotes.register("ΩEmotes-punctuation-exclamation-half", '⸵');
		ChatEmotes.register("ΩEmotes-punctuation-exclamation-backwards-question", '⸮');
		ChatEmotes.register("ΩEmotes-punctuation-pilcrow", '¶');
		ChatEmotes.register("ΩEmotes-punctuation-tick-back", '«');
		ChatEmotes.register("ΩEmotes-punctuation-tick-forward", '»');
		ChatEmotes.register("ΩEmotes-punctuation-bullet-point-white", '◦');
		ChatEmotes.register("ΩEmotes-punctuation-tiny-asterisk",'⋆');
}
		@Unique
		private static void configMediaControls() {
		ChatEmotes.register("ΩEmotes-ampersand-upside-down",'⅋');
		ChatEmotes.register("ΩEmotes-media-eject",'⏏');
		ChatEmotes.register("ΩEmotes-media-00",'⏩');
		ChatEmotes.register("ΩEmotes-media-01",'⏪');
		ChatEmotes.register("ΩEmotes-media-02",'⏭');
		ChatEmotes.register("ΩEmotes-media-03",'⏮');
		ChatEmotes.register("ΩEmotes-media-04",'⏯');
		ChatEmotes.register("ΩEmotes-media-05",'⏴');
		ChatEmotes.register("ΩEmotes-media-06",'⏵');
		ChatEmotes.register("ΩEmotes-media-07",'⏶');
		ChatEmotes.register("ΩEmotes-media-08",'⏷');
		ChatEmotes.register("ΩEmotes-media-09",'⏸');
		ChatEmotes.register("ΩEmotes-media-10",'⏹');
		ChatEmotes.register("ΩEmotes-media-11",'⏺');
		ChatEmotes.register("ΩEmotes-media-12-power-on",'⏻');
		ChatEmotes.register("ΩEmotes-media-13-power-off",'⏼');
		ChatEmotes.register("ΩEmotes-media-14-power-line",'⏽');
		ChatEmotes.register("ΩEmotes-media-15-power-circle",'⭘');
		ChatEmotes.register("ΩEmotes-media-16-next",'▶');
		ChatEmotes.register("ΩEmotes-media-17-previous",'◀');
}
		@Unique
		private static void configCute() {
		ChatEmotes.register("ΩEmotes-01cute-intersex", '⚥');
		ChatEmotes.register("ΩEmotes-00-colour-code", '§');
		ChatEmotes.register("ΩEmotes-00cute-hand-left",'☜');
		ChatEmotes.register("ΩEmotes-00cute-hand-right",'☞');
		ChatEmotes.register("ΩEmotes-00cute-thin-sun",'☼');
		ChatEmotes.register("ΩEmotes-00cute-hum",'☹');
		ChatEmotes.register("ΩEmotes-00cute-warning",'⚠');
		ChatEmotes.register("ΩEmotes-00cute-peace",'☮');
		ChatEmotes.register("ΩEmotes-00cute-yin-yang",'☯');
		ChatEmotes.register("ΩEmotes-00cute-cool-sword",'⚔');
		ChatEmotes.register("ΩEmotes-00cute-ship-anchor",'⚓');
		ChatEmotes.register("ΩEmotes-00cute-rain-umbrella",'☔');
		ChatEmotes.register("ΩEmotes-00cute-shooting-star",'☄');
		ChatEmotes.register("ΩEmotes-00cute-snowman-alt",'☃');
		ChatEmotes.register("ΩEmotes-00cute-heart-alt",'❣');
		ChatEmotes.register("ΩEmotes-00cute-pencil",'✎');
		ChatEmotes.register("ΩEmotes-00cute-thunder-cloud",'⛈');
		ChatEmotes.register("ΩEmotes-00cute-star-smooth",'☆');
		ChatEmotes.register("ΩEmotes-00cute-star-inverted",'★');
		ChatEmotes.register("ΩEmotes-00cute-rain-cloud",'');
		ChatEmotes.register("ΩEmotes-00cute-fire",'');
		ChatEmotes.register("ΩEmotes-00cute-wave",'');
		ChatEmotes.register("ΩEmotes-00cute-awesome-sword",'');
		ChatEmotes.register("ΩEmotes-00cute-awesome-bow",'');
		ChatEmotes.register("ΩEmotes-00cute-awesome-axe",'');
		ChatEmotes.register("ΩEmotes-00cute-awesome-trident",'');
		ChatEmotes.register("ΩEmotes-00cute-awesome-rod",'');
		ChatEmotes.register("ΩEmotes-00cute-potion",'');
		ChatEmotes.register("ΩEmotes-00cute-potion-alembic",'⚗');
		ChatEmotes.register("ΩEmotes-00cute-star-half-left",'⯪');
		ChatEmotes.register("ΩEmotes-00cute-star-half-right",'⯫');
		ChatEmotes.register("ΩEmotes-03-cute-X",'✘');
		ChatEmotes.register("ΩEmotes-03cute-box-00",'☐');
		ChatEmotes.register("ΩEmotes-03cute-box-01",'☑');
		ChatEmotes.register("ΩEmotes-03cute-box-02",'☒');
}
		@Unique
		private static void configShapes() {
		ChatEmotes.register("ΩEmotes-symbols-arrow-full-right",'►');
		ChatEmotes.register("ΩEmotes-symbols-arrow-full-left",'◄');
		ChatEmotes.register("ΩEmotes-symbols-arrow-full-up",'▲');
		ChatEmotes.register("ΩEmotes-symbols-arrow-full-down",'▼');
		ChatEmotes.register("ΩEmotes-shapes-house", '⌂');
		ChatEmotes.register("ΩEmotes-shapes-circle", '•');
		ChatEmotes.register("ΩEmotes-shapes-square", '◘');
		ChatEmotes.register("ΩEmotes-shapes-big-circle", '○');
		ChatEmotes.register("ΩEmotes-shapes-inverted-circle", '◙');
		ChatEmotes.register("ΩEmotes-shapes-square-full", '■');
		ChatEmotes.register("ΩEmotes-shapes-black-circle", '●');
		ChatEmotes.register("ΩEmotes-shapes-00", '□');
		ChatEmotes.register("ΩEmotes-shapes-01", '△');
		ChatEmotes.register("ΩEmotes-shapes-02", '▷');
		ChatEmotes.register("ΩEmotes-shapes-03", '▽');
		ChatEmotes.register("ΩEmotes-shapes-04", '◁');
		ChatEmotes.register("ΩEmotes-shapes-05", '◆');
		ChatEmotes.register("ΩEmotes-shapes-06", '◇');
		ChatEmotes.register("ΩEmotes-shapes-07", '◎');
		ChatEmotes.register("ΩEmotes-shapes-08-left-bottom-corner",'∟');
}
		@Unique
		private static void configArrows() {
		ChatEmotes.register("ΩEmotes-arrow-up-down",'↕');
		ChatEmotes.register("ΩEmotes-arrow-up-down-underline",'↨');
		ChatEmotes.register("ΩEmotes-arrow-left-right",'↔');
		ChatEmotes.register("ΩEmotes-arrow-heavy-right",'⇒');
		ChatEmotes.register("ΩEmotes-arrow-heavy-right-cross",'⇏');
		ChatEmotes.register("ΩEmotes-arrow-heavy-left-right",'⇔');
		ChatEmotes.register("ΩEmotes-arrow-up-down",'⇵');
		ChatEmotes.register("ΩEmotes-arrow-left-right",'⇄');
		ChatEmotes.register("ΩEmotes-arrow-up-straight",'');

}
		@Unique
		private static void configSymbols() {
		ChatEmotes.register("ΩEmotes-shield-cross", '⛨');
		ChatEmotes.register("ΩEmotes-shield-full", '\uF6E1');
		ChatEmotes.register("ΩEmotes-mark-rights-reserved", '®');
		ChatEmotes.register("ΩEmotes-mark-copyright", '©');
		ChatEmotes.register("ΩEmotes-mark-trade-mark", '™');
		ChatEmotes.register("ΩEmotes-mark-parking", '℗');
		ChatEmotes.register("ΩEmotes-symbol-double-w",'ʬ');
}
		@Unique
		private static void configGreekLetters() {
		ChatEmotes.register("ΩEmotes-greek-alpha",'α');
		ChatEmotes.register("ΩEmotes-greek-beta",'β');
		ChatEmotes.register("ΩEmotes-greek-gamma-capital",'Γ');
		ChatEmotes.register("ΩEmotes-greek-pi",'π');
		ChatEmotes.register("ΩEmotes-greek-sigma-capital",'Σ');
		ChatEmotes.register("ΩEmotes-greek-sigma",'σ');
		ChatEmotes.register("ΩEmotes-greek-mu",'μ');
		ChatEmotes.register("ΩEmotes-greek-tau",'τ');
		ChatEmotes.register("ΩEmotes-greek-phi-capital",'Φ');
		ChatEmotes.register("ΩEmotes-greek-theta-capital",'Θ');
		ChatEmotes.register("ΩEmotes-greek-omega-capital",'Ω');
		ChatEmotes.register("ΩEmotes-greek-delta",'δ');
		ChatEmotes.register("ΩEmotes-greek-infinity",'∞');
		ChatEmotes.register("ΩEmotes-greek-empty-set",'∅');
		ChatEmotes.register("ΩEmotes-greek-element-of",'∈');
		ChatEmotes.register("ΩEmotes-greek-intersection",'∩');
}
		@Unique
		private static void configBoldLetters() {
		ChatEmotes.register("ΩEmotes-Ωbold-a",'ᴀ');
		ChatEmotes.register("ΩEmotes-Ωbold-b",'ʙ');
		ChatEmotes.register("ΩEmotes-Ωbold-c",'ᴄ');
		ChatEmotes.register("ΩEmotes-Ωbold-d",'ᴅ');
		ChatEmotes.register("ΩEmotes-Ωbold-e",'ᴇ');
		ChatEmotes.register("ΩEmotes-Ωbold-f",'ꜰ');
		ChatEmotes.register("ΩEmotes-Ωbold-g",'ɢ');
		ChatEmotes.register("ΩEmotes-Ωbold-h",'ʜ');
		ChatEmotes.register("ΩEmotes-Ωbold-i",'ɪ');
		ChatEmotes.register("ΩEmotes-Ωbold-j",'ᴊ');
		ChatEmotes.register("ΩEmotes-Ωbold-k",'ᴋ');
		ChatEmotes.register("ΩEmotes-Ωbold-l",'ʟ');
		ChatEmotes.register("ΩEmotes-Ωbold-m",'ᴍ');
		ChatEmotes.register("ΩEmotes-Ωbold-n",'ɴ');
		ChatEmotes.register("ΩEmotes-Ωbold-o",'ᴏ');
		ChatEmotes.register("ΩEmotes-Ωbold-p",'ᴘ');
		ChatEmotes.register("ΩEmotes-Ωbold-q",'ꞯ');
		ChatEmotes.register("ΩEmotes-Ωbold-r",'ʀ');
		ChatEmotes.register("ΩEmotes-Ωbold-s",'ꜱ');
		ChatEmotes.register("ΩEmotes-Ωbold-t",'ᴛ');
		ChatEmotes.register("ΩEmotes-Ωbold-u",'ᴜ');
		ChatEmotes.register("ΩEmotes-Ωbold-v",'ᴠ');
		ChatEmotes.register("ΩEmotes-Ωbold-w",'ᴡ');
		ChatEmotes.register("ΩEmotes-Ωbold-y",'ʏ');
		ChatEmotes.register("ΩEmotes-Ωbold-z",'ᴢ');
}
	@Unique
	private static void configBoldNumbers() {
		ChatEmotes.register("ΩEmotes-Ωbold-0",'₀');
		ChatEmotes.register("ΩEmotes-Ωbold-1",'₁');
		ChatEmotes.register("ΩEmotes-Ωbold-2",'₂');
		ChatEmotes.register("ΩEmotes-Ωbold-3",'₃');
		ChatEmotes.register("ΩEmotes-Ωbold-4",'₄');
		ChatEmotes.register("ΩEmotes-Ωbold-5",'₅');
		ChatEmotes.register("ΩEmotes-Ωbold-6",'₆');
		ChatEmotes.register("ΩEmotes-Ωbold-7",'₇');
		ChatEmotes.register("ΩEmotes-Ωbold-8",'₈');
		ChatEmotes.register("ΩEmotes-Ωbold-9",'₉');
}
	@Unique
	private static void configEncircledNumbers() {
		ChatEmotes.register("ΩEmotes-Ωencircled-00", '⓪');
		ChatEmotes.register("ΩEmotes-Ωencircled-01", '①');
		ChatEmotes.register("ΩEmotes-Ωencircled-02", '②');
		ChatEmotes.register("ΩEmotes-Ωencircled-03", '③');
		ChatEmotes.register("ΩEmotes-Ωencircled-04", '④');
		ChatEmotes.register("ΩEmotes-Ωencircled-05", '⑤');
		ChatEmotes.register("ΩEmotes-Ωencircled-06", '⑥');
		ChatEmotes.register("ΩEmotes-Ωencircled-07", '⑦');
		ChatEmotes.register("ΩEmotes-Ωencircled-08", '⑧');
		ChatEmotes.register("ΩEmotes-Ωencircled-09", '⑨');
		ChatEmotes.register("ΩEmotes-Ωencircled-10", '⑩');
		ChatEmotes.register("ΩEmotes-Ωencircled-11", '⑪');
		ChatEmotes.register("ΩEmotes-Ωencircled-12", '⑫');
		ChatEmotes.register("ΩEmotes-Ωencircled-13", '⑬');
		ChatEmotes.register("ΩEmotes-Ωencircled-14", '⑭');
		ChatEmotes.register("ΩEmotes-Ωencircled-15", '⑮');
		ChatEmotes.register("ΩEmotes-Ωencircled-16", '⑯');
		ChatEmotes.register("ΩEmotes-Ωencircled-17", '⑰');
		ChatEmotes.register("ΩEmotes-Ωencircled-18", '⑱');
		ChatEmotes.register("ΩEmotes-Ωencircled-19", '⑲');
		ChatEmotes.register("ΩEmotes-Ωencircled-20", '⑳');
	}
	@Unique
	private static void configEncircledLetters() {
		ChatEmotes.register("ΩEmotes-Ωencircled-capital-a",'Ⓐ');
		ChatEmotes.register("ΩEmotes-Ωencircled-capital-b",'Ⓑ');
		ChatEmotes.register("ΩEmotes-Ωencircled-capital-c",'Ⓒ');
		ChatEmotes.register("ΩEmotes-Ωencircled-capital-d",'Ⓓ');
		ChatEmotes.register("ΩEmotes-Ωencircled-capital-e",'Ⓔ');
		ChatEmotes.register("ΩEmotes-Ωencircled-capital-f",'Ⓕ');
		ChatEmotes.register("ΩEmotes-Ωencircled-capital-g",'Ⓖ');
		ChatEmotes.register("ΩEmotes-Ωencircled-capital-h",'Ⓗ');
		ChatEmotes.register("ΩEmotes-Ωencircled-capital-i",'Ⓘ');
		ChatEmotes.register("ΩEmotes-Ωencircled-capital-j",'Ⓙ');
		ChatEmotes.register("ΩEmotes-Ωencircled-capital-k",'Ⓚ');
		ChatEmotes.register("ΩEmotes-Ωencircled-capital-l",'Ⓛ');
		ChatEmotes.register("ΩEmotes-Ωencircled-capital-m",'Ⓜ');
		ChatEmotes.register("ΩEmotes-Ωencircled-capital-n",'Ⓝ');
		ChatEmotes.register("ΩEmotes-Ωencircled-capital-o",'Ⓞ');
		ChatEmotes.register("ΩEmotes-Ωencircled-capital-p",'Ⓟ');
		ChatEmotes.register("ΩEmotes-Ωencircled-capital-q",'Ⓠ');
		ChatEmotes.register("ΩEmotes-Ωencircled-capital-r",'Ⓡ');
		ChatEmotes.register("ΩEmotes-Ωencircled-capital-s",'Ⓢ');
		ChatEmotes.register("ΩEmotes-Ωencircled-capital-t",'Ⓣ');
		ChatEmotes.register("ΩEmotes-Ωencircled-capital-u",'Ⓤ');
		ChatEmotes.register("ΩEmotes-Ωencircled-capital-v",'Ⓥ');
		ChatEmotes.register("ΩEmotes-Ωencircled-capital-w",'Ⓦ');
		ChatEmotes.register("ΩEmotes-Ωencircled-capital-x",'Ⓧ');
		ChatEmotes.register("ΩEmotes-Ωencircled-capital-y",'Ⓨ');
		ChatEmotes.register("ΩEmotes-Ωencircled-capital-z",'Ⓩ');
		ChatEmotes.register("ΩEmotes-Ωencircled-lowercase-a",'ⓐ');
		ChatEmotes.register("ΩEmotes-Ωencircled-lowercase-b",'ⓑ');
		ChatEmotes.register("ΩEmotes-Ωencircled-lowercase-c",'ⓒ');
		ChatEmotes.register("ΩEmotes-Ωencircled-lowercase-d",'ⓓ');
		ChatEmotes.register("ΩEmotes-Ωencircled-lowercase-e",'ⓔ');
		ChatEmotes.register("ΩEmotes-Ωencircled-lowercase-f",'ⓕ');
		ChatEmotes.register("ΩEmotes-Ωencircled-lowercase-g",'ⓖ');
		ChatEmotes.register("ΩEmotes-Ωencircled-lowercase-h",'ⓗ');
		ChatEmotes.register("ΩEmotes-Ωencircled-lowercase-i",'ⓘ');
		ChatEmotes.register("ΩEmotes-Ωencircled-lowercase-j",'ⓙ');
		ChatEmotes.register("ΩEmotes-Ωencircled-lowercase-k",'ⓚ');
		ChatEmotes.register("ΩEmotes-Ωencircled-lowercase-l",'ⓛ');
		ChatEmotes.register("ΩEmotes-Ωencircled-lowercase-m",'ⓜ');
		ChatEmotes.register("ΩEmotes-Ωencircled-lowercase-n",'ⓝ');
		ChatEmotes.register("ΩEmotes-Ωencircled-lowercase-o",'ⓞ');
		ChatEmotes.register("ΩEmotes-Ωencircled-lowercase-p",'ⓟ');
		ChatEmotes.register("ΩEmotes-Ωencircled-lowercase-q",'ⓠ');
		ChatEmotes.register("ΩEmotes-Ωencircled-lowercase-r",'ⓡ');
		ChatEmotes.register("ΩEmotes-Ωencircled-lowercase-s",'ⓢ');
		ChatEmotes.register("ΩEmotes-Ωencircled-lowercase-t",'ⓣ');
		ChatEmotes.register("ΩEmotes-Ωencircled-lowercase-u",'ⓤ');
		ChatEmotes.register("ΩEmotes-Ωencircled-lowercase-v",'ⓥ');
		ChatEmotes.register("ΩEmotes-Ωencircled-lowercase-w",'ⓦ');
		ChatEmotes.register("ΩEmotes-Ωencircled-lowercase-x",'ⓧ');
		ChatEmotes.register("ΩEmotes-Ωencircled-lowercase-y",'ⓨ');
		ChatEmotes.register("ΩEmotes-Ωencircled-lowercase-z",'ⓩ');
}
		@Unique
		private static void configBoxDraw() {
		ChatEmotes.register("ΩEmotes-bar", '▬');
		ChatEmotes.register("ΩEmotes-ΩΩΩbox-draw-00",'░');
		ChatEmotes.register("ΩEmotes-ΩΩΩbox-draw-01",'▒');
		ChatEmotes.register("ΩEmotes-ΩΩΩbox-draw-02",'▓');
		ChatEmotes.register("ΩEmotes-ΩΩΩbox-draw-03",'█');
		ChatEmotes.register("ΩEmotes-ΩΩΩbox-draw-01",'│');
		ChatEmotes.register("ΩEmotes-ΩΩΩbox-draw-02",'┤');
		ChatEmotes.register("ΩEmotes-ΩΩΩbox-draw-03",'┐');
		ChatEmotes.register("ΩEmotes-ΩΩΩbox-draw-04",'└');
		ChatEmotes.register("ΩEmotes-ΩΩΩbox-draw-05",'┴');
		ChatEmotes.register("ΩEmotes-ΩΩΩbox-draw-06",'┬');
		ChatEmotes.register("ΩEmotes-ΩΩΩbox-draw-07",'├');
		ChatEmotes.register("ΩEmotes-ΩΩΩbox-draw-08",'─');
		ChatEmotes.register("ΩEmotes-ΩΩΩbox-draw-09",'┼');
		ChatEmotes.register("ΩEmotes-ΩΩΩbox-draw-10",'┘');
		ChatEmotes.register("ΩEmotes-ΩΩΩbox-draw-11",'┌');
		ChatEmotes.register("ΩEmotes-ΩΩΩbox-draw-12",'║');
		ChatEmotes.register("ΩEmotes-ΩΩΩbox-draw-13",'╢');
		ChatEmotes.register("ΩEmotes-ΩΩΩbox-draw-14",'╗');
		ChatEmotes.register("ΩEmotes-ΩΩΩbox-draw-15",'╚');
		ChatEmotes.register("ΩEmotes-ΩΩΩbox-draw-16",'╩');
		ChatEmotes.register("ΩEmotes-ΩΩΩbox-draw-17",'╦');
		ChatEmotes.register("ΩEmotes-ΩΩΩbox-draw-18",'╠');
		ChatEmotes.register("ΩEmotes-ΩΩΩbox-draw-19",'═');
		ChatEmotes.register("ΩEmotes-ΩΩΩbox-draw-20",'╬');
		ChatEmotes.register("ΩEmotes-ΩΩΩbox-draw-21",'╝');
		ChatEmotes.register("ΩEmotes-ΩΩΩbox-draw-22",'╔');
		ChatEmotes.register("ΩEmotes-ΩΩΩbox-draw-23",'╡');
		ChatEmotes.register("ΩEmotes-ΩΩΩbox-draw-24",'╕');
		ChatEmotes.register("ΩEmotes-ΩΩΩbox-draw-25",'╘');
		ChatEmotes.register("ΩEmotes-ΩΩΩbox-draw-26",'╧');
		ChatEmotes.register("ΩEmotes-ΩΩΩbox-draw-27",'╤');
		ChatEmotes.register("ΩEmotes-ΩΩΩbox-draw-28",'╞');
		ChatEmotes.register("ΩEmotes-ΩΩΩbox-draw-29",'╧');
		ChatEmotes.register("ΩEmotes-ΩΩΩbox-draw-30",'╪');
		ChatEmotes.register("ΩEmotes-ΩΩΩbox-draw-30",'╜');
		ChatEmotes.register("ΩEmotes-ΩΩΩbox-draw-30",'╓');
		ChatEmotes.register("ΩEmotes-ΩΩΩbox-draw-30",'█');
		ChatEmotes.register("ΩEmotes-ΩΩΩbox-draw-30",'▄');
		ChatEmotes.register("ΩEmotes-ΩΩΩbox-draw-30",'▌');
		ChatEmotes.register("ΩEmotes-ΩΩΩbox-draw-30",'▐');
		ChatEmotes.register("ΩEmotes-ΩΩΩbox-draw-30",'▀');
}
		@Unique
		private static void configMath() {ChatEmotes.register("ΩEmotes-ΩΩmath-degree", '°');
		ChatEmotes.register("ΩEmotes-ΩΩmath-50",'⅛');
		ChatEmotes.register("ΩEmotes-ΩΩmath-51",'⅜');
		ChatEmotes.register("ΩEmotes-ΩΩmath-52",'⅝');
		ChatEmotes.register("ΩEmotes-ΩΩmath-53",'⅞');
		ChatEmotes.register("ΩEmotes-ΩΩmath-54",'⅝');
		ChatEmotes.register("ΩEmotes-ΩΩmath-55",'⅔');
		ChatEmotes.register("ΩEmotes-ΩΩmath-56",'½');
		ChatEmotes.register("ΩEmotes-ΩΩmath-57",'¼');
		ChatEmotes.register("ΩEmotes-ΩΩmath-58",'⅐');
		ChatEmotes.register("ΩEmotes-ΩΩmath-59",'⅑');
		ChatEmotes.register("ΩEmotes-ΩΩmath-60",'⅕');
		ChatEmotes.register("ΩEmotes-ΩΩmath-61",'⅖');
		ChatEmotes.register("ΩEmotes-ΩΩmath-62",'⅗');
		ChatEmotes.register("ΩEmotes-ΩΩmath-63",'⅙');
		ChatEmotes.register("ΩEmotes-ΩΩmath-64",'⅚');
		ChatEmotes.register("ΩEmotes-ΩΩmath-65",'⅟');
		ChatEmotes.register("ΩEmotes-ΩΩmath-66",'↉');
		ChatEmotes.register("ΩEmotes-ΩΩmath-02-plus-or-minus",'∓');
		ChatEmotes.register("ΩEmotes-ΩΩmath-02-minus",'−');
		ChatEmotes.register("ΩEmotes-ΩΩmath-02-indentical",'≡');
		ChatEmotes.register("ΩEmotes-ΩΩmath-02-plus-minus",'±');
		ChatEmotes.register("ΩEmotes-ΩΩmath-02-greater-than",'≥');
		ChatEmotes.register("ΩEmotes-ΩΩmath-02-less-than",'≤');
		ChatEmotes.register("ΩEmotes-ΩΩmath-02-intergral-top",'⌠');
		ChatEmotes.register("ΩEmotes-ΩΩmath-02-intergral-bottom",'⌡');
		ChatEmotes.register("ΩEmotes-ΩΩmath-02-division",'÷');
		ChatEmotes.register("ΩEmotes-ΩΩmath-02-approx-equal",'≈');
		ChatEmotes.register("ΩEmotes-ΩΩmath-02-square-root",'√');
		ChatEmotes.register("ΩEmotes-ΩΩmath-02-superscript",'ⁿ');
		ChatEmotes.register("ΩEmotes-ΩΩmath-03-numbers-small-0",'⁰');
		ChatEmotes.register("ΩEmotes-ΩΩmath-03-numbers-small-1",'¹');
		ChatEmotes.register("ΩEmotes-ΩΩmath-03-numbers-small-2",'²');
		ChatEmotes.register("ΩEmotes-ΩΩmath-03-numbers-small-3",'³');
		ChatEmotes.register("ΩEmotes-ΩΩmath-03-numbers-small-4",'⁴');
		ChatEmotes.register("ΩEmotes-ΩΩmath-03-numbers-small-5",'⁵');
		ChatEmotes.register("ΩEmotes-ΩΩmath-03-numbers-small-6",'⁶');
		ChatEmotes.register("ΩEmotes-ΩΩmath-03-numbers-small-7",'⁷');
		ChatEmotes.register("ΩEmotes-ΩΩmath-03-numbers-small-8",'⁸');
		ChatEmotes.register("ΩEmotes-ΩΩmath-03-numbers-small-9",'⁹');
}
		@Unique
		private static void configSGA() {
		ChatEmotes.register("ΩEmotes-ΩΩΩgalatic-01", '');
		ChatEmotes.register("ΩEmotes-ΩΩΩgalatic-02", '');
		ChatEmotes.register("ΩEmotes-ΩΩΩgalatic-03", '');
		ChatEmotes.register("ΩEmotes-ΩΩΩgalatic-04", '');
		ChatEmotes.register("ΩEmotes-ΩΩΩgalatic-05", '');
		ChatEmotes.register("ΩEmotes-ΩΩΩgalatic-06", '');
		ChatEmotes.register("ΩEmotes-ΩΩΩgalatic-07", '');
		ChatEmotes.register("ΩEmotes-ΩΩΩgalatic-08", '');
		ChatEmotes.register("ΩEmotes-ΩΩΩgalatic-09", '');
		ChatEmotes.register("ΩEmotes-ΩΩΩgalatic-10", '');
		ChatEmotes.register("ΩEmotes-ΩΩΩgalatic-11", '');
		ChatEmotes.register("ΩEmotes-ΩΩΩgalatic-12", '');
		ChatEmotes.register("ΩEmotes-ΩΩΩgalatic-13", '');
		ChatEmotes.register("ΩEmotes-ΩΩΩgalatic-14", '');
		ChatEmotes.register("ΩEmotes-ΩΩΩgalatic-15", '');
		ChatEmotes.register("ΩEmotes-ΩΩΩgalatic-16", '');
		ChatEmotes.register("ΩEmotes-ΩΩΩgalatic-17", '');
		ChatEmotes.register("ΩEmotes-ΩΩΩgalatic-18", '');
		ChatEmotes.register("ΩEmotes-ΩΩΩgalatic-19", '');
		ChatEmotes.register("ΩEmotes-ΩΩΩgalatic-20", '');
		ChatEmotes.register("ΩEmotes-ΩΩΩgalatic-21", '');
		ChatEmotes.register("ΩEmotes-ΩΩΩgalatic-22", '');
		ChatEmotes.register("ΩEmotes-ΩΩΩgalatic-23", '');
		ChatEmotes.register("ΩEmotes-ΩΩΩgalatic-24", '');
		ChatEmotes.register("ΩEmotes-ΩΩΩgalatic-25", '');
		ChatEmotes.register("ΩEmotes-ΩΩΩgalatic-26", '');
		ChatEmotes.register("ΩEmotes-ΩΩΩgalatic-27", '');
		ChatEmotes.register("ΩEmotes-ΩΩΩgalatic-28", '');
		ChatEmotes.register("ΩEmotes-ΩΩΩgalatic-29", '');
		}
	}
