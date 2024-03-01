package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ts")
public class Class490 {

	@OriginalMember(owner = "client!ts", name = "g", descriptor = "I")
	static final int anInt5195 = -1;

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "I")
	static final int anInt5196 = 1;

	@OriginalMember(owner = "client!ts", name = "p", descriptor = "I")
	static final int anInt5197 = 2;

	@OriginalMember(owner = "client!ts", name = "s", descriptor = "I")
	public static int anInt5198;

	@OriginalMember(owner = "client!ts", name = "hl", descriptor = "Lclient!ty;")
	public static Class494 aClass494_1;

	@OriginalMember(owner = "client!ts", name = "l", descriptor = "Z")
	static boolean aBoolean806 = false;

	@OriginalMember(owner = "client!ts", name = "<init>", descriptor = "()V", line = 17)
	Class490() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!ts", name = "h", descriptor = "([B)Z", line = 27)
	public static boolean method29236(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class3_Sub41 local4 = new Class3_Sub41(arg0);
		@Pc(8) int local8 = local4.method20269();
		if (local8 != 2) {
			return false;
		}
		@Pc(22) boolean local22 = local4.method20269() == 1;
		if (local22) {
			Class483.method29107(local4);
		}
		Class50.method9445(local4);
		return true;
	}

	@OriginalMember(owner = "client!ts", name = "x", descriptor = "([B)Z", line = 27)
	public static boolean method29237(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class3_Sub41 local4 = new Class3_Sub41(arg0);
		@Pc(8) int local8 = local4.method20269();
		if (local8 != 2) {
			return false;
		}
		@Pc(22) boolean local22 = local4.method20269() == 1;
		if (local22) {
			Class483.method29107(local4);
		}
		Class50.method9445(local4);
		return true;
	}

	@OriginalMember(owner = "client!ts", name = "u", descriptor = "(Lclient!ahb;)V", line = 37)
	static void method29239(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(3) int local3 = arg0.method20334();
		Class116.aClass473Array1 = new Class473[local3];
		@Pc(8) int local8;
		for (local8 = 0; local8 < local3; local8++) {
			Class116.aClass473Array1[local8] = new Class473();
			Class116.aClass473Array1[local8].anInt5120 = arg0.method20334() * -22886571;
			Class116.aClass473Array1[local8].aString227 = arg0.method20284();
		}
		Class400.anInt4803 = arg0.method20334() * -223809271;
		anInt5198 = arg0.method20334() * 70043915;
		Class356.anInt4636 = arg0.method20334() * -1496326813;
		Class410.aClass63_Sub1Array1 = new Class63_Sub1[anInt5198 * -830555485 - Class400.anInt4803 * -812257991 + 1];
		for (local8 = 0; local8 < Class356.anInt4636 * 1582861387; local8++) {
			@Pc(75) int local75 = arg0.method20334();
			@Pc(83) Class63_Sub1 local83 = Class410.aClass63_Sub1Array1[local75] = new Class63_Sub1();
			local83.anInt1511 = arg0.method20269() * 613174889;
			local83.anInt1515 = arg0.method20275() * 1960297477;
			local83.anInt1519 = arg0.method20334() * 1846169561;
			if (local83.anInt1519 * 99041385 != 0) {
				local83.aString53 = arg0.method20284();
			}
			local83.anInt1518 = (local75 + Class400.anInt4803 * -812257991) * 1475257131;
			local83.aString51 = arg0.method20284();
			local83.aString52 = arg0.method20284();
		}
		Class3_Sub42_Sub1.anInt2712 = arg0.method20275() * -1634930007;
		aBoolean806 = true;
	}

	@OriginalMember(owner = "client!ts", name = "s", descriptor = "(Lclient!ahb;)V", line = 37)
	static void method29241(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(3) int local3 = arg0.method20334();
		Class116.aClass473Array1 = new Class473[local3];
		@Pc(8) int local8;
		for (local8 = 0; local8 < local3; local8++) {
			Class116.aClass473Array1[local8] = new Class473();
			Class116.aClass473Array1[local8].anInt5120 = arg0.method20334() * -22886571;
			Class116.aClass473Array1[local8].aString227 = arg0.method20284();
		}
		Class400.anInt4803 = arg0.method20334() * -223809271;
		anInt5198 = arg0.method20334() * 70043915;
		Class356.anInt4636 = arg0.method20334() * -1496326813;
		Class410.aClass63_Sub1Array1 = new Class63_Sub1[anInt5198 * -830555485 - Class400.anInt4803 * -812257991 + 1];
		for (local8 = 0; local8 < Class356.anInt4636 * 1582861387; local8++) {
			@Pc(75) int local75 = arg0.method20334();
			@Pc(83) Class63_Sub1 local83 = Class410.aClass63_Sub1Array1[local75] = new Class63_Sub1();
			local83.anInt1511 = arg0.method20269() * 613174889;
			local83.anInt1515 = arg0.method20275() * 1960297477;
			local83.anInt1519 = arg0.method20334() * 1846169561;
			if (local83.anInt1519 * 99041385 != 0) {
				local83.aString53 = arg0.method20284();
			}
			local83.anInt1518 = (local75 + Class400.anInt4803 * -812257991) * 1475257131;
			local83.aString51 = arg0.method20284();
			local83.aString52 = arg0.method20284();
		}
		Class3_Sub42_Sub1.anInt2712 = arg0.method20275() * -1634930007;
		aBoolean806 = true;
	}

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(Lclient!ahb;)V", line = 66)
	static void method29238(@OriginalArg(0) Class3_Sub41 arg0) {
		for (@Pc(1) int local1 = 0; local1 < Class356.anInt4636 * 1582861387; local1++) {
			@Pc(10) int local10 = arg0.method20334();
			@Pc(14) int local14 = arg0.method20271();
			if (local14 == 65535) {
				local14 = -1;
			}
			if (Class410.aClass63_Sub1Array1[local10] != null) {
				Class410.aClass63_Sub1Array1[local10].anInt1512 = local14 * 1271373117;
			}
		}
	}

	@OriginalMember(owner = "client!ts", name = "y", descriptor = "(Lclient!ahb;)V", line = 66)
	static void method29240(@OriginalArg(0) Class3_Sub41 arg0) {
		for (@Pc(1) int local1 = 0; local1 < Class356.anInt4636 * 1582861387; local1++) {
			@Pc(10) int local10 = arg0.method20334();
			@Pc(14) int local14 = arg0.method20271();
			if (local14 == 65535) {
				local14 = -1;
			}
			if (Class410.aClass63_Sub1Array1[local10] != null) {
				Class410.aClass63_Sub1Array1[local10].anInt1512 = local14 * 1271373117;
			}
		}
	}

	@OriginalMember(owner = "client!ts", name = "as", descriptor = "(B)V", line = 788)
	public static final void method29245() {
		Class160.anImage4 = null;
		Class410.aFont2 = null;
	}

	@OriginalMember(owner = "client!ts", name = "hj", descriptor = "(Lclient!vs;I)V", line = 5494)
	static final void method29242(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class85.method21635(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!ts", name = "akc", descriptor = "(Lclient!vs;I)V", line = 11082)
	static final void method29243(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class72.anInt2086 * 81180077 == 3 ? 1 : 0;
	}

	@OriginalMember(owner = "client!ts", name = "lj", descriptor = "(Lclient!ahi;ZZB)V", line = 11272)
	public static final void method29244(@OriginalArg(0) Class3_Sub42 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		@Pc(4) int local4 = arg0.anInt2796 * 1705574607;
		@Pc(10) int local10 = (int) (arg0.aLong296 * -1930649055099428229L);
		arg0.method33656();
		if (arg1) {
			Class467.method28739(local4);
		}
		Class270.method25290(local4);
		@Pc(25) Class178 local25 = Class375.method27235(local10);
		if (local25 != null) {
			Class223.method24442(local25);
		}
		Class60.method14617();
		if (!arg2 && client.anInt3125 * -1579500007 != -1) {
			Class60_Sub15.method13525(client.anInt3125 * -1579500007, 1);
		}
		@Pc(51) Class582 local51 = new Class582(client.aClass581_22);
		for (@Pc(56) Class3_Sub42 local56 = (Class3_Sub42) local51.method33256(); local56 != null; local56 = (Class3_Sub42) local51.next()) {
			if (!local56.method33657()) {
				local56 = (Class3_Sub42) local51.method33256();
				if (local56 == null) {
					break;
				}
			}
			if (local56.anInt2797 * 961996397 == 3) {
				@Pc(84) int local84 = (int) (local56.aLong296 * -1930649055099428229L);
				if (local84 >>> 16 == local4) {
					method29244(local56, true, arg2);
				}
			}
		}
	}
}
