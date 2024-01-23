package com.sun.opengl.impl.x11;

import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gl!com/sun/opengl/impl/x11/XVisualInfo32")
public final class XVisualInfo32 extends XVisualInfo {

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/XVisualInfo32", name = "size", descriptor = "()I")
	public static int size() {
		return 40;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/XVisualInfo32", name = "<init>", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public XVisualInfo32(@OriginalArg(0) ByteBuffer arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/XVisualInfo32", name = "visualid", descriptor = "(J)Lgl!com/sun/opengl/impl/x11/XVisualInfo;")
	@Override
	public XVisualInfo visualid(@OriginalArg(0) long arg0) {
		this.accessor.method4982(1, (int) arg0);
		return this;
	}
}
