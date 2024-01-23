package com.sun.opengl.impl;

import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gl!com/sun/opengl/impl/JAWTFactory")
public final class JAWTFactory {

	@OriginalMember(owner = "gl!com/sun/opengl/impl/JAWTFactory", name = "JAWT_GetAWT", descriptor = "(Lgl!com/sun/opengl/impl/JAWT;)Z")
	public static boolean method4493(@OriginalArg(0) JAWT arg0) {
		return JAWT_GetAWT0(arg0 == null ? null : arg0.method4484());
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/JAWTFactory", name = "JAWT_GetAWT0", descriptor = "(Ljava/nio/ByteBuffer;)Z")
	private static native boolean JAWT_GetAWT0(@OriginalArg(0) ByteBuffer arg0);
}
