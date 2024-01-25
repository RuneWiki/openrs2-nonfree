import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class ta extends Class4 implements Interface18 {

	@OriginalMember(owner = "client!ta", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!ta", name = "j", descriptor = "Ljava/awt/Canvas;")
	public Canvas aCanvas14;

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Lclient!l;Ljava/awt/Canvas;)V")
	public ta(@OriginalArg(0) l arg0, @OriginalArg(1) Canvas arg1) {
		this.aCanvas14 = arg1;
		@Pc(7) Dimension local7 = arg1.getSize();
		this.da(arg0, this.aCanvas14, local7.width, local7.height);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "()V")
	public void method7327() {
		try {
			synchronized (this.aCanvas14.getTreeLock()) {
				this.H();
				Static494.aBoolean630 = false;
			}
		} catch (@Pc(16) Exception local16) {
			this.method7330(local16);
		}
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "()V")
	public void method7328() {
		this.UA(true);
		this.nativeid = 0L;
		this.aCanvas14 = null;
	}

	@OriginalMember(owner = "client!ta", name = "AA", descriptor = "(Ljava/awt/Canvas;II)V")
	public native void AA(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIII)V")
	private native void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	public void method7329(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		try {
			synchronized (this.aCanvas14.getTreeLock()) {
				for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
					@Pc(12) Rectangle local12 = arg0[local7];
					if (local12.width > 0 && local12.height > 0) {
						this.a(local12.x, local12.y, local12.width, local12.height);
					}
				}
				Static494.aBoolean630 = false;
			}
		} catch (@Pc(41) Exception local41) {
			this.method7330(local41);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/lang/Exception;)V")
	private void method7330(@OriginalArg(0) Exception arg0) {
		if (!Static494.aBoolean630) {
			Static494.aLong233 = Static574.method8210();
			Static494.aBoolean630 = true;
		} else if (Static574.method8210() - Static494.aLong233 < 30000L) {
			this.aCanvas14.repaint();
		} else {
			throw new RuntimeException(arg0.getMessage());
		}
	}

	@OriginalMember(owner = "client!ta", name = "H", descriptor = "()V")
	private native void H();

	@OriginalMember(owner = "client!ta", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static302.method5182(this);
		}
	}

	@OriginalMember(owner = "client!ta", name = "UA", descriptor = "(Z)V")
	public native void UA(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ta", name = "da", descriptor = "(Lclient!l;Ljava/awt/Canvas;II)V")
	private native void da(@OriginalArg(0) l arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);
}
