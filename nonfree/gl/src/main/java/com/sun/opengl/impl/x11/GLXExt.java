package com.sun.opengl.impl.x11;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gl!com/sun/opengl/impl/x11/GLXExt")
public interface GLXExt {

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/GLXExt", name = "glXSwapIntervalSGI", descriptor = "(I)I")
	int glXSwapIntervalSGI(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/GLXExt", name = "isExtensionAvailable", descriptor = "(Ljava/lang/String;)Z")
	boolean isExtensionAvailable(@OriginalArg(0) String arg0);
}
