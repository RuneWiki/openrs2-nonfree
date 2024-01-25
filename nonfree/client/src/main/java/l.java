import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class l extends Class162 implements Interface18 {

	@OriginalMember(owner = "client!l", name = "z", descriptor = "Lclient!m;")
	private m aM1;

	@OriginalMember(owner = "client!l", name = "I", descriptor = "Lclient!q;")
	private Class25 aClass25_3;

	@OriginalMember(owner = "client!l", name = "J", descriptor = "Lclient!ta;")
	private ta aTa1;

	@OriginalMember(owner = "client!l", name = "K", descriptor = "[Lclient!qa;")
	private qa[] aQaArray1;

	@OriginalMember(owner = "client!l", name = "L", descriptor = "I")
	public int anInt4954;

	@OriginalMember(owner = "client!l", name = "p", descriptor = "Z")
	private boolean aBoolean386 = false;

	@OriginalMember(owner = "client!l", name = "nativeid", descriptor = "J")
	private final long nativeid = 0L;

	@OriginalMember(owner = "client!l", name = "v", descriptor = "Lclient!dc;")
	private final Class70 aClass70_36 = new Class70();

	@OriginalMember(owner = "client!l", name = "D", descriptor = "I")
	private final int anInt4952 = 4096;

	@OriginalMember(owner = "client!l", name = "H", descriptor = "I")
	private final int anInt4953 = 4096;

	@OriginalMember(owner = "client!l", name = "F", descriptor = "Lclient!efa;")
	private final Class90 aClass90_13 = new Class90(4);

	@OriginalMember(owner = "client!l", name = "M", descriptor = "Z")
	private boolean aBoolean387 = false;

	@OriginalMember(owner = "client!l", name = "G", descriptor = "Lclient!q;")
	private Class25 aClass25_2;

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!fa;)V")
	public l(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface9 arg1) {
		super(arg1);
		try {
			if (!Static560.method7324("sw3d")) {
				throw new RuntimeException("");
			}
			Static356.method5084();
			this.OA(super.anInterface9_10, 0, 0);
			Static50.method866(true, false);
			this.aBoolean387 = true;
			this.aClass25_2 = new ra();
			this.method6816(new ra());
			this.method6823(1);
			this.method6850(0);
			if (arg0 != null) {
				this.method6814(arg0);
				this.method6884(arg0);
			}
		} catch (@Pc(78) Throwable local78) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!l", name = "d", descriptor = "(I)V")
	@Override
	public void method6830(@OriginalArg(0) int arg0) {
		this.aQaArray1[arg0].method5666();
	}

	@OriginalMember(owner = "client!l", name = "g", descriptor = "()Z")
	@Override
	public boolean method6837() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(Z)V")
	@Override
	public void method6887(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "()Z")
	@Override
	public boolean method6822() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!fo;[Lclient!ut;Z)Lclient!la;")
	@Override
	public Class37 method6864(@OriginalArg(0) Class112 arg0, @OriginalArg(1) Class344[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt8947;
			local7[local11] = arg1[local11].anInt8946;
			if (arg1[local11].aByteArray95 != null) {
				local9 = true;
			}
		}
		if (local9) {
			throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
		}
		return new c(this, this.aM1, arg0, arg1, null);
	}

	@OriginalMember(owner = "client!l", name = "pa", descriptor = "(III)V")
	public native void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!l", name = "D", descriptor = "()Lclient!qa;")
	public qa method4237() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4954; local1++) {
			if (this.aQaArray1[local1].aRunnable1 == Thread.currentThread()) {
				return this.aQaArray1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "([IIIII)Lclient!f;")
	@Override
	public Class38 method6879(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new t(this, this.aM1, arg0, 0, arg1, arg2, arg3) : new va(this, this.aM1, arg0, 0, arg1, arg2, arg3);
				}
			}
		}
		return local1 ? new t(this, this.aM1, arg0, 0, arg1, arg2, arg3) : new va(this, this.aM1, arg0, 0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!l", name = "va", descriptor = "(I)V")
	public native void va(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!l", name = "finalize", descriptor = "()V")
	@Override
	public synchronized void finalize() {
		this.method6821();
		if (this.nativeid != 0L) {
			Static356.method5080(this);
		}
	}

	@OriginalMember(owner = "client!l", name = "WA", descriptor = "()V")
	private void method4238() {
		System.gc();
		System.runFinalization();
		Static356.method5082();
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6854(@OriginalArg(0) Canvas arg0) {
		if (this.aTa1.aCanvas11 == arg0) {
			this.method6884(null);
		}
		@Pc(16) ta local16 = (ta) this.aClass90_13.method1685((long) arg0.hashCode());
		if (local16 != null) {
			local16.method7657();
			local16.method6492();
		}
	}

	@OriginalMember(owner = "client!l", name = "h", descriptor = "()Z")
	@Override
	public boolean method6838() {
		return false;
	}

	@OriginalMember(owner = "client!l", name = "L", descriptor = "()V")
	public native void L();

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6852(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!l", name = "O", descriptor = "(IIIIII)Z")
	public native boolean O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!l", name = "V", descriptor = "(IIII)V")
	public native void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "y", descriptor = "()Z")
	@Override
	public boolean method6866() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "o", descriptor = "()Z")
	@Override
	public boolean method6848() {
		return false;
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method6827(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.XA(arg0, arg1, arg2, arg4, arg5);
		this.XA(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.m(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
		this.m(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
	}

	@OriginalMember(owner = "client!l", name = "d", descriptor = "()Z")
	@Override
	public boolean method6824() {
		return false;
	}

	@OriginalMember(owner = "client!l", name = "T", descriptor = "()I")
	public native int T();

	@OriginalMember(owner = "client!l", name = "J", descriptor = "(IIIIII)V")
	public native void J(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method6816(@OriginalArg(0) Class25 arg0) {
		this.aClass25_3 = arg0;
		this.NA(arg0);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!rs;)V")
	@Override
	public void method6812(@OriginalArg(0) Class17 arg0) {
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!f;Z)V")
	@Override
	protected void method6855(@OriginalArg(0) Class38 arg0) {
		if (arg0 instanceof va) {
			this.q((va) arg0);
		} else if (arg0 instanceof t) {
			this.ma((t) arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!l", name = "ZA", descriptor = "(Z)V")
	public native void ZA(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!l", name = "ja", descriptor = "(I)V")
	public native void ja(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!l", name = "q", descriptor = "(Lclient!va;)V")
	private native void q(@OriginalArg(0) va arg0);

	@OriginalMember(owner = "client!l", name = "q", descriptor = "()Z")
	@Override
	public boolean method6853() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "ia", descriptor = "(Lclient!ta;)V")
	private native void ia(@OriginalArg(0) ta arg0);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!uo;Z)V")
	private void method4239(@OriginalArg(0) Class339 arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		for (@Pc(15) Class12_Sub1_Sub1 local15 = (Class12_Sub1_Sub1) arg0.aClass77_1.method1506(); local15 != null; local15 = (Class12_Sub1_Sub1) arg0.aClass77_1.method1505()) {
			Static293.anIntArray331[local1++] = local15.anInt4849;
			Static293.anIntArray331[local1++] = local15.anInt4843;
			Static293.anIntArray331[local1++] = local15.anInt4848;
			Static293.anIntArray335[local3++] = local15.anInt4841;
			Static293.aShortArray94[local7++] = (short) local15.anInt4847;
			Static293.anIntArray336[local5++] = local15.anInt4846;
		}
	}

	@OriginalMember(owner = "client!l", name = "BA", descriptor = "()I")
	public native int BA();

	@OriginalMember(owner = "client!l", name = "B", descriptor = "()Z")
	@Override
	public boolean method6880() {
		return false;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(II[I[I)Lclient!ua;")
	@Override
	public Class84 method6817(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new za(this, this.aM1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!uo;)V")
	@Override
	public void method6860(@OriginalArg(0) Class339 arg0) {
		this.method4239(arg0);
		this.method4237().HA(this, Static293.anIntArray331, Static293.anIntArray335, Static293.anIntArray336, Static293.aShortArray94, arg0.aClass77_1.method1512());
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6819(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!l", name = "m", descriptor = "(IIIII)V")
	public native void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!l", name = "l", descriptor = "()V")
	@Override
	public void method6843() {
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(I)V")
	@Override
	public void method6829(@OriginalArg(0) int arg0) {
		Static356.method5082();
		this.qa(arg0);
		for (@Pc(10) m local10 = (m) this.aClass70_36.method1264(); local10 != null; local10 = (m) this.aClass70_36.method1261()) {
			local10.Z();
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!ak;IIII)Lclient!da;")
	@Override
	public Class33 method6839(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new v(this, this.aM1, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6814(@OriginalArg(0) Canvas arg0) {
		@Pc(8) ta local8 = (ta) this.aClass90_13.method1685((long) arg0.hashCode());
		if (local8 != null) {
			return;
		}
		try {
			@Pc(13) Class local13 = Class.forName("java.awt.Canvas");
			@Pc(23) Method local23 = local13.getMethod("setIgnoreRepaint", Boolean.TYPE);
			local23.invoke(arg0, Boolean.TRUE);
		} catch (@Pc(35) Exception local35) {
		}
		local8 = new ta(this, arg0);
		this.aClass90_13.method1684(local8, (long) arg0.hashCode());
	}

	@OriginalMember(owner = "client!l", name = "OA", descriptor = "(Lclient!fa;II)V")
	private native void OA(@OriginalArg(0) Interface9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(I)V")
	@Override
	public void method6823(@OriginalArg(0) int arg0) {
		this.anInt4954 = arg0;
		this.aQaArray1 = new qa[this.anInt4954];
		for (@Pc(9) int local9 = 0; local9 < this.anInt4954; local9++) {
			this.aQaArray1[local9] = new qa(this, this.anInt4953, this.anInt4952);
		}
	}

	@OriginalMember(owner = "client!l", name = "m", descriptor = "()Lclient!q;")
	@Override
	public Class25 method6844() {
		return this.aClass25_3;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIILclient!ua;II)V")
	@Override
	public void method6833(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class84 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.Q(arg0, arg1, arg2, arg3, arg4, 1, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!l", name = "Q", descriptor = "(IIIIIILclient!ua;II)V")
	private native void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class84 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!l", name = "NA", descriptor = "(Lclient!q;)V")
	private native void NA(@OriginalArg(0) Class25 arg0);

	@OriginalMember(owner = "client!l", name = "s", descriptor = "()V")
	@Override
	public void method6857() {
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6831(@OriginalArg(0) Canvas arg0) {
		@Pc(8) ta local8 = (ta) this.aClass90_13.method1685((long) arg0.hashCode());
		@Pc(11) Dimension local11 = arg0.getSize();
		local8.AA(arg0, local11.width, local11.height);
		if (arg0 != null && arg0 == this.aTa1.aCanvas11) {
			this.method6884(arg0);
		}
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "()I")
	public native int b();

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIF)Lclient!tg;")
	@Override
	public Class2_Sub11 method6867(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class2_Sub11_Sub2(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!l", name = "k", descriptor = "()V")
	@Override
	public void method6842() throws Exception_Sub1 {
		if (this.aTa1 == null) {
			throw new IllegalStateException("off");
		}
		this.aTa1.method6490();
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(IIIIII)Lclient!rs;")
	@Override
	public Class17 method6815(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!l", name = "EA", descriptor = "(Lclient!e;)V")
	private native void EA(@OriginalArg(0) Class2_Sub12 arg0);

	@OriginalMember(owner = "client!l", name = "w", descriptor = "()Lclient!pg;")
	@Override
	public Class267 method6863() {
		return new Class267(0, "SSE", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!l", name = "w", descriptor = "(IIIIII)V")
	private native void w(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!l", name = "AA", descriptor = "(III[I)V")
	public native void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method6810(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.w(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!l", name = "t", descriptor = "()V")
	@Override
	public void method6861() {
	}

	@OriginalMember(owner = "client!l", name = "ma", descriptor = "(Lclient!t;)V")
	private native void ma(@OriginalArg(0) t arg0);

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(IIIIZ)Lclient!f;")
	@Override
	public Class38 method6868(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return arg4 ? new t(this, this.aM1, arg0, arg1, arg2, arg3) : new va(this, this.aM1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!l", name = "JA", descriptor = "()V")
	public native void JA();

	@OriginalMember(owner = "client!l", name = "a", descriptor = "()Z")
	@Override
	public boolean method6818() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "qa", descriptor = "(I)V")
	private native void qa(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!ut;Z)Lclient!f;")
	@Override
	public Class38 method6845(@OriginalArg(0) Class344 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(2) int[] local2 = arg0.anIntArray585;
		@Pc(5) byte[] local5 = arg0.aByteArray94;
		@Pc(8) int local8 = arg0.anInt8947;
		@Pc(11) int local11 = arg0.anInt8946;
		@Pc(32) Class38 local32;
		if (arg1 && arg0.aByteArray95 == null) {
			local32 = new w(this, this.aM1, local2, local5, 0, arg0.anInt8947, arg0.anInt8947, arg0.anInt8946);
		} else {
			@Pc(37) int local37 = local8 * local11;
			@Pc(40) int[] local40 = new int[local37];
			@Pc(43) byte[] local43 = arg0.aByteArray95;
			@Pc(52) int local52;
			@Pc(54) int local54;
			if (local43 == null) {
				@Pc(100) boolean local100 = false;
				for (local52 = 0; local52 < local37; local52++) {
					local54 = arg0.anIntArray585[local5[local52] & 0xFF];
					if (local54 >>> 24 != 255) {
						local100 = true;
					}
					local40[local52] = local54;
				}
				if (local100) {
					local32 = new t(this, this.aM1, local40, 0, arg0.anInt8947, arg0.anInt8947, arg0.anInt8946);
				} else {
					local32 = new va(this, this.aM1, local40, 0, arg0.anInt8947, arg0.anInt8947, arg0.anInt8946);
				}
			} else {
				for (@Pc(47) int local47 = 0; local47 < local11; local47++) {
					local52 = local47 * local8;
					for (local54 = 0; local54 < local8; local54++) {
						local40[local52 + local54] = local2[local5[local52 + local54] & 0xFF] | local43[local52 + local54] << 24;
					}
				}
				local32 = new t(this, this.aM1, local40, 0, local8, local8, local11);
			}
		}
		local32.Q(arg0.anInt8948, arg0.anInt8950, arg0.anInt8949, arg0.anInt8945);
		return local32;
	}

	@OriginalMember(owner = "client!l", name = "e", descriptor = "(IIIII)V")
	protected native void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!l", name = "A", descriptor = "()V")
	@Override
	protected void method6875() {
		if (this.aBoolean386) {
			return;
		}
		this.aQaArray1 = null;
		this.aTa1 = null;
		this.aM1 = null;
		this.aClass25_2 = null;
		this.aClass90_13.method1678();
		for (@Pc(25) m local25 = (m) this.aClass70_36.method1264(); local25 != null; local25 = (m) this.aClass70_36.method1261()) {
			local25.D();
		}
		this.aClass70_36.method1265();
		this.R();
		if (this.aBoolean387) {
			Static5.method82(false, true);
			this.aBoolean387 = false;
		}
		this.method4238();
		Static356.method5083();
		this.aBoolean386 = true;
	}

	@OriginalMember(owner = "client!l", name = "DA", descriptor = "()I")
	public native int DA();

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Z)V")
	@Override
	public void method6813(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!rs;Lclient!rs;FLclient!rs;)Lclient!rs;")
	@Override
	public Class17 method6882(@OriginalArg(0) Class17 arg0, @OriginalArg(1) Class17 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class17 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!l", name = "XA", descriptor = "(IIIII)V")
	public native void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!l", name = "e", descriptor = "()V")
	@Override
	public void method6832() {
	}

	@OriginalMember(owner = "client!l", name = "p", descriptor = "()I")
	@Override
	public int method6851() {
		return 4;
	}

	@OriginalMember(owner = "client!l", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6884(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aTa1 = null;
			this.ia(null);
		} else {
			@Pc(10) ta local10 = (ta) this.aClass90_13.method1685((long) arg0.hashCode());
			this.aTa1 = local10;
			this.ia(local10);
		}
	}

	@OriginalMember(owner = "client!l", name = "IA", descriptor = "(IIIIII[BII)V")
	public native void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!l", name = "R", descriptor = "()V")
	private native void R();

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method6878(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method4237().G(this, arg0, arg1, arg2, arg3, arg4, arg5, 0);
	}

	@OriginalMember(owner = "client!l", name = "u", descriptor = "()Lclient!q;")
	@Override
	public Class25 method6862() {
		return this.aClass25_2;
	}

	@OriginalMember(owner = "client!l", name = "GA", descriptor = "(II)V")
	public native void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!l", name = "A", descriptor = "(S)Z")
	private boolean method4240(@OriginalArg(0) short arg0) {
		synchronized (this) {
			@Pc(9) Class291 local9 = super.anInterface9_10.method1074(arg0);
			if (local9 == null) {
				return false;
			} else {
				this.Z(arg0, local9.aByte98, local9.aByte101, local9.aBoolean601, local9.aBoolean603, local9.aBoolean598, local9.aByte97, local9.aByte100, local9.aByte96, local9.aShort88, local9.anInt7229, local9.aBoolean597, local9.aBoolean600);
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "fa", descriptor = "()Ljava/lang/Object;")
	private Object method4241() {
		return new h(this);
	}

	@OriginalMember(owner = "client!l", name = "I", descriptor = "(I[I[F)V")
	private native void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) float[] arg2);

	@OriginalMember(owner = "client!l", name = "h", descriptor = "(IIII)[I")
	public native int[] h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "la", descriptor = "(IIII)V")
	public native void la(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "da", descriptor = "(IIII)V")
	public native void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(II)I")
	@Override
	public int method6881(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 & 0xFFFFF;
		@Pc(7) int local7 = arg1 & 0xFFFFF;
		return local3 & local7 ^ local7;
	}

	@OriginalMember(owner = "client!l", name = "f", descriptor = "()Z")
	@Override
	public boolean method6835() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(II[[I[[IIII)Lclient!i;")
	@Override
	public Class151 method6858(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new s(this, this.aM1, arg0, arg1, arg2, arg3, 512, arg4, arg5);
	}

	@OriginalMember(owner = "client!l", name = "r", descriptor = "()Z")
	@Override
	public boolean method6856() {
		return false;
	}

	@OriginalMember(owner = "client!l", name = "i", descriptor = "()V")
	@Override
	public void method6840() {
	}

	@OriginalMember(owner = "client!l", name = "e", descriptor = "(I)V")
	@Override
	public void method6850(@OriginalArg(0) int arg0) {
		this.aQaArray1[arg0].method5665();
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "([I)V")
	@Override
	public void method6811(@OriginalArg(0) int[] arg0) {
		@Pc(4) Dimension local4 = this.aTa1.aCanvas11.getSize();
		arg0[0] = local4.width;
		arg0[1] = local4.height;
	}

	@OriginalMember(owner = "client!l", name = "n", descriptor = "()V")
	@Override
	public void method6847() {
		this.method6884(this.aTa1.aCanvas11);
	}

	@OriginalMember(owner = "client!l", name = "YA", descriptor = "(IIII)V")
	public native void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "z", descriptor = "()Z")
	@Override
	public boolean method6872() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "FA", descriptor = "(ILclient!ua;II)V")
	public native void FA(@OriginalArg(0) int arg0, @OriginalArg(1) Class84 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method6828() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!e;)V")
	@Override
	public void method6836(@OriginalArg(0) Class2_Sub12 arg0) {
		this.aM1 = (m) arg0;
		this.EA(arg0);
	}

	@OriginalMember(owner = "client!l", name = "Z", descriptor = "(SBBZZZBBBIIZZ)V")
	private native void Z(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method6869(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aTa1 == null) {
			throw new IllegalStateException("off");
		}
		this.aTa1.method6489(arg0, arg1);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I[Lclient!tg;)V")
	@Override
	public void method6874(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub11[] arg1) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			Static293.anIntArray333[local1++] = arg1[local3].method7276();
			Static293.anIntArray333[local1++] = arg1[local3].method7270();
			Static293.anIntArray333[local1++] = arg1[local3].method7271();
			Static293.anIntArray333[local1++] = arg1[local3].method7277();
			Static293.aFloatArray48[local3] = arg1[local3].method7280();
			Static293.anIntArray333[local1++] = arg1[local3].method7274();
		}
		this.I(arg0, Static293.anIntArray333, Static293.aFloatArray48);
	}

	@OriginalMember(owner = "client!l", name = "C", descriptor = "()Lclient!q;")
	@Override
	public Class25 method6889() {
		return new ra();
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIZ)Lclient!f;")
	@Override
	public Class38 method6825(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new t(this, this.aM1, arg0, arg1);
	}

	@OriginalMember(owner = "client!l", name = "x", descriptor = "()Z")
	@Override
	public boolean method6865() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "xa", descriptor = "(SBBZZZBBBIIZZ[I)V")
	private native void xa(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) int[] arg13);

	@OriginalMember(owner = "client!l", name = "f", descriptor = "(I)V")
	@Override
	public void method6870(@OriginalArg(0) int arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!l", name = "VA", descriptor = "(IFFFFF)V")
	public native void VA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!l", name = "oa", descriptor = "([I)V")
	public native void oa(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!l", name = "v", descriptor = "()[I")
	public native int[] v();

	@OriginalMember(owner = "client!l", name = "CA", descriptor = "(IIII)V")
	public native void CA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!l", name = "UA", descriptor = "(Z)V")
	public native void UA(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!l", name = "U", descriptor = "()I")
	public native int U();

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(II)I")
	@Override
	public int method6846(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!l", name = "MA", descriptor = "(III[I)V")
	public native void MA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!l", name = "j", descriptor = "()Z")
	@Override
	public boolean method6841() {
		return true;
	}

	@OriginalMember(owner = "client!l", name = "W", descriptor = "(S)Z")
	private boolean method4242(@OriginalArg(0) short arg0) {
		@Pc(2) Interface9 local2 = super.anInterface9_10;
		synchronized (super.anInterface9_10) {
			if (!super.anInterface9_10.method1073(arg0)) {
				return false;
			}
			@Pc(22) Class291 local22 = super.anInterface9_10.method1074(arg0);
			if (local22 == null) {
				return false;
			}
			@Pc(43) int[] local43;
			if (local22.aBoolean599) {
				local43 = super.anInterface9_10.method1075(128, 128, 0.7F, arg0);
			} else {
				local43 = super.anInterface9_10.method1076(0.7F, 128, true, 128, arg0);
			}
			this.xa(arg0, local22.aByte98, local22.aByte101, local22.aBoolean601, local22.aBoolean603, local22.aBoolean598, local22.aByte97, local22.aByte100, local22.aByte96, local22.aShort88, local22.anInt7229, local22.aBoolean597, local22.aBoolean600, local43);
			return true;
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!uo;I)V")
	@Override
	public void method6883(@OriginalArg(0) Class339 arg0, @OriginalArg(1) int arg1) {
		this.method4239(arg0);
		this.method4237().HA(this, Static293.anIntArray331, Static293.anIntArray335, Static293.anIntArray336, Static293.aShortArray94, arg0.aClass77_1.method1512());
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I)Lclient!e;")
	@Override
	public Class2_Sub12 method6820(@OriginalArg(0) int arg0) {
		@Pc(5) m local5 = new m(this, arg0);
		this.aClass70_36.method1269(local5);
		return local5;
	}

	@OriginalMember(owner = "client!l", name = "ra", descriptor = "(F)V")
	public native void ra(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!l", name = "ya", descriptor = "()V")
	public native void ya();
}
