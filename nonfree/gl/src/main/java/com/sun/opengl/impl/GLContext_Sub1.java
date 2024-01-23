package com.sun.opengl.impl;

import com.sun.gluegen.runtime.Class191;
import javax.media.opengl.GL;
import javax.media.opengl.GLContext;
import javax.media.opengl.GLException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("gl!com/sun/opengl/impl/GLContextImpl")
public abstract class GLContext_Sub1 extends GLContext {

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLContextImpl", name = "glProcAddressTable", descriptor = "Lgl!com/sun/opengl/impl/GLProcAddressTable;")
	private Class196 glProcAddressTable;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLContextImpl", name = "gl", descriptor = "Lgl!javax/media/opengl/GL;")
	private GL gl;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLContextImpl", name = "functionAvailability", descriptor = "Lgl!com/sun/opengl/impl/FunctionAvailabilityCache;")
	private Class193 functionAvailability = new Class193(this);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLContextImpl", name = "toHexString", descriptor = "(J)Ljava/lang/String;")
	public static String toHexString(@OriginalArg(0) long arg0) {
		return "0x" + Long.toHexString(arg0);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLContextImpl", name = "<init>", descriptor = "()V")
	protected GLContext_Sub1() {
		this.setGL(this.createGL());
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLContextImpl", name = "makeCurrent", descriptor = "()I")
	@Override
	public final int makeCurrent() throws GLException {
		@Pc(1) GLContext local1 = getCurrent();
		if (local1 == this) {
			this.update();
			return 1;
		}
		if (local1 != null) {
			local1.release();
		}
		@Pc(15) int local15 = this.makeCurrentImpl();
		if (local15 != 0) {
			setCurrent(this);
		}
		return local15;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLContextImpl", name = "makeCurrentImpl", descriptor = "()I")
	protected abstract int makeCurrentImpl() throws GLException;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLContextImpl", name = "release", descriptor = "()V")
	@Override
	public final void release() throws GLException {
		setCurrent(null);
		this.releaseImpl();
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLContextImpl", name = "releaseImpl", descriptor = "()V")
	protected abstract void releaseImpl() throws GLException;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLContextImpl", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		this.destroyImpl();
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLContextImpl", name = "destroyImpl", descriptor = "()V")
	protected abstract void destroyImpl() throws GLException;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLContextImpl", name = "update", descriptor = "()V")
	protected void update() throws GLException {
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLContextImpl", name = "getGL", descriptor = "()Lgl!javax/media/opengl/GL;")
	@Override
	public final GL getGL() {
		return this.gl;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLContextImpl", name = "setGL", descriptor = "(Lgl!javax/media/opengl/GL;)V")
	private void setGL(@OriginalArg(0) GL arg0) {
		this.gl = arg0;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLContextImpl", name = "createGL", descriptor = "()Lgl!javax/media/opengl/GL;")
	private GL createGL() {
		return new GLImpl(this);
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLContextImpl", name = "getGLProcAddressTable", descriptor = "()Lgl!com/sun/opengl/impl/GLProcAddressTable;")
	public final Class196 getGLProcAddressTable() {
		if (this.glProcAddressTable == null) {
			this.glProcAddressTable = new Class196();
		}
		return this.glProcAddressTable;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLContextImpl", name = "setSwapInterval", descriptor = "(I)V")
	public abstract void setSwapInterval(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLContextImpl", name = "mapToRealGLExtensionName", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	protected abstract String mapToRealGLExtensionName(@OriginalArg(0) String arg0);

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLContextImpl", name = "getPlatformExtensionsString", descriptor = "()Ljava/lang/String;")
	public abstract String getPlatformExtensionsString();

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLContextImpl", name = "resetProcAddressTable", descriptor = "(Ljava/lang/Object;)V")
	protected final void resetProcAddressTable(@OriginalArg(0) Object arg0) {
		Class191.method4886(arg0, GLDrawableFactory_Sub1.getFactoryImpl());
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLContextImpl", name = "resetGLFunctionAvailability", descriptor = "()V")
	protected void resetGLFunctionAvailability() {
		this.setGL(this.createGL());
		this.functionAvailability.method4902();
		this.resetProcAddressTable(this.getGLProcAddressTable());
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/GLContextImpl", name = "isExtensionAvailable", descriptor = "(Ljava/lang/String;)Z")
	public boolean isExtensionAvailable(@OriginalArg(0) String arg0) {
		return this.functionAvailability.method4903(this.mapToRealGLExtensionName(arg0));
	}
}
