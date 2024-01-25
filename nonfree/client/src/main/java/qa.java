import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class qa extends Class19 implements Interface4 {

	@OriginalMember(owner = "client!qa", name = "u", descriptor = "Lclient!na;")
	private na aNa2;

	@OriginalMember(owner = "client!qa", name = "H", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas6;

	@OriginalMember(owner = "client!qa", name = "I", descriptor = "Lclient!za;")
	private za aZa1;

	@OriginalMember(owner = "client!qa", name = "O", descriptor = "I")
	private int anInt5540;

	@OriginalMember(owner = "client!qa", name = "P", descriptor = "[Lclient!n;")
	private n[] aNArray1;

	@OriginalMember(owner = "client!qa", name = "nativeid", descriptor = "J")
	private final long nativeid = 0L;

	@OriginalMember(owner = "client!qa", name = "t", descriptor = "Lclient!pk;")
	private final Class183 aClass183_40 = new Class183();

	@OriginalMember(owner = "client!qa", name = "C", descriptor = "I")
	private final int anInt5539 = 4096;

	@OriginalMember(owner = "client!qa", name = "z", descriptor = "I")
	private final int anInt5538 = 4096;

	@OriginalMember(owner = "client!qa", name = "L", descriptor = "Lclient!ib;")
	private final Class102 aClass102_28 = new Class102(4);

	@OriginalMember(owner = "client!qa", name = "N", descriptor = "Z")
	private boolean aBoolean496 = false;

	@OriginalMember(owner = "client!qa", name = "A", descriptor = "Lclient!c;")
	private final Class31 aClass31_5;

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lclient!ga;Lclient!et;)V")
	public qa(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Interface7 arg2, @OriginalArg(3) Class66 arg3) {
		super(arg0, arg2);
		try {
			if (!Static319.aBoolean495) {
				if (arg3 == null) {
					System.loadLibrary("jawt");
					System.loadLibrary("sw3d");
					Static319.aBoolean495 = Boolean.TRUE;
				} else {
					arg3.method1740(this.getClass());
					Static319.aBoolean495 = Boolean.TRUE;
				}
			}
			if (!Static319.aBoolean495) {
				throw new RuntimeException("");
			}
			this.K(super.anInterface7_6, 0, 0);
			Static347.method4678(false, true);
			this.aBoolean496 = true;
			if (arg1 != null) {
				this.method4249(arg1);
				this.method4250(arg1);
			}
			this.aClass31_5 = new i();
			this.ea(new i());
			this.method4283(1);
			this.method4273(0);
		} catch (@Pc(92) Throwable local92) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[I[I)Lclient!ma;")
	@Override
	public Class145 method4285(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new sa(this, this.aNa2, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method4290(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(4) int local4;
		@Pc(9) Rectangle local9;
		while (local1 < 9) {
			try {
				for (local4 = 0; local4 < arg1; local4++) {
					local9 = arg0[local4];
					if (local9.width > 0 && local9.height > 0) {
						synchronized (this.aCanvas6.getTreeLock()) {
							this.aZa1.d(local9.x, local9.y, local9.width, local9.height);
						}
					}
				}
				return;
			} catch (@Pc(44) Exception local44) {
				Static435.method5503(200L);
				local1++;
			}
		}
		for (local4 = 0; local4 < arg1; local4++) {
			local9 = arg0[local4];
			if (local9.width > 0 && local9.height > 0) {
				synchronized (this.aCanvas6.getTreeLock()) {
					this.aZa1.d(local9.x, local9.y, local9.width, local9.height);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!mc;Z)V")
	private void method4313(@OriginalArg(0) Class146 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(15) Class3_Sub1_Sub1 local15 = (Class3_Sub1_Sub1) arg0.aClass232_1.method5127(); local15 != null; local15 = (Class3_Sub1_Sub1) arg0.aClass232_1.method5124()) {
			Static319.anIntArray385[local1++] = local15.anInt4068;
			Static319.anIntArray385[local1++] = local15.anInt4076;
			Static319.anIntArray385[local1++] = local15.anInt4073;
			Static319.anIntArray383[local3++] = local15.anInt4072;
			Static319.aShortArray186[local7++] = (short) local15.anInt4077;
			Static319.anIntArray381[local5++] = local15.anInt4069;
			if (arg1) {
				Static319.aByteArray68[local9++] = local15.aByte31;
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "ea", descriptor = "(Lclient!c;)V")
	public native void ea(@OriginalArg(0) Class31 arg0);

	@OriginalMember(owner = "client!qa", name = "AA", descriptor = "(IIII)V")
	public native void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!bb;Z)Lclient!l;")
	@Override
	public Class57 method4308(@OriginalArg(0) Class18 arg0) {
		@Pc(2) int[] local2 = arg0.anIntArray25;
		@Pc(5) byte[] local5 = arg0.aByteArray4;
		@Pc(8) int local8 = arg0.anInt367;
		@Pc(11) int local11 = arg0.anInt366;
		@Pc(32) Class57 local32;
		if (arg0.aByteArray5 == null) {
			local32 = new k(this, this.aNa2, local2, local5, 0, arg0.anInt367, arg0.anInt367, arg0.anInt366);
		} else {
			@Pc(37) int local37 = local8 * local11;
			@Pc(40) int[] local40 = new int[local37];
			@Pc(43) byte[] local43 = arg0.aByteArray5;
			@Pc(52) int local52;
			@Pc(54) int local54;
			if (local43 == null) {
				@Pc(100) boolean local100 = false;
				for (local52 = 0; local52 < local37; local52++) {
					local54 = arg0.anIntArray25[local5[local52] & 0xFF];
					if (local54 >>> 24 != 255) {
						local100 = true;
					}
					local40[local52] = local54;
				}
				if (local100) {
					local32 = new ra(this, this.aNa2, local40, 0, arg0.anInt367, arg0.anInt367, arg0.anInt366);
				} else {
					local32 = new ia(this, this.aNa2, local40, 0, arg0.anInt367, arg0.anInt367, arg0.anInt366);
				}
			} else {
				for (@Pc(47) int local47 = 0; local47 < local11; local47++) {
					local52 = local47 * local8;
					for (local54 = 0; local54 < local8; local54++) {
						local40[local52 + local54] = local2[local5[local52 + local54] & 0xFF] | local43[local52 + local54] << 24;
					}
				}
				local32 = new ra(this, this.aNa2, local40, 0, local8, local8, local11);
			}
		}
		local32.MA(arg0.anInt368, arg0.anInt370, arg0.anInt369, arg0.anInt371);
		return local32;
	}

	@OriginalMember(owner = "client!qa", name = "s", descriptor = "()Lclient!c;")
	@Override
	public Class31 method4274() {
		return new i();
	}

	@OriginalMember(owner = "client!qa", name = "D", descriptor = "()V")
	@Override
	public void method4311() {
	}

	@OriginalMember(owner = "client!qa", name = "A", descriptor = "(IIIIIILclient!ma;II)V")
	private native void A(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class145 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIIII)V")
	public native void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "NA", descriptor = "(IIIII)V")
	protected native void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "H", descriptor = "(IIII)V")
	public native void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "DA", descriptor = "(IIIIII[BII)V")
	public native void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(FFF)V")
	@Override
	public void method4257(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "(IIIIII)V")
	@Override
	public void method4312(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.b(arg0, arg1, arg2, arg4, arg5);
		this.b(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.TA(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
		this.TA(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
	}

	@OriginalMember(owner = "client!qa", name = "FA", descriptor = "()V")
	private native void FA();

	@OriginalMember(owner = "client!qa", name = "ia", descriptor = "(II)V")
	public native void ia(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!qa", name = "ca", descriptor = "(ILclient!ma;II)V")
	public native void ca(@OriginalArg(0) int arg0, @OriginalArg(1) Class145 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIZ)Lclient!l;")
	@Override
	public Class57 method4280(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return arg4 ? new ra(this, this.aNa2, arg0, arg1, arg2, arg3) : new ia(this, this.aNa2, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!qa", name = "k", descriptor = "()Z")
	@Override
	public boolean method4252() {
		return false;
	}

	@OriginalMember(owner = "client!qa", name = "xa", descriptor = "()F")
	public native float xa();

	@OriginalMember(owner = "client!qa", name = "UA", descriptor = "(III)V")
	public native void UA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!qa", name = "m", descriptor = "()Z")
	@Override
	public boolean method4258() {
		return false;
	}

	@OriginalMember(owner = "client!qa", name = "W", descriptor = "()F")
	public native float W();

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(Z)V")
	@Override
	public void method4255(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!qa", name = "MA", descriptor = "(I)V")
	public native void MA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[[I[[IIII)Lclient!ta;")
	@Override
	public Class65 method4297(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new ha(this, this.aNa2, arg0, arg1, arg2, arg3, 128, arg4, arg5);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4249(@OriginalArg(0) Canvas arg0) {
		@Pc(8) za local8 = (za) this.aClass102_28.method2700((long) arg0.hashCode());
		if (local8 != null) {
			return;
		}
		try {
			@Pc(13) Class local13 = Class.forName("java.awt.Canvas");
			@Pc(23) Method local23 = local13.getMethod("setIgnoreRepaint", Boolean.TYPE);
			local23.invoke(arg0, Boolean.TRUE);
		} catch (@Pc(35) Exception local35) {
		}
		local8 = new za(this, arg0);
		this.aClass102_28.method2703((long) arg0.hashCode(), local8);
	}

	@OriginalMember(owner = "client!qa", name = "o", descriptor = "()I")
	@Override
	public int method4260() {
		return 4;
	}

	@OriginalMember(owner = "client!qa", name = "ma", descriptor = "(I)V")
	private native void ma(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "()Z")
	@Override
	public boolean method4243() {
		return false;
	}

	@OriginalMember(owner = "client!qa", name = "OA", descriptor = "(IIII)V")
	public native void OA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "I", descriptor = "(Lclient!u;)V")
	private native void I(@OriginalArg(0) Class4_Sub2 arg0);

	@OriginalMember(owner = "client!qa", name = "za", descriptor = "(I[I[F)V")
	private native void za(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) float[] arg2);

	@OriginalMember(owner = "client!qa", name = "B", descriptor = "()Z")
	@Override
	public boolean method4300() {
		return true;
	}

	@OriginalMember(owner = "client!qa", name = "fa", descriptor = "(IIII)V")
	public native void fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.EA();
	}

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "()V")
	public native void e();

	@OriginalMember(owner = "client!qa", name = "RA", descriptor = "(IIIIII)V")
	private native void RA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "IA", descriptor = "()I")
	public native int IA();

	@OriginalMember(owner = "client!qa", name = "q", descriptor = "()Z")
	@Override
	public boolean method4264() {
		return true;
	}

	@OriginalMember(owner = "client!qa", name = "PA", descriptor = "(Lclient!za;)V")
	private native void PA(@OriginalArg(0) za arg0);

	@OriginalMember(owner = "client!qa", name = "u", descriptor = "()Z")
	@Override
	public boolean method4279() {
		return true;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([IIIII)Lclient!l;")
	@Override
	public Class57 method4265(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new ra(this, this.aNa2, arg0, 0, arg1, arg2, arg3) : new ia(this, this.aNa2, arg0, 0, arg1, arg2, arg3);
				}
			}
		}
		return local1 ? new ra(this, this.aNa2, arg0, 0, arg1, arg2, arg3) : new ia(this, this.aNa2, arg0, 0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!qa", name = "v", descriptor = "()V")
	@Override
	public void method4281() {
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lclient!t;Lclient!mc;Lclient!c;[Lclient!mi;I)V")
	@Override
	public void method4299(@OriginalArg(0) Class110[] arg0, @OriginalArg(1) Class146 arg1, @OriginalArg(2) Class31 arg2, @OriginalArg(3) Class3_Sub5[] arg3, @OriginalArg(4) int arg4) {
		this.method4313(arg1, true);
		if (arg3 == null) {
			this.method4317().Y(this, arg0, arg2, null, arg4, Static319.anIntArray385, Static319.anIntArray383, Static319.anIntArray381, Static319.aShortArray186, Static319.aByteArray68, arg1.aClass232_1.method5128(), Static319.anIntArray384);
		} else {
			@Pc(28) Class3_Sub5 local28 = arg3[0];
			Static319.anIntArray380[5] = 0;
			this.method4317().Y(this, arg0, arg2, Static319.anIntArray380, arg4, Static319.anIntArray385, Static319.anIntArray383, Static319.anIntArray381, Static319.aShortArray186, Static319.aByteArray68, arg1.aClass232_1.method5128(), Static319.anIntArray384);
			local28.anInt4542 = Static319.anIntArray380[0];
			local28.anInt4540 = Static319.anIntArray380[1];
			local28.anInt4543 = Static319.anIntArray380[2];
			local28.anInt4541 = Static319.anIntArray380[3];
			local28.anInt4544 = Static319.anIntArray380[4];
			local28.aBoolean419 = Static319.anIntArray380[5] != 0;
		}
		@Pc(86) int local86 = 0;
		for (@Pc(88) int local88 = 0; local88 < arg0.length; local88++) {
			if (arg0[local88] != null) {
				@Pc(98) da local98 = (da) arg0[local88];
				local98.method1184(local86, arg2);
				if (local98.aClass29Array1 != null) {
					local86 += local98.aClass29Array1.length * 9;
				}
				if (local98.aClass179Array1 != null) {
					local86 += local98.aClass179Array1.length * 3;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "h", descriptor = "(I)V")
	@Override
	public void method4306(@OriginalArg(0) int arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIILclient!ma;II)V")
	@Override
	public void method4287(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class145 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.A(arg0, arg1, arg2, arg3, arg4, 1, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "()Z")
	@Override
	public boolean method4242() {
		return true;
	}

	@OriginalMember(owner = "client!qa", name = "TA", descriptor = "(IIIII)V")
	public native void TA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method4276() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qa", name = "YA", descriptor = "()I")
	public native int YA();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
	@Override
	public void method4246(@OriginalArg(0) int arg0) {
		Static404.method5219();
		this.ma(arg0);
		for (@Pc(10) na local10 = (na) this.aClass183_40.method4140(); local10 != null; local10 = (na) this.aClass183_40.method4144()) {
			local10.a();
		}
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(II)I")
	@Override
	public int method4282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!qa", name = "EA", descriptor = "()V")
	public native void EA();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)V")
	@Override
	public void method4237(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!qa", name = "i", descriptor = "()Z")
	@Override
	public boolean method4248() {
		return false;
	}

	@OriginalMember(owner = "client!qa", name = "GA", descriptor = "(IIII)V")
	public native void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method4253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method4317().va(this, arg0, arg1, arg2, arg3, arg4, arg5, 0);
	}

	@OriginalMember(owner = "client!qa", name = "t", descriptor = "()V")
	@Override
	public void method4278() {
	}

	@OriginalMember(owner = "client!qa", name = "K", descriptor = "(Lclient!ga;II)V")
	private native void K(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "()V")
	@Override
	protected void method4239() {
		for (@Pc(5) na local5 = (na) this.aClass183_40.method4140(); local5 != null; local5 = (na) this.aClass183_40.method4144()) {
			local5.H();
		}
		this.aClass183_40.method4138();
		this.FA();
		if (this.aBoolean496) {
			Static218.method3281(false, true);
			this.aBoolean496 = false;
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIII)Lclient!tb;")
	@Override
	public Class99 method4268(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!qa", name = "p", descriptor = "(I)V")
	public native void p(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)I")
	@Override
	public int method4269(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 & 0xFFFFF;
		@Pc(7) int local7 = arg1 & 0xFFFFF;
		return local3 & local7 ^ local7;
	}

	@OriginalMember(owner = "client!qa", name = "X", descriptor = "(III[I)V")
	public native void X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!qa", name = "p", descriptor = "()Z")
	@Override
	public boolean method4261() {
		return true;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I[Lclient!vp;)V")
	@Override
	public void method4238(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub21[] arg1) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			Static319.anIntArray382[local1++] = arg1[local3].method3160();
			Static319.anIntArray382[local1++] = arg1[local3].method3161();
			Static319.anIntArray382[local1++] = arg1[local3].method3164();
			Static319.anIntArray382[local1++] = arg1[local3].method3165();
			Static319.aFloatArray27[local3] = arg1[local3].method3159();
			Static319.anIntArray382[local1++] = arg1[local3].method3162();
		}
		this.za(arg0, Static319.anIntArray382, Static319.aFloatArray27);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lclient!t;Lclient!c;[Lclient!mi;I)V")
	@Override
	public void method4307(@OriginalArg(0) Class110[] arg0, @OriginalArg(1) Class31 arg1, @OriginalArg(2) Class3_Sub5[] arg2, @OriginalArg(3) int arg3) {
		if (arg2 == null) {
			this.method4317().TA(this, arg0, arg1, null, -1, arg3);
			return;
		}
		@Pc(15) Class3_Sub5 local15 = arg2[0];
		Static319.anIntArray380[5] = 0;
		this.method4317().TA(this, arg0, arg1, Static319.anIntArray380, -1, arg3);
		local15.anInt4542 = Static319.anIntArray380[0];
		local15.anInt4540 = Static319.anIntArray380[1];
		local15.anInt4543 = Static319.anIntArray380[2];
		local15.anInt4541 = Static319.anIntArray380[3];
		local15.anInt4544 = Static319.anIntArray380[4];
		local15.aBoolean419 = Static319.anIntArray380[5] != 0;
	}

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4272(@OriginalArg(0) Canvas arg0) {
		@Pc(8) za local8 = (za) this.aClass102_28.method2700((long) arg0.hashCode());
		@Pc(11) Dimension local11 = arg0.getSize();
		local8.H(arg0, local11.width, local11.height);
		if (arg0 != null && arg0 == this.aCanvas6) {
			this.method4250(arg0);
		}
	}

	@OriginalMember(owner = "client!qa", name = "C", descriptor = "()Z")
	@Override
	public boolean method4301() {
		return false;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!t;Lclient!mc;Lclient!c;Lclient!mi;I)V")
	@Override
	public void method4262(@OriginalArg(0) Class110 arg0, @OriginalArg(1) Class146 arg1, @OriginalArg(2) Class31 arg2, @OriginalArg(3) Class3_Sub5 arg3) {
		this.method4313(arg1, true);
		if (arg3 == null) {
			this.method4317().ba(this, arg0, arg2, null, 0, Static319.anIntArray385, Static319.anIntArray383, Static319.anIntArray381, Static319.aShortArray186, Static319.aByteArray68, arg1.aClass232_1.method5128(), Static319.anIntArray384);
		} else {
			Static319.anIntArray380[5] = 0;
			this.method4317().ba(this, arg0, arg2, Static319.anIntArray380, 0, Static319.anIntArray385, Static319.anIntArray383, Static319.anIntArray381, Static319.aShortArray186, Static319.aByteArray68, arg1.aClass232_1.method5128(), Static319.anIntArray384);
			arg3.anInt4542 = Static319.anIntArray380[0];
			arg3.anInt4540 = Static319.anIntArray380[1];
			arg3.anInt4543 = Static319.anIntArray380[2];
			arg3.anInt4541 = Static319.anIntArray380[3];
			arg3.anInt4544 = Static319.anIntArray380[4];
			arg3.aBoolean419 = Static319.anIntArray380[5] != 0;
		}
		@Pc(83) da local83 = (da) arg0;
		local83.method1184(0, arg2);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!mc;)V")
	@Override
	public void method4277(@OriginalArg(0) Class146 arg0) {
		this.method4313(arg0, false);
		this.method4317().G(this, Static319.anIntArray385, Static319.anIntArray383, Static319.anIntArray381, Static319.aShortArray186, arg0.aClass232_1.method5128());
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "()V")
	@Override
	public void method4236() {
	}

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "(FF)V")
	public native void g(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!qa", name = "B", descriptor = "(F)V")
	public native void B(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "()I")
	public native int a();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIII)V")
	@Override
	public void method4294(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIF)Lclient!vp;")
	@Override
	public Class4_Sub21 method4310(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class4_Sub21_Sub2(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!qa", name = "ZA", descriptor = "()I")
	public native int ZA();

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(I)V")
	@Override
	public void method4273(@OriginalArg(0) int arg0) {
		this.aNArray1[arg0].method3716();
	}

	@OriginalMember(owner = "client!qa", name = "h", descriptor = "()V")
	@Override
	public void method4247() {
		@Pc(1) int local1 = 0;
		while (local1 < 9) {
			try {
				synchronized (this.aCanvas6.getTreeLock()) {
					this.aZa1.ka();
					return;
				}
			} catch (@Pc(18) Exception local18) {
				Static435.method5503(200L);
				local1++;
			}
		}
		synchronized (this.aCanvas6.getTreeLock()) {
			this.aZa1.ka();
		}
	}

	@OriginalMember(owner = "client!qa", name = "l", descriptor = "()V")
	public native void l();

	@OriginalMember(owner = "client!qa", name = "T", descriptor = "(IFFFFF)V")
	public native void T(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!qa", name = "aa", descriptor = "(SBBZZZBBBIIZZ)V")
	private native void aa(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12);

	@OriginalMember(owner = "client!qa", name = "da", descriptor = "([I)V")
	public native void da(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!qa", name = "q", descriptor = "(SBBZZZBBBIIZZ[I)V")
	private native void q(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) int[] arg13);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!tb;)V")
	@Override
	public void method4288(@OriginalArg(0) Class99 arg0) {
	}

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "(I)V")
	@Override
	public void method4283(@OriginalArg(0) int arg0) {
		this.anInt5540 = arg0;
		this.aNArray1 = new n[this.anInt5540];
		for (@Pc(9) int local9 = 0; local9 < this.anInt5540; local9++) {
			this.aNArray1[local9] = new n(this, this.anInt5538, this.anInt5539);
		}
	}

	@OriginalMember(owner = "client!qa", name = "SA", descriptor = "()Ljava/lang/Object;")
	private Object method4314() {
		return new p();
	}

	@OriginalMember(owner = "client!qa", name = "ha", descriptor = "()V")
	private void method4315() {
		System.gc();
		System.runFinalization();
		Static404.method5219();
	}

	@OriginalMember(owner = "client!qa", name = "r", descriptor = "()V")
	@Override
	public void method4266() {
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4250(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aCanvas6 = null;
			this.aZa1 = null;
			this.PA(null);
		} else {
			@Pc(10) za local10 = (za) this.aClass102_28.method2700((long) arg0.hashCode());
			this.aCanvas6 = arg0;
			this.aZa1 = local10;
			this.PA(local10);
		}
	}

	@OriginalMember(owner = "client!qa", name = "F", descriptor = "(IIII)[I")
	public native int[] F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "R", descriptor = "(S)Z")
	private boolean method4316(@OriginalArg(0) short arg0) {
		synchronized (this) {
			@Pc(9) Class251 local9 = super.anInterface7_6.method2396(arg0);
			if (local9 == null) {
				return false;
			} else {
				this.aa(arg0, local9.aByte90, local9.aByte87, local9.aBoolean640, local9.aBoolean639, local9.aBoolean642, local9.aByte91, local9.aByte93, local9.aByte89, local9.aShort99, local9.anInt6934, local9.aBoolean643, local9.aBoolean644);
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "(I)Lclient!u;")
	@Override
	public Class4_Sub2 method4284(@OriginalArg(0) int arg0) {
		@Pc(5) na local5 = new na(this, arg0);
		this.aClass183_40.method4137(local5);
		return local5;
	}

	@OriginalMember(owner = "client!qa", name = "n", descriptor = "()Z")
	@Override
	public boolean method4259() {
		return false;
	}

	@OriginalMember(owner = "client!qa", name = "z", descriptor = "()Z")
	@Override
	public boolean method4291() {
		return true;
	}

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "(I)V")
	@Override
	public void method4303(@OriginalArg(0) int arg0) {
		this.aNArray1[arg0].method3714();
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!u;)V")
	@Override
	public void method4244(@OriginalArg(0) Class4_Sub2 arg0) {
		this.aNa2 = (na) arg0;
		this.I(arg0);
	}

	@OriginalMember(owner = "client!qa", name = "JA", descriptor = "(IIIIII)Z")
	public native boolean JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method4302(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.RA(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!jq;IIII)Lclient!t;")
	@Override
	public Class110 method4254(@OriginalArg(0) Class122 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new da(this, this.aNa2, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!qa", name = "x", descriptor = "()Z")
	@Override
	public boolean method4286() {
		return false;
	}

	@OriginalMember(owner = "client!qa", name = "y", descriptor = "()Lclient!c;")
	@Override
	public Class31 method4289() {
		return this.aClass31_5;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!gt;[Lclient!bb;Z)Lclient!la;")
	@Override
	public Class46 method4275(@OriginalArg(0) Class89 arg0, @OriginalArg(1) Class18[] arg1) {
		return new s(this, this.aNa2, arg0, arg1, null);
	}

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(Z)V")
	@Override
	public void method4309(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "()Z")
	@Override
	public boolean method4245() {
		return true;
	}

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4263(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas6 == arg0) {
			this.method4250(null);
		}
		@Pc(15) za local15 = (za) this.aClass102_28.method2700((long) arg0.hashCode());
		if (local15 != null) {
			local15.method5684();
		}
		local15.method5685();
	}

	@OriginalMember(owner = "client!qa", name = "E", descriptor = "()Lclient!n;")
	public n method4317() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5540; local1++) {
			if (this.aNArray1[local1].aRunnable2 == Thread.currentThread()) {
				return this.aNArray1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!tb;Lclient!tb;FLclient!tb;)Lclient!tb;")
	@Override
	public Class99 method4298(@OriginalArg(0) Class99 arg0, @OriginalArg(1) Class99 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class99 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!qa", name = "O", descriptor = "(IIIIII)V")
	public native void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "w", descriptor = "()I")
	public native int w();

	@OriginalMember(owner = "client!qa", name = "sa", descriptor = "(S)Z")
	private boolean method4318(@OriginalArg(0) short arg0) {
		@Pc(2) Interface7 local2 = super.anInterface7_6;
		synchronized (super.anInterface7_6) {
			if (!super.anInterface7_6.method2392(arg0)) {
				return false;
			}
			@Pc(22) Class251 local22 = super.anInterface7_6.method2396(arg0);
			if (local22 == null) {
				return false;
			}
			@Pc(46) int[] local46;
			if (local22.aBoolean639 && local22.aBoolean640) {
				local46 = super.anInterface7_6.method2393(true, arg0, 0.7F, 128, 128);
			} else {
				local46 = super.anInterface7_6.method2395(arg0, 0.7F, 128, 128);
			}
			this.q(arg0, local22.aByte90, local22.aByte87, local22.aBoolean640, local22.aBoolean639, local22.aBoolean642, local22.aByte91, local22.aByte93, local22.aByte89, local22.aShort99, local22.anInt6934, local22.aBoolean643, local22.aBoolean644, local46);
			return true;
		}
	}

	@OriginalMember(owner = "client!qa", name = "j", descriptor = "()Z")
	@Override
	public boolean method4251() {
		return true;
	}
}
