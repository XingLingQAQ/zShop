package fr.maxlego08.shop.api.button;

import org.bukkit.inventory.ItemStack;

import fr.maxlego08.shop.api.enums.ButtonType;

public interface Button {

	/**
	 * 
	 * @return item
	 */
	public ItemStack getItemStack();
	
	/**
	 * 
	 * @return buttonType
	 */
	public ButtonType getType();
	
	/**
	 * 
	 * @return slot
	 */
	public int getSlot();
	
}