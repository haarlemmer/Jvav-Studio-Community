/*
 * Copyright 2000-2017 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jetbrains.uast.java

import com.intellij.psi.PsiElement
import org.jetbrains.uast.UElement
import org.jetbrains.uast.internal.log

class JavaDumbUElement(
  override val sourcePsi: PsiElement,
  givenParent: UElement?,
  private val customRenderString: String? = null
) : JavaAbstractUElement(givenParent) {
  override fun asLogString(): String = log()
  override fun asRenderString(): String = customRenderString ?: "<stub@$sourcePsi>"
}