package com.sun.opengl.impl.windows;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gl!com/sun/opengl/impl/windows/WGLExt")
public interface Interface9 {

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WGLExt", name = "wglChoosePixelFormatARB", descriptor = "(J[II[FII[II[II)Z")
	boolean method4735(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) float[] arg2, @OriginalArg(6) int[] arg3, @OriginalArg(8) int[] arg4);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WGLExt", name = "wglGetExtensionsStringEXT", descriptor = "()Ljava/lang/String;")
	String method4736();

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WGLExt", name = "wglGetPixelFormatAttribivARB", descriptor = "(JIII[II[II)Z")
	boolean method4737(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(6) int[] arg4);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WGLExt", name = "wglSwapIntervalEXT", descriptor = "(I)Z")
	boolean method4738(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WGLExt", name = "isExtensionAvailable", descriptor = "(Ljava/lang/String;)Z")
	boolean method4739(@OriginalArg(0) String arg0);
}
