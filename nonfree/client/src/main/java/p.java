import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!p")
public final class p extends Class2 implements Interface5 {

	@OriginalMember(owner = "client!p", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!p", name = "m", descriptor = "Ljava/awt/Canvas;")
	public Canvas aCanvas8;

	@OriginalMember(owner = "client!p", name = "q", descriptor = "I")
	public int anInt7597;

	@OriginalMember(owner = "client!p", name = "o", descriptor = "I")
	public int anInt7598;

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lclient!oa;Ljava/awt/Canvas;II)V")
	public p(@OriginalArg(0) oa arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aCanvas8 = arg1;
		this.anInt7597 = arg2;
		this.anInt7598 = arg3;
		this.sa(arg0, this.aCanvas8, arg2, arg3);
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(II)V")
	public void method6771(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			synchronized (this.aCanvas8.getTreeLock()) {
				@Pc(9) Dimension local9 = this.aCanvas8.getSize();
				this.H(arg0, arg1, local9.width, local9.height);
				Static472.aBoolean663 = false;
			}
		} catch (@Pc(26) Exception local26) {
			this.method6775(local26);
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	public void method6772(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt7597 = arg1;
		this.anInt7598 = arg2;
		this.oa(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!p", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static178.method2627(this);
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "()V")
	public void method6773() {
		this.w(true);
		this.nativeid = 0L;
		this.aCanvas8 = null;
	}

	@OriginalMember(owner = "client!p", name = "w", descriptor = "(Z)V")
	public native void w(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!p", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	public void method6774(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			synchronized (this.aCanvas8.getTreeLock()) {
				for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
					@Pc(12) Rectangle local12 = arg0[local7];
					if (local12.width > 0 && local12.height > 0) {
						this.K(local12.x, local12.y, local12.width, local12.height, arg2, arg3);
					}
				}
				Static472.aBoolean663 = false;
			}
		} catch (@Pc(47) Exception local47) {
			this.method6775(local47);
		}
	}

	@OriginalMember(owner = "client!p", name = "sa", descriptor = "(Lclient!oa;Ljava/awt/Canvas;II)V")
	private native void sa(@OriginalArg(0) oa arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/lang/Exception;)V")
	private void method6775(@OriginalArg(0) Exception arg0) {
		if (!Static472.aBoolean663) {
			Static472.aLong233 = Static567.method7863();
			Static472.aBoolean663 = true;
		} else if (Static567.method7863() - Static472.aLong233 < 30000L) {
			this.aCanvas8.repaint();
		} else {
			throw new RuntimeException(arg0.getMessage());
		}
	}

	@OriginalMember(owner = "client!p", name = "H", descriptor = "(IIII)V")
	private native void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!p", name = "K", descriptor = "(IIIIII)V")
	private native void K(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!p", name = "oa", descriptor = "(Ljava/awt/Canvas;II)V")
	private native void oa(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
