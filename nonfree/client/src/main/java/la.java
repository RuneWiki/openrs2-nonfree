import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public final class la extends Class3 {

	@OriginalMember(owner = "client!la", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!la", name = "l", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas4;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lclient!h;Ljava/awt/Canvas;)V")
	public la(@OriginalArg(0) h arg0, @OriginalArg(1) Canvas arg1) {
		this.aCanvas4 = arg1;
		@Pc(7) Dimension local7 = arg1.getSize();
		this.ia(arg0, this.aCanvas4, local7.width, local7.height);
	}

	@OriginalMember(owner = "client!la", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			this.U();
		}
	}

	@OriginalMember(owner = "client!la", name = "U", descriptor = "()V")
	private native void U();

	@OriginalMember(owner = "client!la", name = "ia", descriptor = "(Lclient!h;Ljava/awt/Canvas;II)V")
	private native void ia(@OriginalArg(0) h arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!la", name = "ZA", descriptor = "(Ljava/awt/Canvas;II)V")
	public native void ZA(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!la", name = "a", descriptor = "()V")
	public void method3321() {
		this.U();
		this.nativeid = 0L;
		this.aCanvas4 = null;
	}

	@OriginalMember(owner = "client!la", name = "xa", descriptor = "(IIII)V")
	public native void xa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!la", name = "SA", descriptor = "()V")
	public native void SA();
}
