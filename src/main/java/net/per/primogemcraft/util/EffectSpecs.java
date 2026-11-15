package net.per.primogemcraft.util;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;

/**
 * 鏁堟灉瀹炰緥鏋勯€犺緟鍔┿€? *
 * <p>1.21 鐨?{@code StatusEffects.*} 鏄?{@code MobEffect}锛?.20.1 鏄８
 * {@code MobEffect}锛屾晠杩欓噷鐩存帴鎺ユ敹 MobEffect銆? */
public final class EffectSpecs {
    private EffectSpecs() {
    }

    public static StatusEffectInstance of(StatusEffect effect, int ticks, int amplifier) {
        return new StatusEffectInstance(effect, ticks, amplifier);
    }

    public static StatusEffectInstance hidden(StatusEffect effect, int ticks, int amplifier) {
        return new StatusEffectInstance(effect, ticks, amplifier, false, false);
    }
}