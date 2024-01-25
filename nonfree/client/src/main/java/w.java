import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!w")
public final class w extends Class34 implements Interface12 {

	@OriginalMember(owner = "client!w", name = "t", descriptor = "Lclient!g;")
	private g aG1;

	@OriginalMember(owner = "client!w", name = "x", descriptor = "Lclient!b;")
	private b aB1;

	@OriginalMember(owner = "client!w", name = "O", descriptor = "[Lclient!k;")
	private k[] aKArray1;

	@OriginalMember(owner = "client!w", name = "P", descriptor = "I")
	private int anInt7345;

	@OriginalMember(owner = "client!w", name = "u", descriptor = "Z")
	private boolean aBoolean803 = false;

	@OriginalMember(owner = "client!w", name = "nativeid", descriptor = "J")
	private final long nativeid = 0L;

	@OriginalMember(owner = "client!w", name = "v", descriptor = "Lclient!sr;")
	private final Class227 aClass227_53 = new Class227();

	@OriginalMember(owner = "client!w", name = "z", descriptor = "I")
	private final int anInt7343 = 4096;

	@OriginalMember(owner = "client!w", name = "L", descriptor = "I")
	private final int anInt7344 = 4096;

	@OriginalMember(owner = "client!w", name = "I", descriptor = "Lclient!qh;")
	private final Class199 aClass199_184 = new Class199(4);

	@OriginalMember(owner = "client!w", name = "N", descriptor = "Z")
	private boolean aBoolean805 = false;

	@OriginalMember(owner = "client!w", name = "B", descriptor = "Lclient!c;")
	private Class32 aClass32_9;

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lclient!l;Lclient!fq;)V")
	public w(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Interface6 arg2, @OriginalArg(3) Class83 arg3) {
		super(arg0, arg2);
		try {
			if (!Static439.aBoolean804) {
				if (arg3 == null) {
					System.loadLibrary("jawt");
					System.loadLibrary("sw3d");
					Static439.aBoolean804 = Boolean.TRUE;
				} else {
					arg3.method1871(this.getClass());
					Static439.aBoolean804 = Boolean.TRUE;
				}
			}
			if (!Static439.aBoolean804) {
				throw new RuntimeException("");
			}
			this.W(super.anInterface6_8, 0, 0);
			Static182.method2647(false, true);
			this.aBoolean805 = true;
			this.aClass32_9 = new qa();
			this.SA(new qa());
			this.method5757(1);
			this.method5742(0);
			if (arg1 != null) {
				this.method5738(arg1);
				this.method5793(arg1);
			}
		} catch (@Pc(95) Throwable local95) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!w", name = "d", descriptor = "()Lclient!c;")
	@Override
	public Class32 method5736() {
		return new qa();
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIILclient!ta;II)V")
	@Override
	public void method5799(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class104 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.NA(arg0, arg1, arg2, arg3, arg4, 1, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!eu;Z)V")
	private void method5802(@OriginalArg(0) Class71 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(15) Class4_Sub1_Sub2 local15 = (Class4_Sub1_Sub2) arg0.aClass95_1.method2133(); local15 != null; local15 = (Class4_Sub1_Sub2) arg0.aClass95_1.method2135()) {
			Static439.anIntArray497[local1++] = local15.anInt5820;
			Static439.anIntArray497[local1++] = local15.anInt5823;
			Static439.anIntArray497[local1++] = local15.anInt5814;
			Static439.anIntArray500[local3++] = local15.anInt5822;
			Static439.aShortArray114[local7++] = (short) local15.anInt5816;
			Static439.anIntArray498[local5++] = local15.anInt5819;
			if (arg1) {
				Static439.aByteArray93[local9++] = local15.aByte96;
			}
		}
	}

	@OriginalMember(owner = "client!w", name = "ma", descriptor = "(IIIII)V")
	public native void ma(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!w", name = "i", descriptor = "()Z")
	@Override
	public boolean method5758() {
		return true;
	}

	@OriginalMember(owner = "client!w", name = "ya", descriptor = "(I)V")
	public native void ya(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!eu;)V")
	@Override
	public void method5741(@OriginalArg(0) Class71 arg0) {
		this.method5802(arg0, false);
		this.method5804().J(this, Static439.anIntArray497, Static439.anIntArray500, Static439.anIntArray498, Static439.aShortArray114, arg0.aClass95_1.method2137());
	}

	@OriginalMember(owner = "client!w", name = "A", descriptor = "()Z")
	@Override
	public boolean method5796() {
		return true;
	}

	@OriginalMember(owner = "client!w", name = "l", descriptor = "(SBBZZZBBBIIZZ)V")
	private native void l(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12);

	@OriginalMember(owner = "client!w", name = "HA", descriptor = "(IIII)V")
	public native void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!w", name = "z", descriptor = "()Z")
	@Override
	public boolean method5794() {
		return false;
	}

	@OriginalMember(owner = "client!w", name = "ZA", descriptor = "(IIIII)V")
	protected native void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIII)V")
	public native void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!w", name = "qa", descriptor = "()Ljava/lang/Object;")
	private Object method5803() {
		return new pa(this);
	}

	@OriginalMember(owner = "client!w", name = "JA", descriptor = "(F)V")
	public native void JA(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!w", name = "da", descriptor = "(FF)V")
	public native void da(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!w", name = "r", descriptor = "()I")
	public native int r();

	@OriginalMember(owner = "client!w", name = "c", descriptor = "()Z")
	@Override
	public boolean method5734() {
		return false;
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(I)V")
	@Override
	public void method5743(@OriginalArg(0) int arg0) {
		Static314.method4250();
		this.u(arg0);
		for (@Pc(10) g local10 = (g) this.aClass227_53.method4967(); local10 != null; local10 = (g) this.aClass227_53.method4973()) {
			local10.T();
		}
	}

	@OriginalMember(owner = "client!w", name = "q", descriptor = "()Z")
	@Override
	public boolean method5772() {
		return false;
	}

	@OriginalMember(owner = "client!w", name = "t", descriptor = "(I)V")
	public native void t(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(I[Lclient!bn;)V")
	@Override
	public void method5730(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub7[] arg1) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			Static439.anIntArray496[local1++] = arg1[local3].method5113();
			Static439.anIntArray496[local1++] = arg1[local3].method5114();
			Static439.anIntArray496[local1++] = arg1[local3].method5117();
			Static439.anIntArray496[local1++] = arg1[local3].method5120();
			Static439.aFloatArray33[local3] = arg1[local3].method5124();
			Static439.anIntArray496[local1++] = arg1[local3].method5122();
		}
		this.WA(arg0, Static439.anIntArray496, Static439.aFloatArray33);
	}

	@OriginalMember(owner = "client!w", name = "k", descriptor = "()V")
	@Override
	public void method5764() {
	}

	@OriginalMember(owner = "client!w", name = "C", descriptor = "()Lclient!k;")
	public k method5804() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt7345; local1++) {
			if (this.aKArray1[local1].aRunnable1 == Thread.currentThread()) {
				return this.aKArray1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!w", name = "o", descriptor = "()Z")
	@Override
	public boolean method5770() {
		return true;
	}

	@OriginalMember(owner = "client!w", name = "NA", descriptor = "(IIIIIILclient!ta;II)V")
	private native void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class104 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!w", name = "sa", descriptor = "(IIII)[I")
	public native int[] sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!w", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method5751(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		if (this.aB1 == null) {
			throw new IllegalStateException("off");
		}
		this.aB1.method325(arg0, arg1);
	}

	@OriginalMember(owner = "client!w", name = "P", descriptor = "(IIIIII)V")
	public native void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!w", name = "b", descriptor = "()Z")
	@Override
	public boolean method5732() {
		return true;
	}

	@OriginalMember(owner = "client!w", name = "aa", descriptor = "()F")
	public native float aa();

	@OriginalMember(owner = "client!w", name = "a", descriptor = "([Lclient!e;Lclient!eu;Lclient!c;[Lclient!ut;I)V")
	@Override
	public void method5797(@OriginalArg(0) Class57[] arg0, @OriginalArg(1) Class71 arg1, @OriginalArg(2) Class32 arg2, @OriginalArg(3) Class4_Sub8[] arg3, @OriginalArg(4) int arg4) {
		this.method5802(arg1, true);
		if (arg3 == null) {
			this.method5804().D(this, arg0, arg2, null, arg4, Static439.anIntArray497, Static439.anIntArray500, Static439.anIntArray498, Static439.aShortArray114, Static439.aByteArray93, arg1.aClass95_1.method2137(), Static439.anIntArray499);
		} else {
			@Pc(28) Class4_Sub8 local28 = arg3[0];
			Static439.anIntArray501[5] = 0;
			this.method5804().D(this, arg0, arg2, Static439.anIntArray501, arg4, Static439.anIntArray497, Static439.anIntArray500, Static439.anIntArray498, Static439.aShortArray114, Static439.aByteArray93, arg1.aClass95_1.method2137(), Static439.anIntArray499);
			local28.anInt7128 = Static439.anIntArray501[0];
			local28.anInt7127 = Static439.anIntArray501[1];
			local28.anInt7125 = Static439.anIntArray501[2];
			local28.anInt7129 = Static439.anIntArray501[3];
			local28.anInt7126 = Static439.anIntArray501[4];
			local28.aBoolean779 = Static439.anIntArray501[5] != 0;
		}
		@Pc(86) int local86 = 0;
		for (@Pc(88) int local88 = 0; local88 < arg0.length; local88++) {
			if (arg0[local88] != null) {
				@Pc(98) xa local98 = (xa) arg0[local88];
				local98.method5968(local86, arg2);
				if (local98.aClass229Array4 != null) {
					local86 += local98.aClass229Array4.length * 9;
				}
				if (local98.aClass181Array4 != null) {
					local86 += local98.aClass181Array4.length * 3;
				}
			}
		}
	}

	@OriginalMember(owner = "client!w", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method5769(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.ma(arg0, arg1, arg2, arg4, arg5);
		this.ma(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.IA(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
		this.IA(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
	}

	@OriginalMember(owner = "client!w", name = "l", descriptor = "()V")
	@Override
	public void method5765() {
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!ob;)V")
	@Override
	public void method5746(@OriginalArg(0) Class3 arg0) {
	}

	@OriginalMember(owner = "client!w", name = "m", descriptor = "(S)Z")
	private boolean method5805(@OriginalArg(0) short arg0) {
		@Pc(2) Interface6 local2 = super.anInterface6_8;
		synchronized (super.anInterface6_8) {
			if (!super.anInterface6_8.method3934(arg0)) {
				return false;
			}
			@Pc(22) Class114 local22 = super.anInterface6_8.method3937(arg0);
			if (local22 == null) {
				return false;
			}
			@Pc(46) int[] local46;
			if (local22.aBoolean340 && local22.aBoolean342) {
				local46 = super.anInterface6_8.method3933(0.7F, true, arg0, 128, 128);
			} else {
				local46 = super.anInterface6_8.method3935(128, 128, arg0, 0.7F);
			}
			this.J(arg0, local22.aByte29, local22.aByte25, local22.aBoolean342, local22.aBoolean340, local22.aBoolean341, local22.aByte28, local22.aByte27, local22.aByte30, local22.aShort37, local22.anInt2891, local22.aBoolean345, local22.aBoolean343, local46);
			return true;
		}
	}

	@OriginalMember(owner = "client!w", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5793(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aB1 = null;
			this.e(null);
		} else {
			@Pc(10) b local10 = (b) this.aClass199_184.method4387((long) arg0.hashCode());
			this.aB1 = local10;
			this.e(local10);
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!ob;Lclient!ob;FLclient!ob;)Lclient!ob;")
	@Override
	public Class3 method5763(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class3 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!w", name = "MA", descriptor = "([I)V")
	public native void MA(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!w", name = "R", descriptor = "()V")
	private void method5806() {
		System.gc();
		System.runFinalization();
		Static314.method4250();
	}

	@OriginalMember(owner = "client!w", name = "pa", descriptor = "()I")
	public native int pa();

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(Z)V")
	@Override
	public void method5768(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!w", name = "Q", descriptor = "(III)V")
	public native void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!w", name = "e", descriptor = "()Z")
	@Override
	public boolean method5739() {
		return false;
	}

	@OriginalMember(owner = "client!w", name = "OA", descriptor = "()I")
	public native int OA();

	@OriginalMember(owner = "client!w", name = "a", descriptor = "([Lclient!e;Lclient!c;[Lclient!ut;I)V")
	@Override
	public void method5771(@OriginalArg(0) Class57[] arg0, @OriginalArg(1) Class32 arg1, @OriginalArg(2) Class4_Sub8[] arg2, @OriginalArg(3) int arg3) {
		if (arg2 == null) {
			this.method5804().va(this, arg0, arg1, null, -1, arg3);
			return;
		}
		@Pc(15) Class4_Sub8 local15 = arg2[0];
		Static439.anIntArray501[5] = 0;
		this.method5804().va(this, arg0, arg1, Static439.anIntArray501, -1, arg3);
		local15.anInt7128 = Static439.anIntArray501[0];
		local15.anInt7127 = Static439.anIntArray501[1];
		local15.anInt7125 = Static439.anIntArray501[2];
		local15.anInt7129 = Static439.anIntArray501[3];
		local15.anInt7126 = Static439.anIntArray501[4];
		local15.aBoolean779 = Static439.anIntArray501[5] != 0;
	}

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(I)V")
	@Override
	public void method5749(@OriginalArg(0) int arg0) {
		this.aKArray1[arg0].method2899();
	}

	@OriginalMember(owner = "client!w", name = "K", descriptor = "(IIIIII[BII)V")
	public native void K(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!w", name = "d", descriptor = "(I)V")
	@Override
	public void method5757(@OriginalArg(0) int arg0) {
		this.anInt7345 = arg0;
		this.aKArray1 = new k[this.anInt7345];
		for (@Pc(9) int local9 = 0; local9 < this.anInt7345; local9++) {
			this.aKArray1[local9] = new k(this, this.anInt7344, this.anInt7343);
		}
	}

	@OriginalMember(owner = "client!w", name = "A", descriptor = "(IIIIII)V")
	private native void A(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(Z)V")
	@Override
	public void method5745(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!w", name = "B", descriptor = "()I")
	@Override
	public int method5800() {
		return 4;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(FFF)V")
	@Override
	public void method5778(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!w", name = "e", descriptor = "(Lclient!b;)V")
	private native void e(@OriginalArg(0) b arg0);

	@OriginalMember(owner = "client!w", name = "w", descriptor = "()V")
	@Override
	protected void method5786() {
		if (this.aBoolean803) {
			return;
		}
		this.method5806();
		this.aKArray1 = null;
		this.aB1 = null;
		this.aG1 = null;
		this.aClass32_9 = null;
		this.aClass199_184.method4385();
		for (@Pc(27) g local27 = (g) this.aClass227_53.method4967(); local27 != null; local27 = (g) this.aClass227_53.method4973()) {
			local27.IA();
		}
		this.aClass227_53.method4981();
		this.ua();
		if (this.aBoolean805) {
			Static109.method3817(false, true);
			this.aBoolean805 = false;
		}
		this.aBoolean803 = true;
	}

	@OriginalMember(owner = "client!w", name = "s", descriptor = "(IIII)V")
	public native void s(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!w", name = "B", descriptor = "(IFFFFF)V")
	public native void B(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!w", name = "ba", descriptor = "(IIII)V")
	public native void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!w", name = "g", descriptor = "()Lclient!c;")
	@Override
	public Class32 method5747() {
		return this.aClass32_9;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Z)V")
	@Override
	public void method5737(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!w", name = "IA", descriptor = "(IIIII)V")
	public native void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!w", name = "u", descriptor = "(I)V")
	private native void u(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
	@Override
	public void method5742(@OriginalArg(0) int arg0) {
		this.aKArray1[arg0].method2900();
	}

	@OriginalMember(owner = "client!w", name = "x", descriptor = "()V")
	@Override
	public void method5788() {
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(IIII)V")
	@Override
	public void method5779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!w", name = "h", descriptor = "()Z")
	@Override
	public boolean method5755() {
		return true;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(II)I")
	@Override
	public int method5783(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 & 0xFFFFF;
		@Pc(7) int local7 = arg1 & 0xFFFFF;
		return local3 & local7 ^ local7;
	}

	@OriginalMember(owner = "client!w", name = "J", descriptor = "(SBBZZZBBBIIZZ[I)V")
	private native void J(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) int[] arg13);

	@OriginalMember(owner = "client!w", name = "t", descriptor = "()Z")
	@Override
	public boolean method5775() {
		return false;
	}

	@OriginalMember(owner = "client!w", name = "W", descriptor = "(Lclient!l;II)V")
	private native void W(@OriginalArg(0) Interface6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5735(@OriginalArg(0) Canvas arg0) {
		@Pc(8) b local8 = (b) this.aClass199_184.method4387((long) arg0.hashCode());
		@Pc(11) Dimension local11 = arg0.getSize();
		local8.U(arg0, local11.width, local11.height);
		if (arg0 != null && arg0 == this.aB1.aCanvas1) {
			this.method5793(arg0);
		}
	}

	@OriginalMember(owner = "client!w", name = "p", descriptor = "()V")
	public native void p();

	@OriginalMember(owner = "client!w", name = "y", descriptor = "()V")
	@Override
	public void method5789() {
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method5801(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method5804().q(this, arg0, arg1, arg2, arg3, arg4, arg5, 0);
	}

	@OriginalMember(owner = "client!w", name = "u", descriptor = "()V")
	@Override
	public void method5780() {
	}

	@OriginalMember(owner = "client!w", name = "s", descriptor = "()Z")
	@Override
	public boolean method5774() {
		return true;
	}

	@OriginalMember(owner = "client!w", name = "d", descriptor = "(II)V")
	public native void d(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!gf;[Lclient!ev;Z)Lclient!la;")
	@Override
	public Class76 method5754(@OriginalArg(0) Class89 arg0, @OriginalArg(1) Class72[] arg1) {
		return new ra(this, this.aG1, arg0, arg1, null);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "()Z")
	@Override
	public boolean method5728() {
		return false;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!e;Lclient!eu;Lclient!c;Lclient!ut;I)V")
	@Override
	public void method5762(@OriginalArg(0) Class57 arg0, @OriginalArg(1) Class71 arg1, @OriginalArg(2) Class32 arg2, @OriginalArg(3) Class4_Sub8 arg3) {
		this.method5802(arg1, true);
		if (arg3 == null) {
			this.method5804().FA(this, arg0, arg2, null, 0, Static439.anIntArray497, Static439.anIntArray500, Static439.anIntArray498, Static439.aShortArray114, Static439.aByteArray93, arg1.aClass95_1.method2137(), Static439.anIntArray499);
		} else {
			Static439.anIntArray501[5] = 0;
			this.method5804().FA(this, arg0, arg2, Static439.anIntArray501, 0, Static439.anIntArray497, Static439.anIntArray500, Static439.anIntArray498, Static439.aShortArray114, Static439.aByteArray93, arg1.aClass95_1.method2137(), Static439.anIntArray499);
			arg3.anInt7128 = Static439.anIntArray501[0];
			arg3.anInt7127 = Static439.anIntArray501[1];
			arg3.anInt7125 = Static439.anIntArray501[2];
			arg3.anInt7129 = Static439.anIntArray501[3];
			arg3.anInt7126 = Static439.anIntArray501[4];
			arg3.aBoolean779 = Static439.anIntArray501[5] != 0;
		}
		@Pc(83) xa local83 = (xa) arg0;
		local83.method5968(0, arg2);
	}

	@OriginalMember(owner = "client!w", name = "finalize", descriptor = "()V")
	@Override
	public synchronized void finalize() {
		this.method5782();
		if (this.nativeid != 0L) {
			Static314.method4249(this);
		}
	}

	@OriginalMember(owner = "client!w", name = "g", descriptor = "(I)Lclient!n;")
	@Override
	public Class1_Sub12 method5795(@OriginalArg(0) int arg0) {
		@Pc(5) g local5 = new g(this, arg0);
		this.aClass227_53.method4972(local5);
		return local5;
	}

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5785(@OriginalArg(0) Canvas arg0) {
		if (this.aB1.aCanvas1 == arg0) {
			this.method5793(null);
		}
		@Pc(16) b local16 = (b) this.aClass199_184.method4387((long) arg0.hashCode());
		if (local16 != null) {
			local16.method5915();
			local16.method323();
		}
	}

	@OriginalMember(owner = "client!w", name = "va", descriptor = "()V")
	public native void va();

	@OriginalMember(owner = "client!w", name = "v", descriptor = "(III[I)V")
	public native void v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!w", name = "v", descriptor = "()V")
	@Override
	public void method5781() {
		if (this.aB1 == null) {
			throw new IllegalStateException("off");
		}
		this.aB1.method322();
	}

	@OriginalMember(owner = "client!w", name = "VA", descriptor = "(IIIIII)Z")
	public native boolean VA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!w", name = "Y", descriptor = "()I")
	public native int Y();

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(II)I")
	@Override
	public int method5787(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method5750() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!pq;IIII)Lclient!e;")
	@Override
	public Class57 method5792(@OriginalArg(0) Class193 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new xa(this, this.aG1, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(II[[I[[IIII)Lclient!ya;")
	@Override
	public Class157 method5744(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new fa(this, this.aG1, arg0, arg1, arg2, arg3, 128, arg4, arg5);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(II[I[I)Lclient!ta;")
	@Override
	public Class104 method5761(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new va(this, this.aG1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(IIIIZ)Lclient!o;")
	@Override
	public Class6 method5777(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return arg4 ? new v(this, this.aG1, arg0, arg1, arg2, arg3) : new ca(this, this.aG1, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5738(@OriginalArg(0) Canvas arg0) {
		@Pc(8) b local8 = (b) this.aClass199_184.method4387((long) arg0.hashCode());
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
		this.aClass199_184.method4383((long) arg0.hashCode(), local8);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "([IIIII)Lclient!o;")
	@Override
	public Class6 method5798(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
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

	@OriginalMember(owner = "client!w", name = "WA", descriptor = "(I[I[F)V")
	private native void WA(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) float[] arg2);

	@OriginalMember(owner = "client!w", name = "ra", descriptor = "(ILclient!ta;II)V")
	public native void ra(@OriginalArg(0) int arg0, @OriginalArg(1) Class104 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!w", name = "GA", descriptor = "(IIII)V")
	public native void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!w", name = "QA", descriptor = "(Lclient!n;)V")
	private native void QA(@OriginalArg(0) Class1_Sub12 arg0);

	@OriginalMember(owner = "client!w", name = "T", descriptor = "()F")
	public native float T();

	@OriginalMember(owner = "client!w", name = "ua", descriptor = "()V")
	private native void ua();

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!n;)V")
	@Override
	public void method5791(@OriginalArg(0) Class1_Sub12 arg0) {
		this.aG1 = (g) arg0;
		this.QA(arg0);
	}

	@OriginalMember(owner = "client!w", name = "X", descriptor = "(S)Z")
	private boolean method5807(@OriginalArg(0) short arg0) {
		synchronized (this) {
			@Pc(9) Class114 local9 = super.anInterface6_8.method3937(arg0);
			if (local9 == null) {
				return false;
			} else {
				this.l(arg0, local9.aByte29, local9.aByte25, local9.aBoolean342, local9.aBoolean340, local9.aBoolean341, local9.aByte28, local9.aByte27, local9.aByte30, local9.aShort37, local9.anInt2891, local9.aBoolean345, local9.aBoolean343);
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!w", name = "SA", descriptor = "(Lclient!c;)V")
	public native void SA(@OriginalArg(0) Class32 arg0);

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method5752(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.A(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!w", name = "j", descriptor = "()Z")
	@Override
	public boolean method5760() {
		return true;
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(IIIIII)Lclient!ob;")
	@Override
	public Class3 method5733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIF)Lclient!bn;")
	@Override
	public Class1_Sub7 method5759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class1_Sub7_Sub2(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!w", name = "n", descriptor = "()V")
	public native void n();

	@OriginalMember(owner = "client!w", name = "f", descriptor = "(I)V")
	@Override
	public void method5790(@OriginalArg(0) int arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!w", name = "AA", descriptor = "()I")
	public native int AA();

	@OriginalMember(owner = "client!w", name = "f", descriptor = "()Z")
	@Override
	public boolean method5740() {
		return false;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!ev;Z)Lclient!o;")
	@Override
	public Class6 method5756(@OriginalArg(0) Class72 arg0) {
		@Pc(2) int[] local2 = arg0.anIntArray129;
		@Pc(5) byte[] local5 = arg0.aByteArray17;
		@Pc(8) int local8 = arg0.anInt1855;
		@Pc(11) int local11 = arg0.anInt1851;
		@Pc(32) Class6 local32;
		if (arg0.aByteArray18 == null) {
			local32 = new q(this, this.aG1, local2, local5, 0, arg0.anInt1855, arg0.anInt1855, arg0.anInt1851);
		} else {
			@Pc(37) int local37 = local8 * local11;
			@Pc(40) int[] local40 = new int[local37];
			@Pc(43) byte[] local43 = arg0.aByteArray18;
			@Pc(52) int local52;
			@Pc(54) int local54;
			if (local43 == null) {
				@Pc(100) boolean local100 = false;
				for (local52 = 0; local52 < local37; local52++) {
					local54 = arg0.anIntArray129[local5[local52] & 0xFF];
					if (local54 >>> 24 != 255) {
						local100 = true;
					}
					local40[local52] = local54;
				}
				if (local100) {
					local32 = new v(this, this.aG1, local40, 0, arg0.anInt1855, arg0.anInt1855, arg0.anInt1851);
				} else {
					local32 = new ca(this, this.aG1, local40, 0, arg0.anInt1855, arg0.anInt1855, arg0.anInt1851);
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
		local32.ha(arg0.anInt1854, arg0.anInt1856, arg0.anInt1852, arg0.anInt1853);
		return local32;
	}

	@OriginalMember(owner = "client!w", name = "m", descriptor = "()Z")
	@Override
	public boolean method5766() {
		return true;
	}
}
