package com.sun.opengl.impl.macosx;

import com.sun.opengl.impl.JAWT;
import com.sun.opengl.impl.JAWT_DrawingSurface;
import com.sun.opengl.impl.JAWT_DrawingSurfaceInfo;
import java.awt.Component;
import java.security.AccessController;
import java.security.PrivilegedAction;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLCapabilitiesChooser;
import javax.media.opengl.GLContext;
import javax.media.opengl.GLException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("gl!com/sun/opengl/impl/macosx/MacOSXOnscreenGLDrawable")
public final class Class195_Sub1_Sub1 extends Class195_Sub1 {

	@OriginalMember(owner = "gl!com/sun/opengl/impl/macosx/MacOSXOnscreenGLDrawable", name = "nsView", descriptor = "J")
	private long aLong1377;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/macosx/MacOSXOnscreenGLDrawable", name = "ds", descriptor = "Lgl!com/sun/opengl/impl/JAWT_DrawingSurface;")
	public JAWT_DrawingSurface aJAWT_DrawingSurface1;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/macosx/MacOSXOnscreenGLDrawable", name = "dsi", descriptor = "Lgl!com/sun/opengl/impl/JAWT_DrawingSurfaceInfo;")
	public JAWT_DrawingSurfaceInfo aJAWT_DrawingSurfaceInfo1;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/macosx/MacOSXOnscreenGLDrawable", name = "realized", descriptor = "Z")
	private boolean aBoolean506;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/macosx/MacOSXOnscreenGLDrawable", name = "firstLock", descriptor = "Z")
	private boolean aBoolean507 = true;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/macosx/MacOSXOnscreenGLDrawable", name = "component", descriptor = "Ljava/awt/Component;")
	private Component aComponent3;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/macosx/MacOSXOnscreenGLDrawable", name = "<init>", descriptor = "(Ljava/awt/Component;Lgl!javax/media/opengl/GLCapabilities;Lgl!javax/media/opengl/GLCapabilitiesChooser;)V")
	public Class195_Sub1_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) GLCapabilities arg1, @OriginalArg(2) GLCapabilitiesChooser arg2) {
		super(arg1, arg2);
		this.aComponent3 = arg0;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/macosx/MacOSXOnscreenGLDrawable", name = "createContext", descriptor = "(Lgl!javax/media/opengl/GLContext;)Lgl!javax/media/opengl/GLContext;")
	@Override
	public GLContext createContext(@OriginalArg(0) GLContext arg0) {
		return new GLContext_Sub1_Sub1_Sub1(this);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/macosx/MacOSXOnscreenGLDrawable", name = "setRealized", descriptor = "(Z)V")
	@Override
	public void setRealized(@OriginalArg(0) boolean arg0) {
		this.aBoolean506 = arg0;
		this.setChosenGLCapabilities(null);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/macosx/MacOSXOnscreenGLDrawable", name = "swapBuffers", descriptor = "()V")
	@Override
	public void swapBuffers() throws GLException {
		((GLContext_Sub1_Sub1_Sub1) GLContext.getCurrent()).method5092();
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/macosx/MacOSXOnscreenGLDrawable", name = "getView", descriptor = "()J")
	@Override
	public long method5093() {
		return this.aLong1377;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/macosx/MacOSXOnscreenGLDrawable", name = "lockSurface", descriptor = "()I")
	public int method5095() throws GLException {
		if (this.aLong1377 != 0L) {
			return 3;
		} else if (this.aBoolean506) {
			this.aJAWT_DrawingSurface1 = JAWT.method5037().method5033(this.aComponent3);
			if (this.aJAWT_DrawingSurface1 == null) {
				return 1;
			}
			@Pc(26) int local26 = this.aJAWT_DrawingSurface1.method5055();
			if ((local26 & 0x1) != 0) {
				JAWT.method5037().method5034(this.aJAWT_DrawingSurface1);
				this.aJAWT_DrawingSurface1 = null;
				return 1;
			}
			if (this.aBoolean507) {
				AccessController.doPrivileged(new PrivilegedAction() {

					@OriginalMember(owner = "gl!com/sun/opengl/impl/macosx/MacOSXOnscreenGLDrawable$1", name = "run", descriptor = "()Ljava/lang/Object;")
					@Override
					public Object run() {
						Class195_Sub1_Sub1.this.aJAWT_DrawingSurfaceInfo1 = Class195_Sub1_Sub1.this.aJAWT_DrawingSurface1.method5056();
						return null;
					}
				});
				this.aBoolean507 = false;
			} else {
				this.aJAWT_DrawingSurfaceInfo1 = this.aJAWT_DrawingSurface1.method5056();
			}
			if (this.aJAWT_DrawingSurfaceInfo1 == null) {
				this.aJAWT_DrawingSurface1.method5058();
				JAWT.method5037().method5034(this.aJAWT_DrawingSurface1);
				this.aJAWT_DrawingSurface1 = null;
				return 1;
			}
			@Pc(77) Class199 local77 = (Class199) this.aJAWT_DrawingSurfaceInfo1.method5069();
			if (local77 != null) {
				this.aLong1377 = local77.method5084();
			}
			if (this.aLong1377 == 0L) {
				this.aJAWT_DrawingSurface1.method5057(this.aJAWT_DrawingSurfaceInfo1);
				this.aJAWT_DrawingSurface1.method5058();
				JAWT.method5037().method5034(this.aJAWT_DrawingSurface1);
				this.aJAWT_DrawingSurface1 = null;
				this.aJAWT_DrawingSurfaceInfo1 = null;
				return 1;
			} else if ((local26 & 0x8) == 0) {
				return 3;
			} else {
				return 2;
			}
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/macosx/MacOSXOnscreenGLDrawable", name = "unlockSurface", descriptor = "()V")
	public void method5096() throws GLException {
		if (this.aLong1377 == 0L) {
			return;
		}
		this.aJAWT_DrawingSurface1.method5057(this.aJAWT_DrawingSurfaceInfo1);
		this.aJAWT_DrawingSurface1.method5058();
		JAWT.method5037().method5034(this.aJAWT_DrawingSurface1);
		this.aJAWT_DrawingSurface1 = null;
		this.aJAWT_DrawingSurfaceInfo1 = null;
		this.aLong1377 = 0L;
	}
}
