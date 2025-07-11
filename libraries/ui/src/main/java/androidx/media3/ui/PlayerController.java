package androidx.media3.ui;

import androidx.annotation.Nullable;
import androidx.media3.common.Player;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
public interface PlayerController {
  @Nullable
  Player getPlayer();
  void setPlayer(@Nullable Player player);
  void hide();
  void hideImmediately();
  void show();
  void showProgress();
  void showProgressOnly();
  void showImmediately();
  void setShowTimeoutMs(int showTimeoutMs);
  int getShowTimeoutMs();
  void setShowTimeoutMsProgress(int showTimeoutMsProgress);
  int getShowTimeoutMsProgress();
  boolean isFullyVisible();
  boolean isOnlyProgressVisible();
}
