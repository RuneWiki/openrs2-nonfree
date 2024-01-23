package com.sun.opengl.impl.macosx;

import com.sun.opengl.impl.Class195;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLCapabilitiesChooser;
import javax.media.opengl.GLException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("gl!com/sun/opengl/impl/macosx/MacOSXGLDrawable")
public abstract class Class195_Sub1 extends Class195 {

	@OriginalMember(owner = "gl!com/sun/opengl/impl/macosx/MacOSXGLDrawable", name = "capabilities", descriptor = "Lgl!javax/media/opengl/GLCapabilities;")
	private GLCapabilities aGLCapabilities2;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/macosx/MacOSXGLDrawable", name = "chooser", descriptor = "Lgl!javax/media/opengl/GLCapabilitiesChooser;")
	private GLCapabilitiesChooser aGLCapabilitiesChooser2;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/macosx/MacOSXGLDrawable", name = "<init>", descriptor = "(Lgl!javax/media/opengl/GLCapabilities;Lgl!javax/media/opengl/GLCapabilitiesChooser;)V")
	protected Class195_Sub1(@OriginalArg(0) GLCapabilities arg0, @OriginalArg(1) GLCapabilitiesChooser arg1) {
		this.aGLCapabilities2 = (GLCapabilities) arg0.clone();
		this.aGLCapabilitiesChooser2 = arg1;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/macosx/MacOSXGLDrawable", name = "setRealized", descriptor = "(Z)V")
	public abstract void setRealized(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/macosx/MacOSXGLDrawable", name = "swapBuffers", descriptor = "()V")
	public abstract void swapBuffers();

	@OriginalMember(owner = "gl!com/sun/opengl/impl/macosx/MacOSXGLDrawable", name = "getView", descriptor = "()J")
	public abstract long method5093();

	@OriginalMember(owner = "gl!com/sun/opengl/impl/macosx/MacOSXGLDrawable", name = "getCapabilities", descriptor = "()Lgl!javax/media/opengl/GLCapabilities;")
	public final GLCapabilities method5094() {
		@Pc(4) GLCapabilities[] local4 = new GLCapabilities[] { this.aGLCapabilities2 };
		@Pc(17) int local17 = this.aGLCapabilitiesChooser2.chooseCapabilities(this.aGLCapabilities2, local4, 0);
		if (local17 < 0 || local17 >= 1) {
			throw new GLException("Invalid result " + local17 + " from GLCapabilitiesChooser (should be between 0 and " + ")");
		}
		return local4[local17];
	}
}
