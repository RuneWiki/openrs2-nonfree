import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!za")
public final class za extends Class7 {

	@OriginalMember(owner = "client!za", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!za", name = "k", descriptor = "Ljava/awt/Canvas;")
	public Canvas aCanvas7;

	@OriginalMember(owner = "client!za", name = "<init>", descriptor = "(Lclient!qa;Ljava/awt/Canvas;)V")
	public za(@OriginalArg(0) qa arg0, @OriginalArg(1) Canvas arg1) {
		this.aCanvas7 = arg1;
		@Pc(7) Dimension local7 = arg1.getSize();
		this.r(arg0, this.aCanvas7, local7.width, local7.height);
	}

	@OriginalMember(owner = "client!za", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	public void method5803(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		try {
			synchronized (this.aCanvas7.getTreeLock()) {
				for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
					@Pc(12) Rectangle local12 = arg0[local7];
					if (local12.width > 0 && local12.height > 0) {
						this.d(local12.x, local12.y, local12.width, local12.height);
					}
				}
				Static460.aBoolean513 = false;
			}
		} catch (@Pc(41) Exception local41) {
			this.method5806(local41);
		}
	}

	@OriginalMember(owner = "client!za", name = "H", descriptor = "(Ljava/awt/Canvas;II)V")
	public native void H(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!za", name = "ca", descriptor = "()V")
	private native void ca();

	@OriginalMember(owner = "client!za", name = "a", descriptor = "()V")
	public void method5804() {
		this.ca();
		this.nativeid = 0L;
		this.aCanvas7 = null;
	}

	@OriginalMember(owner = "client!za", name = "r", descriptor = "(Lclient!qa;Ljava/awt/Canvas;II)V")
	private native void r(@OriginalArg(0) qa arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!za", name = "ka", descriptor = "()V")
	private native void ka();

	@OriginalMember(owner = "client!za", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			this.ca();
		}
	}

	@OriginalMember(owner = "client!za", name = "d", descriptor = "(IIII)V")
	private native void d(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!za", name = "b", descriptor = "()V")
	public void method5805() {
		try {
			synchronized (this.aCanvas7.getTreeLock()) {
				this.ka();
				Static460.aBoolean513 = false;
			}
		} catch (@Pc(16) Exception local16) {
			this.method5806(local16);
		}
	}

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(Ljava/lang/Exception;)V")
	private void method5806(@OriginalArg(0) Exception arg0) {
		if (!Static460.aBoolean513) {
			Static460.aLong231 = Static158.method2342();
			Static460.aBoolean513 = true;
		} else if (Static158.method2342() - Static460.aLong231 < 30000L) {
			this.aCanvas7.repaint();
		} else {
			throw new RuntimeException(arg0.getMessage());
		}
	}
}
