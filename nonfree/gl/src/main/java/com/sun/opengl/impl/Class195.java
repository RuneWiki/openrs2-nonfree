package com.sun.opengl.impl;

import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLDrawable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gl!com/sun/opengl/impl/GLDrawableImpl")
public abstract class Class195 implements GLDrawable {

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLDrawableImpl", name = "chosenCapabilities", descriptor = "Lgl!javax/media/opengl/GLCapabilities;")
	private GLCapabilities chosenCapabilities;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLDrawableImpl", name = "toHexString", descriptor = "(J)Ljava/lang/String;")
	protected static String toHexString(@OriginalArg(0) long arg0) {
		return GLContext_Sub1.toHexString(arg0);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLDrawableImpl", name = "<init>", descriptor = "()V")
	protected Class195() {
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLDrawableImpl", name = "getChosenGLCapabilities", descriptor = "()Lgl!javax/media/opengl/GLCapabilities;")
	public final GLCapabilities getChosenGLCapabilities() {
		return this.chosenCapabilities == null ? null : (GLCapabilities) this.chosenCapabilities.clone();
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLDrawableImpl", name = "setChosenGLCapabilities", descriptor = "(Lgl!javax/media/opengl/GLCapabilities;)V")
	public final void setChosenGLCapabilities(@OriginalArg(0) GLCapabilities arg0) {
		this.chosenCapabilities = arg0;
	}
}
