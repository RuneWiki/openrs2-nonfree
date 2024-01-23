package com.sun.opengl.impl.macosx;

import javax.media.opengl.GLException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gl!com/sun/opengl/impl/macosx/CGL")
public final class CGL {

	@OriginalMember(owner = "gl!com/sun/opengl/impl/macosx/CGL", name = "clearCurrentContext", descriptor = "(J)Z")
	public static native boolean clearCurrentContext(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/macosx/CGL", name = "createContext1", descriptor = "(JJJLjava/lang/Object;I)J")
	private static native long createContext1(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1, @OriginalArg(2) long arg2, @OriginalArg(3) Object arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/macosx/CGL", name = "createContext", descriptor = "(JJJ[II)J")
	public static long method4678(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int[] arg3) {
		if (arg3 != null && arg3.length <= 0) {
			throw new GLException("array offset argument \"viewNotReady_offset\" (" + ") equals or exceeds array length (" + arg3.length + ")");
		}
		return createContext1(arg0, arg1, arg2, arg3, 0);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/macosx/CGL", name = "createPixelFormat1", descriptor = "(Ljava/lang/Object;IILjava/lang/Object;I)J")
	private static native long createPixelFormat1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Object arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/macosx/CGL", name = "createPixelFormat", descriptor = "([III[II)J")
	public static long method4679(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		if (arg0 != null && arg0.length <= 0) {
			throw new GLException("array offset argument \"iattrs_offset\" (" + ") equals or exceeds array length (" + arg0.length + ")");
		} else if (arg2 == null || arg2.length > 0) {
			return createPixelFormat1(arg0, 0, arg1, arg2, 0);
		} else {
			throw new GLException("array offset argument \"ivalues_offset\" (" + ") equals or exceeds array length (" + arg2.length + ")");
		}
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/macosx/CGL", name = "deleteContext", descriptor = "(J)Z")
	public static native boolean deleteContext(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/macosx/CGL", name = "deletePixelFormat", descriptor = "(J)V")
	public static native void deletePixelFormat(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/macosx/CGL", name = "flushBuffer", descriptor = "(J)Z")
	public static native boolean flushBuffer(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/macosx/CGL", name = "getProcAddress", descriptor = "(Ljava/lang/String;)J")
	public static native long getProcAddress(@OriginalArg(0) String arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/macosx/CGL", name = "makeCurrentContext", descriptor = "(J)Z")
	public static native boolean makeCurrentContext(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/macosx/CGL", name = "queryPixelFormat1", descriptor = "(JLjava/lang/Object;IILjava/lang/Object;I)V")
	private static native void queryPixelFormat1(@OriginalArg(0) long arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Object arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/macosx/CGL", name = "queryPixelFormat", descriptor = "(J[III[II)V")
	public static void method4680(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg1 != null && arg1.length <= 0) {
			throw new GLException("array offset argument \"iattrs_offset\" (" + ") equals or exceeds array length (" + arg1.length + ")");
		} else if (arg3 == null || arg3.length > 0) {
			queryPixelFormat1(arg0, arg1, 0, arg2, arg3, 0);
		} else {
			throw new GLException("array offset argument \"ivalues_offset\" (" + ") equals or exceeds array length (" + arg3.length + ")");
		}
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/macosx/CGL", name = "setSwapInterval", descriptor = "(JI)V")
	public static native void setSwapInterval(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/macosx/CGL", name = "updateContext", descriptor = "(J)V")
	public static native void updateContext(@OriginalArg(0) long arg0);
}
