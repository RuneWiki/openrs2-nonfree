package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public abstract class Class91 {

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V", line = 4)
	Class91() {
	}

	@OriginalMember(owner = "client!da", name = "aid", descriptor = "(Lclient!yf;I)V", line = 10799)
	static final void method18662(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		Class85.method4906(local12 >> 14 & 0x3FFF, local12 & 0x3FFF);
	}

	@OriginalMember(owner = "client!da", name = "kd", descriptor = "(Lclient!gm;IIZI)V", line = 10895)
	static void method18663(@OriginalArg(0) Class277 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(4) int local4 = arg0.anInt3874 * -881188269;
		@Pc(9) int local9 = arg0.anInt3875 * -1279656873;
		if (arg0.aByte127 == 0) {
			arg0.anInt3874 = arg0.anInt3865 * 846270895;
		} else if (arg0.aByte127 == 1) {
			arg0.anInt3874 = (arg1 - arg0.anInt3865 * -1855456835) * 359297499;
		} else if (arg0.aByte127 == 2) {
			arg0.anInt3874 = (arg0.anInt3865 * -1855456835 * arg1 >> 14) * 359297499;
		}
		if (arg0.aByte125 == 0) {
			arg0.anInt3875 = arg0.anInt3871 * 601914875;
		} else if (arg0.aByte125 == 1) {
			arg0.anInt3875 = (arg2 - arg0.anInt3871 * -1196366771) * 758427495;
		} else if (arg0.aByte125 == 2) {
			arg0.anInt3875 = (arg0.anInt3871 * -1196366771 * arg2 >> 14) * 758427495;
		}
		if (arg0.aByte127 == 4) {
			arg0.anInt3874 = arg0.anInt3875 * -1279656873 * 1020405839 * arg0.anInt3890 / (arg0.anInt3870 * 121297385) * 359297499;
		}
		if (arg0.aByte125 == 4) {
			arg0.anInt3875 = arg0.anInt3870 * 121297385 * -881188269 * arg0.anInt3874 / (arg0.anInt3890 * 1020405839) * 758427495;
		}
		if (client.aBoolean600 && (client.method25376(arg0).anInt1558 * 1837782131 != 0 || arg0.anInt3857 * -1960530827 == 0)) {
			if (arg0.anInt3875 * -1279656873 < 5 && arg0.anInt3874 * -881188269 < 5) {
				arg0.anInt3875 = -502829821;
				arg0.anInt3874 = 1796487495;
			} else {
				if (arg0.anInt3875 * -1279656873 <= 0) {
					arg0.anInt3875 = -502829821;
				}
				if (arg0.anInt3874 * -881188269 <= 0) {
					arg0.anInt3874 = 1796487495;
				}
			}
		}
		if (arg0.anInt3866 * 1231845787 == Class277.anInt3933 * -24082201) {
			client.aClass277_6 = arg0;
		}
		if (arg3 && arg0.anObjectArray9 != null && (arg0.anInt3874 * -881188269 != local4 || local9 != arg0.anInt3875 * -1279656873)) {
			@Pc(216) Class77_Sub41 local216 = new Class77_Sub41();
			local216.aClass277_2 = arg0;
			local216.anObjectArray4 = arg0.anObjectArray9;
			client.aClass695_48.method36383(local216);
		}
	}
}
