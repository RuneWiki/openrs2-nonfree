import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class v extends Class3 implements Interface8 {

	@OriginalMember(owner = "client!v", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!v", name = "k", descriptor = "Ljava/awt/Canvas;")
	public Canvas aCanvas13;

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lclient!da;Ljava/awt/Canvas;)V")
	public v(@OriginalArg(0) da arg0, @OriginalArg(1) Canvas arg1) {
		this.aCanvas13 = arg1;
		@Pc(7) Dimension local7 = arg1.getSize();
		this.ya(arg0, this.aCanvas13, local7.width, local7.height);
	}

	@OriginalMember(owner = "client!v", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static354.method5572(this);
		}
	}

	@OriginalMember(owner = "client!v", name = "ya", descriptor = "(Lclient!da;Ljava/awt/Canvas;II)V")
	private native void ya(@OriginalArg(0) da arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!v", name = "QA", descriptor = "()V")
	private native void QA();

	@OriginalMember(owner = "client!v", name = "a", descriptor = "()V")
	public void method7255() {
		this.H(true);
		this.nativeid = 0L;
		this.aCanvas13 = null;
	}

	@OriginalMember(owner = "client!v", name = "KA", descriptor = "(IIII)V")
	private native void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!v", name = "D", descriptor = "(Ljava/awt/Canvas;II)V")
	public native void D(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!v", name = "H", descriptor = "(Z)V")
	public native void H(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!v", name = "b", descriptor = "()V")
	public void method7256() {
		try {
			synchronized (this.aCanvas13.getTreeLock()) {
				this.QA();
				Static503.aBoolean658 = false;
			}
		} catch (@Pc(16) Exception local16) {
			this.method7257(local16);
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Ljava/lang/Exception;)V")
	private void method7257(@OriginalArg(0) Exception arg0) {
		if (!Static503.aBoolean658) {
			Static503.aLong268 = Static12.method647();
			Static503.aBoolean658 = true;
		} else if (Static12.method647() - Static503.aLong268 < 30000L) {
			this.aCanvas13.repaint();
		} else {
			throw new RuntimeException(arg0.getMessage());
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	public void method7258(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		try {
			synchronized (this.aCanvas13.getTreeLock()) {
				for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
					@Pc(12) Rectangle local12 = arg0[local7];
					if (local12.width > 0 && local12.height > 0) {
						this.KA(local12.x, local12.y, local12.width, local12.height);
					}
				}
				Static503.aBoolean658 = false;
			}
		} catch (@Pc(41) Exception local41) {
			this.method7257(local41);
		}
	}
}
