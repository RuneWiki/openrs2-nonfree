package com.sun.opengl.impl.windows;

import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gl!com/sun/opengl/impl/windows/WGL")
public final class WGL {

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WGL", name = "ChoosePixelFormat", descriptor = "(JLgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;)I")
	public static int method4727(@OriginalArg(0) long arg0, @OriginalArg(1) Class202 arg1) {
		return ChoosePixelFormat0(arg0, arg1 == null ? null : arg1.method4697());
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WGL", name = "ChoosePixelFormat0", descriptor = "(JLjava/nio/ByteBuffer;)I")
	private static native int ChoosePixelFormat0(@OriginalArg(0) long arg0, @OriginalArg(1) ByteBuffer arg1);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WGL", name = "CreateDummyWindow", descriptor = "(IIII)J")
	public static native long CreateDummyWindow(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WGL", name = "DescribePixelFormat", descriptor = "(JIILgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;)I")
	public static int method4728(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class202 arg3) {
		return DescribePixelFormat0(arg0, arg1, arg2, arg3 == null ? null : arg3.method4697());
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WGL", name = "DescribePixelFormat0", descriptor = "(JIILjava/nio/ByteBuffer;)I")
	private static native int DescribePixelFormat0(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) ByteBuffer arg3);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WGL", name = "DestroyWindow", descriptor = "(J)Z")
	public static native boolean DestroyWindow(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WGL", name = "GetDC", descriptor = "(J)J")
	public static native long GetDC(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WGL", name = "GetLastError", descriptor = "()I")
	public static native int GetLastError();

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WGL", name = "GetPixelFormat", descriptor = "(J)I")
	public static native int GetPixelFormat(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WGL", name = "ReleaseDC", descriptor = "(JJ)I")
	public static native int ReleaseDC(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WGL", name = "SetPixelFormat", descriptor = "(JILgl!com/sun/opengl/impl/windows/PIXELFORMATDESCRIPTOR;)Z")
	public static boolean method4729(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class202 arg2) {
		return SetPixelFormat0(arg0, arg1, arg2 == null ? null : arg2.method4697());
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WGL", name = "SetPixelFormat0", descriptor = "(JILjava/nio/ByteBuffer;)Z")
	private static native boolean SetPixelFormat0(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) ByteBuffer arg2);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WGL", name = "ShowWindow", descriptor = "(JI)Z")
	public static native boolean ShowWindow(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WGL", name = "SwapBuffers", descriptor = "(J)Z")
	public static native boolean SwapBuffers(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WGL", name = "wglCreateContext", descriptor = "(J)J")
	public static native long wglCreateContext(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WGL", name = "wglDeleteContext", descriptor = "(J)Z")
	public static native boolean wglDeleteContext(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WGL", name = "wglGetProcAddress", descriptor = "(Ljava/lang/String;)J")
	public static native long wglGetProcAddress(@OriginalArg(0) String arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WGL", name = "wglMakeCurrent", descriptor = "(JJ)Z")
	public static native boolean wglMakeCurrent(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1);
}
