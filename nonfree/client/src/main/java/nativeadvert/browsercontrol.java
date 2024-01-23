package nativeadvert;

import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nativeadvert/browsercontrol")
public final class browsercontrol {

	@OriginalMember(owner = "client!nativeadvert/browsercontrol", name = "attach", descriptor = "(Ljava/awt/Canvas;)V")
	public void method2338(@OriginalArg(0) Canvas arg0) {
		if (arg0.getPeer() == null) {
			throw new IllegalStateException("Supplied canvas not on screen");
		}
		@Pc(19) boolean local19 = this.attach0(arg0, 0, 0, arg0.getSize().width, arg0.getSize().height);
		if (!local19) {
			throw new RuntimeException("Failed to attach");
		}
	}

	@OriginalMember(owner = "client!nativeadvert/browsercontrol", name = "detach", descriptor = "()V")
	public void method2339() {
		this.detach0();
	}

	@OriginalMember(owner = "client!nativeadvert/browsercontrol", name = "attach0", descriptor = "(Ljava/awt/Canvas;IIII)Z")
	private native boolean attach0(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!nativeadvert/browsercontrol", name = "detach0", descriptor = "()V")
	private native void detach0();
}
