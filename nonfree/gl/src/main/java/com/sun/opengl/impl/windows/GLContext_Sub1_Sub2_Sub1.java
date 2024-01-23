package com.sun.opengl.impl.windows;

import javax.media.opengl.GLException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("gl!com/sun/opengl/impl/windows/WindowsOnscreenGLContext")
public final class GLContext_Sub1_Sub2_Sub1 extends GLContext_Sub1_Sub2 {

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WindowsOnscreenGLContext", name = "drawable", descriptor = "Lgl!com/sun/opengl/impl/windows/WindowsOnscreenGLDrawable;")
	private Class195_Sub2_Sub2 aClass195_Sub2_Sub2_1;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WindowsOnscreenGLContext", name = "<init>", descriptor = "(Lgl!com/sun/opengl/impl/windows/WindowsOnscreenGLDrawable;)V")
	public GLContext_Sub1_Sub2_Sub1(@OriginalArg(0) Class195_Sub2_Sub2 arg0) {
		super(arg0);
		this.aClass195_Sub2_Sub2_1 = arg0;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WindowsOnscreenGLContext", name = "makeCurrentImpl", descriptor = "()I")
	@Override
	protected int makeCurrentImpl() throws GLException {
		@Pc(3) int local3 = this.aClass195_Sub2_Sub2_1.method4627();
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
			this.aClass195_Sub2_Sub2_1.method4628(false);
		}
		return local16;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WindowsOnscreenGLContext", name = "releaseImpl", descriptor = "()V")
	@Override
	protected void releaseImpl() throws GLException {
		try {
			super.releaseImpl();
		} finally {
			this.aClass195_Sub2_Sub2_1.method4628(true);
		}
	}
}
