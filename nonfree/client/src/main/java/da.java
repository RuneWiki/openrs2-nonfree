import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public final class da extends Class14 implements Interface9 {

	@OriginalMember(owner = "client!da", name = "D", descriptor = "Lclient!a;")
	private a anA1;

	@OriginalMember(owner = "client!da", name = "I", descriptor = "Lclient!v;")
	private v aV1;

	@OriginalMember(owner = "client!da", name = "J", descriptor = "Lclient!q;")
	private Class54 aClass54_2;

	@OriginalMember(owner = "client!da", name = "N", descriptor = "I")
	private int anInt1656;

	@OriginalMember(owner = "client!da", name = "O", descriptor = "[Lclient!t;")
	private t[] aTArray1;

	@OriginalMember(owner = "client!da", name = "s", descriptor = "Z")
	private boolean aBoolean117 = false;

	@OriginalMember(owner = "client!da", name = "nativeid", descriptor = "J")
	private final long nativeid = 0L;

	@OriginalMember(owner = "client!da", name = "t", descriptor = "Lclient!ws;")
	private final Class361 aClass361_8 = new Class361();

	@OriginalMember(owner = "client!da", name = "G", descriptor = "I")
	private final int anInt1654 = 4096;

	@OriginalMember(owner = "client!da", name = "L", descriptor = "I")
	private final int anInt1655 = 4096;

	@OriginalMember(owner = "client!da", name = "H", descriptor = "Lclient!hd;")
	private final Class128 aClass128_5 = new Class128(4);

	@OriginalMember(owner = "client!da", name = "M", descriptor = "Z")
	private boolean aBoolean118 = false;

	@OriginalMember(owner = "client!da", name = "K", descriptor = "Lclient!q;")
	private Class54 aClass54_3;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!e;)V")
	public da(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface4 arg1) {
		super(arg1);
		try {
			if (!Static511.method7084("sw3d")) {
				throw new RuntimeException("");
			}
			Static184.method3379();
			this.PA(super.anInterface4_15, 0, 0);
			Static210.method3727(true, false);
			this.aBoolean118 = true;
			this.aClass54_3 = new wa();
			this.method6829(new wa());
			this.method6905(1);
			this.method6873(0);
			if (arg0 != null) {
				this.method6844(arg0);
				this.method6900(arg0);
			}
		} catch (@Pc(78) Throwable local78) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II[I[I)Lclient!fa;")
	@Override
	public Class86 method6840(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new f(this, this.anA1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method6865(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aV1 == null) {
			throw new IllegalStateException("off");
		}
		this.aV1.method7422(arg0, arg1);
	}

	@OriginalMember(owner = "client!da", name = "i", descriptor = "()V")
	@Override
	public void method6841() {
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!iba;Z)Lclient!xa;")
	@Override
	public Class58 method6889(@OriginalArg(0) Class140 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(2) int[] local2 = arg0.anIntArray259;
		@Pc(5) byte[] local5 = arg0.aByteArray39;
		@Pc(8) int local8 = arg0.anInt4127;
		@Pc(11) int local11 = arg0.anInt4129;
		@Pc(32) Class58 local32;
		if (arg1 && arg0.aByteArray38 == null) {
			local32 = new la(this, this.anA1, local2, local5, 0, arg0.anInt4127, arg0.anInt4127, arg0.anInt4129);
		} else {
			@Pc(37) int local37 = local8 * local11;
			@Pc(40) int[] local40 = new int[local37];
			@Pc(43) byte[] local43 = arg0.aByteArray38;
			@Pc(52) int local52;
			@Pc(54) int local54;
			if (local43 == null) {
				@Pc(100) boolean local100 = false;
				for (local52 = 0; local52 < local37; local52++) {
					local54 = arg0.anIntArray259[local5[local52] & 0xFF];
					if (local54 >>> 24 != 255) {
						local100 = true;
					}
					local40[local52] = local54;
				}
				if (local100) {
					local32 = new aa(this, this.anA1, local40, 0, arg0.anInt4127, arg0.anInt4127, arg0.anInt4129);
				} else {
					local32 = new ja(this, this.anA1, local40, 0, arg0.anInt4127, arg0.anInt4127, arg0.anInt4129);
				}
			} else {
				for (@Pc(47) int local47 = 0; local47 < local11; local47++) {
					local52 = local47 * local8;
					for (local54 = 0; local54 < local8; local54++) {
						local40[local52 + local54] = local2[local5[local52 + local54] & 0xFF] | local43[local52 + local54] << 24;
					}
				}
				local32 = new aa(this, this.anA1, local40, 0, local8, local8, local11);
			}
		}
		local32.EA(arg0.anInt4125, arg0.anInt4126, arg0.anInt4124, arg0.anInt4128);
		return local32;
	}

	@OriginalMember(owner = "client!da", name = "ca", descriptor = "(IIII)V")
	public native void ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "E", descriptor = "()Z")
	@Override
	public boolean method6901() {
		return false;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6823(@OriginalArg(0) Canvas arg0) {
		@Pc(8) v local8 = (v) this.aClass128_5.method3263((long) arg0.hashCode());
		@Pc(11) Dimension local11 = arg0.getSize();
		local8.D(arg0, local11.width, local11.height);
		if (arg0 != null && arg0 == this.aV1.aCanvas15) {
			this.method6900(arg0);
		}
	}

	@OriginalMember(owner = "client!da", name = "ka", descriptor = "(FF)V")
	public native void ka(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!ig;Z)V")
	private void method1591(@OriginalArg(0) Class144 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(15) Class98_Sub1_Sub1 local15 = (Class98_Sub1_Sub1) arg0.aClass254_1.method5858(); local15 != null; local15 = (Class98_Sub1_Sub1) arg0.aClass254_1.method5862()) {
			Static77.anIntArray142[local1++] = local15.anInt9517;
			Static77.anIntArray142[local1++] = local15.anInt9523;
			Static77.anIntArray142[local1++] = local15.anInt9520;
			Static77.anIntArray141[local3++] = local15.anInt9521;
			Static77.aShortArray12[local7++] = (short) local15.anInt9524;
			Static77.anIntArray139[local5++] = local15.anInt9516;
			if (arg1) {
				Static77.aByteArray9[local9++] = local15.aByte106;
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!nj;IIII)Lclient!ba;")
	@Override
	public Class20 method6833(@OriginalArg(0) Class220 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new j(this, this.anA1, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!da", name = "k", descriptor = "()V")
	public native void k();

	@OriginalMember(owner = "client!da", name = "F", descriptor = "()V")
	public native void F();

	@OriginalMember(owner = "client!da", name = "A", descriptor = "()V")
	@Override
	public void method6890() {
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6900(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aV1 = null;
			this.P(null);
		} else {
			@Pc(10) v local10 = (v) this.aClass128_5.method3263((long) arg0.hashCode());
			this.aV1 = local10;
			this.P(local10);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II[[I[[IIII)Lclient!d;")
	@Override
	public Class59 method6857(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new ya(this, this.anA1, arg0, arg1, arg2, arg3, 512, arg4, arg5);
	}

	@OriginalMember(owner = "client!da", name = "g", descriptor = "(I)V")
	@Override
	public void method6905(@OriginalArg(0) int arg0) {
		this.anInt1656 = arg0;
		this.aTArray1 = new t[this.anInt1656];
		for (@Pc(9) int local9 = 0; local9 < this.anInt1656; local9++) {
			this.aTArray1[local9] = new t(this, this.anInt1655, this.anInt1654);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!ip;Lclient!ip;FLclient!ip;)Lclient!ip;")
	@Override
	public Class26 method6870(@OriginalArg(0) Class26 arg0, @OriginalArg(1) Class26 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class26 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!da", name = "m", descriptor = "()Z")
	@Override
	public boolean method6846() {
		return false;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!ub;[Lclient!iba;Z)Lclient!ta;")
	@Override
	public Class92 method6854(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class140[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt4127;
			local7[local11] = arg1[local11].anInt4129;
			if (arg1[local11].aByteArray38 != null) {
				local9 = true;
			}
		}
		if (local9) {
			throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
		}
		return new b(this, this.anA1, arg0, arg1, null);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!i;)V")
	private native void a(@OriginalArg(0) Class6_Sub15 arg0);

	@OriginalMember(owner = "client!da", name = "HA", descriptor = "()Ljava/lang/Object;")
	private Object method1592() {
		return new pa(this);
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6844(@OriginalArg(0) Canvas arg0) {
		@Pc(8) v local8 = (v) this.aClass128_5.method3263((long) arg0.hashCode());
		if (local8 != null) {
			return;
		}
		try {
			@Pc(13) Class local13 = Class.forName("java.awt.Canvas");
			@Pc(23) Method local23 = local13.getMethod("setIgnoreRepaint", Boolean.TYPE);
			local23.invoke(arg0, Boolean.TRUE);
		} catch (@Pc(35) Exception local35) {
		}
		local8 = new v(this, arg0);
		this.aClass128_5.method3267(local8, (long) arg0.hashCode());
	}

	@OriginalMember(owner = "client!da", name = "X", descriptor = "(III)V")
	public native void X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!da", name = "u", descriptor = "()Z")
	@Override
	public boolean method6876() {
		return false;
	}

	@OriginalMember(owner = "client!da", name = "na", descriptor = "(III[I)V")
	public native void na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!da", name = "TA", descriptor = "(Lclient!ja;)V")
	private native void TA(@OriginalArg(0) ja arg0);

	@OriginalMember(owner = "client!da", name = "b", descriptor = "()Z")
	@Override
	public boolean method6830() {
		return false;
	}

	@OriginalMember(owner = "client!da", name = "U", descriptor = "()I")
	public native int U();

	@OriginalMember(owner = "client!da", name = "C", descriptor = "()Z")
	@Override
	public boolean method6895() {
		return true;
	}

	@OriginalMember(owner = "client!da", name = "J", descriptor = "(SBBZZZBBBIIZZ[I)V")
	private native void J(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) int[] arg13);

	@OriginalMember(owner = "client!da", name = "L", descriptor = "(ILclient!fa;II)V")
	public native void L(@OriginalArg(0) int arg0, @OriginalArg(1) Class86 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "finalize", descriptor = "()V")
	@Override
	public synchronized void finalize() {
		this.method6824();
		if (this.nativeid != 0L) {
			Static184.method3380(this);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!ba;Lclient!ig;Lclient!q;Lclient!po;I)V")
	@Override
	public void method6856(@OriginalArg(0) Class20 arg0, @OriginalArg(1) Class144 arg1, @OriginalArg(2) Class54 arg2, @OriginalArg(3) Class98_Sub5 arg3, @OriginalArg(4) int arg4) {
		this.method1591(arg1, true);
		if (arg3 == null) {
			this.method1595().m(this, arg0, arg2, null, arg4, Static77.anIntArray142, Static77.anIntArray141, Static77.anIntArray139, Static77.aShortArray12, Static77.aByteArray9, arg1.aClass254_1.method5864(), Static77.anIntArray137);
			return;
		}
		Static77.anIntArray138[5] = 0;
		this.method1595().m(this, arg0, arg2, Static77.anIntArray138, arg4, Static77.anIntArray142, Static77.anIntArray141, Static77.anIntArray139, Static77.aShortArray12, Static77.aByteArray9, arg1.aClass254_1.method5864(), Static77.anIntArray137);
		arg3.anInt7042 = Static77.anIntArray138[0];
		arg3.anInt7044 = Static77.anIntArray138[1];
		arg3.anInt7043 = Static77.anIntArray138[2];
		arg3.anInt7045 = Static77.anIntArray138[3];
		arg3.anInt7041 = Static77.anIntArray138[4];
		arg3.aBoolean491 = Static77.anIntArray138[5] != 0;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([IIIII)Lclient!xa;")
	@Override
	public Class58 method6863(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new aa(this, this.anA1, arg0, 0, arg1, arg2, arg3) : new ja(this, this.anA1, arg0, 0, arg1, arg2, arg3);
				}
			}
		}
		return local1 ? new aa(this, this.anA1, arg0, 0, arg1, arg2, arg3) : new ja(this, this.anA1, arg0, 0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!da", name = "v", descriptor = "()I")
	public native int v();

	@OriginalMember(owner = "client!da", name = "n", descriptor = "()I")
	@Override
	public int method6847() {
		return 4;
	}

	@OriginalMember(owner = "client!da", name = "B", descriptor = "()V")
	@Override
	public void method6892() {
	}

	@OriginalMember(owner = "client!da", name = "x", descriptor = "()Lclient!q;")
	@Override
	public Class54 method6882() {
		return new wa();
	}

	@OriginalMember(owner = "client!da", name = "f", descriptor = "()Z")
	@Override
	public boolean method6837() {
		return true;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIZ)Lclient!xa;")
	@Override
	public Class58 method6874(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return arg4 ? new aa(this, this.anA1, arg0, arg1, arg2, arg3) : new ja(this, this.anA1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!da", name = "j", descriptor = "()Z")
	@Override
	public boolean method6842() {
		return true;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method6875(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.e(arg0, arg1, arg2, arg4, arg5);
		this.e(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.ya(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
		this.ya(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIF)Lclient!bj;")
	@Override
	public Class6_Sub7 method6827(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class6_Sub7_Sub3(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!da", name = "KA", descriptor = "(IIII)[I")
	public native int[] KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "ya", descriptor = "(IIIII)V")
	public native void ya(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!da", name = "sa", descriptor = "(II)V")
	public native void sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!da", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6902(@OriginalArg(0) Canvas arg0) {
		if (this.aV1.aCanvas15 == arg0) {
			this.method6900(null);
		}
		@Pc(16) v local16 = (v) this.aClass128_5.method3263((long) arg0.hashCode());
		if (local16 != null) {
			local16.method7804();
			local16.method7423();
		}
	}

	@OriginalMember(owner = "client!da", name = "P", descriptor = "(Lclient!v;)V")
	private native void P(@OriginalArg(0) v arg0);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIZ)Lclient!xa;")
	@Override
	public Class58 method6862(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new aa(this, this.anA1, arg0, arg1);
	}

	@OriginalMember(owner = "client!da", name = "JA", descriptor = "(I)V")
	public native void JA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "ma", descriptor = "(IIIIII[BII)V")
	public native void ma(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!da", name = "SA", descriptor = "()I")
	public native int SA();

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(Z)V")
	@Override
	public void method6878(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
	@Override
	public void method6822(@OriginalArg(0) int arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!da", name = "YA", descriptor = "(IFFFFF)V")
	public native void YA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!da", name = "fa", descriptor = "()V")
	private native void fa();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIILclient!fa;II)V")
	@Override
	public void method6877(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class86 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.ra(arg0, arg1, arg2, arg3, arg4, 1, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!da", name = "H", descriptor = "(Z)V")
	public native void H(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method6893(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method1595().IA(this, arg0, arg1, arg2, arg3, arg4, arg5, 0);
	}

	@OriginalMember(owner = "client!da", name = "ha", descriptor = "(F)V")
	public native void ha(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!da", name = "m", descriptor = "(IIII)V")
	public native void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "Q", descriptor = "(IIII)V")
	public native void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(SBBZZZBBBIIZZ)V")
	private native void b(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12);

	@OriginalMember(owner = "client!da", name = "h", descriptor = "(IIIII)V")
	protected native void h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!da", name = "t", descriptor = "()Lclient!taa;")
	@Override
	public Class312 method6871() {
		return new Class312(0, "SSE", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!da", name = "e", descriptor = "(IIIII)V")
	public native void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!da", name = "w", descriptor = "()V")
	@Override
	public void method6881() {
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(Z)V")
	@Override
	public void method6880(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!da", name = "d", descriptor = "()V")
	@Override
	public void method6834() {
	}

	@OriginalMember(owner = "client!da", name = "z", descriptor = "()Z")
	@Override
	public boolean method6887() {
		return false;
	}

	@OriginalMember(owner = "client!da", name = "LA", descriptor = "(IIII)V")
	public native void LA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method6868() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!ip;)V")
	@Override
	public void method6835(@OriginalArg(0) Class26 arg0) {
	}

	@OriginalMember(owner = "client!da", name = "d", descriptor = "(S)Z")
	private boolean method1593(@OriginalArg(0) short arg0) {
		@Pc(2) Interface4 local2 = super.anInterface4_15;
		synchronized (super.anInterface4_15) {
			if (!super.anInterface4_15.method4233(arg0)) {
				return false;
			}
			@Pc(22) Class313 local22 = super.anInterface4_15.method4234(arg0);
			if (local22 == null) {
				return false;
			}
			@Pc(43) int[] local43;
			if (local22.aBoolean596) {
				local43 = super.anInterface4_15.method4231(128, 128, arg0, 0.7F);
			} else {
				local43 = super.anInterface4_15.method4230(0.7F, arg0, 128, true, 128);
			}
			this.J(arg0, local22.aByte101, local22.aByte100, local22.aBoolean590, local22.aBoolean593, local22.aBoolean592, local22.aByte97, local22.aByte102, local22.aByte98, local22.aShort105, local22.anInt8310, local22.aBoolean589, local22.aBoolean591, local43);
			return true;
		}
	}

	@OriginalMember(owner = "client!da", name = "aa", descriptor = "()I")
	public native int aa();

	@OriginalMember(owner = "client!da", name = "IA", descriptor = "()I")
	public native int IA();

	@OriginalMember(owner = "client!da", name = "o", descriptor = "(Lclient!q;)V")
	private native void o(@OriginalArg(0) Class54 arg0);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6831(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!da", name = "qa", descriptor = "(S)Z")
	private boolean method1594(@OriginalArg(0) short arg0) {
		synchronized (this) {
			@Pc(9) Class313 local9 = super.anInterface4_15.method4234(arg0);
			if (local9 == null) {
				return false;
			} else {
				this.b(arg0, local9.aByte101, local9.aByte100, local9.aBoolean590, local9.aBoolean593, local9.aBoolean592, local9.aByte97, local9.aByte102, local9.aByte98, local9.aShort105, local9.anInt8310, local9.aBoolean589, local9.aBoolean591);
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "BA", descriptor = "(IIIIII)V")
	private native void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!da", name = "p", descriptor = "()Z")
	@Override
	public boolean method6849() {
		return true;
	}

	@OriginalMember(owner = "client!da", name = "y", descriptor = "()Z")
	@Override
	public boolean method6886() {
		return true;
	}

	@OriginalMember(owner = "client!da", name = "FA", descriptor = "(IIIIII)Z")
	public native boolean FA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!da", name = "r", descriptor = "()V")
	@Override
	public void method6858() {
		this.method6900(this.aV1.aCanvas15);
	}

	@OriginalMember(owner = "client!da", name = "D", descriptor = "(I)V")
	public native void D(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "f", descriptor = "(I)Lclient!i;")
	@Override
	public Class6_Sub15 method6898(@OriginalArg(0) int arg0) {
		@Pc(5) a local5 = new a(this, arg0);
		this.aClass361_8.method7833(local5);
		return local5;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II)I")
	@Override
	public int method6879(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!da", name = "q", descriptor = "()Lclient!q;")
	@Override
	public Class54 method6851() {
		return this.aClass54_3;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "()Z")
	@Override
	public boolean method6826() {
		return false;
	}

	@OriginalMember(owner = "client!da", name = "H", descriptor = "()Lclient!t;")
	public t method1595() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1656; local1++) {
			if (this.aTArray1[local1].aRunnable3 == Thread.currentThread()) {
				return this.aTArray1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I[Lclient!bj;)V")
	@Override
	public void method6869(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub7[] arg1) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			Static77.anIntArray140[local1++] = arg1[local3].method4292();
			Static77.anIntArray140[local1++] = arg1[local3].method4291();
			Static77.anIntArray140[local1++] = arg1[local3].method4286();
			Static77.anIntArray140[local1++] = arg1[local3].method4283();
			Static77.aFloatArray7[local3] = arg1[local3].method4284();
			Static77.anIntArray140[local1++] = arg1[local3].method4288();
		}
		this.f(arg0, Static77.anIntArray140, Static77.aFloatArray7);
	}

	@OriginalMember(owner = "client!da", name = "ra", descriptor = "(IIIIIILclient!fa;II)V")
	private native void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class86 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!da", name = "C", descriptor = "(IIIIII)V")
	public native void C(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(I)V")
	@Override
	public void method6850(@OriginalArg(0) int arg0) {
		this.aTArray1[arg0].method6745();
	}

	@OriginalMember(owner = "client!da", name = "e", descriptor = "()Z")
	@Override
	public boolean method6836() {
		return true;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!xa;Z)V")
	@Override
	protected void method6821(@OriginalArg(0) Class58 arg0) {
		if (arg0 instanceof ja) {
			this.TA((ja) arg0);
		} else if (arg0 instanceof aa) {
			this.N((aa) arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!da", name = "A", descriptor = "([I)V")
	public native void A(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!da", name = "h", descriptor = "()V")
	@Override
	protected void method6839() {
		if (this.aBoolean117) {
			return;
		}
		this.aTArray1 = null;
		this.aV1 = null;
		this.anA1 = null;
		this.aClass54_3 = null;
		this.aClass128_5.method3274();
		for (@Pc(25) a local25 = (a) this.aClass361_8.method7838(); local25 != null; local25 = (a) this.aClass361_8.method7845()) {
			local25.ZA();
		}
		this.aClass361_8.method7842();
		this.fa();
		if (this.aBoolean118) {
			Static397.method5811(true, false);
			this.aBoolean118 = false;
		}
		this.method1596();
		Static184.method3377();
		this.aBoolean117 = true;
	}

	@OriginalMember(owner = "client!da", name = "PA", descriptor = "(Lclient!e;II)V")
	private native void PA(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([Lclient!ba;Lclient!ig;Lclient!q;[Lclient!po;I)V")
	@Override
	public void method6872(@OriginalArg(0) Class20[] arg0, @OriginalArg(1) Class144 arg1, @OriginalArg(2) Class54 arg2, @OriginalArg(3) Class98_Sub5[] arg3, @OriginalArg(4) int arg4) {
		this.method1591(arg1, true);
		if (arg3 == null) {
			this.method1595().v(this, arg0, arg2, null, arg4, Static77.anIntArray142, Static77.anIntArray141, Static77.anIntArray139, Static77.aShortArray12, Static77.aByteArray9, arg1.aClass254_1.method5864(), Static77.anIntArray137);
		} else {
			@Pc(28) Class98_Sub5 local28 = arg3[0];
			Static77.anIntArray138[5] = 0;
			this.method1595().v(this, arg0, arg2, Static77.anIntArray138, arg4, Static77.anIntArray142, Static77.anIntArray141, Static77.anIntArray139, Static77.aShortArray12, Static77.aByteArray9, arg1.aClass254_1.method5864(), Static77.anIntArray137);
			local28.anInt7042 = Static77.anIntArray138[0];
			local28.anInt7044 = Static77.anIntArray138[1];
			local28.anInt7043 = Static77.anIntArray138[2];
			local28.anInt7045 = Static77.anIntArray138[3];
			local28.anInt7041 = Static77.anIntArray138[4];
			local28.aBoolean491 = Static77.anIntArray138[5] != 0;
		}
		for (@Pc(86) int local86 = 0; local86 < arg0.length; local86++) {
			if (arg0[local86] != null) {
				@Pc(96) j local96 = (j) arg0[local86];
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "g", descriptor = "()Z")
	@Override
	public boolean method6838() {
		return true;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Z)V")
	@Override
	public void method6861(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(IIIIII)Lclient!ip;")
	@Override
	public Class26 method6883(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!da", name = "AA", descriptor = "(IIII)V")
	public native void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!ig;)V")
	@Override
	public void method6888(@OriginalArg(0) Class144 arg0) {
		this.method1591(arg0, false);
		this.method1595().WA(this, Static77.anIntArray142, Static77.anIntArray141, Static77.anIntArray139, Static77.aShortArray12, arg0.aClass254_1.method5864());
	}

	@OriginalMember(owner = "client!da", name = "s", descriptor = "()V")
	private void method1596() {
		System.gc();
		System.runFinalization();
		Static184.method3378();
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(I)V")
	private native void c(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "c", descriptor = "()Z")
	@Override
	public boolean method6832() {
		return false;
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(Lclient!i;)V")
	@Override
	public void method6891(@OriginalArg(0) Class6_Sub15 arg0) {
		this.anA1 = (a) arg0;
		this.a(arg0);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method6829(@OriginalArg(0) Class54 arg0) {
		this.aClass54_2 = arg0;
		this.o(arg0);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([Lclient!ba;Lclient!q;[Lclient!po;I)V")
	@Override
	public void method6885(@OriginalArg(0) Class20[] arg0, @OriginalArg(1) Class54 arg1, @OriginalArg(2) Class98_Sub5[] arg2, @OriginalArg(3) int arg3) {
		if (arg2 == null) {
			this.method1595().n(this, arg0, arg1, null, -1, arg3);
			return;
		}
		@Pc(15) Class98_Sub5 local15 = arg2[0];
		Static77.anIntArray138[5] = 0;
		this.method1595().n(this, arg0, arg1, Static77.anIntArray138, -1, arg3);
		local15.anInt7042 = Static77.anIntArray138[0];
		local15.anInt7044 = Static77.anIntArray138[1];
		local15.anInt7043 = Static77.anIntArray138[2];
		local15.anInt7045 = Static77.anIntArray138[3];
		local15.anInt7041 = Static77.anIntArray138[4];
		local15.aBoolean491 = Static77.anIntArray138[5] != 0;
	}

	@OriginalMember(owner = "client!da", name = "l", descriptor = "()V")
	@Override
	public void method6843() {
	}

	@OriginalMember(owner = "client!da", name = "D", descriptor = "()Z")
	@Override
	public boolean method6896() {
		return true;
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(II)I")
	@Override
	public int method6884(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 & 0xFFFFF;
		@Pc(7) int local7 = arg1 & 0xFFFFF;
		return local3 & local7 ^ local7;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6864(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!da", name = "e", descriptor = "(I)V")
	@Override
	public void method6897(@OriginalArg(0) int arg0) {
		Static184.method3378();
		this.c(arg0);
		for (@Pc(10) a local10 = (a) this.aClass361_8.method7838(); local10 != null; local10 = (a) this.aClass361_8.method7845()) {
			local10.P();
		}
	}

	@OriginalMember(owner = "client!da", name = "d", descriptor = "(I)V")
	@Override
	public void method6873(@OriginalArg(0) int arg0) {
		this.aTArray1[arg0].method6746();
	}

	@OriginalMember(owner = "client!da", name = "N", descriptor = "(Lclient!aa;)V")
	private native void N(@OriginalArg(0) aa arg0);

	@OriginalMember(owner = "client!da", name = "f", descriptor = "(I[I[F)V")
	private native void f(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) float[] arg2);

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method6894(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.BA(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!da", name = "o", descriptor = "()V")
	@Override
	public void method6848() throws Exception_Sub1 {
		if (this.aV1 == null) {
			throw new IllegalStateException("off");
		}
		this.aV1.method7424();
	}
}
