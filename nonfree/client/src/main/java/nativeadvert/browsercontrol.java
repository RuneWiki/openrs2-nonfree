package nativeadvert;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nativeadvert/browsercontrol")
public final class browsercontrol {

	@OriginalMember(owner = "client!nativeadvert/browsercontrol", name = "initialised", descriptor = "Z")
	private static boolean aBoolean121;

	@OriginalMember(owner = "client!nativeadvert/browsercontrol", name = "nativeData", descriptor = "I")
	private int anInt2805 = 0;

	@OriginalMember(owner = "client!nativeadvert/browsercontrol", name = "initIDs", descriptor = "()V")
	private static native void initIDs();

	@OriginalMember(owner = "client!nativeadvert/browsercontrol", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public browsercontrol(@OriginalArg(0) String arg0) {
		if (!aBoolean121) {
			initIDs();
			aBoolean121 = true;
		}
		this.browsercontrol0(arg0);
	}

	@OriginalMember(owner = "client!nativeadvert/browsercontrol", name = "set_position", descriptor = "(IIII)Z")
	public boolean method2288(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return this.setposition0(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!nativeadvert/browsercontrol", name = "hide", descriptor = "()V")
	public void method2289() {
		this.detach0();
	}

	@OriginalMember(owner = "client!nativeadvert/browsercontrol", name = "navigate", descriptor = "(Ljava/lang/String;)V")
	public void method2290(@OriginalArg(0) String arg0) {
		this.navigate0(arg0);
	}

	@OriginalMember(owner = "client!nativeadvert/browsercontrol", name = "destroy", descriptor = "()V")
	public void method2291() {
		this.destroy0();
	}

	@OriginalMember(owner = "client!nativeadvert/browsercontrol", name = "browsercontrol0", descriptor = "(Ljava/lang/String;)V")
	private native void browsercontrol0(@OriginalArg(0) String arg0);

	@OriginalMember(owner = "client!nativeadvert/browsercontrol", name = "setposition0", descriptor = "(IIII)Z")
	private native boolean setposition0(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!nativeadvert/browsercontrol", name = "navigate0", descriptor = "(Ljava/lang/String;)V")
	private native void navigate0(@OriginalArg(0) String arg0);

	@OriginalMember(owner = "client!nativeadvert/browsercontrol", name = "destroy0", descriptor = "()V")
	private native void destroy0();

	@OriginalMember(owner = "client!nativeadvert/browsercontrol", name = "detach0", descriptor = "()V")
	private native void detach0();
}
