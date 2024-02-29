package com.jagex;

import jaclib.ping.Ping;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oz")
public class Class458 {

	@OriginalMember(owner = "client!oz", name = "p", descriptor = "[Lclient!abm;")
	static Class37[] aClass37Array1;

	@OriginalMember(owner = "client!oz", name = "c", descriptor = "I")
	static int anInt4960 = 0;

	@OriginalMember(owner = "client!oz", name = "v", descriptor = "I")
	static int anInt4961 = 0;

	@OriginalMember(owner = "client!oz", name = "<init>", descriptor = "()V", line = 66)
	Class458() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!oz", name = "l", descriptor = "()I", line = 71)
	public static int method29491() {
		if (anInt4960 * 41966215 == 0) {
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
			anInt4960 = -341750985;
		}
		@Pc(257) int local257;
		@Pc(279) int local279;
		@Pc(297) int local297;
		if (anInt4960 * 41966215 == 1) {
			aClass37Array1 = Class37.method646();
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
			for (local257 = 0; local257 < aClass37Array1.length; local257++) {
				if (aClass37Array1[local257].method652() == null) {
					throw new RuntimeException();
				}
			}
			local257 = 0;
			@Pc(277) Class37[] local277 = aClass37Array1;
			for (local279 = 0; local279 < local277.length; local279++) {
				@Pc(287) Class37 local287 = local277[local279];
				@Pc(291) int local291 = local287.method648();
				local297 = local287.method652().method29477();
				local257 += local291 * local297 / 100;
			}
			anInt4961 = local257 * -285262333;
			anInt4960 = -683501970;
		}
		if (aClass37Array1 == null) {
			return 100;
		}
		@Pc(320) int local320 = 0;
		local257 = 0;
		@Pc(324) boolean local324 = true;
		@Pc(326) Class37[] local326 = aClass37Array1;
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
			aClass37Array1 = null;
		}
		local257 -= anInt4961 * -1094853461;
		local320 -= anInt4961 * -1094853461;
		local279 = local320 > 0 ? local257 * 100 / local320 : 100;
		if (!local324 && local279 > 99) {
			local279 = 99;
		}
		return local279;
	}

	@OriginalMember(owner = "client!oz", name = "v", descriptor = "()I", line = 71)
	public static int method29492() {
		if (anInt4960 * 41966215 == 0) {
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
			anInt4960 = -341750985;
		}
		@Pc(257) int local257;
		@Pc(279) int local279;
		@Pc(297) int local297;
		if (anInt4960 * 41966215 == 1) {
			aClass37Array1 = Class37.method646();
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
			for (local257 = 0; local257 < aClass37Array1.length; local257++) {
				if (aClass37Array1[local257].method652() == null) {
					throw new RuntimeException();
				}
			}
			local257 = 0;
			@Pc(277) Class37[] local277 = aClass37Array1;
			for (local279 = 0; local279 < local277.length; local279++) {
				@Pc(287) Class37 local287 = local277[local279];
				@Pc(291) int local291 = local287.method648();
				local297 = local287.method652().method29477();
				local257 += local291 * local297 / 100;
			}
			anInt4961 = local257 * -285262333;
			anInt4960 = -683501970;
		}
		if (aClass37Array1 == null) {
			return 100;
		}
		@Pc(320) int local320 = 0;
		local257 = 0;
		@Pc(324) boolean local324 = true;
		@Pc(326) Class37[] local326 = aClass37Array1;
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
			aClass37Array1 = null;
		}
		local257 -= anInt4961 * -1094853461;
		local320 -= anInt4961 * -1094853461;
		local279 = local320 > 0 ? local257 * 100 / local320 : 100;
		if (!local324 && local279 > 99) {
			local279 = 99;
		}
		return local279;
	}

	@OriginalMember(owner = "client!oz", name = "y", descriptor = "()I", line = 71)
	public static int method29493() {
		if (anInt4960 * 41966215 == 0) {
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
			anInt4960 = -341750985;
		}
		@Pc(257) int local257;
		@Pc(279) int local279;
		@Pc(297) int local297;
		if (anInt4960 * 41966215 == 1) {
			aClass37Array1 = Class37.method646();
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
			for (local257 = 0; local257 < aClass37Array1.length; local257++) {
				if (aClass37Array1[local257].method652() == null) {
					throw new RuntimeException();
				}
			}
			local257 = 0;
			@Pc(277) Class37[] local277 = aClass37Array1;
			for (local279 = 0; local279 < local277.length; local279++) {
				@Pc(287) Class37 local287 = local277[local279];
				@Pc(291) int local291 = local287.method648();
				local297 = local287.method652().method29477();
				local257 += local291 * local297 / 100;
			}
			anInt4961 = local257 * -285262333;
			anInt4960 = -683501970;
		}
		if (aClass37Array1 == null) {
			return 100;
		}
		@Pc(320) int local320 = 0;
		local257 = 0;
		@Pc(324) boolean local324 = true;
		@Pc(326) Class37[] local326 = aClass37Array1;
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
			aClass37Array1 = null;
		}
		local257 -= anInt4961 * -1094853461;
		local320 -= anInt4961 * -1094853461;
		local279 = local320 > 0 ? local257 * 100 / local320 : 100;
		if (!local324 && local279 > 99) {
			local279 = 99;
		}
		return local279;
	}

	@OriginalMember(owner = "client!oz", name = "w", descriptor = "()I", line = 71)
	public static int method29494() {
		if (anInt4960 * 41966215 == 0) {
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
			anInt4960 = -341750985;
		}
		@Pc(257) int local257;
		@Pc(279) int local279;
		@Pc(297) int local297;
		if (anInt4960 * 41966215 == 1) {
			aClass37Array1 = Class37.method646();
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
			for (local257 = 0; local257 < aClass37Array1.length; local257++) {
				if (aClass37Array1[local257].method652() == null) {
					throw new RuntimeException();
				}
			}
			local257 = 0;
			@Pc(277) Class37[] local277 = aClass37Array1;
			for (local279 = 0; local279 < local277.length; local279++) {
				@Pc(287) Class37 local287 = local277[local279];
				@Pc(291) int local291 = local287.method648();
				local297 = local287.method652().method29477();
				local257 += local291 * local297 / 100;
			}
			anInt4961 = local257 * -285262333;
			anInt4960 = -683501970;
		}
		if (aClass37Array1 == null) {
			return 100;
		}
		@Pc(320) int local320 = 0;
		local257 = 0;
		@Pc(324) boolean local324 = true;
		@Pc(326) Class37[] local326 = aClass37Array1;
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
			aClass37Array1 = null;
		}
		local257 -= anInt4961 * -1094853461;
		local320 -= anInt4961 * -1094853461;
		local279 = local320 > 0 ? local257 * 100 / local320 : 100;
		if (!local324 && local279 > 99) {
			local279 = 99;
		}
		return local279;
	}

	@OriginalMember(owner = "client!oz", name = "l", descriptor = "(IIIILclient!vm;Lclient!apo;Lclient!apv;I)V", line = 166)
	public static void method29495(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class599 arg4, @OriginalArg(5) Class104_Sub1_Sub1_Sub1_Sub1 arg5, @OriginalArg(6) Class104_Sub1_Sub1_Sub1_Sub2 arg6) {
		@Pc(3) Class77_Sub16 local3 = new Class77_Sub16();
		local3.anInt1489 = arg0 * -1178810913;
		local3.anInt1490 = (arg1 << 9) * -973592293;
		local3.anInt1491 = (arg2 << 9) * -1604946927;
		if (arg4 != null) {
			local3.aClass599_1 = arg4;
			@Pc(32) int local32 = arg4.anInt5516 * -1082258489;
			@Pc(37) int local37 = arg4.anInt5529 * -1990374967;
			if (arg3 == 1 || arg3 == 3) {
				local32 = arg4.anInt5529 * -1990374967;
				local37 = arg4.anInt5516 * -1082258489;
			}
			local3.anInt1492 = (local32 + arg1 << 9) * -800010841;
			local3.anInt1493 = (local37 + arg2 << 9) * 1156683381;
			local3.anInt1502 = arg4.anInt5540 * 1128583165;
			local3.anInt1488 = (arg4.anInt5541 * 372226515 << 9) * -612932795;
			local3.anInt1495 = arg4.anInt5543 * 1993106295;
			local3.anInt1505 = arg4.anInt5523 * 617813239;
			local3.anInt1506 = arg4.anInt5545 * 1071004077;
			local3.anIntArray197 = arg4.anIntArray512;
			local3.anInt1504 = arg4.anInt5547 * -1005766001;
			local3.anInt1496 = arg4.anInt5514 * -990708005;
			local3.anInt1503 = (arg4.anInt5542 * 925162477 << 9) * -2034082261;
			if (arg4.anIntArray511 != null) {
				local3.aBoolean328 = true;
				local3.method13438();
			}
			if (local3.anIntArray197 != null) {
				local3.anInt1501 = (local3.anInt1505 * -1089168257 + (int) (Math.random() * (double) (local3.anInt1506 * 1512108791 - local3.anInt1505 * -1089168257))) * 835810559;
			}
			Class77_Sub16.aClass695_20.method36383(local3);
			Class94_Sub4.aClass261_1.method26315(local3.anInt1502 * -241175639);
			Class94_Sub4.aClass261_1.method26314(local3.anIntArray197);
		} else if (arg5 != null) {
			local3.aClass104_Sub1_Sub1_Sub1_Sub1_1 = arg5;
			@Pc(192) Class333 local192 = arg5.aClass333_1;
			if (local192.anIntArray437 != null) {
				local3.aBoolean328 = true;
				local192 = local192.method27642(Class55.aClass124_1, Class55.aClass124_1);
			}
			if (local192 != null) {
				local3.anInt1492 = (local192.anInt4117 * -1821838479 + arg1 << 9) * -800010841;
				local3.anInt1493 = (local192.anInt4117 * -1821838479 + arg2 << 9) * 1156683381;
				local3.anInt1502 = Class334.method27667(arg5) * 1086873753;
				local3.anInt1488 = (local192.anInt4121 * -869231065 << 9) * -612932795;
				local3.anInt1495 = local192.anInt4122 * 1689126761;
				local3.anInt1504 = local192.anInt4127 * 932822485;
				local3.anInt1496 = local192.anInt4126 * -32158863;
				local3.anInt1503 = (local192.anInt4102 * -1156607845 << 9) * -2034082261;
				Class94_Sub4.aClass261_1.method26315(local192.anInt4108 * 1315529581);
				Class94_Sub4.aClass261_1.method26315(local192.anInt4118 * 1912925203);
				Class94_Sub4.aClass261_1.method26315(local192.anInt4119 * 1144816973);
				Class94_Sub4.aClass261_1.method26315(local192.anInt4120 * -306882215);
			}
			Class77_Sub16.aClass695_21.method36383(local3);
		} else if (arg6 != null) {
			local3.aClass104_Sub1_Sub1_Sub1_Sub2_1 = arg6;
			local3.anInt1492 = (arg1 + arg6.method21095() << 9) * -800010841;
			local3.anInt1493 = (arg2 + arg6.method21095() << 9) * 1156683381;
			local3.anInt1502 = Class110.method9160(arg6) * 1086873753;
			local3.anInt1488 = (arg6.anInt2914 * -785793877 << 9) * -612932795;
			local3.anInt1495 = arg6.anInt2905 * -908420807;
			local3.anInt1504 = 1916307200;
			local3.anInt1496 = 665776896;
			local3.anInt1503 = 0;
			Class77_Sub16.aClass12_12.method184(local3, (long) (arg6.anInt2867 * 1126388985));
			Class94_Sub4.aClass261_1.method26315(arg6.anInt2915 * -729876395);
			Class94_Sub4.aClass261_1.method26315(arg6.anInt2909 * -2046269725);
			Class94_Sub4.aClass261_1.method26315(arg6.anInt2913 * 1734964233);
			Class94_Sub4.aClass261_1.method26315(arg6.anInt2916 * -510526957);
		}
	}

	@OriginalMember(owner = "client!oz", name = "bo", descriptor = "(Lclient!yf;I)V", line = 4771)
	static final void method29496(@OriginalArg(0) Class665 arg0) {
		@Pc(16) boolean local16 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307] != 0;
		if (Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aClass628_1 != null) {
			Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aClass628_1.method32556(local16);
		}
	}

	@OriginalMember(owner = "client!oz", name = "eg", descriptor = "(Lclient!yf;B)V", line = 5358)
	static final void method29497(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class21.method419(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!oz", name = "kp", descriptor = "(Lclient!gm;Lclient!yf;B)V", line = 6442)
	static final void method29498(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class665 arg1) {
		@Pc(1) byte local1 = 10;
		@Pc(14) int local14 = arg1.anIntArray536[(arg1.anInt5784 -= 308999563) * 2088438307];
		@Pc(27) int local27 = arg1.anIntArray536[(arg1.anInt5784 -= 308999563) * 2088438307];
		Class127.method13157(arg0, local1, local14, local27, arg1);
	}

	@OriginalMember(owner = "client!oz", name = "abh", descriptor = "(Lclient!yf;B)V", line = 9482)
	static final void method29499(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local13 / local23;
	}

	@OriginalMember(owner = "client!oz", name = "aqj", descriptor = "(Lclient!yf;S)V", line = 12367)
	static final void method29500(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub2_1.method14938() == 1 ? 1 : 0;
	}
}
