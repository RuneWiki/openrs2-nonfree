package com.sun.opengl.impl.macosx;

import com.sun.opengl.impl.Interface8;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gl!com/sun/opengl/impl/macosx/JAWT_MacOSXDrawingSurfaceInfo32")
public final class Class199_Sub1 extends Class199 implements Interface8 {

	@OriginalMember(owner = "gl!com/sun/opengl/impl/macosx/JAWT_MacOSXDrawingSurfaceInfo32", name = "cocoaViewRef", descriptor = "()J")
	@Override
	public long method5084() {
		return (long) this.aClass192_12.method4981(0);
	}
}
