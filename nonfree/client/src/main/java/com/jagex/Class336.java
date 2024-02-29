package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iz")
public class Class336 {

	@OriginalMember(owner = "client!iz", name = "al", descriptor = "[Lclient!cy;")
	static Class83[] aClass83Array7;

	@OriginalMember(owner = "client!iz", name = "p", descriptor = "Lclient!iz;")
	static final Class336 aClass336_3 = new Class336(0);

	@OriginalMember(owner = "client!iz", name = "c", descriptor = "Lclient!iz;")
	static final Class336 aClass336_5 = new Class336(1);

	@OriginalMember(owner = "client!iz", name = "v", descriptor = "Lclient!iz;")
	static final Class336 aClass336_4 = new Class336(2);

	@OriginalMember(owner = "client!iz", name = "l", descriptor = "I")
	int anInt4131;

	@OriginalMember(owner = "client!iz", name = "<init>", descriptor = "(I)V", line = 9)
	Class336(@OriginalArg(0) int arg0) {
		this.anInt4131 = arg0 * 1457557431;
	}

	@OriginalMember(owner = "client!iz", name = "p", descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lclient!yi;I)I", line = 11)
	public static int method27673(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) CharSequence arg1, @OriginalArg(2) Class667 arg2) {
		@Pc(2) int local2 = arg0.length();
		@Pc(5) int local5 = arg1.length();
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		@Pc(11) char local11 = 0;
		@Pc(13) char local13 = 0;
		while (local7 - local11 < local2 || local9 - local13 < local5) {
			if (local7 - local11 >= local2) {
				return -1;
			}
			if (local9 - local13 >= local5) {
				return 1;
			}
			@Pc(43) char local43;
			if (local11 == '\u0000') {
				local43 = arg0.charAt(local7++);
			} else {
				local43 = local11;
				@Pc(45) boolean local45 = false;
			}
			@Pc(56) char local56;
			if (local13 == '\u0000') {
				local56 = arg1.charAt(local9++);
			} else {
				local56 = local13;
				@Pc(58) boolean local58 = false;
			}
			local11 = Class315.method27370(local43);
			local13 = Class315.method27370(local56);
			local43 = Class628.method32546(local43, arg2);
			local56 = Class628.method32546(local56, arg2);
			if (local43 != local56 && Character.toUpperCase(local43) != Character.toUpperCase(local56)) {
				local43 = Character.toLowerCase(local43);
				local56 = Character.toLowerCase(local56);
				if (local43 != local56) {
					return Class477.method29708(local43, arg2) - Class477.method29708(local56, arg2);
				}
			}
		}
		@Pc(114) int local114 = Math.min(local2, local5);
		@Pc(147) char local147;
		@Pc(116) int local116;
		for (local116 = 0; local116 < local114; local116++) {
			if (Class667.aClass667_11 == arg2) {
				local7 = local2 - 1 - local116;
				local9 = local5 - 1 - local116;
			} else {
				local9 = local116;
				local7 = local116;
			}
			@Pc(143) char local143 = arg0.charAt(local7);
			local147 = arg1.charAt(local9);
			if (local143 != local147 && Character.toUpperCase(local143) != Character.toUpperCase(local147)) {
				local143 = Character.toLowerCase(local143);
				local147 = Character.toLowerCase(local147);
				if (local143 != local147) {
					return Class477.method29708(local143, arg2) - Class477.method29708(local147, arg2);
				}
			}
		}
		local116 = local2 - local5;
		if (local116 != 0) {
			return local116;
		}
		for (@Pc(186) int local186 = 0; local186 < local114; local186++) {
			local147 = arg0.charAt(local186);
			@Pc(197) char local197 = arg1.charAt(local186);
			if (local197 != local147) {
				return Class477.method29708(local147, arg2) - Class477.method29708(local197, arg2);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!iz", name = "c", descriptor = "(I)Lclient!iz;", line = 14)
	static Class336 method27674(@OriginalArg(0) int arg0) {
		if (arg0 == aClass336_3.anInt4131 * 1876983303) {
			return aClass336_3;
		} else if (aClass336_5.anInt4131 * 1876983303 == arg0) {
			return aClass336_5;
		} else if (aClass336_4.anInt4131 * 1876983303 == arg0) {
			return aClass336_4;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!iz", name = "v", descriptor = "(I)Lclient!iz;", line = 14)
	static Class336 method27675(@OriginalArg(0) int arg0) {
		if (arg0 == aClass336_3.anInt4131 * 1876983303) {
			return aClass336_3;
		} else if (aClass336_5.anInt4131 * 1876983303 == arg0) {
			return aClass336_5;
		} else if (aClass336_4.anInt4131 * 1876983303 == arg0) {
			return aClass336_4;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!iz", name = "atf", descriptor = "(Lclient!yf;I)V", line = 12863)
	static final void method27676(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		Class303.method27192(6, local13, local23, "");
	}

	@OriginalMember(owner = "client!iz", name = "awo", descriptor = "(Lclient!yf;I)V", line = 13318)
	static final void method27677(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub12_1.method16264(local12);
	}
}
