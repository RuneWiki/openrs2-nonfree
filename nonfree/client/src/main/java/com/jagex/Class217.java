package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!e")
public class Class217 {

	@OriginalMember(owner = "client!e", name = "l", descriptor = "Z")
	public boolean aBoolean642;

	@OriginalMember(owner = "client!e", name = "p", descriptor = "Ljava/lang/String;")
	public String aString169;

	@OriginalMember(owner = "client!e", name = "v", descriptor = "Ljava/lang/String;")
	public String aString170;

	@OriginalMember(owner = "client!e", name = "c", descriptor = "Ljava/lang/String;")
	public String aString171;

	@OriginalMember(owner = "client!e", name = "t", descriptor = "([I[F[FI)V", line = 139)
	public static void method25699(@OriginalArg(0) int[] arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) float[] arg2) {
		Class127_Sub5.method13159(arg0, arg1, arg2, 0, arg0.length - 1);
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(Ljava/lang/String;I)I", line = 269)
	public static int method25700(@OriginalArg(0) String arg0) {
		return Class529.aTwitchTV1.ChatSendMessage(arg0);
	}

	@OriginalMember(owner = "client!e", name = "bm", descriptor = "(FFFFFFII)F", line = 1925)
	static float method25701(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6) {
		@Pc(1) float local1 = 0.0F;
		@Pc(5) float local5 = arg3 - arg0;
		@Pc(9) float local9 = arg4 - arg1;
		@Pc(13) float local13 = arg5 - arg2;
		@Pc(15) float local15 = 0.0F;
		@Pc(17) float local17 = 0.0F;
		@Pc(19) float local19 = 0.0F;
		@Pc(23) Class556 local23 = client.aClass517_1.method30435();
		while (local1 < 1.1F) {
			@Pc(33) float local33 = arg0 + local5 * local1;
			@Pc(39) float local39 = arg1 + local9 * local1;
			@Pc(45) float local45 = arg2 + local1 * local13;
			@Pc(50) int local50 = (int) local33 >> 9;
			@Pc(55) int local55 = (int) local45 >> 9;
			if (local50 > 0 && local55 > 0 && local50 < client.aClass517_1.method30411() && local55 < client.aClass517_1.method30417()) {
				@Pc(72) int local72 = Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aByte100;
				if (local72 < 3 && (client.aClass517_1.method30441().aByteArrayArrayArray13[1][local50][local55] & 0x2) != 0) {
					local72++;
				}
				@Pc(100) int local100 = local23.aClass88Array2[local72].method5493((int) local33, (int) local45);
				if ((float) local100 < local39) {
					if (arg6 >= 2) {
						return local1 - 0.1F + method25701(local15, local17, local19, local33, local39, local45, arg6 - 1) * 0.1F;
					}
					return local1;
				}
			}
			local15 = local33;
			local17 = local39;
			local19 = local45;
			local1 += 0.1F;
		}
		return -1.0F;
	}

	@OriginalMember(owner = "client!e", name = "afw", descriptor = "(Lclient!yf;I)V", line = 10417)
	static final void method25702(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = Class615.aClass465_1.method29551(local12).aString114;
	}

	@OriginalMember(owner = "client!e", name = "ake", descriptor = "(Lclient!yf;I)V", line = 11410)
	static final void method25703(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 1;
	}

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "()V", line = 12507)
	Class217() {
	}

	@OriginalMember(owner = "client!e", name = "awz", descriptor = "(Lclient!yf;I)V", line = 13276)
	static final void method25704(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub3_1.method16264(local12);
	}
}
