package com.sun.opengl.impl;

import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gl!com/sun/opengl/impl/JAWT_DrawingSurface32")
public final class JAWT_DrawingSurface_Sub1 extends JAWT_DrawingSurface {

	@OriginalMember(owner = "gl!com/sun/opengl/impl/JAWT_DrawingSurface32", name = "<init>", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public JAWT_DrawingSurface_Sub1(@OriginalArg(0) ByteBuffer arg0) {
		super(arg0);
	}
}
