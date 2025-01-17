package de.onebacon.drops_into_shulker.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

import de.onebacon.drops_into_shulker.ShulkerSizeExt;
import net.minecraft.block.entity.ShulkerBoxBlockEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.collection.DefaultedList;

@Mixin(ShulkerBoxBlockEntity.class)
public class ShulkerBoxBlockEntityMixin implements ShulkerSizeExt {
  @Shadow
  private DefaultedList<ItemStack> inventory;

  public int getInvSize() {
    return inventory.size();
  }
}
