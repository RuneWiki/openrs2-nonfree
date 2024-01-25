package jaggl;

import java.awt.Component;
import java.util.HashSet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaggl/context")
public final class context {

	@OriginalMember(owner = "client!jaggl/context", name = "c", descriptor = "Lclient!jaggl/context;")
	private static context c = null;

	@OriginalMember(owner = "client!jaggl/context", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!jaggl/context", name = "b", descriptor = "Ljava/util/HashSet;")
	private HashSet b = null;

	@OriginalMember(owner = "client!jaggl/context", name = "a", descriptor = "Lclient!jaggl/opengl;")
	private final opengl a = new opengl(this);

	@OriginalMember(owner = "client!jaggl/context", name = "getCurrentContext", descriptor = "()Lclient!jaggl/context;")
	private static context getCurrentContext() {
		return c;
	}

	@OriginalMember(owner = "client!jaggl/context", name = "<init>", descriptor = "()V")
	public context() {
		this.init(this.a);
	}

	@OriginalMember(owner = "client!jaggl/context", name = "swapBuffers", descriptor = "()Z")
	public native boolean swapBuffers();

	@OriginalMember(owner = "client!jaggl/context", name = "choosePixelFormat0", descriptor = "(Ljava/awt/Component;)Z")
	private native boolean choosePixelFormat0(@OriginalArg(0) Component arg0);

	@OriginalMember(owner = "client!jaggl/context", name = "deleteContext", descriptor = "()Z")
	private native boolean deleteContext();

	@OriginalMember(owner = "client!jaggl/context", name = "makeCurrent", descriptor = "()Z")
	public boolean makeCurrent() {
		this.b = null;
		@Pc(5) boolean local5 = this.makeCurrent1();
		if (local5) {
			c = this;
		}
		return local5;
	}

	@OriginalMember(owner = "client!jaggl/context", name = "releaseContext", descriptor = "()Z")
	public native boolean releaseContext();

	@OriginalMember(owner = "client!jaggl/context", name = "getLastError", descriptor = "()I")
	private native int getLastError();

	@OriginalMember(owner = "client!jaggl/context", name = "init", descriptor = "(Lclient!jaggl/opengl;)V")
	private native void init(@OriginalArg(0) opengl arg0);

	@OriginalMember(owner = "client!jaggl/context", name = "getAlphaBits", descriptor = "()I")
	private native int getAlphaBits();

	@OriginalMember(owner = "client!jaggl/context", name = "choosePixelFormat", descriptor = "(Ljava/awt/Component;II)Z")
	public boolean choosePixelFormat(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return this.choosePixelFormat1(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!jaggl/context", name = "createContext", descriptor = "()Z")
	public native boolean createContext();

	@OriginalMember(owner = "client!jaggl/context", name = "destroy", descriptor = "()Z")
	public native boolean destroy();

	@OriginalMember(owner = "client!jaggl/context", name = "choosePixelFormat", descriptor = "(Ljava/awt/Component;)Z")
	private boolean choosePixelFormat(@OriginalArg(0) Component arg0) {
		return this.choosePixelFormat0(arg0);
	}

	@OriginalMember(owner = "client!jaggl/context", name = "getGL", descriptor = "()Lclient!jaggl/opengl;")
	public opengl getGL() {
		return this.a;
	}

	@OriginalMember(owner = "client!jaggl/context", name = "setSwapInterval", descriptor = "(I)V")
	public native void setSwapInterval(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaggl/context", name = "getExtensionsString", descriptor = "()Ljava/lang/String;")
	private native String getExtensionsString();

	@OriginalMember(owner = "client!jaggl/context", name = "choosePixelFormat1", descriptor = "(Ljava/awt/Component;II)Z")
	private native boolean choosePixelFormat1(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!jaggl/context", name = "makeCurrent1", descriptor = "()Z")
	private native boolean makeCurrent1();

	@OriginalMember(owner = "client!jaggl/context", name = "isExtensionAvailable", descriptor = "(Ljava/lang/String;)Z")
	public boolean isExtensionAvailable(@OriginalArg(0) String arg0) {
		if (this.b == null) {
			@Pc(18) String local18 = this.a.glGetString(7939) + " " + this.getExtensionsString();
			@Pc(22) String[] local22 = local18.split(" ");
			this.b = new HashSet(local22.length);
			for (@Pc(31) int local31 = 0; local31 < local22.length; local31++) {
				this.b.add(local22[local31]);
			}
		}
		return this.b.contains(arg0);
	}
}
