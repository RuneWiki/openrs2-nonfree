package nativeadvert;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nativeadvert/browsercontrol")
public final class browsercontrol {

	@OriginalMember(owner = "client!nativeadvert/browsercontrol", name = "iscreated", descriptor = "Z")
	private static boolean aBoolean264;

	@OriginalMember(owner = "client!nativeadvert/browsercontrol", name = "error", descriptor = "Z")
	private static boolean aBoolean265;

	@OriginalMember(owner = "client!nativeadvert/browsercontrol", name = "create", descriptor = "(Ljava/lang/String;)Z")
	public static boolean method2356(@OriginalArg(0) String arg0) {
		if (aBoolean264) {
			throw new IllegalStateException();
		} else if (aBoolean265) {
			return false;
		} else {
			@Pc(12) boolean local12 = browsercontrol0(arg0);
			if (local12) {
				aBoolean264 = true;
			} else {
				aBoolean265 = true;
			}
			return local12;
		}
	}

	@OriginalMember(owner = "client!nativeadvert/browsercontrol", name = "iscreated", descriptor = "()Z")
	public static boolean method2357() {
		return aBoolean264;
	}

	@OriginalMember(owner = "client!nativeadvert/browsercontrol", name = "set_position", descriptor = "(IIII)V")
	public static void method2358(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!aBoolean264) {
			throw new IllegalStateException();
		}
		setposition0(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!nativeadvert/browsercontrol", name = "hide", descriptor = "()V")
	public static void method2359() {
		if (!aBoolean264) {
			throw new IllegalStateException();
		}
		detach0();
	}

	@OriginalMember(owner = "client!nativeadvert/browsercontrol", name = "navigate", descriptor = "(Ljava/lang/String;)V")
	public static void method2360(@OriginalArg(0) String arg0) {
		if (!aBoolean264) {
			throw new IllegalStateException();
		}
		navigate0(arg0);
	}

	@OriginalMember(owner = "client!nativeadvert/browsercontrol", name = "destroy", descriptor = "()V")
	public static void method2361() {
		if (!aBoolean264) {
			throw new IllegalStateException();
		}
		destroy0();
		aBoolean264 = false;
	}

	@OriginalMember(owner = "client!nativeadvert/browsercontrol", name = "browsercontrol0", descriptor = "(Ljava/lang/String;)Z")
	private static native boolean browsercontrol0(@OriginalArg(0) String arg0);

	@OriginalMember(owner = "client!nativeadvert/browsercontrol", name = "setposition0", descriptor = "(IIII)V")
	private static native void setposition0(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!nativeadvert/browsercontrol", name = "navigate0", descriptor = "(Ljava/lang/String;)V")
	private static native void navigate0(@OriginalArg(0) String arg0);

	@OriginalMember(owner = "client!nativeadvert/browsercontrol", name = "destroy0", descriptor = "()V")
	private static native void destroy0();

	@OriginalMember(owner = "client!nativeadvert/browsercontrol", name = "detach0", descriptor = "()V")
	private static native void detach0();
}
