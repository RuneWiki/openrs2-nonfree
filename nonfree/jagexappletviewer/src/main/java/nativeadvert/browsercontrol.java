package nativeadvert;

import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("jagexappletviewer!nativeadvert/browsercontrol")
public class browsercontrol {

	@OriginalMember(owner = "jagexappletviewer!nativeadvert/browsercontrol", name = "iscreated", descriptor = "Z")
	private static boolean iscreated = false;

	@OriginalMember(owner = "jagexappletviewer!nativeadvert/browsercontrol", name = "error", descriptor = "Z")
	private static boolean error = false;

	@OriginalMember(owner = "jagexappletviewer!nativeadvert/browsercontrol", name = "resize", descriptor = "(II)V")
	public static void resize(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!iscreated) {
			throw new IllegalStateException();
		}
		resize0(arg0, arg1);
	}

	@OriginalMember(owner = "jagexappletviewer!nativeadvert/browsercontrol", name = "iscreated", descriptor = "()Z")
	public static boolean iscreated() {
		return iscreated;
	}

	@OriginalMember(owner = "jagexappletviewer!nativeadvert/browsercontrol", name = "resize0", descriptor = "(II)V")
	private static native void resize0(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "jagexappletviewer!nativeadvert/browsercontrol", name = "browsercontrol0", descriptor = "(Ljava/awt/Canvas;Ljava/lang/String;)Z")
	private static native boolean browsercontrol0(@OriginalArg(0) Canvas arg0, @OriginalArg(1) String arg1);

	@OriginalMember(owner = "jagexappletviewer!nativeadvert/browsercontrol", name = "create", descriptor = "(Ljava/awt/Canvas;Ljava/lang/String;)Z")
	public static boolean create(@OriginalArg(0) Canvas arg0, @OriginalArg(1) String arg1) {
		if (iscreated) {
			throw new IllegalStateException();
		} else if (error) {
			return false;
		} else {
			@Pc(16) boolean local16 = browsercontrol0(arg0, arg1);
			if (local16) {
				iscreated = true;
			} else {
				error = true;
			}
			return local16;
		}
	}

	@OriginalMember(owner = "jagexappletviewer!nativeadvert/browsercontrol", name = "navigate", descriptor = "(Ljava/lang/String;)V")
	public static void navigate(@OriginalArg(0) String arg0) {
		if (!iscreated) {
			throw new IllegalStateException();
		}
		navigate0(arg0);
	}

	@OriginalMember(owner = "jagexappletviewer!nativeadvert/browsercontrol", name = "destroy", descriptor = "()V")
	public static void destroy() {
		if (!iscreated) {
			throw new IllegalStateException();
		}
		destroy0();
		iscreated = false;
	}

	@OriginalMember(owner = "jagexappletviewer!nativeadvert/browsercontrol", name = "destroy0", descriptor = "()V")
	private static native void destroy0();

	@OriginalMember(owner = "jagexappletviewer!nativeadvert/browsercontrol", name = "<init>", descriptor = "()V")
	private browsercontrol() {
	}

	@OriginalMember(owner = "jagexappletviewer!nativeadvert/browsercontrol", name = "navigate0", descriptor = "(Ljava/lang/String;)V")
	private static native void navigate0(@OriginalArg(0) String arg0);
}
