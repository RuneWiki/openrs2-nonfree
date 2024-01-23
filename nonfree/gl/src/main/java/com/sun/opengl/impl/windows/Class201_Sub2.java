package com.sun.opengl.impl.windows;

import com.sun.opengl.impl.Interface8;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gl!com/sun/opengl/impl/windows/JAWT_Win32DrawingSurfaceInfo64")
public final class Class201_Sub2 extends Class201 implements Interface8 {

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/JAWT_Win32DrawingSurfaceInfo64", name = "hdc", descriptor = "()J")
	@Override
	public long method5016() {
		return this.aClass192_15.method4892(1);
	}
}
