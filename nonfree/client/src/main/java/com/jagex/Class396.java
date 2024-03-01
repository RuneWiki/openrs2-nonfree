package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pq")
public class Class396 {

	@OriginalMember(owner = "client!pq", name = "n", descriptor = "I")
	public static final int anInt4775 = 29;

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "I")
	public static final int anInt4776 = -3;

	@OriginalMember(owner = "client!pq", name = "g", descriptor = "I")
	public static final int anInt4777 = -4;

	@OriginalMember(owner = "client!pq", name = "h", descriptor = "I")
	public static final int anInt4778 = 1;

	@OriginalMember(owner = "client!pq", name = "l", descriptor = "I")
	public static final int anInt4779 = -5;

	@OriginalMember(owner = "client!pq", name = "p", descriptor = "I")
	public static final int anInt4780 = -2;

	@OriginalMember(owner = "client!pq", name = "s", descriptor = "I")
	public static final int anInt4781 = 3;

	@OriginalMember(owner = "client!pq", name = "u", descriptor = "I")
	public static final int anInt4782 = 6;

	@OriginalMember(owner = "client!pq", name = "y", descriptor = "I")
	public static final int anInt4783 = 7;

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "I")
	public static final int anInt4784 = 9;

	@OriginalMember(owner = "client!pq", name = "c", descriptor = "I")
	public static final int anInt4785 = 15;

	@OriginalMember(owner = "client!pq", name = "z", descriptor = "I")
	public static final int anInt4786 = 21;

	@OriginalMember(owner = "client!pq", name = "d", descriptor = "I")
	public static final int anInt4787 = 45;

	@OriginalMember(owner = "client!pq", name = "x", descriptor = "I")
	public static final int anInt4788 = 2;

	@OriginalMember(owner = "client!pq", name = "e", descriptor = "I")
	public static final int anInt4789 = 35;

	@OriginalMember(owner = "client!pq", name = "r", descriptor = "I")
	public static final int anInt4790 = 42;

	@OriginalMember(owner = "client!pq", name = "j", descriptor = "I")
	public static final int anInt4791 = 23;

	@OriginalMember(owner = "client!pq", name = "q", descriptor = "I")
	public static final int anInt4792 = 48;

	@OriginalMember(owner = "client!pq", name = "m", descriptor = "I")
	public static final int anInt4793 = 49;

	@OriginalMember(owner = "client!pq", name = "v", descriptor = "I")
	public static final int anInt4794 = 52;

	@OriginalMember(owner = "client!pq", name = "t", descriptor = "I")
	public static final int anInt4795 = 53;

	@OriginalMember(owner = "client!pq", name = "<init>", descriptor = "()V", line = 26)
	Class396() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!pq", name = "g", descriptor = "(Ljava/lang/String;II)V", line = 64)
	public static void method27510(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Class570.aClass585_5 == null) {
			Class570.aClass585_5 = new Class585();
		}
		Class570.aClass585_5.aString242 = arg0;
		Class570.aClass585_5.anInt5458 = (arg1 + 1099) * 664190749;
		Class570.aClass585_5.anInt5459 = Class570.aClass585_5.anInt5458 * -1027819553 + 117580992;
		Class570.aClass585_5.anInt5457 = Class570.aClass585_5.anInt5458 * 550241065 + -147881328;
	}

	@OriginalMember(owner = "client!pq", name = "bo", descriptor = "(Lclient!aml;IIB)V", line = 1620)
	static void method27512(@OriginalArg(0) Class3_Sub1_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == null || arg0 == Class250.aClass553_52.aClass3_238) {
			return;
		}
		@Pc(11) int local11 = arg0.anInt2666 * -1395715137;
		@Pc(16) int local16 = arg0.anInt2667 * -1827938669;
		@Pc(21) int local21 = arg0.anInt2664 * 296027207;
		@Pc(27) int local27 = (int) (arg0.aLong154 * -8018265419264301651L);
		@Pc(32) long local32 = arg0.aLong154 * -8018265419264301651L;
		if (local21 >= 2000) {
			local21 -= 2000;
		}
		@Pc(40) Class464 local40 = client.aClass370_1.method26942();
		@Pc(42) Class311 local42 = null;
		if (local21 == 9) {
			local42 = Class311.aClass311_34;
		} else if (local21 == 10) {
			local42 = Class311.aClass311_30;
		} else if (local21 == 11) {
			local42 = Class311.aClass311_107;
		} else if (local21 == 12) {
			local42 = Class311.aClass311_121;
		} else if (local21 == 13) {
			local42 = Class311.aClass311_113;
		} else if (local21 == 1003) {
			local42 = Class311.aClass311_38;
		}
		@Pc(109) Class3_Sub23 local109;
		if (local42 != null) {
			@Pc(85) Class3_Sub29 local85 = (Class3_Sub29) client.aClass581_21.method33217((long) local27);
			if (local85 != null) {
				@Pc(91) Class26_Sub1_Sub1_Sub1_Sub1 local91 = (Class26_Sub1_Sub1_Sub1_Sub1) local85.anObject2;
				client.anInt3059 = arg1 * 448721427;
				client.anInt3117 = arg2 * 837432027;
				client.anInt3105 = -1827817306;
				client.anInt3104 = 0;
				local109 = Class269.method25284(local42, client.aClass82_2.aClass577_2);
				local109.aClass3_Sub41_Sub1_1.method20251(local27);
				local109.aClass3_Sub41_Sub1_1.method20301(Class402.method27617() ? 1 : 0);
				client.aClass82_2.method21601(local109);
				Class441.method28249(local91.anIntArray241[0], local91.anIntArray239[0]);
			}
		}
		@Pc(159) Class3_Sub23 local159;
		if (local21 == 59) {
			client.anInt3059 = arg1 * 448721427;
			client.anInt3117 = arg2 * 837432027;
			client.anInt3105 = 1233574995;
			client.anInt3104 = 0;
			local159 = Class269.method25284(Class311.aClass311_93, client.aClass82_2.aClass577_2);
			local159.aClass3_Sub41_Sub1_1.method20318(client.anInt3122 * -2059988435);
			local159.aClass3_Sub41_Sub1_1.method20251(local11 + local40.anInt5071 * -1567811631);
			local159.aClass3_Sub41_Sub1_1.method20353(Class616.anInt5552 * -944851473);
			local159.aClass3_Sub41_Sub1_1.method20251(local40.anInt5073 * 1360175441 + local16);
			local159.aClass3_Sub41_Sub1_1.method20251(client.anInt3123 * -31457453);
			client.aClass82_2.method21601(local159);
			Class441.method28249(local11, local16);
		}
		if (local21 == 16) {
			client.anInt3059 = arg1 * 448721427;
			client.anInt3117 = arg2 * 837432027;
			client.anInt3105 = -1827817306;
			client.anInt3104 = 0;
			local159 = Class269.method25284(Class311.aClass311_29, client.aClass82_2.aClass577_2);
			local159.aClass3_Sub41_Sub1_1.method20318(client.anInt3122 * -2059988435);
			local159.aClass3_Sub41_Sub1_1.method20287(Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.anInt2355 * 144783765);
			local159.aClass3_Sub41_Sub1_1.method20318(client.anInt3123 * -31457453);
			local159.aClass3_Sub41_Sub1_1.method20322(Class616.anInt5552 * -944851473);
			local159.aClass3_Sub41_Sub1_1.method20250(Class402.method27617() ? 1 : 0);
			client.aClass82_2.method21601(local159);
		}
		if (local21 == 2) {
			client.anInt3059 = arg1 * 448721427;
			client.anInt3117 = arg2 * 837432027;
			client.anInt3105 = -1827817306;
			client.anInt3104 = 0;
			local159 = Class269.method25284(Class311.aClass311_105, client.aClass82_2.aClass577_2);
			local159.aClass3_Sub41_Sub1_1.method20251(local40.anInt5073 * 1360175441 + local16);
			local159.aClass3_Sub41_Sub1_1.method20287(client.anInt3123 * -31457453);
			local159.aClass3_Sub41_Sub1_1.method20353((int) (local32 >>> 32) & Integer.MAX_VALUE);
			local159.aClass3_Sub41_Sub1_1.method20254(Class616.anInt5552 * -944851473);
			local159.aClass3_Sub41_Sub1_1.method20287(client.anInt3122 * -2059988435);
			local159.aClass3_Sub41_Sub1_1.method20303(Class402.method27617() ? 1 : 0);
			local159.aClass3_Sub41_Sub1_1.method20312(local40.anInt5071 * -1567811631 + local11);
			client.aClass82_2.method21601(local159);
			Class441.method28249(local11, local16);
		}
		@Pc(370) Class178 local370;
		if (local21 == 58) {
			local370 = Class11_Sub2.method1219(local16, local11);
			if (local370 != null) {
				Class133.method22905(local370);
			}
		}
		if (local21 == 25) {
			local370 = Class11_Sub2.method1219(local16, local11);
			if (local370 != null) {
				Class44_Sub2.method15142();
				@Pc(391) Class3_Sub38 local391 = client.method22372(local370);
				Class497.method29339(local370, local391.method11806(), local391.anInt1354 * -1720854183);
				client.aString153 = Class497.method29342(local370);
				if (client.aString153 == null) {
					client.aString153 = "Null";
				}
				client.aString152 = local370.aString170 + Class271.method25310(16777215);
			}
			return;
		}
		@Pc(425) Class311 local425 = null;
		if (local21 == 44) {
			local425 = Class311.aClass311_28;
		} else if (local21 == 45) {
			local425 = Class311.aClass311_78;
		} else if (local21 == 46) {
			local425 = Class311.aClass311_99;
		} else if (local21 == 47) {
			local425 = Class311.aClass311_40;
		} else if (local21 == 48) {
			local425 = Class311.aClass311_43;
		} else if (local21 == 49) {
			local425 = Class311.aClass311_32;
		} else if (local21 == 50) {
			local425 = Class311.aClass311_72;
		} else if (local21 == 51) {
			local425 = Class311.aClass311_91;
		} else if (local21 == 52) {
			local425 = Class311.aClass311_66;
		} else if (local21 == 53) {
			local425 = Class311.aClass311_55;
		}
		@Pc(490) Class26_Sub1_Sub1_Sub1_Sub2 local490;
		if (local425 != null) {
			local490 = client.aClass26_Sub1_Sub1_Sub1_Sub2Array1[local27];
			if (local490 != null) {
				client.anInt3059 = arg1 * 448721427;
				client.anInt3117 = arg2 * 837432027;
				client.anInt3105 = -1827817306;
				client.anInt3104 = 0;
				local109 = Class269.method25284(local425, client.aClass82_2.aClass577_2);
				local109.aClass3_Sub41_Sub1_1.method20301(Class402.method27617() ? 1 : 0);
				local109.aClass3_Sub41_Sub1_1.method20312(local27);
				client.aClass82_2.method21601(local109);
				Class441.method28249(local490.anIntArray241[0], local490.anIntArray239[0]);
			}
		}
		if (local21 == 15) {
			local490 = client.aClass26_Sub1_Sub1_Sub1_Sub2Array1[local27];
			if (local490 != null) {
				client.anInt3059 = arg1 * 448721427;
				client.anInt3117 = arg2 * 837432027;
				client.anInt3105 = -1827817306;
				client.anInt3104 = 0;
				local109 = Class269.method25284(Class311.aClass311_29, client.aClass82_2.aClass577_2);
				local109.aClass3_Sub41_Sub1_1.method20318(client.anInt3122 * -2059988435);
				local109.aClass3_Sub41_Sub1_1.method20287(local27);
				local109.aClass3_Sub41_Sub1_1.method20318(client.anInt3123 * -31457453);
				local109.aClass3_Sub41_Sub1_1.method20322(Class616.anInt5552 * -944851473);
				local109.aClass3_Sub41_Sub1_1.method20250(Class402.method27617() ? 1 : 0);
				client.aClass82_2.method21601(local109);
				Class441.method28249(local490.anIntArray241[0], local490.anIntArray239[0]);
			}
		}
		if (local21 == 30 && client.aClass178_10 == null) {
			Class64.method13092(local16, local11);
			client.aClass178_10 = Class11_Sub2.method1219(local16, local11);
			if (client.aClass178_10 != null) {
				Class223.method24442(client.aClass178_10);
			}
		}
		@Pc(638) Class311 local638 = null;
		if (local21 == 3) {
			local638 = Class311.aClass311_75;
		} else if (local21 == 4) {
			local638 = Class311.aClass311_57;
		} else if (local21 == 5) {
			local638 = Class311.aClass311_64;
		} else if (local21 == 6) {
			local638 = Class311.aClass311_116;
		} else if (local21 == 1001) {
			local638 = Class311.aClass311_44;
		} else if (local21 == 1002) {
			local638 = Class311.aClass311_81;
		}
		if (local638 != null) {
			client.anInt3059 = arg1 * 448721427;
			client.anInt3117 = arg2 * 837432027;
			client.anInt3105 = -1827817306;
			client.anInt3104 = 0;
			local109 = Class269.method25284(local638, client.aClass82_2.aClass577_2);
			local109.aClass3_Sub41_Sub1_1.method20250(Class402.method27617() ? 1 : 0);
			local109.aClass3_Sub41_Sub1_1.method20312(local40.anInt5071 * -1567811631 + local11);
			local109.aClass3_Sub41_Sub1_1.method20353((int) (local32 >>> 32) & Integer.MAX_VALUE);
			local109.aClass3_Sub41_Sub1_1.method20318(local16 + local40.anInt5073 * 1360175441);
			client.aClass82_2.method21601(local109);
			Class441.method28249(local11, local16);
		}
		if (local21 == 23) {
			if (client.anInt3116 * -1336253523 > 0 && Class529.method32460()) {
				Class194.method24081(Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aByte101, local11 + local40.anInt5071 * -1567811631, local40.anInt5073 * 1360175441 + local16);
			} else {
				local109 = Class245.method24869(local11, local16, local27);
				if (local27 == 1) {
					local109.aClass3_Sub41_Sub1_1.method20250(-1);
					local109.aClass3_Sub41_Sub1_1.method20250(-1);
					local109.aClass3_Sub41_Sub1_1.method20251((int) client.aFloat238);
					local109.aClass3_Sub41_Sub1_1.method20250(57);
					local109.aClass3_Sub41_Sub1_1.method20250(client.anInt3081 * 732347007);
					local109.aClass3_Sub41_Sub1_1.method20250(client.anInt3083 * 1898621565);
					local109.aClass3_Sub41_Sub1_1.method20250(89);
					@Pc(821) Class320 local821 = Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.method21431().aClass320_61;
					local109.aClass3_Sub41_Sub1_1.method20251((int) local821.aFloat259);
					local109.aClass3_Sub41_Sub1_1.method20251((int) local821.aFloat261);
					local109.aClass3_Sub41_Sub1_1.method20250(63);
				} else {
					client.anInt3059 = arg1 * 448721427;
					client.anInt3117 = arg2 * 837432027;
					client.anInt3105 = 1233574995;
					client.anInt3104 = 0;
				}
				client.aClass82_2.method21601(local109);
				Class441.method28249(local11, local16);
			}
		}
		if (local21 == 60) {
			if (client.anInt3116 * -1336253523 > 0 && Class529.method32460()) {
				Class194.method24081(Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aByte101, local40.anInt5071 * -1567811631 + local11, local16 + local40.anInt5073 * 1360175441);
			} else {
				client.anInt3059 = arg1 * 448721427;
				client.anInt3117 = arg2 * 837432027;
				client.anInt3105 = 1233574995;
				client.anInt3104 = 0;
				local109 = Class269.method25284(Class311.aClass311_69, client.aClass82_2.aClass577_2);
				local109.aClass3_Sub41_Sub1_1.method20251(local16 + local40.anInt5073 * 1360175441);
				local109.aClass3_Sub41_Sub1_1.method20287(local11 + local40.anInt5071 * -1567811631);
				client.aClass82_2.method21601(local109);
			}
		}
		if (local21 == 1008 || local21 == 1009 || local21 == 1010 || local21 == 1011 || local21 == 1012) {
			Class3_Sub21.method11424(local21, local27, local11);
		}
		@Pc(952) Class311 local952 = null;
		if (local21 == 18) {
			local952 = Class311.aClass311_98;
		} else if (local21 == 19) {
			local952 = Class311.aClass311_100;
		} else if (local21 == 20) {
			local952 = Class311.aClass311_97;
		} else if (local21 == 21) {
			local952 = Class311.aClass311_111;
		} else if (local21 == 22) {
			local952 = Class311.aClass311_92;
		} else if (local21 == 1004) {
			local952 = Class311.aClass311_103;
		}
		@Pc(1007) Class3_Sub23 local1007;
		if (local952 != null) {
			client.anInt3059 = arg1 * 448721427;
			client.anInt3117 = arg2 * 837432027;
			client.anInt3105 = -1827817306;
			client.anInt3104 = 0;
			local1007 = Class269.method25284(local952, client.aClass82_2.aClass577_2);
			local1007.aClass3_Sub41_Sub1_1.method20318(local40.anInt5073 * 1360175441 + local16);
			local1007.aClass3_Sub41_Sub1_1.method20318(local27);
			local1007.aClass3_Sub41_Sub1_1.method20303(Class402.method27617() ? 1 : 0);
			local1007.aClass3_Sub41_Sub1_1.method20287(local11 + local40.anInt5071 * -1567811631);
			client.aClass82_2.method21601(local1007);
			Class441.method28249(local11, local16);
		}
		if (local21 == 57 || local21 == 1007) {
			Class586.method33284(local27, local16, local11, arg0.aString109);
		}
		if (local21 == 17) {
			client.anInt3059 = arg1 * 448721427;
			client.anInt3117 = arg2 * 837432027;
			client.anInt3105 = -1827817306;
			client.anInt3104 = 0;
			local1007 = Class269.method25284(Class311.aClass311_27, client.aClass82_2.aClass577_2);
			local1007.aClass3_Sub41_Sub1_1.method20277(Class616.anInt5552 * -944851473);
			local1007.aClass3_Sub41_Sub1_1.method20301(Class402.method27617() ? 1 : 0);
			local1007.aClass3_Sub41_Sub1_1.method20287(local27);
			local1007.aClass3_Sub41_Sub1_1.method20287(local40.anInt5071 * -1567811631 + local11);
			local1007.aClass3_Sub41_Sub1_1.method20312(local40.anInt5073 * 1360175441 + local16);
			local1007.aClass3_Sub41_Sub1_1.method20312(client.anInt3122 * -2059988435);
			local1007.aClass3_Sub41_Sub1_1.method20287(client.anInt3123 * -31457453);
			client.aClass82_2.method21601(local1007);
			Class441.method28249(local11, local16);
		}
		if (local21 == 8) {
			@Pc(1157) Class3_Sub29 local1157 = (Class3_Sub29) client.aClass581_21.method33217((long) local27);
			if (local1157 != null) {
				@Pc(1163) Class26_Sub1_Sub1_Sub1_Sub1 local1163 = (Class26_Sub1_Sub1_Sub1_Sub1) local1157.anObject2;
				client.anInt3059 = arg1 * 448721427;
				client.anInt3117 = arg2 * 837432027;
				client.anInt3105 = -1827817306;
				client.anInt3104 = 0;
				@Pc(1181) Class3_Sub23 local1181 = Class269.method25284(Class311.aClass311_56, client.aClass82_2.aClass577_2);
				local1181.aClass3_Sub41_Sub1_1.method20287(client.anInt3123 * -31457453);
				local1181.aClass3_Sub41_Sub1_1.method20254(Class616.anInt5552 * -944851473);
				local1181.aClass3_Sub41_Sub1_1.method20312(client.anInt3122 * -2059988435);
				local1181.aClass3_Sub41_Sub1_1.method20287(local27);
				local1181.aClass3_Sub41_Sub1_1.method20302(Class402.method27617() ? 1 : 0);
				client.aClass82_2.method21601(local1181);
				Class441.method28249(local1163.anIntArray241[0], local1163.anIntArray239[0]);
			}
		}
		if (client.aBoolean596) {
			Class44_Sub2.method15142();
		}
		if (Class485.aClass178_17 != null && client.anInt3106 * 1922542959 == 0) {
			Class223.method24442(Class485.aClass178_17);
		}
	}

	@OriginalMember(owner = "client!pq", name = "jr", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;I)V", line = 5783)
	static final void method27505(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		arg0.aString171 = (String) arg2.anObjectArray42[(arg2.anInt5315 -= 790013775) * 996806575];
	}

	@OriginalMember(owner = "client!pq", name = "ra", descriptor = "(Lclient!vs;I)V", line = 7240)
	static final void method27506(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local16.anInt3498 * -1494060731;
	}

	@OriginalMember(owner = "client!pq", name = "aiy", descriptor = "(Lclient!vs;B)V", line = 10469)
	static final void method27507(@OriginalArg(0) Class536 arg0) {
		Class300.aClass300_4.method25643();
	}

	@OriginalMember(owner = "client!pq", name = "amb", descriptor = "(Lclient!vs;I)V", line = 11277)
	static final void method27511(@OriginalArg(0) Class536 arg0) {
		@Pc(17) boolean local17 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381] == 1;
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub21_1, local17 ? 2 : 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub21_2, local17 ? 2 : 1);
		Class43_Sub5.method9508();
		Class26_Sub1_Sub1_Sub1.method16728();
		client.aBoolean573 = false;
	}

	@OriginalMember(owner = "client!pq", name = "aqo", descriptor = "(Lclient!vs;I)V", line = 12005)
	static final void method27508(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 936373647;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		@Pc(33) int local33 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 2];
		Class586.method33284(6, local13 << 16 | local23, local33, "");
	}

	@OriginalMember(owner = "client!pq", name = "arh", descriptor = "(Lclient!vs;I)V", line = 12073)
	static final void method27509(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class525.anInt5300 * -1623735481;
	}
}
