import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public final class da extends Class15 implements Interface5 {

	@OriginalMember(owner = "client!da", name = "o", descriptor = "Lclient!a;")
	private a anA1;

	@OriginalMember(owner = "client!da", name = "D", descriptor = "Lclient!q;")
	private Class255 aClass255_4;

	@OriginalMember(owner = "client!da", name = "E", descriptor = "Lclient!v;")
	private v aV1;

	@OriginalMember(owner = "client!da", name = "I", descriptor = "[Lclient!t;")
	private t[] aTArray1;

	@OriginalMember(owner = "client!da", name = "J", descriptor = "I")
	private int anInt1915;

	@OriginalMember(owner = "client!da", name = "nativeid", descriptor = "J")
	private final long nativeid = 0L;

	@OriginalMember(owner = "client!da", name = "r", descriptor = "Z")
	private boolean aBoolean152 = false;

	@OriginalMember(owner = "client!da", name = "q", descriptor = "Lclient!ki;")
	private final Class183 aClass183_7 = new Class183();

	@OriginalMember(owner = "client!da", name = "C", descriptor = "I")
	private final int anInt1913 = 4096;

	@OriginalMember(owner = "client!da", name = "F", descriptor = "I")
	private final int anInt1914 = 4096;

	@OriginalMember(owner = "client!da", name = "G", descriptor = "Lclient!bc;")
	private final Class25 aClass25_6 = new Class25(4);

	@OriginalMember(owner = "client!da", name = "K", descriptor = "Z")
	private boolean aBoolean153 = false;

	@OriginalMember(owner = "client!da", name = "H", descriptor = "Lclient!q;")
	private Class255 aClass255_5;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!e;)V")
	public da(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface4 arg1) {
		super(arg1);
		try {
			if (!Static68.method1703("sw3d")) {
				throw new RuntimeException("");
			}
			Static328.method5681();
			this.PA(super.anInterface4_11, 0, 0);
			Static67.method8226(true, false);
			this.aBoolean153 = true;
			this.aClass255_5 = new wa();
			this.method5291(new wa());
			this.method5304(1);
			this.method5317(0);
			if (arg0 != null) {
				this.method5286(arg0);
				this.method5319(arg0);
			}
		} catch (@Pc(78) Throwable local78) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!da", name = "n", descriptor = "()V")
	@Override
	public void method5303() {
		this.method5319(this.aV1.aCanvas13);
	}

	@OriginalMember(owner = "client!da", name = "i", descriptor = "()Z")
	@Override
	public boolean method5292() {
		return true;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIII)V")
	@Override
	public void method5330(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!da", name = "h", descriptor = "()Z")
	@Override
	public boolean method5289() {
		return false;
	}

	@OriginalMember(owner = "client!da", name = "ra", descriptor = "(IIIIIILclient!fa;II)V")
	private native void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class93 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I[Lclient!pn;)V")
	@Override
	public void method5353(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub28[] arg1) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			Static80.anIntArray88[local1++] = arg1[local3].method8156();
			Static80.anIntArray88[local1++] = arg1[local3].method8155();
			Static80.anIntArray88[local1++] = arg1[local3].method8158();
			Static80.anIntArray88[local1++] = arg1[local3].method8154();
			Static80.aFloatArray2[local3] = arg1[local3].method8159();
			Static80.anIntArray88[local1++] = arg1[local3].method8153();
		}
		this.f(arg0, Static80.anIntArray88, Static80.aFloatArray2);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!kn;)V")
	@Override
	public void method5344(@OriginalArg(0) Class108 arg0) {
	}

	@OriginalMember(owner = "client!da", name = "g", descriptor = "()Z")
	@Override
	public boolean method5288() {
		return true;
	}

	@OriginalMember(owner = "client!da", name = "G", descriptor = "()Lclient!t;")
	public t method1869() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1915; local1++) {
			if (this.aTArray1[local1].aRunnable4 == Thread.currentThread()) {
				return this.aTArray1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method5312(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method1869().IA(this, arg0, arg1, arg2, arg3, arg4, arg5, 0);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!fca;IIII)Lclient!ba;")
	@Override
	public Class21 method5352(@OriginalArg(0) Class96 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new j(this, this.anA1, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!da", name = "E", descriptor = "()V")
	@Override
	public void method5355() throws Exception_Sub1 {
		if (this.aV1 == null) {
			throw new IllegalStateException("off");
		}
		this.aV1.method7969();
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIF)Lclient!pn;")
	@Override
	public Class3_Sub28 method5331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class3_Sub28_Sub1(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!da", name = "C", descriptor = "(IIIIII)V")
	public native void C(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!da", name = "C", descriptor = "()V")
	@Override
	public void method5349() {
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([Lclient!ba;Lclient!q;[Lclient!ht;I)V")
	@Override
	public void method5310(@OriginalArg(0) Class21[] arg0, @OriginalArg(1) Class255 arg1, @OriginalArg(2) Class55_Sub3[] arg2, @OriginalArg(3) int arg3) {
		if (arg2 == null) {
			this.method1869().n(this, arg0, arg1, null, -1, arg3);
			return;
		}
		@Pc(15) Class55_Sub3 local15 = arg2[0];
		Static80.anIntArray90[5] = 0;
		this.method1869().n(this, arg0, arg1, Static80.anIntArray90, -1, arg3);
		local15.anInt3936 = Static80.anIntArray90[0];
		local15.anInt3937 = Static80.anIntArray90[1];
		local15.anInt3938 = Static80.anIntArray90[2];
		local15.anInt3935 = Static80.anIntArray90[3];
		local15.anInt3934 = Static80.anIntArray90[4];
		local15.aBoolean304 = Static80.anIntArray90[5] != 0;
	}

	@OriginalMember(owner = "client!da", name = "AA", descriptor = "(IIII)V")
	public native void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "f", descriptor = "(I[I[F)V")
	private native void f(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) float[] arg2);

	@OriginalMember(owner = "client!da", name = "Q", descriptor = "(IIII)V")
	public native void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "m", descriptor = "()Z")
	@Override
	public boolean method5301() {
		return false;
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(I)V")
	private native void c(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5319(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aV1 = null;
			this.P(null);
		} else {
			@Pc(10) v local10 = (v) this.aClass25_6.method946((long) arg0.hashCode());
			this.aV1 = local10;
			this.P(local10);
		}
	}

	@OriginalMember(owner = "client!da", name = "h", descriptor = "(IIIII)V")
	protected native void h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([Lclient!ba;Lclient!qu;Lclient!q;[Lclient!ht;I)V")
	@Override
	public void method5297(@OriginalArg(0) Class21[] arg0, @OriginalArg(1) Class274 arg1, @OriginalArg(2) Class255 arg2, @OriginalArg(3) Class55_Sub3[] arg3, @OriginalArg(4) int arg4) {
		this.method1874(arg1, true);
		if (arg3 == null) {
			this.method1869().v(this, arg0, arg2, null, arg4, Static80.anIntArray86, Static80.anIntArray91, Static80.anIntArray89, Static80.aShortArray22, Static80.aByteArray18, arg1.aClass22_1.method894(), Static80.anIntArray87);
		} else {
			@Pc(28) Class55_Sub3 local28 = arg3[0];
			Static80.anIntArray90[5] = 0;
			this.method1869().v(this, arg0, arg2, Static80.anIntArray90, arg4, Static80.anIntArray86, Static80.anIntArray91, Static80.anIntArray89, Static80.aShortArray22, Static80.aByteArray18, arg1.aClass22_1.method894(), Static80.anIntArray87);
			local28.anInt3936 = Static80.anIntArray90[0];
			local28.anInt3937 = Static80.anIntArray90[1];
			local28.anInt3938 = Static80.anIntArray90[2];
			local28.anInt3935 = Static80.anIntArray90[3];
			local28.anInt3934 = Static80.anIntArray90[4];
			local28.aBoolean304 = Static80.anIntArray90[5] != 0;
		}
		for (@Pc(86) int local86 = 0; local86 < arg0.length; local86++) {
			if (arg0[local86] != null) {
				@Pc(96) j local96 = (j) arg0[local86];
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "ca", descriptor = "(IIII)V")
	public native void ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "()V")
	@Override
	public void method5276() {
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!aw;Z)Lclient!xa;")
	@Override
	public Class37 method5275(@OriginalArg(0) Class20 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(2) int[] local2 = arg0.anIntArray22;
		@Pc(5) byte[] local5 = arg0.aByteArray5;
		@Pc(8) int local8 = arg0.anInt707;
		@Pc(11) int local11 = arg0.anInt706;
		@Pc(32) Class37 local32;
		if (arg1 && arg0.aByteArray6 == null) {
			local32 = new la(this, this.anA1, local2, local5, 0, arg0.anInt707, arg0.anInt707, arg0.anInt706);
		} else {
			@Pc(37) int local37 = local8 * local11;
			@Pc(40) int[] local40 = new int[local37];
			@Pc(43) byte[] local43 = arg0.aByteArray6;
			@Pc(52) int local52;
			@Pc(54) int local54;
			if (local43 == null) {
				@Pc(100) boolean local100 = false;
				for (local52 = 0; local52 < local37; local52++) {
					local54 = arg0.anIntArray22[local5[local52] & 0xFF];
					if (local54 >>> 24 != 255) {
						local100 = true;
					}
					local40[local52] = local54;
				}
				if (local100) {
					local32 = new aa(this, this.anA1, local40, 0, arg0.anInt707, arg0.anInt707, arg0.anInt706);
				} else {
					local32 = new ja(this, this.anA1, local40, 0, arg0.anInt707, arg0.anInt707, arg0.anInt706);
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
		local32.EA(arg0.anInt705, arg0.anInt708, arg0.anInt704, arg0.anInt709);
		return local32;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II)I")
	@Override
	public int method5315(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!da", name = "e", descriptor = "(I)V")
	@Override
	public void method5317(@OriginalArg(0) int arg0) {
		this.aTArray1[arg0].method7471();
	}

	@OriginalMember(owner = "client!da", name = "f", descriptor = "()V")
	@Override
	public void method5285() {
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
	@Override
	public void method5296(@OriginalArg(0) int arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(Z)V")
	@Override
	public void method5345(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!da", name = "IA", descriptor = "()I")
	public native int IA();

	@OriginalMember(owner = "client!da", name = "e", descriptor = "(IIIII)V")
	public native void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method5338(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aV1 == null) {
			throw new IllegalStateException("off");
		}
		this.aV1.method7968(arg0, arg1);
	}

	@OriginalMember(owner = "client!da", name = "v", descriptor = "()I")
	public native int v();

	@OriginalMember(owner = "client!da", name = "FA", descriptor = "(IIIIII)Z")
	public native boolean FA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIZ)Lclient!xa;")
	@Override
	public Class37 method5308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new aa(this, this.anA1, arg0, arg1);
	}

	@OriginalMember(owner = "client!da", name = "PA", descriptor = "(Lclient!e;II)V")
	private native void PA(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!da", name = "d", descriptor = "(S)Z")
	private boolean method1870(@OriginalArg(0) short arg0) {
		@Pc(2) Interface4 local2 = super.anInterface4_11;
		synchronized (super.anInterface4_11) {
			if (!super.anInterface4_11.method3090(arg0)) {
				return false;
			}
			@Pc(22) Class178 local22 = super.anInterface4_11.method3088(arg0);
			if (local22 == null) {
				return false;
			}
			@Pc(43) int[] local43;
			if (local22.aBoolean494) {
				local43 = super.anInterface4_11.method3089(128, arg0, 128, 0.7F);
			} else {
				local43 = super.anInterface4_11.method3086(128, true, 0.7F, 128, arg0);
			}
			this.J(arg0, local22.aByte52, local22.aByte57, local22.aBoolean489, local22.aBoolean488, local22.aBoolean493, local22.aByte56, local22.aByte55, local22.aByte54, local22.aShort56, local22.anInt5666, local22.aBoolean492, local22.aBoolean491, local43);
			return true;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(FFF)V")
	@Override
	public void method5326(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5311(@OriginalArg(0) Canvas arg0) {
		@Pc(8) v local8 = (v) this.aClass25_6.method946((long) arg0.hashCode());
		@Pc(11) Dimension local11 = arg0.getSize();
		local8.D(arg0, local11.width, local11.height);
		if (arg0 != null && arg0 == this.aV1.aCanvas13) {
			this.method5319(arg0);
		}
	}

	@OriginalMember(owner = "client!da", name = "y", descriptor = "()Z")
	@Override
	public boolean method5333() {
		return true;
	}

	@OriginalMember(owner = "client!da", name = "d", descriptor = "()Z")
	@Override
	public boolean method5280() {
		return true;
	}

	@OriginalMember(owner = "client!da", name = "e", descriptor = "(IIIIII)V")
	@Override
	public void method5347(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.BA(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!da", name = "ya", descriptor = "(IIIII)V")
	public native void ya(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!i;)V")
	private native void a(@OriginalArg(0) Class3_Sub19 arg0);

	@OriginalMember(owner = "client!da", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5348(@OriginalArg(0) Canvas arg0) {
		if (this.aV1.aCanvas13 == arg0) {
			this.method5319(null);
		}
		@Pc(16) v local16 = (v) this.aClass25_6.method946((long) arg0.hashCode());
		if (local16 != null) {
			local16.method8412();
			local16.method7970();
		}
	}

	@OriginalMember(owner = "client!da", name = "N", descriptor = "(Lclient!aa;)V")
	private native void N(@OriginalArg(0) aa arg0);

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(Lclient!i;)V")
	@Override
	public void method5293(@OriginalArg(0) Class3_Sub19 arg0) {
		this.anA1 = (a) arg0;
		this.a(arg0);
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(SBBZZZBBBIIZZ)V")
	private native void b(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12);

	@OriginalMember(owner = "client!da", name = "u", descriptor = "()Z")
	@Override
	public boolean method5327() {
		return false;
	}

	@OriginalMember(owner = "client!da", name = "D", descriptor = "(I)V")
	public native void D(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II[[I[[IIII)Lclient!d;")
	@Override
	public Class4 method5354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new ya(this, this.anA1, arg0, arg1, arg2, arg3, 512, arg4, arg5);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!kn;Lclient!kn;FLclient!kn;)Lclient!kn;")
	@Override
	public Class108 method5298(@OriginalArg(0) Class108 arg0, @OriginalArg(1) Class108 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class108 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(II)I")
	@Override
	public int method5321(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 & 0xFFFFF;
		@Pc(7) int local7 = arg1 & 0xFFFFF;
		return local3 & local7 ^ local7;
	}

	@OriginalMember(owner = "client!da", name = "f", descriptor = "(I)V")
	@Override
	public void method5318(@OriginalArg(0) int arg0) {
		Static328.method5684();
		this.c(arg0);
		for (@Pc(10) a local10 = (a) this.aClass183_7.method4795(); local10 != null; local10 = (a) this.aClass183_7.method4793()) {
			local10.P();
		}
	}

	@OriginalMember(owner = "client!da", name = "sa", descriptor = "(II)V")
	public native void sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!da", name = "l", descriptor = "()V")
	@Override
	public void method5295() {
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!ba;Lclient!qu;Lclient!q;Lclient!ht;I)V")
	@Override
	public void method5309(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class274 arg1, @OriginalArg(2) Class255 arg2, @OriginalArg(3) Class55_Sub3 arg3, @OriginalArg(4) int arg4) {
		this.method1874(arg1, true);
		if (arg3 == null) {
			this.method1869().m(this, arg0, arg2, null, arg4, Static80.anIntArray86, Static80.anIntArray91, Static80.anIntArray89, Static80.aShortArray22, Static80.aByteArray18, arg1.aClass22_1.method894(), Static80.anIntArray87);
			return;
		}
		Static80.anIntArray90[5] = 0;
		this.method1869().m(this, arg0, arg2, Static80.anIntArray90, arg4, Static80.anIntArray86, Static80.anIntArray91, Static80.anIntArray89, Static80.aShortArray22, Static80.aByteArray18, arg1.aClass22_1.method894(), Static80.anIntArray87);
		arg3.anInt3936 = Static80.anIntArray90[0];
		arg3.anInt3937 = Static80.anIntArray90[1];
		arg3.anInt3938 = Static80.anIntArray90[2];
		arg3.anInt3935 = Static80.anIntArray90[3];
		arg3.anInt3934 = Static80.anIntArray90[4];
		arg3.aBoolean304 = Static80.anIntArray90[5] != 0;
	}

	@OriginalMember(owner = "client!da", name = "o", descriptor = "(Lclient!q;)V")
	private native void o(@OriginalArg(0) Class255 arg0);

	@OriginalMember(owner = "client!da", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method5334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.e(arg0, arg1, arg2, arg4, arg5);
		this.e(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.ya(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
		this.ya(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([IIIII)Lclient!xa;")
	@Override
	public Class37 method5324(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
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

	@OriginalMember(owner = "client!da", name = "qa", descriptor = "(S)Z")
	private boolean method1871(@OriginalArg(0) short arg0) {
		synchronized (this) {
			@Pc(9) Class178 local9 = super.anInterface4_11.method3088(arg0);
			if (local9 == null) {
				return false;
			} else {
				this.b(arg0, local9.aByte52, local9.aByte57, local9.aBoolean489, local9.aBoolean488, local9.aBoolean493, local9.aByte56, local9.aByte55, local9.aByte54, local9.aShort56, local9.anInt5666, local9.aBoolean492, local9.aBoolean491);
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "x", descriptor = "()Z")
	@Override
	public boolean method5332() {
		return true;
	}

	@OriginalMember(owner = "client!da", name = "X", descriptor = "(III)V")
	public native void X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!da", name = "ka", descriptor = "(FF)V")
	public native void ka(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!da", name = "o", descriptor = "()V")
	@Override
	protected void method5305() {
		if (this.aBoolean152) {
			return;
		}
		this.aTArray1 = null;
		this.aV1 = null;
		this.anA1 = null;
		this.aClass255_5 = null;
		this.aClass25_6.method948();
		for (@Pc(25) a local25 = (a) this.aClass183_7.method4795(); local25 != null; local25 = (a) this.aClass183_7.method4793()) {
			local25.ZA();
		}
		this.aClass183_7.method4790();
		this.fa();
		if (this.aBoolean153) {
			Static455.method7048(false, true);
			this.aBoolean153 = false;
		}
		this.method1873();
		Static328.method5682();
		this.aBoolean152 = true;
	}

	@OriginalMember(owner = "client!da", name = "HA", descriptor = "()Ljava/lang/Object;")
	private Object method1872() {
		return new pa(this);
	}

	@OriginalMember(owner = "client!da", name = "j", descriptor = "()Lclient!q;")
	@Override
	public Class255 method5294() {
		return new wa();
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5286(@OriginalArg(0) Canvas arg0) {
		@Pc(8) v local8 = (v) this.aClass25_6.method946((long) arg0.hashCode());
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
		this.aClass25_6.method945(local8, (long) arg0.hashCode());
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method5299() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!da", name = "na", descriptor = "(III[I)V")
	public native void na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!da", name = "ha", descriptor = "(F)V")
	public native void ha(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!da", name = "A", descriptor = "([I)V")
	public native void A(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!da", name = "c", descriptor = "()Z")
	@Override
	public boolean method5279() {
		return false;
	}

	@OriginalMember(owner = "client!da", name = "r", descriptor = "()Z")
	@Override
	public boolean method5323() {
		return true;
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(IIIIII)Lclient!kn;")
	@Override
	public Class108 method5328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!da", name = "s", descriptor = "()V")
	private void method1873() {
		System.gc();
		System.runFinalization();
		Static328.method5684();
	}

	@OriginalMember(owner = "client!da", name = "YA", descriptor = "(IFFFFF)V")
	public native void YA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!da", name = "d", descriptor = "(I)Lclient!i;")
	@Override
	public Class3_Sub19 method5313(@OriginalArg(0) int arg0) {
		@Pc(5) a local5 = new a(this, arg0);
		this.aClass183_7.method4792(local5);
		return local5;
	}

	@OriginalMember(owner = "client!da", name = "fa", descriptor = "()V")
	private native void fa();

	@OriginalMember(owner = "client!da", name = "q", descriptor = "()Z")
	@Override
	public boolean method5322() {
		return false;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!qu;)V")
	@Override
	public void method5277(@OriginalArg(0) Class274 arg0) {
		this.method1874(arg0, false);
		this.method1869().WA(this, Static80.anIntArray86, Static80.anIntArray91, Static80.anIntArray89, Static80.aShortArray22, arg0.aClass22_1.method894());
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "()Lclient!og;")
	@Override
	public Class242 method5278() {
		return new Class242(0, "SSE", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!da", name = "J", descriptor = "(SBBZZZBBBIIZZ[I)V")
	private native void J(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) int[] arg13);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Z)V")
	@Override
	public void method5282(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II[I[I)Lclient!fa;")
	@Override
	public Class93 method5307(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new f(this, this.anA1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!da", name = "z", descriptor = "()Z")
	@Override
	public boolean method5335() {
		return true;
	}

	@OriginalMember(owner = "client!da", name = "e", descriptor = "()Z")
	@Override
	public boolean method5284() {
		return true;
	}

	@OriginalMember(owner = "client!da", name = "H", descriptor = "(Z)V")
	public native void H(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!da", name = "m", descriptor = "(IIII)V")
	public native void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "BA", descriptor = "(IIIIII)V")
	private native void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method5291(@OriginalArg(0) Class255 arg0) {
		this.aClass255_4 = arg0;
		this.o(arg0);
	}

	@OriginalMember(owner = "client!da", name = "k", descriptor = "()V")
	public native void k();

	@OriginalMember(owner = "client!da", name = "p", descriptor = "()Z")
	@Override
	public boolean method5314() {
		return false;
	}

	@OriginalMember(owner = "client!da", name = "SA", descriptor = "()I")
	public native int SA();

	@OriginalMember(owner = "client!da", name = "U", descriptor = "()I")
	public native int U();

	@OriginalMember(owner = "client!da", name = "A", descriptor = "()V")
	@Override
	public void method5342() {
	}

	@OriginalMember(owner = "client!da", name = "B", descriptor = "()Lclient!q;")
	@Override
	public Class255 method5343() {
		return this.aClass255_5;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIILclient!fa;II)V")
	@Override
	public void method5351(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class93 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.ra(arg0, arg1, arg2, arg3, arg4, 1, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!da", name = "ma", descriptor = "(IIIIII[BII)V")
	public native void ma(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!qu;Z)V")
	private void method1874(@OriginalArg(0) Class274 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(15) Class55_Sub2_Sub1 local15 = (Class55_Sub2_Sub1) arg0.aClass22_1.method890(); local15 != null; local15 = (Class55_Sub2_Sub1) arg0.aClass22_1.method892()) {
			Static80.anIntArray86[local1++] = local15.anInt2862;
			Static80.anIntArray86[local1++] = local15.anInt2858;
			Static80.anIntArray86[local1++] = local15.anInt2859;
			Static80.anIntArray91[local3++] = local15.anInt2864;
			Static80.aShortArray22[local7++] = (short) local15.anInt2867;
			Static80.anIntArray89[local5++] = local15.anInt2865;
			if (arg1) {
				Static80.aByteArray18[local9++] = local15.aByte26;
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "TA", descriptor = "(Lclient!ja;)V")
	private native void TA(@OriginalArg(0) ja arg0);

	@OriginalMember(owner = "client!da", name = "P", descriptor = "(Lclient!v;)V")
	private native void P(@OriginalArg(0) v arg0);

	@OriginalMember(owner = "client!da", name = "KA", descriptor = "(IIII)[I")
	public native int[] KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "aa", descriptor = "()I")
	public native int aa();

	@OriginalMember(owner = "client!da", name = "F", descriptor = "()V")
	public native void F();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!sga;[Lclient!aw;Z)Lclient!ta;")
	@Override
	public Class111 method5346(@OriginalArg(0) Class297 arg0, @OriginalArg(1) Class20[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt707;
			local7[local11] = arg1[local11].anInt706;
			if (arg1[local11].aByteArray6 != null) {
				local9 = true;
			}
		}
		if (local9) {
			throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
		}
		return new b(this, this.anA1, arg0, arg1, null);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIZ)Lclient!xa;")
	@Override
	public Class37 method5290(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return arg4 ? new aa(this, this.anA1, arg0, arg1, arg2, arg3) : new ja(this, this.anA1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!da", name = "D", descriptor = "()V")
	@Override
	public void method5350() {
	}

	@OriginalMember(owner = "client!da", name = "w", descriptor = "()I")
	@Override
	public int method5329() {
		return 4;
	}

	@OriginalMember(owner = "client!da", name = "LA", descriptor = "(IIII)V")
	public native void LA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(Z)V")
	@Override
	public void method5336(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!da", name = "finalize", descriptor = "()V")
	@Override
	public synchronized void finalize() {
		this.method5337();
		if (this.nativeid != 0L) {
			Static328.method5683(this);
		}
	}

	@OriginalMember(owner = "client!da", name = "g", descriptor = "(I)V")
	@Override
	public void method5340(@OriginalArg(0) int arg0) {
		this.aTArray1[arg0].method7469();
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(I)V")
	@Override
	public void method5304(@OriginalArg(0) int arg0) {
		this.anInt1915 = arg0;
		this.aTArray1 = new t[this.anInt1915];
		for (@Pc(9) int local9 = 0; local9 < this.anInt1915; local9++) {
			this.aTArray1[local9] = new t(this, this.anInt1914, this.anInt1913);
		}
	}

	@OriginalMember(owner = "client!da", name = "t", descriptor = "()Z")
	@Override
	public boolean method5325() {
		return false;
	}

	@OriginalMember(owner = "client!da", name = "JA", descriptor = "(I)V")
	public native void JA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "L", descriptor = "(ILclient!fa;II)V")
	public native void L(@OriginalArg(0) int arg0, @OriginalArg(1) Class93 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!xa;Z)V")
	@Override
	protected void method5302(@OriginalArg(0) Class37 arg0) {
		if (arg0 instanceof ja) {
			this.TA((ja) arg0);
		} else if (arg0 instanceof aa) {
			this.N((aa) arg0);
		} else {
			throw new RuntimeException();
		}
	}
}
