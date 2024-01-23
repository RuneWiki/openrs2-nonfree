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
	private long aLong1318;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WindowsDummyGLDrawable", name = "<init>", descriptor = "()V")
	public Class195_Sub2_Sub1() {
		super(new GLCapabilities(), (GLCapabilitiesChooser) null);
		@Pc(15) Class local15 = WindowsDummyGLDrawable.class;
		synchronized (WindowsDummyGLDrawable.class) {
			this.aLong1318 = WGL.CreateDummyWindow(0, 0, 1, 1);
		}
		this.aLong1321 = WGL.GetDC(this.aLong1318);
		@Pc(40) GLCapabilities local40 = new GLCapabilities();
		local40.setDepthBits(16);
		@Pc(47) Class202 local47 = method4850(local40);
		@Pc(52) int local52 = WGL.method4812(this.aLong1321, local47);
		if (local52 == 0 || !WGL.method4814(this.aLong1321, local52, local47)) {
			this.method4839();
		}
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WindowsDummyGLDrawable", name = "createContext", descriptor = "(Lgl!javax/media/opengl/GLContext;)Lgl!javax/media/opengl/GLContext;")
	@Override
	public GLContext createContext(@OriginalArg(0) GLContext arg0) {
		return this.aLong1321 == 0L ? null : new GLContext_Sub1_Sub2(this);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WindowsDummyGLDrawable", name = "destroy", descriptor = "()V")
	public void method4839() {
		if (this.aLong1321 != 0L) {
			WGL.ReleaseDC(this.aLong1318, this.aLong1321);
			this.aLong1321 = 0L;
		}
		if (this.aLong1318 != 0L) {
			WGL.ShowWindow(this.aLong1318, 0);
			WGL.DestroyWindow(this.aLong1318);
			this.aLong1318 = 0L;
		}
	}
}
