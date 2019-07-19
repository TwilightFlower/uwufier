package com.nuclearfarts.uwufier.mixin;

import java.util.Map;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import com.nuclearfarts.uwufier.Uwufier;

import net.minecraft.client.resource.language.TranslationStorage;

@Mixin(TranslationStorage.class)
public class ClientUwuMixin {
	
	@Redirect(method = "load(Ljava/io/InputStream;)V", at = @At(value = "INVOKE", target = "java/util/Map.put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"))
	public Object uwuLoad(Map<Object, String> into, Object s1, Object s2) {
		return into.put(s1, Uwufier.uwu((String)s2));
	}
}
