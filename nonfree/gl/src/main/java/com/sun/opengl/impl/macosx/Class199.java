package com.sun.opengl.impl.macosx;

import com.sun.gluegen.runtime.Class192;
import com.sun.opengl.impl.Interface8;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gl!com/sun/opengl/impl/macosx/JAWT_MacOSXDrawingSurfaceInfo")
public abstract class Class199 implements Interface8 {

	@OriginalMember(owner = "gl!com/sun/opengl/impl/macosx/JAWT_MacOSXDrawingSurfaceInfo", name = "accessor", descriptor = "Lgl!com/sun/gluegen/runtime/StructAccessor;")
	protected Class192 aClass192_12;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/macosx/JAWT_MacOSXDrawingSurfaceInfo", name = "<init>", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public Class199(@OriginalArg(0) ByteBuffer arg0) {
		this.aClass192_12 = new Class192(arg0);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/macosx/JAWT_MacOSXDrawingSurfaceInfo", name = "cocoaViewRef", descriptor = "()J")
	public abstract long method4691();
}
