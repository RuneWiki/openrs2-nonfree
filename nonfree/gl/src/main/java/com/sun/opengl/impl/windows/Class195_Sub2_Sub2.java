package com.sun.opengl.impl.windows;

import com.sun.opengl.impl.JAWT;
import com.sun.opengl.impl.JAWT_DrawingSurface;
import com.sun.opengl.impl.JAWT_DrawingSurfaceInfo;
import java.awt.Component;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLCapabilitiesChooser;
import javax.media.opengl.GLContext;
import javax.media.opengl.GLException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("gl!com/sun/opengl/impl/windows/WindowsOnscreenGLDrawable")
public final class Class195_Sub2_Sub2 extends Class195_Sub2 {

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WindowsOnscreenGLDrawable", name = "ds", descriptor = "Lgl!com/sun/opengl/impl/JAWT_DrawingSurface;")
	private JAWT_DrawingSurface aJAWT_DrawingSurface2;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WindowsOnscreenGLDrawable", name = "dsi", descriptor = "Lgl!com/sun/opengl/impl/JAWT_DrawingSurfaceInfo;")
	private JAWT_DrawingSurfaceInfo aJAWT_DrawingSurfaceInfo2;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WindowsOnscreenGLDrawable", name = "realized", descriptor = "Z")
	private boolean aBoolean502;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WindowsOnscreenGLDrawable", name = "component", descriptor = "Ljava/awt/Component;")
	private Component aComponent4;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WindowsOnscreenGLDrawable", name = "<init>", descriptor = "(Ljava/awt/Component;Lgl!javax/media/opengl/GLCapabilities;Lgl!javax/media/opengl/GLCapabilitiesChooser;)V")
	public Class195_Sub2_Sub2(@OriginalArg(0) Component arg0, @OriginalArg(1) GLCapabilities arg1, @OriginalArg(2) GLCapabilitiesChooser arg2) {
		super(arg1, arg2);
		this.aComponent4 = arg0;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WindowsOnscreenGLDrawable", name = "createContext", descriptor = "(Lgl!javax/media/opengl/GLContext;)Lgl!javax/media/opengl/GLContext;")
	@Override
	public GLContext createContext(@OriginalArg(0) GLContext arg0) {
		return new GLContext_Sub1_Sub2_Sub1(this);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WindowsOnscreenGLDrawable", name = "setRealized", descriptor = "(Z)V")
	@Override
	public void setRealized(@OriginalArg(0) boolean arg0) {
		this.aBoolean502 = arg0;
		if (!arg0) {
			this.setChosenGLCapabilities(null);
			this.aBoolean501 = false;
		}
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WindowsOnscreenGLDrawable", name = "swapBuffers", descriptor = "()V")
	@Override
	public void swapBuffers() throws GLException {
		@Pc(2) int local2 = this.method4627();
		if (local2 == 1) {
			return;
		}
		try {
			if (!WGL.SwapBuffers(this.aLong1323) && WGL.GetLastError() != 0) {
				throw new GLException("Error swapping buffers");
			}
		} finally {
			this.method4628(false);
		}
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WindowsOnscreenGLDrawable", name = "lockSurface", descriptor = "()I")
	public int method4627() {
		if (this.aLong1323 != 0L) {
			return 3;
		} else if (this.aBoolean502) {
			this.aJAWT_DrawingSurface2 = JAWT.method4416().method4412(this.aComponent4);
			if (this.aJAWT_DrawingSurface2 == null) {
				return 1;
			}
			@Pc(26) int local26 = this.aJAWT_DrawingSurface2.method4434();
			if ((local26 & 0x1) != 0) {
				JAWT.method4416().method4413(this.aJAWT_DrawingSurface2);
				this.aJAWT_DrawingSurface2 = null;
				return 1;
			}
			this.aJAWT_DrawingSurfaceInfo2 = this.aJAWT_DrawingSurface2.method4435();
			if (this.aJAWT_DrawingSurfaceInfo2 == null) {
				this.aJAWT_DrawingSurface2.method4437();
				JAWT.method4416().method4413(this.aJAWT_DrawingSurface2);
				this.aJAWT_DrawingSurface2 = null;
				return 1;
			}
			this.aLong1323 = ((Class201) this.aJAWT_DrawingSurfaceInfo2.method4448()).method4486();
			if (this.aLong1323 == 0L) {
				this.aJAWT_DrawingSurface2.method4436(this.aJAWT_DrawingSurfaceInfo2);
				this.aJAWT_DrawingSurface2.method4437();
				JAWT.method4416().method4413(this.aJAWT_DrawingSurface2);
				this.aJAWT_DrawingSurface2 = null;
				this.aJAWT_DrawingSurfaceInfo2 = null;
				return 1;
			}
			if (!this.aBoolean501) {
				try {
					this.method4621();
				} catch (@Pc(99) RuntimeException local99) {
					this.method4628(true);
					return 1;
				}
			}
			return (local26 & 0x8) == 0 ? 3 : 2;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WindowsOnscreenGLDrawable", name = "unlockSurface", descriptor = "(Z)V")
	public void method4628(@OriginalArg(0) boolean arg0) {
		if (!arg0 || this.aLong1323 == 0L) {
			return;
		}
		this.aJAWT_DrawingSurface2.method4436(this.aJAWT_DrawingSurfaceInfo2);
		this.aJAWT_DrawingSurface2.method4437();
		JAWT.method4416().method4413(this.aJAWT_DrawingSurface2);
		this.aJAWT_DrawingSurface2 = null;
		this.aJAWT_DrawingSurfaceInfo2 = null;
		this.aLong1323 = 0L;
	}
}
