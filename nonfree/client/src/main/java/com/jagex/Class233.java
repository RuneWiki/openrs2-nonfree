package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!es")
public class Class233 {

	@OriginalMember(owner = "client!es", name = "ca", descriptor = "Lclient!cy;")
	static Class83 aClass83_24;

	@OriginalMember(owner = "client!es", name = "p", descriptor = "[I")
	final int[] anIntArray368;

	@OriginalMember(owner = "client!es", name = "c", descriptor = "[I")
	final int[] anIntArray369;

	@OriginalMember(owner = "client!es", name = "v", descriptor = "[I")
	final int[] anIntArray371;

	@OriginalMember(owner = "client!es", name = "l", descriptor = "[I")
	final int[] anIntArray370;

	@OriginalMember(owner = "client!es", name = "y", descriptor = "[I")
	final int[] anIntArray372;

	@OriginalMember(owner = "client!es", name = "w", descriptor = "[I")
	final int[] anIntArray373;

	@OriginalMember(owner = "client!es", name = "t", descriptor = "[I")
	final int[] anIntArray374;

	@OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Lclient!akv;)V", line = 15)
	Class233(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(5) int local5 = arg0.method22537();
		this.anIntArray368 = new int[local5];
		this.anIntArray369 = new int[local5];
		this.anIntArray371 = new int[local5];
		this.anIntArray370 = new int[local5];
		this.anIntArray372 = new int[local5];
		this.anIntArray373 = new int[local5];
		this.anIntArray374 = new int[local5];
		for (@Pc(35) int local35 = 0; local35 < local5; local35++) {
			this.anIntArray368[local35] = arg0.method22483() - 5120;
			this.anIntArray371[local35] = arg0.method22483() - 5120;
			this.anIntArray369[local35] = arg0.method22487();
			this.anIntArray372[local35] = arg0.method22483() - 5120;
			this.anIntArray374[local35] = arg0.method22483() - 5120;
			this.anIntArray373[local35] = arg0.method22487();
			this.anIntArray370[local35] = arg0.method22487();
		}
	}

	@OriginalMember(owner = "client!es", name = "p", descriptor = "(II)V", line = 36)
	void method25869(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = new int[this.anIntArray368.length << 1][4];
		for (@Pc(9) int local9 = 0; local9 < this.anIntArray368.length; local9++) {
			local7[local9 * 2][0] = this.anIntArray368[local9];
			local7[local9 * 2][1] = this.anIntArray369[local9];
			local7[local9 * 2][2] = this.anIntArray371[local9];
			local7[local9 * 2][3] = this.anIntArray370[local9];
			local7[local9 * 2 + 1][0] = this.anIntArray372[local9];
			local7[local9 * 2 + 1][1] = this.anIntArray373[local9];
			local7[local9 * 2 + 1][2] = this.anIntArray374[local9];
			local7[local9 * 2 + 1][3] = this.anIntArray370[local9];
		}
		client.anIntArrayArrayArray15[arg0] = local7;
	}

	@OriginalMember(owner = "client!es", name = "df", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;I)V", line = 5157)
	static final void method25870(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		arg0.aBoolean676 = arg2.anIntArray536[(arg2.anInt5784 -= 308999563) * 2088438307] == 1;
		Class461.method29531(arg0);
	}

	@OriginalMember(owner = "client!es", name = "fc", descriptor = "(Lclient!yf;B)V", line = 5566)
	static final void method25871(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class173.method24541(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!es", name = "qj", descriptor = "(Lclient!yf;I)V", line = 7490)
	static final void method25872(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local11.anInt3946 * -1513459333;
	}

	@OriginalMember(owner = "client!es", name = "tj", descriptor = "(Lclient!yf;I)V", line = 8009)
	static final void method25873(@OriginalArg(0) Class665 arg0) {
		Class536.method30849(arg0);
	}

	@OriginalMember(owner = "client!es", name = "afe", descriptor = "(Lclient!yf;S)V", line = 10124)
	static final void method25874(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(28) Class77_Sub1_Sub14 local28 = Class129.method12183(local13, local23);
		if (local28 != null) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local28.anInt3043 * -759944081;
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = Class143_Sub6.method15117(local28.aLong182 * -1208012376043926345L, Class128.aClass667_3.anInt5789 * -473969159);
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local28.anInt3042 * 1988131041;
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = local28.aString110 == null ? "" : local28.aString110;
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = local28.aString109 == null ? "" : local28.aString109;
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = local28.aString111 == null ? "" : local28.aString111;
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = local28.aString108 == null ? "" : local28.aString108;
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local28.anInt3044 * 1232973141;
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = local28.aString112 == null ? "" : local28.aString112;
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local28.aClass416_1 == null ? -1 : local28.aClass416_1.method36479();
			return;
		}
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = -1;
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = "";
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = "";
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = "";
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = "";
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = "";
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = "";
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = -1;
	}
}
