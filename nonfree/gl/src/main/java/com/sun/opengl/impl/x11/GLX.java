package com.sun.opengl.impl.x11;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GLException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("gl!com/sun/opengl/impl/x11/GLX")
public final class GLX {

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/GLX", name = "glxProcAddressTable", descriptor = "Lgl!com/sun/opengl/impl/x11/GLXProcAddressTable;")
	private static GLXProcAddressTable glxProcAddressTable = new GLXProcAddressTable();

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/GLX", name = "XGetVisualInfo1", descriptor = "(JJLjava/nio/ByteBuffer;Ljava/lang/Object;I)Ljava/nio/ByteBuffer;")
	private static native ByteBuffer XGetVisualInfo1(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1, @OriginalArg(2) ByteBuffer arg2, @OriginalArg(3) Object arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/GLX", name = "XGetVisualInfo", descriptor = "(JJLgl!com/sun/opengl/impl/x11/XVisualInfo;[II)[Lgl!com/sun/opengl/impl/x11/XVisualInfo;")
	public static XVisualInfo[] XGetVisualInfo(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1, @OriginalArg(2) XVisualInfo arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4) {
		if (arg3 != null && arg3.length <= arg4) {
			throw new GLException("array offset argument \"arg3_offset\" (" + arg4 + ") equals or exceeds array length (" + arg3.length + ")");
		}
		@Pc(38) ByteBuffer local38 = XGetVisualInfo1(arg0, arg1, arg2 == null ? null : arg2.getBuffer(), arg3, arg4 * 4);
		if (local38 == null) {
			return null;
		}
		local38.order(ByteOrder.nativeOrder());
		@Pc(51) XVisualInfo[] local51 = new XVisualInfo[getFirstElement(arg3, arg4)];
		for (@Pc(53) int local53 = 0; local53 < getFirstElement(arg3, arg4); local53++) {
			local38.position(local53 * XVisualInfo.size());
			local38.limit((local53 + 1) * XVisualInfo.size());
			@Pc(75) ByteBuffer local75 = local38.slice();
			local75.order(ByteOrder.nativeOrder());
			local38.position(0);
			local38.limit(local38.capacity());
			local51[local53] = XVisualInfo.create(local75);
		}
		return local51;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/GLX", name = "XOpenDisplay", descriptor = "(Ljava/lang/String;)J")
	public static native long XOpenDisplay(@OriginalArg(0) String arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/GLX", name = "XineramaEnabled", descriptor = "(J)Z")
	public static native boolean XineramaEnabled(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/GLX", name = "glXCreateContext", descriptor = "(JLgl!com/sun/opengl/impl/x11/XVisualInfo;JZ)J")
	public static long glXCreateContext(@OriginalArg(0) long arg0, @OriginalArg(1) XVisualInfo arg1, @OriginalArg(2) long arg2, @OriginalArg(3) boolean arg3) {
		return glXCreateContext0(arg0, arg1 == null ? null : arg1.getBuffer(), arg2, arg3);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/GLX", name = "glXCreateContext0", descriptor = "(JLjava/nio/ByteBuffer;JZ)J")
	private static native long glXCreateContext0(@OriginalArg(0) long arg0, @OriginalArg(1) ByteBuffer arg1, @OriginalArg(2) long arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/GLX", name = "glXDestroyContext", descriptor = "(JJ)V")
	public static native void glXDestroyContext(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/GLX", name = "glXGetClientString", descriptor = "(JI)Ljava/lang/String;")
	private static native String glXGetClientString(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/GLX", name = "glXGetConfig1", descriptor = "(JLjava/nio/ByteBuffer;ILjava/lang/Object;I)I")
	private static native int glXGetConfig1(@OriginalArg(0) long arg0, @OriginalArg(1) ByteBuffer arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Object arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/GLX", name = "glXGetProcAddressARB", descriptor = "(Ljava/lang/String;)J")
	public static native long glXGetProcAddressARB(@OriginalArg(0) String arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/GLX", name = "glXMakeCurrent", descriptor = "(JJJ)Z")
	public static native boolean glXMakeCurrent(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1, @OriginalArg(2) long arg2);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/GLX", name = "glXQueryExtensionsString", descriptor = "(JI)Ljava/lang/String;")
	public static native String glXQueryExtensionsString(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/GLX", name = "glXSwapBuffers", descriptor = "(JJ)V")
	public static native void glXSwapBuffers(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/GLX", name = "getGLXProcAddressTable", descriptor = "()Lgl!com/sun/opengl/impl/x11/GLXProcAddressTable;")
	public static GLXProcAddressTable getGLXProcAddressTable() {
		return glxProcAddressTable;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/GLX", name = "DefaultScreen", descriptor = "(J)I")
	public static native int DefaultScreen(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/GLX", name = "getFirstElement", descriptor = "([II)I")
	private static int getFirstElement(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		return arg0[arg1];
	}
}
