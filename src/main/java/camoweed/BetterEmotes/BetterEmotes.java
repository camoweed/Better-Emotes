package camoweed.BetterEmotes;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.HalpLibe;
import turniplabs.halplibe.util.GameStartEntrypoint;
import turniplabs.halplibe.util.RecipeEntrypoint;
import turniplabs.halplibe.util.TomlConfigHandler;
import turniplabs.halplibe.util.toml.Toml;

public class BetterEmotes implements ModInitializer, RecipeEntrypoint, GameStartEntrypoint {
	public static final String MOD_ID = HalpLibe.registerMod("betteremotes");
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static final TomlConfigHandler CFG;
	public static final boolean Cute;
	public static final boolean Casino;
	public static final boolean Punctuation;
	public static final boolean StandardGalaticAlphabet;
	public static final boolean BoxDrawing;
	public static final boolean Mathematics;
	public static final boolean EncircledLetters;
	public static final boolean EncircledNumbers;
	public static final boolean BoldLetters;
	public static final boolean BoldNumbers;
	public static final boolean GreekLetters;
	public static final boolean Symbols;
	public static final boolean Shapes;
	public static final boolean MediaControls;
	public static final boolean MusicalNotation;
	public static final boolean Religious;
	public static final boolean Arrows;
	static {
		Toml cfg = new Toml();
		cfg.addCategory("Recommended");
		cfg.addEntry(
			"Recommended.Cute",
			" \nClean emotes that fit in nicely along vanilla ones.\n" +
			"§ ☼ ☹ ⚠ ☮ ☯ ⚔ ⚓ ☔ ☄ ☃ ❣ ✎ ⛈ ☆ ★ ⯪ ⯫ ☜ ☞ \uF5E1(sword) \uF3F9(bow) \uEA93(axe) \uF531(trident) \uF3A3(fishing rod) \uE9EA(potion) ⚗ ⚥ ✘ ☐ ☑ ☒\n ",
			true);
		cfg.addEntry(
			"Recommended.Casino",
			" \nSix dice faces and alternative suits.\n" +
			" ⚀ ⚁ ⚂ ⚃ ⚄ ⚅ ♤ ♧ ♡ ♢\n ",
			true);
		cfg.addEntry(
			"Recommended.Punctuation",
			" \nExtra punctuation marks for serious writers!\n" +
			"‼ ¡ ⸵ ⸮ ¶ « » ◦ ⋆\n ",
			true);
		cfg.addEntry(
			"Recommended.BoldLetters",
			" \nImpressively stout and readable font, good for nicknames!\n" +
			"ᴀ ʙ ᴄ ᴅ ᴇ ꜰ ɢ ʜ ɪ ᴊ ᴋ ʟ ᴍ ɴ ᴏ ᴘ ꞯ ʀ ꜱ ᴛ ᴜ ᴠ ᴡ ʏ ᴢ\n ",
			true);
		cfg.addEntry(
			"Recommended.BoldNumbers",
			" \nDitto on the numbers.\n " +
			"₀ ₁ ₂ ₃ ₄ ₅ ₆ ₇ ₈ ₉\n ",
			true);
		cfg.addEntry(
			"Recommended.Symbols",
			" \nCopyright and trademark symbols for legal documents.\n " +
			"® © ™ ℗ ʬ ⛨ \uF6E1(shield)\n ",
			true);
		cfg.addEntry(
			"Recommended.Arrows",
			" \nNifty arrows for pointing things out.\n " +
			"↕ ↨  ↔ ⇒ ⇏ ⇔ ⇵ ⇄ \n",
			true);
		cfg.addEntry(
			"Recommended.MusicalNotation",
			" \nFinally, music written entirely in BTA!\n " +
				"♩ ♬ ♭ ♯ ♮\n",
			true);
		cfg.addEntry(
			"Recommended.Shapes",
			" \nVarious shapes good for crafting elaborately decorated messages.\n" +
				"⌂ • ◘ ○ ◙ ■ ● □ △ ▷ ▽ ◁ ► ◄ ▲ ▼ ◆ ◇ ◎ ∟\n ",
			false);

		cfg.addCategory("False by default due to largely cluttering the menu.\nStill lots of fun emotes!", "Extras");
		cfg.addEntry("Extras.Religious", " † ⸸ ‡ ⹋", false);
		cfg.addEntry("Extras.GreekLetters", " α β Γ π Σ σ μ τ Φ Θ Ω δ ∞ ∅ ∈ ∩", false);
		cfg.addEntry("Extras.MediaControls", " ⏏ ⏩ ⏪ ⏭ ⏮ ⏯ ⏴ ⏵ ⏶ ⏷ ⏸ ⏹ ⏺ ⏻ ⏼ ⏽ ⭘ ▶ ◀", false);
		cfg.addEntry("Extras.EncircledLetters", " Ⓐ Ⓑ Ⓒ Ⓓ Ⓔ Ⓕ Ⓖ Ⓗ Ⓘ Ⓙ Ⓚ Ⓛ Ⓜ Ⓝ Ⓞ Ⓟ Ⓠ Ⓡ Ⓢ Ⓣ Ⓤ Ⓥ Ⓦ Ⓧ Ⓨ Ⓩ ⓐ ⓑ ⓒ ⓓ ⓔ ⓕ ⓖ ⓗ ⓘ ⓙ ⓚ ⓛ ⓜ ⓝ ⓞ ⓟ ⓠ ⓡ ⓢ ⓣ ⓤ ⓥ ⓦ ⓧ ⓨ ⓩ", false);
		cfg.addEntry("Extras.EncircledNumbers", " ⓪ ① ② ③ ④ ⑤ ⑥ ⑦ ⑧ ⑨ ⑩ ⑪ ⑫ ⑬ ⑭ ⑮ ⑯ ⑰ ⑱ ⑲ ⑳", false);
		cfg.addEntry("Extras.BoxDrawing", " ░ ▒ ▓ █ │ ┤ ┐ └ ┴ ┬ ├ ─ ┼ ┘ ┌ ║ ╢ ╗ ╚ ╩ ╦ ╠ ═ ╬ ╝ ╔ ╡ ╕ ╘ ╧ ╤ ╞ ╧ ╪ ╜ ╓ █ ▄ ▌ ▐ ▀", false);
		cfg.addEntry("Extras.Mathematics", " ° ⅛ ⅜ ⅝ ⅞ ⅝ ⅔ ½ ¼ ⅐ ⅑ ⅕ ⅖ ⅗ ⅙ ⅚ ⅟ ↉ ∓ − ≡ ± ≥ ≤ ⌠ ⌡ ÷ ≈ √ ⁿ ⁰ ¹ ² ³ ⁴ ⁵ ⁶ ⁷ ⁸ ⁹", false);
		cfg.addEntry("Extras.StandardGalaticAlphabet", " \uEB40 \uEB41 \uEB42 \uEB43 \uEB44 \uEB45 \uEB46 \uEB47 \uEB48 \uEB49 \uEB4A \uEB4B \uEB4C \uEB4D \uEB4E \uEB4F \uEB50 \uEB51 \uEB52 \uEB53 \uEB54 \uEB55 \uEB56 \uEB57 \uEB58 \uEB59 \uEB5D \uEB5E \uEB5F", false);


	CFG = new TomlConfigHandler(MOD_ID, cfg);

	StandardGalaticAlphabet = CFG.getBoolean("Extras.StandardGalaticAlphabet");
	BoxDrawing = CFG.getBoolean("Extras.BoxDrawing");
	Mathematics = CFG.getBoolean("Extras.Mathematics");
	BoldLetters = CFG.getBoolean("Recommended.BoldLetters");
	BoldNumbers = CFG.getBoolean("Recommended.BoldNumbers");
	EncircledLetters = CFG.getBoolean("Extras.EncircledLetters");
	EncircledNumbers = CFG.getBoolean("Extras.EncircledNumbers");
	GreekLetters = CFG.getBoolean("Extras.GreekLetters");
	Symbols = CFG.getBoolean("Recommended.Symbols");
	Shapes = CFG.getBoolean("Recommended.Shapes");
	Cute = CFG.getBoolean("Recommended.Cute");
	Casino = CFG.getBoolean("Recommended.Casino");
	Punctuation = CFG.getBoolean("Recommended.Punctuation");
	MediaControls = CFG.getBoolean("Extras.MediaControls");
	MusicalNotation = CFG.getBoolean("Recommended.MusicalNotation");
	Religious = CFG.getBoolean("Extras.Religious");
	Arrows = CFG.getBoolean("Recommended.Arrows");
	}

	@Override
	public void onInitialize() {
		LOGGER.info("•○◎☐ ▷ ʙᴇᴛᴛᴇʀ ᴇᴍᴏᴛᴇꜱ ◁ ☐◎○•");

	}

	@Override
	public void onRecipesReady() {}

	@Override
	public void initNamespaces() {}

	@Override
	public void beforeGameStart() {}

	@Override
	public void afterGameStart() {}
}
