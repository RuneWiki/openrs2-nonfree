import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class b extends Class10 implements Interface11 {

	@OriginalMember(owner = "client!b", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!b", name = "m", descriptor = "Ljava/awt/Canvas;")
	public Canvas aCanvas1;

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lclient!w;Ljava/awt/Canvas;)V")
	public b(@OriginalArg(0) w arg0, @OriginalArg(1) Canvas arg1) {
		this.aCanvas1 = arg1;
		@Pc(7) Dimension local7 = arg1.getSize();
		this.FA(arg0, this.aCanvas1, local7.width, local7.height);
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Ljava/lang/Exception;)V")
	private void method295(@OriginalArg(0) Exception arg0) {
		if (!Static22.aBoolean31) {
			Static22.aLong15 = Static220.method3314();
			Static22.aBoolean31 = true;
		} else if (Static220.method3314() - Static22.aLong15 < 30000L) {
			this.aCanvas1.repaint();
		} else {
			throw new RuntimeException(arg0.getMessage());
		}
	}

	@OriginalMember(owner = "client!b", name = "FA", descriptor = "(Lclient!w;Ljava/awt/Canvas;II)V")
	private native void FA(@OriginalArg(0) w arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!b", name = "p", descriptor = "()V")
	public native void p();

	@OriginalMember(owner = "client!b", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static408.method5372(this);
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "()V")
	public void method296() {
		try {
			synchronized (this.aCanvas1.getTreeLock()) {
				this.ya();
				Static22.aBoolean31 = false;
			}
		} catch (@Pc(16) Exception local16) {
			this.method295(local16);
		}
	}

	@OriginalMember(owner = "client!b", name = "U", descriptor = "(Ljava/awt/Canvas;II)V")
	public native void U(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!b", name = "b", descriptor = "()V")
	public void method297() {
		this.p();
		this.nativeid = 0L;
		this.aCanvas1 = null;
	}

	@OriginalMember(owner = "client!b", name = "TA", descriptor = "(IIII)V")
	private native void TA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!b", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	public void method298(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		try {
			synchronized (this.aCanvas1.getTreeLock()) {
				for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
					@Pc(12) Rectangle local12 = arg0[local7];
					if (local12.width > 0 && local12.height > 0) {
						this.TA(local12.x, local12.y, local12.width, local12.height);
					}
				}
				Static22.aBoolean31 = false;
			}
		} catch (@Pc(41) Exception local41) {
			this.method295(local41);
		}
	}

	@OriginalMember(owner = "client!b", name = "ya", descriptor = "()V")
	private native void ya();
}
