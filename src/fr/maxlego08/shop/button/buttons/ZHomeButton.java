package fr.maxlego08.shop.button.buttons;

import org.bukkit.inventory.ItemStack;

import fr.maxlego08.shop.ZShop;
import fr.maxlego08.shop.api.button.Button;
import fr.maxlego08.shop.api.button.buttons.HomeButton;
import fr.maxlego08.shop.api.enums.ButtonType;
import fr.maxlego08.shop.api.enums.PlaceholderAction;
import fr.maxlego08.shop.api.inventory.Inventory;
import fr.maxlego08.shop.api.sound.SoundOption;

public class ZHomeButton extends ZBackButton implements HomeButton {

	/**
	 * @param type
	 * @param itemStack
	 * @param slot
	 * @param permission
	 * @param message
	 * @param elseButton
	 * @param isPermanent
	 * @param action
	 * @param placeholder
	 * @param value
	 * @param inventory
	 * @param inventoryInterface
	 * @param plugin
	 */
	public ZHomeButton(ButtonType type, ItemStack itemStack, int slot, String permission, String message,
			Button elseButton, boolean isPermanent, PlaceholderAction action, String placeholder, String value,
			String inventory, Inventory inventoryInterface, ZShop plugin, boolean glow, SoundOption sound, boolean isClose) {
		super(type, itemStack, slot, permission, message, elseButton, isPermanent, action, placeholder, value,
				inventory, inventoryInterface, plugin, glow, sound, isClose);
		// TODO Auto-generated constructor stub
	}

}
