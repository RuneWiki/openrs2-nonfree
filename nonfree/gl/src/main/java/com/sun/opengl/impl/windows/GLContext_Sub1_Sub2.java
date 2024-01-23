package com.sun.opengl.impl.windows;

import com.sun.opengl.impl.GLContext_Sub1;
import java.util.HashMap;
import java.util.Map;
import javax.media.opengl.GLException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("gl!com/sun/opengl/impl/windows/WindowsGLContext")
public class GLContext_Sub1_Sub2 extends GLContext_Sub1 {

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WindowsGLContext", name = "functionNameMap", descriptor = "Ljava/util/Map;")
	private static final Map aMap4 = new HashMap();

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WindowsGLContext", name = "extensionNameMap", descriptor = "Ljava/util/Map;")
	private static final Map aMap5;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WindowsGLContext", name = "hglrc", descriptor = "J")
	private long aLong1319;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WindowsGLContext", name = "wglGetExtensionsStringEXTInitialized", descriptor = "Z")
	private boolean aBoolean375;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WindowsGLContext", name = "wglGetExtensionsStringEXTAvailable", descriptor = "Z")
	private boolean aBoolean376;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WindowsGLContext", name = "wglExt", descriptor = "Lgl!com/sun/opengl/impl/windows/WGLExt;")
	private Interface9 anInterface9_2;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WindowsGLContext", name = "wglExtProcAddressTable", descriptor = "Lgl!com/sun/opengl/impl/windows/WGLExtProcAddressTable;")
	private Class203 aClass203_2;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WindowsGLContext", name = "drawable", descriptor = "Lgl!com/sun/opengl/impl/windows/WindowsGLDrawable;")
	private Class195_Sub2 aClass195_Sub2_2;

	static {
		aMap4.put("glAllocateMemoryNV", "wglAllocateMemoryNV");
		aMap4.put("glFreeMemoryNV", "wglFreeMemoryNV");
		aMap5 = new HashMap();
		aMap5.put("GL_ARB_pbuffer", "WGL_ARB_pbuffer");
		aMap5.put("GL_ARB_pixel_format", "WGL_ARB_pixel_format");
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WindowsGLContext", name = "<init>", descriptor = "(Lgl!com/sun/opengl/impl/windows/WindowsGLDrawable;)V")
	public GLContext_Sub1_Sub2(@OriginalArg(0) Class195_Sub2 arg0) {
		this.aClass195_Sub2_2 = arg0;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WindowsGLContext", name = "getPlatformGLExtensions", descriptor = "()Ljava/lang/Object;")
	public final Object method4690() {
		return this.method4691();
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WindowsGLContext", name = "getWGLExt", descriptor = "()Lgl!com/sun/opengl/impl/windows/WGLExt;")
	private Interface9 method4691() {
		if (this.anInterface9_2 == null) {
			this.anInterface9_2 = new WGLExtImpl(this);
		}
		return this.anInterface9_2;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WindowsGLContext", name = "mapToRealGLExtensionName", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	protected final String mapToRealGLExtensionName(@OriginalArg(0) String arg0) {
		@Pc(4) String local4 = (String) aMap5.get(arg0);
		return local4 == null ? arg0 : local4;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WindowsGLContext", name = "create", descriptor = "()V")
	private void method4692() {
		if (this.aClass195_Sub2_2.method4694() == 0L) {
			throw new GLException("Internal error: attempted to create OpenGL context without an associated drawable");
		}
		this.aLong1319 = WGL.wglCreateContext(this.aClass195_Sub2_2.method4694());
		if (this.aLong1319 == 0L) {
			throw new GLException("Unable to create OpenGL context for device context " + toHexString(this.aClass195_Sub2_2.method4694()));
		}
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WindowsGLContext", name = "makeCurrentImpl", descriptor = "()I")
	@Override
	protected int makeCurrentImpl() throws GLException {
		@Pc(1) boolean local1 = false;
		if (this.aLong1319 == 0L) {
			this.method4692();
			local1 = true;
		}
		if (!WGL.wglMakeCurrent(this.aClass195_Sub2_2.method4694(), this.aLong1319)) {
			throw new GLException("Error making context current: " + WGL.GetLastError());
		} else if (local1) {
			this.resetGLFunctionAvailability();
			return 2;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WindowsGLContext", name = "releaseImpl", descriptor = "()V")
	@Override
	protected void releaseImpl() throws GLException {
		if (!WGL.wglMakeCurrent(0L, 0L)) {
			throw new GLException("Error freeing OpenGL context: " + WGL.GetLastError());
		}
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WindowsGLContext", name = "destroyImpl", descriptor = "()V")
	@Override
	protected final void destroyImpl() throws GLException {
		if (this.aLong1319 != 0L) {
			if (!WGL.wglDeleteContext(this.aLong1319)) {
				throw new GLException("Unable to delete OpenGL context");
			}
			this.aLong1319 = 0L;
		}
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WindowsGLContext", name = "resetGLFunctionAvailability", descriptor = "()V")
	@Override
	protected final void resetGLFunctionAvailability() {
		super.resetGLFunctionAvailability();
		this.resetProcAddressTable(this.method4693());
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WindowsGLContext", name = "getWGLExtProcAddressTable", descriptor = "()Lgl!com/sun/opengl/impl/windows/WGLExtProcAddressTable;")
	public final Class203 method4693() {
		if (this.aClass203_2 == null) {
			this.aClass203_2 = new Class203();
		}
		return this.aClass203_2;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WindowsGLContext", name = "getPlatformExtensionsString", descriptor = "()Ljava/lang/String;")
	@Override
	public final String getPlatformExtensionsString() {
		if (!this.aBoolean375) {
			this.aBoolean376 = WGL.wglGetProcAddress("wglGetExtensionsStringEXT") != 0L;
			this.aBoolean375 = true;
		}
		return this.aBoolean376 ? this.method4691().method4667() : "";
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WindowsGLContext", name = "setSwapInterval", descriptor = "(I)V")
	@Override
	public final void setSwapInterval(@OriginalArg(0) int arg0) {
		@Pc(2) Interface9 local2 = this.method4691();
		if (local2.method4670("WGL_EXT_swap_control")) {
			local2.method4669(arg0);
		}
	}
}
