package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afk")
public final class Class3_Sub7 extends Class3 {

	@OriginalMember(owner = "client!afk", name = "d", descriptor = "Lclient!wk;")
	public static Class553 aClass553_15 = new Class553();

	@OriginalMember(owner = "client!afk", name = "q", descriptor = "Lclient!wk;")
	public static Class553 aClass553_16 = new Class553();

	@OriginalMember(owner = "client!afk", name = "m", descriptor = "J")
	static long aLong46 = -3204532312793950317L;

	@OriginalMember(owner = "client!afk", name = "c", descriptor = "I")
	public int anInt1182;

	@OriginalMember(owner = "client!afk", name = "h", descriptor = "I")
	int anInt1183;

	@OriginalMember(owner = "client!afk", name = "x", descriptor = "I")
	public int anInt1184;

	@OriginalMember(owner = "client!afk", name = "u", descriptor = "I")
	int anInt1185;

	@OriginalMember(owner = "client!afk", name = "y", descriptor = "I")
	int anInt1186;

	@OriginalMember(owner = "client!afk", name = "s", descriptor = "I")
	public int anInt1187;

	@OriginalMember(owner = "client!afk", name = "z", descriptor = "I")
	public int anInt1188;

	@OriginalMember(owner = "client!afk", name = "j", descriptor = "I")
	int anInt1189;

	@OriginalMember(owner = "client!afk", name = "n", descriptor = "Lclient!sp;")
	Class462 aClass462_1;

	@OriginalMember(owner = "client!afk", name = "b", descriptor = "I")
	int anInt1190;

	@OriginalMember(owner = "client!afk", name = "l", descriptor = "I")
	int anInt1191;

	@OriginalMember(owner = "client!afk", name = "e", descriptor = "Z")
	boolean aBoolean255 = true;

	@OriginalMember(owner = "client!afk", name = "r", descriptor = "Z")
	boolean aBoolean256 = false;

	@OriginalMember(owner = "client!afk", name = "<init>", descriptor = "()V", line = 32)
	Class3_Sub7() {
	}

	@OriginalMember(owner = "client!afk", name = "b", descriptor = "(IIIIIII)V", line = 35)
	public static void method10304(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) Class3_Sub7 local1 = null;
		for (@Pc(6) Class3_Sub7 local6 = (Class3_Sub7) aClass553_15.method32768(); local6 != null; local6 = (Class3_Sub7) aClass553_15.method32709()) {
			if (local6.anInt1191 * -53574091 == arg0 && arg1 == local6.anInt1187 * -1303695121 && local6.anInt1184 * -2103701847 == arg2 && arg3 == local6.anInt1183 * 1349018393) {
				local1 = local6;
				break;
			}
		}
		if (local1 == null) {
			local1 = new Class3_Sub7();
			local1.anInt1191 = arg0 * 1473846301;
			local1.anInt1183 = arg3 * 1240877353;
			local1.anInt1187 = arg1 * 665189903;
			local1.anInt1184 = arg2 * 449344921;
			if (arg1 >= 0 && arg2 >= 0 && arg1 < client.aClass370_1.method26943() && arg2 < client.aClass370_1.method27062()) {
				Class534.method32526(local1);
			}
			aClass553_15.method32702(local1);
		}
		local1.anInt1182 = arg4 * -1796345009;
		local1.anInt1189 = arg5 * 1753941885;
		local1.anInt1188 = arg6 * 2047985235;
		local1.aBoolean255 = true;
		local1.aBoolean256 = false;
	}

	@OriginalMember(owner = "client!afk", name = "y", descriptor = "(IIIIIII)V", line = 35)
	public static void method10309(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) Class3_Sub7 local1 = null;
		for (@Pc(6) Class3_Sub7 local6 = (Class3_Sub7) aClass553_15.method32768(); local6 != null; local6 = (Class3_Sub7) aClass553_15.method32709()) {
			if (local6.anInt1191 * -53574091 == arg0 && arg1 == local6.anInt1187 * -1303695121 && local6.anInt1184 * -2103701847 == arg2 && arg3 == local6.anInt1183 * 1349018393) {
				local1 = local6;
				break;
			}
		}
		if (local1 == null) {
			local1 = new Class3_Sub7();
			local1.anInt1191 = arg0 * 1473846301;
			local1.anInt1183 = arg3 * 1240877353;
			local1.anInt1187 = arg1 * 665189903;
			local1.anInt1184 = arg2 * 449344921;
			if (arg1 >= 0 && arg2 >= 0 && arg1 < client.aClass370_1.method26943() && arg2 < client.aClass370_1.method27062()) {
				Class534.method32526(local1);
			}
			aClass553_15.method32702(local1);
		}
		local1.anInt1182 = arg4 * -1796345009;
		local1.anInt1189 = arg5 * 1753941885;
		local1.anInt1188 = arg6 * 2047985235;
		local1.aBoolean255 = true;
		local1.aBoolean256 = false;
	}

	@OriginalMember(owner = "client!afk", name = "c", descriptor = "()V", line = 86)
	public static final void method10305() {
		@Pc(4) Class3_Sub7 local4;
		for (local4 = (Class3_Sub7) aClass553_15.method32768(); local4 != null; local4 = (Class3_Sub7) aClass553_15.method32709()) {
			if (local4.aBoolean256) {
				local4.method33656();
			} else {
				local4.aBoolean255 = true;
				if (local4.anInt1187 * -1303695121 >= 0 && local4.anInt1184 * -2103701847 >= 0 && local4.anInt1187 * -1303695121 < client.aClass370_1.method26943() && local4.anInt1184 * -2103701847 < client.aClass370_1.method27062()) {
					Class534.method32526(local4);
				}
			}
		}
		for (local4 = (Class3_Sub7) aClass553_16.method32768(); local4 != null; local4 = (Class3_Sub7) aClass553_16.method32709()) {
			if (local4.aBoolean256) {
				local4.method33656();
			} else {
				local4.aBoolean255 = true;
			}
		}
	}

	@OriginalMember(owner = "client!afk", name = "z", descriptor = "(Lclient!afk;)V", line = 106)
	static final void method10313(@OriginalArg(0) Class3_Sub7 arg0) {
		@Pc(3) Class438 local3 = client.aClass370_1.method26950();
		if (local3 == null) {
			return;
		}
		@Pc(9) Interface43 local9 = null;
		if (arg0.anInt1183 * 1349018393 == 0) {
			local9 = (Interface43) local3.method28066(arg0.anInt1191 * -53574091, arg0.anInt1187 * -1303695121, arg0.anInt1184 * -2103701847);
		}
		if (arg0.anInt1183 * 1349018393 == 1) {
			local9 = (Interface43) local3.method28200(arg0.anInt1191 * -53574091, arg0.anInt1187 * -1303695121, arg0.anInt1184 * -2103701847);
		}
		if (arg0.anInt1183 * 1349018393 == 2) {
			local9 = (Interface43) local3.method28150(arg0.anInt1191 * -53574091, arg0.anInt1187 * -1303695121, arg0.anInt1184 * -2103701847, client.anInterface48_1);
		}
		if (arg0.anInt1183 * 1349018393 == 3) {
			local9 = (Interface43) local3.method28053(arg0.anInt1191 * -53574091, arg0.anInt1187 * -1303695121, arg0.anInt1184 * -2103701847);
		}
		if (local9 == null) {
			arg0.anInt1185 = 2005441187;
			arg0.anInt1190 = 0;
			arg0.anInt1186 = 0;
		} else {
			arg0.anInt1185 = local9.method11163() * -2005441187;
			arg0.anInt1190 = local9.method11146() * -508931319;
			arg0.anInt1186 = local9.method11147() * -1764008949;
		}
	}

	@OriginalMember(owner = "client!afk", name = "j", descriptor = "()V", line = 126)
	static final void method10307() {
		@Pc(4) Class3_Sub7 local4;
		for (local4 = (Class3_Sub7) aClass553_15.method32768(); local4 != null; local4 = (Class3_Sub7) aClass553_15.method32709()) {
			Class44_Sub1.method8405(local4, false);
		}
		for (local4 = (Class3_Sub7) aClass553_16.method32768(); local4 != null; local4 = (Class3_Sub7) aClass553_16.method32709()) {
			Class44_Sub1.method8405(local4, true);
		}
	}

	@OriginalMember(owner = "client!afk", name = "n", descriptor = "()V", line = 126)
	static final void method10308() {
		@Pc(4) Class3_Sub7 local4;
		for (local4 = (Class3_Sub7) aClass553_15.method32768(); local4 != null; local4 = (Class3_Sub7) aClass553_15.method32709()) {
			Class44_Sub1.method8405(local4, false);
		}
		for (local4 = (Class3_Sub7) aClass553_16.method32768(); local4 != null; local4 = (Class3_Sub7) aClass553_16.method32709()) {
			Class44_Sub1.method8405(local4, true);
		}
	}

	@OriginalMember(owner = "client!afk", name = "f", descriptor = "(Lclient!afk;Z)V", line = 139)
	static final void method10303(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(1) boolean arg1) {
		if (arg0.aBoolean256) {
			if (arg0.anInt1185 * 146675445 < 0 || Class614.method33655(client.aClass370_1.method26954(), arg0.anInt1185 * 146675445, arg0.anInt1190 * -816239815)) {
				if (arg1) {
					Class395.method27504(arg0.anInt1191 * -53574091, arg0.anInt1183 * 1349018393, arg0.anInt1187 * -1303695121, arg0.anInt1184 * -2103701847, null);
				} else {
					Class85.method21639(arg0.anInt1191 * -53574091, arg0.anInt1183 * 1349018393, arg0.anInt1187 * -1303695121, arg0.anInt1184 * -2103701847, arg0.anInt1185 * 146675445, arg0.anInt1186 * 2045202339, arg0.anInt1190 * -816239815, -1, 0);
				}
				arg0.method33656();
			}
		} else if (arg0.aBoolean255 && arg0.anInt1187 * -1303695121 >= 1 && arg0.anInt1184 * -2103701847 >= 1 && arg0.anInt1187 * -1303695121 <= client.aClass370_1.method26943() - 2 && arg0.anInt1184 * -2103701847 <= client.aClass370_1.method27062() - 2 && (arg0.anInt1182 * -1534639185 < 0 || Class614.method33655(client.aClass370_1.method26954(), arg0.anInt1182 * -1534639185, arg0.anInt1189 * 1076554197))) {
			if (arg1) {
				Class395.method27504(arg0.anInt1191 * -53574091, arg0.anInt1183 * 1349018393, arg0.anInt1187 * -1303695121, arg0.anInt1184 * -2103701847, arg0.aClass462_1);
			} else {
				Class85.method21639(arg0.anInt1191 * -53574091, arg0.anInt1183 * 1349018393, arg0.anInt1187 * -1303695121, arg0.anInt1184 * -2103701847, arg0.anInt1182 * -1534639185, arg0.anInt1188 * 2046717403, arg0.anInt1189 * 1076554197, -1, 0);
			}
			arg0.aBoolean255 = false;
			if (!arg1 && arg0.anInt1182 * -1534639185 == arg0.anInt1185 * 146675445 && arg0.anInt1185 * 146675445 == -1) {
				arg0.method33656();
			} else if (!arg1 && arg0.anInt1182 * -1534639185 == arg0.anInt1185 * 146675445 && arg0.anInt1188 * 2046717403 == arg0.anInt1186 * 2045202339 && arg0.anInt1189 * 1076554197 == arg0.anInt1190 * -816239815) {
				arg0.method33656();
			}
		}
	}

	@OriginalMember(owner = "client!afk", name = "i", descriptor = "(Lclient!afk;Z)V", line = 139)
	static final void method10310(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(1) boolean arg1) {
		if (arg0.aBoolean256) {
			if (arg0.anInt1185 * 146675445 < 0 || Class614.method33655(client.aClass370_1.method26954(), arg0.anInt1185 * 146675445, arg0.anInt1190 * -816239815)) {
				if (arg1) {
					Class395.method27504(arg0.anInt1191 * -53574091, arg0.anInt1183 * 1349018393, arg0.anInt1187 * -1303695121, arg0.anInt1184 * -2103701847, null);
				} else {
					Class85.method21639(arg0.anInt1191 * -53574091, arg0.anInt1183 * 1349018393, arg0.anInt1187 * -1303695121, arg0.anInt1184 * -2103701847, arg0.anInt1185 * 146675445, arg0.anInt1186 * 2045202339, arg0.anInt1190 * -816239815, -1, 0);
				}
				arg0.method33656();
			}
		} else if (arg0.aBoolean255 && arg0.anInt1187 * -1303695121 >= 1 && arg0.anInt1184 * -2103701847 >= 1 && arg0.anInt1187 * -1303695121 <= client.aClass370_1.method26943() - 2 && arg0.anInt1184 * -2103701847 <= client.aClass370_1.method27062() - 2 && (arg0.anInt1182 * -1534639185 < 0 || Class614.method33655(client.aClass370_1.method26954(), arg0.anInt1182 * -1534639185, arg0.anInt1189 * 1076554197))) {
			if (arg1) {
				Class395.method27504(arg0.anInt1191 * -53574091, arg0.anInt1183 * 1349018393, arg0.anInt1187 * -1303695121, arg0.anInt1184 * -2103701847, arg0.aClass462_1);
			} else {
				Class85.method21639(arg0.anInt1191 * -53574091, arg0.anInt1183 * 1349018393, arg0.anInt1187 * -1303695121, arg0.anInt1184 * -2103701847, arg0.anInt1182 * -1534639185, arg0.anInt1188 * 2046717403, arg0.anInt1189 * 1076554197, -1, 0);
			}
			arg0.aBoolean255 = false;
			if (!arg1 && arg0.anInt1182 * -1534639185 == arg0.anInt1185 * 146675445 && arg0.anInt1185 * 146675445 == -1) {
				arg0.method33656();
			} else if (!arg1 && arg0.anInt1182 * -1534639185 == arg0.anInt1185 * 146675445 && arg0.anInt1188 * 2046717403 == arg0.anInt1186 * 2045202339 && arg0.anInt1189 * 1076554197 == arg0.anInt1190 * -816239815) {
				arg0.method33656();
			}
		}
	}

	@OriginalMember(owner = "client!afk", name = "k", descriptor = "(IIIIIIIII)V", line = 160)
	static final void method10311(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 < 1 || arg3 < 1 || arg2 > client.aClass370_1.method26943() - 2 || arg3 > client.aClass370_1.method27062() - 2) {
			return;
		}
		@Pc(21) int local21 = arg0;
		if (arg0 < 3 && client.aClass370_1.method27075().method26504(arg2, arg3)) {
			local21 = arg0 + 1;
		}
		if (client.aClass370_1.method26950() == null) {
			return;
		}
		client.aClass370_1.method26959().method9456(Class613.aClass21_13, arg0, arg1, arg2, arg3);
		if (arg4 >= 0) {
			@Pc(55) int local55 = Class510.aClass3_Sub45_37.aClass60_Sub31_1.method13987();
			Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub31_1, 1);
			client.aClass370_1.method26959().method9461(Class613.aClass21_13, local21, arg0, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub31_1, local55);
		}
		Class3_Sub10.method11192(Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aByte101);
	}

	@OriginalMember(owner = "client!afk", name = "at", descriptor = "(IIIIIIIII)V", line = 160)
	static final void method10312(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 < 1 || arg3 < 1 || arg2 > client.aClass370_1.method26943() - 2 || arg3 > client.aClass370_1.method27062() - 2) {
			return;
		}
		@Pc(21) int local21 = arg0;
		if (arg0 < 3 && client.aClass370_1.method27075().method26504(arg2, arg3)) {
			local21 = arg0 + 1;
		}
		if (client.aClass370_1.method26950() == null) {
			return;
		}
		client.aClass370_1.method26959().method9456(Class613.aClass21_13, arg0, arg1, arg2, arg3);
		if (arg4 >= 0) {
			@Pc(55) int local55 = Class510.aClass3_Sub45_37.aClass60_Sub31_1.method13987();
			Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub31_1, 1);
			client.aClass370_1.method26959().method9461(Class613.aClass21_13, local21, arg0, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub31_1, local55);
		}
		Class3_Sub10.method11192(Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aByte101);
	}

	@OriginalMember(owner = "client!afk", name = "ak", descriptor = "(IIIILclient!sp;)V", line = 176)
	static final void method10302(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class462 arg4) {
		if (arg2 < 1 || arg3 < 1 || arg2 > client.aClass370_1.method26943() - 2 || arg3 > client.aClass370_1.method27062() - 2) {
			return;
		}
		if (client.aClass370_1.method26950() == null) {
			return;
		}
		@Pc(34) Interface43 local34 = client.aClass370_1.method26959().method9457(arg0, arg1, arg2, arg3);
		if (local34 == null) {
			return;
		}
		if (local34 instanceof Class26_Sub1_Sub1_Sub2) {
			((Class26_Sub1_Sub1_Sub2) local34).method9172(arg4);
		} else if (local34 instanceof Class26_Sub1_Sub2_Sub1) {
			((Class26_Sub1_Sub2_Sub1) local34).method9766(arg4);
		} else if (local34 instanceof Class26_Sub1_Sub3_Sub2) {
			((Class26_Sub1_Sub3_Sub2) local34).method10583(arg4);
		} else if (local34 instanceof Class26_Sub1_Sub4_Sub1) {
			((Class26_Sub1_Sub4_Sub1) local34).method10812(arg4);
		}
	}

	@OriginalMember(owner = "client!afk", name = "af", descriptor = "(IIIILclient!sp;)V", line = 176)
	static final void method10306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class462 arg4) {
		if (arg2 < 1 || arg3 < 1 || arg2 > client.aClass370_1.method26943() - 2 || arg3 > client.aClass370_1.method27062() - 2) {
			return;
		}
		if (client.aClass370_1.method26950() == null) {
			return;
		}
		@Pc(34) Interface43 local34 = client.aClass370_1.method26959().method9457(arg0, arg1, arg2, arg3);
		if (local34 == null) {
			return;
		}
		if (local34 instanceof Class26_Sub1_Sub1_Sub2) {
			((Class26_Sub1_Sub1_Sub2) local34).method9172(arg4);
		} else if (local34 instanceof Class26_Sub1_Sub2_Sub1) {
			((Class26_Sub1_Sub2_Sub1) local34).method9766(arg4);
		} else if (local34 instanceof Class26_Sub1_Sub3_Sub2) {
			((Class26_Sub1_Sub3_Sub2) local34).method10583(arg4);
		} else if (local34 instanceof Class26_Sub1_Sub4_Sub1) {
			((Class26_Sub1_Sub4_Sub1) local34).method10812(arg4);
		}
	}

	@OriginalMember(owner = "client!afk", name = "aa", descriptor = "(IIIILclient!sp;)V", line = 176)
	static final void method10314(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class462 arg4) {
		if (arg2 < 1 || arg3 < 1 || arg2 > client.aClass370_1.method26943() - 2 || arg3 > client.aClass370_1.method27062() - 2) {
			return;
		}
		if (client.aClass370_1.method26950() == null) {
			return;
		}
		@Pc(34) Interface43 local34 = client.aClass370_1.method26959().method9457(arg0, arg1, arg2, arg3);
		if (local34 == null) {
			return;
		}
		if (local34 instanceof Class26_Sub1_Sub1_Sub2) {
			((Class26_Sub1_Sub1_Sub2) local34).method9172(arg4);
		} else if (local34 instanceof Class26_Sub1_Sub2_Sub1) {
			((Class26_Sub1_Sub2_Sub1) local34).method9766(arg4);
		} else if (local34 instanceof Class26_Sub1_Sub3_Sub2) {
			((Class26_Sub1_Sub3_Sub2) local34).method10583(arg4);
		} else if (local34 instanceof Class26_Sub1_Sub4_Sub1) {
			((Class26_Sub1_Sub4_Sub1) local34).method10812(arg4);
		}
	}

	@OriginalMember(owner = "client!afk", name = "ah", descriptor = "(IIIILclient!sp;)V", line = 176)
	static final void method10315(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class462 arg4) {
		if (arg2 < 1 || arg3 < 1 || arg2 > client.aClass370_1.method26943() - 2 || arg3 > client.aClass370_1.method27062() - 2) {
			return;
		}
		if (client.aClass370_1.method26950() == null) {
			return;
		}
		@Pc(34) Interface43 local34 = client.aClass370_1.method26959().method9457(arg0, arg1, arg2, arg3);
		if (local34 == null) {
			return;
		}
		if (local34 instanceof Class26_Sub1_Sub1_Sub2) {
			((Class26_Sub1_Sub1_Sub2) local34).method9172(arg4);
		} else if (local34 instanceof Class26_Sub1_Sub2_Sub1) {
			((Class26_Sub1_Sub2_Sub1) local34).method9766(arg4);
		} else if (local34 instanceof Class26_Sub1_Sub3_Sub2) {
			((Class26_Sub1_Sub3_Sub2) local34).method10583(arg4);
		} else if (local34 instanceof Class26_Sub1_Sub4_Sub1) {
			((Class26_Sub1_Sub4_Sub1) local34).method10812(arg4);
		}
	}
}
