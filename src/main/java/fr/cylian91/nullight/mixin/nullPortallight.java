package fr.cylian91.nullight.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Blocks.class)
public class nullPortallight {
	@Inject(at = @At("HEAD"), method = "method_26146", cancellable = true)
	private static void init(BlockState state, CallbackInfoReturnable<Integer> cir) {
		cir.setReturnValue(0);
	}
}