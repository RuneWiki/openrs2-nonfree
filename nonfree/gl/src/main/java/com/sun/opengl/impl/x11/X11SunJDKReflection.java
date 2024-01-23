package com.sun.opengl.impl.x11;

import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.PrivilegedAction;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("gl!com/sun/opengl/impl/x11/X11SunJDKReflection")
public final class X11SunJDKReflection {

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11SunJDKReflection", name = "x11GraphicsDeviceClass", descriptor = "Ljava/lang/Class;")
	private static Class x11GraphicsDeviceClass;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11SunJDKReflection", name = "x11GraphicsDeviceGetScreenMethod", descriptor = "Ljava/lang/reflect/Method;")
	private static Method x11GraphicsDeviceGetScreenMethod;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11SunJDKReflection", name = "x11GraphicsConfigClass", descriptor = "Ljava/lang/Class;")
	private static Class x11GraphicsConfigClass;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11SunJDKReflection", name = "x11GraphicsConfigGetVisualMethod", descriptor = "Ljava/lang/reflect/Method;")
	private static Method x11GraphicsConfigGetVisualMethod;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11SunJDKReflection", name = "initted", descriptor = "Z")
	private static boolean initted;

	static {
		AccessController.doPrivileged(new PrivilegedAction() {

			@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11SunJDKReflection$1", name = "run", descriptor = "()Ljava/lang/Object;")
			@Override
			public Object run() {
				try {
					X11SunJDKReflection.x11GraphicsDeviceClass = Class.forName("sun.awt.X11GraphicsDevice");
					X11SunJDKReflection.x11GraphicsDeviceGetScreenMethod = X11SunJDKReflection.x11GraphicsDeviceClass.getDeclaredMethod("getScreen");
					X11SunJDKReflection.x11GraphicsDeviceGetScreenMethod.setAccessible(true);
					X11SunJDKReflection.x11GraphicsConfigClass = Class.forName("sun.awt.X11GraphicsConfig");
					X11SunJDKReflection.x11GraphicsConfigGetVisualMethod = X11SunJDKReflection.x11GraphicsConfigClass.getDeclaredMethod("getVisual");
					X11SunJDKReflection.x11GraphicsConfigGetVisualMethod.setAccessible(true);
					X11SunJDKReflection.initted = true;
				} catch (@Pc(32) Exception local32) {
				}
				return null;
			}
		});
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11SunJDKReflection", name = "graphicsDeviceGetScreen", descriptor = "(Ljava/awt/GraphicsDevice;)I")
	public static int graphicsDeviceGetScreen(@OriginalArg(0) GraphicsDevice arg0) {
		if (!initted) {
			return 0;
		}
		try {
			return (Integer) x11GraphicsDeviceGetScreenMethod.invoke(arg0);
		} catch (@Pc(12) Exception local12) {
			return 0;
		}
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11SunJDKReflection", name = "graphicsConfigurationGetVisualID", descriptor = "(Ljava/awt/GraphicsConfiguration;)I")
	public static int graphicsConfigurationGetVisualID(@OriginalArg(0) GraphicsConfiguration arg0) {
		if (!initted) {
			return 0;
		}
		try {
			return (Integer) x11GraphicsConfigGetVisualMethod.invoke(arg0);
		} catch (@Pc(12) Exception local12) {
			return 0;
		}
	}
}
