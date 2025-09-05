package com.bcp.training;

import io.smallrye.config.ConfigMapping;
import io.smallrye.config.WithDefault;
import java.util.Optional;

@ConfigMapping(prefix = "expense")
public interface ExpenseConfiguration {
  @WithDefault("true")
  boolean debugEnabled();
  int rangeHigh();
  int rangeLow();

  Optional<String> debugMessage();
}