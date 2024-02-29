package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!np")
public class Class426 {

	@OriginalMember(owner = "client!np", name = "p", descriptor = "I")
	static final int anInt4811 = 3;

	@OriginalMember(owner = "client!np", name = "c", descriptor = "I")
	static final int anInt4812 = 9;

	@OriginalMember(owner = "client!np", name = "v", descriptor = "I")
	static final int anInt4813 = 1;

	@OriginalMember(owner = "client!np", name = "l", descriptor = "I")
	static final int anInt4814 = 5;

	@OriginalMember(owner = "client!np", name = "w", descriptor = "I")
	static final int anInt4815 = 2;

	@OriginalMember(owner = "client!np", name = "s", descriptor = "I")
	static final int anInt4816 = 12;

	@OriginalMember(owner = "client!np", name = "t", descriptor = "I")
	static final int anInt4817 = 4;

	@OriginalMember(owner = "client!np", name = "q", descriptor = "I")
	static final int anInt4818 = 7;

	@OriginalMember(owner = "client!np", name = "d", descriptor = "I")
	static final int anInt4819 = 6;

	@OriginalMember(owner = "client!np", name = "x", descriptor = "I")
	static final int anInt4820 = 8;

	@OriginalMember(owner = "client!np", name = "y", descriptor = "I")
	static final int anInt4821 = 13;

	@OriginalMember(owner = "client!np", name = "r", descriptor = "I")
	static final int anInt4822 = 11;

	@OriginalMember(owner = "client!np", name = "g", descriptor = "I")
	static final int anInt4823 = 10;

	@OriginalMember(owner = "client!np", name = "<init>", descriptor = "()V", line = 18)
	Class426() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!np", name = "l", descriptor = "([J[II)V", line = 74)
	public static void method28770(@OriginalArg(0) long[] arg0, @OriginalArg(1) int[] arg1) {
		Class16.method277(arg0, arg1, 0, arg0.length - 1);
	}

	@OriginalMember(owner = "client!np", name = "ap", descriptor = "(Lclient!dx;B)V", line = 1187)
	static void method28771(@OriginalArg(0) Class86 arg0) {
		@Pc(1) int local1 = -10660793;
		Class243.method26099(arg0, Class624.anInt5644 * -620506573, Class683.anInt5836 * -260575397, Class639.anInt5719 * -1739196959, Class100_Sub1.anInt946 * -577412881, local1, -16777216);
		Class260.aClass94_8.method7602(Class44.aClass44_9.method713(Class128.aClass667_3), Class624.anInt5644 * -620506573 + 3, Class683.anInt5836 * -260575397 + 14, local1, -1);
		@Pc(41) int local41 = Class60.aClass138_1.method14234();
		@Pc(45) int local45 = Class60.aClass138_1.method14225();
		@Pc(49) int local49;
		@Pc(54) Class77_Sub1_Sub7 local54;
		@Pc(75) int local75;
		if (!Class683.aBoolean862) {
			local49 = 0;
			for (local54 = (Class77_Sub1_Sub7) Class683.aClass695_55.method36395(); local54 != null; local54 = (Class77_Sub1_Sub7) Class683.aClass695_55.method36406()) {
				local75 = (Class683.anInt5826 * 324852453 - 1 - local49) * -238165825 * Class683.anInt5819 + 31 + Class683.anInt5836 * -260575397;
				Class66.method953(local41, local45, Class624.anInt5644 * -620506573, Class683.anInt5836 * -260575397, Class639.anInt5719 * -1739196959, Class100_Sub1.anInt946 * -577412881, local75, local54, Class260.aClass94_8, Class346.aClass17_12, -1, -256);
				local49++;
			}
			return;
		}
		local49 = 0;
		for (@Pc(112) Class77_Sub1_Sub11 local112 = (Class77_Sub1_Sub11) Class683.aClass691_17.method36335(); local112 != null; local112 = (Class77_Sub1_Sub11) Class683.aClass691_17.method36340()) {
			local75 = Class683.anInt5836 * -260575397 + 31 + Class683.anInt5819 * -238165825 * local49;
			if (local112.anInt3023 * -475442105 == 1) {
				Class66.method953(local41, local45, Class624.anInt5644 * -620506573, Class683.anInt5836 * -260575397, Class639.anInt5719 * -1739196959, Class100_Sub1.anInt946 * -577412881, local75, (Class77_Sub1_Sub7) local112.aClass691_11.aClass77_Sub1_66.aClass77_Sub1_62, Class260.aClass94_8, Class346.aClass17_12, -1, -256);
			} else {
				Class131_Sub3.method13095(local41, local45, Class624.anInt5644 * -620506573, Class683.anInt5836 * -260575397, Class639.anInt5719 * -1739196959, Class100_Sub1.anInt946 * -577412881, local75, local112, Class260.aClass94_8, Class346.aClass17_12, -1, -256);
			}
			local49++;
		}
		if (Class683.aClass77_Sub1_Sub11_1 == null) {
			return;
		}
		Class243.method26099(arg0, Class155.anInt3189 * -1803884121, Class75.anInt224 * 892411561, Class131_Sub3.anInt1436 * -2123561997, Class102.anInt955 * -417346889, local1, -16777216);
		Class260.aClass94_8.method7602(Class683.aClass77_Sub1_Sub11_1.aString107, Class155.anInt3189 * -1803884121 + 3, Class75.anInt224 * 892411561 + 14, local1, -1);
		local49 = 0;
		for (local54 = (Class77_Sub1_Sub7) Class683.aClass77_Sub1_Sub11_1.aClass691_11.method36335(); local54 != null; local54 = (Class77_Sub1_Sub7) Class683.aClass77_Sub1_Sub11_1.aClass691_11.method36340()) {
			local75 = Class683.anInt5819 * -238165825 * local49 + Class75.anInt224 * 892411561 + 31;
			Class66.method953(local41, local45, Class155.anInt3189 * -1803884121, Class75.anInt224 * 892411561, Class131_Sub3.anInt1436 * -2123561997, Class102.anInt955 * -417346889, local75, local54, Class260.aClass94_8, Class346.aClass17_12, -1, -256);
			local49++;
		}
	}

	@OriginalMember(owner = "client!np", name = "tv", descriptor = "(Lclient!yf;B)V", line = 7980)
	static final void method28772(@OriginalArg(0) Class665 arg0) {
		@Pc(14) Class277 local14 = Class155.method23628(arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307]);
		if (local14.aClass277Array3 == null) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
			return;
		}
		@Pc(38) int local38 = local14.aClass277Array3.length;
		for (@Pc(40) int local40 = 0; local40 < local14.aClass277Array3.length; local40++) {
			if (local14.aClass277Array3[local40] == null) {
				local38 = local40;
				break;
			}
		}
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local38;
	}

	@OriginalMember(owner = "client!np", name = "aef", descriptor = "(Lclient!yf;B)V", line = 9979)
	static final void method28773(@OriginalArg(0) Class665 arg0) {
		if (Class239.anIntArray383 == null || Class368.anInt4556 * -472703619 >= Class239.anIntArray383.length) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = -1;
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class239.anIntArray383[(Class368.anInt4556 += 1476395989) * -472703619 - 1] & 0xFFFF;
		}
	}

	@OriginalMember(owner = "client!np", name = "akx", descriptor = "(Lclient!yf;I)V", line = 11362)
	static final void method28774(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(18) int local18 = local12 >> 14 & 0x3FFF;
		@Pc(22) int local22 = local12 & 0x3FFF;
		@Pc(26) Class595 local26 = client.aClass517_1.method30409();
		local18 -= local26.anInt5504 * -424199969;
		if (local18 < 0) {
			local18 = 0;
		} else if (local18 >= client.aClass517_1.method30411()) {
			local18 = client.aClass517_1.method30411();
		}
		local22 -= local26.anInt5506 * -1166289421;
		if (local22 < 0) {
			local22 = 0;
		} else if (local22 >= client.aClass517_1.method30417()) {
			local22 = client.aClass517_1.method30417();
		}
		client.anInt3432 = ((local18 << 9) + 256) * 711878257;
		client.anInt3433 = ((local22 << 9) + 256) * -1949606641;
		Class11.anInt36 = -520252003;
		Class142.anInt2017 = 309821991;
		Class70.anInt203 = 1899572639;
		client.aBoolean612 = true;
	}
}
