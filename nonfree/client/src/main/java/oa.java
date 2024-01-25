import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class oa extends Class144 implements Interface5 {

	@OriginalMember(owner = "client!oa", name = "t", descriptor = "Lclient!ya;")
	private ya aYa2;

	@OriginalMember(owner = "client!oa", name = "D", descriptor = "Lclient!rd;")
	private Class263 aClass263_7;

	@OriginalMember(owner = "client!oa", name = "y", descriptor = "Lclient!p;")
	private p aP1;

	@OriginalMember(owner = "client!oa", name = "M", descriptor = "[Lclient!a;")
	private a[] anAArray1;

	@OriginalMember(owner = "client!oa", name = "L", descriptor = "I")
	public int anInt7224;

	@OriginalMember(owner = "client!oa", name = "nativeid", descriptor = "J")
	public final long nativeid = 0L;

	@OriginalMember(owner = "client!oa", name = "J", descriptor = "Z")
	private boolean aBoolean506 = false;

	@OriginalMember(owner = "client!oa", name = "u", descriptor = "Lclient!bd;")
	private final Class32 aClass32_42 = new Class32();

	@OriginalMember(owner = "client!oa", name = "A", descriptor = "I")
	private int anInt7222 = 4096;

	@OriginalMember(owner = "client!oa", name = "x", descriptor = "I")
	private int anInt7223 = 4096;

	@OriginalMember(owner = "client!oa", name = "w", descriptor = "Lclient!fw;")
	private final Class125 aClass125_29 = new Class125(4);

	@OriginalMember(owner = "client!oa", name = "B", descriptor = "Z")
	private boolean aBoolean507 = false;

	@OriginalMember(owner = "client!oa", name = "N", descriptor = "Lclient!rd;")
	private Class263 aClass263_8;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!d;II)V")
	public oa(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface4 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super(arg1);
		try {
			if (!Static425.method6393("sw3d")) {
				throw new RuntimeException("");
			}
			Static567.method8135();
			this.MA(super.anInterface4_12, 0, 0);
			Static302.method4913(true, false);
			this.aBoolean507 = true;
			this.aClass263_8 = new ja();
			this.method6896(new ja());
			this.method6913(1);
			this.method6900(0);
			if (arg0 != null) {
				this.method6917(arg0, arg2, arg3);
				this.method6909(arg0);
			}
		} catch (@Pc(82) Throwable local82) {
			this.method6932();
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)V")
	@Override
	public void method6900(@OriginalArg(0) int arg0) {
		this.anAArray1[arg0].method3();
	}

	@OriginalMember(owner = "client!oa", name = "w", descriptor = "()Z")
	@Override
	public boolean method6924() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "Y", descriptor = "()[I")
	public native int[] Y();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method6942(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		if (this.aP1 == null) {
			throw new IllegalStateException("off");
		}
		this.aP1.method6709(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!lb;)V")
	@Override
	public void method6927(@OriginalArg(0) Class47 arg0) {
	}

	@OriginalMember(owner = "client!oa", name = "o", descriptor = "()Z")
	@Override
	public boolean method6897() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "A", descriptor = "()I")
	@Override
	public int method6926() {
		return 4;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!dea;IIII)Lclient!ka;")
	@Override
	public Class129 method6908(@OriginalArg(0) Class72 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new i(this, this.aYa2, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!oa", name = "Q", descriptor = "(IIIIII[BII)V")
	public native void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!oa", name = "H", descriptor = "(III[I)V")
	public native void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(IIIIII)Lclient!lb;")
	@Override
	public Class47 method6894(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!qv;I)V")
	@Override
	public void method6902(@OriginalArg(0) Class304 arg0, @OriginalArg(1) int arg1) {
		this.method6388(arg0);
		this.method6390().method12(this, Static424.anIntArray383, Static424.anIntArray380, Static424.anIntArray382, Static424.aShortArray92, arg0.aClass324_1.method7948());
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIID)V")
	public native void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4);

	@OriginalMember(owner = "client!oa", name = "r", descriptor = "()V")
	@Override
	public void method6901() {
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public Class159 method6959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new t(this, this.aYa2, arg0, arg1, arg2, arg3, 512, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "k", descriptor = "(I)V")
	@Override
	public void method6911(@OriginalArg(0) int arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!tja;[Lclient!oe;Z)Lclient!da;")
	@Override
	public Class68 method6958(@OriginalArg(0) Class350 arg0, @OriginalArg(1) Class266[] arg1, @OriginalArg(2) boolean arg2) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt7303;
			local7[local11] = arg1[local11].anInt7305;
			if (arg1[local11].aByteArray80 != null) {
				local9 = true;
			}
		}
		if (arg2) {
			if (local9) {
				throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
			}
			return new h(this, this.aYa2, arg0, arg1, (Class45[]) null);
		} else if (local9) {
			throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
		} else {
			return new n(this, this.aYa2, arg0, arg1, (Class45[]) null);
		}
	}

	@OriginalMember(owner = "client!oa", name = "v", descriptor = "()Z")
	@Override
	public boolean method6972() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "CA", descriptor = "(S[ISIBBIZBBBBZZZZZBZZI)V")
	private native void CA(@OriginalArg(0) short arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) short arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) byte arg9, @OriginalArg(10) byte arg10, @OriginalArg(11) byte arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13, @OriginalArg(14) boolean arg14, @OriginalArg(15) boolean arg15, @OriginalArg(16) boolean arg16, @OriginalArg(17) byte arg17, @OriginalArg(18) boolean arg18, @OriginalArg(19) boolean arg19, @OriginalArg(20) int arg20);

	@OriginalMember(owner = "client!oa", name = "la", descriptor = "()V")
	public native void la();

	@OriginalMember(owner = "client!oa", name = "s", descriptor = "()Z")
	@Override
	public boolean method6898() {
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "E", descriptor = "()I")
	public native int E();

	@OriginalMember(owner = "client!oa", name = "K", descriptor = "([I)V")
	public native void K(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)I")
	@Override
	public int method6967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 & 0xFFFFF;
		@Pc(7) int local7 = arg1 & 0xFFFFF;
		return local3 & local7 ^ local7;
	}

	@OriginalMember(owner = "client!oa", name = "JA", descriptor = "(IIIIII)I")
	public native int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Z)V")
	@Override
	public void method6968(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!oa", name = "EA", descriptor = "(IIII)V")
	public native void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([IIIIIZ)Lclient!fia;")
	@Override
	public Class45 method6935(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new j(this, arg0, 0, arg1, arg2, arg3, false);
	}

	@OriginalMember(owner = "client!oa", name = "m", descriptor = "()Z")
	@Override
	public boolean method6922() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(S)Z")
	private boolean method6387(@OriginalArg(0) short arg0) {
		synchronized (this) {
			@Pc(9) Class69 local9 = super.anInterface4_12.method8975(arg0);
			if (local9 == null) {
				return false;
			} else {
				this.AA(arg0, local9.aShort5, local9.anInt1679, local9.aByte19, local9.aByte18, local9.anInt1677, local9.aBoolean113, local9.aByte22, local9.aByte20, local9.aByte23, local9.aByte24, local9.aBoolean110, local9.aBoolean114, local9.aBoolean116, local9.aBoolean112, local9.aBoolean117, local9.aByte21, local9.aBoolean115, local9.aBoolean111, local9.anInt1680);
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "T", descriptor = "(IIII)V")
	public native void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6965(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)Lclient!bj;")
	@Override
	public Interface3 method6963(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new xa(arg0, arg1);
	}

	@OriginalMember(owner = "client!oa", name = "t", descriptor = "()Lclient!rd;")
	@Override
	public Class263 method6914() {
		return new ja();
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
	@Override
	public void method6940(@OriginalArg(0) int arg0) {
		this.anAArray1[arg0].method10();
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public void method6947(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
	}

	@OriginalMember(owner = "client!oa", name = "U", descriptor = "(IIIII)V")
	public native void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "p", descriptor = "()Z")
	@Override
	public boolean method6904() {
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!lb;Lclient!lb;FLclient!lb;)Lclient!lb;")
	@Override
	public Class47 method6899(@OriginalArg(0) Class47 arg0, @OriginalArg(1) Class47 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class47 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!oa", name = "na", descriptor = "(IIII)[I")
	public native int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "()V")
	@Override
	public void method6936() {
	}

	@OriginalMember(owner = "client!oa", name = "I", descriptor = "()I")
	public native int I();

	@OriginalMember(owner = "client!oa", name = "t", descriptor = "(Lclient!p;)V")
	private native void t(@OriginalArg(0) p arg0);

	@OriginalMember(owner = "client!oa", name = "r", descriptor = "(IIIIIII)I")
	public native int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(II)Lclient!wi;")
	@Override
	public Interface27 method6957(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method6890(arg0, arg1, false);
	}

	@OriginalMember(owner = "client!oa", name = "xa", descriptor = "(F)V")
	public native void xa(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public void method6912(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.Z(arg0, arg1, arg2, arg3, arg4, 1, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method6917(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) p local8 = (p) this.aClass125_29.method2630((long) arg0.hashCode());
		if (local8 == null) {
			try {
				@Pc(15) Class local15 = Class.forName("java.awt.Canvas");
				@Pc(27) Method local27 = local15.getMethod("setIgnoreRepaint", Boolean.TYPE);
				local27.invoke(arg0, Boolean.TRUE);
			} catch (@Pc(39) Exception local39) {
			}
			local8 = new p(this, arg0, arg1, arg2);
			this.aClass125_29.method2626(local8, (long) arg0.hashCode());
		} else if (local8.anInt7578 != arg1 || local8.anInt7579 != arg2) {
			local8.method6708(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "()Z")
	@Override
	public boolean method6962() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "da", descriptor = "(III[I)V")
	public native void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!oa", name = "u", descriptor = "()Z")
	@Override
	public boolean method6895() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "x", descriptor = "()Z")
	@Override
	public boolean method6892() {
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6893(@OriginalArg(0) Canvas arg0) {
		if (this.aP1.aCanvas9 == arg0) {
			this.method6909((Canvas) null);
		}
		@Pc(18) p local18 = (p) this.aClass125_29.method2630((long) arg0.hashCode());
		if (local18 != null) {
			local18.method9513();
			local18.method6706();
		}
	}

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(II)I")
	@Override
	public int method6937(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!tca;)V")
	@Override
	public void method6891(@OriginalArg(0) Interface22 arg0) {
		@Pc(2) wa local2 = (wa) arg0;
		this.n(local2.aJ1.nativeid, local2.aXa1.nativeid);
	}

	@OriginalMember(owner = "client!oa", name = "y", descriptor = "()Lclient!bg;")
	@Override
	public Class35 method6960() {
		return new Class35(0, "SSE", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6952(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "()Z")
	@Override
	public boolean method6966() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method6969(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.wa(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "()V")
	@Override
	public void method6953() {
		this.method6909(this.aP1.aCanvas9);
	}

	@OriginalMember(owner = "client!oa", name = "Z", descriptor = "(IIIIIILclient!aa;II)V")
	private native void Z(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class1 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!oa", name = "HA", descriptor = "(IIII[I)V")
	public native void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!qv;Z)V")
	private void method6388(@OriginalArg(0) Class304 arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		for (@Pc(15) Class4_Sub4_Sub1 local15 = (Class4_Sub4_Sub1) arg0.aClass324_1.method7947(); local15 != null; local15 = (Class4_Sub4_Sub1) arg0.aClass324_1.method7949()) {
			Static424.anIntArray383[local1++] = local15.anInt9663;
			Static424.anIntArray383[local1++] = local15.anInt9665;
			Static424.anIntArray383[local1++] = local15.anInt9662;
			Static424.anIntArray380[local3++] = local15.anInt9661;
			Static424.aShortArray92[local7++] = (short) local15.anInt9660;
			Static424.anIntArray382[local5++] = local15.anInt9664;
		}
	}

	@OriginalMember(owner = "client!oa", name = "L", descriptor = "(III)V")
	public native void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!oa", name = "k", descriptor = "()V")
	@Override
	public void method6889() {
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public Class1 method6930(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new na(this, this.aYa2, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6909(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aP1 = null;
			this.t((p) null);
		} else {
			@Pc(10) p local10 = (p) this.aClass125_29.method2630((long) arg0.hashCode());
			this.aP1 = local10;
			this.t(local10);
		}
	}

	@OriginalMember(owner = "client!oa", name = "XA", descriptor = "()I")
	public native int XA();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIZ)Lclient!fia;")
	@Override
	public Class45 method6938(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new j(this, arg0, arg1, arg2, arg3, !arg4);
	}

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "()V")
	private void method6389() {
		System.gc();
		System.runFinalization();
		Static567.method8136();
	}

	@OriginalMember(owner = "client!oa", name = "ya", descriptor = "()V")
	public native void ya();

	@OriginalMember(owner = "client!oa", name = "DA", descriptor = "(IIII)V")
	public native void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "()Lclient!rd;")
	@Override
	public Class263 method6943() {
		return this.aClass263_7;
	}

	@OriginalMember(owner = "client!oa", name = "GA", descriptor = "(I)V")
	public native void GA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "N", descriptor = "(I[I[F)V")
	private native void N(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) float[] arg2);

	@OriginalMember(owner = "client!oa", name = "pa", descriptor = "()V")
	public native void pa();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!qv;)V")
	@Override
	public void method6903(@OriginalArg(0) Class304 arg0) {
		if (arg0.aClass324_1.method7948() != 0) {
			this.method6388(arg0);
			this.method6390().method12(this, Static424.anIntArray383, Static424.anIntArray380, Static424.anIntArray382, Static424.aShortArray92, arg0.aClass324_1.method7948());
		}
	}

	@OriginalMember(owner = "client!oa", name = "ZA", descriptor = "(IFFFFF)V")
	public native void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method6888(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) p local8 = (p) this.aClass125_29.method2630((long) arg0.hashCode());
		local8.method6708(arg0, arg1, arg2);
		if (arg0 != null && arg0 == this.aP1.aCanvas9) {
			this.method6909(arg0);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method6948(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
	}

	@OriginalMember(owner = "client!oa", name = "za", descriptor = "(IIIII)V")
	protected native void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "FA", descriptor = "()V")
	private native void FA();

	@OriginalMember(owner = "client!oa", name = "va", descriptor = "(Lclient!za;)V")
	private native void va(@OriginalArg(0) Class14_Sub16 arg0);

	@OriginalMember(owner = "client!oa", name = "B", descriptor = "()Lclient!rd;")
	@Override
	public Class263 method6907() {
		return this.aClass263_8;
	}

	@OriginalMember(owner = "client!oa", name = "C", descriptor = "()Lclient!a;")
	public a method6390() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt7224; local1++) {
			if (this.anAArray1[local1].aRunnable1 == Thread.currentThread()) {
				return this.anAArray1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public void method6971() {
	}

	@OriginalMember(owner = "client!oa", name = "l", descriptor = "()Z")
	@Override
	public boolean method6920() {
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "i", descriptor = "()I")
	public native int i();

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(II)V")
	@Override
	public void method6918(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aP1 == null) {
			throw new IllegalStateException("off");
		}
		this.aP1.method6710(arg0, arg1);
	}

	@OriginalMember(owner = "client!oa", name = "ma", descriptor = "(J)V")
	private native void ma(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!oa", name = "F", descriptor = "(II)V")
	public native void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
	@Override
	public void method6946(@OriginalArg(0) int arg0) {
		Static567.method8136();
		this.d(arg0);
		for (@Pc(10) ya local10 = (ya) this.aClass32_42.method584(); local10 != null; local10 = (ya) this.aClass32_42.method577()) {
			local10.r();
		}
	}

	@OriginalMember(owner = "client!oa", name = "OA", descriptor = "()Ljava/lang/Object;")
	private Object method6391() {
		return new ba(this);
	}

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "(II)V")
	public native void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method6933(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method6390().method9(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "()Z")
	@Override
	public boolean method6973() {
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "w", descriptor = "(Z)V")
	public native void w(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!oa", name = "AA", descriptor = "(SSIBBIZBBBBZZZZZBZZI)V")
	private native void AA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) byte arg9, @OriginalArg(10) byte arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13, @OriginalArg(14) boolean arg14, @OriginalArg(15) boolean arg15, @OriginalArg(16) byte arg16, @OriginalArg(17) boolean arg17, @OriginalArg(18) boolean arg18, @OriginalArg(19) int arg19);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method6923(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.U(arg0, arg1, arg2, arg4, arg5);
		this.U(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.P(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
		this.P(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "P", descriptor = "(IIIII)V")
	public native void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "(JJ)V")
	private native void n(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1);

	@OriginalMember(owner = "client!oa", name = "aa", descriptor = "(IIIIII)V")
	public native void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "()V")
	@Override
	protected void method6905() {
		if (this.aBoolean506) {
			return;
		}
		this.anAArray1 = null;
		this.aP1 = null;
		this.aYa2 = null;
		this.aClass263_8 = null;
		this.aClass125_29.method2628();
		for (@Pc(26) ya local26 = (ya) this.aClass32_42.method584(); local26 != null; local26 = (ya) this.aClass32_42.method577()) {
			local26.ga();
		}
		this.aClass32_42.method588();
		this.FA();
		if (this.aBoolean507) {
			Static545.method5452(-100, false, true);
			this.aBoolean507 = false;
		}
		this.method6389();
		Static567.method8137();
		this.aBoolean506 = true;
	}

	@OriginalMember(owner = "client!oa", name = "z", descriptor = "()V")
	@Override
	public void method6950() {
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public void method6945(@OriginalArg(0) Class14_Sub16 arg0) {
		this.aYa2 = (ya) arg0;
		this.va(arg0);
	}

	@OriginalMember(owner = "client!oa", name = "M", descriptor = "()I")
	public native int M();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[Lclient!rfa;)V")
	@Override
	public void method6970(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub18[] arg1) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			Static424.anIntArray379[local1++] = arg1[local3].method8342();
			Static424.anIntArray379[local1++] = arg1[local3].method8344();
			Static424.anIntArray379[local1++] = arg1[local3].method8341();
			Static424.anIntArray379[local1++] = arg1[local3].method8343();
			Static424.aFloatArray58[local3] = arg1[local3].method8339();
			Static424.anIntArray379[local1++] = arg1[local3].method8345();
		}
		this.N(arg0, Static424.anIntArray379, Static424.aFloatArray58);
	}

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "(I)V")
	@Override
	public void method6931() {
		this.anInt7222 = this.anInt7223 = 10000;
		if (this.anInt7224 > 1) {
			throw new IllegalStateException("No MT");
		}
		this.method6913(this.anInt7224);
		this.method6900(0);
	}

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "(I)V")
	@Override
	public void method6913(@OriginalArg(0) int arg0) {
		this.anInt7224 = arg0;
		this.anAArray1 = new a[this.anInt7224];
		for (@Pc(9) int local9 = 0; local9 < this.anInt7224; local9++) {
			this.anAArray1[local9] = new a(this, this.anInt7222, this.anInt7223);
		}
	}

	@OriginalMember(owner = "client!oa", name = "MA", descriptor = "(Lclient!d;II)V")
	private native void MA(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([I)V")
	@Override
	public void method6921(@OriginalArg(0) int[] arg0) {
		@Pc(4) Dimension local4 = this.aP1.aCanvas9.getSize();
		arg0[0] = local4.width;
		arg0[1] = local4.height;
	}

	@OriginalMember(owner = "client!oa", name = "ra", descriptor = "(IIII)V")
	public native void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "q", descriptor = "()V")
	@Override
	public void method6916() {
	}

	@OriginalMember(owner = "client!oa", name = "C", descriptor = "(Z)V")
	public native void C(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "()Z")
	@Override
	public boolean method6944() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "wa", descriptor = "(IIIIII)V")
	private native void wa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIZ)Lclient!fia;")
	@Override
	public Class45 method6890(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new j(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V")
	@Override
	public void method6954(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!oe;Z)Lclient!fia;")
	@Override
	public Class45 method6964(@OriginalArg(0) Class266 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(17) j local17 = new j(this, arg0.anIntArray386, arg0.aByteArray79, arg0.aByteArray80, 0, arg0.anInt7303, arg0.anInt7303, arg0.anInt7305);
		local17.method7499(arg0.anInt7304, arg0.anInt7308, arg0.anInt7307, arg0.anInt7306);
		return local17;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!wi;Lclient!bj;)Lclient!tca;")
	@Override
	public Interface22 method6956(@OriginalArg(0) Interface27 arg0, @OriginalArg(1) Interface3 arg1) {
		return new wa(this, (j) arg0, (xa) arg1);
	}

	@OriginalMember(owner = "client!oa", name = "KA", descriptor = "(IIII)V")
	public native void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "WA", descriptor = "(S)Z")
	private boolean method6392(@OriginalArg(0) short arg0) {
		@Pc(2) Interface4 local2 = super.anInterface4_12;
		synchronized (super.anInterface4_12) {
			if (!super.anInterface4_12.method8974(arg0)) {
				return false;
			}
			@Pc(22) Class69 local22 = super.anInterface4_12.method8975(arg0);
			if (local22 == null) {
				return false;
			}
			@Pc(44) int[] local44;
			if (local22.anInt1679 == 2) {
				local44 = super.anInterface4_12.method8979(128, 0.7F, arg0, 128);
			} else {
				local44 = super.anInterface4_12.method8977(0.7F, arg0, 128, 128, true);
			}
			this.CA(arg0, local44, local22.aShort5, local22.anInt1679, local22.aByte19, local22.aByte18, local22.anInt1677, local22.aBoolean113, local22.aByte22, local22.aByte20, local22.aByte23, local22.aByte24, local22.aBoolean110, local22.aBoolean114, local22.aBoolean116, local22.aBoolean112, local22.aBoolean117, local22.aByte21, local22.aBoolean115, local22.aBoolean111, local22.anInt1680);
			return true;
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "()Z")
	@Override
	public boolean method6955() {
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "(I)Lclient!za;")
	@Override
	public Class14_Sub16 method6961(@OriginalArg(0) int arg0) {
		@Pc(5) ya local5 = new ya(this, arg0);
		this.aClass32_42.method582(local5);
		return local5;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIF)Lclient!rfa;")
	@Override
	public Class14_Sub18 method6915(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class14_Sub18_Sub3(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "X", descriptor = "(I)V")
	public native void X(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "finalize", descriptor = "()V")
	@Override
	public synchronized void finalize() {
		this.method6932();
		if (this.nativeid != 0L) {
			Static567.method8139(this);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!rd;)V")
	@Override
	public void method6896(@OriginalArg(0) Class263 arg0) {
		this.aClass263_7 = arg0;
		this.ma(((ja) arg0).nativeid);
	}

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V")
	private native void d(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "A", descriptor = "(ILclient!aa;II)V")
	public native void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);
}
