import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!w")
public final class w extends Class200 implements Interface11 {

	@OriginalMember(owner = "client!w", name = "v", descriptor = "Lclient!g;")
	private g aG1;

	@OriginalMember(owner = "client!w", name = "C", descriptor = "Lclient!b;")
	private b aB1;

	@OriginalMember(owner = "client!w", name = "O", descriptor = "I")
	private int anInt7346;

	@OriginalMember(owner = "client!w", name = "P", descriptor = "[Lclient!k;")
	private k[] aKArray1;

	@OriginalMember(owner = "client!w", name = "nativeid", descriptor = "J")
	private final long nativeid = 0L;

	@OriginalMember(owner = "client!w", name = "w", descriptor = "Z")
	private boolean aBoolean492 = false;

	@OriginalMember(owner = "client!w", name = "t", descriptor = "Lclient!nv;")
	private final Class177 aClass177_48 = new Class177();

	@OriginalMember(owner = "client!w", name = "x", descriptor = "I")
	private final int anInt7344 = 4096;

	@OriginalMember(owner = "client!w", name = "K", descriptor = "I")
	private final int anInt7345 = 4096;

	@OriginalMember(owner = "client!w", name = "E", descriptor = "Lclient!vg;")
	private final Class252 aClass252_40 = new Class252(4);

	@OriginalMember(owner = "client!w", name = "N", descriptor = "Z")
	private boolean aBoolean494 = false;

	@OriginalMember(owner = "client!w", name = "y", descriptor = "Lclient!c;")
	private Class29 aClass29_8;

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lclient!l;Lclient!gt;)V")
	public w(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Interface8 arg2, @OriginalArg(3) Class93 arg3) {
		super(arg0, arg2);
		try {
			if (!Static443.aBoolean493) {
				if (arg3 == null) {
					System.loadLibrary("jawt");
					System.loadLibrary("sw3d");
					Static443.aBoolean493 = Boolean.TRUE;
				} else {
					arg3.method2078(this.getClass());
					Static443.aBoolean493 = Boolean.TRUE;
				}
			}
			if (!Static443.aBoolean493) {
				throw new RuntimeException("");
			}
			this.W(super.anInterface8_134, 0, 0);
			Static209.method2788(true, false);
			this.aBoolean494 = true;
			this.aClass29_8 = new qa();
			this.SA(new qa());
			this.method5845(1);
			this.method5838(0);
			if (arg1 != null) {
				this.method5840(arg1);
				this.method5878(arg1);
			}
		} catch (@Pc(95) Throwable local95) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method5834(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method5892().q(this, arg0, arg1, arg2, arg3, arg4, arg5, 0);
	}

	@OriginalMember(owner = "client!w", name = "ua", descriptor = "()V")
	private native void ua();

	@OriginalMember(owner = "client!w", name = "w", descriptor = "()Lclient!c;")
	@Override
	public Class29 method5880() {
		return new qa();
	}

	@OriginalMember(owner = "client!w", name = "X", descriptor = "(S)Z")
	private boolean method5888(@OriginalArg(0) short arg0) {
		synchronized (this) {
			@Pc(9) Class178 local9 = super.anInterface8_134.method4125(arg0);
			if (local9 == null) {
				return false;
			} else {
				this.l(arg0, local9.aByte53, local9.aByte52, local9.aBoolean326, local9.aBoolean321, local9.aBoolean318, local9.aByte54, local9.aByte50, local9.aByte55, local9.aShort54, local9.anInt4614, local9.aBoolean327, local9.aBoolean319);
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!w", name = "T", descriptor = "()F")
	public native float T();

	@OriginalMember(owner = "client!w", name = "d", descriptor = "()V")
	@Override
	public void method5818() {
	}

	@OriginalMember(owner = "client!w", name = "ya", descriptor = "(I)V")
	public native void ya(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!w", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method5877(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		if (this.aB1 == null) {
			throw new IllegalStateException("off");
		}
		this.aB1.method430(arg0, arg1);
	}

	@OriginalMember(owner = "client!w", name = "JA", descriptor = "(F)V")
	public native void JA(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!w", name = "g", descriptor = "()V")
	@Override
	public void method5829() {
	}

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(I)V")
	@Override
	public void method5845(@OriginalArg(0) int arg0) {
		this.anInt7346 = arg0;
		this.aKArray1 = new k[this.anInt7346];
		for (@Pc(9) int local9 = 0; local9 < this.anInt7346; local9++) {
			this.aKArray1[local9] = new k(this, this.anInt7344, this.anInt7345);
		}
	}

	@OriginalMember(owner = "client!w", name = "NA", descriptor = "(IIIIIILclient!ta;II)V")
	private native void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class97 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!w", name = "P", descriptor = "(IIIIII)V")
	public native void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!w", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5878(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aB1 = null;
			this.e(null);
		} else {
			@Pc(10) b local10 = (b) this.aClass252_40.method5659((long) arg0.hashCode());
			this.aB1 = local10;
			this.e(local10);
		}
	}

	@OriginalMember(owner = "client!w", name = "l", descriptor = "()Z")
	@Override
	public boolean method5844() {
		return false;
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(Z)V")
	@Override
	public void method5859(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!w", name = "m", descriptor = "()Z")
	@Override
	public boolean method5850() {
		return true;
	}

	@OriginalMember(owner = "client!w", name = "s", descriptor = "(IIII)V")
	public native void s(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!w", name = "K", descriptor = "(IIIIII[BII)V")
	public native void K(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!w", name = "Y", descriptor = "()I")
	public native int Y();

	@OriginalMember(owner = "client!w", name = "finalize", descriptor = "()V")
	@Override
	public synchronized void finalize() {
		this.method5827();
		if (this.nativeid != 0L) {
			Static155.method2188(this);
		}
	}

	@OriginalMember(owner = "client!w", name = "d", descriptor = "(II)V")
	public native void d(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!w", name = "s", descriptor = "()Z")
	@Override
	public boolean method5862() {
		return false;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(II[I[I)Lclient!ta;")
	@Override
	public Class97 method5847(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new va(this, this.aG1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(FFF)V")
	@Override
	public void method5820(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5831(@OriginalArg(0) Canvas arg0) {
		@Pc(8) b local8 = (b) this.aClass252_40.method5659((long) arg0.hashCode());
		@Pc(11) Dimension local11 = arg0.getSize();
		local8.U(arg0, local11.width, local11.height);
		if (arg0 != null && arg0 == this.aB1.aCanvas1) {
			this.method5878(arg0);
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(I[Lclient!rd;)V")
	@Override
	public void method5846(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub19[] arg1) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			Static443.anIntArray495[local1++] = arg1[local3].method4977();
			Static443.anIntArray495[local1++] = arg1[local3].method4981();
			Static443.anIntArray495[local1++] = arg1[local3].method4979();
			Static443.anIntArray495[local1++] = arg1[local3].method4982();
			Static443.aFloatArray31[local3] = arg1[local3].method4974();
			Static443.anIntArray495[local1++] = arg1[local3].method4975();
		}
		this.WA(arg0, Static443.anIntArray495, Static443.aFloatArray31);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "([IIIII)Lclient!o;")
	@Override
	public Class49 method5849(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
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

	@OriginalMember(owner = "client!w", name = "i", descriptor = "()Z")
	@Override
	public boolean method5833() {
		return false;
	}

	@OriginalMember(owner = "client!w", name = "h", descriptor = "()Z")
	@Override
	public boolean method5832() {
		return false;
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(IIII)V")
	@Override
	public void method5830(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method5828() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!w", name = "d", descriptor = "(I)V")
	@Override
	public void method5848(@OriginalArg(0) int arg0) {
		this.aKArray1[arg0].method2802();
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!bn;)V")
	@Override
	public void method5826(@OriginalArg(0) Class24 arg0) {
	}

	@OriginalMember(owner = "client!w", name = "B", descriptor = "()V")
	@Override
	public void method5887() {
	}

	@OriginalMember(owner = "client!w", name = "c", descriptor = "()Z")
	@Override
	public boolean method5816() {
		return true;
	}

	@OriginalMember(owner = "client!w", name = "R", descriptor = "()V")
	private void method5889() {
		System.gc();
		System.runFinalization();
		Static155.method2187();
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "()V")
	@Override
	public void method5813() {
		if (this.aB1 == null) {
			throw new IllegalStateException("off");
		}
		this.aB1.method427();
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "([Lclient!e;Lclient!vm;Lclient!c;[Lclient!wg;I)V")
	@Override
	public void method5874(@OriginalArg(0) Class57[] arg0, @OriginalArg(1) Class255 arg1, @OriginalArg(2) Class29 arg2, @OriginalArg(3) Class88_Sub8[] arg3, @OriginalArg(4) int arg4) {
		this.method5891(arg1, true);
		if (arg3 == null) {
			this.method5892().D(this, arg0, arg2, null, arg4, Static443.anIntArray496, Static443.anIntArray499, Static443.anIntArray497, Static443.aShortArray113, Static443.aByteArray94, arg1.aClass225_1.method4941(), Static443.anIntArray494);
		} else {
			@Pc(28) Class88_Sub8 local28 = arg3[0];
			Static443.anIntArray498[5] = 0;
			this.method5892().D(this, arg0, arg2, Static443.anIntArray498, arg4, Static443.anIntArray496, Static443.anIntArray499, Static443.anIntArray497, Static443.aShortArray113, Static443.aByteArray94, arg1.aClass225_1.method4941(), Static443.anIntArray494);
			local28.anInt7384 = Static443.anIntArray498[0];
			local28.anInt7387 = Static443.anIntArray498[1];
			local28.anInt7385 = Static443.anIntArray498[2];
			local28.anInt7388 = Static443.anIntArray498[3];
			local28.anInt7386 = Static443.anIntArray498[4];
			local28.aBoolean496 = Static443.anIntArray498[5] != 0;
		}
		@Pc(86) int local86 = 0;
		for (@Pc(88) int local88 = 0; local88 < arg0.length; local88++) {
			if (arg0[local88] != null) {
				@Pc(98) xa local98 = (xa) arg0[local88];
				local98.method6075(local86, arg2);
				if (local98.aClass179Array4 != null) {
					local86 += local98.aClass179Array4.length * 9;
				}
				if (local98.aClass236Array4 != null) {
					local86 += local98.aClass236Array4.length * 3;
				}
			}
		}
	}

	@OriginalMember(owner = "client!w", name = "l", descriptor = "(SBBZZZBBBIIZZ)V")
	private native void l(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12);

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIILclient!ta;II)V")
	@Override
	public void method5870(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class97 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.NA(arg0, arg1, arg2, arg3, arg4, 1, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!w", name = "Q", descriptor = "(III)V")
	public native void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!n;)V")
	@Override
	public void method5822(@OriginalArg(0) Class5_Sub28 arg0) {
		this.aG1 = (g) arg0;
		this.QA(arg0);
	}

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5868(@OriginalArg(0) Canvas arg0) {
		if (this.aB1.aCanvas1 == arg0) {
			this.method5878(null);
		}
		@Pc(16) b local16 = (b) this.aClass252_40.method5659((long) arg0.hashCode());
		if (local16 != null) {
			local16.method6003();
			local16.method429();
		}
	}

	@OriginalMember(owner = "client!w", name = "AA", descriptor = "()I")
	public native int AA();

	@OriginalMember(owner = "client!w", name = "u", descriptor = "()Lclient!c;")
	@Override
	public Class29 method5866() {
		return this.aClass29_8;
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5840(@OriginalArg(0) Canvas arg0) {
		@Pc(8) b local8 = (b) this.aClass252_40.method5659((long) arg0.hashCode());
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
		this.aClass252_40.method5658(local8, (long) arg0.hashCode());
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(II[[I[[IIII)Lclient!ya;")
	@Override
	public Class125 method5841(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new fa(this, this.aG1, arg0, arg1, arg2, arg3, 128, arg4, arg5);
	}

	@OriginalMember(owner = "client!w", name = "GA", descriptor = "(IIII)V")
	public native void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!ap;[Lclient!rr;Z)Lclient!la;")
	@Override
	public Class23 method5837(@OriginalArg(0) Class14 arg0, @OriginalArg(1) Class214[] arg1) {
		return new ra(this, this.aG1, arg0, arg1, null);
	}

	@OriginalMember(owner = "client!w", name = "pa", descriptor = "()I")
	public native int pa();

	@OriginalMember(owner = "client!w", name = "k", descriptor = "()Z")
	@Override
	public boolean method5839() {
		return false;
	}

	@OriginalMember(owner = "client!w", name = "MA", descriptor = "([I)V")
	public native void MA(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!w", name = "J", descriptor = "(SBBZZZBBBIIZZ[I)V")
	private native void J(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) int[] arg13);

	@OriginalMember(owner = "client!w", name = "r", descriptor = "()I")
	public native int r();

	@OriginalMember(owner = "client!w", name = "IA", descriptor = "(IIIII)V")
	public native void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(I)V")
	@Override
	public void method5838(@OriginalArg(0) int arg0) {
		this.aKArray1[arg0].method2801();
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!bn;Lclient!bn;FLclient!bn;)Lclient!bn;")
	@Override
	public Class24 method5823(@OriginalArg(0) Class24 arg0, @OriginalArg(1) Class24 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class24 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!w", name = "A", descriptor = "(IIIIII)V")
	private native void A(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!w", name = "u", descriptor = "(I)V")
	private native void u(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!w", name = "a", descriptor = "()Z")
	@Override
	public boolean method5812() {
		return true;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!fe;IIII)Lclient!e;")
	@Override
	public Class57 method5882(@OriginalArg(0) Class74 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new xa(this, this.aG1, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!w", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method5861(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.A(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!w", name = "z", descriptor = "()V")
	@Override
	protected void method5885() {
		if (this.aBoolean492) {
			return;
		}
		this.aKArray1 = null;
		this.aB1 = null;
		this.aG1 = null;
		this.aClass29_8 = null;
		this.aClass252_40.method5661();
		for (@Pc(25) g local25 = (g) this.aClass177_48.method3618(); local25 != null; local25 = (g) this.aClass177_48.method3619()) {
			local25.IA();
		}
		this.aClass177_48.method3614();
		this.ua();
		if (this.aBoolean494) {
			Static356.method4615(false, true);
			this.aBoolean494 = false;
		}
		this.method5889();
		Static155.method2190();
		this.aBoolean492 = true;
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(II)I")
	@Override
	public int method5879(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!w", name = "m", descriptor = "(S)Z")
	private boolean method5890(@OriginalArg(0) short arg0) {
		@Pc(2) Interface8 local2 = super.anInterface8_134;
		synchronized (super.anInterface8_134) {
			if (!super.anInterface8_134.method4123(arg0)) {
				return false;
			}
			@Pc(22) Class178 local22 = super.anInterface8_134.method4125(arg0);
			if (local22 == null) {
				return false;
			}
			@Pc(46) int[] local46;
			if (local22.aBoolean321 && local22.aBoolean326) {
				local46 = super.anInterface8_134.method4126(128, arg0, 128, true, 0.7F);
			} else {
				local46 = super.anInterface8_134.method4124(arg0, 128, 128, 0.7F);
			}
			this.J(arg0, local22.aByte53, local22.aByte52, local22.aBoolean326, local22.aBoolean321, local22.aBoolean318, local22.aByte54, local22.aByte50, local22.aByte55, local22.aShort54, local22.anInt4614, local22.aBoolean327, local22.aBoolean319, local46);
			return true;
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!vm;Z)V")
	private void method5891(@OriginalArg(0) Class255 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(15) Class88_Sub1_Sub1 local15 = (Class88_Sub1_Sub1) arg0.aClass225_1.method4938(); local15 != null; local15 = (Class88_Sub1_Sub1) arg0.aClass225_1.method4943()) {
			Static443.anIntArray496[local1++] = local15.anInt2368;
			Static443.anIntArray496[local1++] = local15.anInt2372;
			Static443.anIntArray496[local1++] = local15.anInt2373;
			Static443.anIntArray499[local3++] = local15.anInt2366;
			Static443.aShortArray113[local7++] = (short) local15.anInt2371;
			Static443.anIntArray497[local5++] = local15.anInt2367;
			if (arg1) {
				Static443.aByteArray94[local9++] = local15.aByte23;
			}
		}
	}

	@OriginalMember(owner = "client!w", name = "v", descriptor = "()Z")
	@Override
	public boolean method5873() {
		return true;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIII)V")
	public native void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!w", name = "f", descriptor = "()Z")
	@Override
	public boolean method5825() {
		return false;
	}

	@OriginalMember(owner = "client!w", name = "q", descriptor = "()Z")
	@Override
	public boolean method5853() {
		return true;
	}

	@OriginalMember(owner = "client!w", name = "W", descriptor = "(Lclient!l;II)V")
	private native void W(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!w", name = "ZA", descriptor = "(IIIII)V")
	protected native void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!w", name = "ma", descriptor = "(IIIII)V")
	public native void ma(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!w", name = "t", descriptor = "(I)V")
	public native void t(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!w", name = "A", descriptor = "()Z")
	@Override
	public boolean method5886() {
		return true;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIF)Lclient!rd;")
	@Override
	public Class5_Sub19 method5858(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class5_Sub19_Sub2(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!w", name = "t", descriptor = "()Z")
	@Override
	public boolean method5864() {
		return true;
	}

	@OriginalMember(owner = "client!w", name = "ba", descriptor = "(IIII)V")
	public native void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!w", name = "o", descriptor = "()I")
	@Override
	public int method5852() {
		return 4;
	}

	@OriginalMember(owner = "client!w", name = "e", descriptor = "()Z")
	@Override
	public boolean method5821() {
		return true;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!rr;Z)Lclient!o;")
	@Override
	public Class49 method5871(@OriginalArg(0) Class214 arg0) {
		@Pc(2) int[] local2 = arg0.anIntArray419;
		@Pc(5) byte[] local5 = arg0.aByteArray75;
		@Pc(8) int local8 = arg0.anInt5882;
		@Pc(11) int local11 = arg0.anInt5885;
		@Pc(32) Class49 local32;
		if (arg0.aByteArray76 == null) {
			local32 = new q(this, this.aG1, local2, local5, 0, arg0.anInt5882, arg0.anInt5882, arg0.anInt5885);
		} else {
			@Pc(37) int local37 = local8 * local11;
			@Pc(40) int[] local40 = new int[local37];
			@Pc(43) byte[] local43 = arg0.aByteArray76;
			@Pc(52) int local52;
			@Pc(54) int local54;
			if (local43 == null) {
				@Pc(100) boolean local100 = false;
				for (local52 = 0; local52 < local37; local52++) {
					local54 = arg0.anIntArray419[local5[local52] & 0xFF];
					if (local54 >>> 24 != 255) {
						local100 = true;
					}
					local40[local52] = local54;
				}
				if (local100) {
					local32 = new v(this, this.aG1, local40, 0, arg0.anInt5882, arg0.anInt5882, arg0.anInt5885);
				} else {
					local32 = new ca(this, this.aG1, local40, 0, arg0.anInt5882, arg0.anInt5882, arg0.anInt5885);
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
		local32.ha(arg0.anInt5884, arg0.anInt5881, arg0.anInt5883, arg0.anInt5880);
		return local32;
	}

	@OriginalMember(owner = "client!w", name = "aa", descriptor = "()F")
	public native float aa();

	@OriginalMember(owner = "client!w", name = "C", descriptor = "()Lclient!k;")
	public k method5892() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt7346; local1++) {
			if (this.aKArray1[local1].aRunnable1 == Thread.currentThread()) {
				return this.aKArray1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!w", name = "va", descriptor = "()V")
	public native void va();

	@OriginalMember(owner = "client!w", name = "VA", descriptor = "(IIIIII)Z")
	public native boolean VA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!w", name = "e", descriptor = "(Lclient!b;)V")
	private native void e(@OriginalArg(0) b arg0);

	@OriginalMember(owner = "client!w", name = "p", descriptor = "()V")
	public native void p();

	@OriginalMember(owner = "client!w", name = "y", descriptor = "()V")
	@Override
	public void method5883() {
	}

	@OriginalMember(owner = "client!w", name = "j", descriptor = "()Z")
	@Override
	public boolean method5835() {
		return false;
	}

	@OriginalMember(owner = "client!w", name = "SA", descriptor = "(Lclient!c;)V")
	public native void SA(@OriginalArg(0) Class29 arg0);

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(IIIIII)Lclient!bn;")
	@Override
	public Class24 method5851(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!e;Lclient!vm;Lclient!c;Lclient!wg;I)V")
	@Override
	public void method5869(@OriginalArg(0) Class57 arg0, @OriginalArg(1) Class255 arg1, @OriginalArg(2) Class29 arg2, @OriginalArg(3) Class88_Sub8 arg3) {
		this.method5891(arg1, true);
		if (arg3 == null) {
			this.method5892().FA(this, arg0, arg2, null, 0, Static443.anIntArray496, Static443.anIntArray499, Static443.anIntArray497, Static443.aShortArray113, Static443.aByteArray94, arg1.aClass225_1.method4941(), Static443.anIntArray494);
		} else {
			Static443.anIntArray498[5] = 0;
			this.method5892().FA(this, arg0, arg2, Static443.anIntArray498, 0, Static443.anIntArray496, Static443.anIntArray499, Static443.anIntArray497, Static443.aShortArray113, Static443.aByteArray94, arg1.aClass225_1.method4941(), Static443.anIntArray494);
			arg3.anInt7384 = Static443.anIntArray498[0];
			arg3.anInt7387 = Static443.anIntArray498[1];
			arg3.anInt7385 = Static443.anIntArray498[2];
			arg3.anInt7388 = Static443.anIntArray498[3];
			arg3.anInt7386 = Static443.anIntArray498[4];
			arg3.aBoolean496 = Static443.anIntArray498[5] != 0;
		}
		@Pc(83) xa local83 = (xa) arg0;
		local83.method6075(0, arg2);
	}

	@OriginalMember(owner = "client!w", name = "n", descriptor = "()V")
	public native void n();

	@OriginalMember(owner = "client!w", name = "QA", descriptor = "(Lclient!n;)V")
	private native void QA(@OriginalArg(0) Class5_Sub28 arg0);

	@OriginalMember(owner = "client!w", name = "sa", descriptor = "(IIII)[I")
	public native int[] sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!vm;)V")
	@Override
	public void method5872(@OriginalArg(0) Class255 arg0) {
		this.method5891(arg0, false);
		this.method5892().J(this, Static443.anIntArray496, Static443.anIntArray499, Static443.anIntArray497, Static443.aShortArray113, arg0.aClass225_1.method4941());
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(II)I")
	@Override
	public int method5860(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 & 0xFFFFF;
		@Pc(7) int local7 = arg1 & 0xFFFFF;
		return local3 & local7 ^ local7;
	}

	@OriginalMember(owner = "client!w", name = "OA", descriptor = "()I")
	public native int OA();

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Z)V")
	@Override
	public void method5819(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!w", name = "v", descriptor = "(III[I)V")
	public native void v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!w", name = "x", descriptor = "()V")
	@Override
	public void method5881() {
	}

	@OriginalMember(owner = "client!w", name = "e", descriptor = "(I)V")
	@Override
	public void method5854(@OriginalArg(0) int arg0) {
		Static155.method2187();
		this.u(arg0);
		for (@Pc(10) g local10 = (g) this.aClass177_48.method3618(); local10 != null; local10 = (g) this.aClass177_48.method3619()) {
			local10.T();
		}
	}

	@OriginalMember(owner = "client!w", name = "f", descriptor = "(I)V")
	@Override
	public void method5884(@OriginalArg(0) int arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!w", name = "B", descriptor = "(IFFFFF)V")
	public native void B(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(Z)V")
	@Override
	public void method5863(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!w", name = "qa", descriptor = "()Ljava/lang/Object;")
	private Object method5893() {
		return new pa(this);
	}

	@OriginalMember(owner = "client!w", name = "HA", descriptor = "(IIII)V")
	public native void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!w", name = "WA", descriptor = "(I[I[F)V")
	private native void WA(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) float[] arg2);

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIZ)Lclient!o;")
	@Override
	public Class49 method5855(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return arg4 ? new v(this, this.aG1, arg0, arg1, arg2, arg3) : new ca(this, this.aG1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method5814(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.ma(arg0, arg1, arg2, arg4, arg5);
		this.ma(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.IA(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
		this.IA(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "([Lclient!e;Lclient!c;[Lclient!wg;I)V")
	@Override
	public void method5843(@OriginalArg(0) Class57[] arg0, @OriginalArg(1) Class29 arg1, @OriginalArg(2) Class88_Sub8[] arg2, @OriginalArg(3) int arg3) {
		if (arg2 == null) {
			this.method5892().va(this, arg0, arg1, null, -1, arg3);
			return;
		}
		@Pc(15) Class88_Sub8 local15 = arg2[0];
		Static443.anIntArray498[5] = 0;
		this.method5892().va(this, arg0, arg1, Static443.anIntArray498, -1, arg3);
		local15.anInt7384 = Static443.anIntArray498[0];
		local15.anInt7387 = Static443.anIntArray498[1];
		local15.anInt7385 = Static443.anIntArray498[2];
		local15.anInt7388 = Static443.anIntArray498[3];
		local15.anInt7386 = Static443.anIntArray498[4];
		local15.aBoolean496 = Static443.anIntArray498[5] != 0;
	}

	@OriginalMember(owner = "client!w", name = "ra", descriptor = "(ILclient!ta;II)V")
	public native void ra(@OriginalArg(0) int arg0, @OriginalArg(1) Class97 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(I)Lclient!n;")
	@Override
	public Class5_Sub28 method5817(@OriginalArg(0) int arg0) {
		@Pc(5) g local5 = new g(this, arg0);
		this.aClass177_48.method3615(local5);
		return local5;
	}

	@OriginalMember(owner = "client!w", name = "da", descriptor = "(FF)V")
	public native void da(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);
}
