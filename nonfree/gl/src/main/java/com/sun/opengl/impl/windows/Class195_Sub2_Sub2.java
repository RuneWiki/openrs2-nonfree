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
	private boolean aBoolean378;

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
		this.aBoolean378 = arg0;
		if (!arg0) {
			this.setChosenGLCapabilities(null);
			this.aBoolean377 = false;
		}
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WindowsOnscreenGLDrawable", name = "swapBuffers", descriptor = "()V")
	@Override
	public void swapBuffers() throws GLException {
		@Pc(2) int local2 = this.method4701();
		if (local2 == 1) {
			return;
		}
		try {
			if (!WGL.SwapBuffers(this.aLong1320) && WGL.GetLastError() != 0) {
				throw new GLException("Error swapping buffers");
			}
		} finally {
			this.method4702(false);
		}
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WindowsOnscreenGLDrawable", name = "lockSurface", descriptor = "()I")
	public int method4701() {
		if (this.aLong1320 != 0L) {
			return 3;
		} else if (this.aBoolean378) {
			this.aJAWT_DrawingSurface2 = JAWT.method4490().method4486(this.aComponent4);
			if (this.aJAWT_DrawingSurface2 == null) {
				return 1;
			}
			@Pc(26) int local26 = this.aJAWT_DrawingSurface2.method4508();
			if ((local26 & 0x1) != 0) {
				JAWT.method4490().method4487(this.aJAWT_DrawingSurface2);
				this.aJAWT_DrawingSurface2 = null;
				return 1;
			}
			this.aJAWT_DrawingSurfaceInfo2 = this.aJAWT_DrawingSurface2.method4509();
			if (this.aJAWT_DrawingSurfaceInfo2 == null) {
				this.aJAWT_DrawingSurface2.method4511();
				JAWT.method4490().method4487(this.aJAWT_DrawingSurface2);
				this.aJAWT_DrawingSurface2 = null;
				return 1;
			}
			this.aLong1320 = ((Class201) this.aJAWT_DrawingSurfaceInfo2.method4522()).method4560();
			if (this.aLong1320 == 0L) {
				this.aJAWT_DrawingSurface2.method4510(this.aJAWT_DrawingSurfaceInfo2);
				this.aJAWT_DrawingSurface2.method4511();
				JAWT.method4490().method4487(this.aJAWT_DrawingSurface2);
				this.aJAWT_DrawingSurface2 = null;
				this.aJAWT_DrawingSurfaceInfo2 = null;
				return 1;
			}
			if (!this.aBoolean377) {
				try {
					this.method4695();
				} catch (@Pc(99) RuntimeException local99) {
					this.method4702(true);
					return 1;
				}
			}
			return (local26 & 0x8) == 0 ? 3 : 2;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WindowsOnscreenGLDrawable", name = "unlockSurface", descriptor = "(Z)V")
	public void method4702(@OriginalArg(0) boolean arg0) {
		if (!arg0 || this.aLong1320 == 0L) {
			return;
		}
		this.aJAWT_DrawingSurface2.method4510(this.aJAWT_DrawingSurfaceInfo2);
		this.aJAWT_DrawingSurface2.method4511();
		JAWT.method4490().method4487(this.aJAWT_DrawingSurface2);
		this.aJAWT_DrawingSurface2 = null;
		this.aJAWT_DrawingSurfaceInfo2 = null;
		this.aLong1320 = 0L;
	}
}
