package com.sun.opengl.impl.windows;

import com.sun.opengl.impl.GLDrawableFactory_Sub1;
import java.awt.Component;
import javax.media.opengl.DefaultGLCapabilitiesChooser;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLCapabilitiesChooser;
import javax.media.opengl.GLDrawable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gl!com/sun/opengl/impl/windows/WindowsGLDrawableFactory")
public final class GLDrawableFactory_Sub1_Sub2 extends GLDrawableFactory_Sub1 {

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WindowsGLDrawableFactory", name = "getGLDrawable", descriptor = "(Ljava/lang/Object;Lgl!javax/media/opengl/GLCapabilities;Lgl!javax/media/opengl/GLCapabilitiesChooser;)Lgl!javax/media/opengl/GLDrawable;")
	@Override
	public GLDrawable getGLDrawable(@OriginalArg(0) Object arg0, @OriginalArg(1) GLCapabilities arg1, @OriginalArg(2) GLCapabilitiesChooser arg2) {
		if (arg0 == null) {
			throw new IllegalArgumentException("Null target");
		} else if (arg0 instanceof Component) {
			if (arg1 == null) {
				arg1 = new GLCapabilities();
			}
			if (arg2 == null) {
				arg2 = new DefaultGLCapabilitiesChooser();
			}
			return new Class195_Sub2_Sub2((Component) arg0, arg1, arg2);
		} else {
			throw new IllegalArgumentException("GLDrawables not supported for objects of type " + arg0.getClass().getName() + " (only Components are supported in this implementation)");
		}
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/windows/WindowsGLDrawableFactory", name = "dynamicLookupFunction", descriptor = "(Ljava/lang/String;)J")
	@Override
	public long dynamicLookupFunction(@OriginalArg(0) String arg0) {
		return WGL.wglGetProcAddress(arg0);
	}
}
