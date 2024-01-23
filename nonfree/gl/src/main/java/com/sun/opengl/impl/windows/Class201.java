package com.sun.opengl.impl.windows;

import com.sun.gluegen.runtime.Class192;
import com.sun.opengl.impl.Interface8;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gl!com/sun/opengl/impl/windows/JAWT_Win32DrawingSurfaceInfo")
public abstract class Class201 implements Interface8 {

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/JAWT_Win32DrawingSurfaceInfo", name = "accessor", descriptor = "Lgl!com/sun/gluegen/runtime/StructAccessor;")
	protected Class192 aClass192_15;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/JAWT_Win32DrawingSurfaceInfo", name = "<init>", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public Class201(@OriginalArg(0) ByteBuffer arg0) {
		this.aClass192_15 = new Class192(arg0);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/JAWT_Win32DrawingSurfaceInfo", name = "hdc", descriptor = "()J")
	public abstract long method4486();
}
