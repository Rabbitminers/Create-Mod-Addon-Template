package com.rabbitminers.addontemplate.mixin;

import com.rabbitminers.addontemplate.AddonTemplate;
import net.minecraft.client.gui.screens.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class MixinDemo {
    @Inject(method = "init", at = @At("TAIL"))
    private void exampleMixin(CallbackInfo ci) {
        AddonTemplate.LOGGER.info("Hello World From {}", AddonTemplate.MODID);
    }
}
