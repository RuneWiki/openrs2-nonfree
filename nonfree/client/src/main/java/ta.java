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

	@OriginalMember(owner = "client!ta", name = "r", descriptor = "Ljava/awt/Canvas;")
	public Canvas aCanvas12;

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Lclient!l;Ljava/awt/Canvas;)V")
	public ta(@OriginalArg(0) l arg0, @OriginalArg(1) Canvas arg1) {
		this.aCanvas12 = arg1;
		@Pc(7) Dimension local7 = arg1.getSize();
		this.da(arg0, this.aCanvas12, local7.width, local7.height);
	}

	@OriginalMember(owner = "client!ta", name = "UA", descriptor = "(Z)V")
	public native void UA(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "()V")
	public void method7164() {
		try {
			synchronized (this.aCanvas12.getTreeLock()) {
				this.H();
				Static495.aBoolean632 = false;
			}
		} catch (@Pc(16) Exception local16) {
			this.method7165(local16);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/lang/Exception;)V")
	private void method7165(@OriginalArg(0) Exception arg0) {
		if (!Static495.aBoolean632) {
			Static495.aLong260 = Static112.method2047();
			Static495.aBoolean632 = true;
		} else if (Static112.method2047() - Static495.aLong260 < 30000L) {
			this.aCanvas12.repaint();
		} else {
			throw new RuntimeException(arg0.getMessage());
		}
	}

	@OriginalMember(owner = "client!ta", name = "AA", descriptor = "(Ljava/awt/Canvas;II)V")
	public native void AA(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	public void method7166(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		try {
			synchronized (this.aCanvas12.getTreeLock()) {
				for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
					@Pc(12) Rectangle local12 = arg0[local7];
					if (local12.width > 0 && local12.height > 0) {
						this.a(local12.x, local12.y, local12.width, local12.height);
					}
				}
				Static495.aBoolean632 = false;
			}
		} catch (@Pc(41) Exception local41) {
			this.method7165(local41);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIII)V")
	private native void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "()V")
	public void method7167() {
		this.UA(true);
		this.nativeid = 0L;
		this.aCanvas12 = null;
	}

	@OriginalMember(owner = "client!ta", name = "da", descriptor = "(Lclient!l;Ljava/awt/Canvas;II)V")
	private native void da(@OriginalArg(0) l arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ta", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static379.method5898(this);
		}
	}

	@OriginalMember(owner = "client!ta", name = "H", descriptor = "()V")
	private native void H();
}
