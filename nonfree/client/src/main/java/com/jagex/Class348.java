package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!is")
public class Class348 {

	@OriginalMember(owner = "client!is", name = "lu", descriptor = "I")
	static int anInt4199;

	@OriginalMember(owner = "client!is", name = "o", descriptor = "Lclient!aac;")
	public static Class5 aClass5_14;

	@OriginalMember(owner = "client!is", name = "e", descriptor = "[I")
	int[] anIntArray426;

	@OriginalMember(owner = "client!is", name = "<init>", descriptor = "([I)V", line = 6)
	public Class348(@OriginalArg(0) int[] arg0) {
		@Pc(3) int local3;
		for (local3 = 1; local3 <= (arg0.length >> 1) + arg0.length; local3 <<= 0x1) {
		}
		this.anIntArray426 = new int[local3 + local3];
		@Pc(25) int local25;
		for (local25 = 0; local25 < local3 + local3; local25++) {
			this.anIntArray426[local25] = -1;
		}
		local25 = 0;
		while (local25 < arg0.length) {
			@Pc(51) int local51;
			for (local51 = arg0[local25] & local3 - 1; this.anIntArray426[local51 + local51 + 1] != -1; local51 = local51 + 1 & local3 - 1) {
			}
			this.anIntArray426[local51 + local51] = arg0[local25];
			this.anIntArray426[local51 + local51 + 1] = local25++;
		}
	}

	@OriginalMember(owner = "client!is", name = "m", descriptor = "(I)I", line = 20)
	public int method27616(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = (this.anIntArray426.length >> 1) - 1;
		@Pc(11) int local11 = arg0 & local7;
		while (true) {
			@Pc(20) int local20 = this.anIntArray426[local11 + 1 + local11];
			if (local20 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray426[local11 + local11]) {
				return local20;
			}
			local11 = local11 + 1 & local7;
		}
	}

	@OriginalMember(owner = "client!is", name = "n", descriptor = "(I)I", line = 20)
	public int method27617(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = (this.anIntArray426.length >> 1) - 1;
		@Pc(11) int local11 = arg0 & local7;
		while (true) {
			@Pc(20) int local20 = this.anIntArray426[local11 + 1 + local11];
			if (local20 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray426[local11 + local11]) {
				return local20;
			}
			local11 = local11 + 1 & local7;
		}
	}

	@OriginalMember(owner = "client!is", name = "k", descriptor = "(I)I", line = 20)
	public int method27618(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = (this.anIntArray426.length >> 1) - 1;
		@Pc(11) int local11 = arg0 & local7;
		while (true) {
			@Pc(20) int local20 = this.anIntArray426[local11 + 1 + local11];
			if (local20 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray426[local11 + local11]) {
				return local20;
			}
			local11 = local11 + 1 & local7;
		}
	}

	@OriginalMember(owner = "client!is", name = "e", descriptor = "(IS)I", line = 20)
	public int method27619(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = (this.anIntArray426.length >> 1) - 1;
		@Pc(11) int local11 = arg0 & local7;
		while (true) {
			@Pc(20) int local20 = this.anIntArray426[local11 + 1 + local11];
			if (local20 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray426[local11 + local11]) {
				return local20;
			}
			local11 = local11 + 1 & local7;
		}
	}

	@OriginalMember(owner = "client!is", name = "o", descriptor = "(Lclient!yf;I)V", line = 84)
	static void method27620(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class676.method33217();
	}

	@OriginalMember(owner = "client!is", name = "eh", descriptor = "(Lclient!yf;I)V", line = 5780)
	static final void method27621(@OriginalArg(0) Class681 arg0) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32805(local12);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class693.method36613(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!is", name = "lq", descriptor = "(Lclient!hf;ILclient!yf;I)V", line = 7037)
	static final void method27623(@OriginalArg(0) Class312 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class681 arg2) {
		if (arg0.aByteArrayArray14 == null) {
			throw new RuntimeException();
		}
		if (arg0.anIntArray383 == null) {
			arg0.anIntArray383 = new int[arg0.aByteArrayArray14.length];
		}
		arg0.anIntArray383[arg1] = Integer.MAX_VALUE;
	}

	@OriginalMember(owner = "client!is", name = "ky", descriptor = "(ILclient!alu;[IZB)Lclient!alu;", line = 11919)
	public static final Class93_Sub40 method27622(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub40 arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) boolean arg3) {
		@Pc(5) Class93_Sub40 local5 = (Class93_Sub40) client.aClass16_22.method215((long) arg0);
		if (local5 != null) {
			Class372.method28019(local5, arg1.anInt3172 * 1220811495 != local5.anInt3172 * 1220811495, arg3);
		}
		client.aClass16_22.method221(arg1, (long) arg0);
		Class93_Sub31.method22012(arg1.anInt3172 * 1220811495, arg2);
		@Pc(39) Class312 local39 = Class659.method32805(arg0);
		if (local39 != null) {
			Class354.method27696(local39);
		}
		if (client.aClass312_7 != null) {
			Class354.method27696(client.aClass312_7);
			client.aClass312_7 = null;
		}
		if (local39 != null) {
			Class548.method31016(Class166_Sub1.aClass320Array1[local39.anInt3953 * -1549590237 >>> 16], local39, !arg3);
		}
		if (!arg3) {
			Class56.method18036(arg1.anInt3172 * 1220811495, arg2);
		}
		if (!arg3 && -703563959 * client.anInt3526 != -1) {
			Class189.method24584(client.anInt3526 * -703563959, 1);
		}
		return arg1;
	}
}
