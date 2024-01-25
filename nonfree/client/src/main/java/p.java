import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!p")
public final class p extends Class2 implements Interface8 {

	@OriginalMember(owner = "client!p", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!p", name = "h", descriptor = "Ljava/awt/Canvas;")
	public Canvas aCanvas12;

	@OriginalMember(owner = "client!p", name = "i", descriptor = "I")
	public int anInt7630;

	@OriginalMember(owner = "client!p", name = "l", descriptor = "I")
	public int anInt7631;

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lclient!oa;Ljava/awt/Canvas;II)V")
	public p(@OriginalArg(0) oa arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aCanvas12 = arg1;
		this.anInt7630 = arg2;
		this.anInt7631 = arg3;
		this.sa(arg0, this.aCanvas12, arg2, arg3);
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/lang/Exception;)V")
	private void method6382(@OriginalArg(0) Exception arg0) {
		if (!Static418.aBoolean572) {
			Static418.aLong214 = Static438.method6517();
			Static418.aBoolean572 = true;
		} else if (Static438.method6517() - Static418.aLong214 < 30000L) {
			this.aCanvas12.repaint();
		} else {
			throw new RuntimeException(arg0.getMessage());
		}
	}

	@OriginalMember(owner = "client!p", name = "K", descriptor = "(IIIIII)V")
	private native void K(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!p", name = "w", descriptor = "(Z)V")
	public native void w(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!p", name = "oa", descriptor = "(Ljava/awt/Canvas;II)V")
	private native void oa(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!p", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	public void method6383(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			synchronized (this.aCanvas12.getTreeLock()) {
				for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
					@Pc(12) Rectangle local12 = arg0[local7];
					if (local12.width > 0 && local12.height > 0) {
						this.K(local12.x, local12.y, local12.width, local12.height, arg2, arg3);
					}
				}
				Static418.aBoolean572 = false;
			}
		} catch (@Pc(43) Exception local43) {
			this.method6382(local43);
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "()V")
	public void method6384() {
		this.w(true);
		this.nativeid = 0L;
		this.aCanvas12 = null;
	}

	@OriginalMember(owner = "client!p", name = "H", descriptor = "(IIII)V")
	private native void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	public void method6385(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt7630 = arg1;
		this.anInt7631 = arg2;
		this.oa(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!p", name = "sa", descriptor = "(Lclient!oa;Ljava/awt/Canvas;II)V")
	private native void sa(@OriginalArg(0) oa arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(II)V")
	public void method6386(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			synchronized (this.aCanvas12.getTreeLock()) {
				@Pc(9) Dimension local9 = this.aCanvas12.getSize();
				this.H(arg0, arg1, local9.width, local9.height);
				Static418.aBoolean572 = false;
			}
		} catch (@Pc(26) Exception local26) {
			this.method6382(local26);
		}
	}

	@OriginalMember(owner = "client!p", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static46.method930(this);
		}
	}
}
