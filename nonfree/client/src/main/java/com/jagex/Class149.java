package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ei")
class Class149 implements Interface41 {

	@OriginalMember(owner = "client!ei", name = "kj", descriptor = "I")
	public static int anInt3434;

	// $FF: synthetic field
	@OriginalMember(owner = "client!ei", name = "this$0", descriptor = "Lclient!ft;")
	final Class183 this$0;

	@OriginalMember(owner = "client!ei", name = "l", descriptor = "(IZB)V", line = 58)
	static void method23128(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			@Pc(7) Class3_Sub23 local7 = Class269.method25284(Class311.aClass311_15, client.aClass82_2.aClass577_2);
			local7.aClass3_Sub41_Sub1_1.method20251(arg0);
			client.aClass82_2.method21601(local7);
		} else {
			Class291.method25543(Class634.aClass634_2, arg0, -1);
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)Z", line = 116)
	static boolean method23129() {
		if (client.aByteArray57 == null) {
			return Class190.anInt3639 * 1219357829 == -1 ? Class1.method6(Class190.aString178, Class190.aString179) : Class379.method27272();
		} else {
			return Class566.method32921();
		}
	}

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Lclient!ft;)V", line = 182)
	Class149(@OriginalArg(0) Class183 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!ei", name = "g", descriptor = "(Ljava/lang/Object;[F[Ljava/lang/Object;)V", line = 184)
	@Override
	public void method23175(@OriginalArg(0) Object arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Object[] arg2) {
		@Pc(2) Class366 local2 = (Class366) arg0;
		@Pc(6) Class320 local6 = local2.method26834();
		@Pc(10) float local10 = local2.method26835();
		@Pc(14) float local14 = local2.method26900();
		@Pc(21) Class320 local21 = Class320.method25928(local6, this.this$0.method23567());
		@Pc(26) float local26 = local21.method25861();
		if (local26 >= local14) {
		}
		@Pc(38) float local38;
		if (local26 <= local10) {
			local38 = 1.0F;
		} else {
			@Pc(51) float local51 = 1.0F - 1.0F / (local14 - local10) * (local26 - local10);
			if ((double) local51 < 0.0D || (double) local51 > 1.0D) {
				local51 = Math.min(Math.max(local51, 0.0F), 1.0F);
			}
			local38 = local51;
		}
		arg1[0] = local38;
		arg1[1] = local38;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Ljava/lang/Object;[F[Ljava/lang/Object;)V", line = 184)
	@Override
	public void method23176(@OriginalArg(0) Object arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Object[] arg2) {
		@Pc(2) Class366 local2 = (Class366) arg0;
		@Pc(6) Class320 local6 = local2.method26834();
		@Pc(10) float local10 = local2.method26835();
		@Pc(14) float local14 = local2.method26900();
		@Pc(21) Class320 local21 = Class320.method25928(local6, this.this$0.method23567());
		@Pc(26) float local26 = local21.method25861();
		if (local26 >= local14) {
		}
		@Pc(38) float local38;
		if (local26 <= local10) {
			local38 = 1.0F;
		} else {
			@Pc(51) float local51 = 1.0F - 1.0F / (local14 - local10) * (local26 - local10);
			if ((double) local51 < 0.0D || (double) local51 > 1.0D) {
				local51 = Math.min(Math.max(local51, 0.0F), 1.0F);
			}
			local38 = local51;
		}
		arg1[0] = local38;
		arg1[1] = local38;
	}

	@OriginalMember(owner = "client!ei", name = "p", descriptor = "(Ljava/lang/Object;[F[Ljava/lang/Object;B)V", line = 184)
	@Override
	public void method23178(@OriginalArg(0) Object arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Object[] arg2) {
		@Pc(2) Class366 local2 = (Class366) arg0;
		@Pc(6) Class320 local6 = local2.method26834();
		@Pc(10) float local10 = local2.method26835();
		@Pc(14) float local14 = local2.method26900();
		@Pc(21) Class320 local21 = Class320.method25928(local6, this.this$0.method23567());
		@Pc(26) float local26 = local21.method25861();
		if (local26 >= local14) {
		}
		@Pc(38) float local38;
		if (local26 <= local10) {
			local38 = 1.0F;
		} else {
			@Pc(51) float local51 = 1.0F - 1.0F / (local14 - local10) * (local26 - local10);
			if ((double) local51 < 0.0D || (double) local51 > 1.0D) {
				local51 = Math.min(Math.max(local51, 0.0F), 1.0F);
			}
			local38 = local51;
		}
		arg1[0] = local38;
		arg1[1] = local38;
	}

	@OriginalMember(owner = "client!ei", name = "l", descriptor = "(Ljava/lang/Object;[F[Ljava/lang/Object;)V", line = 184)
	@Override
	public void method23177(@OriginalArg(0) Object arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Object[] arg2) {
		@Pc(2) Class366 local2 = (Class366) arg0;
		@Pc(6) Class320 local6 = local2.method26834();
		@Pc(10) float local10 = local2.method26835();
		@Pc(14) float local14 = local2.method26900();
		@Pc(21) Class320 local21 = Class320.method25928(local6, this.this$0.method23567());
		@Pc(26) float local26 = local21.method25861();
		if (local26 >= local14) {
		}
		@Pc(38) float local38;
		if (local26 <= local10) {
			local38 = 1.0F;
		} else {
			@Pc(51) float local51 = 1.0F - 1.0F / (local14 - local10) * (local26 - local10);
			if ((double) local51 < 0.0D || (double) local51 > 1.0D) {
				local51 = Math.min(Math.max(local51, 0.0F), 1.0F);
			}
			local38 = local51;
		}
		arg1[0] = local38;
		arg1[1] = local38;
	}

	@OriginalMember(owner = "client!ei", name = "o", descriptor = "(B)Lclient!ahb;", line = 874)
	static Class3_Sub41 method23126() {
		@Pc(4) Class3_Sub41 local4 = new Class3_Sub41(518);
		Class190.anIntArray386 = new int[4];
		Class190.anIntArray386[0] = (int) (Math.random() * 9.9999999E7D);
		Class190.anIntArray386[1] = (int) (Math.random() * 9.9999999E7D);
		Class190.anIntArray386[2] = (int) (Math.random() * 9.9999999E7D);
		Class190.anIntArray386[3] = (int) (Math.random() * 9.9999999E7D);
		local4.method20250(10);
		local4.method20254(Class190.anIntArray386[0]);
		local4.method20254(Class190.anIntArray386[1]);
		local4.method20254(Class190.anIntArray386[2]);
		local4.method20254(Class190.anIntArray386[3]);
		return local4;
	}

	@OriginalMember(owner = "client!ei", name = "np", descriptor = "(Lclient!vs;I)V", line = 6560)
	static final void method23127(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class564.method32900(local16, local22, arg0);
	}
}
