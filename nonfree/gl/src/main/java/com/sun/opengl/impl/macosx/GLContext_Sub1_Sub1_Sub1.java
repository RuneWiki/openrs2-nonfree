package com.sun.opengl.impl.macosx;

import javax.media.opengl.GLException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("gl!com/sun/opengl/impl/macosx/MacOSXOnscreenGLContext")
public final class GLContext_Sub1_Sub1_Sub1 extends GLContext_Sub1_Sub1 {

	@OriginalMember(owner = "gl!com/sun/opengl/impl/macosx/MacOSXOnscreenGLContext", name = "drawable", descriptor = "Lgl!com/sun/opengl/impl/macosx/MacOSXOnscreenGLDrawable;")
	private Class195_Sub1_Sub1 aClass195_Sub1_Sub1_1;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/macosx/MacOSXOnscreenGLContext", name = "<init>", descriptor = "(Lgl!com/sun/opengl/impl/macosx/MacOSXOnscreenGLDrawable;)V")
	public GLContext_Sub1_Sub1_Sub1(@OriginalArg(0) Class195_Sub1_Sub1 arg0) {
		super(arg0);
		this.aClass195_Sub1_Sub1_1 = arg0;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/macosx/MacOSXOnscreenGLContext", name = "makeCurrentImpl", descriptor = "()I")
	@Override
	protected int makeCurrentImpl() throws GLException {
		@Pc(3) int local3 = this.aClass195_Sub1_Sub1_1.method4702();
		if (local3 == 1) {
			return 0;
		}
		@Pc(16) int local16;
		try {
			if (local3 == 2) {
				super.destroyImpl();
			}
			local16 = super.makeCurrentImpl();
			if (local16 == 1 || local16 == 2) {
				CGL.updateContext(this.aLong1262);
			}
		} finally {
			this.aClass195_Sub1_Sub1_1.method4703();
		}
		return local16;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/macosx/MacOSXOnscreenGLContext", name = "swapBuffers", descriptor = "()V")
	public void method4699() throws GLException {
		if (!CGL.flushBuffer(this.aLong1262)) {
			throw new GLException("Error swapping buffers");
		}
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/macosx/MacOSXOnscreenGLContext", name = "update", descriptor = "()V")
	@Override
	protected void update() throws GLException {
		if (this.aLong1262 == 0L) {
			throw new GLException("Context not created");
		}
		CGL.updateContext(this.aLong1262);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/macosx/MacOSXOnscreenGLContext", name = "create", descriptor = "()Z")
	@Override
	protected boolean method4697() {
		return this.method4698();
	}
}
