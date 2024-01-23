package com.sun.opengl.impl.x11;

import com.sun.opengl.impl.Interface8;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gl!com/sun/opengl/impl/x11/JAWT_X11DrawingSurfaceInfo32")
public final class JAWT_X11DrawingSurfaceInfo32 extends JAWT_X11DrawingSurfaceInfo implements Interface8 {

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/JAWT_X11DrawingSurfaceInfo32", name = "drawable", descriptor = "()J")
	@Override
	public long drawable() {
		return (long) this.accessor.method4434(0);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/JAWT_X11DrawingSurfaceInfo32", name = "display", descriptor = "()J")
	@Override
	public long display() {
		return (long) this.accessor.method4434(1);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/JAWT_X11DrawingSurfaceInfo32", name = "visualID", descriptor = "()J")
	@Override
	public long visualID() {
		return (long) this.accessor.method4434(2);
	}
}
