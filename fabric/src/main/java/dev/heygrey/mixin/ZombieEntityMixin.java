package dev.heygrey.mixin;

@Mixin(ZombieEntity.class)
public abstract class ZombieEntityMixin {
  // method = "initGoals"
  // alternatively, method = "initCustomGoals", if not doing full re-write which you probably will
}
