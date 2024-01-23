package com.sun.opengl.impl.x11;

import com.sun.opengl.impl.Class195;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLCapabilitiesChooser;
import javax.media.opengl.GLException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("gl!com/sun/opengl/impl/x11/X11GLDrawable")
public abstract class X11GLDrawable extends Class195 {

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11GLDrawable", name = "display", descriptor = "J")
	protected long display;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11GLDrawable", name = "drawable", descriptor = "J")
	protected long drawable;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11GLDrawable", name = "visualID", descriptor = "J")
	protected long visualID;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11GLDrawable", name = "capabilities", descriptor = "Lgl!javax/media/opengl/GLCapabilities;")
	private GLCapabilities capabilities;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11GLDrawable", name = "chooser", descriptor = "Lgl!javax/media/opengl/GLCapabilitiesChooser;")
	private GLCapabilitiesChooser chooser;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11GLDrawable", name = "<init>", descriptor = "(Lgl!javax/media/opengl/GLCapabilities;Lgl!javax/media/opengl/GLCapabilitiesChooser;)V")
	protected X11GLDrawable(@OriginalArg(0) GLCapabilities arg0, @OriginalArg(1) GLCapabilitiesChooser arg1) {
		this.capabilities = arg0 == null ? null : (GLCapabilities) arg0.clone();
		this.chooser = arg1;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11GLDrawable", name = "setRealized", descriptor = "(Z)V")
	@Override
	public void setRealized(@OriginalArg(0) boolean arg0) {
		throw new GLException("Should not call this (should only be called for onscreen GLDrawables)");
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11GLDrawable", name = "swapBuffers", descriptor = "()V")
	@Override
	public void swapBuffers() throws GLException {
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11GLDrawable", name = "getDisplay", descriptor = "()J")
	public final long getDisplay() {
		return this.display;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11GLDrawable", name = "getDrawable", descriptor = "()J")
	public final long getDrawable() {
		return this.drawable;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11GLDrawable", name = "chooseVisual", descriptor = "(Z)Lgl!com/sun/opengl/impl/x11/XVisualInfo;")
	public final XVisualInfo chooseVisual(@OriginalArg(0) boolean arg0) {
		if (this.display == 0L) {
			throw new GLException("null display");
		}
		@Pc(14) int[] local14 = new int[1];
		@Pc(16) XVisualInfo local16 = XVisualInfo.create();
		local16.visualid((long) this.visualID);
		this.lockToolkit();
		@Pc(33) XVisualInfo[] local33 = GLX.XGetVisualInfo(this.display, 1L, local16, local14, 0);
		this.unlockToolkit();
		if (local33 == null || local33.length == 0) {
			throw new GLException("Error while getting XVisualInfo for visual ID " + this.visualID);
		}
		return local33[0];
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11GLDrawable", name = "lockToolkit", descriptor = "()V")
	protected final void lockToolkit() {
		X11GLDrawableFactory.getX11Factory().lockToolkit();
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11GLDrawable", name = "unlockToolkit", descriptor = "()V")
	protected final void unlockToolkit() {
		X11GLDrawableFactory.getX11Factory().unlockToolkit();
	}
}
