package com.sun.opengl.impl.x11;

import javax.media.opengl.GLException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("gl!com/sun/opengl/impl/x11/GLXExtImpl")
public final class GLXExtImpl implements GLXExt {

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/GLXExtImpl", name = "_context", descriptor = "Lgl!com/sun/opengl/impl/x11/X11GLContext;")
	private X11GLContext _context;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/GLXExtImpl", name = "<init>", descriptor = "(Lgl!com/sun/opengl/impl/x11/X11GLContext;)V")
	public GLXExtImpl(@OriginalArg(0) X11GLContext arg0) {
		this._context = arg0;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/GLXExtImpl", name = "glXSwapIntervalSGI", descriptor = "(I)I")
	@Override
	public int glXSwapIntervalSGI(@OriginalArg(0) int arg0) {
		@Pc(4) long local4 = this._context.getGLXExtProcAddressTable()._addressof_glXSwapIntervalSGI;
		if (local4 == 0L) {
			throw new GLException("Method \"glXSwapIntervalSGI\" not available");
		}
		return this.dispatch_glXSwapIntervalSGI0(arg0, local4);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/GLXExtImpl", name = "dispatch_glXSwapIntervalSGI0", descriptor = "(IJ)I")
	private native int dispatch_glXSwapIntervalSGI0(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/GLXExtImpl", name = "isExtensionAvailable", descriptor = "(Ljava/lang/String;)Z")
	@Override
	public boolean isExtensionAvailable(@OriginalArg(0) String arg0) {
		return this._context.isExtensionAvailable(arg0);
	}
}
