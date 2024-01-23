package com.sun.opengl.impl.x11;

import com.sun.gluegen.runtime.Class191;
import com.sun.opengl.impl.GLDrawableFactory_Sub1;
import com.sun.opengl.impl.JAWT;
import java.awt.Component;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLCapabilitiesChooser;
import javax.media.opengl.GLDrawable;
import javax.media.opengl.GLException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("gl!com/sun/opengl/impl/x11/X11GLDrawableFactory")
public final class X11GLDrawableFactory extends GLDrawableFactory_Sub1 {

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11GLDrawableFactory", name = "staticDisplay", descriptor = "J")
	private static long staticDisplay;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11GLDrawableFactory", name = "checkedMultisample", descriptor = "Z")
	private static boolean checkedMultisample;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11GLDrawableFactory", name = "multisampleAvailable", descriptor = "Z")
	private static boolean multisampleAvailable;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11GLDrawableFactory", name = "visualToGLCapsMap", descriptor = "Ljava/util/Map;")
	private static Map visualToGLCapsMap = Collections.synchronizedMap(new HashMap());

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11GLDrawableFactory", name = "isHeadless", descriptor = "Z")
	private static boolean isHeadless = GraphicsEnvironment.isHeadless();

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11GLDrawableFactory", name = "checkedXinerama", descriptor = "Z")
	private boolean checkedXinerama;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11GLDrawableFactory", name = "xineramaEnabled", descriptor = "Z")
	private boolean xineramaEnabled;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11GLDrawableFactory", name = "getDisplayConnection", descriptor = "()J")
	private static long getDisplayConnection() {
		if (staticDisplay == 0L) {
			getX11Factory().lockToolkit();
			try {
				staticDisplay = GLX.XOpenDisplay(null);
			} finally {
				getX11Factory().unlockToolkit();
			}
			if (staticDisplay == 0L) {
				throw new GLException("Unable to open default display, needed for visual selection and offscreen surface handling");
			}
		}
		return staticDisplay;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11GLDrawableFactory", name = "getX11Factory", descriptor = "()Lgl!com/sun/opengl/impl/x11/X11GLDrawableFactory;")
	public static X11GLDrawableFactory getX11Factory() {
		return (X11GLDrawableFactory) getFactory();
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11GLDrawableFactory", name = "<init>", descriptor = "()V")
	public X11GLDrawableFactory() {
		Class191.method4356(GLX.getGLXProcAddressTable(), this);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11GLDrawableFactory", name = "getGLDrawable", descriptor = "(Ljava/lang/Object;Lgl!javax/media/opengl/GLCapabilities;Lgl!javax/media/opengl/GLCapabilitiesChooser;)Lgl!javax/media/opengl/GLDrawable;")
	@Override
	public GLDrawable getGLDrawable(@OriginalArg(0) Object arg0, @OriginalArg(1) GLCapabilities arg1, @OriginalArg(2) GLCapabilitiesChooser arg2) {
		if (arg0 == null) {
			throw new IllegalArgumentException("Null target");
		} else if (arg0 instanceof Component) {
			@Pc(28) Component local28 = (Component) arg0;
			@Pc(33) X11OnscreenGLDrawable local33 = new X11OnscreenGLDrawable(local28);
			@Pc(36) GraphicsConfiguration local36 = local28.getGraphicsConfiguration();
			if (local36 == null) {
				throw new IllegalArgumentException("GLDrawableFactory.chooseGraphicsConfiguration() was not used when creating this Component");
			}
			@Pc(46) int local46 = X11SunJDKReflection.graphicsConfigurationGetVisualID(local36);
			@Pc(51) int local51;
			if (this.isXineramaEnabled()) {
				local51 = 0;
			} else {
				local51 = X11SunJDKReflection.graphicsDeviceGetScreen(local36.getDevice());
			}
			local33.setChosenGLCapabilities((GLCapabilities) visualToGLCapsMap.get(new X11GLDrawableFactory.ScreenAndVisualIDKey(local51, (long) local46)));
			return local33;
		} else {
			throw new IllegalArgumentException("GLDrawables not supported for objects of type " + arg0.getClass().getName() + " (only Components are supported in this implementation)");
		}
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11GLDrawableFactory", name = "dynamicLookupFunction", descriptor = "(Ljava/lang/String;)J")
	@Override
	public long dynamicLookupFunction(@OriginalArg(0) String arg0) {
		return GLX.glXGetProcAddressARB(arg0);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11GLDrawableFactory", name = "lockToolkit", descriptor = "()V")
	public void lockToolkit() {
		if (!isHeadless) {
			JAWT.method4416().method4414();
		}
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11GLDrawableFactory", name = "unlockToolkit", descriptor = "()V")
	public void unlockToolkit() {
		if (!isHeadless) {
			JAWT.method4416().method4415();
		}
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11GLDrawableFactory", name = "isXineramaEnabled", descriptor = "()Z")
	private synchronized boolean isXineramaEnabled() {
		if (!this.checkedXinerama) {
			this.checkedXinerama = true;
			this.lockToolkit();
			@Pc(9) long local9 = getDisplayConnection();
			this.xineramaEnabled = GLX.XineramaEnabled(local9);
			this.unlockToolkit();
		}
		return this.xineramaEnabled;
	}

	@OriginalClass("gl!com/sun/opengl/impl/x11/X11GLDrawableFactory$ScreenAndVisualIDKey")
	static class ScreenAndVisualIDKey {

		@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11GLDrawableFactory$ScreenAndVisualIDKey", name = "screen", descriptor = "I")
		private int screen;

		@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11GLDrawableFactory$ScreenAndVisualIDKey", name = "visualID", descriptor = "J")
		private long visualID;

		@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11GLDrawableFactory$ScreenAndVisualIDKey", name = "<init>", descriptor = "(IJ)V")
		public ScreenAndVisualIDKey(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
			this.screen = arg0;
			this.visualID = arg1;
		}

		@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11GLDrawableFactory$ScreenAndVisualIDKey", name = "hashCode", descriptor = "()I")
		@Override
		public int hashCode() {
			return (int) ((long) this.screen + this.visualID * 13L);
		}

		@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11GLDrawableFactory$ScreenAndVisualIDKey", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
		@Override
		public boolean equals(@OriginalArg(0) Object arg0) {
			if (arg0 != null && arg0 instanceof X11GLDrawableFactory.ScreenAndVisualIDKey) {
				@Pc(9) X11GLDrawableFactory.ScreenAndVisualIDKey local9 = (X11GLDrawableFactory.ScreenAndVisualIDKey) arg0;
				return this.screen == local9.screen && this.visualID == local9.visualID;
			} else {
				return false;
			}
		}
	}
}
