package com.sun.opengl.impl.x11;

import com.sun.gluegen.runtime.Class183;
import com.sun.gluegen.runtime.Class184;
import com.sun.gluegen.runtime.Class192;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gl!com/sun/opengl/impl/x11/XVisualInfo")
public abstract class XVisualInfo {

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/XVisualInfo", name = "accessor", descriptor = "Lgl!com/sun/gluegen/runtime/StructAccessor;")
	protected Class192 accessor;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/XVisualInfo", name = "size", descriptor = "()I")
	public static int size() {
		return Class184.method4338() ? XVisualInfo32.size() : XVisualInfo64.size();
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/XVisualInfo", name = "create", descriptor = "()Lgl!com/sun/opengl/impl/x11/XVisualInfo;")
	public static XVisualInfo create() {
		return create(Class183.method4330(size()));
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/XVisualInfo", name = "create", descriptor = "(Ljava/nio/ByteBuffer;)Lgl!com/sun/opengl/impl/x11/XVisualInfo;")
	public static XVisualInfo create(@OriginalArg(0) ByteBuffer arg0) {
		return Class184.method4338() ? new XVisualInfo32(arg0) : new XVisualInfo64(arg0);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/XVisualInfo", name = "<init>", descriptor = "(Ljava/nio/ByteBuffer;)V")
	public XVisualInfo(@OriginalArg(0) ByteBuffer arg0) {
		this.accessor = new Class192(arg0);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/XVisualInfo", name = "getBuffer", descriptor = "()Ljava/nio/ByteBuffer;")
	public final ByteBuffer getBuffer() {
		return this.accessor.method4357();
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/XVisualInfo", name = "visualid", descriptor = "(J)Lgl!com/sun/opengl/impl/x11/XVisualInfo;")
	public abstract XVisualInfo visualid(@OriginalArg(0) long arg0);
}
