import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public final class da extends Class5 implements Interface8 {

	@OriginalMember(owner = "client!da", name = "q", descriptor = "Lclient!a;")
	private a anA1;

	@OriginalMember(owner = "client!da", name = "B", descriptor = "Lclient!v;")
	private v aV1;

	@OriginalMember(owner = "client!da", name = "H", descriptor = "Lclient!q;")
	private Class205 aClass205_2;

	@OriginalMember(owner = "client!da", name = "J", descriptor = "I")
	private int anInt1620;

	@OriginalMember(owner = "client!da", name = "L", descriptor = "[Lclient!t;")
	private t[] aTArray1;

	@OriginalMember(owner = "client!da", name = "nativeid", descriptor = "J")
	private final long nativeid = 0L;

	@OriginalMember(owner = "client!da", name = "r", descriptor = "Z")
	private boolean aBoolean128 = false;

	@OriginalMember(owner = "client!da", name = "p", descriptor = "Lclient!eea;")
	private final Class71 aClass71_17 = new Class71();

	@OriginalMember(owner = "client!da", name = "C", descriptor = "I")
	private final int anInt1618 = 4096;

	@OriginalMember(owner = "client!da", name = "I", descriptor = "I")
	private final int anInt1619 = 4096;

	@OriginalMember(owner = "client!da", name = "G", descriptor = "Lclient!sd;")
	private final Class267 aClass267_8 = new Class267(4);

	@OriginalMember(owner = "client!da", name = "K", descriptor = "Z")
	private boolean aBoolean129 = false;

	@OriginalMember(owner = "client!da", name = "E", descriptor = "Lclient!q;")
	private Class205 aClass205_1;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!e;)V")
	public da(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface4 arg1) {
		super(arg1);
		try {
			if (!Static140.method2462("sw3d")) {
				throw new RuntimeException("");
			}
			Static354.method5573();
			this.PA(super.anInterface4_14, 0, 0);
			Static340.method5406(true, false);
			this.aBoolean129 = true;
			this.aClass205_1 = new wa();
			this.method7469(new wa());
			this.method7474(1);
			this.method7438(0);
			if (arg0 != null) {
				this.method7451(arg0);
				this.method7422(arg0);
			}
		} catch (@Pc(78) Throwable local78) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(II)I")
	@Override
	public int method7435(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 & 0xFFFFF;
		@Pc(7) int local7 = arg1 & 0xFFFFF;
		return local3 & local7 ^ local7;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method7436() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!da", name = "FA", descriptor = "(IIIIII)Z")
	public native boolean FA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!da", name = "e", descriptor = "(I)V")
	@Override
	public void method7454(@OriginalArg(0) int arg0) {
		this.aTArray1[arg0].method6844();
	}

	@OriginalMember(owner = "client!da", name = "e", descriptor = "()Z")
	@Override
	public boolean method7423() {
		return true;
	}

	@OriginalMember(owner = "client!da", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7451(@OriginalArg(0) Canvas arg0) {
		@Pc(8) v local8 = (v) this.aClass267_8.method6644((long) arg0.hashCode());
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
		this.aClass267_8.method6640(local8, (long) arg0.hashCode());
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method7484(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.e(arg0, arg1, arg2, arg4, arg5);
		this.e(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.ya(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
		this.ya(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II)I")
	@Override
	public int method7418(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II[I[I)Lclient!fa;")
	@Override
	public Class10 method7481(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new f(this, this.anA1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!da", name = "ka", descriptor = "(FF)V")
	public native void ka(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIILclient!fa;II)V")
	@Override
	public void method7467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class10 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.ra(arg0, arg1, arg2, arg3, arg4, 1, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II[[I[[IIII)Lclient!d;")
	@Override
	public Class52 method7432(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new ya(this, this.anA1, arg0, arg1, arg2, arg3, 512, arg4, arg5);
	}

	@OriginalMember(owner = "client!da", name = "U", descriptor = "()I")
	public native int U();

	@OriginalMember(owner = "client!da", name = "e", descriptor = "(IIIII)V")
	public native void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!ba;Lclient!be;Lclient!q;Lclient!sda;I)V")
	@Override
	public void method7464(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class26 arg1, @OriginalArg(2) Class205 arg2, @OriginalArg(3) Class4_Sub7 arg3, @OriginalArg(4) int arg4) {
		this.method1547(arg1, true);
		if (arg3 == null) {
			this.method1542().m(this, arg0, arg2, null, arg4, Static74.anIntArray188, Static74.anIntArray191, Static74.anIntArray190, Static74.aShortArray37, Static74.aByteArray26, arg1.aClass163_1.method4283(), Static74.anIntArray187);
			return;
		}
		Static74.anIntArray192[5] = 0;
		this.method1542().m(this, arg0, arg2, Static74.anIntArray192, arg4, Static74.anIntArray188, Static74.anIntArray191, Static74.anIntArray190, Static74.aShortArray37, Static74.aByteArray26, arg1.aClass163_1.method4283(), Static74.anIntArray187);
		arg3.anInt8049 = Static74.anIntArray192[0];
		arg3.anInt8050 = Static74.anIntArray192[1];
		arg3.anInt8047 = Static74.anIntArray192[2];
		arg3.anInt8051 = Static74.anIntArray192[3];
		arg3.anInt8048 = Static74.anIntArray192[4];
		arg3.aBoolean573 = Static74.anIntArray192[5] != 0;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIII)Lclient!dw;")
	@Override
	public Class66 method7415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!da", name = "m", descriptor = "(IIII)V")
	public native void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "YA", descriptor = "(IFFFFF)V")
	public native void YA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!da", name = "PA", descriptor = "(Lclient!e;II)V")
	private native void PA(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!da", name = "L", descriptor = "(ILclient!fa;II)V")
	public native void L(@OriginalArg(0) int arg0, @OriginalArg(1) Class10 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "fa", descriptor = "()V")
	private native void fa();

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(Lclient!i;)V")
	@Override
	public void method7456(@OriginalArg(0) Class3_Sub22 arg0) {
		this.anA1 = (a) arg0;
		this.a(arg0);
	}

	@OriginalMember(owner = "client!da", name = "ha", descriptor = "(F)V")
	public native void ha(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!da", name = "P", descriptor = "(Lclient!v;)V")
	private native void P(@OriginalArg(0) v arg0);

	@OriginalMember(owner = "client!da", name = "g", descriptor = "()V")
	@Override
	public void method7428() {
	}

	@OriginalMember(owner = "client!da", name = "finalize", descriptor = "()V")
	@Override
	public synchronized void finalize() {
		this.method7437();
		if (this.nativeid != 0L) {
			Static354.method5572(this);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!i;)V")
	private native void a(@OriginalArg(0) Class3_Sub22 arg0);

	@OriginalMember(owner = "client!da", name = "LA", descriptor = "(IIII)V")
	public native void LA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method7419(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.BA(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!da", name = "ra", descriptor = "(IIIIIILclient!fa;II)V")
	private native void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class10 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!da", name = "x", descriptor = "()Z")
	@Override
	public boolean method7465() {
		return true;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Z)V")
	@Override
	public void method7412(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!da", name = "C", descriptor = "()I")
	@Override
	public int method7479() {
		return 4;
	}

	@OriginalMember(owner = "client!da", name = "j", descriptor = "()Z")
	@Override
	public boolean method7439() {
		return true;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!or;IIII)Lclient!ba;")
	@Override
	public Class2 method7443(@OriginalArg(0) Class222 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new j(this, this.anA1, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!da", name = "h", descriptor = "(IIIII)V")
	protected native void h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([Lclient!ba;Lclient!be;Lclient!q;[Lclient!sda;I)V")
	@Override
	public void method7478(@OriginalArg(0) Class2[] arg0, @OriginalArg(1) Class26 arg1, @OriginalArg(2) Class205 arg2, @OriginalArg(3) Class4_Sub7[] arg3, @OriginalArg(4) int arg4) {
		this.method1547(arg1, true);
		if (arg3 == null) {
			this.method1542().v(this, arg0, arg2, null, arg4, Static74.anIntArray188, Static74.anIntArray191, Static74.anIntArray190, Static74.aShortArray37, Static74.aByteArray26, arg1.aClass163_1.method4283(), Static74.anIntArray187);
		} else {
			@Pc(28) Class4_Sub7 local28 = arg3[0];
			Static74.anIntArray192[5] = 0;
			this.method1542().v(this, arg0, arg2, Static74.anIntArray192, arg4, Static74.anIntArray188, Static74.anIntArray191, Static74.anIntArray190, Static74.aShortArray37, Static74.aByteArray26, arg1.aClass163_1.method4283(), Static74.anIntArray187);
			local28.anInt8049 = Static74.anIntArray192[0];
			local28.anInt8050 = Static74.anIntArray192[1];
			local28.anInt8047 = Static74.anIntArray192[2];
			local28.anInt8051 = Static74.anIntArray192[3];
			local28.anInt8048 = Static74.anIntArray192[4];
			local28.aBoolean573 = Static74.anIntArray192[5] != 0;
		}
		for (@Pc(86) int local86 = 0; local86 < arg0.length; local86++) {
			if (arg0[local86] != null) {
				@Pc(96) j local96 = (j) arg0[local86];
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!cq;[Lclient!af;Z)Lclient!ta;")
	@Override
	public Class59 method7414(@OriginalArg(0) Class53 arg0, @OriginalArg(1) Class9[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt478;
			local7[local11] = arg1[local11].anInt481;
			if (arg1[local11].aByteArray12 != null) {
				local9 = true;
			}
		}
		if (local9) {
			throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
		}
		return new b(this, this.anA1, arg0, arg1, null);
	}

	@OriginalMember(owner = "client!da", name = "h", descriptor = "()Lclient!nl;")
	@Override
	public Class207 method7430() {
		return new Class207(0, "SSE", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!da", name = "r", descriptor = "()Z")
	@Override
	public boolean method7452() {
		return false;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!da", name = "Q", descriptor = "(IIII)V")
	public native void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "D", descriptor = "()Z")
	@Override
	public boolean method7480() {
		return true;
	}

	@OriginalMember(owner = "client!da", name = "A", descriptor = "()Z")
	@Override
	public boolean method7472() {
		return false;
	}

	@OriginalMember(owner = "client!da", name = "o", descriptor = "(Lclient!q;)V")
	private native void o(@OriginalArg(0) Class205 arg0);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "()Lclient!q;")
	@Override
	public Class205 method7409() {
		return new wa();
	}

	@OriginalMember(owner = "client!da", name = "q", descriptor = "()V")
	@Override
	public void method7449() throws Exception_Sub1 {
		if (this.aV1 == null) {
			throw new IllegalStateException("off");
		}
		this.aV1.method7256();
	}

	@OriginalMember(owner = "client!da", name = "E", descriptor = "()Lclient!t;")
	public t method1542() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1620; local1++) {
			if (this.aTArray1[local1].aRunnable4 == Thread.currentThread()) {
				return this.aTArray1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I[Lclient!oj;)V")
	@Override
	public void method7460(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub30[] arg1) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			Static74.anIntArray189[local1++] = arg1[local3].method5386();
			Static74.anIntArray189[local1++] = arg1[local3].method5390();
			Static74.anIntArray189[local1++] = arg1[local3].method5388();
			Static74.anIntArray189[local1++] = arg1[local3].method5387();
			Static74.aFloatArray8[local3] = arg1[local3].method5382();
			Static74.anIntArray189[local1++] = arg1[local3].method5391();
		}
		this.f(arg0, Static74.anIntArray189, Static74.aFloatArray8);
	}

	@OriginalMember(owner = "client!da", name = "f", descriptor = "()Z")
	@Override
	public boolean method7426() {
		return false;
	}

	@OriginalMember(owner = "client!da", name = "p", descriptor = "()Lclient!q;")
	@Override
	public Class205 method7448() {
		return this.aClass205_1;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([IIIII)Lclient!xa;")
	@Override
	public Class119 method7483(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
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

	@OriginalMember(owner = "client!da", name = "H", descriptor = "(Z)V")
	public native void H(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!da", name = "D", descriptor = "(I)V")
	public native void D(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "d", descriptor = "(I)V")
	@Override
	public void method7438(@OriginalArg(0) int arg0) {
		this.aTArray1[arg0].method6843();
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIF)Lclient!oj;")
	@Override
	public Class3_Sub30 method7475(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class3_Sub30_Sub3(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7442(@OriginalArg(0) Canvas arg0) {
		@Pc(8) v local8 = (v) this.aClass267_8.method6644((long) arg0.hashCode());
		@Pc(11) Dimension local11 = arg0.getSize();
		local8.D(arg0, local11.width, local11.height);
		if (arg0 != null && arg0 == this.aV1.aCanvas13) {
			this.method7422(arg0);
		}
	}

	@OriginalMember(owner = "client!da", name = "h", descriptor = "(I)V")
	@Override
	public void method7474(@OriginalArg(0) int arg0) {
		this.anInt1620 = arg0;
		this.aTArray1 = new t[this.anInt1620];
		for (@Pc(9) int local9 = 0; local9 < this.anInt1620; local9++) {
			this.aTArray1[local9] = new t(this, this.anInt1618, this.anInt1619);
		}
	}

	@OriginalMember(owner = "client!da", name = "m", descriptor = "()V")
	@Override
	public void method7444() {
	}

	@OriginalMember(owner = "client!da", name = "t", descriptor = "()V")
	@Override
	public void method7453() {
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method7458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method1542().IA(this, arg0, arg1, arg2, arg3, arg4, arg5, 0);
	}

	@OriginalMember(owner = "client!da", name = "X", descriptor = "(III)V")
	public native void X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!da", name = "qa", descriptor = "(S)Z")
	private boolean method1543(@OriginalArg(0) short arg0) {
		synchronized (this) {
			@Pc(9) Class238 local9 = super.anInterface4_14.method6712(arg0);
			if (local9 == null) {
				return false;
			} else {
				this.b(arg0, local9.aByte67, local9.aByte71, local9.aBoolean464, local9.aBoolean461, local9.aBoolean470, local9.aByte68, local9.aByte69, local9.aByte70, local9.aShort111, local9.anInt7127, local9.aBoolean462, local9.aBoolean469);
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "z", descriptor = "()V")
	@Override
	public void method7471() {
	}

	@OriginalMember(owner = "client!da", name = "g", descriptor = "(I)Lclient!i;")
	@Override
	public Class3_Sub22 method7470(@OriginalArg(0) int arg0) {
		@Pc(5) a local5 = new a(this, arg0);
		this.aClass71_17.method2076(local5);
		return local5;
	}

	@OriginalMember(owner = "client!da", name = "i", descriptor = "()Z")
	@Override
	public boolean method7431() {
		return true;
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7424(@OriginalArg(0) Canvas arg0) {
		if (this.aV1.aCanvas13 == arg0) {
			this.method7422(null);
		}
		@Pc(16) v local16 = (v) this.aClass267_8.method6644((long) arg0.hashCode());
		if (local16 != null) {
			local16.method7820();
			local16.method7255();
		}
	}

	@OriginalMember(owner = "client!da", name = "s", descriptor = "()V")
	private void method1544() {
		System.gc();
		System.runFinalization();
		Static354.method5570();
	}

	@OriginalMember(owner = "client!da", name = "l", descriptor = "()Z")
	@Override
	public boolean method7441() {
		return false;
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(I)V")
	private native void c(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7422(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aV1 = null;
			this.P(null);
		} else {
			@Pc(10) v local10 = (v) this.aClass267_8.method6644((long) arg0.hashCode());
			this.aV1 = local10;
			this.P(local10);
		}
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "()V")
	@Override
	public void method7413() {
	}

	@OriginalMember(owner = "client!da", name = "d", descriptor = "()Z")
	@Override
	public boolean method7421() {
		return true;
	}

	@OriginalMember(owner = "client!da", name = "na", descriptor = "(III[I)V")
	public native void na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!da", name = "AA", descriptor = "(IIII)V")
	public native void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "HA", descriptor = "()Ljava/lang/Object;")
	private Object method1545() {
		return new pa(this);
	}

	@OriginalMember(owner = "client!da", name = "o", descriptor = "()V")
	@Override
	protected void method7447() {
		if (this.aBoolean128) {
			return;
		}
		this.aTArray1 = null;
		this.aV1 = null;
		this.anA1 = null;
		this.aClass205_1 = null;
		this.aClass267_8.method6648();
		for (@Pc(25) a local25 = (a) this.aClass71_17.method2089(); local25 != null; local25 = (a) this.aClass71_17.method2086()) {
			local25.ZA();
		}
		this.aClass71_17.method2088();
		this.fa();
		if (this.aBoolean129) {
			Static390.method5973(true, false);
			this.aBoolean129 = false;
		}
		this.method1544();
		Static354.method5571();
		this.aBoolean128 = true;
	}

	@OriginalMember(owner = "client!da", name = "ca", descriptor = "(IIII)V")
	public native void ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "IA", descriptor = "()I")
	public native int IA();

	@OriginalMember(owner = "client!da", name = "w", descriptor = "()Z")
	@Override
	public boolean method7462() {
		return false;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!dw;Lclient!dw;FLclient!dw;)Lclient!dw;")
	@Override
	public Class66 method7450(@OriginalArg(0) Class66 arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class66 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!da", name = "J", descriptor = "(SBBZZZBBBIIZZ[I)V")
	private native void J(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) int[] arg13);

	@OriginalMember(owner = "client!da", name = "k", descriptor = "()V")
	public native void k();

	@OriginalMember(owner = "client!da", name = "aa", descriptor = "()I")
	public native int aa();

	@OriginalMember(owner = "client!da", name = "SA", descriptor = "()I")
	public native int SA();

	@OriginalMember(owner = "client!da", name = "f", descriptor = "(I[I[F)V")
	private native void f(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) float[] arg2);

	@OriginalMember(owner = "client!da", name = "d", descriptor = "(S)Z")
	private boolean method1546(@OriginalArg(0) short arg0) {
		@Pc(2) Interface4 local2 = super.anInterface4_14;
		synchronized (super.anInterface4_14) {
			if (!super.anInterface4_14.method6708(arg0)) {
				return false;
			}
			@Pc(22) Class238 local22 = super.anInterface4_14.method6712(arg0);
			if (local22 == null) {
				return false;
			}
			@Pc(43) int[] local43;
			if (local22.aBoolean465) {
				local43 = super.anInterface4_14.method6707(128, arg0, 128, 0.7F);
			} else {
				local43 = super.anInterface4_14.method6711(128, 0.7F, arg0, 128, true);
			}
			this.J(arg0, local22.aByte67, local22.aByte71, local22.aBoolean464, local22.aBoolean461, local22.aBoolean470, local22.aByte68, local22.aByte69, local22.aByte70, local22.aShort111, local22.anInt7127, local22.aBoolean462, local22.aBoolean469, local43);
			return true;
		}
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(Z)V")
	@Override
	public void method7446(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "()V")
	@Override
	public void method7420() {
	}

	@OriginalMember(owner = "client!da", name = "f", descriptor = "(I)V")
	@Override
	public void method7463(@OriginalArg(0) int arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!da", name = "v", descriptor = "()I")
	public native int v();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method7469(@OriginalArg(0) Class205 arg0) {
		this.aClass205_2 = arg0;
		this.o(arg0);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method7417(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aV1 == null) {
			throw new IllegalStateException("off");
		}
		this.aV1.method7258(arg0, arg1);
	}

	@OriginalMember(owner = "client!da", name = "ya", descriptor = "(IIIII)V")
	public native void ya(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([Lclient!ba;Lclient!q;[Lclient!sda;I)V")
	@Override
	public void method7468(@OriginalArg(0) Class2[] arg0, @OriginalArg(1) Class205 arg1, @OriginalArg(2) Class4_Sub7[] arg2, @OriginalArg(3) int arg3) {
		if (arg2 == null) {
			this.method1542().n(this, arg0, arg1, null, -1, arg3);
			return;
		}
		@Pc(15) Class4_Sub7 local15 = arg2[0];
		Static74.anIntArray192[5] = 0;
		this.method1542().n(this, arg0, arg1, Static74.anIntArray192, -1, arg3);
		local15.anInt8049 = Static74.anIntArray192[0];
		local15.anInt8050 = Static74.anIntArray192[1];
		local15.anInt8047 = Static74.anIntArray192[2];
		local15.anInt8051 = Static74.anIntArray192[3];
		local15.anInt8048 = Static74.anIntArray192[4];
		local15.aBoolean573 = Static74.anIntArray192[5] != 0;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!be;Z)V")
	private void method1547(@OriginalArg(0) Class26 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(15) Class4_Sub3_Sub1 local15 = (Class4_Sub3_Sub1) arg0.aClass163_1.method4279(); local15 != null; local15 = (Class4_Sub3_Sub1) arg0.aClass163_1.method4282()) {
			Static74.anIntArray188[local1++] = local15.anInt5229;
			Static74.anIntArray188[local1++] = local15.anInt5228;
			Static74.anIntArray188[local1++] = local15.anInt5221;
			Static74.anIntArray191[local3++] = local15.anInt5222;
			Static74.aShortArray37[local7++] = (short) local15.anInt5223;
			Static74.anIntArray190[local5++] = local15.anInt5219;
			if (arg1) {
				Static74.aByteArray26[local9++] = local15.aByte46;
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7410(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!af;Z)Lclient!xa;")
	@Override
	public Class119 method7425(@OriginalArg(0) Class9 arg0) {
		@Pc(2) int[] local2 = arg0.anIntArray90;
		@Pc(5) byte[] local5 = arg0.aByteArray13;
		@Pc(8) int local8 = arg0.anInt478;
		@Pc(11) int local11 = arg0.anInt481;
		@Pc(32) Class119 local32;
		if (arg0.aByteArray12 == null) {
			local32 = new la(this, this.anA1, local2, local5, 0, arg0.anInt478, arg0.anInt478, arg0.anInt481);
		} else {
			@Pc(37) int local37 = local8 * local11;
			@Pc(40) int[] local40 = new int[local37];
			@Pc(43) byte[] local43 = arg0.aByteArray12;
			@Pc(52) int local52;
			@Pc(54) int local54;
			if (local43 == null) {
				@Pc(100) boolean local100 = false;
				for (local52 = 0; local52 < local37; local52++) {
					local54 = arg0.anIntArray90[local5[local52] & 0xFF];
					if (local54 >>> 24 != 255) {
						local100 = true;
					}
					local40[local52] = local54;
				}
				if (local100) {
					local32 = new aa(this, this.anA1, local40, 0, arg0.anInt478, arg0.anInt478, arg0.anInt481);
				} else {
					local32 = new ja(this, this.anA1, local40, 0, arg0.anInt478, arg0.anInt478, arg0.anInt481);
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
		local32.EA(arg0.anInt476, arg0.anInt477, arg0.anInt480, arg0.anInt479);
		return local32;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIZ)Lclient!xa;")
	@Override
	public Class119 method7457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return arg4 ? new aa(this, this.anA1, arg0, arg1, arg2, arg3) : new ja(this, this.anA1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!da", name = "n", descriptor = "()Z")
	@Override
	public boolean method7445() {
		return true;
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(SBBZZZBBBIIZZ)V")
	private native void b(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!dw;)V")
	@Override
	public void method7485(@OriginalArg(0) Class66 arg0) {
	}

	@OriginalMember(owner = "client!da", name = "sa", descriptor = "(II)V")
	public native void sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!da", name = "C", descriptor = "(IIIIII)V")
	public native void C(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!da", name = "y", descriptor = "()Z")
	@Override
	public boolean method7466() {
		return false;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!be;)V")
	@Override
	public void method7429(@OriginalArg(0) Class26 arg0) {
		this.method1547(arg0, false);
		this.method1542().WA(this, Static74.anIntArray188, Static74.anIntArray191, Static74.anIntArray190, Static74.aShortArray37, arg0.aClass163_1.method4283());
	}

	@OriginalMember(owner = "client!da", name = "BA", descriptor = "(IIIIII)V")
	private native void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!da", name = "u", descriptor = "()Z")
	@Override
	public boolean method7461() {
		return false;
	}

	@OriginalMember(owner = "client!da", name = "B", descriptor = "()Z")
	@Override
	public boolean method7473() {
		return true;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
	@Override
	public void method7427(@OriginalArg(0) int arg0) {
		Static354.method5570();
		this.c(arg0);
		for (@Pc(10) a local10 = (a) this.aClass71_17.method2089(); local10 != null; local10 = (a) this.aClass71_17.method2086()) {
			local10.P();
		}
	}

	@OriginalMember(owner = "client!da", name = "ma", descriptor = "(IIIIII[BII)V")
	public native void ma(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(Z)V")
	@Override
	public void method7455(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!da", name = "A", descriptor = "([I)V")
	public native void A(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!da", name = "F", descriptor = "()V")
	public native void F();

	@OriginalMember(owner = "client!da", name = "KA", descriptor = "(IIII)[I")
	public native int[] KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "JA", descriptor = "(I)V")
	public native void JA(@OriginalArg(0) int arg0);
}
