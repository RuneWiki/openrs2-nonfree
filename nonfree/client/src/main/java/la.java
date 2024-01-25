import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public final class la extends Class2 {

	@OriginalMember(owner = "client!la", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lclient!h;Ljava/awt/Canvas;)V")
	public la(@OriginalArg(0) h arg0, @OriginalArg(1) Canvas arg1) {
		@Pc(4) Dimension local4 = arg1.getSize();
		this.ia(arg0, arg1, local4.width, local4.height);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "()V")
	public void method3361() {
		this.U();
		this.nativeid = 0L;
	}

	@OriginalMember(owner = "client!la", name = "ZA", descriptor = "(Ljava/awt/Canvas;II)V")
	public native void ZA(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!la", name = "ia", descriptor = "(Lclient!h;Ljava/awt/Canvas;II)V")
	private native void ia(@OriginalArg(0) h arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!la", name = "U", descriptor = "()V")
	private native void U();

	@OriginalMember(owner = "client!la", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			this.U();
		}
	}

	@OriginalMember(owner = "client!la", name = "SA", descriptor = "()V")
	public native void SA();

	@OriginalMember(owner = "client!la", name = "xa", descriptor = "(IIII)V")
	public native void xa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);
}
