package com.sun.opengl.impl;

import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gl!com/sun/opengl/impl/JAWT64")
public final class JAWT_Sub2 extends JAWT {

	@OriginalMember(owner = "gl!com/sun/opengl/impl/JAWT64", name = "size", descriptor = "()I")
	public static int method4492() {
		return 48;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/JAWT64", name = "<init>", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public JAWT_Sub2(@OriginalArg(0) ByteBuffer arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/JAWT64", name = "version", descriptor = "(I)Lgl!com/sun/opengl/impl/JAWT;")
	@Override
	public JAWT method4485() {
		this.aClass192_3.method4435(0, 65540);
		return this;
	}
}
