import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class b extends Class2 implements Interface14 {

	@OriginalMember(owner = "client!b", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!b", name = "i", descriptor = "Ljava/awt/Canvas;")
	public Canvas aCanvas1;

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lclient!a;Ljava/awt/Canvas;)V")
	public b(@OriginalArg(0) a arg0, @OriginalArg(1) Canvas arg1) {
		this.aCanvas1 = arg1;
		@Pc(7) Dimension local7 = arg1.getSize();
		this.BA(arg0, this.aCanvas1, local7.width, local7.height);
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "()V")
	public void method626() {
		try {
			synchronized (this.aCanvas1.getTreeLock()) {
				this.ga();
				Static29.aBoolean36 = false;
			}
		} catch (@Pc(16) Exception local16) {
			this.method627(local16);
		}
	}

	@OriginalMember(owner = "client!b", name = "NA", descriptor = "(Z)V")
	public native void NA(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Ljava/lang/Exception;)V")
	private void method627(@OriginalArg(0) Exception arg0) {
		if (!Static29.aBoolean36) {
			Static29.aLong12 = Static143.method2502();
			Static29.aBoolean36 = true;
		} else if (Static143.method2502() - Static29.aLong12 < 30000L) {
			this.aCanvas1.repaint();
		} else {
			throw new RuntimeException(arg0.getMessage());
		}
	}

	@OriginalMember(owner = "client!b", name = "BA", descriptor = "(Lclient!a;Ljava/awt/Canvas;II)V")
	private native void BA(@OriginalArg(0) a arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!b", name = "ga", descriptor = "()V")
	private native void ga();

	@OriginalMember(owner = "client!b", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	public void method628(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		try {
			synchronized (this.aCanvas1.getTreeLock()) {
				for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
					@Pc(12) Rectangle local12 = arg0[local7];
					if (local12.width > 0 && local12.height > 0) {
						this.ea(local12.x, local12.y, local12.width, local12.height);
					}
				}
				Static29.aBoolean36 = false;
			}
		} catch (@Pc(41) Exception local41) {
			this.method627(local41);
		}
	}

	@OriginalMember(owner = "client!b", name = "xa", descriptor = "(Ljava/awt/Canvas;II)V")
	public native void xa(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!b", name = "ea", descriptor = "(IIII)V")
	private native void ea(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!b", name = "b", descriptor = "()V")
	public void method629() {
		this.NA(true);
		this.nativeid = 0L;
		this.aCanvas1 = null;
	}

	@OriginalMember(owner = "client!b", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static508.method7434(this);
		}
	}
}
