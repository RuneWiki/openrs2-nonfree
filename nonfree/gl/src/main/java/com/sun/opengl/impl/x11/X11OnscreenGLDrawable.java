package com.sun.opengl.impl.x11;

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

@OriginalClass("gl!com/sun/opengl/impl/x11/X11OnscreenGLDrawable")
public final class X11OnscreenGLDrawable extends X11GLDrawable {

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11OnscreenGLDrawable", name = "ds", descriptor = "Lgl!com/sun/opengl/impl/JAWT_DrawingSurface;")
	private JAWT_DrawingSurface ds;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11OnscreenGLDrawable", name = "dsi", descriptor = "Lgl!com/sun/opengl/impl/JAWT_DrawingSurfaceInfo;")
	private JAWT_DrawingSurfaceInfo dsi;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11OnscreenGLDrawable", name = "realized", descriptor = "Z")
	private boolean realized;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11OnscreenGLDrawable", name = "component", descriptor = "Ljava/awt/Component;")
	private Component component;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11OnscreenGLDrawable", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public X11OnscreenGLDrawable(@OriginalArg(0) Component arg0) {
		super((GLCapabilities) null, (GLCapabilitiesChooser) null);
		this.component = arg0;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11OnscreenGLDrawable", name = "createContext", descriptor = "(Lgl!javax/media/opengl/GLContext;)Lgl!javax/media/opengl/GLContext;")
	@Override
	public GLContext createContext(@OriginalArg(0) GLContext arg0) {
		return new X11OnscreenGLContext(this);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11OnscreenGLDrawable", name = "setRealized", descriptor = "(Z)V")
	@Override
	public void setRealized(@OriginalArg(0) boolean arg0) {
		this.realized = arg0;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11OnscreenGLDrawable", name = "swapBuffers", descriptor = "()V")
	@Override
	public void swapBuffers() throws GLException {
		this.lockToolkit();
		try {
			@Pc(4) int local4 = this.lockSurface();
			if (local4 == 1) {
				return;
			}
			try {
				GLX.glXSwapBuffers(this.display, this.drawable);
			} finally {
				this.unlockSurface();
			}
		} finally {
			this.unlockToolkit();
		}
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11OnscreenGLDrawable", name = "lockSurface", descriptor = "()I")
	public int lockSurface() throws GLException {
		if (this.drawable != 0L) {
			return 3;
		} else if (this.realized) {
			this.ds = JAWT.method5037().method5033(this.component);
			if (this.ds == null) {
				return 1;
			}
			@Pc(26) int local26 = this.ds.method5055();
			if ((local26 & 0x1) != 0) {
				JAWT.method5037().method5034(this.ds);
				this.ds = null;
				return 1;
			}
			this.dsi = this.ds.method5056();
			if (this.dsi == null) {
				this.ds.method5058();
				JAWT.method5037().method5034(this.ds);
				this.ds = null;
				return 1;
			}
			@Pc(64) JAWT_X11DrawingSurfaceInfo local64 = (JAWT_X11DrawingSurfaceInfo) this.dsi.method5069();
			this.display = local64.display();
			this.drawable = local64.drawable();
			this.visualID = local64.visualID();
			if (this.display == 0L || this.drawable == 0L) {
				this.ds.method5057(this.dsi);
				this.ds.method5058();
				JAWT.method5037().method5034(this.ds);
				this.ds = null;
				this.dsi = null;
				this.display = 0L;
				this.drawable = 0L;
				this.visualID = 0L;
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

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11OnscreenGLDrawable", name = "unlockSurface", descriptor = "()V")
	public void unlockSurface() {
		if (this.drawable == 0L) {
			return;
		}
		this.ds.method5057(this.dsi);
		this.ds.method5058();
		JAWT.method5037().method5034(this.ds);
		this.ds = null;
		this.dsi = null;
		this.display = 0L;
		this.drawable = 0L;
		this.visualID = 0L;
	}
}
