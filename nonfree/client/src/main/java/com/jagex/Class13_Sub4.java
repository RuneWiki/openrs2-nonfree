package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aby")
public class Class13_Sub4 extends Class13 {

	@OriginalMember(owner = "client!aby", name = "z", descriptor = "J")
	static long aLong13;

	@OriginalMember(owner = "client!aby", name = "a", descriptor = "I")
	final int anInt574;

	@OriginalMember(owner = "client!aby", name = "g", descriptor = "I")
	final int anInt573;

	@OriginalMember(owner = "client!aby", name = "l", descriptor = "I")
	final int anInt575;

	@OriginalMember(owner = "client!aby", name = "h", descriptor = "I")
	final int anInt576;

	@OriginalMember(owner = "client!aby", name = "x", descriptor = "I")
	final int anInt577;

	@OriginalMember(owner = "client!aby", name = "<init>", descriptor = "(Lclient!ahb;)V", line = 13)
	Class13_Sub4(@OriginalArg(0) Class3_Sub41 arg0) {
		super(arg0);
		this.anInt574 = arg0.method20271() * 616490287;
		@Pc(13) int local13 = arg0.method20275();
		this.anInt573 = (local13 >>> 16) * 836813439;
		this.anInt575 = (local13 & 0xFFFF) * 177603337;
		this.anInt576 = arg0.method20269() * -1308231739;
		this.anInt577 = arg0.method20262() * -1314673241;
	}

	@OriginalMember(owner = "client!aby", name = "a", descriptor = "(I)V", line = 23)
	@Override
	public void method16888() {
		Class131.aClass163Array1[this.anInt574 * -1336376881].method23279(this.anInt573 * -1430717057, this.anInt575 * -1660650695, this.anInt576 * 1383362317, this.anInt577 * 394406423);
	}

	@OriginalMember(owner = "client!aby", name = "h", descriptor = "()V", line = 23)
	@Override
	public void method16896() {
		Class131.aClass163Array1[this.anInt574 * -1336376881].method23279(this.anInt573 * -1430717057, this.anInt575 * -1660650695, this.anInt576 * 1383362317, this.anInt577 * 394406423);
	}

	@OriginalMember(owner = "client!aby", name = "d", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZB)V", line = 485)
	static void method5626(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		@Pc(2) Class82 local2 = Class406.method27657();
		if (local2.method21621() == null) {
			return;
		}
		@Pc(12) Class3_Sub23 local12 = Class269.method25284(Class311.aClass311_36, local2.aClass577_2);
		local12.aClass3_Sub41_Sub1_1.method20251(Class43_Sub2.method8763(arg0) + Class43_Sub2.method8763(arg1) + Class43_Sub2.method8763(arg2) + 1);
		local12.aClass3_Sub41_Sub1_1.method20260(arg0);
		local12.aClass3_Sub41_Sub1_1.method20260(arg1);
		local12.aClass3_Sub41_Sub1_1.method20260(arg2);
		@Pc(46) int local46 = 0;
		if (arg3) {
			local46 |= 0x1;
		}
		if (arg4) {
			local46 |= 0x2;
		}
		local12.aClass3_Sub41_Sub1_1.method20250(local46);
		local2.method21601(local12);
	}

	@OriginalMember(owner = "client!aby", name = "iy", descriptor = "(I)V", line = 5264)
	static final void method5625() {
		for (@Pc(4) Class3_Sub1_Sub8 local4 = (Class3_Sub1_Sub8) client.aClass553_44.method32768(); local4 != null; local4 = (Class3_Sub1_Sub8) client.aClass553_44.method32709()) {
			@Pc(10) Class26_Sub1_Sub1_Sub5 local10 = local4.aClass26_Sub1_Sub1_Sub5_1;
			if (client.anInt3034 > local10.anInt2854 * -310910987) {
				local4.method33656();
				local10.method21044();
			} else if (client.anInt3034 >= local10.anInt2853 * 1633562427) {
				local10.method21041();
				@Pc(133) Class320 local133;
				if (local10.anInt2857 * 1118148337 > 0) {
					if (client.anInt3065 * -1773414811 == 2) {
						@Pc(53) Class26_Sub1_Sub1_Sub1 local53 = Class131.aClass163Array1[local10.anInt2857 * 1118148337 - 1].method23278();
						if (local53 != null) {
							@Pc(59) Class320 local59 = local53.method21431().aClass320_61;
							if ((int) local59.aFloat259 >= 0 && (int) local59.aFloat259 < client.aClass370_1.method26943() * 512 && (int) local59.aFloat261 >= 0 && (int) local59.aFloat261 < client.aClass370_1.method27062() * 512) {
								local10.method21046((int) local59.aFloat259, (int) local59.aFloat261, Class186.method23926((int) local59.aFloat259, (int) local59.aFloat261, local53.aByte101) - local10.anInt2852 * -460596559, client.anInt3034);
							}
						}
					} else {
						@Pc(122) Class3_Sub29 local122 = (Class3_Sub29) client.aClass581_21.method33217((long) (local10.anInt2857 * 1118148337 - 1));
						if (local122 != null) {
							@Pc(129) Class26_Sub1_Sub1_Sub1_Sub1 local129 = (Class26_Sub1_Sub1_Sub1_Sub1) local122.anObject2;
							local133 = local129.method21431().aClass320_61;
							if ((int) local133.aFloat259 >= 0 && (int) local133.aFloat259 < client.aClass370_1.method26943() * 512 && (int) local133.aFloat261 >= 0 && (int) local133.aFloat261 < client.aClass370_1.method27062() * 512) {
								local10.method21046((int) local133.aFloat259, (int) local133.aFloat261, Class186.method23926((int) local133.aFloat259, (int) local133.aFloat261, local10.aByte101) - local10.anInt2852 * -460596559, client.anInt3034);
							}
						}
					}
				}
				if (local10.anInt2857 * 1118148337 < 0) {
					@Pc(197) int local197 = -(local10.anInt2857 * 1118148337) - 1;
					@Pc(204) Class26_Sub1_Sub1_Sub1_Sub2 local204;
					if (local197 == client.anInt3115 * 2077649275) {
						local204 = Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3;
					} else {
						local204 = client.aClass26_Sub1_Sub1_Sub1_Sub2Array1[local197];
					}
					if (local204 != null) {
						local133 = local204.method21431().aClass320_61;
						if ((int) local133.aFloat259 >= 0 && (int) local133.aFloat259 < client.aClass370_1.method26943() * 512 && (int) local133.aFloat261 >= 0 && (int) local133.aFloat261 < client.aClass370_1.method27062() * 512) {
							local10.method21046((int) local133.aFloat259, (int) local133.aFloat261, Class186.method23926((int) local133.aFloat259, (int) local133.aFloat261, local10.aByte101) - local10.anInt2852 * -460596559, client.anInt3034);
						}
					}
				}
				local10.method21040(client.anInt3124 * -1814914105);
				client.aClass370_1.method26950().method28054(local10, true);
			}
		}
	}
}
