package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tw")
public class Class492 {

	@OriginalMember(owner = "client!tw", name = "x", descriptor = "[I")
	static final int[] anIntArray478 = new int[120];

	@OriginalMember(owner = "client!tw", name = "p", descriptor = "I")
	final int anInt5209;

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "I")
	final int anInt5211;

	@OriginalMember(owner = "client!tw", name = "g", descriptor = "Z")
	boolean aBoolean810;

	@OriginalMember(owner = "client!tw", name = "h", descriptor = "I")
	final int anInt5208;

	@OriginalMember(owner = "client!tw", name = "l", descriptor = "I")
	final int anInt5210;

	static {
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < 120; local6++) {
			@Pc(13) int local13 = local6 + 1;
			@Pc(26) int local26 = (int) ((double) local13 + Math.pow(2.0D, (double) local13 / 7.0D) * 300.0D);
			local4 += local26;
			anIntArray478[local6] = local4 / 4;
		}
	}

	@OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(IIZZI)V", line = 21)
	Class492(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.anInt5209 = arg0 * 283785061;
		this.anInt5211 = arg1 * -101475289;
		this.aBoolean810 = arg2;
		if (arg2) {
			this.anInt5208 = arg4 * -130692901;
			this.anInt5210 = this.method29263(arg4) * 838673633;
		} else {
			this.anInt5208 = 130692901;
			this.anInt5210 = -838673633;
		}
	}

	@OriginalMember(owner = "client!tw", name = "b", descriptor = "()I", line = 36)
	int method29282() {
		return this.anInt5209 * -1978719635;
	}

	@OriginalMember(owner = "client!tw", name = "c", descriptor = "()I", line = 36)
	int method29284() {
		return this.anInt5209 * -1978719635;
	}

	@OriginalMember(owner = "client!tw", name = "p", descriptor = "(B)I", line = 36)
	int method29288() {
		return this.anInt5209 * -1978719635;
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(I)Z", line = 40)
	public boolean method29261() {
		return this.aBoolean810;
	}

	@OriginalMember(owner = "client!tw", name = "z", descriptor = "()Z", line = 40)
	public boolean method29270() {
		return this.aBoolean810;
	}

	@OriginalMember(owner = "client!tw", name = "j", descriptor = "()I", line = 44)
	public int method29271() {
		return this.anInt5210 * -1127801055;
	}

	@OriginalMember(owner = "client!tw", name = "n", descriptor = "()I", line = 44)
	public int method29272() {
		return this.anInt5210 * -1127801055;
	}

	@OriginalMember(owner = "client!tw", name = "e", descriptor = "()I", line = 44)
	public int method29273() {
		return this.anInt5210 * -1127801055;
	}

	@OriginalMember(owner = "client!tw", name = "g", descriptor = "(I)I", line = 44)
	public int method29283() {
		return this.anInt5210 * -1127801055;
	}

	@OriginalMember(owner = "client!tw", name = "l", descriptor = "([Ljava/lang/String;[IIII)V", line = 47)
	static void method29293(@OriginalArg(0) String[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(8) int local8 = (arg3 + arg2) / 2;
		@Pc(10) int local10 = arg2;
		@Pc(14) String local14 = arg0[local8];
		arg0[local8] = arg0[arg3];
		arg0[arg3] = local14;
		@Pc(28) int local28 = arg1[local8];
		arg1[local8] = arg1[arg3];
		arg1[arg3] = local28;
		for (@Pc(40) int local40 = arg2; local40 < arg3; local40++) {
			if (local14 == null || arg0[local40] != null && arg0[local40].compareTo(local14) < (local40 & 0x1)) {
				@Pc(63) String local63 = arg0[local40];
				arg0[local40] = arg0[local10];
				arg0[local10] = local63;
				@Pc(77) int local77 = arg1[local40];
				arg1[local40] = arg1[local10];
				arg1[local10++] = local77;
			}
		}
		arg0[arg3] = arg0[local10];
		arg0[local10] = local14;
		arg1[arg3] = arg1[local10];
		arg1[local10] = local28;
		method29293(arg0, arg1, arg2, local10 - 1);
		method29293(arg0, arg1, local10 + 1, arg3);
	}

	@OriginalMember(owner = "client!tw", name = "l", descriptor = "(B)I", line = 48)
	public int method29267() {
		return this.anInt5208 * 1798894419;
	}

	@OriginalMember(owner = "client!tw", name = "r", descriptor = "()I", line = 48)
	public int method29274() {
		return this.anInt5208 * 1798894419;
	}

	@OriginalMember(owner = "client!tw", name = "h", descriptor = "(I)Z", line = 52)
	public boolean method29269() {
		return -1127801055 * this.anInt5210 != -1;
	}

	@OriginalMember(owner = "client!tw", name = "d", descriptor = "()Z", line = 52)
	public boolean method29275() {
		return -1127801055 * this.anInt5210 != -1;
	}

	@OriginalMember(owner = "client!tw", name = "x", descriptor = "(II)I", line = 56)
	public int method29264(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 1;
		@Pc(8) int local8 = this.anInt5211 * 948442007 - 1;
		for (@Pc(10) int local10 = 0; local10 < local8 && arg0 >= anIntArray478[local10]; local10++) {
			local1 = local10 + 2;
		}
		return local1;
	}

	@OriginalMember(owner = "client!tw", name = "w", descriptor = "(I)I", line = 66)
	public int method29260(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 / 10;
		return this.method29264(local3);
	}

	@OriginalMember(owner = "client!tw", name = "s", descriptor = "(II)I", line = 66)
	public int method29265(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 / 10;
		return this.method29264(local3);
	}

	@OriginalMember(owner = "client!tw", name = "m", descriptor = "(I)I", line = 66)
	public int method29268(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 / 10;
		return this.method29264(local3);
	}

	@OriginalMember(owner = "client!tw", name = "q", descriptor = "(I)I", line = 66)
	public int method29276(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 / 10;
		return this.method29264(local3);
	}

	@OriginalMember(owner = "client!tw", name = "v", descriptor = "(I)I", line = 66)
	public int method29278(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 / 10;
		return this.method29264(local3);
	}

	@OriginalMember(owner = "client!tw", name = "t", descriptor = "(I)I", line = 66)
	public int method29279(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 / 10;
		return this.method29264(local3);
	}

	@OriginalMember(owner = "client!tw", name = "f", descriptor = "(I)I", line = 71)
	int method29262(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg0 > this.anInt5211 * 948442007) {
			arg0 = this.anInt5211 * 948442007;
		}
		return arg0 < 2 ? 0 : anIntArray478[arg0 - 2];
	}

	@OriginalMember(owner = "client!tw", name = "u", descriptor = "(II)I", line = 71)
	int method29266(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg0 > this.anInt5211 * 948442007) {
			arg0 = this.anInt5211 * 948442007;
		}
		return arg0 < 2 ? 0 : anIntArray478[arg0 - 2];
	}

	@OriginalMember(owner = "client!tw", name = "i", descriptor = "(I)I", line = 71)
	int method29277(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg0 > this.anInt5211 * 948442007) {
			arg0 = this.anInt5211 * 948442007;
		}
		return arg0 < 2 ? 0 : anIntArray478[arg0 - 2];
	}

	@OriginalMember(owner = "client!tw", name = "k", descriptor = "(I)I", line = 71)
	int method29280(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg0 > this.anInt5211 * 948442007) {
			arg0 = this.anInt5211 * 948442007;
		}
		return arg0 < 2 ? 0 : anIntArray478[arg0 - 2];
	}

	@OriginalMember(owner = "client!tw", name = "o", descriptor = "(I)I", line = 71)
	int method29281(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg0 > this.anInt5211 * 948442007) {
			arg0 = this.anInt5211 * 948442007;
		}
		return arg0 < 2 ? 0 : anIntArray478[arg0 - 2];
	}

	@OriginalMember(owner = "client!tw", name = "at", descriptor = "(I)I", line = 71)
	int method29285(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg0 > this.anInt5211 * 948442007) {
			arg0 = this.anInt5211 * 948442007;
		}
		return arg0 < 2 ? 0 : anIntArray478[arg0 - 2];
	}

	@OriginalMember(owner = "client!tw", name = "aa", descriptor = "(I)I", line = 78)
	int method29259(@OriginalArg(0) int arg0) {
		return this.method29266(arg0) * 10;
	}

	@OriginalMember(owner = "client!tw", name = "y", descriptor = "(II)I", line = 78)
	int method29263(@OriginalArg(0) int arg0) {
		return this.method29266(arg0) * 10;
	}

	@OriginalMember(owner = "client!tw", name = "af", descriptor = "(I)I", line = 78)
	int method29286(@OriginalArg(0) int arg0) {
		return this.method29266(arg0) * 10;
	}

	@OriginalMember(owner = "client!tw", name = "ak", descriptor = "(I)I", line = 78)
	int method29287(@OriginalArg(0) int arg0) {
		return this.method29266(arg0) * 10;
	}

	@OriginalMember(owner = "client!tw", name = "ag", descriptor = "(Lclient!de;I)V", line = 1135)
	static void method29291(@OriginalArg(0) Class21 arg0) {
		if (Class250.anInt3811 * -1176041819 < 2 && !client.aBoolean596 || client.aClass178_13 != null) {
			return;
		}
		@Pc(34) String local34;
		if (client.aBoolean596 && Class250.anInt3811 * -1176041819 < 2) {
			local34 = client.aString153 + Class601.aClass601_143.method33512(Class469.aClass530_2) + client.aString152 + " " + Class1.aString2;
		} else if (Class56_Sub2.method12598() && Class250.anInt3811 * -1176041819 > 2) {
			local34 = Class280.method25428(Class423.aClass3_Sub1_Sub7_5);
		} else {
			@Pc(50) Class3_Sub1_Sub7 local50 = Class423.aClass3_Sub1_Sub7_5;
			if (local50 == null) {
				return;
			}
			local34 = Class280.method25428(local50);
			@Pc(62) int[] local62 = Class156.method23180(local50);
			if (local62 != null) {
				local34 = local34 + Class228.method24519(local62);
			}
		}
		if (Class250.anInt3811 * -1176041819 > 2) {
			local34 = local34 + Class271.method25310(16777215) + " / " + (Class250.anInt3811 * -1176041819 - 2) + Class601.aClass601_135.method33512(Class469.aClass530_2);
		}
		if (Class250.aClass178_15 == null) {
			return;
		}
		@Pc(112) Class14 local112 = Class250.aClass178_15.method23432(Class379.aClass312_1, client.anInterface34_1);
		if (local112 == null) {
			local112 = Class568.aClass14_13;
		}
		local112.method3296(local34, Class250.anInt3813 * 1614269349, Class250.anInt3807 * -309975629, Class250.aClass178_15.anInt3498 * -1494060731, Class250.aClass178_15.anInt3499 * -751005789, Class250.aClass178_15.anInt3506 * 225266731, Class250.aClass178_15.anInt3511 * -846603747, Class250.aClass178_15.anInt3562 * -183226783, Class250.aClass178_15.anInt3553 * 1406609021, client.aRandom1, Class634.anInt5593, client.anIntArray302, Class354.aClass6Array13, Class43.anIntArray163);
		Class198.method24130(client.anIntArray302[0], client.anIntArray302[1], client.anIntArray302[2], client.anIntArray302[3]);
	}

	@OriginalMember(owner = "client!tw", name = "fy", descriptor = "(I)I", line = 2166)
	public static int method29292() {
		if (Class552.aBoolean823 && Class350.aFrame3 != null) {
			return 3;
		} else if (client.aBoolean589) {
			return 2;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!tw", name = "jj", descriptor = "(Lclient!vs;I)V", line = 5787)
	static final void method29289(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class396.method27505(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!tw", name = "lp", descriptor = "(ILclient!ahi;[IZI)Lclient!ahi;", line = 11254)
	public static final Class3_Sub42 method29290(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub42 arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) boolean arg3) {
		@Pc(5) Class3_Sub42 local5 = (Class3_Sub42) client.aClass581_22.method33217((long) arg0);
		if (local5 != null) {
			Class490.method29244(local5, local5.anInt2796 * 1705574607 != arg1.anInt2796 * 1705574607, arg3);
		}
		client.aClass581_22.method33241(arg1, (long) arg0);
		Class16.method1677(arg1.anInt2796 * 1705574607, arg2);
		@Pc(40) Class178 local40 = Class375.method27235(arg0);
		if (local40 != null) {
			Class223.method24442(local40);
		}
		if (client.aClass178_10 != null) {
			Class223.method24442(client.aClass178_10);
			client.aClass178_10 = null;
		}
		Class60.method14617();
		if (local40 != null) {
			Class109.method21948(Class178.aClass186Array1[local40.anInt3570 * 954808515 >>> 16], local40, !arg3);
		}
		if (!arg3) {
			Class331.method26182(arg1.anInt2796 * 1705574607, arg2);
		}
		if (!arg3 && client.anInt3125 * -1579500007 != -1) {
			Class60_Sub15.method13525(client.anInt3125 * -1579500007, 1);
		}
		return arg1;
	}
}
