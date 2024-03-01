package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dn")
public class Class131 {

	@OriginalMember(owner = "client!dn", name = "g", descriptor = "[Lclient!ey;")
	public static Class163[] aClass163Array1;

	@OriginalMember(owner = "client!dn", name = "e", descriptor = "S")
	static short aShort158;

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "[Lclient!ex;")
	static Class162[] aClass162Array1;

	@OriginalMember(owner = "client!dn", name = "h", descriptor = "[Lclient!ej;")
	static Class150[] aClass150Array1;

	@OriginalMember(owner = "client!dn", name = "j", descriptor = "S")
	static short aShort159;

	@OriginalMember(owner = "client!dn", name = "l", descriptor = "[Lclient!eb;")
	static Class142[] aClass142Array1;

	@OriginalMember(owner = "client!dn", name = "p", descriptor = "Lclient!wk;")
	public static Class553 aClass553_48 = new Class553();

	@OriginalMember(owner = "client!dn", name = "s", descriptor = "Lclient!xn;")
	public static Class581 aClass581_23 = new Class581(32);

	@OriginalMember(owner = "client!dn", name = "u", descriptor = "I")
	static int anInt3326 = -1402199347;

	@OriginalMember(owner = "client!dn", name = "y", descriptor = "I")
	static int anInt3327 = 0;

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "I")
	static int anInt3328 = 0;

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "Z")
	static boolean aBoolean617 = false;

	@OriginalMember(owner = "client!dn", name = "r", descriptor = "I")
	static int anInt3329 = -616548473;

	@OriginalMember(owner = "client!dn", name = "d", descriptor = "I")
	static int anInt3330 = -1334009455;

	@OriginalMember(owner = "client!dn", name = "m", descriptor = "Lclient!ct;")
	public static final Interface8 anInterface8_3 = new Class146();

	@OriginalMember(owner = "client!dn", name = "<init>", descriptor = "()V", line = 53)
	Class131() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!dn", name = "x", descriptor = "(I)Z", line = 58)
	public static boolean method22891(@OriginalArg(0) int arg0) {
		if (arg0 != anInt3330 * -2090483569 || Class2.aClass145_1 == null) {
			Class123.method22843();
			Class2.aClass145_1 = Class145.aClass145_4;
			anInt3330 = arg0 * 1334009455;
		}
		@Pc(39) int local39;
		if (Class145.aClass145_4 == Class2.aClass145_1) {
			@Pc(23) byte[] local23 = Class329.aClass359_60.method26705(arg0);
			if (local23 == null) {
				return false;
			}
			@Pc(32) Class3_Sub41 local32 = new Class3_Sub41(local23);
			Class189.method23982(local32);
			local39 = local32.method20269();
			@Pc(41) int local41;
			for (local41 = 0; local41 < local39; local41++) {
				aClass553_48.method32702(new Class3_Sub6(local32));
			}
			local41 = local32.method20334();
			aClass162Array1 = new Class162[local41];
			@Pc(62) int local62;
			for (local62 = 0; local62 < local41; local62++) {
				aClass162Array1[local62] = new Class162(local32);
			}
			local62 = local32.method20334();
			aClass163Array1 = new Class163[local62];
			@Pc(83) int local83;
			for (local83 = 0; local83 < local62; local83++) {
				aClass163Array1[local83] = new Class163(local32, local83);
			}
			local83 = local32.method20334();
			aClass142Array1 = new Class142[local83];
			@Pc(105) int local105;
			for (local105 = 0; local105 < local83; local105++) {
				aClass142Array1[local105] = new Class142(local32);
			}
			local105 = local32.method20334();
			aClass150Array1 = new Class150[local105];
			@Pc(126) int local126;
			for (local126 = 0; local126 < local105; local126++) {
				aClass150Array1[local126] = new Class150(local32);
			}
			local126 = local32.method20334();
			Class496.aClass13Array1 = new Class13[local126];
			for (@Pc(147) int local147 = 0; local147 < local126; local147++) {
				Class496.aClass13Array1[local147] = Class595.method33433(local32);
			}
			Class2.aClass145_1 = Class145.aClass145_3;
		}
		if (Class145.aClass145_3 == Class2.aClass145_1) {
			@Pc(165) boolean local165 = true;
			@Pc(167) Class163[] local167 = aClass163Array1;
			for (local39 = 0; local39 < local167.length; local39++) {
				@Pc(177) Class163 local177 = local167[local39];
				if (!local177.method23285()) {
					local165 = false;
				}
			}
			@Pc(187) Class13[] local187 = Class496.aClass13Array1;
			for (local39 = 0; local39 < local187.length; local39++) {
				@Pc(197) Class13 local197 = local187[local39];
				if (!local197.method16890()) {
					local165 = false;
				}
			}
			@Pc(207) Class142[] local207 = aClass142Array1;
			for (local39 = 0; local39 < local207.length; local39++) {
				@Pc(217) Class142 local217 = local207[local39];
				if (!local217.method23038()) {
					local165 = false;
				}
			}
			if (!local165) {
				return false;
			}
			Class2.aClass145_1 = Class145.aClass145_2;
		}
		return true;
	}

	@OriginalMember(owner = "client!dn", name = "s", descriptor = "(Lclient!ahb;)V", line = 124)
	static void method22892(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			switch(local3) {
				case 0:
					anInt3327 = arg0.method20271() * 1653623583;
					anInt3328 = arg0.method20271() * -559520215;
					break;
				case 255:
					return;
			}
		}
	}

	@OriginalMember(owner = "client!dn", name = "u", descriptor = "()V", line = 137)
	public static void method22893() {
		aClass581_23.method33222();
		aClass553_48.method32701();
		aClass162Array1 = null;
		aClass163Array1 = null;
		aClass142Array1 = null;
		aClass150Array1 = null;
		Class496.aClass13Array1 = null;
		anInt3326 = -1402199347;
		anInt3327 = 0;
		anInt3328 = 0;
		Class2.aClass145_1 = null;
		anInt3330 = -1334009455;
		anInt3329 = -616548473;
		if (!aBoolean617) {
			return;
		}
		client.aShort154 = Class625.aShort181;
		client.aShort148 = Class191.aShort161;
		client.aShort152 = aShort159;
		client.aShort153 = aShort158;
		aBoolean617 = false;
	}

	@OriginalMember(owner = "client!dn", name = "y", descriptor = "()V", line = 137)
	public static void method22894() {
		aClass581_23.method33222();
		aClass553_48.method32701();
		aClass162Array1 = null;
		aClass163Array1 = null;
		aClass142Array1 = null;
		aClass150Array1 = null;
		Class496.aClass13Array1 = null;
		anInt3326 = -1402199347;
		anInt3327 = 0;
		anInt3328 = 0;
		Class2.aClass145_1 = null;
		anInt3330 = -1334009455;
		anInt3329 = -616548473;
		if (!aBoolean617) {
			return;
		}
		client.aShort154 = Class625.aShort181;
		client.aShort148 = Class191.aShort161;
		client.aShort152 = aShort159;
		client.aShort153 = aShort158;
		aBoolean617 = false;
	}

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "()V", line = 160)
	public static void method22895() {
		Class625.aShort181 = client.aShort154;
		Class191.aShort161 = client.aShort148;
		aShort159 = client.aShort152;
		aShort158 = client.aShort153;
		aBoolean617 = true;
		anInt3329 = Class510.aClass183_1.method23591() * 616548473;
		if (anInt3328 * -2025548263 != 0 && anInt3327 * 1869574367 != 0) {
			client.aShort152 = 334;
			client.aShort153 = 334;
			client.aShort148 = client.aShort154 = (short) (anInt3328 * -1993592320 / (anInt3327 * 1869574367));
		}
	}

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "()V", line = 160)
	public static void method22896() {
		Class625.aShort181 = client.aShort154;
		Class191.aShort161 = client.aShort148;
		aShort159 = client.aShort152;
		aShort158 = client.aShort153;
		aBoolean617 = true;
		anInt3329 = Class510.aClass183_1.method23591() * 616548473;
		if (anInt3328 * -2025548263 != 0 && anInt3327 * 1869574367 != 0) {
			client.aShort152 = 334;
			client.aShort153 = 334;
			client.aShort148 = client.aShort154 = (short) (anInt3328 * -1993592320 / (anInt3327 * 1869574367));
		}
	}

	@OriginalMember(owner = "client!dn", name = "z", descriptor = "(Z)V", line = 174)
	public static void method22890(@OriginalArg(0) boolean arg0) {
		if (client.anInt3065 * -1773414811 == 3 || client.anInt3065 * -1773414811 == 4) {
			return;
		}
		if (!arg0) {
			if (Class496.aClass13Array1 != null) {
				@Pc(16) Class13[] local16 = Class496.aClass13Array1;
				for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
					@Pc(26) Class13 local26 = local16[local18];
					local26.method16892();
				}
			}
			if (anInt3329 * 1412702665 != -1) {
				Class510.aClass183_1.method23573(anInt3329 * 1412702665, 255);
			}
		}
		client.anInt3065 = -1022115257;
		Class223.aClass3_Sub41_17 = null;
		client.aBoolean582 = false;
		if (anInt3330 * -2090483569 > 0) {
			Class291.method25543(Class634.aClass634_20, anInt3330 * -2090483569, -1);
		}
		Class123.method22843();
		@Pc(68) Class3_Sub23 local68 = Class269.method25284(Class311.aClass311_2, client.aClass82_2.aClass577_2);
		local68.aClass3_Sub41_Sub1_1.method20250(arg0 ? 1 : 0);
		client.aClass82_2.method21601(local68);
	}

	@OriginalMember(owner = "client!dn", name = "j", descriptor = "(Z)V", line = 174)
	public static void method22897(@OriginalArg(0) boolean arg0) {
		if (client.anInt3065 * -1773414811 == 3 || client.anInt3065 * -1773414811 == 4) {
			return;
		}
		if (!arg0) {
			if (Class496.aClass13Array1 != null) {
				@Pc(16) Class13[] local16 = Class496.aClass13Array1;
				for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
					@Pc(26) Class13 local26 = local16[local18];
					local26.method16892();
				}
			}
			if (anInt3329 * 1412702665 != -1) {
				Class510.aClass183_1.method23573(anInt3329 * 1412702665, 255);
			}
		}
		client.anInt3065 = -1022115257;
		Class223.aClass3_Sub41_17 = null;
		client.aBoolean582 = false;
		if (anInt3330 * -2090483569 > 0) {
			Class291.method25543(Class634.aClass634_20, anInt3330 * -2090483569, -1);
		}
		Class123.method22843();
		@Pc(68) Class3_Sub23 local68 = Class269.method25284(Class311.aClass311_2, client.aClass82_2.aClass577_2);
		local68.aClass3_Sub41_Sub1_1.method20250(arg0 ? 1 : 0);
		client.aClass82_2.method21601(local68);
	}

	@OriginalMember(owner = "client!dn", name = "n", descriptor = "(Z)V", line = 174)
	public static void method22898(@OriginalArg(0) boolean arg0) {
		if (client.anInt3065 * -1773414811 == 3 || client.anInt3065 * -1773414811 == 4) {
			return;
		}
		if (!arg0) {
			if (Class496.aClass13Array1 != null) {
				@Pc(16) Class13[] local16 = Class496.aClass13Array1;
				for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
					@Pc(26) Class13 local26 = local16[local18];
					local26.method16892();
				}
			}
			if (anInt3329 * 1412702665 != -1) {
				Class510.aClass183_1.method23573(anInt3329 * 1412702665, 255);
			}
		}
		client.anInt3065 = -1022115257;
		Class223.aClass3_Sub41_17 = null;
		client.aBoolean582 = false;
		if (anInt3330 * -2090483569 > 0) {
			Class291.method25543(Class634.aClass634_20, anInt3330 * -2090483569, -1);
		}
		Class123.method22843();
		@Pc(68) Class3_Sub23 local68 = Class269.method25284(Class311.aClass311_2, client.aClass82_2.aClass577_2);
		local68.aClass3_Sub41_Sub1_1.method20250(arg0 ? 1 : 0);
		client.aClass82_2.method21601(local68);
	}

	@OriginalMember(owner = "client!dn", name = "js", descriptor = "(Lclient!fo;IILclient!vs;I)V", line = 5819)
	static final void method22899(@OriginalArg(0) Class178 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class536 arg3) {
		if (arg0.anIntArray362 == null) {
			if (arg2 <= 0) {
				return;
			}
			arg0.aByteArrayArray12 = new byte[11][];
			arg0.aByteArrayArray13 = new byte[11][];
			arg0.anIntArray364 = new int[11];
			arg0.anIntArray361 = new int[11];
			arg0.anIntArray362 = new int[11];
		}
		arg0.anIntArray362[arg1] = arg2;
		if (arg2 > 0) {
			arg0.aBoolean639 = true;
			return;
		}
		arg0.aBoolean639 = false;
		for (@Pc(42) int local42 = 0; local42 < arg0.aByteArrayArray12.length; local42++) {
			if (arg0.aByteArrayArray12[local42] != null || arg0.anIntArray362[local42] > 0) {
				arg0.aBoolean639 = true;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!dn", name = "od", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;I)V", line = 6658)
	static final void method22901(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		@Pc(13) String local13 = (String) arg2.anObjectArray42[(arg2.anInt5315 -= 790013775) * 996806575];
		if (Class201.method24159(local13, arg2) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray36 = Class484.method29109(local13, arg2);
		arg0.aBoolean644 = true;
	}

	@OriginalMember(owner = "client!dn", name = "ajt", descriptor = "(Lclient!vs;Lclient!act;I)V", line = 10787)
	static final void method22900(@OriginalArg(0) Class536 arg0, @OriginalArg(1) Class26_Sub1_Sub1_Sub1 arg1) {
		arg0.anInt5319 -= -2110095453;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		@Pc(33) int local33 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 2];
		@Pc(43) int local43 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 3];
		@Pc(53) int local53 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 4];
		@Pc(68) boolean local68 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 5] == 1;
		@Pc(78) int local78 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 6];
		if (Class80.aClass23_Sub1_1.method5887() != Class204.aClass204_3) {
			throw new RuntimeException();
		}
		@Pc(92) Class30_Sub3 local92 = (Class30_Sub3) Class80.aClass23_Sub1_1.method5827();
		@Pc(96) Class335 local96 = new Class335();
		@Pc(100) Class335 local100 = new Class335();
		local96.method26365(0.0F, 1.0F, 0.0F, (float) ((double) local53 * 3.141592653589793D * 2.0D / 16384.0D));
		@Pc(121) Class320 local121 = new Class320(1.0F, 0.0F, 0.0F);
		local121.method25889(local96);
		local121.method25870();
		local100.method26301(local121, (float) ((double) local43 * 3.141592653589793D * 2.0D / 16384.0D));
		local96.method26312(local100);
		@Pc(145) Class464 local145 = client.aClass370_1.method26942();
		@Pc(152) int local152 = local145.anInt5071 * -1567811631 << 9;
		@Pc(159) int local159 = local145.anInt5073 * 1360175441 << 9;
		if (arg1 != null) {
			local92.method7823(arg1, new Class320((float) local13, (float) local23, (float) local33), local96, local68, local78, client.aClass370_1.method26959().anIntArrayArrayArray14, client.aClass370_1.method27075(), local152, local159);
		}
		client.aBoolean586 = true;
	}
}
