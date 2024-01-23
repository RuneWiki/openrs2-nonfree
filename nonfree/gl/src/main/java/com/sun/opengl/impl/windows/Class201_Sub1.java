package com.sun.opengl.impl.windows;

import com.sun.opengl.impl.Interface8;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gl!com/sun/opengl/impl/windows/JAWT_Win32DrawingSurfaceInfo32")
public final class Class201_Sub1 extends Class201 implements Interface8 {

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/JAWT_Win32DrawingSurfaceInfo32", name = "hdc", descriptor = "()J")
	@Override
	public long method4486() {
		return (long) this.aClass192_15.method4360(1);
	}
}
