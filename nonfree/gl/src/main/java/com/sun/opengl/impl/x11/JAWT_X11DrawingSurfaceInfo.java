package com.sun.opengl.impl.x11;

import com.sun.gluegen.runtime.Class192;
import com.sun.opengl.impl.Interface8;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gl!com/sun/opengl/impl/x11/JAWT_X11DrawingSurfaceInfo")
public abstract class JAWT_X11DrawingSurfaceInfo implements Interface8 {

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/JAWT_X11DrawingSurfaceInfo", name = "accessor", descriptor = "Lgl!com/sun/gluegen/runtime/StructAccessor;")
	protected Class192 accessor;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/JAWT_X11DrawingSurfaceInfo", name = "<init>", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public JAWT_X11DrawingSurfaceInfo(@OriginalArg(0) ByteBuffer arg0) {
		this.accessor = new Class192(arg0);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/JAWT_X11DrawingSurfaceInfo", name = "drawable", descriptor = "()J")
	public abstract long drawable();

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/JAWT_X11DrawingSurfaceInfo", name = "display", descriptor = "()J")
	public abstract long display();

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/JAWT_X11DrawingSurfaceInfo", name = "visualID", descriptor = "()J")
	public abstract long visualID();
}
