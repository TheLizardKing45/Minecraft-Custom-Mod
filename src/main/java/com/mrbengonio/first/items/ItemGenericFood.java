package com.mrbengonio.first.items;

import com.mrbengonio.first.handlers.ItemGroupHandler;

public class ItemGenericFood extends FoodBase {

	public ItemGenericFood(String name, int hunger, float saturation) {
		super(name, ItemGroupHandler.tabKreuthil, hunger, saturation);
	}

}
