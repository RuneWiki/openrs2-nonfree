package com.sun.opengl.impl.windows;

import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLCapabilitiesChooser;
import javax.media.opengl.GLContext;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("gl!com/sun/opengl/impl/windows/WindowsDummyGLDrawable")
public final class Class195_Sub2_Sub1 extends Class195_Sub2 {

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WindowsDummyGLDrawable", name = "hwnd", descriptor = "J")
	private long aLong1432;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WindowsDummyGLDrawable", name = "<init>", descriptor = "()V")
	public Class195_Sub2_Sub1() {
		super(new GLCapabilities(), (GLCapabilitiesChooser) null);
		@Pc(15) Class local15 = WindowsDummyGLDrawable.class;
		synchronized (WindowsDummyGLDrawable.class) {
			this.aLong1432 = WGL.CreateDummyWindow(0, 0, 1, 1);
		}
		this.aLong1435 = WGL.GetDC(this.aLong1432);
		@Pc(40) GLCapabilities local40 = new GLCapabilities();
		local40.setDepthBits(16);
		@Pc(47) Class202 local47 = method5243(local40);
		@Pc(52) int local52 = WGL.method5205(this.aLong1435, local47);
		if (local52 == 0 || !WGL.method5207(this.aLong1435, local52, local47)) {
			this.method5232();
		}
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WindowsDummyGLDrawable", name = "createContext", descriptor = "(Lgl!javax/media/opengl/GLContext;)Lgl!javax/media/opengl/GLContext;")
	@Override
	public GLContext createContext(@OriginalArg(0) GLContext arg0) {
		return this.aLong1435 == 0L ? null : new GLContext_Sub1_Sub2(this);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WindowsDummyGLDrawable", name = "destroy", descriptor = "()V")
	public void method5232() {
		if (this.aLong1435 != 0L) {
			WGL.ReleaseDC(this.aLong1432, this.aLong1435);
			this.aLong1435 = 0L;
		}
		if (this.aLong1432 != 0L) {
			WGL.ShowWindow(this.aLong1432, 0);
			WGL.DestroyWindow(this.aLong1432);
			this.aLong1432 = 0L;
		}
	}
}
