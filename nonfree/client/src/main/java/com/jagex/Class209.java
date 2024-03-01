package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gt")
public class Class209 {

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "Lclient!kg;")
	static Class276 aClass276_8;

	@OriginalMember(owner = "client!gt", name = "od", descriptor = "I")
	public static int anInt3699;

	@OriginalMember(owner = "client!gt", name = "p", descriptor = "[I")
	int[] anIntArray390;

	@OriginalMember(owner = "client!gt", name = "<init>", descriptor = "([I)V", line = 6)
	public Class209(@OriginalArg(0) int[] arg0) {
		@Pc(3) int local3;
		for (local3 = 1; local3 <= arg0.length + (arg0.length >> 1); local3 <<= 0x1) {
		}
		this.anIntArray390 = new int[local3 + local3];
		@Pc(25) int local25;
		for (local25 = 0; local25 < local3 + local3; local25++) {
			this.anIntArray390[local25] = -1;
		}
		local25 = 0;
		while (local25 < arg0.length) {
			@Pc(51) int local51;
			for (local51 = arg0[local25] & local3 - 1; this.anIntArray390[local51 + local51 + 1] != -1; local51 = local51 + 1 & local3 - 1) {
			}
			this.anIntArray390[local51 + local51] = arg0[local25];
			this.anIntArray390[local51 + 1 + local51] = local25++;
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lclient!vs;B)V", line = 17)
	static void method24238(@OriginalArg(0) Class536 arg0) {
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = Class239.aClass505_1.method29516(arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381]).aString230;
	}

	@OriginalMember(owner = "client!gt", name = "p", descriptor = "(IB)I", line = 20)
	public int method24234(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = (this.anIntArray390.length >> 1) - 1;
		@Pc(11) int local11 = arg0 & local7;
		while (true) {
			@Pc(20) int local20 = this.anIntArray390[local11 + local11 + 1];
			if (local20 == -1) {
				return -1;
			}
			if (this.anIntArray390[local11 + local11] == arg0) {
				return local20;
			}
			local11 = local11 + 1 & local7;
		}
	}

	@OriginalMember(owner = "client!gt", name = "g", descriptor = "(I)I", line = 20)
	public int method24235(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = (this.anIntArray390.length >> 1) - 1;
		@Pc(11) int local11 = arg0 & local7;
		while (true) {
			@Pc(20) int local20 = this.anIntArray390[local11 + local11 + 1];
			if (local20 == -1) {
				return -1;
			}
			if (this.anIntArray390[local11 + local11] == arg0) {
				return local20;
			}
			local11 = local11 + 1 & local7;
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)I", line = 20)
	public int method24236(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = (this.anIntArray390.length >> 1) - 1;
		@Pc(11) int local11 = arg0 & local7;
		while (true) {
			@Pc(20) int local20 = this.anIntArray390[local11 + local11 + 1];
			if (local20 == -1) {
				return -1;
			}
			if (this.anIntArray390[local11 + local11] == arg0) {
				return local20;
			}
			local11 = local11 + 1 & local7;
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(CI)Z", line = 45)
	public static boolean method24243(@OriginalArg(0) char arg0) {
		if (arg0 > 0 && arg0 < 128 || !(arg0 < 160 || arg0 > 255)) {
			return true;
		}
		if (arg0 != 0) {
			@Pc(17) char[] local17 = Class535.aCharArray5;
			for (@Pc(19) int local19 = 0; local19 < local17.length; local19++) {
				@Pc(27) char local27 = local17[local19];
				if (local27 == arg0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(B)V", line = 48)
	static void method24237() {
		Class402.aClass23_Sub1_2 = null;
		Class402.aBoolean754 = false;
	}

	@OriginalMember(owner = "client!gt", name = "g", descriptor = "(II)V", line = 145)
	static void method24242(@OriginalArg(0) int arg0) {
		Class519.anInt5283 = arg0 * 705606953;
		@Pc(6) Class161 local6 = Class519.aClass161_58;
		synchronized (Class519.aClass161_58) {
			Class519.aClass161_58.method23224();
		}
	}

	@OriginalMember(owner = "client!gt", name = "gf", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;I)V", line = 5130)
	static final void method24239(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		arg2.anInt5319 -= 936373647;
		@Pc(13) int local13 = arg2.anIntArray496[arg2.anInt5319 * 960738381];
		@Pc(24) short local24 = (short) arg2.anIntArray496[arg2.anInt5319 * 960738381 + 1];
		@Pc(35) short local35 = (short) arg2.anIntArray496[arg2.anInt5319 * 960738381 + 2];
		if (local13 < 0 || local13 >= 5) {
			return;
		}
		arg0.method23446(local13, local24, local35);
		Class223.method24442(arg0);
		if (arg0.anInt3491 * 18828465 == -1 && !arg1.aBoolean657) {
			Class380.method27289(arg0.anInt3570 * 954808515, local13);
		}
	}

	@OriginalMember(owner = "client!gt", name = "amg", descriptor = "(Lclient!vs;B)V", line = 11219)
	static final void method24240(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class190.anInt3672 * 1794595053;
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class190.anInt3637 * 1715618967;
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class190.anInt3664 * 146189819;
		Class190.anInt3672 = 862877238;
		Class190.anInt3637 = -1912961831;
		Class190.anInt3664 = -1859474739;
	}

	@OriginalMember(owner = "client!gt", name = "ath", descriptor = "(Lclient!vs;B)V", line = 12451)
	static final void method24241(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		if (Class613.aClass21_13.method17166()) {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class510.aClass3_Sub45_37.aClass60_Sub29_1.method14599(local12);
		} else {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 3;
		}
	}
}
