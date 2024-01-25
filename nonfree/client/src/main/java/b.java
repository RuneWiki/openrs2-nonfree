import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class b extends Class1 implements Interface11 {

	@OriginalMember(owner = "client!b", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!b", name = "j", descriptor = "Ljava/awt/Canvas;")
	public Canvas aCanvas2;

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lclient!a;Ljava/awt/Canvas;)V")
	public b(@OriginalArg(0) a arg0, @OriginalArg(1) Canvas arg1) {
		this.aCanvas2 = arg1;
		@Pc(7) Dimension local7 = arg1.getSize();
		this.BA(arg0, this.aCanvas2, local7.width, local7.height);
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "()V")
	public void method730() {
		this.NA(true);
		this.nativeid = 0L;
		this.aCanvas2 = null;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Ljava/lang/Exception;)V")
	private void method731(@OriginalArg(0) Exception arg0) {
		if (!Static28.aBoolean28) {
			Static28.aLong47 = Static60.method1119();
			Static28.aBoolean28 = true;
		} else if (Static60.method1119() - Static28.aLong47 < 30000L) {
			this.aCanvas2.repaint();
		} else {
			throw new RuntimeException(arg0.getMessage());
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	public void method732(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		try {
			synchronized (this.aCanvas2.getTreeLock()) {
				for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
					@Pc(12) Rectangle local12 = arg0[local7];
					if (local12.width > 0 && local12.height > 0) {
						this.ea(local12.x, local12.y, local12.width, local12.height);
					}
				}
				Static28.aBoolean28 = false;
			}
		} catch (@Pc(41) Exception local41) {
			this.method731(local41);
		}
	}

	@OriginalMember(owner = "client!b", name = "ea", descriptor = "(IIII)V")
	private native void ea(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!b", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static79.method1341(this);
		}
	}

	@OriginalMember(owner = "client!b", name = "ga", descriptor = "()V")
	private native void ga();

	@OriginalMember(owner = "client!b", name = "BA", descriptor = "(Lclient!a;Ljava/awt/Canvas;II)V")
	private native void BA(@OriginalArg(0) a arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!b", name = "NA", descriptor = "(Z)V")
	public native void NA(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!b", name = "xa", descriptor = "(Ljava/awt/Canvas;II)V")
	public native void xa(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!b", name = "b", descriptor = "()V")
	public void method733() {
		try {
			synchronized (this.aCanvas2.getTreeLock()) {
				this.ga();
				Static28.aBoolean28 = false;
			}
		} catch (@Pc(16) Exception local16) {
			this.method731(local16);
		}
	}
}
