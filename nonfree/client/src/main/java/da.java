import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public final class da extends Class66 implements Interface9 {

	@OriginalMember(owner = "client!da", name = "t", descriptor = "Lclient!a;")
	private a anA1;

	@OriginalMember(owner = "client!da", name = "z", descriptor = "Lclient!q;")
	private Class134 aClass134_2;

	@OriginalMember(owner = "client!da", name = "G", descriptor = "Lclient!v;")
	private v aV1;

	@OriginalMember(owner = "client!da", name = "P", descriptor = "I")
	private int anInt1699;

	@OriginalMember(owner = "client!da", name = "Q", descriptor = "[Lclient!t;")
	private t[] aTArray1;

	@OriginalMember(owner = "client!da", name = "s", descriptor = "Z")
	private boolean aBoolean140 = false;

	@OriginalMember(owner = "client!da", name = "nativeid", descriptor = "J")
	private final long nativeid = 0L;

	@OriginalMember(owner = "client!da", name = "u", descriptor = "Lclient!gj;")
	private final Class124 aClass124_5 = new Class124();

	@OriginalMember(owner = "client!da", name = "v", descriptor = "I")
	private final int anInt1697 = 4096;

	@OriginalMember(owner = "client!da", name = "A", descriptor = "I")
	private final int anInt1698 = 4096;

	@OriginalMember(owner = "client!da", name = "y", descriptor = "Lclient!jw;")
	private final Class183 aClass183_7 = new Class183(4);

	@OriginalMember(owner = "client!da", name = "O", descriptor = "Z")
	private boolean aBoolean141 = false;

	@OriginalMember(owner = "client!da", name = "x", descriptor = "Lclient!q;")
	private Class134 aClass134_1;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!e;)V")
	public da(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface3 arg1) {
		super(arg1);
		try {
			if (!Static157.method5013("sw3d")) {
				throw new RuntimeException("");
			}
			Static111.method2328();
			this.PA(super.anInterface3_15, 0, 0);
			Static452.method6402(false, true);
			this.aBoolean141 = true;
			this.aClass134_1 = new wa();
			this.method6823(new wa());
			this.method6835(1);
			this.method6813(0);
			if (arg0 != null) {
				this.method6853(arg0);
				this.method6854(arg0);
			}
		} catch (@Pc(78) Throwable local78) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!da", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6854(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aV1 = null;
			this.P(null);
		} else {
			@Pc(10) v local10 = (v) this.aClass183_7.method4289((long) arg0.hashCode());
			this.aV1 = local10;
			this.P(local10);
		}
	}

	@OriginalMember(owner = "client!da", name = "YA", descriptor = "(IFFFFF)V")
	public native void YA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(Z)V")
	@Override
	public void method6851(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!i;)V")
	private native void a(@OriginalArg(0) Class4_Sub6 arg0);

	@OriginalMember(owner = "client!da", name = "n", descriptor = "()V")
	@Override
	public void method6808() {
	}

	@OriginalMember(owner = "client!da", name = "m", descriptor = "(IIII)V")
	public native void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([IIIII)Lclient!xa;")
	@Override
	public Class13 method6843(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
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

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6853(@OriginalArg(0) Canvas arg0) {
		@Pc(8) v local8 = (v) this.aClass183_7.method4289((long) arg0.hashCode());
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
		this.aClass183_7.method4282((long) arg0.hashCode(), local8);
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(II)I")
	@Override
	public int method6831(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 & 0xFFFFF;
		@Pc(7) int local7 = arg1 & 0xFFFFF;
		return local3 & local7 ^ local7;
	}

	@OriginalMember(owner = "client!da", name = "JA", descriptor = "(I)V")
	public native void JA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
	@Override
	public void method6787(@OriginalArg(0) int arg0) {
		this.aTArray1[arg0].method7061();
	}

	@OriginalMember(owner = "client!da", name = "e", descriptor = "(IIIII)V")
	public native void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!da", name = "r", descriptor = "()Z")
	@Override
	public boolean method6828() {
		return false;
	}

	@OriginalMember(owner = "client!da", name = "x", descriptor = "()Lclient!ffa;")
	@Override
	public Class105 method6836() {
		return new Class105(0, "SSE", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!dn;Lclient!dn;FLclient!dn;)Lclient!dn;")
	@Override
	public Class75 method6775(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class75 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class75 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!da", name = "D", descriptor = "(I)V")
	public native void D(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "HA", descriptor = "()Ljava/lang/Object;")
	private Object method1573() {
		return new pa(this);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Z)V")
	@Override
	public void method6839(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!da", name = "o", descriptor = "(Lclient!q;)V")
	private native void o(@OriginalArg(0) Class134 arg0);

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method6826(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.BA(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!da", name = "ka", descriptor = "(FF)V")
	public native void ka(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6806(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!da", name = "P", descriptor = "(Lclient!v;)V")
	private native void P(@OriginalArg(0) v arg0);

	@OriginalMember(owner = "client!da", name = "AA", descriptor = "(IIII)V")
	public native void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "D", descriptor = "()Z")
	@Override
	public boolean method6850() {
		return true;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!kga;[Lclient!pga;Z)Lclient!ta;")
	@Override
	public Class91 method6829(@OriginalArg(0) Class196 arg0, @OriginalArg(1) Class268[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt7058;
			local7[local11] = arg1[local11].anInt7060;
			if (arg1[local11].aByteArray92 != null) {
				local9 = true;
			}
		}
		if (local9) {
			throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
		}
		return new b(this, this.anA1, arg0, arg1, null);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "()Z")
	@Override
	public boolean method6778() {
		return true;
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(IIIIII)Lclient!dn;")
	@Override
	public Class75 method6810(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!ba;Lclient!c;Lclient!q;Lclient!ot;I)V")
	@Override
	public void method6807(@OriginalArg(0) Class9 arg0, @OriginalArg(1) Class42 arg1, @OriginalArg(2) Class134 arg2, @OriginalArg(3) Class26_Sub5 arg3, @OriginalArg(4) int arg4) {
		this.method1574(arg1, true);
		if (arg3 == null) {
			this.method1577().m(this, arg0, arg2, null, arg4, Static82.anIntArray219, Static82.anIntArray217, Static82.anIntArray215, Static82.aShortArray53, Static82.aByteArray28, arg1.aClass212_1.method4706(), Static82.anIntArray216);
			return;
		}
		Static82.anIntArray218[5] = 0;
		this.method1577().m(this, arg0, arg2, Static82.anIntArray218, arg4, Static82.anIntArray219, Static82.anIntArray217, Static82.anIntArray215, Static82.aShortArray53, Static82.aByteArray28, arg1.aClass212_1.method4706(), Static82.anIntArray216);
		arg3.anInt6866 = Static82.anIntArray218[0];
		arg3.anInt6865 = Static82.anIntArray218[1];
		arg3.anInt6863 = Static82.anIntArray218[2];
		arg3.anInt6862 = Static82.anIntArray218[3];
		arg3.anInt6864 = Static82.anIntArray218[4];
		arg3.aBoolean508 = Static82.anIntArray218[5] != 0;
	}

	@OriginalMember(owner = "client!da", name = "t", descriptor = "()V")
	@Override
	public void method6830() {
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!c;Z)V")
	private void method1574(@OriginalArg(0) Class42 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(15) Class26_Sub1_Sub1 local15 = (Class26_Sub1_Sub1) arg0.aClass212_1.method4707(); local15 != null; local15 = (Class26_Sub1_Sub1) arg0.aClass212_1.method4705()) {
			Static82.anIntArray219[local1++] = local15.anInt9214;
			Static82.anIntArray219[local1++] = local15.anInt9217;
			Static82.anIntArray219[local1++] = local15.anInt9213;
			Static82.anIntArray217[local3++] = local15.anInt9219;
			Static82.aShortArray53[local7++] = (short) local15.anInt9221;
			Static82.anIntArray215[local5++] = local15.anInt9222;
			if (arg1) {
				Static82.aByteArray28[local9++] = local15.aByte105;
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "d", descriptor = "(S)Z")
	private boolean method1575(@OriginalArg(0) short arg0) {
		@Pc(2) Interface3 local2 = super.anInterface3_15;
		synchronized (super.anInterface3_15) {
			if (!super.anInterface3_15.method7248(arg0)) {
				return false;
			}
			@Pc(22) Class271 local22 = super.anInterface3_15.method7249(arg0);
			if (local22 == null) {
				return false;
			}
			@Pc(43) int[] local43;
			if (local22.aBoolean515) {
				local43 = super.anInterface3_15.method7251(0.7F, 128, arg0, 128);
			} else {
				local43 = super.anInterface3_15.method7250(128, true, arg0, 0.7F, 128);
			}
			this.J(arg0, local22.aByte82, local22.aByte80, local22.aBoolean513, local22.aBoolean514, local22.aBoolean512, local22.aByte79, local22.aByte83, local22.aByte84, local22.aShort94, local22.anInt7177, local22.aBoolean517, local22.aBoolean518, local43);
			return true;
		}
	}

	@OriginalMember(owner = "client!da", name = "ma", descriptor = "(IIIIII[BII)V")
	public native void ma(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!da", name = "w", descriptor = "()Z")
	@Override
	public boolean method6834() {
		return false;
	}

	@OriginalMember(owner = "client!da", name = "j", descriptor = "()V")
	@Override
	public void method6795() {
	}

	@OriginalMember(owner = "client!da", name = "L", descriptor = "(ILclient!fa;II)V")
	public native void L(@OriginalArg(0) int arg0, @OriginalArg(1) Class98 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIZ)Lclient!xa;")
	@Override
	public Class13 method6856(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new aa(this, this.anA1, arg0, arg1);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method6801(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method1577().IA(this, arg0, arg1, arg2, arg3, arg4, arg5, 0);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I[Lclient!pv;)V")
	@Override
	public void method6785(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub32[] arg1) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			Static82.anIntArray220[local1++] = arg1[local3].method6614();
			Static82.anIntArray220[local1++] = arg1[local3].method6615(-18736);
			Static82.anIntArray220[local1++] = arg1[local3].method6617();
			Static82.anIntArray220[local1++] = arg1[local3].method6621();
			Static82.aFloatArray4[local3] = arg1[local3].method6618();
			Static82.anIntArray220[local1++] = arg1[local3].method6613(110);
		}
		this.f(arg0, Static82.anIntArray220, Static82.aFloatArray4);
	}

	@OriginalMember(owner = "client!da", name = "ra", descriptor = "(IIIIIILclient!fa;II)V")
	private native void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class98 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II[[I[[IIII)Lclient!d;")
	@Override
	public Class16 method6797(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new ya(this, this.anA1, arg0, arg1, arg2, arg3, 512, arg4, arg5);
	}

	@OriginalMember(owner = "client!da", name = "v", descriptor = "()I")
	public native int v();

	@OriginalMember(owner = "client!da", name = "g", descriptor = "()Z")
	@Override
	public boolean method6789() {
		return true;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method6823(@OriginalArg(0) Class134 arg0) {
		this.aClass134_2 = arg0;
		this.o(arg0);
	}

	@OriginalMember(owner = "client!da", name = "f", descriptor = "(I)Lclient!i;")
	@Override
	public Class4_Sub6 method6833(@OriginalArg(0) int arg0) {
		@Pc(5) a local5 = new a(this, arg0);
		this.aClass124_5.method3275(local5);
		return local5;
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(Z)V")
	@Override
	public void method6857(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!da", name = "TA", descriptor = "(Lclient!ja;)V")
	private native void TA(@OriginalArg(0) ja arg0);

	@OriginalMember(owner = "client!da", name = "g", descriptor = "(I)V")
	@Override
	public void method6835(@OriginalArg(0) int arg0) {
		this.anInt1699 = arg0;
		this.aTArray1 = new t[this.anInt1699];
		for (@Pc(9) int local9 = 0; local9 < this.anInt1699; local9++) {
			this.aTArray1[local9] = new t(this, this.anInt1698, this.anInt1697);
		}
	}

	@OriginalMember(owner = "client!da", name = "FA", descriptor = "(IIIIII)Z")
	public native boolean FA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!da", name = "IA", descriptor = "()I")
	public native int IA();

	@OriginalMember(owner = "client!da", name = "aa", descriptor = "()I")
	public native int aa();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II[I[I)Lclient!fa;")
	@Override
	public Class98 method6841(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new f(this, this.anA1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!da", name = "k", descriptor = "()V")
	public native void k();

	@OriginalMember(owner = "client!da", name = "e", descriptor = "()V")
	@Override
	public void method6784() {
	}

	@OriginalMember(owner = "client!da", name = "C", descriptor = "(IIIIII)V")
	public native void C(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6825(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!da", name = "p", descriptor = "()Z")
	@Override
	public boolean method6820() {
		return false;
	}

	@OriginalMember(owner = "client!da", name = "o", descriptor = "()Z")
	@Override
	public boolean method6814() {
		return false;
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(SBBZZZBBBIIZZ)V")
	private native void b(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([Lclient!ba;Lclient!q;[Lclient!ot;I)V")
	@Override
	public void method6845(@OriginalArg(0) Class9[] arg0, @OriginalArg(1) Class134 arg1, @OriginalArg(2) Class26_Sub5[] arg2, @OriginalArg(3) int arg3) {
		if (arg2 == null) {
			this.method1577().n(this, arg0, arg1, null, -1, arg3);
			return;
		}
		@Pc(15) Class26_Sub5 local15 = arg2[0];
		Static82.anIntArray218[5] = 0;
		this.method1577().n(this, arg0, arg1, Static82.anIntArray218, -1, arg3);
		local15.anInt6866 = Static82.anIntArray218[0];
		local15.anInt6865 = Static82.anIntArray218[1];
		local15.anInt6863 = Static82.anIntArray218[2];
		local15.anInt6862 = Static82.anIntArray218[3];
		local15.anInt6864 = Static82.anIntArray218[4];
		local15.aBoolean508 = Static82.anIntArray218[5] != 0;
	}

	@OriginalMember(owner = "client!da", name = "J", descriptor = "(SBBZZZBBBIIZZ[I)V")
	private native void J(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) int[] arg13);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6792(@OriginalArg(0) Canvas arg0) {
		if (this.aV1.aCanvas17 == arg0) {
			this.method6854(null);
		}
		@Pc(16) v local16 = (v) this.aClass183_7.method4289((long) arg0.hashCode());
		if (local16 != null) {
			local16.method8013();
			local16.method7561();
		}
	}

	@OriginalMember(owner = "client!da", name = "h", descriptor = "()V")
	@Override
	public void method6790() {
	}

	@OriginalMember(owner = "client!da", name = "ca", descriptor = "(IIII)V")
	public native void ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "X", descriptor = "(III)V")
	public native void X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method6786(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.e(arg0, arg1, arg2, arg4, arg5);
		this.e(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.ya(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
		this.ya(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
	}

	@OriginalMember(owner = "client!da", name = "B", descriptor = "()Z")
	@Override
	public boolean method6848() {
		return true;
	}

	@OriginalMember(owner = "client!da", name = "d", descriptor = "(I)V")
	@Override
	public void method6813(@OriginalArg(0) int arg0) {
		this.aTArray1[arg0].method7060();
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIZ)Lclient!xa;")
	@Override
	public Class13 method6802(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return arg4 ? new aa(this, this.anA1, arg0, arg1, arg2, arg3) : new ja(this, this.anA1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIF)Lclient!pv;")
	@Override
	public Class4_Sub32 method6791(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class4_Sub32_Sub2(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!da", name = "KA", descriptor = "(IIII)[I")
	public native int[] KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "y", descriptor = "()Z")
	@Override
	public boolean method6837() {
		return true;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([Lclient!ba;Lclient!c;Lclient!q;[Lclient!ot;I)V")
	@Override
	public void method6798(@OriginalArg(0) Class9[] arg0, @OriginalArg(1) Class42 arg1, @OriginalArg(2) Class134 arg2, @OriginalArg(3) Class26_Sub5[] arg3, @OriginalArg(4) int arg4) {
		this.method1574(arg1, true);
		if (arg3 == null) {
			this.method1577().v(this, arg0, arg2, null, arg4, Static82.anIntArray219, Static82.anIntArray217, Static82.anIntArray215, Static82.aShortArray53, Static82.aByteArray28, arg1.aClass212_1.method4706(), Static82.anIntArray216);
		} else {
			@Pc(28) Class26_Sub5 local28 = arg3[0];
			Static82.anIntArray218[5] = 0;
			this.method1577().v(this, arg0, arg2, Static82.anIntArray218, arg4, Static82.anIntArray219, Static82.anIntArray217, Static82.anIntArray215, Static82.aShortArray53, Static82.aByteArray28, arg1.aClass212_1.method4706(), Static82.anIntArray216);
			local28.anInt6866 = Static82.anIntArray218[0];
			local28.anInt6865 = Static82.anIntArray218[1];
			local28.anInt6863 = Static82.anIntArray218[2];
			local28.anInt6862 = Static82.anIntArray218[3];
			local28.anInt6864 = Static82.anIntArray218[4];
			local28.aBoolean508 = Static82.anIntArray218[5] != 0;
		}
		for (@Pc(86) int local86 = 0; local86 < arg0.length; local86++) {
			if (arg0[local86] != null) {
				@Pc(96) j local96 = (j) arg0[local86];
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "l", descriptor = "()Z")
	@Override
	public boolean method6804() {
		return true;
	}

	@OriginalMember(owner = "client!da", name = "C", descriptor = "()Z")
	@Override
	public boolean method6849() {
		return false;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method6812(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aV1 == null) {
			throw new IllegalStateException("off");
		}
		this.aV1.method7558(arg0, arg1);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!dn;)V")
	@Override
	public void method6803(@OriginalArg(0) Class75 arg0) {
	}

	@OriginalMember(owner = "client!da", name = "A", descriptor = "([I)V")
	public native void A(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!da", name = "finalize", descriptor = "()V")
	@Override
	public synchronized void finalize() {
		this.method6838();
		if (this.nativeid != 0L) {
			Static111.method2327(this);
		}
	}

	@OriginalMember(owner = "client!da", name = "qa", descriptor = "(S)Z")
	private boolean method1576(@OriginalArg(0) short arg0) {
		synchronized (this) {
			@Pc(9) Class271 local9 = super.anInterface3_15.method7249(arg0);
			if (local9 == null) {
				return false;
			} else {
				this.b(arg0, local9.aByte82, local9.aByte80, local9.aBoolean513, local9.aBoolean514, local9.aBoolean512, local9.aByte79, local9.aByte83, local9.aByte84, local9.aShort94, local9.anInt7177, local9.aBoolean517, local9.aBoolean518);
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "F", descriptor = "()V")
	public native void F();

	@OriginalMember(owner = "client!da", name = "h", descriptor = "(IIIII)V")
	protected native void h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIILclient!fa;II)V")
	@Override
	public void method6844(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class98 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.ra(arg0, arg1, arg2, arg3, arg4, 1, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!da", name = "na", descriptor = "(III[I)V")
	public native void na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!xa;Z)V")
	@Override
	protected void method6811(@OriginalArg(0) Class13 arg0) {
		if (arg0 instanceof ja) {
			this.TA((ja) arg0);
		} else if (arg0 instanceof aa) {
			this.N((aa) arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(Lclient!i;)V")
	@Override
	public void method6800(@OriginalArg(0) Class4_Sub6 arg0) {
		this.anA1 = (a) arg0;
		this.a(arg0);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!pga;Z)Lclient!xa;")
	@Override
	public Class13 method6799(@OriginalArg(0) Class268 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(2) int[] local2 = arg0.anIntArray590;
		@Pc(5) byte[] local5 = arg0.aByteArray93;
		@Pc(8) int local8 = arg0.anInt7058;
		@Pc(11) int local11 = arg0.anInt7060;
		@Pc(32) Class13 local32;
		if (arg1 && arg0.aByteArray92 == null) {
			local32 = new la(this, this.anA1, local2, local5, 0, arg0.anInt7058, arg0.anInt7058, arg0.anInt7060);
		} else {
			@Pc(37) int local37 = local8 * local11;
			@Pc(40) int[] local40 = new int[local37];
			@Pc(43) byte[] local43 = arg0.aByteArray92;
			@Pc(52) int local52;
			@Pc(54) int local54;
			if (local43 == null) {
				@Pc(100) boolean local100 = false;
				for (local52 = 0; local52 < local37; local52++) {
					local54 = arg0.anIntArray590[local5[local52] & 0xFF];
					if (local54 >>> 24 != 255) {
						local100 = true;
					}
					local40[local52] = local54;
				}
				if (local100) {
					local32 = new aa(this, this.anA1, local40, 0, arg0.anInt7058, arg0.anInt7058, arg0.anInt7060);
				} else {
					local32 = new ja(this, this.anA1, local40, 0, arg0.anInt7058, arg0.anInt7058, arg0.anInt7060);
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
		local32.EA(arg0.anInt7057, arg0.anInt7059, arg0.anInt7056, arg0.anInt7061);
		return local32;
	}

	@OriginalMember(owner = "client!da", name = "BA", descriptor = "(IIIIII)V")
	private native void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!da", name = "ha", descriptor = "(F)V")
	public native void ha(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!pf;IIII)Lclient!ba;")
	@Override
	public Class9 method6779(@OriginalArg(0) Class266 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new j(this, this.anA1, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!da", name = "SA", descriptor = "()I")
	public native int SA();

	@OriginalMember(owner = "client!da", name = "d", descriptor = "()V")
	@Override
	public void method6783() {
	}

	@OriginalMember(owner = "client!da", name = "LA", descriptor = "(IIII)V")
	public native void LA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "ya", descriptor = "(IIIII)V")
	public native void ya(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6815(@OriginalArg(0) Canvas arg0) {
		@Pc(8) v local8 = (v) this.aClass183_7.method4289((long) arg0.hashCode());
		@Pc(11) Dimension local11 = arg0.getSize();
		local8.D(arg0, local11.width, local11.height);
		if (arg0 != null && arg0 == this.aV1.aCanvas17) {
			this.method6854(arg0);
		}
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "()V")
	@Override
	public void method6780() {
		this.method6854(this.aV1.aCanvas17);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method6816() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!da", name = "N", descriptor = "(Lclient!aa;)V")
	private native void N(@OriginalArg(0) aa arg0);

	@OriginalMember(owner = "client!da", name = "sa", descriptor = "(II)V")
	public native void sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(I)V")
	private native void c(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "i", descriptor = "()Z")
	@Override
	public boolean method6793() {
		return true;
	}

	@OriginalMember(owner = "client!da", name = "fa", descriptor = "()V")
	private native void fa();

	@OriginalMember(owner = "client!da", name = "u", descriptor = "()I")
	@Override
	public int method6832() {
		return 4;
	}

	@OriginalMember(owner = "client!da", name = "A", descriptor = "()V")
	@Override
	public void method6847() throws Exception_Sub1 {
		if (this.aV1 == null) {
			throw new IllegalStateException("off");
		}
		this.aV1.method7559();
	}

	@OriginalMember(owner = "client!da", name = "z", descriptor = "()Lclient!q;")
	@Override
	public Class134 method6842() {
		return this.aClass134_1;
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "()Z")
	@Override
	public boolean method6781() {
		return false;
	}

	@OriginalMember(owner = "client!da", name = "e", descriptor = "(I)V")
	@Override
	public void method6824(@OriginalArg(0) int arg0) {
		Static111.method2326();
		this.c(arg0);
		for (@Pc(10) a local10 = (a) this.aClass124_5.method3267(); local10 != null; local10 = (a) this.aClass124_5.method3273()) {
			local10.P();
		}
	}

	@OriginalMember(owner = "client!da", name = "i", descriptor = "(I)V")
	@Override
	public void method6840(@OriginalArg(0) int arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!da", name = "E", descriptor = "()Z")
	@Override
	public boolean method6852() {
		return false;
	}

	@OriginalMember(owner = "client!da", name = "q", descriptor = "()Z")
	@Override
	public boolean method6821() {
		return true;
	}

	@OriginalMember(owner = "client!da", name = "Q", descriptor = "(IIII)V")
	public native void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II)I")
	@Override
	public int method6818(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!da", name = "H", descriptor = "()Lclient!t;")
	public t method1577() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1699; local1++) {
			if (this.aTArray1[local1].aRunnable4 == Thread.currentThread()) {
				return this.aTArray1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!da", name = "PA", descriptor = "(Lclient!e;II)V")
	private native void PA(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!da", name = "s", descriptor = "()V")
	private void method1578() {
		System.gc();
		System.runFinalization();
		Static111.method2326();
	}

	@OriginalMember(owner = "client!da", name = "U", descriptor = "()I")
	public native int U();

	@OriginalMember(owner = "client!da", name = "H", descriptor = "(Z)V")
	public native void H(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!c;)V")
	@Override
	public void method6846(@OriginalArg(0) Class42 arg0) {
		this.method1574(arg0, false);
		this.method1577().WA(this, Static82.anIntArray219, Static82.anIntArray217, Static82.anIntArray215, Static82.aShortArray53, arg0.aClass212_1.method4706());
	}

	@OriginalMember(owner = "client!da", name = "f", descriptor = "()Lclient!q;")
	@Override
	public Class134 method6788() {
		return new wa();
	}

	@OriginalMember(owner = "client!da", name = "f", descriptor = "(I[I[F)V")
	private native void f(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) float[] arg2);

	@OriginalMember(owner = "client!da", name = "m", descriptor = "()V")
	@Override
	protected void method6805() {
		if (this.aBoolean140) {
			return;
		}
		this.aTArray1 = null;
		this.aV1 = null;
		this.anA1 = null;
		this.aClass134_1 = null;
		this.aClass183_7.method4287();
		for (@Pc(25) a local25 = (a) this.aClass124_5.method3267(); local25 != null; local25 = (a) this.aClass124_5.method3273()) {
			local25.ZA();
		}
		this.aClass124_5.method3265();
		this.fa();
		if (this.aBoolean141) {
			Static333.method5017(false, true);
			this.aBoolean141 = false;
		}
		this.method1578();
		Static111.method2324();
		this.aBoolean140 = true;
	}
}
