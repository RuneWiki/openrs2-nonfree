package com.jagex;

import jaclib.ping.Ping;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!acm")
public class Class62 {

	@OriginalMember(owner = "client!acm", name = "p", descriptor = "I")
	static final int anInt191 = 3;

	@OriginalMember(owner = "client!acm", name = "<init>", descriptor = "()V", line = 9)
	Class62() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!acm", name = "p", descriptor = "(B)I", line = 71)
	public static int method904() {
		if (Class458.anInt4960 * 41966215 == 0) {
			Class37.aClass37_2.method654(new Class457("jaclib"));
			if (Class37.aClass37_2.method652().method29477() != 100) {
				return 1;
			}
			if (!((Class457) Class37.aClass37_2.method652()).method29480() && !Class98.method7802()) {
				try {
					Class695.aClient1.method24942();
					Class339.method27730();
					Ping.init();
				} catch (@Pc(38) Exception_Sub4 local38) {
					Class536.method30823(Class49.aClass49_2, local38.aString66, local38.anInt2467 * 1583361521, local38.getCause());
				} catch (@Pc(51) Throwable local51) {
				}
			}
			Class458.anInt4960 = -341750985;
		}
		@Pc(257) int local257;
		@Pc(279) int local279;
		@Pc(297) int local297;
		if (Class458.anInt4960 * 41966215 == 1) {
			Class458.aClass37Array1 = Class37.method646();
			Class37.aClass37_20.method654(new Class448(Class585.aClass478_131));
			Class37.aClass37_3.method654(new Class457("jaggl"));
			@Pc(80) Class457 local80 = new Class457("jagdx");
			if (!Class293.aString184.startsWith("win")) {
				local80.method29485();
			}
			Class37.aClass37_4.method654(local80);
			Class37.aClass37_5.method654(new Class457("sw3d"));
			Class37.aClass37_12.method654(new Class457("hw3d"));
			Class37.aClass37_21.method654(new Class457("RuneScape-Setup.exe", true));
			Class37.aClass37_8.method654(new Class448(Class323.aClass478_96));
			Class37.aClass37_9.method654(new Class448(Class694.aClass478_138));
			Class37.aClass37_18.method654(new Class448(Class262.aClass478_91));
			Class37.aClass37_11.method654(new Class448(Class220.aClass478_90));
			Class37.aClass37_6.method654(new Class448(Class272.aClass478_92));
			Class37.aClass37_13.method654(new Class448(Class96_Sub5.aClass478_17));
			Class37.aClass37_14.method654(new Class448(Class151_Sub3_Sub1.aClass478_86));
			Class37.aClass37_10.method654(new Class448(Class115_Sub3.aClass478_83));
			Class37.aClass37_16.method654(new Class448(Class338.aClass478_97));
			Class37.aClass37_17.method654(new Class448(Class39.aClass478_42));
			Class37.aClass37_24.method654(new Class448(Class7.aClass478_2));
			Class37.aClass37_19.method654(new Class448(Class499.aClass478_126));
			Class37.aClass37_15.method654(new Class448(Class379.aClass478_110));
			Class37.aClass37_23.method654(new Class448(Class675.aClass478_136));
			Class37.aClass37_22.method654(new Class448(Class406.aClass478_114));
			Class37.aClass37_27.method654(new Class456(Class628.aClass478_135, "huffman"));
			Class37.aClass37_7.method654(new Class448(Class317.aClass478_94));
			Class37.aClass37_1.method654(new Class448(Class322.aClass478_95));
			Class37.aClass37_25.method654(new Class448(Class145.aClass478_46));
			Class37.aClass37_26.method654(new Class446(Class688.aClass478_137, 0));
			for (local257 = 0; local257 < Class458.aClass37Array1.length; local257++) {
				if (Class458.aClass37Array1[local257].method652() == null) {
					throw new RuntimeException();
				}
			}
			local257 = 0;
			@Pc(277) Class37[] local277 = Class458.aClass37Array1;
			for (local279 = 0; local279 < local277.length; local279++) {
				@Pc(287) Class37 local287 = local277[local279];
				@Pc(291) int local291 = local287.method648();
				local297 = local287.method652().method29477();
				local257 += local291 * local297 / 100;
			}
			Class458.anInt4961 = local257 * -285262333;
			Class458.anInt4960 = -683501970;
		}
		if (Class458.aClass37Array1 == null) {
			return 100;
		}
		@Pc(320) int local320 = 0;
		local257 = 0;
		@Pc(324) boolean local324 = true;
		@Pc(326) Class37[] local326 = Class458.aClass37Array1;
		for (@Pc(328) int local328 = 0; local328 < local326.length; local328++) {
			@Pc(336) Class37 local336 = local326[local328];
			local297 = local336.method648();
			@Pc(346) int local346 = local336.method652().method29477();
			if (local346 < 100) {
				local324 = false;
			}
			local320 += local297;
			local257 += local346 * local297 / 100;
		}
		if (local324) {
			Class458.aClass37Array1 = null;
		}
		local257 -= Class458.anInt4961 * -1094853461;
		local320 -= Class458.anInt4961 * -1094853461;
		local279 = local320 > 0 ? local257 * 100 / local320 : 100;
		if (!local324 && local279 > 99) {
			local279 = 99;
		}
		return local279;
	}

	@OriginalMember(owner = "client!acm", name = "ds", descriptor = "(Lclient!yf;I)V", line = 5150)
	static final void method905(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class94.method7651(local11, local14, arg0);
	}
}
