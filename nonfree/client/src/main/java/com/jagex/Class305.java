package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ho")
public class Class305 {

	@OriginalMember(owner = "client!ho", name = "p", descriptor = "[I")
	int[] anIntArray431;

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "([I)V", line = 6)
	public Class305(@OriginalArg(0) int[] arg0) {
		@Pc(3) int local3;
		for (local3 = 1; local3 <= arg0.length + (arg0.length >> 1); local3 <<= 0x1) {
		}
		this.anIntArray431 = new int[local3 + local3];
		@Pc(25) int local25;
		for (local25 = 0; local25 < local3 + local3; local25++) {
			this.anIntArray431[local25] = -1;
		}
		local25 = 0;
		while (local25 < arg0.length) {
			@Pc(51) int local51;
			for (local51 = arg0[local25] & local3 - 1; this.anIntArray431[local51 + 1 + local51] != -1; local51 = local51 + 1 & local3 - 1) {
			}
			this.anIntArray431[local51 + local51] = arg0[local25];
			this.anIntArray431[local51 + 1 + local51] = local25++;
		}
	}

	@OriginalMember(owner = "client!ho", name = "p", descriptor = "(IB)I", line = 20)
	public int method27237(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = (this.anIntArray431.length >> 1) - 1;
		@Pc(11) int local11 = arg0 & local7;
		while (true) {
			@Pc(20) int local20 = this.anIntArray431[local11 + 1 + local11];
			if (local20 == -1) {
				return -1;
			}
			if (this.anIntArray431[local11 + local11] == arg0) {
				return local20;
			}
			local11 = local11 + 1 & local7;
		}
	}

	@OriginalMember(owner = "client!ho", name = "c", descriptor = "(I)I", line = 20)
	public int method27238(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = (this.anIntArray431.length >> 1) - 1;
		@Pc(11) int local11 = arg0 & local7;
		while (true) {
			@Pc(20) int local20 = this.anIntArray431[local11 + 1 + local11];
			if (local20 == -1) {
				return -1;
			}
			if (this.anIntArray431[local11 + local11] == arg0) {
				return local20;
			}
			local11 = local11 + 1 & local7;
		}
	}

	@OriginalMember(owner = "client!ho", name = "p", descriptor = "(B)I", line = 29)
	static final int method27239() {
		return 0;
	}

	@OriginalMember(owner = "client!ho", name = "l", descriptor = "([BB)Lclient!arb;", line = 89)
	static Class77_Sub1_Sub9 method27240(@OriginalArg(0) byte[] arg0) {
		return new Class77_Sub1_Sub9(new Class77_Sub39(arg0), Class310.anInterface17_4);
	}

	@OriginalMember(owner = "client!ho", name = "h", descriptor = "(I)V", line = 964)
	static void method27241() {
		if (Class419.method28687(client.anInt3390 * -1850530127)) {
			if (client.aClass82_1.method2022() == null) {
				Class668.method33179(13);
			} else {
				Class668.method33179(9);
			}
		} else if (client.anInt3390 * -1850530127 == 13 || client.anInt3390 * -1850530127 == 12) {
			Class668.method33179(15);
		} else if (client.anInt3390 * -1850530127 == 14) {
			Class668.method33179(15);
		}
	}

	@OriginalMember(owner = "client!ho", name = "br", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;I)V", line = 4785)
	static final void method27242(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		arg2.anInt5784 -= 1235998252;
		arg0.anInt3868 = arg2.anIntArray536[arg2.anInt5784 * 2088438307] * -270518329;
		arg0.anInt3869 = arg2.anIntArray536[arg2.anInt5784 * 2088438307 + 1] * 61142245;
		@Pc(39) int local39 = arg2.anIntArray536[arg2.anInt5784 * 2088438307 + 2];
		if (local39 < 0) {
			local39 = 0;
		} else if (local39 > 5) {
			local39 = 5;
		}
		@Pc(59) int local59 = arg2.anIntArray536[arg2.anInt5784 * 2088438307 + 3];
		if (local59 < 0) {
			local59 = 0;
		} else if (local59 > 5) {
			local59 = 5;
		}
		arg0.aByte126 = (byte) local39;
		arg0.aByte128 = (byte) local59;
		Class461.method29531(arg0);
		Class524.method30637(arg1, arg0);
		if (arg0.anInt3857 * -1960530827 == 0) {
			Class145.method15080(arg1, arg0, false);
		}
		if (arg0.anInt3927 * 1365669833 == -1 && !arg1.aBoolean662) {
			Class151_Sub2.method16694(arg0.anInt3863 * -1278450723);
		}
	}

	@OriginalMember(owner = "client!ho", name = "hq", descriptor = "(Lclient!yf;I)V", line = 5824)
	static final void method27243(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class77_Sub19.method13488(local16, local22, false, 1, arg0);
	}
}
