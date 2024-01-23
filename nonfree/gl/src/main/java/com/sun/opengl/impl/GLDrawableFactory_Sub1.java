package com.sun.opengl.impl;

import com.sun.gluegen.runtime.Interface7;
import javax.media.opengl.GLDrawableFactory;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gl!com/sun/opengl/impl/GLDrawableFactoryImpl")
public abstract class GLDrawableFactory_Sub1 extends GLDrawableFactory implements Interface7 {

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLDrawableFactoryImpl", name = "getFactoryImpl", descriptor = "()Lgl!com/sun/opengl/impl/GLDrawableFactoryImpl;")
	public static GLDrawableFactory_Sub1 getFactoryImpl() {
		return (GLDrawableFactory_Sub1) getFactory();
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLDrawableFactoryImpl", name = "dynamicLookupFunction", descriptor = "(Ljava/lang/String;)J")
	public abstract long dynamicLookupFunction(@OriginalArg(0) String arg0);
}
