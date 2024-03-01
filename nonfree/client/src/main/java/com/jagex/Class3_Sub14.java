package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afy")
public class Class3_Sub14 extends Class3 {

	@OriginalMember(owner = "client!afy", name = "u", descriptor = "I")
	public static final int anInt1232 = 5;

	@OriginalMember(owner = "client!afy", name = "b", descriptor = "I")
	public static final int anInt1233 = 7;

	@OriginalMember(owner = "client!afy", name = "x", descriptor = "I")
	public static final int anInt1234 = 2;

	@OriginalMember(owner = "client!afy", name = "s", descriptor = "I")
	public static final int anInt1235 = 3;

	@OriginalMember(owner = "client!afy", name = "j", descriptor = "I")
	public static final int anInt1236 = 10;

	@OriginalMember(owner = "client!afy", name = "y", descriptor = "I")
	static final int anInt1237 = 6;

	@OriginalMember(owner = "client!afy", name = "c", descriptor = "I")
	public static final int anInt1239 = 8;

	@OriginalMember(owner = "client!afy", name = "z", descriptor = "I")
	public static final int anInt1240 = 9;

	@OriginalMember(owner = "client!afy", name = "l", descriptor = "I")
	public static final int anInt1241 = 0;

	@OriginalMember(owner = "client!afy", name = "h", descriptor = "I")
	public static final int anInt1243 = 1;

	@OriginalMember(owner = "client!afy", name = "n", descriptor = "I")
	int anInt1238;

	@OriginalMember(owner = "client!afy", name = "e", descriptor = "I")
	int anInt1242;

	@OriginalMember(owner = "client!afy", name = "r", descriptor = "[I")
	int[] anIntArray180;

	@OriginalMember(owner = "client!afy", name = "d", descriptor = "[[I")
	int[][] anIntArrayArray38;

	@OriginalMember(owner = "client!afy", name = "q", descriptor = "[Z")
	boolean[] aBooleanArray9;

	@OriginalMember(owner = "client!afy", name = "m", descriptor = "[I")
	int[] anIntArray181;

	@OriginalMember(owner = "client!afy", name = "<init>", descriptor = "(I[B)V", line = 24)
	Class3_Sub14(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt1238 = arg0 * -1821418483;
		@Pc(11) Class3_Sub41 local11 = new Class3_Sub41(arg1);
		this.anInt1242 = local11.method20271() * -596960727;
		this.anIntArray180 = new int[this.anInt1242 * -2086067687];
		this.anIntArrayArray38 = new int[this.anInt1242 * -2086067687][];
		this.aBooleanArray9 = new boolean[this.anInt1242 * -2086067687];
		this.anIntArray181 = new int[this.anInt1242 * -2086067687];
		@Pc(48) int local48;
		for (local48 = 0; local48 < this.anInt1242 * -2086067687; local48++) {
			this.anIntArray180[local48] = local11.method20269();
			if (this.anIntArray180[local48] == 6) {
				this.anIntArray180[local48] = 2;
			}
		}
		for (local48 = 0; local48 < this.anInt1242 * -2086067687; local48++) {
			this.aBooleanArray9[local48] = local11.method20269() == 1;
		}
		for (local48 = 0; local48 < this.anInt1242 * -2086067687; local48++) {
			this.anIntArray181[local48] = local11.method20271();
		}
		for (local48 = 0; local48 < this.anInt1242 * -2086067687; local48++) {
			this.anIntArrayArray38[local48] = new int[local11.method20334()];
		}
		for (local48 = 0; local48 < this.anInt1242 * -2086067687; local48++) {
			for (@Pc(141) int local141 = 0; local141 < this.anIntArrayArray38[local48].length; local141++) {
				this.anIntArrayArray38[local48][local141] = local11.method20334();
			}
		}
	}

	@OriginalMember(owner = "client!afy", name = "ag", descriptor = "(IIIII)V", line = 225)
	static void method11266(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(4, (long) arg0);
		local4.method19155();
		local4.anInt2693 = arg1 * 1666161167;
		local4.anInt2695 = arg2 * 378120307;
		local4.anInt2676 = arg3 * -835820601;
	}

	@OriginalMember(owner = "client!afy", name = "n", descriptor = "(Lclient!fw;IIIZLclient!vs;B)V", line = 371)
	static void method11265(@OriginalArg(0) Class186 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class536 arg5) {
		if (arg2 == 0) {
			throw new RuntimeException();
		}
		@Pc(11) Class178 local11 = arg0.aClass178Array8[arg1];
		if (local11.aClass178Array5 == null) {
			local11.aClass178Array5 = new Class178[arg3 + 1];
			local11.aClass178Array6 = local11.aClass178Array5;
		}
		if (local11.aClass178Array5.length <= arg3) {
			@Pc(40) Class178[] local40;
			if (local11.aClass178Array6 == local11.aClass178Array5) {
				local40 = new Class178[arg3 + 1];
				for (@Pc(42) int local42 = 0; local42 < local11.aClass178Array5.length; local42++) {
					local40[local42] = local11.aClass178Array5[local42];
				}
				local11.aClass178Array5 = local11.aClass178Array6 = local40;
			} else {
				local40 = new Class178[arg3 + 1];
				@Pc(73) Class178[] local73 = new Class178[arg3 + 1];
				for (@Pc(75) int local75 = 0; local75 < local11.aClass178Array5.length; local75++) {
					local40[local75] = local11.aClass178Array5[local75];
					local73[local75] = local11.aClass178Array6[local75];
				}
				local11.aClass178Array5 = local40;
				local11.aClass178Array6 = local73;
			}
		}
		if (arg3 > 0 && local11.aClass178Array5[arg3 - 1] == null) {
			throw new RuntimeException("" + (arg3 - 1));
		}
		@Pc(129) Class178 local129 = new Class178();
		local129.anInt3492 = arg2 * 362459695;
		local129.anInt3500 = (local129.anInt3570 = local11.anInt3570) * -389331021;
		local129.anInt3491 = arg3 * -337413039;
		local11.aClass178Array5[arg3] = local129;
		if (local11.aClass178Array5 != local11.aClass178Array6) {
			local11.aClass178Array6[arg3] = local129;
		}
		@Pc(170) Class534 local170;
		if (arg4) {
			local170 = arg5.aClass534_2;
		} else {
			local170 = arg5.aClass534_1;
		}
		local170.aClass186_4 = arg0;
		local170.aClass178_18 = local129;
		Class223.method24442(local11);
	}

	@OriginalMember(owner = "client!afy", name = "ae", descriptor = "(IIIIIIILclient!aml;Lclient!dw;Lclient!yx;IIS)V", line = 1183)
	static void method11264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class3_Sub1_Sub7 arg7, @OriginalArg(8) Class14 arg8, @OriginalArg(9) Class611 arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (arg0 > arg2 && arg0 < arg2 + arg4 && arg1 > arg6 - arg9.anInt5537 * -1760037867 - 1 && arg1 < arg6 + arg9.anInt5536 * -1990992757 && arg7.aBoolean470) {
			arg10 = arg11;
		}
		@Pc(34) int[] local34 = Class156.method23180(arg7);
		@Pc(38) String local38 = Class280.method25428(arg7);
		if (local34 != null) {
			local38 = local38 + Class228.method24519(local34);
		}
		arg8.method3288(local38, arg2 + 3, arg6, arg10, 0, client.aRandom1, Class634.anInt5593, Class354.aClass6Array13, Class43.anIntArray163);
		if (arg7.aBoolean469) {
			Class19_Sub1.aClass6_23.method16783(arg2 + 5 + arg9.method33592(local38), arg6 - arg9.anInt5537 * -1760037867);
		}
	}
}
