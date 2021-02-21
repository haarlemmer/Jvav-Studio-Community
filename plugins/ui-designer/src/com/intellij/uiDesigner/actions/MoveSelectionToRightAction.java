// Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.intellij.uiDesigner.actions;

import com.intellij.uiDesigner.designSurface.GuiEditor;

import java.awt.*;

/**
 * @author Anton Katilin
 * @author Vladimir Kondratyev
 */
public final class MoveSelectionToRightAction extends AbstractMoveSelectionAction{
  public MoveSelectionToRightAction(final GuiEditor editor, final boolean extend, final boolean moveToLast) {
    super(editor, extend, moveToLast);
  }

  @Override
  protected int calcDistance(final Point source, final Point point) {
    if(source.x >= point.x){
      return Integer.MAX_VALUE;
    }
    else{
      final int scale = (point.y - source.y) <= 0 ? 3 : 4;
      return (point.x - source.x) + Math.abs(point.y - source.y) * scale;
    }
  }

  @Override
  protected int getColumnMoveDelta() {
    return 1;
  }
}