package jaggl;

import java.awt.Component;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.HashSet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("gl!jaggl/context")
public final class context {

	@OriginalMember(owner = "gl!jaggl/context", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "gl!jaggl/context", name = "extensionsString", descriptor = "Ljava/util/HashSet;")
	private HashSet extensionsString = null;

	@OriginalMember(owner = "gl!jaggl/context", name = "gl", descriptor = "Lgl!jaggl/opengl;")
	private opengl gl = new opengl(this);

	@OriginalMember(owner = "gl!jaggl/context", name = "<init>", descriptor = "()V")
	public context() {
		this.init(this.gl);
	}

	@OriginalMember(owner = "gl!jaggl/context", name = "getGL", descriptor = "()Lgl!jaggl/opengl;")
	public opengl getGL() {
		return this.gl;
	}

	@OriginalMember(owner = "gl!jaggl/context", name = "choosePixelFormat", descriptor = "(Ljava/awt/Component;II)Z")
	public boolean choosePixelFormat(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Boolean local9 = (Boolean) AccessController.doPrivileged(new PrivilegedAction() {

			@OriginalMember(owner = "gl!jaggl/context$2", name = "run", descriptor = "()Ljava/lang/Object;")
			@Override
			public Object run() {
				return context.this.choosePixelFormat1(arg0, arg1, arg2);
			}
		});
		return local9;
	}

	@OriginalMember(owner = "gl!jaggl/context", name = "createContext", descriptor = "()Z")
	public native boolean createContext();

	@OriginalMember(owner = "gl!jaggl/context", name = "releaseContext", descriptor = "()Z")
	public native boolean releaseContext();

	@OriginalMember(owner = "gl!jaggl/context", name = "destroy", descriptor = "()Z")
	public native boolean destroy();

	@OriginalMember(owner = "gl!jaggl/context", name = "swapBuffers", descriptor = "()Z")
	public native boolean swapBuffers();

	@OriginalMember(owner = "gl!jaggl/context", name = "getLastError", descriptor = "()I")
	public native int getLastError();

	@OriginalMember(owner = "gl!jaggl/context", name = "setSwapInterval", descriptor = "(I)V")
	public native void setSwapInterval(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "gl!jaggl/context", name = "getExtensionsString", descriptor = "()Ljava/lang/String;")
	private native String getExtensionsString();

	@OriginalMember(owner = "gl!jaggl/context", name = "isExtensionAvailable", descriptor = "(Ljava/lang/String;)Z")
	public boolean isExtensionAvailable(@OriginalArg(0) String arg0) {
		if (this.extensionsString == null) {
			@Pc(17) String local17 = this.gl.glGetString(7939) + " " + this.getExtensionsString();
			@Pc(21) String[] local21 = local17.split(" ");
			this.extensionsString = new HashSet(local21.length);
			for (@Pc(30) int local30 = 0; local30 < local21.length; local30++) {
				this.extensionsString.add(local21[local30]);
			}
		}
		return this.extensionsString.contains(arg0);
	}

	@OriginalMember(owner = "gl!jaggl/context", name = "makeCurrent", descriptor = "()Z")
	public boolean makeCurrent() {
		this.extensionsString = null;
		return this.makeCurrent1();
	}

	@OriginalMember(owner = "gl!jaggl/context", name = "getAlphaBits", descriptor = "()I")
	public native int getAlphaBits();

	@OriginalMember(owner = "gl!jaggl/context", name = "init", descriptor = "(Lgl!jaggl/opengl;)V")
	private native void init(@OriginalArg(0) opengl arg0);

	@OriginalMember(owner = "gl!jaggl/context", name = "choosePixelFormat1", descriptor = "(Ljava/awt/Component;II)Z")
	public native boolean choosePixelFormat1(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "gl!jaggl/context", name = "makeCurrent1", descriptor = "()Z")
	private native boolean makeCurrent1();
}
