package com.sun.opengl.impl;

import com.sun.gluegen.runtime.Class184;
import com.sun.gluegen.runtime.Class192;
import java.lang.reflect.Method;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.AccessController;
import java.security.PrivilegedAction;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("gl!com/sun/opengl/impl/JAWT_DrawingSurfaceInfo")
public abstract class JAWT_DrawingSurfaceInfo {

	@OriginalMember(owner = "gl!com/sun/opengl/impl/JAWT_DrawingSurfaceInfo", name = "platformInfoFactoryMethod", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod6;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/JAWT_DrawingSurfaceInfo", name = "accessor", descriptor = "Lgl!com/sun/gluegen/runtime/StructAccessor;")
	private Class192 aClass192_9;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/JAWT_DrawingSurfaceInfo", name = "create", descriptor = "(Ljava/nio/ByteBuffer;)Lgl!com/sun/opengl/impl/JAWT_DrawingSurfaceInfo;")
	public static JAWT_DrawingSurfaceInfo method4589(@OriginalArg(0) ByteBuffer arg0) {
		return Class184.method4481() ? new JAWT_DrawingSurfaceInfo_Sub1(arg0) : new JAWT_DrawingSurfaceInfo_Sub2(arg0);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/JAWT_DrawingSurfaceInfo", name = "newPlatformInfo", descriptor = "(Ljava/nio/ByteBuffer;)Lgl!com/sun/opengl/impl/JAWT_PlatformInfo;")
	private static Interface8 method4592(@OriginalArg(0) ByteBuffer arg0) {
		if (aMethod6 == null) {
			@Pc(7) String local7 = (String) AccessController.doPrivileged(new PrivilegedAction() {

				@OriginalMember(owner = "gl!com/sun/opengl/impl/JAWT_DrawingSurfaceInfo$1", name = "run", descriptor = "()Ljava/lang/Object;")
				@Override
				public Object run() {
					return System.getProperty("os.name").toLowerCase();
				}
			});
			try {
				@Pc(14) Class local14;
				if (local7.startsWith("wind")) {
					local14 = Class.forName("com.sun.opengl.impl.windows.Class201");
				} else if (local7.startsWith("mac os x")) {
					local14 = Class.forName("com.sun.opengl.impl.macosx.Class199");
				} else {
					local14 = Class.forName("com.sun.opengl.impl.x11.JAWT_X11DrawingSurfaceInfo");
				}
				aMethod6 = local14.getMethod("create", ByteBuffer.class);
			} catch (@Pc(45) Exception local45) {
				throw new RuntimeException(local45);
			}
		}
		try {
			return (Interface8) aMethod6.invoke(null, arg0);
		} catch (@Pc(62) Exception local62) {
			throw new RuntimeException(local62);
		}
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/JAWT_DrawingSurfaceInfo", name = "<init>", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public JAWT_DrawingSurfaceInfo(@OriginalArg(0) ByteBuffer arg0) {
		this.aClass192_9 = new Class192(arg0);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/JAWT_DrawingSurfaceInfo", name = "getBuffer", descriptor = "()Ljava/nio/ByteBuffer;")
	public final ByteBuffer method4590() {
		return this.aClass192_9.method4500();
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/JAWT_DrawingSurfaceInfo", name = "platformInfo", descriptor = "()Lgl!com/sun/opengl/impl/JAWT_PlatformInfo;")
	public final Interface8 method4591() {
		return method4592(this.platformInfo0(this.method4590()));
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/JAWT_DrawingSurfaceInfo", name = "platformInfo0", descriptor = "(Ljava/nio/Buffer;)Ljava/nio/ByteBuffer;")
	private native ByteBuffer platformInfo0(@OriginalArg(0) Buffer arg0);
}
