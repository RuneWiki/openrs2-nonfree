package com.sun.opengl.impl.windows;

import javax.media.opengl.GLException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("gl!com/sun/opengl/impl/windows/WGLExtImpl")
public final class WGLExtImpl implements Interface9 {

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WGLExtImpl", name = "_context", descriptor = "Lgl!com/sun/opengl/impl/windows/WindowsGLContext;")
	private GLContext_Sub1_Sub2 aGLContext_Sub1_Sub2_1;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WGLExtImpl", name = "<init>", descriptor = "(Lgl!com/sun/opengl/impl/windows/WindowsGLContext;)V")
	public WGLExtImpl(@OriginalArg(0) GLContext_Sub1_Sub2 arg0) {
		this.aGLContext_Sub1_Sub2_1 = arg0;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WGLExtImpl", name = "dispatch_wglChoosePixelFormatARB1", descriptor = "(JLjava/lang/Object;ILjava/lang/Object;IILjava/lang/Object;ILjava/lang/Object;IJ)Z")
	private native boolean dispatch_wglChoosePixelFormatARB1(@OriginalArg(0) long arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Object arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Object arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Object arg8, @OriginalArg(9) int arg9, @OriginalArg(10) long arg10);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WGLExtImpl", name = "wglChoosePixelFormatARB", descriptor = "(J[II[FII[II[II)Z")
	@Override
	public boolean method5122(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) float[] arg2, @OriginalArg(6) int[] arg3, @OriginalArg(8) int[] arg4) {
		if (arg1 != null && arg1.length <= 0) {
			throw new GLException("array offset argument \"piAttribIList_offset\" (" + ") equals or exceeds array length (" + arg1.length + ")");
		} else if (arg2 != null && arg2.length <= 0) {
			throw new GLException("array offset argument \"pfAttribFList_offset\" (" + ") equals or exceeds array length (" + arg2.length + ")");
		} else if (arg3 != null && arg3.length <= 0) {
			throw new GLException("array offset argument \"piFormats_offset\" (" + ") equals or exceeds array length (" + arg3.length + ")");
		} else if (arg4 == null || arg4.length > 0) {
			@Pc(104) long local104 = this.aGLContext_Sub1_Sub2_1.method5149().aLong1270;
			if (local104 == 0L) {
				throw new GLException("Method \"wglChoosePixelFormatARB\" not available");
			}
			return this.dispatch_wglChoosePixelFormatARB1(arg0, arg1, 0, arg2, 0, 256, arg3, 0, arg4, 0, local104);
		} else {
			throw new GLException("array offset argument \"nNumFormats_offset\" (" + ") equals or exceeds array length (" + arg4.length + ")");
		}
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WGLExtImpl", name = "wglGetExtensionsStringEXT", descriptor = "()Ljava/lang/String;")
	@Override
	public String method5123() {
		@Pc(4) long local4 = this.aGLContext_Sub1_Sub2_1.method5149().aLong1290;
		if (local4 == 0L) {
			throw new GLException("Method \"wglGetExtensionsStringEXT\" not available");
		}
		return this.dispatch_wglGetExtensionsStringEXT0(local4);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WGLExtImpl", name = "dispatch_wglGetExtensionsStringEXT0", descriptor = "(J)Ljava/lang/String;")
	private native String dispatch_wglGetExtensionsStringEXT0(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WGLExtImpl", name = "dispatch_wglGetPixelFormatAttribivARB1", descriptor = "(JIIILjava/lang/Object;ILjava/lang/Object;IJ)Z")
	private native boolean dispatch_wglGetPixelFormatAttribivARB1(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Object arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Object arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WGLExtImpl", name = "wglGetPixelFormatAttribivARB", descriptor = "(JIII[II[II)Z")
	@Override
	public boolean method5124(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(6) int[] arg4) {
		if (arg3 != null && arg3.length <= 0) {
			throw new GLException("array offset argument \"piAttributes_offset\" (" + ") equals or exceeds array length (" + arg3.length + ")");
		} else if (arg4 == null || arg4.length > 0) {
			@Pc(54) long local54 = this.aGLContext_Sub1_Sub2_1.method5149().aLong1296;
			if (local54 == 0L) {
				throw new GLException("Method \"wglGetPixelFormatAttribivARB\" not available");
			}
			return this.dispatch_wglGetPixelFormatAttribivARB1(arg0, arg1, 0, arg2, arg3, 0, arg4, 0, local54);
		} else {
			throw new GLException("array offset argument \"piValues_offset\" (" + ") equals or exceeds array length (" + arg4.length + ")");
		}
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WGLExtImpl", name = "wglSwapIntervalEXT", descriptor = "(I)Z")
	@Override
	public boolean method5125(@OriginalArg(0) int arg0) {
		@Pc(4) long local4 = this.aGLContext_Sub1_Sub2_1.method5149().aLong1316;
		if (local4 == 0L) {
			throw new GLException("Method \"wglSwapIntervalEXT\" not available");
		}
		return this.dispatch_wglSwapIntervalEXT0(0, local4);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WGLExtImpl", name = "dispatch_wglSwapIntervalEXT0", descriptor = "(IJ)Z")
	private native boolean dispatch_wglSwapIntervalEXT0(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WGLExtImpl", name = "isExtensionAvailable", descriptor = "(Ljava/lang/String;)Z")
	@Override
	public boolean method5126(@OriginalArg(0) String arg0) {
		return this.aGLContext_Sub1_Sub2_1.isExtensionAvailable(arg0);
	}
}
