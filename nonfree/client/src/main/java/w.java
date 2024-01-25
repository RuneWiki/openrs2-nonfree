import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!w")
public final class w extends Class50 implements Interface11 {

	@OriginalMember(owner = "client!w", name = "A", descriptor = "Lclient!g;")
	private g aG1;

	@OriginalMember(owner = "client!w", name = "E", descriptor = "Lclient!b;")
	private b aB1;

	@OriginalMember(owner = "client!w", name = "I", descriptor = "I")
	private int anInt7379;

	@OriginalMember(owner = "client!w", name = "J", descriptor = "[Lclient!k;")
	private k[] aKArray1;

	@OriginalMember(owner = "client!w", name = "o", descriptor = "Z")
	private boolean aBoolean486 = false;

	@OriginalMember(owner = "client!w", name = "nativeid", descriptor = "J")
	private final long nativeid = 0L;

	@OriginalMember(owner = "client!w", name = "n", descriptor = "Lclient!mf;")
	private final Class163 aClass163_45 = new Class163();

	@OriginalMember(owner = "client!w", name = "F", descriptor = "I")
	private final int anInt7377 = 4096;

	@OriginalMember(owner = "client!w", name = "G", descriptor = "I")
	private final int anInt7378 = 4096;

	@OriginalMember(owner = "client!w", name = "D", descriptor = "Lclient!mn;")
	private final Class167 aClass167_35 = new Class167(4);

	@OriginalMember(owner = "client!w", name = "H", descriptor = "Z")
	private boolean aBoolean488 = false;

	@OriginalMember(owner = "client!w", name = "C", descriptor = "Lclient!c;")
	private Class34 aClass34_7;

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lclient!l;Lclient!lt;)V")
	public w(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Interface7 arg2, @OriginalArg(3) Class159 arg3) {
		super(arg0, arg2);
		try {
			if (!Static441.aBoolean487) {
				if (arg3 == null) {
					System.loadLibrary("jawt");
					System.loadLibrary("sw3d");
					Static441.aBoolean487 = Boolean.TRUE;
				} else {
					arg3.method3516(this.getClass());
					Static441.aBoolean487 = Boolean.TRUE;
				}
			}
			if (!Static441.aBoolean487) {
				throw new RuntimeException("");
			}
			this.W(super.anInterface7_8, 0, 0);
			Static154.method2633(true, false);
			this.aBoolean488 = true;
			this.aClass34_7 = new qa();
			this.SA(new qa());
			this.method5817(1);
			this.method5832(0);
			if (arg1 != null) {
				this.method5880(arg1);
				this.method5827(arg1);
			}
		} catch (@Pc(95) Throwable local95) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!w", name = "v", descriptor = "(III[I)V")
	public native void v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!w", name = "ma", descriptor = "(IIIII)V")
	public native void ma(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!w", name = "ba", descriptor = "(IIII)V")
	public native void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!w", name = "pa", descriptor = "()I")
	public native int pa();

	@OriginalMember(owner = "client!w", name = "d", descriptor = "(I)V")
	@Override
	public void method5832(@OriginalArg(0) int arg0) {
		this.aKArray1[arg0].method3216();
	}

	@OriginalMember(owner = "client!w", name = "J", descriptor = "(SBBZZZBBBIIZZ[I)V")
	private native void J(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) int[] arg13);

	@OriginalMember(owner = "client!w", name = "f", descriptor = "(I)Lclient!n;")
	@Override
	public Class10_Sub29 method5852(@OriginalArg(0) int arg0) {
		@Pc(5) g local5 = new g(this, arg0);
		this.aClass163_45.method3613(local5);
		return local5;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "([Lclient!e;Lclient!c;[Lclient!pr;I)V")
	@Override
	public void method5858(@OriginalArg(0) Class63[] arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(2) Class40_Sub8[] arg2, @OriginalArg(3) int arg3) {
		if (arg2 == null) {
			this.method5886().va(this, arg0, arg1, null, -1, arg3);
			return;
		}
		@Pc(15) Class40_Sub8 local15 = arg2[0];
		Static441.anIntArray722[5] = 0;
		this.method5886().va(this, arg0, arg1, Static441.anIntArray722, -1, arg3);
		local15.anInt5480 = Static441.anIntArray722[0];
		local15.anInt5479 = Static441.anIntArray722[1];
		local15.anInt5482 = Static441.anIntArray722[2];
		local15.anInt5478 = Static441.anIntArray722[3];
		local15.anInt5481 = Static441.anIntArray722[4];
		local15.aBoolean362 = Static441.anIntArray722[5] != 0;
	}

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(Z)V")
	@Override
	public void method5868(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!w", name = "c", descriptor = "()Z")
	@Override
	public boolean method5813() {
		return true;
	}

	@OriginalMember(owner = "client!w", name = "A", descriptor = "()Z")
	@Override
	public boolean method5881() {
		return true;
	}

	@OriginalMember(owner = "client!w", name = "aa", descriptor = "()F")
	public native float aa();

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!fj;[Lclient!ef;Z)Lclient!la;")
	@Override
	public Class57 method5846(@OriginalArg(0) Class79 arg0, @OriginalArg(1) Class66[] arg1) {
		return new ra(this, this.aG1, arg0, arg1, null);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "()Z")
	@Override
	public boolean method5808() {
		return false;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method5812() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!w", name = "NA", descriptor = "(IIIIIILclient!ta;II)V")
	private native void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class49 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!ip;)V")
	@Override
	public void method5855(@OriginalArg(0) Class121 arg0) {
		this.method5887(arg0, false);
		this.method5886().J(this, Static441.anIntArray725, Static441.anIntArray724, Static441.anIntArray721, Static441.aShortArray115, arg0.aClass197_1.method4413());
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIII)V")
	public native void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!w", name = "i", descriptor = "()Z")
	@Override
	public boolean method5830() {
		return false;
	}

	@OriginalMember(owner = "client!w", name = "W", descriptor = "(Lclient!l;II)V")
	private native void W(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!w", name = "r", descriptor = "()I")
	public native int r();

	@OriginalMember(owner = "client!w", name = "P", descriptor = "(IIIIII)V")
	public native void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method5809(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method5886().q(this, arg0, arg1, arg2, arg3, arg4, arg5, 0);
	}

	@OriginalMember(owner = "client!w", name = "u", descriptor = "(I)V")
	private native void u(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!w", name = "X", descriptor = "(S)Z")
	private boolean method5883(@OriginalArg(0) short arg0) {
		synchronized (this) {
			@Pc(9) Class259 local9 = super.anInterface7_8.method4447(arg0);
			if (local9 == null) {
				return false;
			} else {
				this.l(arg0, local9.aByte99, local9.aByte102, local9.aBoolean475, local9.aBoolean476, local9.aBoolean479, local9.aByte101, local9.aByte104, local9.aByte100, local9.aShort108, local9.anInt7252, local9.aBoolean477, local9.aBoolean480);
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!w", name = "B", descriptor = "()Z")
	@Override
	public boolean method5882() {
		return false;
	}

	@OriginalMember(owner = "client!w", name = "u", descriptor = "()Z")
	@Override
	public boolean method5860() {
		return false;
	}

	@OriginalMember(owner = "client!w", name = "T", descriptor = "()F")
	public native float T();

	@OriginalMember(owner = "client!w", name = "k", descriptor = "()V")
	@Override
	protected void method5841() {
		if (this.aBoolean486) {
			return;
		}
		this.method5885();
		this.aKArray1 = null;
		this.aB1 = null;
		this.aG1 = null;
		this.aClass34_7 = null;
		this.aClass167_35.method3701();
		for (@Pc(27) g local27 = (g) this.aClass163_45.method3620(); local27 != null; local27 = (g) this.aClass163_45.method3621()) {
			local27.IA();
		}
		this.aClass163_45.method3619();
		this.ua();
		if (this.aBoolean488) {
			Static228.method3402(false, true);
			this.aBoolean488 = false;
		}
		this.aBoolean486 = true;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "([IIIII)Lclient!o;")
	@Override
	public Class80 method5823(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new v(this, this.aG1, arg0, 0, arg1, arg2, arg3) : new ca(this, this.aG1, arg0, 0, arg1, arg2, arg3);
				}
			}
		}
		return local1 ? new v(this, this.aG1, arg0, 0, arg1, arg2, arg3) : new ca(this, this.aG1, arg0, 0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!w", name = "j", descriptor = "()Z")
	@Override
	public boolean method5839() {
		return false;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(I[Lclient!bk;)V")
	@Override
	public void method5869(@OriginalArg(0) int arg0, @OriginalArg(1) Class10_Sub4[] arg1) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			Static441.anIntArray723[local1++] = arg1[local3].method5354();
			Static441.anIntArray723[local1++] = arg1[local3].method5365();
			Static441.anIntArray723[local1++] = arg1[local3].method5362();
			Static441.anIntArray723[local1++] = arg1[local3].method5355();
			Static441.aFloatArray33[local3] = arg1[local3].method5359();
			Static441.anIntArray723[local1++] = arg1[local3].method5361();
		}
		this.WA(arg0, Static441.anIntArray723, Static441.aFloatArray33);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!n;)V")
	@Override
	public void method5879(@OriginalArg(0) Class10_Sub29 arg0) {
		this.aG1 = (g) arg0;
		this.QA(arg0);
	}

	@OriginalMember(owner = "client!w", name = "w", descriptor = "()Z")
	@Override
	public boolean method5867() {
		return true;
	}

	@OriginalMember(owner = "client!w", name = "f", descriptor = "(IIIIII)V")
	@Override
	public void method5874(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.A(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
	@Override
	public void method5817(@OriginalArg(0) int arg0) {
		this.anInt7379 = arg0;
		this.aKArray1 = new k[this.anInt7379];
		for (@Pc(9) int local9 = 0; local9 < this.anInt7379; local9++) {
			this.aKArray1[local9] = new k(this, this.anInt7378, this.anInt7377);
		}
	}

	@OriginalMember(owner = "client!w", name = "JA", descriptor = "(F)V")
	public native void JA(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!w", name = "MA", descriptor = "([I)V")
	public native void MA(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!w", name = "SA", descriptor = "(Lclient!c;)V")
	public native void SA(@OriginalArg(0) Class34 arg0);

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(II)I")
	@Override
	public int method5822(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!w", name = "d", descriptor = "(II)V")
	public native void d(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!w", name = "ZA", descriptor = "(IIIII)V")
	protected native void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method5811(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.ma(arg0, arg1, arg2, arg4, arg5);
		this.ma(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.IA(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
		this.IA(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
	}

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(I)V")
	@Override
	public void method5826(@OriginalArg(0) int arg0) {
		this.aKArray1[arg0].method3215();
	}

	@OriginalMember(owner = "client!w", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5880(@OriginalArg(0) Canvas arg0) {
		@Pc(8) b local8 = (b) this.aClass167_35.method3709((long) arg0.hashCode());
		if (local8 != null) {
			return;
		}
		try {
			@Pc(13) Class local13 = Class.forName("java.awt.Canvas");
			@Pc(23) Method local23 = local13.getMethod("setIgnoreRepaint", Boolean.TYPE);
			local23.invoke(arg0, Boolean.TRUE);
		} catch (@Pc(35) Exception local35) {
		}
		local8 = new b(this, arg0);
		this.aClass167_35.method3705(local8, (long) arg0.hashCode());
	}

	@OriginalMember(owner = "client!w", name = "va", descriptor = "()V")
	public native void va();

	@OriginalMember(owner = "client!w", name = "l", descriptor = "(SBBZZZBBBIIZZ)V")
	private native void l(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12);

	@OriginalMember(owner = "client!w", name = "m", descriptor = "(S)Z")
	private boolean method5884(@OriginalArg(0) short arg0) {
		@Pc(2) Interface7 local2 = super.anInterface7_8;
		synchronized (super.anInterface7_8) {
			if (!super.anInterface7_8.method4450(arg0)) {
				return false;
			}
			@Pc(22) Class259 local22 = super.anInterface7_8.method4447(arg0);
			if (local22 == null) {
				return false;
			}
			@Pc(46) int[] local46;
			if (local22.aBoolean476 && local22.aBoolean475) {
				local46 = super.anInterface7_8.method4448(true, 128, 0.7F, arg0, 128);
			} else {
				local46 = super.anInterface7_8.method4451(128, arg0, 0.7F, 128);
			}
			this.J(arg0, local22.aByte99, local22.aByte102, local22.aBoolean475, local22.aBoolean476, local22.aBoolean479, local22.aByte101, local22.aByte104, local22.aByte100, local22.aShort108, local22.anInt7252, local22.aBoolean477, local22.aBoolean480, local46);
			return true;
		}
	}

	@OriginalMember(owner = "client!w", name = "g", descriptor = "()V")
	@Override
	public void method5828() {
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(II)I")
	@Override
	public int method5856(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 & 0xFFFFF;
		@Pc(7) int local7 = arg1 & 0xFFFFF;
		return local3 & local7 ^ local7;
	}

	@OriginalMember(owner = "client!w", name = "VA", descriptor = "(IIIIII)Z")
	public native boolean VA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!w", name = "K", descriptor = "(IIIIII[BII)V")
	public native void K(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5825(@OriginalArg(0) Canvas arg0) {
		@Pc(8) b local8 = (b) this.aClass167_35.method3709((long) arg0.hashCode());
		@Pc(11) Dimension local11 = arg0.getSize();
		local8.U(arg0, local11.width, local11.height);
		if (arg0 != null && arg0 == this.aB1.aCanvas1) {
			this.method5827(arg0);
		}
	}

	@OriginalMember(owner = "client!w", name = "B", descriptor = "(IFFFFF)V")
	public native void B(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!pn;IIII)Lclient!e;")
	@Override
	public Class63 method5864(@OriginalArg(0) Class192 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new xa(this, this.aG1, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!w", name = "GA", descriptor = "(IIII)V")
	public native void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!w", name = "q", descriptor = "()Z")
	@Override
	public boolean method5850() {
		return false;
	}

	@OriginalMember(owner = "client!w", name = "s", descriptor = "()I")
	@Override
	public int method5854() {
		return 4;
	}

	@OriginalMember(owner = "client!w", name = "m", descriptor = "()V")
	@Override
	public void method5844() {
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIF)Lclient!bk;")
	@Override
	public Class10_Sub4 method5872(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class10_Sub4_Sub2(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "()Z")
	@Override
	public boolean method5810() {
		return false;
	}

	@OriginalMember(owner = "client!w", name = "ya", descriptor = "(I)V")
	public native void ya(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!qg;Lclient!qg;FLclient!qg;)Lclient!qg;")
	@Override
	public Class30 method5847(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class30 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class30 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!w", name = "o", descriptor = "()V")
	@Override
	public void method5848() {
	}

	@OriginalMember(owner = "client!w", name = "R", descriptor = "()V")
	private void method5885() {
		System.gc();
		System.runFinalization();
		Static408.method5373();
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(II[I[I)Lclient!ta;")
	@Override
	public Class49 method5863(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new va(this, this.aG1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!w", name = "e", descriptor = "(I)V")
	@Override
	public void method5842(@OriginalArg(0) int arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIILclient!ta;II)V")
	@Override
	public void method5857(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class49 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.NA(arg0, arg1, arg2, arg3, arg4, 1, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!w", name = "t", descriptor = "(I)V")
	public native void t(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(IIII)V")
	@Override
	public void method5849(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!w", name = "IA", descriptor = "(IIIII)V")
	public native void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!w", name = "ra", descriptor = "(ILclient!ta;II)V")
	public native void ra(@OriginalArg(0) int arg0, @OriginalArg(1) Class49 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!w", name = "y", descriptor = "()Z")
	@Override
	public boolean method5876() {
		return true;
	}

	@OriginalMember(owner = "client!w", name = "WA", descriptor = "(I[I[F)V")
	private native void WA(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) float[] arg2);

	@OriginalMember(owner = "client!w", name = "p", descriptor = "()V")
	public native void p();

	@OriginalMember(owner = "client!w", name = "a", descriptor = "([Lclient!e;Lclient!ip;Lclient!c;[Lclient!pr;I)V")
	@Override
	public void method5873(@OriginalArg(0) Class63[] arg0, @OriginalArg(1) Class121 arg1, @OriginalArg(2) Class34 arg2, @OriginalArg(3) Class40_Sub8[] arg3, @OriginalArg(4) int arg4) {
		this.method5887(arg1, true);
		if (arg3 == null) {
			this.method5886().D(this, arg0, arg2, null, arg4, Static441.anIntArray725, Static441.anIntArray724, Static441.anIntArray721, Static441.aShortArray115, Static441.aByteArray93, arg1.aClass197_1.method4413(), Static441.anIntArray720);
		} else {
			@Pc(28) Class40_Sub8 local28 = arg3[0];
			Static441.anIntArray722[5] = 0;
			this.method5886().D(this, arg0, arg2, Static441.anIntArray722, arg4, Static441.anIntArray725, Static441.anIntArray724, Static441.anIntArray721, Static441.aShortArray115, Static441.aByteArray93, arg1.aClass197_1.method4413(), Static441.anIntArray720);
			local28.anInt5480 = Static441.anIntArray722[0];
			local28.anInt5479 = Static441.anIntArray722[1];
			local28.anInt5482 = Static441.anIntArray722[2];
			local28.anInt5478 = Static441.anIntArray722[3];
			local28.anInt5481 = Static441.anIntArray722[4];
			local28.aBoolean362 = Static441.anIntArray722[5] != 0;
		}
		@Pc(86) int local86 = 0;
		for (@Pc(88) int local88 = 0; local88 < arg0.length; local88++) {
			if (arg0[local88] != null) {
				@Pc(98) xa local98 = (xa) arg0[local88];
				local98.method6104(local86, arg2);
				if (local98.aClass78Array4 != null) {
					local86 += local98.aClass78Array4.length * 9;
				}
				if (local98.aClass141Array4 != null) {
					local86 += local98.aClass141Array4.length * 3;
				}
			}
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(FFF)V")
	@Override
	public void method5814(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!w", name = "Q", descriptor = "(III)V")
	public native void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5871(@OriginalArg(0) Canvas arg0) {
		if (this.aB1.aCanvas1 == arg0) {
			this.method5827(null);
		}
		@Pc(16) b local16 = (b) this.aClass167_35.method3709((long) arg0.hashCode());
		if (local16 != null) {
			local16.method6033();
			local16.method297();
		}
	}

	@OriginalMember(owner = "client!w", name = "C", descriptor = "()Lclient!k;")
	public k method5886() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt7379; local1++) {
			if (this.aKArray1[local1].aRunnable2 == Thread.currentThread()) {
				return this.aKArray1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!e;Lclient!ip;Lclient!c;Lclient!pr;I)V")
	@Override
	public void method5845(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class121 arg1, @OriginalArg(2) Class34 arg2, @OriginalArg(3) Class40_Sub8 arg3) {
		this.method5887(arg1, true);
		if (arg3 == null) {
			this.method5886().FA(this, arg0, arg2, null, 0, Static441.anIntArray725, Static441.anIntArray724, Static441.anIntArray721, Static441.aShortArray115, Static441.aByteArray93, arg1.aClass197_1.method4413(), Static441.anIntArray720);
		} else {
			Static441.anIntArray722[5] = 0;
			this.method5886().FA(this, arg0, arg2, Static441.anIntArray722, 0, Static441.anIntArray725, Static441.anIntArray724, Static441.anIntArray721, Static441.aShortArray115, Static441.aByteArray93, arg1.aClass197_1.method4413(), Static441.anIntArray720);
			arg3.anInt5480 = Static441.anIntArray722[0];
			arg3.anInt5479 = Static441.anIntArray722[1];
			arg3.anInt5482 = Static441.anIntArray722[2];
			arg3.anInt5478 = Static441.anIntArray722[3];
			arg3.anInt5481 = Static441.anIntArray722[4];
			arg3.aBoolean362 = Static441.anIntArray722[5] != 0;
		}
		@Pc(83) xa local83 = (xa) arg0;
		local83.method6104(0, arg2);
	}

	@OriginalMember(owner = "client!w", name = "ua", descriptor = "()V")
	private native void ua();

	@OriginalMember(owner = "client!w", name = "s", descriptor = "(IIII)V")
	public native void s(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!w", name = "n", descriptor = "()V")
	public native void n();

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(II[[I[[IIII)Lclient!ya;")
	@Override
	public Class154 method5816(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new fa(this, this.aG1, arg0, arg1, arg2, arg3, 128, arg4, arg5);
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(I)V")
	@Override
	public void method5818(@OriginalArg(0) int arg0) {
		Static408.method5373();
		this.u(arg0);
		for (@Pc(10) g local10 = (g) this.aClass163_45.method3620(); local10 != null; local10 = (g) this.aClass163_45.method3621()) {
			local10.T();
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!ip;Z)V")
	private void method5887(@OriginalArg(0) Class121 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(15) Class40_Sub2_Sub1 local15 = (Class40_Sub2_Sub1) arg0.aClass197_1.method4418(); local15 != null; local15 = (Class40_Sub2_Sub1) arg0.aClass197_1.method4414()) {
			Static441.anIntArray725[local1++] = local15.anInt1779;
			Static441.anIntArray725[local1++] = local15.anInt1780;
			Static441.anIntArray725[local1++] = local15.anInt1778;
			Static441.anIntArray724[local3++] = local15.anInt1781;
			Static441.aShortArray115[local7++] = (short) local15.anInt1783;
			Static441.anIntArray721[local5++] = local15.anInt1782;
			if (arg1) {
				Static441.aByteArray93[local9++] = local15.aByte13;
			}
		}
	}

	@OriginalMember(owner = "client!w", name = "sa", descriptor = "(IIII)[I")
	public native int[] sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5827(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aB1 = null;
			this.e(null);
		} else {
			@Pc(10) b local10 = (b) this.aClass167_35.method3709((long) arg0.hashCode());
			this.aB1 = local10;
			this.e(local10);
		}
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(Z)V")
	@Override
	public void method5866(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!w", name = "QA", descriptor = "(Lclient!n;)V")
	private native void QA(@OriginalArg(0) Class10_Sub29 arg0);

	@OriginalMember(owner = "client!w", name = "v", descriptor = "()V")
	@Override
	public void method5862() {
	}

	@OriginalMember(owner = "client!w", name = "z", descriptor = "()V")
	@Override
	public void method5877() {
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method5865(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		if (this.aB1 == null) {
			throw new IllegalStateException("off");
		}
		this.aB1.method298(arg0, arg1);
	}

	@OriginalMember(owner = "client!w", name = "da", descriptor = "(FF)V")
	public native void da(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIZ)Lclient!o;")
	@Override
	public Class80 method5838(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return arg4 ? new v(this, this.aG1, arg0, arg1, arg2, arg3) : new ca(this, this.aG1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!w", name = "d", descriptor = "(IIIIII)Lclient!qg;")
	@Override
	public Class30 method5851(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!w", name = "d", descriptor = "()Lclient!c;")
	@Override
	public Class34 method5819() {
		return this.aClass34_7;
	}

	@OriginalMember(owner = "client!w", name = "HA", descriptor = "(IIII)V")
	public native void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!w", name = "AA", descriptor = "()I")
	public native int AA();

	@OriginalMember(owner = "client!w", name = "OA", descriptor = "()I")
	public native int OA();

	@OriginalMember(owner = "client!w", name = "Y", descriptor = "()I")
	public native int Y();

	@OriginalMember(owner = "client!w", name = "e", descriptor = "(Lclient!b;)V")
	private native void e(@OriginalArg(0) b arg0);

	@OriginalMember(owner = "client!w", name = "l", descriptor = "()Z")
	@Override
	public boolean method5843() {
		return true;
	}

	@OriginalMember(owner = "client!w", name = "x", descriptor = "()Z")
	@Override
	public boolean method5875() {
		return true;
	}

	@OriginalMember(owner = "client!w", name = "e", descriptor = "()V")
	@Override
	public void method5821() {
		if (this.aB1 == null) {
			throw new IllegalStateException("off");
		}
		this.aB1.method296();
	}

	@OriginalMember(owner = "client!w", name = "finalize", descriptor = "()V")
	@Override
	public synchronized void finalize() {
		this.method5815();
		if (this.nativeid != 0L) {
			Static408.method5372(this);
		}
	}

	@OriginalMember(owner = "client!w", name = "h", descriptor = "()Lclient!c;")
	@Override
	public Class34 method5829() {
		return new qa();
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!ef;Z)Lclient!o;")
	@Override
	public Class80 method5861(@OriginalArg(0) Class66 arg0) {
		@Pc(2) int[] local2 = arg0.anIntArray150;
		@Pc(5) byte[] local5 = arg0.aByteArray15;
		@Pc(8) int local8 = arg0.anInt1861;
		@Pc(11) int local11 = arg0.anInt1862;
		@Pc(32) Class80 local32;
		if (arg0.aByteArray16 == null) {
			local32 = new q(this, this.aG1, local2, local5, 0, arg0.anInt1861, arg0.anInt1861, arg0.anInt1862);
		} else {
			@Pc(37) int local37 = local8 * local11;
			@Pc(40) int[] local40 = new int[local37];
			@Pc(43) byte[] local43 = arg0.aByteArray16;
			@Pc(52) int local52;
			@Pc(54) int local54;
			if (local43 == null) {
				@Pc(100) boolean local100 = false;
				for (local52 = 0; local52 < local37; local52++) {
					local54 = arg0.anIntArray150[local5[local52] & 0xFF];
					if (local54 >>> 24 != 255) {
						local100 = true;
					}
					local40[local52] = local54;
				}
				if (local100) {
					local32 = new v(this, this.aG1, local40, 0, arg0.anInt1861, arg0.anInt1861, arg0.anInt1862);
				} else {
					local32 = new ca(this, this.aG1, local40, 0, arg0.anInt1861, arg0.anInt1861, arg0.anInt1862);
				}
			} else {
				for (@Pc(47) int local47 = 0; local47 < local11; local47++) {
					local52 = local47 * local8;
					for (local54 = 0; local54 < local8; local54++) {
						local40[local52 + local54] = local2[local5[local52 + local54] & 0xFF] | local43[local52 + local54] << 24;
					}
				}
				local32 = new v(this, this.aG1, local40, 0, local8, local8, local11);
			}
		}
		local32.ha(arg0.anInt1865, arg0.anInt1864, arg0.anInt1863, arg0.anInt1866);
		return local32;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!qg;)V")
	@Override
	public void method5835(@OriginalArg(0) Class30 arg0) {
	}

	@OriginalMember(owner = "client!w", name = "A", descriptor = "(IIIIII)V")
	private native void A(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!w", name = "t", descriptor = "()Z")
	@Override
	public boolean method5859() {
		return true;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Z)V")
	@Override
	public void method5837(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!w", name = "qa", descriptor = "()Ljava/lang/Object;")
	private Object method5888() {
		return new pa(this);
	}

	@OriginalMember(owner = "client!w", name = "f", descriptor = "()Z")
	@Override
	public boolean method5824() {
		return true;
	}
}
