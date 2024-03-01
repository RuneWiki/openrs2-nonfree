package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nt")
public class Class356 implements Interface56 {

	@OriginalMember(owner = "client!nt", name = "u", descriptor = "I")
	public static int anInt4636;

	@OriginalMember(owner = "client!nt", name = "aa", descriptor = "I")
	static int anInt4637;

	@OriginalMember(owner = "client!nt", name = "p", descriptor = "Lclient!nt;")
	static final Class356 aClass356_2 = new Class356(0);

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "Lclient!nt;")
	static final Class356 aClass356_1 = new Class356(1);

	@OriginalMember(owner = "client!nt", name = "g", descriptor = "Lclient!nt;")
	static final Class356 aClass356_3 = new Class356(2);

	@OriginalMember(owner = "client!nt", name = "l", descriptor = "I")
	final int anInt4635;

	@OriginalMember(owner = "client!nt", name = "s", descriptor = "()[Lclient!nt;", line = 14)
	public static Class356[] method26644() {
		return new Class356[] { aClass356_1, aClass356_3, aClass356_2 };
	}

	@OriginalMember(owner = "client!nt", name = "g", descriptor = "()[Lclient!nt;", line = 14)
	public static Class356[] method26645() {
		return new Class356[] { aClass356_1, aClass356_3, aClass356_2 };
	}

	@OriginalMember(owner = "client!nt", name = "<init>", descriptor = "(I)V", line = 17)
	Class356(@OriginalArg(0) int arg0) {
		this.anInt4635 = arg0 * -1480414409;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(I)I", line = 22)
	@Override
	public int method33765() {
		return this.anInt4635 * -1241711993;
	}

	@OriginalMember(owner = "client!nt", name = "l", descriptor = "()I", line = 22)
	@Override
	public int method33767() {
		return this.anInt4635 * -1241711993;
	}

	@OriginalMember(owner = "client!nt", name = "h", descriptor = "()I", line = 22)
	@Override
	public int method33766() {
		return this.anInt4635 * -1241711993;
	}

	@OriginalMember(owner = "client!nt", name = "x", descriptor = "()I", line = 22)
	@Override
	public int method33764() {
		return this.anInt4635 * -1241711993;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "([Lclient!vm;IB)Lclient!vm;", line = 33)
	public static Interface56 method26649(@OriginalArg(0) Interface56[] arg0, @OriginalArg(1) int arg1) {
		@Pc(1) Interface56[] local1 = arg0;
		for (@Pc(3) int local3 = 0; local3 < local1.length; local3++) {
			@Pc(11) Interface56 local11 = local1[local3];
			if (arg1 == local11.method33765()) {
				return local11;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!nt", name = "h", descriptor = "(II)I", line = 52)
	public static int method26652(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local1 += 16;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local1 += 8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local1 += 4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local1 += 2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local1++;
		}
		return local1 + arg0;
	}

	@OriginalMember(owner = "client!nt", name = "x", descriptor = "(Z[BI)V", line = 84)
	public static void method26651(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1) {
		if (Class471.aClass3_Sub41_19 == null) {
			Class471.aClass3_Sub41_19 = new Class3_Sub41(20000);
		}
		Class471.aClass3_Sub41_19.method20248(arg1, 0, arg1.length);
		if (!arg0) {
			return;
		}
		Class190.method24050(Class471.aClass3_Sub41_19.aByteArray51);
		Class570.aClass63_Sub1Array2 = new Class63_Sub1[anInt4636 * 1582861387];
		@Pc(28) int local28 = 0;
		for (@Pc(32) int local32 = Class400.anInt4803 * -812257991; local32 <= Class490.anInt5198 * -830555485; local32++) {
			@Pc(41) Class63_Sub1 local41 = Class200.method24148(local32);
			if (local41 != null) {
				Class570.aClass63_Sub1Array2[local28++] = local41;
			}
		}
		Class570.aBoolean827 = false;
		Class557.aLong285 = Class176.method23413() * 3870832133577971533L;
		Class471.aClass3_Sub41_19 = null;
	}

	@OriginalMember(owner = "client!nt", name = "h", descriptor = "(II)V", line = 99)
	public static void method26646(@OriginalArg(0) int arg0) {
		Class398.anInt4797 = arg0 * -2018871613;
	}

	@OriginalMember(owner = "client!nt", name = "ao", descriptor = "(Lclient!vs;B)V", line = 4069)
	static final void method26655(@OriginalArg(0) Class536 arg0) {
		@Pc(7) int local7 = arg0.anIntArray497[arg0.anInt5318 * -2140198955];
		@Pc(11) Class3_Sub1_Sub6 local11 = Class118.method22820(local7);
		if (local11 == null) {
			throw new RuntimeException();
		}
		@Pc(24) int[] local24 = new int[local11.anInt2657 * -1110480365];
		@Pc(30) Object[] local30 = new Object[local11.anInt2656 * 1386116957];
		@Pc(36) long[] local36 = new long[local11.anInt2661 * 1291811773];
		@Pc(38) int local38;
		for (local38 = 0; local38 < local11.anInt2658 * -728247763; local38++) {
			local24[local38] = arg0.anIntArray496[local38 + (arg0.anInt5319 * 960738381 - local11.anInt2658 * -728247763)];
		}
		for (local38 = 0; local38 < local11.anInt2659 * -1422170129; local38++) {
			local30[local38] = arg0.anObjectArray42[arg0.anInt5315 * 996806575 - local11.anInt2659 * -1422170129 + local38];
		}
		for (local38 = 0; local38 < local11.anInt2660 * -1344127293; local38++) {
			local36[local38] = arg0.aLongArray18[local38 + (arg0.anInt5316 * 196643287 - local11.anInt2660 * -1344127293)];
		}
		arg0.anInt5319 -= local11.anInt2658 * 1318520161;
		arg0.anInt5315 -= local11.anInt2659 * 1739324353;
		arg0.anInt5316 -= local11.anInt2660 * -2127966987;
		@Pc(148) Class509 local148 = new Class509();
		local148.aClass3_Sub1_Sub6_1 = arg0.aClass3_Sub1_Sub6_2;
		local148.anInt5257 = arg0.anInt5318 * -1787725313;
		local148.anIntArray489 = arg0.anIntArray494;
		local148.anObjectArray40 = arg0.anObjectArray41;
		local148.aLongArray16 = arg0.aLongArray17;
		if (arg0.anInt5317 * 434769019 >= arg0.aClass509Array1.length) {
			throw new RuntimeException();
		}
		arg0.aClass509Array1[(arg0.anInt5317 += 1066922675) * 434769019 - 1] = local148;
		arg0.aClass3_Sub1_Sub6_2 = local11;
		arg0.aClass385Array2 = arg0.aClass3_Sub1_Sub6_2.aClass385Array1;
		arg0.anIntArray497 = arg0.aClass3_Sub1_Sub6_2.anIntArray260;
		arg0.anInt5318 = 836839043;
		arg0.anIntArray494 = local24;
		arg0.anObjectArray41 = local30;
		arg0.aLongArray17 = local36;
	}

	@OriginalMember(owner = "client!nt", name = "qy", descriptor = "(Lclient!vs;B)V", line = 6999)
	static final void method26647(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local11.anInt3539 * 1132456653;
	}

	@OriginalMember(owner = "client!nt", name = "wd", descriptor = "(Lclient!vs;B)V", line = 8039)
	static final void method26656(@OriginalArg(0) Class536 arg0) {
		Class346.method26516(Class108.method21941(), arg0);
	}

	@OriginalMember(owner = "client!nt", name = "jx", descriptor = "(IIII)V", line = 8804)
	public static void method26653(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class464 local3 = client.aClass370_1.method26942();
		@Pc(10) int local10 = local3.anInt5071 * -1567811631 + arg1;
		@Pc(17) int local17 = local3.anInt5073 * 1360175441 + arg2;
		if (client.aClass370_1.method26950() == null || client.aClass370_1.method27018() == Class380.aClass380_4 || arg1 < 0 || arg2 < 0 || arg1 >= client.aClass370_1.method26943() || arg2 >= client.aClass370_1.method27062()) {
			return;
		}
		@Pc(52) long local52 = (long) (arg0 << 28 | local17 << 14 | local10);
		@Pc(57) Class3_Sub13 local57 = (Class3_Sub13) client.aClass581_19.method33217(local52);
		if (local57 == null) {
			client.aClass370_1.method26950().method28082(arg0, arg1, arg2);
			return;
		}
		@Pc(76) Class3_Sub4 local76 = (Class3_Sub4) local57.aClass553_17.method32768();
		if (local76 == null) {
			client.aClass370_1.method26950().method28082(arg0, arg1, arg2);
			return;
		}
		@Pc(90) int local90 = -1;
		@Pc(92) int local92 = -1;
		@Pc(94) int local94 = -1;
		@Pc(96) Class332 local96 = null;
		@Pc(98) Class332 local98 = null;
		@Pc(100) Class332 local100 = null;
		@Pc(110) Class26_Sub1_Sub5_Sub1 local110 = (Class26_Sub1_Sub5_Sub1) client.aClass370_1.method26950().method28082(arg0, arg1, arg2);
		if (local110 == null) {
			local110 = new Class26_Sub1_Sub5_Sub1(client.aClass370_1.method26950(), arg1 << 9, client.aClass370_1.method26950().aClass17Array3[arg0].method3548(arg1, arg2), arg2 << 9, arg0, arg0);
		} else {
			local90 = local110.anInt2880 * -732311335;
			local92 = local110.anInt2886 * 721971637;
			local94 = local110.anInt2884 * 953659793;
			local96 = local110.aClass332_48;
			local98 = local110.aClass332_49;
			local100 = local110.aClass332_46;
			local110.anInt2884 = 207540367;
			local110.anInt2886 = -1044774045;
			local110.aClass438_23 = client.aClass370_1.method26950();
		}
		local110.anInt2880 = local76.anInt1163 * 321982849;
		local110.anInt2877 = local76.anInt1162 * 477818991;
		label98: while (true) {
			@Pc(193) Class3_Sub4 local193 = (Class3_Sub4) local57.aClass553_17.method32709();
			if (local193 == null) {
				break;
			}
			if (local193.anInt1163 * 212444761 != local110.anInt2880 * -732311335) {
				local110.anInt2886 = local193.anInt1163 * 667394197;
				local110.anInt2879 = local193.anInt1162 * -714557895;
				while (true) {
					@Pc(224) Class3_Sub4 local224 = (Class3_Sub4) local57.aClass553_17.method32709();
					if (local224 == null) {
						break label98;
					}
					if (local110.anInt2880 * -732311335 != local224.anInt1163 * 212444761 && local224.anInt1163 * 212444761 != local110.anInt2886 * 721971637) {
						local110.anInt2884 = local224.anInt1163 * -714750903;
						local110.anInt2882 = local224.anInt1162 * -1613006749;
					}
				}
			}
		}
		@Pc(273) int local273 = Class186.method23926((arg1 << 9) + 256, (arg2 << 9) + 256, arg0);
		local110.method21437((float) (arg1 << 9), (float) local273, (float) (arg2 << 9));
		if (local90 != local110.anInt2880 * -732311335) {
			if (local110.anInt2880 * -732311335 == local92) {
				local110.aClass332_48 = local98;
			} else if (local110.anInt2880 * -732311335 == local94) {
				local110.aClass332_48 = local100;
			} else if (Class44_Sub3.aClass596_1.method33435(local110.anInt2880 * -732311335).aBoolean846) {
				local110.aClass332_48 = Class3_Sub1_Sub10_Sub2.method21134();
			} else {
				local110.aClass332_48 = null;
			}
		}
		if (local110.anInt2886 * 721971637 == -1) {
			local110.aClass332_49 = null;
		} else if (local110.anInt2886 * 721971637 != local92) {
			if (local90 == local110.anInt2886 * 721971637) {
				local110.aClass332_49 = local96;
			} else if (local94 == local110.anInt2886 * 721971637) {
				local110.aClass332_49 = local100;
			} else if (Class44_Sub3.aClass596_1.method33435(local110.anInt2886 * 721971637).aBoolean846) {
				local110.aClass332_49 = Class3_Sub1_Sub10_Sub2.method21134();
			} else {
				local110.aClass332_49 = null;
			}
		}
		if (local110.anInt2884 * 953659793 == -1) {
			local110.aClass332_46 = null;
		} else if (local110.anInt2884 * 953659793 != local94) {
			if (local90 == local110.anInt2884 * 953659793) {
				local110.aClass332_46 = local96;
			} else if (local110.anInt2884 * 953659793 == local92) {
				local110.aClass332_46 = local98;
			} else if (Class44_Sub3.aClass596_1.method33435(local110.anInt2884 * 953659793).aBoolean846) {
				local110.aClass332_46 = Class3_Sub1_Sub10_Sub2.method21134();
			} else {
				local110.aClass332_46 = null;
			}
		}
		local110.anInt2883 = 0;
		local110.aByte101 = (byte) arg0;
		local110.aByte102 = (byte) arg0;
		if (client.aClass370_1.method27075().method26504(arg1, arg2)) {
			local110.aByte102++;
		}
		client.aClass370_1.method26950().method28051(arg0, arg1, arg2, local273, local110);
	}

	@OriginalMember(owner = "client!nt", name = "kk", descriptor = "(Lclient!fw;Lclient!fo;B)Lclient!fo;", line = 10198)
	public static final Class178 method26654(@OriginalArg(0) Class186 arg0, @OriginalArg(1) Class178 arg1) {
		if (arg1.anInt3500 * 610124465 != -1) {
			return arg0.method23917(arg1.anInt3500 * 610124465);
		}
		if (!arg0.aBoolean657) {
			@Pc(23) int local23 = arg1.anInt3570 * 954808515 >>> 16;
			@Pc(28) Class582 local28 = new Class582(client.aClass581_22);
			for (@Pc(33) Class3_Sub42 local33 = (Class3_Sub42) local28.method33256(); local33 != null; local33 = (Class3_Sub42) local28.next()) {
				if (local23 == local33.anInt2796 * 1705574607) {
					return Class375.method27235((int) (local33.aLong296 * -1930649055099428229L));
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!nt", name = "akm", descriptor = "(Lclient!vs;I)V", line = 11041)
	static final void method26648(@OriginalArg(0) Class536 arg0) throws Exception_Sub4 {
		arg0.anInt5319 -= 1248498196;
		@Pc(14) float local14 = (float) arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(25) float local25 = (float) arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		@Pc(36) float local36 = (float) arg0.anIntArray496[arg0.anInt5319 * 960738381 + 2];
		@Pc(49) float local49 = (float) arg0.anIntArray496[arg0.anInt5319 * 960738381 + 3] / 1000.0F;
		Class80.aClass23_Sub1_1.method5814(Class320.method25891(local14, local25, local36), local49);
	}

	@OriginalMember(owner = "client!nt", name = "amx", descriptor = "(Lclient!vs;B)V", line = 11254)
	static final void method26650(@OriginalArg(0) Class536 arg0) {
		if (client.aString148 == null) {
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = "";
		} else {
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = client.aString148;
		}
	}
}
