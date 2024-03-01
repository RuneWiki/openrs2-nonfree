package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fl")
final class Class175 implements Interface16 {

	@OriginalMember(owner = "client!fl", name = "p", descriptor = "(I)[Lclient!sl;", line = 14)
	public static Class458[] method23410() {
		return new Class458[] { Class458.aClass458_3, Class458.aClass458_5, Class458.aClass458_4 };
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Ljava/lang/String;)J", line = 20)
	@Override
	public long method23405(@OriginalArg(0) String arg0) {
		return Class221.method24417(arg0);
	}

	@OriginalMember(owner = "client!fl", name = "p", descriptor = "(Ljava/lang/String;B)J", line = 20)
	@Override
	public long method23406(@OriginalArg(0) String arg0) {
		return Class221.method24417(arg0);
	}

	@OriginalMember(owner = "client!fl", name = "m", descriptor = "(Lclient!fo;Lclient!fe;IIIIIJ)V", line = 715)
	static void method23407(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class169 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) long arg7) {
		@Pc(7) int local7 = arg5 * arg5 + arg4 * arg4;
		if ((long) local7 > arg7) {
			return;
		}
		@Pc(32) int local32;
		if (Class72.anInt2086 * 81180077 == 3) {
			local32 = (int) ((double) Class80.aClass23_Sub1_1.method5836() * 2607.5945876176133D) + client.anInt3081 * 732347007 & 0x3FFF;
		} else if (Class72.anInt2086 * 81180077 == 4) {
			local32 = (int) client.aFloat238 & 0x3FFF;
		} else {
			local32 = (int) client.aFloat238 + client.anInt3081 * 732347007 & 0x3FFF;
		}
		@Pc(57) int local57 = Class317.anIntArray419[local32];
		@Pc(61) int local61 = Class317.anIntArray420[local32];
		if (Class72.anInt2086 * 81180077 != 4) {
			local57 = local57 * 256 / (client.anInt3083 * 1898621565 + 256);
			local61 = local61 * 256 / (client.anInt3083 * 1898621565 + 256);
		}
		@Pc(96) int local96 = arg4 * local61 + arg5 * local57 >> 14;
		@Pc(106) int local106 = local61 * arg5 - arg4 * local57 >> 14;
		@Pc(110) Class6 local110 = Class542.aClass6Array15[arg6];
		@Pc(113) int local113 = local110.method16782();
		@Pc(116) int local116 = local110.method16787();
		@Pc(129) int local129 = local96 + arg0.anInt3498 * -1494060731 / 2 - local113 / 2;
		@Pc(133) int local133 = local113 + local129;
		@Pc(145) int local145 = -local106 + arg0.anInt3499 * -751005789 / 2 - local116;
		@Pc(149) int local149 = local145 + local116;
		@Pc(179) boolean local179;
		if (arg1 == null) {
			@Pc(186) int local186 = local113 / 2;
			local179 = local145 <= -local116 || local149 >= arg0.anInt3499 * -751005789 || local129 <= -local186 || local133 >= local186 + arg0.anInt3498 * -1494060731;
		} else {
			local179 = !arg1.method23352(local129, local145) || !arg1.method23352(local133, local145) || !arg1.method23352(local129, local149) || !arg1.method23352(local133, local149);
		}
		if (local179) {
			@Pc(220) double local220 = Math.atan2((double) local96, (double) local106);
			@Pc(228) double local228 = Math.atan2((double) Math.abs(local96), (double) Math.abs(local106));
			@Pc(244) double local244 = Math.atan2((double) (arg0.anInt3498 * -1494060731 / 2), (double) (arg0.anInt3499 * -751005789 / 2));
			@Pc(263) int local263;
			@Pc(256) double local256;
			if (local228 < local244) {
				local256 = 1.5707963267948966D - local220;
				local263 = arg0.anInt3499 * -751005789 / 2;
			} else {
				local256 = local220;
				local263 = arg0.anInt3498 * -1494060731 / 2;
			}
			@Pc(285) int local285 = Math.abs((int) -((double) local263 * Math.sin(1.5707963267948966D) / Math.sin(local256)));
			Class16.aClass6Array3[arg6].method16791((float) arg2 + (float) (arg0.anInt3498 * -1494060731) / 2.0F + 0.0F, (float) (arg0.anInt3499 * -751005789) / 2.0F + (float) arg3 - 0.0F, (float) Class16.aClass6Array3[arg6].method16772() / 2.0F, (float) local285, 4096, (int) (-local220 / 6.283185307179586D * 65535.0D));
		} else if (arg1 == null) {
			local110.method16783(arg2 + local129, arg3 + local145);
		} else {
			local110.method16785(arg2 + local129, local145 + arg3, arg1.aClass5_1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!fl", name = "bm", descriptor = "(Lclient!amn;Lclient!yx;I)I", line = 1387)
	static int method23409(@OriginalArg(0) Class3_Sub1_Sub9 arg0, @OriginalArg(1) Class611 arg1) {
		@Pc(3) String local3 = Class13_Sub22.method7254(arg0);
		return arg1.method33582(local3, Class354.aClass6Array13);
	}

	@OriginalMember(owner = "client!fl", name = "zw", descriptor = "(Lclient!vs;I)V", line = 8625)
	static final void method23411(@OriginalArg(0) Class536 arg0) {
		Class436.method28023(arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381]);
	}

	@OriginalMember(owner = "client!fl", name = "aki", descriptor = "(Lclient!vs;S)V", line = 11026)
	static final void method23408(@OriginalArg(0) Class536 arg0) throws Exception_Sub4 {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(26) float local26 = (float) arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1] / 1000.0F;
		Class80.aClass23_Sub1_1.method5820(local13, local26);
	}

	@OriginalMember(owner = "client!fl", name = "alg", descriptor = "(Lclient!vs;S)V", line = 11086)
	static final void method23412(@OriginalArg(0) Class536 arg0) throws Exception_Sub4 {
		arg0.anInt5319 -= 936373647;
		Class80.aClass23_Sub1_1.method5810((float) arg0.anIntArray496[arg0.anInt5319 * 960738381], (float) arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1], (float) arg0.anIntArray496[arg0.anInt5319 * 960738381 + 2]);
	}
}
