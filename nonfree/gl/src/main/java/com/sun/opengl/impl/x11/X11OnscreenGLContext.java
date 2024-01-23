package com.sun.opengl.impl.x11;

import javax.media.opengl.GLException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("gl!com/sun/opengl/impl/x11/X11OnscreenGLContext")
public final class X11OnscreenGLContext extends X11GLContext {

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11OnscreenGLContext", name = "drawable", descriptor = "Lgl!com/sun/opengl/impl/x11/X11OnscreenGLDrawable;")
	private X11OnscreenGLDrawable drawable;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11OnscreenGLContext", name = "<init>", descriptor = "(Lgl!com/sun/opengl/impl/x11/X11OnscreenGLDrawable;)V")
	public X11OnscreenGLContext(@OriginalArg(0) X11OnscreenGLDrawable arg0) {
		super(arg0);
		this.drawable = arg0;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11OnscreenGLContext", name = "makeCurrentImpl", descriptor = "()I")
	@Override
	protected int makeCurrentImpl() throws GLException {
		@Pc(3) int local3 = this.drawable.lockSurface();
		if (local3 == 1) {
			return 0;
		}
		@Pc(16) int local16;
		try {
			if (local3 == 2) {
				super.destroyImpl();
			}
			local16 = super.makeCurrentImpl();
		} finally {
			this.drawable.unlockSurface();
		}
		return local16;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11OnscreenGLContext", name = "create", descriptor = "()V")
	@Override
	protected void create() {
		this.createContext(true);
	}
}
