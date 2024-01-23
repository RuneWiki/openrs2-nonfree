package com.sun.opengl.impl.x11;

import com.sun.opengl.impl.GLContext_Sub1;
import com.sun.opengl.impl.GLDrawableFactory_Sub1;
import java.util.HashMap;
import java.util.Map;
import javax.media.opengl.GLException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("gl!com/sun/opengl/impl/x11/X11GLContext")
public abstract class X11GLContext extends GLContext_Sub1 {

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11GLContext", name = "functionNameMap", descriptor = "Ljava/util/Map;")
	private static final Map functionNameMap = new HashMap();

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11GLContext", name = "context", descriptor = "J")
	private long context;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11GLContext", name = "glXQueryExtensionsStringInitialized", descriptor = "Z")
	private boolean glXQueryExtensionsStringInitialized;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11GLContext", name = "glXQueryExtensionsStringAvailable", descriptor = "Z")
	private boolean glXQueryExtensionsStringAvailable;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11GLContext", name = "glXExt", descriptor = "Lgl!com/sun/opengl/impl/x11/GLXExt;")
	private GLXExt glXExt;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11GLContext", name = "glXExtProcAddressTable", descriptor = "Lgl!com/sun/opengl/impl/x11/GLXExtProcAddressTable;")
	private GLXExtProcAddressTable glXExtProcAddressTable;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11GLContext", name = "mostRecentDisplay", descriptor = "J")
	private long mostRecentDisplay;

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11GLContext", name = "drawable", descriptor = "Lgl!com/sun/opengl/impl/x11/X11GLDrawable;")
	private X11GLDrawable drawable;

	static {
		functionNameMap.put("glAllocateMemoryNV", "glXAllocateMemoryNV");
		functionNameMap.put("glFreeMemoryNV", "glXFreeMemoryNV");
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11GLContext", name = "<init>", descriptor = "(Lgl!com/sun/opengl/impl/x11/X11GLDrawable;)V")
	protected X11GLContext(@OriginalArg(0) X11GLDrawable arg0) {
		this.drawable = arg0;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11GLContext", name = "getGLXExt", descriptor = "()Lgl!com/sun/opengl/impl/x11/GLXExt;")
	private GLXExt getGLXExt() {
		if (this.glXExt == null) {
			this.glXExt = new GLXExtImpl(this);
		}
		return this.glXExt;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11GLContext", name = "mapToRealGLExtensionName", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	protected final String mapToRealGLExtensionName(@OriginalArg(0) String arg0) {
		return arg0;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11GLContext", name = "create", descriptor = "()V")
	protected abstract void create();

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11GLContext", name = "createContext", descriptor = "(Z)V")
	protected final void createContext(@OriginalArg(0) boolean arg0) {
		@Pc(4) XVisualInfo local4 = this.drawable.chooseVisual(arg0);
		@Pc(6) long local6 = 0L;
		this.context = GLX.glXCreateContext(this.drawable.getDisplay(), local4, local6, arg0);
		if (this.context == 0L) {
			throw new GLException("Unable to create OpenGL context");
		}
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11GLContext", name = "makeCurrentImpl", descriptor = "()I")
	@Override
	protected int makeCurrentImpl() throws GLException {
		@Pc(1) boolean local1 = false;
		if (this.context == 0L) {
			this.create();
			local1 = true;
		}
		if (!GLX.glXMakeCurrent(this.drawable.getDisplay(), this.drawable.getDrawable(), this.context)) {
			throw new GLException("Error making context current");
		}
		this.mostRecentDisplay = this.drawable.getDisplay();
		if (local1) {
			this.resetGLFunctionAvailability();
			return 2;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11GLContext", name = "releaseImpl", descriptor = "()V")
	@Override
	protected final void releaseImpl() throws GLException {
		this.lockToolkit();
		try {
			if (!GLX.glXMakeCurrent(this.mostRecentDisplay, 0L, 0L)) {
				throw new GLException("Error freeing OpenGL context");
			}
		} finally {
			this.unlockToolkit();
		}
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11GLContext", name = "destroyImpl", descriptor = "()V")
	@Override
	protected final void destroyImpl() throws GLException {
		this.lockToolkit();
		try {
			if (this.context != 0L) {
				GLX.glXDestroyContext(this.mostRecentDisplay, this.context);
				this.context = 0L;
				this.mostRecentDisplay = 0L;
			}
		} finally {
			this.unlockToolkit();
		}
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11GLContext", name = "resetGLFunctionAvailability", descriptor = "()V")
	@Override
	protected final void resetGLFunctionAvailability() {
		super.resetGLFunctionAvailability();
		this.resetProcAddressTable(this.getGLXExtProcAddressTable());
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11GLContext", name = "getGLXExtProcAddressTable", descriptor = "()Lgl!com/sun/opengl/impl/x11/GLXExtProcAddressTable;")
	public final GLXExtProcAddressTable getGLXExtProcAddressTable() {
		if (this.glXExtProcAddressTable == null) {
			this.glXExtProcAddressTable = new GLXExtProcAddressTable();
		}
		return this.glXExtProcAddressTable;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11GLContext", name = "getPlatformExtensionsString", descriptor = "()Ljava/lang/String;")
	@Override
	public final synchronized String getPlatformExtensionsString() {
		if (this.mostRecentDisplay == 0L) {
			throw new GLException("Context not current");
		}
		if (!this.glXQueryExtensionsStringInitialized) {
			this.glXQueryExtensionsStringAvailable = GLDrawableFactory_Sub1.getFactoryImpl().dynamicLookupFunction("glXQueryExtensionsString") != 0L;
			this.glXQueryExtensionsStringInitialized = true;
		}
		if (!this.glXQueryExtensionsStringAvailable) {
			return "";
		}
		this.lockToolkit();
		@Pc(38) String local38;
		try {
			local38 = GLX.glXQueryExtensionsString(this.mostRecentDisplay, GLX.DefaultScreen(this.mostRecentDisplay));
		} finally {
			this.unlockToolkit();
		}
		return local38;
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11GLContext", name = "setSwapInterval", descriptor = "(I)V")
	@Override
	public final void setSwapInterval(@OriginalArg(0) int arg0) {
		this.lockToolkit();
		try {
			@Pc(4) GLXExt local4 = this.getGLXExt();
			if (local4.isExtensionAvailable("GLX_SGI_swap_control")) {
				local4.glXSwapIntervalSGI(arg0);
			}
		} finally {
			this.unlockToolkit();
		}
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11GLContext", name = "lockToolkit", descriptor = "()V")
	private void lockToolkit() {
		X11GLDrawableFactory.getX11Factory().lockToolkit();
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/X11GLContext", name = "unlockToolkit", descriptor = "()V")
	private void unlockToolkit() {
		X11GLDrawableFactory.getX11Factory().unlockToolkit();
	}
}
