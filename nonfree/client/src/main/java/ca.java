import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ca")
public final class ca extends Class3 implements Interface12 {

	@OriginalMember(owner = "client!ca", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!ca", name = "k", descriptor = "Ljava/awt/Canvas;")
	public Canvas aCanvas1;

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lclient!c;Ljava/awt/Canvas;)V")
	public ca(@OriginalArg(0) c arg0, @OriginalArg(1) Canvas arg1) {
		this.aCanvas1 = arg1;
		@Pc(7) Dimension local7 = arg1.getSize();
		this.ya(arg0, this.aCanvas1, local7.width, local7.height);
	}

	@OriginalMember(owner = "client!ca", name = "pa", descriptor = "()V")
	public native void pa();

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "()V")
	public void method815() {
		try {
			synchronized (this.aCanvas1.getTreeLock()) {
				this.c();
				Static42.aBoolean39 = false;
			}
		} catch (@Pc(16) Exception local16) {
			this.method818(local16);
		}
	}

	@OriginalMember(owner = "client!ca", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static115.method1851(this);
		}
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	public native void b(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ca", name = "S", descriptor = "(IIII)V")
	private native void S(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "()V")
	public void method816() {
		this.pa();
		this.nativeid = 0L;
		this.aCanvas1 = null;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	public void method817(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		try {
			synchronized (this.aCanvas1.getTreeLock()) {
				for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
					@Pc(12) Rectangle local12 = arg0[local7];
					if (local12.width > 0 && local12.height > 0) {
						this.S(local12.x, local12.y, local12.width, local12.height);
					}
				}
				Static42.aBoolean39 = false;
			}
		} catch (@Pc(41) Exception local41) {
			this.method818(local41);
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Ljava/lang/Exception;)V")
	private void method818(@OriginalArg(0) Exception arg0) {
		if (!Static42.aBoolean39) {
			Static42.aLong27 = Static354.method4966();
			Static42.aBoolean39 = true;
		} else if (Static354.method4966() - Static42.aLong27 < 30000L) {
			this.aCanvas1.repaint();
		} else {
			throw new RuntimeException(arg0.getMessage());
		}
	}

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "()V")
	private native void c();

	@OriginalMember(owner = "client!ca", name = "ya", descriptor = "(Lclient!c;Ljava/awt/Canvas;II)V")
	private native void ya(@OriginalArg(0) c arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);
}
