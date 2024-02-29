package com.jagex;

import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!au")
public class Class156 {

	@OriginalMember(owner = "client!au", name = "p", descriptor = "D")
	static final double aDouble8 = 100.0D;

	@OriginalMember(owner = "client!au", name = "u", descriptor = "[[Z")
	static boolean[][] aBooleanArrayArray11;

	@OriginalMember(owner = "client!au", name = "j", descriptor = "I")
	static final int anInt3236 = 48;

	@OriginalMember(owner = "client!au", name = "c", descriptor = "Z")
	static boolean aBoolean549 = false;

	@OriginalMember(owner = "client!au", name = "v", descriptor = "Z")
	static boolean aBoolean550 = false;

	@OriginalMember(owner = "client!au", name = "l", descriptor = "[I")
	static int[] anIntArray296 = new int[4];

	@OriginalMember(owner = "client!au", name = "y", descriptor = "I")
	static int anInt3238 = 1312565957;

	@OriginalMember(owner = "client!au", name = "w", descriptor = "I")
	static int anInt3237 = 0;

	@OriginalMember(owner = "client!au", name = "t", descriptor = "[I")
	static int[] anIntArray297 = new int[1013];

	@OriginalMember(owner = "client!au", name = "q", descriptor = "[I")
	static int[] anIntArray298 = new int[1000];

	@OriginalMember(owner = "client!au", name = "x", descriptor = "[I")
	static int[] anIntArray299 = new int[1012];

	@OriginalMember(owner = "client!au", name = "d", descriptor = "Lclient!zm;")
	static Class695 aClass695_42 = new Class695();

	@OriginalMember(owner = "client!au", name = "s", descriptor = "I")
	public static int anInt3234 = 1660827629;

	@OriginalMember(owner = "client!au", name = "r", descriptor = "I")
	public static int anInt3235 = -517634255;

	@OriginalMember(owner = "client!au", name = "g", descriptor = "Z")
	static boolean aBoolean551 = true;

	@OriginalMember(owner = "client!au", name = "z", descriptor = "Z")
	static boolean aBoolean552 = false;

	@OriginalMember(owner = "client!au", name = "i", descriptor = "I")
	static int anInt3233 = 0;

	@OriginalMember(owner = "client!au", name = "c", descriptor = "(Ljava/io/File;IB)[B", line = 21)
	static byte[] method24209(@OriginalArg(0) File arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(2) byte[] local2 = new byte[arg1];
			Class567.method31380(arg0, local2, arg1);
			return local2;
		} catch (@Pc(10) IOException local10) {
			return null;
		}
	}

	@OriginalMember(owner = "client!au", name = "<init>", descriptor = "()V", line = 62)
	Class156() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!au", name = "h", descriptor = "()V", line = 74)
	static void method24210() {
		anInt3233 = 0;
		anInt3234 = 1660827629;
		anInt3235 = -517634255;
	}

	@OriginalMember(owner = "client!au", name = "m", descriptor = "()V", line = 74)
	static void method24211() {
		anInt3233 = 0;
		anInt3234 = 1660827629;
		anInt3235 = -517634255;
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "()V", line = 74)
	static void method24212() {
		anInt3233 = 0;
		anInt3234 = 1660827629;
		anInt3235 = -517634255;
	}

	@OriginalMember(owner = "client!au", name = "aj", descriptor = "()V", line = 80)
	public static void method24213() {
		Class609.aClass83_38 = null;
		anInt3238 = 1312565957;
	}

	@OriginalMember(owner = "client!au", name = "ai", descriptor = "()V", line = 80)
	public static void method24214() {
		Class609.aClass83_38 = null;
		anInt3238 = 1312565957;
	}

	@OriginalMember(owner = "client!au", name = "ag", descriptor = "()V", line = 80)
	public static void method24215() {
		Class609.aClass83_38 = null;
		anInt3238 = 1312565957;
	}

	@OriginalMember(owner = "client!au", name = "al", descriptor = "()V", line = 80)
	public static void method24216() {
		Class609.aClass83_38 = null;
		anInt3238 = 1312565957;
	}

	@OriginalMember(owner = "client!au", name = "ao", descriptor = "()V", line = 85)
	public static void method24217() {
		anInt3238 = 1312565957;
	}

	@OriginalMember(owner = "client!au", name = "ak", descriptor = "()V", line = 89)
	public static void method24218() {
		@Pc(3) int local3 = client.aClass517_1.method30411();
		@Pc(7) int local7 = client.aClass517_1.method30417();
		aBooleanArrayArray11 = new boolean[local3 >> 3][local7 >> 3];
	}

	@OriginalMember(owner = "client!au", name = "au", descriptor = "()V", line = 89)
	public static void method24219() {
		@Pc(3) int local3 = client.aClass517_1.method30411();
		@Pc(7) int local7 = client.aClass517_1.method30417();
		aBooleanArrayArray11 = new boolean[local3 >> 3][local7 >> 3];
	}

	@OriginalMember(owner = "client!au", name = "ax", descriptor = "()V", line = 89)
	public static void method24220() {
		@Pc(3) int local3 = client.aClass517_1.method30411();
		@Pc(7) int local7 = client.aClass517_1.method30417();
		aBooleanArrayArray11 = new boolean[local3 >> 3][local7 >> 3];
	}

	@OriginalMember(owner = "client!au", name = "ar", descriptor = "(Lclient!dx;)V", line = 95)
	static void method24221(@OriginalArg(0) Class86 arg0) {
		if (anInt3238 * 1936210931 != Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aByte100 && client.aClass517_1.method30435() != null) {
			Class280.method26667();
			if (Class405.method28534(arg0, Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aByte100)) {
				anInt3238 = Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aByte100 * -1312565957;
			}
		}
	}

	@OriginalMember(owner = "client!au", name = "av", descriptor = "(Lclient!dx;I)Z", line = 102)
	static boolean method24222(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1) {
		arg0.method20012();
		Class280.method26667();
		if (!arg0.method20021()) {
			return false;
		}
		@Pc(14) int local14 = client.aClass517_1.method30411();
		@Pc(18) int local18 = client.aClass517_1.method30417();
		@Pc(22) Class474 local22 = client.aClass517_1.method30441();
		@Pc(26) Class556 local26 = client.aClass517_1.method30435();
		@Pc(28) int local28 = arg1;
		if (Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3 != null) {
			@Pc(37) int local37 = Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.anIntArray274[0] >> 3;
			@Pc(44) int local44 = Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.anIntArray275[0] >> 3;
			if (local37 >= 0 && local37 < aBooleanArrayArray11.length && local44 >= 0 && local44 < aBooleanArrayArray11[local37].length && aBooleanArrayArray11[local37][local44]) {
				local28 = 0;
			}
		}
		@Pc(70) int local70 = local14 / 2;
		@Pc(72) byte local72 = 0;
		@Pc(74) byte local74 = 0;
		@Pc(76) boolean local76 = true;
		@Pc(78) int local78;
		@Pc(92) int local92;
		for (local78 = local72; local78 < local72 + local14; local78++) {
			for (@Pc(85) int local85 = local74; local85 < local18 + local74; local85++) {
				for (local92 = local28; local92 <= 3; local92++) {
					if (local92 < arg1 || local22.method29671(arg1, local92, local78, local85)) {
						@Pc(108) int local108 = local92;
						if (local22.method29665(local78, local85)) {
							local108 = local92 - 1;
						}
						if (local108 >= 0) {
							local76 &= Class290.method26995(local108, local78, local85);
						}
					}
				}
			}
		}
		if (!local76) {
			return false;
		}
		local78 = local14 * 4 + 48 + 48;
		@Pc(148) int[] local148 = new int[local78 * local78];
		for (local92 = 0; local92 < local148.length; local92++) {
			local148[local92] = 0;
		}
		@Pc(162) Class92_Sub1 local162 = null;
		@Pc(164) byte local164 = 0;
		@Pc(166) byte local166 = 0;
		if (aBoolean550) {
			Class609.aClass83_38 = arg0.method20102(local78, local78, false, true);
			local162 = arg0.method20063();
			local162.method23513(0, Class609.aClass83_38.method18173());
			@Pc(188) Interface20 local188 = arg0.method20064(local78, local78);
			local162.method23512(local188);
			arg0.method19968(local162);
			local70 = local14;
			local164 = 48;
			local166 = 48;
			arg0.method20125(1, 0);
		} else {
			Class609.aClass83_38 = arg0.method20010(local148, 0, local78, local78, local78);
		}
		client.aClass517_1.method30443().method32324();
		@Pc(253) int local253 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 238 - 10) | 0xFF000000;
		@Pc(266) int local266 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00) << 16;
		@Pc(285) int local285 = (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D);
		@Pc(297) boolean[][] local297 = new boolean[2 + 1 + local70][local70 + 2 + 1];
		arg0.method20080(anIntArray296);
		arg0.method20078();
		@Pc(318) int local318;
		@Pc(320) int local320;
		@Pc(322) int local322;
		@Pc(328) int local328;
		for (@Pc(304) int local304 = local72; local304 < local72 + local14; local304 += local70) {
			for (@Pc(311) int local311 = local74; local311 < local18 + local74; local311 += local70) {
				local318 = local164;
				local320 = local166;
				local322 = local304;
				if (local304 > 0) {
					local322 = local304 - 1;
					local318 = local164 + 4;
				}
				local328 = local311;
				if (local311 > 0) {
					local328 = local311 - 1;
				}
				@Pc(335) int local335 = local304 + local70;
				if (local335 < local14) {
					local335++;
				}
				@Pc(343) int local343 = local311 + local70;
				if (local343 < local18) {
					local343++;
					local320 = local166 + 4;
				}
				if (aBoolean549) {
					arg0.method20299();
				} else {
					arg0.method20151(0, 0, local318 + local70 * 4, local70 * 4 + local320);
				}
				arg0.method20125(3, -16777216);
				@Pc(373) int local373 = local70;
				if (local70 > local14 - 1) {
					local373 = local14 - 1;
				}
				for (@Pc(384) int local384 = local28; local384 <= 3; local384++) {
					@Pc(389) int local389;
					@Pc(394) int local394;
					for (local389 = 0; local389 <= local373; local389++) {
						for (local394 = 0; local394 <= local373; local394++) {
							local297[local389][local394] = local384 < arg1 || local22.method29671(arg1, local384, local322 + local389, local394 + local328);
						}
					}
					local26.aClass88Array2[local384].method5540(local164, local166, 1024, local322, local328, local335, local343, local297);
					for (local389 = -4; local389 < local70; local389++) {
						for (local394 = -4; local394 < local70; local394++) {
							@Pc(451) int local451 = local389 + local304;
							@Pc(455) int local455 = local394 + local311;
							if (local451 >= local72 && local455 >= local74 && (local384 < arg1 || local22.method29671(arg1, local384, local451, local455))) {
								@Pc(474) int local474 = local384;
								if (local22.method29665(local451, local455)) {
									local474 = local384 - 1;
								}
								if (local474 >= 0) {
									Class379.method28308(arg0, local474, local451, local455, local389 * 4 + local318, local320 + (local70 - local394) * 4 - 4, local253, local266);
								}
							}
						}
					}
				}
				arg0.method20088(local318, local320, local70 * 4, local70 * 4, local285, 2);
				arg0.method20012();
				if (!aBoolean550) {
					Class609.aClass83_38.method18213((local304 - local72) * 4 + 48, local18 * 4 + 48 - (local311 - local74) * 4 - local70 * 4, local70 * 4, local70 * 4, local318, local320);
					if (aBoolean549) {
						Class609.aClass83_38.method18123(256, 0);
						try {
							arg0.method19926();
							Class281.method26679(2000L);
						} catch (@Pc(572) Exception local572) {
						}
					}
				}
			}
		}
		if (aBoolean550) {
			arg0.method19972(local162);
			if (aBoolean549) {
				Class609.aClass83_38.method18123(256, 0);
				try {
					arg0.method19926();
					Class281.method26679(2000L);
				} catch (@Pc(601) Exception local601) {
				}
			}
		}
		arg0.method20299();
		arg0.method20104(anIntArray296[0], anIntArray296[1], anIntArray296[2], anIntArray296[3]);
		arg0.method20125(1, 1);
		Class430.method28815();
		anInt3237 = 0;
		aClass695_42.method36380();
		if (!aBoolean552) {
			Class143_Sub28.method15928(arg1);
			@Pc(637) Class529 local637 = client.aClass517_1.method30420();
			if (local637 != null) {
				Class251.aClass35_Sub10_3.method17150(1024, 64);
				@Pc(649) Class595 local649 = client.aClass517_1.method30409();
				for (local318 = 0; local318 < local637.anInt5170 * -942354647; local318++) {
					local320 = local637.anIntArray481[local318];
					if (Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aByte100 == local320 >> 28) {
						local322 = (local320 >> 14 & 0x3FFF) - local649.anInt5504 * -424199969;
						local328 = (local320 & 0x3FFF) - local649.anInt5506 * -1166289421;
						if (local322 >= 0 && local322 < local14 && local328 >= 0 && local328 < local18) {
							aClass695_42.method36383(new Class77_Sub40(local318));
						} else {
							@Pc(715) Class302 local715 = (Class302) Class251.aClass35_Sub10_3.method18319(local637.anIntArray480[local318]);
							if (local715.anIntArray422 != null && local322 + local715.anInt4046 * -321707117 >= 0 && local322 + local715.anInt4036 * 1863424643 < local14 && local328 + local715.anInt4039 * -967887583 >= 0 && local328 + local715.anInt4033 * 148212907 < local18) {
								aClass695_42.method36383(new Class77_Sub40(local318));
							}
						}
					}
				}
				Class251.aClass35_Sub10_3.method17150(128, 64);
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!au", name = "ad", descriptor = "(Lclient!dx;I)Z", line = 102)
	static boolean method24223(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1) {
		arg0.method20012();
		Class280.method26667();
		if (!arg0.method20021()) {
			return false;
		}
		@Pc(14) int local14 = client.aClass517_1.method30411();
		@Pc(18) int local18 = client.aClass517_1.method30417();
		@Pc(22) Class474 local22 = client.aClass517_1.method30441();
		@Pc(26) Class556 local26 = client.aClass517_1.method30435();
		@Pc(28) int local28 = arg1;
		if (Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3 != null) {
			@Pc(37) int local37 = Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.anIntArray274[0] >> 3;
			@Pc(44) int local44 = Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.anIntArray275[0] >> 3;
			if (local37 >= 0 && local37 < aBooleanArrayArray11.length && local44 >= 0 && local44 < aBooleanArrayArray11[local37].length && aBooleanArrayArray11[local37][local44]) {
				local28 = 0;
			}
		}
		@Pc(70) int local70 = local14 / 2;
		@Pc(72) byte local72 = 0;
		@Pc(74) byte local74 = 0;
		@Pc(76) boolean local76 = true;
		@Pc(78) int local78;
		@Pc(92) int local92;
		for (local78 = local72; local78 < local72 + local14; local78++) {
			for (@Pc(85) int local85 = local74; local85 < local18 + local74; local85++) {
				for (local92 = local28; local92 <= 3; local92++) {
					if (local92 < arg1 || local22.method29671(arg1, local92, local78, local85)) {
						@Pc(108) int local108 = local92;
						if (local22.method29665(local78, local85)) {
							local108 = local92 - 1;
						}
						if (local108 >= 0) {
							local76 &= Class290.method26995(local108, local78, local85);
						}
					}
				}
			}
		}
		if (!local76) {
			return false;
		}
		local78 = local14 * 4 + 48 + 48;
		@Pc(148) int[] local148 = new int[local78 * local78];
		for (local92 = 0; local92 < local148.length; local92++) {
			local148[local92] = 0;
		}
		@Pc(162) Class92_Sub1 local162 = null;
		@Pc(164) byte local164 = 0;
		@Pc(166) byte local166 = 0;
		if (aBoolean550) {
			Class609.aClass83_38 = arg0.method20102(local78, local78, false, true);
			local162 = arg0.method20063();
			local162.method23513(0, Class609.aClass83_38.method18173());
			@Pc(188) Interface20 local188 = arg0.method20064(local78, local78);
			local162.method23512(local188);
			arg0.method19968(local162);
			local70 = local14;
			local164 = 48;
			local166 = 48;
			arg0.method20125(1, 0);
		} else {
			Class609.aClass83_38 = arg0.method20010(local148, 0, local78, local78, local78);
		}
		client.aClass517_1.method30443().method32324();
		@Pc(253) int local253 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 238 - 10) | 0xFF000000;
		@Pc(266) int local266 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00) << 16;
		@Pc(285) int local285 = (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D);
		@Pc(297) boolean[][] local297 = new boolean[2 + 1 + local70][local70 + 2 + 1];
		arg0.method20080(anIntArray296);
		arg0.method20078();
		@Pc(318) int local318;
		@Pc(320) int local320;
		@Pc(322) int local322;
		@Pc(328) int local328;
		for (@Pc(304) int local304 = local72; local304 < local72 + local14; local304 += local70) {
			for (@Pc(311) int local311 = local74; local311 < local18 + local74; local311 += local70) {
				local318 = local164;
				local320 = local166;
				local322 = local304;
				if (local304 > 0) {
					local322 = local304 - 1;
					local318 = local164 + 4;
				}
				local328 = local311;
				if (local311 > 0) {
					local328 = local311 - 1;
				}
				@Pc(335) int local335 = local304 + local70;
				if (local335 < local14) {
					local335++;
				}
				@Pc(343) int local343 = local311 + local70;
				if (local343 < local18) {
					local343++;
					local320 = local166 + 4;
				}
				if (aBoolean549) {
					arg0.method20299();
				} else {
					arg0.method20151(0, 0, local318 + local70 * 4, local70 * 4 + local320);
				}
				arg0.method20125(3, -16777216);
				@Pc(373) int local373 = local70;
				if (local70 > local14 - 1) {
					local373 = local14 - 1;
				}
				for (@Pc(384) int local384 = local28; local384 <= 3; local384++) {
					@Pc(389) int local389;
					@Pc(394) int local394;
					for (local389 = 0; local389 <= local373; local389++) {
						for (local394 = 0; local394 <= local373; local394++) {
							local297[local389][local394] = local384 < arg1 || local22.method29671(arg1, local384, local322 + local389, local394 + local328);
						}
					}
					local26.aClass88Array2[local384].method5540(local164, local166, 1024, local322, local328, local335, local343, local297);
					for (local389 = -4; local389 < local70; local389++) {
						for (local394 = -4; local394 < local70; local394++) {
							@Pc(451) int local451 = local389 + local304;
							@Pc(455) int local455 = local394 + local311;
							if (local451 >= local72 && local455 >= local74 && (local384 < arg1 || local22.method29671(arg1, local384, local451, local455))) {
								@Pc(474) int local474 = local384;
								if (local22.method29665(local451, local455)) {
									local474 = local384 - 1;
								}
								if (local474 >= 0) {
									Class379.method28308(arg0, local474, local451, local455, local389 * 4 + local318, local320 + (local70 - local394) * 4 - 4, local253, local266);
								}
							}
						}
					}
				}
				arg0.method20088(local318, local320, local70 * 4, local70 * 4, local285, 2);
				arg0.method20012();
				if (!aBoolean550) {
					Class609.aClass83_38.method18213((local304 - local72) * 4 + 48, local18 * 4 + 48 - (local311 - local74) * 4 - local70 * 4, local70 * 4, local70 * 4, local318, local320);
					if (aBoolean549) {
						Class609.aClass83_38.method18123(256, 0);
						try {
							arg0.method19926();
							Class281.method26679(2000L);
						} catch (@Pc(572) Exception local572) {
						}
					}
				}
			}
		}
		if (aBoolean550) {
			arg0.method19972(local162);
			if (aBoolean549) {
				Class609.aClass83_38.method18123(256, 0);
				try {
					arg0.method19926();
					Class281.method26679(2000L);
				} catch (@Pc(601) Exception local601) {
				}
			}
		}
		arg0.method20299();
		arg0.method20104(anIntArray296[0], anIntArray296[1], anIntArray296[2], anIntArray296[3]);
		arg0.method20125(1, 1);
		Class430.method28815();
		anInt3237 = 0;
		aClass695_42.method36380();
		if (!aBoolean552) {
			Class143_Sub28.method15928(arg1);
			@Pc(637) Class529 local637 = client.aClass517_1.method30420();
			if (local637 != null) {
				Class251.aClass35_Sub10_3.method17150(1024, 64);
				@Pc(649) Class595 local649 = client.aClass517_1.method30409();
				for (local318 = 0; local318 < local637.anInt5170 * -942354647; local318++) {
					local320 = local637.anIntArray481[local318];
					if (Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aByte100 == local320 >> 28) {
						local322 = (local320 >> 14 & 0x3FFF) - local649.anInt5504 * -424199969;
						local328 = (local320 & 0x3FFF) - local649.anInt5506 * -1166289421;
						if (local322 >= 0 && local322 < local14 && local328 >= 0 && local328 < local18) {
							aClass695_42.method36383(new Class77_Sub40(local318));
						} else {
							@Pc(715) Class302 local715 = (Class302) Class251.aClass35_Sub10_3.method18319(local637.anIntArray480[local318]);
							if (local715.anIntArray422 != null && local322 + local715.anInt4046 * -321707117 >= 0 && local322 + local715.anInt4036 * 1863424643 < local14 && local328 + local715.anInt4039 * -967887583 >= 0 && local328 + local715.anInt4033 * 148212907 < local18) {
								aClass695_42.method36383(new Class77_Sub40(local318));
							}
						}
					}
				}
				Class251.aClass35_Sub10_3.method17150(128, 64);
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!au", name = "ac", descriptor = "(Lclient!dx;I)Z", line = 102)
	static boolean method24224(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1) {
		arg0.method20012();
		Class280.method26667();
		if (!arg0.method20021()) {
			return false;
		}
		@Pc(14) int local14 = client.aClass517_1.method30411();
		@Pc(18) int local18 = client.aClass517_1.method30417();
		@Pc(22) Class474 local22 = client.aClass517_1.method30441();
		@Pc(26) Class556 local26 = client.aClass517_1.method30435();
		@Pc(28) int local28 = arg1;
		if (Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3 != null) {
			@Pc(37) int local37 = Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.anIntArray274[0] >> 3;
			@Pc(44) int local44 = Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.anIntArray275[0] >> 3;
			if (local37 >= 0 && local37 < aBooleanArrayArray11.length && local44 >= 0 && local44 < aBooleanArrayArray11[local37].length && aBooleanArrayArray11[local37][local44]) {
				local28 = 0;
			}
		}
		@Pc(70) int local70 = local14 / 2;
		@Pc(72) byte local72 = 0;
		@Pc(74) byte local74 = 0;
		@Pc(76) boolean local76 = true;
		@Pc(78) int local78;
		@Pc(92) int local92;
		for (local78 = local72; local78 < local72 + local14; local78++) {
			for (@Pc(85) int local85 = local74; local85 < local18 + local74; local85++) {
				for (local92 = local28; local92 <= 3; local92++) {
					if (local92 < arg1 || local22.method29671(arg1, local92, local78, local85)) {
						@Pc(108) int local108 = local92;
						if (local22.method29665(local78, local85)) {
							local108 = local92 - 1;
						}
						if (local108 >= 0) {
							local76 &= Class290.method26995(local108, local78, local85);
						}
					}
				}
			}
		}
		if (!local76) {
			return false;
		}
		local78 = local14 * 4 + 48 + 48;
		@Pc(148) int[] local148 = new int[local78 * local78];
		for (local92 = 0; local92 < local148.length; local92++) {
			local148[local92] = 0;
		}
		@Pc(162) Class92_Sub1 local162 = null;
		@Pc(164) byte local164 = 0;
		@Pc(166) byte local166 = 0;
		if (aBoolean550) {
			Class609.aClass83_38 = arg0.method20102(local78, local78, false, true);
			local162 = arg0.method20063();
			local162.method23513(0, Class609.aClass83_38.method18173());
			@Pc(188) Interface20 local188 = arg0.method20064(local78, local78);
			local162.method23512(local188);
			arg0.method19968(local162);
			local70 = local14;
			local164 = 48;
			local166 = 48;
			arg0.method20125(1, 0);
		} else {
			Class609.aClass83_38 = arg0.method20010(local148, 0, local78, local78, local78);
		}
		client.aClass517_1.method30443().method32324();
		@Pc(253) int local253 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 238 - 10) | 0xFF000000;
		@Pc(266) int local266 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00) << 16;
		@Pc(285) int local285 = (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D);
		@Pc(297) boolean[][] local297 = new boolean[2 + 1 + local70][local70 + 2 + 1];
		arg0.method20080(anIntArray296);
		arg0.method20078();
		@Pc(318) int local318;
		@Pc(320) int local320;
		@Pc(322) int local322;
		@Pc(328) int local328;
		for (@Pc(304) int local304 = local72; local304 < local72 + local14; local304 += local70) {
			for (@Pc(311) int local311 = local74; local311 < local18 + local74; local311 += local70) {
				local318 = local164;
				local320 = local166;
				local322 = local304;
				if (local304 > 0) {
					local322 = local304 - 1;
					local318 = local164 + 4;
				}
				local328 = local311;
				if (local311 > 0) {
					local328 = local311 - 1;
				}
				@Pc(335) int local335 = local304 + local70;
				if (local335 < local14) {
					local335++;
				}
				@Pc(343) int local343 = local311 + local70;
				if (local343 < local18) {
					local343++;
					local320 = local166 + 4;
				}
				if (aBoolean549) {
					arg0.method20299();
				} else {
					arg0.method20151(0, 0, local318 + local70 * 4, local70 * 4 + local320);
				}
				arg0.method20125(3, -16777216);
				@Pc(373) int local373 = local70;
				if (local70 > local14 - 1) {
					local373 = local14 - 1;
				}
				for (@Pc(384) int local384 = local28; local384 <= 3; local384++) {
					@Pc(389) int local389;
					@Pc(394) int local394;
					for (local389 = 0; local389 <= local373; local389++) {
						for (local394 = 0; local394 <= local373; local394++) {
							local297[local389][local394] = local384 < arg1 || local22.method29671(arg1, local384, local322 + local389, local394 + local328);
						}
					}
					local26.aClass88Array2[local384].method5540(local164, local166, 1024, local322, local328, local335, local343, local297);
					for (local389 = -4; local389 < local70; local389++) {
						for (local394 = -4; local394 < local70; local394++) {
							@Pc(451) int local451 = local389 + local304;
							@Pc(455) int local455 = local394 + local311;
							if (local451 >= local72 && local455 >= local74 && (local384 < arg1 || local22.method29671(arg1, local384, local451, local455))) {
								@Pc(474) int local474 = local384;
								if (local22.method29665(local451, local455)) {
									local474 = local384 - 1;
								}
								if (local474 >= 0) {
									Class379.method28308(arg0, local474, local451, local455, local389 * 4 + local318, local320 + (local70 - local394) * 4 - 4, local253, local266);
								}
							}
						}
					}
				}
				arg0.method20088(local318, local320, local70 * 4, local70 * 4, local285, 2);
				arg0.method20012();
				if (!aBoolean550) {
					Class609.aClass83_38.method18213((local304 - local72) * 4 + 48, local18 * 4 + 48 - (local311 - local74) * 4 - local70 * 4, local70 * 4, local70 * 4, local318, local320);
					if (aBoolean549) {
						Class609.aClass83_38.method18123(256, 0);
						try {
							arg0.method19926();
							Class281.method26679(2000L);
						} catch (@Pc(572) Exception local572) {
						}
					}
				}
			}
		}
		if (aBoolean550) {
			arg0.method19972(local162);
			if (aBoolean549) {
				Class609.aClass83_38.method18123(256, 0);
				try {
					arg0.method19926();
					Class281.method26679(2000L);
				} catch (@Pc(601) Exception local601) {
				}
			}
		}
		arg0.method20299();
		arg0.method20104(anIntArray296[0], anIntArray296[1], anIntArray296[2], anIntArray296[3]);
		arg0.method20125(1, 1);
		Class430.method28815();
		anInt3237 = 0;
		aClass695_42.method36380();
		if (!aBoolean552) {
			Class143_Sub28.method15928(arg1);
			@Pc(637) Class529 local637 = client.aClass517_1.method30420();
			if (local637 != null) {
				Class251.aClass35_Sub10_3.method17150(1024, 64);
				@Pc(649) Class595 local649 = client.aClass517_1.method30409();
				for (local318 = 0; local318 < local637.anInt5170 * -942354647; local318++) {
					local320 = local637.anIntArray481[local318];
					if (Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aByte100 == local320 >> 28) {
						local322 = (local320 >> 14 & 0x3FFF) - local649.anInt5504 * -424199969;
						local328 = (local320 & 0x3FFF) - local649.anInt5506 * -1166289421;
						if (local322 >= 0 && local322 < local14 && local328 >= 0 && local328 < local18) {
							aClass695_42.method36383(new Class77_Sub40(local318));
						} else {
							@Pc(715) Class302 local715 = (Class302) Class251.aClass35_Sub10_3.method18319(local637.anIntArray480[local318]);
							if (local715.anIntArray422 != null && local322 + local715.anInt4046 * -321707117 >= 0 && local322 + local715.anInt4036 * 1863424643 < local14 && local328 + local715.anInt4039 * -967887583 >= 0 && local328 + local715.anInt4033 * 148212907 < local18) {
								aClass695_42.method36383(new Class77_Sub40(local318));
							}
						}
					}
				}
				Class251.aClass35_Sub10_3.method17150(128, 64);
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!au", name = "at", descriptor = "(Lclient!dx;I)Z", line = 102)
	static boolean method24225(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1) {
		arg0.method20012();
		Class280.method26667();
		if (!arg0.method20021()) {
			return false;
		}
		@Pc(14) int local14 = client.aClass517_1.method30411();
		@Pc(18) int local18 = client.aClass517_1.method30417();
		@Pc(22) Class474 local22 = client.aClass517_1.method30441();
		@Pc(26) Class556 local26 = client.aClass517_1.method30435();
		@Pc(28) int local28 = arg1;
		if (Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3 != null) {
			@Pc(37) int local37 = Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.anIntArray274[0] >> 3;
			@Pc(44) int local44 = Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.anIntArray275[0] >> 3;
			if (local37 >= 0 && local37 < aBooleanArrayArray11.length && local44 >= 0 && local44 < aBooleanArrayArray11[local37].length && aBooleanArrayArray11[local37][local44]) {
				local28 = 0;
			}
		}
		@Pc(70) int local70 = local14 / 2;
		@Pc(72) byte local72 = 0;
		@Pc(74) byte local74 = 0;
		@Pc(76) boolean local76 = true;
		@Pc(78) int local78;
		@Pc(92) int local92;
		for (local78 = local72; local78 < local72 + local14; local78++) {
			for (@Pc(85) int local85 = local74; local85 < local18 + local74; local85++) {
				for (local92 = local28; local92 <= 3; local92++) {
					if (local92 < arg1 || local22.method29671(arg1, local92, local78, local85)) {
						@Pc(108) int local108 = local92;
						if (local22.method29665(local78, local85)) {
							local108 = local92 - 1;
						}
						if (local108 >= 0) {
							local76 &= Class290.method26995(local108, local78, local85);
						}
					}
				}
			}
		}
		if (!local76) {
			return false;
		}
		local78 = local14 * 4 + 48 + 48;
		@Pc(148) int[] local148 = new int[local78 * local78];
		for (local92 = 0; local92 < local148.length; local92++) {
			local148[local92] = 0;
		}
		@Pc(162) Class92_Sub1 local162 = null;
		@Pc(164) byte local164 = 0;
		@Pc(166) byte local166 = 0;
		if (aBoolean550) {
			Class609.aClass83_38 = arg0.method20102(local78, local78, false, true);
			local162 = arg0.method20063();
			local162.method23513(0, Class609.aClass83_38.method18173());
			@Pc(188) Interface20 local188 = arg0.method20064(local78, local78);
			local162.method23512(local188);
			arg0.method19968(local162);
			local70 = local14;
			local164 = 48;
			local166 = 48;
			arg0.method20125(1, 0);
		} else {
			Class609.aClass83_38 = arg0.method20010(local148, 0, local78, local78, local78);
		}
		client.aClass517_1.method30443().method32324();
		@Pc(253) int local253 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 238 - 10) | 0xFF000000;
		@Pc(266) int local266 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00) << 16;
		@Pc(285) int local285 = (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D);
		@Pc(297) boolean[][] local297 = new boolean[2 + 1 + local70][local70 + 2 + 1];
		arg0.method20080(anIntArray296);
		arg0.method20078();
		@Pc(318) int local318;
		@Pc(320) int local320;
		@Pc(322) int local322;
		@Pc(328) int local328;
		for (@Pc(304) int local304 = local72; local304 < local72 + local14; local304 += local70) {
			for (@Pc(311) int local311 = local74; local311 < local18 + local74; local311 += local70) {
				local318 = local164;
				local320 = local166;
				local322 = local304;
				if (local304 > 0) {
					local322 = local304 - 1;
					local318 = local164 + 4;
				}
				local328 = local311;
				if (local311 > 0) {
					local328 = local311 - 1;
				}
				@Pc(335) int local335 = local304 + local70;
				if (local335 < local14) {
					local335++;
				}
				@Pc(343) int local343 = local311 + local70;
				if (local343 < local18) {
					local343++;
					local320 = local166 + 4;
				}
				if (aBoolean549) {
					arg0.method20299();
				} else {
					arg0.method20151(0, 0, local318 + local70 * 4, local70 * 4 + local320);
				}
				arg0.method20125(3, -16777216);
				@Pc(373) int local373 = local70;
				if (local70 > local14 - 1) {
					local373 = local14 - 1;
				}
				for (@Pc(384) int local384 = local28; local384 <= 3; local384++) {
					@Pc(389) int local389;
					@Pc(394) int local394;
					for (local389 = 0; local389 <= local373; local389++) {
						for (local394 = 0; local394 <= local373; local394++) {
							local297[local389][local394] = local384 < arg1 || local22.method29671(arg1, local384, local322 + local389, local394 + local328);
						}
					}
					local26.aClass88Array2[local384].method5540(local164, local166, 1024, local322, local328, local335, local343, local297);
					for (local389 = -4; local389 < local70; local389++) {
						for (local394 = -4; local394 < local70; local394++) {
							@Pc(451) int local451 = local389 + local304;
							@Pc(455) int local455 = local394 + local311;
							if (local451 >= local72 && local455 >= local74 && (local384 < arg1 || local22.method29671(arg1, local384, local451, local455))) {
								@Pc(474) int local474 = local384;
								if (local22.method29665(local451, local455)) {
									local474 = local384 - 1;
								}
								if (local474 >= 0) {
									Class379.method28308(arg0, local474, local451, local455, local389 * 4 + local318, local320 + (local70 - local394) * 4 - 4, local253, local266);
								}
							}
						}
					}
				}
				arg0.method20088(local318, local320, local70 * 4, local70 * 4, local285, 2);
				arg0.method20012();
				if (!aBoolean550) {
					Class609.aClass83_38.method18213((local304 - local72) * 4 + 48, local18 * 4 + 48 - (local311 - local74) * 4 - local70 * 4, local70 * 4, local70 * 4, local318, local320);
					if (aBoolean549) {
						Class609.aClass83_38.method18123(256, 0);
						try {
							arg0.method19926();
							Class281.method26679(2000L);
						} catch (@Pc(572) Exception local572) {
						}
					}
				}
			}
		}
		if (aBoolean550) {
			arg0.method19972(local162);
			if (aBoolean549) {
				Class609.aClass83_38.method18123(256, 0);
				try {
					arg0.method19926();
					Class281.method26679(2000L);
				} catch (@Pc(601) Exception local601) {
				}
			}
		}
		arg0.method20299();
		arg0.method20104(anIntArray296[0], anIntArray296[1], anIntArray296[2], anIntArray296[3]);
		arg0.method20125(1, 1);
		Class430.method28815();
		anInt3237 = 0;
		aClass695_42.method36380();
		if (!aBoolean552) {
			Class143_Sub28.method15928(arg1);
			@Pc(637) Class529 local637 = client.aClass517_1.method30420();
			if (local637 != null) {
				Class251.aClass35_Sub10_3.method17150(1024, 64);
				@Pc(649) Class595 local649 = client.aClass517_1.method30409();
				for (local318 = 0; local318 < local637.anInt5170 * -942354647; local318++) {
					local320 = local637.anIntArray481[local318];
					if (Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aByte100 == local320 >> 28) {
						local322 = (local320 >> 14 & 0x3FFF) - local649.anInt5504 * -424199969;
						local328 = (local320 & 0x3FFF) - local649.anInt5506 * -1166289421;
						if (local322 >= 0 && local322 < local14 && local328 >= 0 && local328 < local18) {
							aClass695_42.method36383(new Class77_Sub40(local318));
						} else {
							@Pc(715) Class302 local715 = (Class302) Class251.aClass35_Sub10_3.method18319(local637.anIntArray480[local318]);
							if (local715.anIntArray422 != null && local322 + local715.anInt4046 * -321707117 >= 0 && local322 + local715.anInt4036 * 1863424643 < local14 && local328 + local715.anInt4039 * -967887583 >= 0 && local328 + local715.anInt4033 * 148212907 < local18) {
								aClass695_42.method36383(new Class77_Sub40(local318));
							}
						}
					}
				}
				Class251.aClass35_Sub10_3.method17150(128, 64);
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!au", name = "ae", descriptor = "(I)V", line = 272)
	static void method24226(@OriginalArg(0) int arg0) {
		anInt3237 = 0;
		@Pc(5) int local5 = client.aClass517_1.method30411();
		@Pc(9) int local9 = client.aClass517_1.method30417();
		@Pc(13) Class474 local13 = client.aClass517_1.method30441();
		@Pc(17) Class556 local17 = client.aClass517_1.method30435();
		@Pc(21) Class35_Sub12 local21 = client.aClass517_1.method30444();
		@Pc(23) int local23 = arg0;
		if (Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3 != null) {
			@Pc(32) int local32 = Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.anIntArray274[0] >> 3;
			@Pc(39) int local39 = Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.anIntArray275[0] >> 3;
			if (local32 >= 0 && local32 < aBooleanArrayArray11.length && local39 >= 0 && local39 < aBooleanArrayArray11[local32].length && aBooleanArrayArray11[local32][local39]) {
				local23 = 0;
			}
		}
		for (@Pc(63) int local63 = 0; local63 < local5; local63++) {
			for (@Pc(68) int local68 = 0; local68 < local9; local68++) {
				for (@Pc(73) int local73 = local23; local73 <= arg0 + 1 && local73 <= 3; local73++) {
					if ((local73 < arg0 || local13.method29671(arg0, local73, local63, local68)) && !Class325.method27517((Interface61) local17.method31195(local73, local63, local68), local21, local63, local68) && !Class325.method27517((Interface61) local17.method31191(local73, local63, local68, client.anInterface63_1), local21, local63, local68) && !Class325.method27517((Interface61) local17.method31179(local73, local63, local68), local21, local63, local68) && Class325.method27517((Interface61) local17.method31187(local73, local63, local68), local21, local63, local68)) {
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!au", name = "ah", descriptor = "(Lclient!sy;Lclient!anu;II)Z", line = 303)
	static boolean method24227(@OriginalArg(0) Interface61 arg0, @OriginalArg(1) Class35_Sub12 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 == null) {
			return false;
		}
		@Pc(12) Class599 local12 = (Class599) arg1.method18319(arg0.method13060());
		if (local12.aBoolean830 && !client.aBoolean613) {
			return false;
		}
		@Pc(24) int local24 = local12.anInt5544 * 196422211;
		if (local12.anIntArray511 != null) {
			for (@Pc(29) int local29 = 0; local29 < local12.anIntArray511.length; local29++) {
				if (local12.anIntArray511[local29] != -1) {
					@Pc(49) Class599 local49 = (Class599) arg1.method18319(local12.anIntArray511[local29]);
					if (local49.anInt5544 * 196422211 >= 0) {
						local24 = local49.anInt5544 * 196422211;
					}
				}
			}
		}
		if (local24 < 0) {
			return false;
		}
		anIntArray299[anInt3237 * -463245253] = local12.anInt5510 * -1562722583;
		anIntArray297[anInt3237 * -463245253] = arg2;
		anIntArray298[anInt3237 * -463245253] = arg3;
		anInt3237 += 138799347;
		return true;
	}

	@OriginalMember(owner = "client!au", name = "as", descriptor = "(III)Z", line = 326)
	static boolean method24228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class556 local3 = client.aClass517_1.method30435();
		@Pc(5) boolean local5 = true;
		@Pc(13) Interface61 local13 = (Interface61) local3.method31179(arg0, arg1, arg2);
		if (local13 != null) {
			local5 &= Class438.method28918(local13);
		}
		local13 = (Interface61) local3.method31191(arg0, arg1, arg2, client.anInterface63_1);
		if (local13 != null) {
			local5 &= Class438.method28918(local13);
		}
		local13 = (Interface61) local3.method31195(arg0, arg1, arg2);
		if (local13 != null) {
			local5 &= Class438.method28918(local13);
		}
		return local5;
	}

	@OriginalMember(owner = "client!au", name = "aq", descriptor = "(III)Z", line = 326)
	static boolean method24229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class556 local3 = client.aClass517_1.method30435();
		@Pc(5) boolean local5 = true;
		@Pc(13) Interface61 local13 = (Interface61) local3.method31179(arg0, arg1, arg2);
		if (local13 != null) {
			local5 &= Class438.method28918(local13);
		}
		local13 = (Interface61) local3.method31191(arg0, arg1, arg2, client.anInterface63_1);
		if (local13 != null) {
			local5 &= Class438.method28918(local13);
		}
		local13 = (Interface61) local3.method31195(arg0, arg1, arg2);
		if (local13 != null) {
			local5 &= Class438.method28918(local13);
		}
		return local5;
	}

	@OriginalMember(owner = "client!au", name = "am", descriptor = "(Lclient!dx;IIIIIII)V", line = 347)
	static void method24230(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(3) Class556 local3 = client.aClass517_1.method30435();
		@Pc(11) Interface61 local11 = (Interface61) local3.method31179(arg1, arg2, arg3);
		@Pc(24) Class599 local24;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(50) int local50;
		if (local11 != null) {
			local24 = (Class599) client.aClass517_1.method30444().method18319(local11.method13060());
			local30 = local11.method13058() & 0x3;
			local34 = local11.method13057();
			if (local24.anInt5512 * 350336715 == -1) {
				local50 = arg6;
				if (local24.anInt5518 * -2134171963 > 0) {
					local50 = arg7;
				}
				if (local34 == Class593.aClass593_24.anInt5501 * 847393323 || local34 == Class593.aClass593_2.anInt5501 * 847393323) {
					if (local30 == 0) {
						arg0.method19998(arg4, arg5, 4, local50);
					} else if (local30 == 1) {
						arg0.method19994(arg4, arg5, 4, local50);
					} else if (local30 == 2) {
						arg0.method19998(arg4 + 3, arg5, 4, local50);
					} else if (local30 == 3) {
						arg0.method19994(arg4, arg5 + 3, 4, local50);
					}
				}
				if (local34 == Class593.aClass593_5.anInt5501 * 847393323) {
					if (local30 == 0) {
						arg0.method19986(arg4, arg5, 1, 1, local50);
					} else if (local30 == 1) {
						arg0.method19986(arg4 + 3, arg5, 1, 1, local50);
					} else if (local30 == 2) {
						arg0.method19986(arg4 + 3, arg5 + 3, 1, 1, local50);
					} else if (local30 == 3) {
						arg0.method19986(arg4, arg5 + 3, 1, 1, local50);
					}
				}
				if (local34 == Class593.aClass593_2.anInt5501 * 847393323) {
					if (local30 == 0) {
						arg0.method19994(arg4, arg5, 4, local50);
					} else if (local30 == 1) {
						arg0.method19998(arg4 + 3, arg5, 4, local50);
					} else if (local30 == 2) {
						arg0.method19994(arg4, arg5 + 3, 4, local50);
					} else if (local30 == 3) {
						arg0.method19998(arg4, arg5, 4, local50);
					}
				}
			} else {
				Class262.method26384(arg0, local24, local30, arg4, arg5);
			}
		}
		local11 = (Interface61) local3.method31191(arg1, arg2, arg3, client.anInterface63_1);
		if (local11 != null) {
			local24 = (Class599) client.aClass517_1.method30444().method18319(local11.method13060());
			local30 = local11.method13058() & 0x3;
			local34 = local11.method13057();
			if (local24.anInt5512 * 350336715 != -1) {
				Class262.method26384(arg0, local24, local30, arg4, arg5);
			} else if (local34 == Class593.aClass593_6.anInt5501 * 847393323) {
				local50 = -1118482;
				if (local24.anInt5518 * -2134171963 > 0) {
					local50 = -1179648;
				}
				if (local30 == 0 || local30 == 2) {
					arg0.method20004(arg4, arg5 + 3, arg4 + 3, arg5, local50);
				} else {
					arg0.method20004(arg4, arg5, arg4 + 3, arg5 + 3, local50);
				}
			}
		}
		local11 = (Interface61) local3.method31195(arg1, arg2, arg3);
		if (local11 == null) {
			return;
		}
		local24 = (Class599) client.aClass517_1.method30444().method18319(local11.method13060());
		local30 = local11.method13058() & 0x3;
		if (local24.anInt5512 * 350336715 != -1) {
			Class262.method26384(arg0, local24, local30, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!au", name = "ay", descriptor = "(Lclient!dx;IIIIIII)V", line = 347)
	static void method24231(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(3) Class556 local3 = client.aClass517_1.method30435();
		@Pc(11) Interface61 local11 = (Interface61) local3.method31179(arg1, arg2, arg3);
		@Pc(24) Class599 local24;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(50) int local50;
		if (local11 != null) {
			local24 = (Class599) client.aClass517_1.method30444().method18319(local11.method13060());
			local30 = local11.method13058() & 0x3;
			local34 = local11.method13057();
			if (local24.anInt5512 * 350336715 == -1) {
				local50 = arg6;
				if (local24.anInt5518 * -2134171963 > 0) {
					local50 = arg7;
				}
				if (local34 == Class593.aClass593_24.anInt5501 * 847393323 || local34 == Class593.aClass593_2.anInt5501 * 847393323) {
					if (local30 == 0) {
						arg0.method19998(arg4, arg5, 4, local50);
					} else if (local30 == 1) {
						arg0.method19994(arg4, arg5, 4, local50);
					} else if (local30 == 2) {
						arg0.method19998(arg4 + 3, arg5, 4, local50);
					} else if (local30 == 3) {
						arg0.method19994(arg4, arg5 + 3, 4, local50);
					}
				}
				if (local34 == Class593.aClass593_5.anInt5501 * 847393323) {
					if (local30 == 0) {
						arg0.method19986(arg4, arg5, 1, 1, local50);
					} else if (local30 == 1) {
						arg0.method19986(arg4 + 3, arg5, 1, 1, local50);
					} else if (local30 == 2) {
						arg0.method19986(arg4 + 3, arg5 + 3, 1, 1, local50);
					} else if (local30 == 3) {
						arg0.method19986(arg4, arg5 + 3, 1, 1, local50);
					}
				}
				if (local34 == Class593.aClass593_2.anInt5501 * 847393323) {
					if (local30 == 0) {
						arg0.method19994(arg4, arg5, 4, local50);
					} else if (local30 == 1) {
						arg0.method19998(arg4 + 3, arg5, 4, local50);
					} else if (local30 == 2) {
						arg0.method19994(arg4, arg5 + 3, 4, local50);
					} else if (local30 == 3) {
						arg0.method19998(arg4, arg5, 4, local50);
					}
				}
			} else {
				Class262.method26384(arg0, local24, local30, arg4, arg5);
			}
		}
		local11 = (Interface61) local3.method31191(arg1, arg2, arg3, client.anInterface63_1);
		if (local11 != null) {
			local24 = (Class599) client.aClass517_1.method30444().method18319(local11.method13060());
			local30 = local11.method13058() & 0x3;
			local34 = local11.method13057();
			if (local24.anInt5512 * 350336715 != -1) {
				Class262.method26384(arg0, local24, local30, arg4, arg5);
			} else if (local34 == Class593.aClass593_6.anInt5501 * 847393323) {
				local50 = -1118482;
				if (local24.anInt5518 * -2134171963 > 0) {
					local50 = -1179648;
				}
				if (local30 == 0 || local30 == 2) {
					arg0.method20004(arg4, arg5 + 3, arg4 + 3, arg5, local50);
				} else {
					arg0.method20004(arg4, arg5, arg4 + 3, arg5 + 3, local50);
				}
			}
		}
		local11 = (Interface61) local3.method31195(arg1, arg2, arg3);
		if (local11 == null) {
			return;
		}
		local24 = (Class599) client.aClass517_1.method30444().method18319(local11.method13060());
		local30 = local11.method13058() & 0x3;
		if (local24.anInt5512 * 350336715 != -1) {
			Class262.method26384(arg0, local24, local30, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!au", name = "af", descriptor = "(Lclient!dx;Lclient!vm;III)V", line = 400)
	static void method24232(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class599 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) Class63 local8 = (Class63) Class118_Sub1.aClass35_Sub18_4.method18319(arg1.anInt5512 * 350336715);
		if (local8.anInt193 * 138454787 == -1) {
			return;
		}
		if (arg1.aBoolean819) {
			@Pc(25) int local25 = arg2 + arg1.anInt5528 * 1605976059;
			arg2 = local25 & 0x3;
		} else {
			arg2 = 0;
		}
		@Pc(40) Class83 local40 = local8.method917(arg0, arg2, arg1.aBoolean825);
		if (local40 == null) {
			return;
		}
		@Pc(49) int local49 = arg1.anInt5516 * -1082258489;
		@Pc(54) int local54 = arg1.anInt5529 * -1990374967;
		if ((arg2 & 0x1) == 1) {
			local49 = arg1.anInt5529 * -1990374967;
			local54 = arg1.anInt5516 * -1082258489;
		}
		@Pc(72) int local72 = local40.method18121();
		@Pc(75) int local75 = local40.method18198();
		if (local8.aBoolean18) {
			local72 = local49 * 4;
			local75 = local54 * 4;
		}
		if (local8.anInt192 * 2126510373 == 0) {
			local40.method18125(arg3, arg4 - (local54 - 1) * 4, local72, local75);
		} else {
			local40.method18129(arg3, arg4 - (local54 - 1) * 4, local72, local75, 0, local8.anInt192 * 2126510373 | 0xFF000000, 1);
		}
	}

	@OriginalMember(owner = "client!au", name = "an", descriptor = "(Lclient!dx;Lclient!gm;II)V", line = 426)
	static void method24233(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class277 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3 == null) {
			return;
		}
		arg0.method20012();
		@Pc(7) Class276 local7 = null;
		@Pc(9) Class90 local9 = null;
		if (arg1.anInt3857 * -1960530827 == 5) {
			local7 = arg1.method26633(arg0);
			if (local7 == null) {
				return;
			}
			local9 = local7.aClass90_1;
			if (local7.anInt3844 * -760407609 != arg1.anInt3874 * -881188269 || arg1.anInt3875 * -1279656873 != local7.anInt3843 * -976807825) {
				throw new IllegalStateException("");
			}
		}
		arg0.method20151(arg2, arg3, arg1.anInt3874 * -881188269 + arg2, arg1.anInt3875 * -1279656873 + arg3);
		if (anInt3233 * 1265431623 == 2 || anInt3233 * 1265431623 == 5 || Class609.aClass83_38 == null) {
			if (local9 == null) {
				return;
			}
			arg0.method20110(-16777216, local9, arg2, arg3);
			return;
		}
		arg0.method20080(anIntArray296);
		arg0.method20078();
		@Pc(86) Class595 local86 = client.aClass517_1.method30409();
		@Pc(95) int local95;
		@Pc(99) int local99;
		@Pc(105) int local105;
		@Pc(107) int local107;
		if (Class11.anInt36 * -891094135 == 5) {
			local95 = client.anInt3432 * 1196989073;
			local99 = client.anInt3433 * -823660049;
			local105 = (int) -client.aFloat247 & 0x3FFF;
			local107 = 4096;
		} else {
			@Pc(112) Class447 local112 = Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.method24085().aClass447_61;
			local95 = (int) local112.aFloat277;
			local99 = (int) local112.aFloat278;
			if (Class11.anInt36 * -891094135 == 3) {
				local105 = (int) -((double) Class597.aClass107_Sub1_2.method8899() * 2607.5945876176133D) + client.anInt3462 * -2045337339 & 0x3FFF;
			} else {
				local105 = (int) -client.aFloat247 + client.anInt3462 * -2045337339 & 0x3FFF;
			}
			local107 = 4096 - client.anInt3380 * -1975450384;
		}
		@Pc(163) int local163 = local95 / 128 + 48;
		@Pc(175) int local175 = client.aClass517_1.method30417() * 4 + 48 - local99 / 128;
		if (local9 == null) {
			Class609.aClass83_38.method18153((float) arg2 + (float) (arg1.anInt3874 * -881188269) / 2.0F, (float) (arg1.anInt3875 * -1279656873) / 2.0F + (float) arg3, (float) local163, (float) local175, local107, local105 << 2, 1, -1, 1);
		} else {
			Class609.aClass83_38.method18159((float) (arg1.anInt3874 * -881188269) / 2.0F + (float) arg2, (float) arg3 + (float) (arg1.anInt3875 * -1279656873) / 2.0F, (float) local163, (float) local175, local107, local105 << 2, local9, arg2, arg3);
		}
		@Pc(248) Class529 local248 = client.aClass517_1.method30420();
		@Pc(261) int local261;
		@Pc(275) int local275;
		@Pc(287) int local287;
		@Pc(297) int local297;
		@Pc(307) int local307;
		for (@Pc(253) Class77_Sub40 local253 = (Class77_Sub40) aClass695_42.method36395(); local253 != null; local253 = (Class77_Sub40) aClass695_42.method36406()) {
			local261 = local253.anInt1786 * -705967177;
			local275 = (local248.anIntArray481[local261] >> 14 & 0x3FFF) - local86.anInt5504 * -424199969;
			local287 = (local248.anIntArray481[local261] & 0x3FFF) - local86.anInt5506 * -1166289421;
			local297 = local275 * 4 + 2 - local95 / 128;
			local307 = local287 * 4 + 2 - local99 / 128;
			Class212.method25610(arg0, local9, arg1, arg2, arg3, local297, local307, local248.anIntArray480[local261]);
		}
		for (local261 = 0; local261 < anInt3237 * -463245253; local261++) {
			local275 = anIntArray297[local261] * 4 + 2 - local95 / 128;
			local287 = anIntArray298[local261] * 4 + 2 - local99 / 128;
			@Pc(367) Class599 local367 = (Class599) client.aClass517_1.method30444().method18319(anIntArray299[local261]);
			if (local367.anIntArray511 != null) {
				local367 = local367.method32006(Class55.aClass124_1, Class55.aClass124_1);
				if (local367 == null || local367.anInt5544 * 196422211 == -1) {
					continue;
				}
			}
			Class212.method25610(arg0, local9, arg1, arg2, arg3, local275, local287, local367.anInt5544 * 196422211);
		}
		for (@Pc(407) Class77_Sub9 local407 = (Class77_Sub9) client.aClass12_19.method190(); local407 != null; local407 = (Class77_Sub9) client.aClass12_19.method192()) {
			local275 = (int) (local407.aLong229 * 8258869577519436579L >> 28 & 0x3L);
			if (anInt3238 * 1936210931 == local275) {
				local287 = (int) (local407.aLong229 * 8258869577519436579L & 0x3FFFL) - local86.anInt5504 * -424199969;
				local297 = (int) (local407.aLong229 * 8258869577519436579L >> 14 & 0x3FFFL) - local86.anInt5506 * -1166289421;
				local307 = local287 * 4 + 2 - local95 / 128;
				@Pc(473) int local473 = local297 * 4 + 2 - local99 / 128;
				Class276.method26567(arg1, local9, arg2, arg3, local307, local473, Class611.aClass83Array10[0]);
			}
		}
		Class131_Sub2.method23069(arg0, local95, local99, arg1, local9, arg2, arg3);
		Class77_Sub42_Sub1.method22388(local95, local99, arg1, local9, arg2, arg3);
		Class415.method28659(local95, local99, arg1, local7, arg2, arg3);
		if (Class11.anInt36 * -891094135 != 5) {
			if (anInt3234 * -1254538725 != -1) {
				local261 = anInt3234 * -723187604 + 2 - local95 / 128 + (Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.method21095() - 1) * 2;
				local275 = anInt3235 * -985777988 + 2 - local99 / 128 + (Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.method21095() - 1) * 2;
				Class29.method500(arg1, local9, arg2 - Class620.anInt5628 * 443444551, arg3 - Class149.anInt3139 * -586110739, local261, local275, Class22.aClass83Array1[aBoolean551 ? 1 : 0], 100.0D, Class311.aClass311_2, Class309.aClass309_3);
			}
			if (!Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aClass615_1.method32350()) {
				arg0.method19986(arg1.anInt3874 * -881188269 / 2 + arg2 - 1, arg1.anInt3875 * -1279656873 / 2 + arg3 - 1, 3, 3, -1);
			}
		}
		arg0.method20104(anIntArray296[0], anIntArray296[1], anIntArray296[2], anIntArray296[3]);
	}

	@OriginalMember(owner = "client!au", name = "ab", descriptor = "(Lclient!dx;Lclient!gm;II)V", line = 426)
	static void method24234(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class277 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3 == null) {
			return;
		}
		arg0.method20012();
		@Pc(7) Class276 local7 = null;
		@Pc(9) Class90 local9 = null;
		if (arg1.anInt3857 * -1960530827 == 5) {
			local7 = arg1.method26633(arg0);
			if (local7 == null) {
				return;
			}
			local9 = local7.aClass90_1;
			if (local7.anInt3844 * -760407609 != arg1.anInt3874 * -881188269 || arg1.anInt3875 * -1279656873 != local7.anInt3843 * -976807825) {
				throw new IllegalStateException("");
			}
		}
		arg0.method20151(arg2, arg3, arg1.anInt3874 * -881188269 + arg2, arg1.anInt3875 * -1279656873 + arg3);
		if (anInt3233 * 1265431623 == 2 || anInt3233 * 1265431623 == 5 || Class609.aClass83_38 == null) {
			if (local9 == null) {
				return;
			}
			arg0.method20110(-16777216, local9, arg2, arg3);
			return;
		}
		arg0.method20080(anIntArray296);
		arg0.method20078();
		@Pc(86) Class595 local86 = client.aClass517_1.method30409();
		@Pc(95) int local95;
		@Pc(99) int local99;
		@Pc(105) int local105;
		@Pc(107) int local107;
		if (Class11.anInt36 * -891094135 == 5) {
			local95 = client.anInt3432 * 1196989073;
			local99 = client.anInt3433 * -823660049;
			local105 = (int) -client.aFloat247 & 0x3FFF;
			local107 = 4096;
		} else {
			@Pc(112) Class447 local112 = Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.method24085().aClass447_61;
			local95 = (int) local112.aFloat277;
			local99 = (int) local112.aFloat278;
			if (Class11.anInt36 * -891094135 == 3) {
				local105 = (int) -((double) Class597.aClass107_Sub1_2.method8899() * 2607.5945876176133D) + client.anInt3462 * -2045337339 & 0x3FFF;
			} else {
				local105 = (int) -client.aFloat247 + client.anInt3462 * -2045337339 & 0x3FFF;
			}
			local107 = 4096 - client.anInt3380 * -1975450384;
		}
		@Pc(163) int local163 = local95 / 128 + 48;
		@Pc(175) int local175 = client.aClass517_1.method30417() * 4 + 48 - local99 / 128;
		if (local9 == null) {
			Class609.aClass83_38.method18153((float) arg2 + (float) (arg1.anInt3874 * -881188269) / 2.0F, (float) (arg1.anInt3875 * -1279656873) / 2.0F + (float) arg3, (float) local163, (float) local175, local107, local105 << 2, 1, -1, 1);
		} else {
			Class609.aClass83_38.method18159((float) (arg1.anInt3874 * -881188269) / 2.0F + (float) arg2, (float) arg3 + (float) (arg1.anInt3875 * -1279656873) / 2.0F, (float) local163, (float) local175, local107, local105 << 2, local9, arg2, arg3);
		}
		@Pc(248) Class529 local248 = client.aClass517_1.method30420();
		@Pc(261) int local261;
		@Pc(275) int local275;
		@Pc(287) int local287;
		@Pc(297) int local297;
		@Pc(307) int local307;
		for (@Pc(253) Class77_Sub40 local253 = (Class77_Sub40) aClass695_42.method36395(); local253 != null; local253 = (Class77_Sub40) aClass695_42.method36406()) {
			local261 = local253.anInt1786 * -705967177;
			local275 = (local248.anIntArray481[local261] >> 14 & 0x3FFF) - local86.anInt5504 * -424199969;
			local287 = (local248.anIntArray481[local261] & 0x3FFF) - local86.anInt5506 * -1166289421;
			local297 = local275 * 4 + 2 - local95 / 128;
			local307 = local287 * 4 + 2 - local99 / 128;
			Class212.method25610(arg0, local9, arg1, arg2, arg3, local297, local307, local248.anIntArray480[local261]);
		}
		for (local261 = 0; local261 < anInt3237 * -463245253; local261++) {
			local275 = anIntArray297[local261] * 4 + 2 - local95 / 128;
			local287 = anIntArray298[local261] * 4 + 2 - local99 / 128;
			@Pc(367) Class599 local367 = (Class599) client.aClass517_1.method30444().method18319(anIntArray299[local261]);
			if (local367.anIntArray511 != null) {
				local367 = local367.method32006(Class55.aClass124_1, Class55.aClass124_1);
				if (local367 == null || local367.anInt5544 * 196422211 == -1) {
					continue;
				}
			}
			Class212.method25610(arg0, local9, arg1, arg2, arg3, local275, local287, local367.anInt5544 * 196422211);
		}
		for (@Pc(407) Class77_Sub9 local407 = (Class77_Sub9) client.aClass12_19.method190(); local407 != null; local407 = (Class77_Sub9) client.aClass12_19.method192()) {
			local275 = (int) (local407.aLong229 * 8258869577519436579L >> 28 & 0x3L);
			if (anInt3238 * 1936210931 == local275) {
				local287 = (int) (local407.aLong229 * 8258869577519436579L & 0x3FFFL) - local86.anInt5504 * -424199969;
				local297 = (int) (local407.aLong229 * 8258869577519436579L >> 14 & 0x3FFFL) - local86.anInt5506 * -1166289421;
				local307 = local287 * 4 + 2 - local95 / 128;
				@Pc(473) int local473 = local297 * 4 + 2 - local99 / 128;
				Class276.method26567(arg1, local9, arg2, arg3, local307, local473, Class611.aClass83Array10[0]);
			}
		}
		Class131_Sub2.method23069(arg0, local95, local99, arg1, local9, arg2, arg3);
		Class77_Sub42_Sub1.method22388(local95, local99, arg1, local9, arg2, arg3);
		Class415.method28659(local95, local99, arg1, local7, arg2, arg3);
		if (Class11.anInt36 * -891094135 != 5) {
			if (anInt3234 * -1254538725 != -1) {
				local261 = anInt3234 * -723187604 + 2 - local95 / 128 + (Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.method21095() - 1) * 2;
				local275 = anInt3235 * -985777988 + 2 - local99 / 128 + (Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.method21095() - 1) * 2;
				Class29.method500(arg1, local9, arg2 - Class620.anInt5628 * 443444551, arg3 - Class149.anInt3139 * -586110739, local261, local275, Class22.aClass83Array1[aBoolean551 ? 1 : 0], 100.0D, Class311.aClass311_2, Class309.aClass309_3);
			}
			if (!Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aClass615_1.method32350()) {
				arg0.method19986(arg1.anInt3874 * -881188269 / 2 + arg2 - 1, arg1.anInt3875 * -1279656873 / 2 + arg3 - 1, 3, 3, -1);
			}
		}
		arg0.method20104(anIntArray296[0], anIntArray296[1], anIntArray296[2], anIntArray296[3]);
	}

	@OriginalMember(owner = "client!au", name = "aa", descriptor = "(Lclient!dx;Lclient!gm;II)V", line = 426)
	static void method24235(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class277 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3 == null) {
			return;
		}
		arg0.method20012();
		@Pc(7) Class276 local7 = null;
		@Pc(9) Class90 local9 = null;
		if (arg1.anInt3857 * -1960530827 == 5) {
			local7 = arg1.method26633(arg0);
			if (local7 == null) {
				return;
			}
			local9 = local7.aClass90_1;
			if (local7.anInt3844 * -760407609 != arg1.anInt3874 * -881188269 || arg1.anInt3875 * -1279656873 != local7.anInt3843 * -976807825) {
				throw new IllegalStateException("");
			}
		}
		arg0.method20151(arg2, arg3, arg1.anInt3874 * -881188269 + arg2, arg1.anInt3875 * -1279656873 + arg3);
		if (anInt3233 * 1265431623 == 2 || anInt3233 * 1265431623 == 5 || Class609.aClass83_38 == null) {
			if (local9 == null) {
				return;
			}
			arg0.method20110(-16777216, local9, arg2, arg3);
			return;
		}
		arg0.method20080(anIntArray296);
		arg0.method20078();
		@Pc(86) Class595 local86 = client.aClass517_1.method30409();
		@Pc(95) int local95;
		@Pc(99) int local99;
		@Pc(105) int local105;
		@Pc(107) int local107;
		if (Class11.anInt36 * -891094135 == 5) {
			local95 = client.anInt3432 * 1196989073;
			local99 = client.anInt3433 * -823660049;
			local105 = (int) -client.aFloat247 & 0x3FFF;
			local107 = 4096;
		} else {
			@Pc(112) Class447 local112 = Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.method24085().aClass447_61;
			local95 = (int) local112.aFloat277;
			local99 = (int) local112.aFloat278;
			if (Class11.anInt36 * -891094135 == 3) {
				local105 = (int) -((double) Class597.aClass107_Sub1_2.method8899() * 2607.5945876176133D) + client.anInt3462 * -2045337339 & 0x3FFF;
			} else {
				local105 = (int) -client.aFloat247 + client.anInt3462 * -2045337339 & 0x3FFF;
			}
			local107 = 4096 - client.anInt3380 * -1975450384;
		}
		@Pc(163) int local163 = local95 / 128 + 48;
		@Pc(175) int local175 = client.aClass517_1.method30417() * 4 + 48 - local99 / 128;
		if (local9 == null) {
			Class609.aClass83_38.method18153((float) arg2 + (float) (arg1.anInt3874 * -881188269) / 2.0F, (float) (arg1.anInt3875 * -1279656873) / 2.0F + (float) arg3, (float) local163, (float) local175, local107, local105 << 2, 1, -1, 1);
		} else {
			Class609.aClass83_38.method18159((float) (arg1.anInt3874 * -881188269) / 2.0F + (float) arg2, (float) arg3 + (float) (arg1.anInt3875 * -1279656873) / 2.0F, (float) local163, (float) local175, local107, local105 << 2, local9, arg2, arg3);
		}
		@Pc(248) Class529 local248 = client.aClass517_1.method30420();
		@Pc(261) int local261;
		@Pc(275) int local275;
		@Pc(287) int local287;
		@Pc(297) int local297;
		@Pc(307) int local307;
		for (@Pc(253) Class77_Sub40 local253 = (Class77_Sub40) aClass695_42.method36395(); local253 != null; local253 = (Class77_Sub40) aClass695_42.method36406()) {
			local261 = local253.anInt1786 * -705967177;
			local275 = (local248.anIntArray481[local261] >> 14 & 0x3FFF) - local86.anInt5504 * -424199969;
			local287 = (local248.anIntArray481[local261] & 0x3FFF) - local86.anInt5506 * -1166289421;
			local297 = local275 * 4 + 2 - local95 / 128;
			local307 = local287 * 4 + 2 - local99 / 128;
			Class212.method25610(arg0, local9, arg1, arg2, arg3, local297, local307, local248.anIntArray480[local261]);
		}
		for (local261 = 0; local261 < anInt3237 * -463245253; local261++) {
			local275 = anIntArray297[local261] * 4 + 2 - local95 / 128;
			local287 = anIntArray298[local261] * 4 + 2 - local99 / 128;
			@Pc(367) Class599 local367 = (Class599) client.aClass517_1.method30444().method18319(anIntArray299[local261]);
			if (local367.anIntArray511 != null) {
				local367 = local367.method32006(Class55.aClass124_1, Class55.aClass124_1);
				if (local367 == null || local367.anInt5544 * 196422211 == -1) {
					continue;
				}
			}
			Class212.method25610(arg0, local9, arg1, arg2, arg3, local275, local287, local367.anInt5544 * 196422211);
		}
		for (@Pc(407) Class77_Sub9 local407 = (Class77_Sub9) client.aClass12_19.method190(); local407 != null; local407 = (Class77_Sub9) client.aClass12_19.method192()) {
			local275 = (int) (local407.aLong229 * 8258869577519436579L >> 28 & 0x3L);
			if (anInt3238 * 1936210931 == local275) {
				local287 = (int) (local407.aLong229 * 8258869577519436579L & 0x3FFFL) - local86.anInt5504 * -424199969;
				local297 = (int) (local407.aLong229 * 8258869577519436579L >> 14 & 0x3FFFL) - local86.anInt5506 * -1166289421;
				local307 = local287 * 4 + 2 - local95 / 128;
				@Pc(473) int local473 = local297 * 4 + 2 - local99 / 128;
				Class276.method26567(arg1, local9, arg2, arg3, local307, local473, Class611.aClass83Array10[0]);
			}
		}
		Class131_Sub2.method23069(arg0, local95, local99, arg1, local9, arg2, arg3);
		Class77_Sub42_Sub1.method22388(local95, local99, arg1, local9, arg2, arg3);
		Class415.method28659(local95, local99, arg1, local7, arg2, arg3);
		if (Class11.anInt36 * -891094135 != 5) {
			if (anInt3234 * -1254538725 != -1) {
				local261 = anInt3234 * -723187604 + 2 - local95 / 128 + (Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.method21095() - 1) * 2;
				local275 = anInt3235 * -985777988 + 2 - local99 / 128 + (Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.method21095() - 1) * 2;
				Class29.method500(arg1, local9, arg2 - Class620.anInt5628 * 443444551, arg3 - Class149.anInt3139 * -586110739, local261, local275, Class22.aClass83Array1[aBoolean551 ? 1 : 0], 100.0D, Class311.aClass311_2, Class309.aClass309_3);
			}
			if (!Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aClass615_1.method32350()) {
				arg0.method19986(arg1.anInt3874 * -881188269 / 2 + arg2 - 1, arg1.anInt3875 * -1279656873 / 2 + arg3 - 1, 3, 3, -1);
			}
		}
		arg0.method20104(anIntArray296[0], anIntArray296[1], anIntArray296[2], anIntArray296[3]);
	}

	@OriginalMember(owner = "client!au", name = "ap", descriptor = "(Lclient!dx;IILclient!gm;Lclient!cd;II)V", line = 519)
	static void method24236(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class277 arg3, @OriginalArg(4) Class90 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		for (@Pc(1) int local1 = 0; local1 < client.anInt3527 * -1125820437; local1++) {
			@Pc(14) Class77_Sub6 local14 = (Class77_Sub6) client.aClass12_22.method173((long) client.anIntArray317[local1]);
			if (local14 != null) {
				@Pc(20) Class104_Sub1_Sub1_Sub1_Sub1 local20 = (Class104_Sub1_Sub1_Sub1_Sub1) local14.anObject5;
				if (local20.method19824() && local20.aByte100 == Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aByte100) {
					@Pc(32) Class333 local32 = local20.aClass333_1;
					if (local32 != null && local32.anIntArray437 != null) {
						local32 = local32.method27642(Class55.aClass124_1, Class55.aClass124_1);
					}
					if (local32 != null && local32.aBoolean712 && local32.aBoolean714) {
						@Pc(57) Class447 local57 = local20.method24085().aClass447_61;
						@Pc(67) int local67 = (int) local57.aFloat277 / 128 - arg1 / 128;
						@Pc(77) int local77 = (int) local57.aFloat278 / 128 - arg2 / 128;
						if (local32.anInt4124 * -161851867 == -1) {
							Class276.method26567(arg3, arg4, arg5, arg6, local67, local77, Class611.aClass83Array10[1]);
						} else {
							Class212.method25610(arg0, arg4, arg3, arg5, arg6, local67, local77, local32.anInt4124 * -161851867);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!au", name = "bj", descriptor = "(Lclient!dx;IILclient!gm;Lclient!cd;II)V", line = 519)
	static void method24237(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class277 arg3, @OriginalArg(4) Class90 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		for (@Pc(1) int local1 = 0; local1 < client.anInt3527 * -1125820437; local1++) {
			@Pc(14) Class77_Sub6 local14 = (Class77_Sub6) client.aClass12_22.method173((long) client.anIntArray317[local1]);
			if (local14 != null) {
				@Pc(20) Class104_Sub1_Sub1_Sub1_Sub1 local20 = (Class104_Sub1_Sub1_Sub1_Sub1) local14.anObject5;
				if (local20.method19824() && local20.aByte100 == Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aByte100) {
					@Pc(32) Class333 local32 = local20.aClass333_1;
					if (local32 != null && local32.anIntArray437 != null) {
						local32 = local32.method27642(Class55.aClass124_1, Class55.aClass124_1);
					}
					if (local32 != null && local32.aBoolean712 && local32.aBoolean714) {
						@Pc(57) Class447 local57 = local20.method24085().aClass447_61;
						@Pc(67) int local67 = (int) local57.aFloat277 / 128 - arg1 / 128;
						@Pc(77) int local77 = (int) local57.aFloat278 / 128 - arg2 / 128;
						if (local32.anInt4124 * -161851867 == -1) {
							Class276.method26567(arg3, arg4, arg5, arg6, local67, local77, Class611.aClass83Array10[1]);
						} else {
							Class212.method25610(arg0, arg4, arg3, arg5, arg6, local67, local77, local32.anInt4124 * -161851867);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!au", name = "az", descriptor = "(Lclient!dx;IILclient!gm;Lclient!cd;II)V", line = 519)
	static void method24238(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class277 arg3, @OriginalArg(4) Class90 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		for (@Pc(1) int local1 = 0; local1 < client.anInt3527 * -1125820437; local1++) {
			@Pc(14) Class77_Sub6 local14 = (Class77_Sub6) client.aClass12_22.method173((long) client.anIntArray317[local1]);
			if (local14 != null) {
				@Pc(20) Class104_Sub1_Sub1_Sub1_Sub1 local20 = (Class104_Sub1_Sub1_Sub1_Sub1) local14.anObject5;
				if (local20.method19824() && local20.aByte100 == Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aByte100) {
					@Pc(32) Class333 local32 = local20.aClass333_1;
					if (local32 != null && local32.anIntArray437 != null) {
						local32 = local32.method27642(Class55.aClass124_1, Class55.aClass124_1);
					}
					if (local32 != null && local32.aBoolean712 && local32.aBoolean714) {
						@Pc(57) Class447 local57 = local20.method24085().aClass447_61;
						@Pc(67) int local67 = (int) local57.aFloat277 / 128 - arg1 / 128;
						@Pc(77) int local77 = (int) local57.aFloat278 / 128 - arg2 / 128;
						if (local32.anInt4124 * -161851867 == -1) {
							Class276.method26567(arg3, arg4, arg5, arg6, local67, local77, Class611.aClass83Array10[1]);
						} else {
							Class212.method25610(arg0, arg4, arg3, arg5, arg6, local67, local77, local32.anInt4124 * -161851867);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!au", name = "aw", descriptor = "(Lclient!dx;IILclient!gm;Lclient!cd;II)V", line = 519)
	static void method24239(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class277 arg3, @OriginalArg(4) Class90 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		for (@Pc(1) int local1 = 0; local1 < client.anInt3527 * -1125820437; local1++) {
			@Pc(14) Class77_Sub6 local14 = (Class77_Sub6) client.aClass12_22.method173((long) client.anIntArray317[local1]);
			if (local14 != null) {
				@Pc(20) Class104_Sub1_Sub1_Sub1_Sub1 local20 = (Class104_Sub1_Sub1_Sub1_Sub1) local14.anObject5;
				if (local20.method19824() && local20.aByte100 == Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aByte100) {
					@Pc(32) Class333 local32 = local20.aClass333_1;
					if (local32 != null && local32.anIntArray437 != null) {
						local32 = local32.method27642(Class55.aClass124_1, Class55.aClass124_1);
					}
					if (local32 != null && local32.aBoolean712 && local32.aBoolean714) {
						@Pc(57) Class447 local57 = local20.method24085().aClass447_61;
						@Pc(67) int local67 = (int) local57.aFloat277 / 128 - arg1 / 128;
						@Pc(77) int local77 = (int) local57.aFloat278 / 128 - arg2 / 128;
						if (local32.anInt4124 * -161851867 == -1) {
							Class276.method26567(arg3, arg4, arg5, arg6, local67, local77, Class611.aClass83Array10[1]);
						} else {
							Class212.method25610(arg0, arg4, arg3, arg5, arg6, local67, local77, local32.anInt4124 * -161851867);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!au", name = "bc", descriptor = "(Lclient!dx;IILclient!gm;Lclient!cd;II)V", line = 519)
	static void method24240(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class277 arg3, @OriginalArg(4) Class90 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		for (@Pc(1) int local1 = 0; local1 < client.anInt3527 * -1125820437; local1++) {
			@Pc(14) Class77_Sub6 local14 = (Class77_Sub6) client.aClass12_22.method173((long) client.anIntArray317[local1]);
			if (local14 != null) {
				@Pc(20) Class104_Sub1_Sub1_Sub1_Sub1 local20 = (Class104_Sub1_Sub1_Sub1_Sub1) local14.anObject5;
				if (local20.method19824() && local20.aByte100 == Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aByte100) {
					@Pc(32) Class333 local32 = local20.aClass333_1;
					if (local32 != null && local32.anIntArray437 != null) {
						local32 = local32.method27642(Class55.aClass124_1, Class55.aClass124_1);
					}
					if (local32 != null && local32.aBoolean712 && local32.aBoolean714) {
						@Pc(57) Class447 local57 = local20.method24085().aClass447_61;
						@Pc(67) int local67 = (int) local57.aFloat277 / 128 - arg1 / 128;
						@Pc(77) int local77 = (int) local57.aFloat278 / 128 - arg2 / 128;
						if (local32.anInt4124 * -161851867 == -1) {
							Class276.method26567(arg3, arg4, arg5, arg6, local67, local77, Class611.aClass83Array10[1]);
						} else {
							Class212.method25610(arg0, arg4, arg3, arg5, arg6, local67, local77, local32.anInt4124 * -161851867);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!au", name = "bb", descriptor = "(IILclient!gm;Lclient!cd;II)V", line = 539)
	static void method24241(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class277 arg2, @OriginalArg(3) Class90 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = Class152.anInt2399 * -1843550713;
		@Pc(5) int[] local5 = Class152.anIntArray221;
		for (@Pc(7) int local7 = 0; local7 < local3; local7++) {
			@Pc(16) Class104_Sub1_Sub1_Sub1_Sub2 local16 = client.aClass104_Sub1_Sub1_Sub1_Sub2Array1[local5[local7]];
			if (local16 != null && local16.method21191() && !local16.aClass615_1.method32350() && Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3 != local16 && local16.aByte100 == Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aByte100) {
				@Pc(40) Class447 local40 = local16.method24085().aClass447_61;
				@Pc(50) int local50 = (int) local40.aFloat277 / 128 - arg0 / 128;
				@Pc(60) int local60 = (int) local40.aFloat278 / 128 - arg1 / 128;
				@Pc(62) boolean local62 = false;
				for (@Pc(64) int local64 = 0; local64 < client.anInt3529 * -1979292205; local64++) {
					@Pc(73) Class162 local73 = client.aClass162Array1[local64];
					if (local16.aString82.equals(local73.aString131) && local73.anInt3260 * -721928209 != 0) {
						local62 = true;
						break;
					}
				}
				@Pc(91) boolean local91 = false;
				for (@Pc(93) int local93 = 0; local93 < Class462.anInt4970 * -217094943; local93++) {
					if (local16.aString82.equals(Class204.aClass50Array1[local93].aString9)) {
						local91 = true;
						break;
					}
				}
				@Pc(113) boolean local113 = false;
				if (Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.anInt2911 * 676699829 != 0 && local16.anInt2911 * 676699829 != 0 && Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.anInt2911 * 676699829 == local16.anInt2911 * 676699829) {
					local113 = true;
				}
				if (local16.aClass628_1 != null && local16.aClass628_1.anInt5660 * 1568742735 != -1 && ((Class333) Class578.aClass35_Sub3_1.method18319(local16.aClass628_1.anInt5660 * 1568742735)).aBoolean717) {
					Class276.method26567(arg2, arg3, arg4, arg5, local50, local60, Class611.aClass83Array10[1]);
				} else if (local16.aClass282_1 == Class282.aClass282_2) {
					Class276.method26567(arg2, arg3, arg4, arg5, local50, local60, Class611.aClass83Array10[8]);
				} else if (Class282.aClass282_3 == local16.aClass282_1) {
					Class276.method26567(arg2, arg3, arg4, arg5, local50, local60, Class611.aClass83Array10[6]);
				} else if (local113) {
					Class276.method26567(arg2, arg3, arg4, arg5, local50, local60, Class611.aClass83Array10[4]);
				} else if (local16.aBoolean486) {
					Class276.method26567(arg2, arg3, arg4, arg5, local50, local60, Class611.aClass83Array10[7]);
				} else if (local62) {
					Class276.method26567(arg2, arg3, arg4, arg5, local50, local60, Class611.aClass83Array10[3]);
				} else if (local91) {
					Class276.method26567(arg2, arg3, arg4, arg5, local50, local60, Class611.aClass83Array10[5]);
				} else {
					Class276.method26567(arg2, arg3, arg4, arg5, local50, local60, Class611.aClass83Array10[2]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!au", name = "ba", descriptor = "(IILclient!gm;Lclient!cd;II)V", line = 539)
	static void method24242(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class277 arg2, @OriginalArg(3) Class90 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = Class152.anInt2399 * -1843550713;
		@Pc(5) int[] local5 = Class152.anIntArray221;
		for (@Pc(7) int local7 = 0; local7 < local3; local7++) {
			@Pc(16) Class104_Sub1_Sub1_Sub1_Sub2 local16 = client.aClass104_Sub1_Sub1_Sub1_Sub2Array1[local5[local7]];
			if (local16 != null && local16.method21191() && !local16.aClass615_1.method32350() && Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3 != local16 && local16.aByte100 == Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aByte100) {
				@Pc(40) Class447 local40 = local16.method24085().aClass447_61;
				@Pc(50) int local50 = (int) local40.aFloat277 / 128 - arg0 / 128;
				@Pc(60) int local60 = (int) local40.aFloat278 / 128 - arg1 / 128;
				@Pc(62) boolean local62 = false;
				for (@Pc(64) int local64 = 0; local64 < client.anInt3529 * -1979292205; local64++) {
					@Pc(73) Class162 local73 = client.aClass162Array1[local64];
					if (local16.aString82.equals(local73.aString131) && local73.anInt3260 * -721928209 != 0) {
						local62 = true;
						break;
					}
				}
				@Pc(91) boolean local91 = false;
				for (@Pc(93) int local93 = 0; local93 < Class462.anInt4970 * -217094943; local93++) {
					if (local16.aString82.equals(Class204.aClass50Array1[local93].aString9)) {
						local91 = true;
						break;
					}
				}
				@Pc(113) boolean local113 = false;
				if (Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.anInt2911 * 676699829 != 0 && local16.anInt2911 * 676699829 != 0 && Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.anInt2911 * 676699829 == local16.anInt2911 * 676699829) {
					local113 = true;
				}
				if (local16.aClass628_1 != null && local16.aClass628_1.anInt5660 * 1568742735 != -1 && ((Class333) Class578.aClass35_Sub3_1.method18319(local16.aClass628_1.anInt5660 * 1568742735)).aBoolean717) {
					Class276.method26567(arg2, arg3, arg4, arg5, local50, local60, Class611.aClass83Array10[1]);
				} else if (local16.aClass282_1 == Class282.aClass282_2) {
					Class276.method26567(arg2, arg3, arg4, arg5, local50, local60, Class611.aClass83Array10[8]);
				} else if (Class282.aClass282_3 == local16.aClass282_1) {
					Class276.method26567(arg2, arg3, arg4, arg5, local50, local60, Class611.aClass83Array10[6]);
				} else if (local113) {
					Class276.method26567(arg2, arg3, arg4, arg5, local50, local60, Class611.aClass83Array10[4]);
				} else if (local16.aBoolean486) {
					Class276.method26567(arg2, arg3, arg4, arg5, local50, local60, Class611.aClass83Array10[7]);
				} else if (local62) {
					Class276.method26567(arg2, arg3, arg4, arg5, local50, local60, Class611.aClass83Array10[3]);
				} else if (local91) {
					Class276.method26567(arg2, arg3, arg4, arg5, local50, local60, Class611.aClass83Array10[5]);
				} else {
					Class276.method26567(arg2, arg3, arg4, arg5, local50, local60, Class611.aClass83Array10[2]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!au", name = "bl", descriptor = "(IILclient!gm;Lclient!cd;II)V", line = 539)
	static void method24243(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class277 arg2, @OriginalArg(3) Class90 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = Class152.anInt2399 * -1843550713;
		@Pc(5) int[] local5 = Class152.anIntArray221;
		for (@Pc(7) int local7 = 0; local7 < local3; local7++) {
			@Pc(16) Class104_Sub1_Sub1_Sub1_Sub2 local16 = client.aClass104_Sub1_Sub1_Sub1_Sub2Array1[local5[local7]];
			if (local16 != null && local16.method21191() && !local16.aClass615_1.method32350() && Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3 != local16 && local16.aByte100 == Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aByte100) {
				@Pc(40) Class447 local40 = local16.method24085().aClass447_61;
				@Pc(50) int local50 = (int) local40.aFloat277 / 128 - arg0 / 128;
				@Pc(60) int local60 = (int) local40.aFloat278 / 128 - arg1 / 128;
				@Pc(62) boolean local62 = false;
				for (@Pc(64) int local64 = 0; local64 < client.anInt3529 * -1979292205; local64++) {
					@Pc(73) Class162 local73 = client.aClass162Array1[local64];
					if (local16.aString82.equals(local73.aString131) && local73.anInt3260 * -721928209 != 0) {
						local62 = true;
						break;
					}
				}
				@Pc(91) boolean local91 = false;
				for (@Pc(93) int local93 = 0; local93 < Class462.anInt4970 * -217094943; local93++) {
					if (local16.aString82.equals(Class204.aClass50Array1[local93].aString9)) {
						local91 = true;
						break;
					}
				}
				@Pc(113) boolean local113 = false;
				if (Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.anInt2911 * 676699829 != 0 && local16.anInt2911 * 676699829 != 0 && Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.anInt2911 * 676699829 == local16.anInt2911 * 676699829) {
					local113 = true;
				}
				if (local16.aClass628_1 != null && local16.aClass628_1.anInt5660 * 1568742735 != -1 && ((Class333) Class578.aClass35_Sub3_1.method18319(local16.aClass628_1.anInt5660 * 1568742735)).aBoolean717) {
					Class276.method26567(arg2, arg3, arg4, arg5, local50, local60, Class611.aClass83Array10[1]);
				} else if (local16.aClass282_1 == Class282.aClass282_2) {
					Class276.method26567(arg2, arg3, arg4, arg5, local50, local60, Class611.aClass83Array10[8]);
				} else if (Class282.aClass282_3 == local16.aClass282_1) {
					Class276.method26567(arg2, arg3, arg4, arg5, local50, local60, Class611.aClass83Array10[6]);
				} else if (local113) {
					Class276.method26567(arg2, arg3, arg4, arg5, local50, local60, Class611.aClass83Array10[4]);
				} else if (local16.aBoolean486) {
					Class276.method26567(arg2, arg3, arg4, arg5, local50, local60, Class611.aClass83Array10[7]);
				} else if (local62) {
					Class276.method26567(arg2, arg3, arg4, arg5, local50, local60, Class611.aClass83Array10[3]);
				} else if (local91) {
					Class276.method26567(arg2, arg3, arg4, arg5, local50, local60, Class611.aClass83Array10[5]);
				} else {
					Class276.method26567(arg2, arg3, arg4, arg5, local50, local60, Class611.aClass83Array10[2]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!au", name = "bv", descriptor = "(IILclient!gm;Lclient!cd;II)V", line = 539)
	static void method24244(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class277 arg2, @OriginalArg(3) Class90 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = Class152.anInt2399 * -1843550713;
		@Pc(5) int[] local5 = Class152.anIntArray221;
		for (@Pc(7) int local7 = 0; local7 < local3; local7++) {
			@Pc(16) Class104_Sub1_Sub1_Sub1_Sub2 local16 = client.aClass104_Sub1_Sub1_Sub1_Sub2Array1[local5[local7]];
			if (local16 != null && local16.method21191() && !local16.aClass615_1.method32350() && Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3 != local16 && local16.aByte100 == Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aByte100) {
				@Pc(40) Class447 local40 = local16.method24085().aClass447_61;
				@Pc(50) int local50 = (int) local40.aFloat277 / 128 - arg0 / 128;
				@Pc(60) int local60 = (int) local40.aFloat278 / 128 - arg1 / 128;
				@Pc(62) boolean local62 = false;
				for (@Pc(64) int local64 = 0; local64 < client.anInt3529 * -1979292205; local64++) {
					@Pc(73) Class162 local73 = client.aClass162Array1[local64];
					if (local16.aString82.equals(local73.aString131) && local73.anInt3260 * -721928209 != 0) {
						local62 = true;
						break;
					}
				}
				@Pc(91) boolean local91 = false;
				for (@Pc(93) int local93 = 0; local93 < Class462.anInt4970 * -217094943; local93++) {
					if (local16.aString82.equals(Class204.aClass50Array1[local93].aString9)) {
						local91 = true;
						break;
					}
				}
				@Pc(113) boolean local113 = false;
				if (Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.anInt2911 * 676699829 != 0 && local16.anInt2911 * 676699829 != 0 && Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.anInt2911 * 676699829 == local16.anInt2911 * 676699829) {
					local113 = true;
				}
				if (local16.aClass628_1 != null && local16.aClass628_1.anInt5660 * 1568742735 != -1 && ((Class333) Class578.aClass35_Sub3_1.method18319(local16.aClass628_1.anInt5660 * 1568742735)).aBoolean717) {
					Class276.method26567(arg2, arg3, arg4, arg5, local50, local60, Class611.aClass83Array10[1]);
				} else if (local16.aClass282_1 == Class282.aClass282_2) {
					Class276.method26567(arg2, arg3, arg4, arg5, local50, local60, Class611.aClass83Array10[8]);
				} else if (Class282.aClass282_3 == local16.aClass282_1) {
					Class276.method26567(arg2, arg3, arg4, arg5, local50, local60, Class611.aClass83Array10[6]);
				} else if (local113) {
					Class276.method26567(arg2, arg3, arg4, arg5, local50, local60, Class611.aClass83Array10[4]);
				} else if (local16.aBoolean486) {
					Class276.method26567(arg2, arg3, arg4, arg5, local50, local60, Class611.aClass83Array10[7]);
				} else if (local62) {
					Class276.method26567(arg2, arg3, arg4, arg5, local50, local60, Class611.aClass83Array10[3]);
				} else if (local91) {
					Class276.method26567(arg2, arg3, arg4, arg5, local50, local60, Class611.aClass83Array10[5]);
				} else {
					Class276.method26567(arg2, arg3, arg4, arg5, local50, local60, Class611.aClass83Array10[2]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!au", name = "bd", descriptor = "(IILclient!gm;Lclient!gl;II)V", line = 578)
	static void method24245(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class277 arg2, @OriginalArg(3) Class276 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) Class73[] local1 = client.aClass73Array1;
		for (@Pc(3) int local3 = 0; local3 < local1.length; local3++) {
			@Pc(11) Class73 local11 = local1[local3];
			if (local11 != null && local11.anInt215 * 652406965 != 0 && client.anInt3414 % 20 < 10) {
				@Pc(59) int local59;
				if (local11.anInt215 * 652406965 == 1) {
					@Pc(39) Class77_Sub6 local39 = (Class77_Sub6) client.aClass12_22.method173((long) (local11.anInt208 * -879249997));
					if (local39 != null) {
						@Pc(45) Class104_Sub1_Sub1_Sub1_Sub1 local45 = (Class104_Sub1_Sub1_Sub1_Sub1) local39.anObject5;
						@Pc(49) Class447 local49 = local45.method24085().aClass447_61;
						local59 = (int) local49.aFloat277 / 128 - arg0 / 128;
						@Pc(69) int local69 = (int) local49.aFloat278 / 128 - arg1 / 128;
						Class18.method375(arg2, arg3, arg4, arg5, local59, local69, local11.anInt216 * -1562758755, 360000L);
					}
				}
				if (local11.anInt215 * 652406965 == 2) {
					@Pc(98) int local98 = local11.anInt210 * 487170425 / 128 - arg0 / 128;
					@Pc(109) int local109 = local11.anInt211 * 631467137 / 128 - arg1 / 128;
					@Pc(117) long local117 = (long) (local11.anInt214 * -41335265 << 7);
					@Pc(121) long local121 = local117 * local117;
					Class18.method375(arg2, arg3, arg4, arg5, local98, local109, local11.anInt216 * -1562758755, local121);
				}
				if (local11.anInt215 * 652406965 == 10 && local11.anInt208 * -879249997 >= 0 && local11.anInt208 * -879249997 < client.aClass104_Sub1_Sub1_Sub1_Sub2Array1.length) {
					@Pc(158) Class104_Sub1_Sub1_Sub1_Sub2 local158 = client.aClass104_Sub1_Sub1_Sub1_Sub2Array1[local11.anInt208 * -879249997];
					if (local158 != null) {
						@Pc(165) Class447 local165 = local158.method24085().aClass447_61;
						@Pc(175) int local175 = (int) local165.aFloat277 / 128 - arg0 / 128;
						local59 = (int) local165.aFloat278 / 128 - arg1 / 128;
						Class18.method375(arg2, arg3, arg4, arg5, local175, local59, local11.anInt216 * -1562758755, 360000L);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!au", name = "by", descriptor = "(IILclient!gm;Lclient!gl;II)V", line = 578)
	static void method24246(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class277 arg2, @OriginalArg(3) Class276 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) Class73[] local1 = client.aClass73Array1;
		for (@Pc(3) int local3 = 0; local3 < local1.length; local3++) {
			@Pc(11) Class73 local11 = local1[local3];
			if (local11 != null && local11.anInt215 * 652406965 != 0 && client.anInt3414 % 20 < 10) {
				@Pc(59) int local59;
				if (local11.anInt215 * 652406965 == 1) {
					@Pc(39) Class77_Sub6 local39 = (Class77_Sub6) client.aClass12_22.method173((long) (local11.anInt208 * -879249997));
					if (local39 != null) {
						@Pc(45) Class104_Sub1_Sub1_Sub1_Sub1 local45 = (Class104_Sub1_Sub1_Sub1_Sub1) local39.anObject5;
						@Pc(49) Class447 local49 = local45.method24085().aClass447_61;
						local59 = (int) local49.aFloat277 / 128 - arg0 / 128;
						@Pc(69) int local69 = (int) local49.aFloat278 / 128 - arg1 / 128;
						Class18.method375(arg2, arg3, arg4, arg5, local59, local69, local11.anInt216 * -1562758755, 360000L);
					}
				}
				if (local11.anInt215 * 652406965 == 2) {
					@Pc(98) int local98 = local11.anInt210 * 487170425 / 128 - arg0 / 128;
					@Pc(109) int local109 = local11.anInt211 * 631467137 / 128 - arg1 / 128;
					@Pc(117) long local117 = (long) (local11.anInt214 * -41335265 << 7);
					@Pc(121) long local121 = local117 * local117;
					Class18.method375(arg2, arg3, arg4, arg5, local98, local109, local11.anInt216 * -1562758755, local121);
				}
				if (local11.anInt215 * 652406965 == 10 && local11.anInt208 * -879249997 >= 0 && local11.anInt208 * -879249997 < client.aClass104_Sub1_Sub1_Sub1_Sub2Array1.length) {
					@Pc(158) Class104_Sub1_Sub1_Sub1_Sub2 local158 = client.aClass104_Sub1_Sub1_Sub1_Sub2Array1[local11.anInt208 * -879249997];
					if (local158 != null) {
						@Pc(165) Class447 local165 = local158.method24085().aClass447_61;
						@Pc(175) int local175 = (int) local165.aFloat277 / 128 - arg0 / 128;
						local59 = (int) local165.aFloat278 / 128 - arg1 / 128;
						Class18.method375(arg2, arg3, arg4, arg5, local175, local59, local11.anInt216 * -1562758755, 360000L);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!au", name = "bx", descriptor = "(Lclient!dx;Lclient!cd;Lclient!gm;IIIII)V", line = 616)
	static void method24247(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class90 arg1, @OriginalArg(2) Class277 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(5) Class302 local5 = (Class302) Class251.aClass35_Sub10_3.method18319(arg7);
		if (local5 != null && local5.anIntArray420 != null && local5.method27136(Class55.aClass124_1, Class55.aClass124_1)) {
			local5 = local5.method27153(Class55.aClass124_1, Class55.aClass124_1);
		}
		if (local5 == null || !local5.aBoolean694 || !local5.method27136(Class55.aClass124_1, Class55.aClass124_1)) {
			return;
		}
		@Pc(46) int local46;
		if (local5.anIntArray422 != null) {
			@Pc(44) int[] local44 = new int[local5.anIntArray422.length];
			@Pc(71) int local71;
			@Pc(96) int local96;
			@Pc(100) int local100;
			for (local46 = 0; local46 < local44.length / 2; local46++) {
				if (Class11.anInt36 * -891094135 == 3) {
					local71 = (int) ((double) Class597.aClass107_Sub1_2.method8899() * 2607.5945876176133D) + client.anInt3462 * -2045337339 & 0x3FFF;
				} else if (Class11.anInt36 * -891094135 == 5) {
					local71 = (int) client.aFloat247 & 0x3FFF;
				} else {
					local71 = (int) client.aFloat247 + client.anInt3462 * -2045337339 & 0x3FFF;
				}
				local96 = Class436.anIntArray464[local71];
				local100 = Class436.anIntArray463[local71];
				if (Class11.anInt36 * -891094135 != 5) {
					local96 = local96 * 256 / (client.anInt3380 * -2002513841 + 256);
					local100 = local100 * 256 / (client.anInt3380 * -2002513841 + 256);
				}
				local44[local46 * 2] = arg3 + arg2.anInt3874 * -881188269 / 2 + (local100 * (arg5 + local5.anIntArray422[local46 * 2] * 4) + (local5.anIntArray422[local46 * 2 + 1] * 4 + arg6) * local96 >> 14);
				local44[local46 * 2 + 1] = arg2.anInt3875 * -1279656873 / 2 + arg4 - ((arg6 + local5.anIntArray422[local46 * 2 + 1] * 4) * local100 - (arg5 + local5.anIntArray422[local46 * 2] * 4) * local96 >> 14);
			}
			@Pc(220) Class276 local220 = arg2.method26633(arg0);
			if (local220 != null) {
				Class213.method25615(arg0, local44, local5.anInt4040 * 1393455813, local220.anIntArray393, local220.anIntArray392);
			}
			if (local5.anInt4050 * 685328963 > 0) {
				@Pc(271) int local271;
				@Pc(281) int local281;
				@Pc(286) int local286;
				for (local71 = 0; local71 < local44.length / 2 - 1; local71++) {
					local96 = local44[local71 * 2];
					local100 = local44[local71 * 2 + 1];
					local271 = local44[(local71 + 1) * 2];
					local281 = local44[(local71 + 1) * 2 + 1];
					if (local271 < local96) {
						local286 = local96;
						@Pc(288) int local288 = local100;
						local96 = local271;
						local100 = local281;
						local271 = local286;
						local281 = local288;
					} else if (local96 == local271 && local281 < local100) {
						local286 = local100;
						local100 = local281;
						local281 = local286;
					}
					if (arg1 == null) {
						arg0.method20094(local96, local100, local271, local281, local5.anIntArray421[local5.aByteArray74[local71] & 0xFF], 1, local5.anInt4050 * 685328963, local5.anInt4042 * 1781521033, local5.anInt4043 * 290033855);
					} else {
						arg0.method20095(local96, local100, local271, local281, local5.anIntArray421[local5.aByteArray74[local71] & 0xFF], 1, arg1, arg3, arg4, local5.anInt4050 * 685328963, local5.anInt4042 * 1781521033, local5.anInt4043 * 290033855);
					}
				}
				local71 = local44[local44.length - 2];
				local96 = local44[local44.length - 1];
				local100 = local44[0];
				local271 = local44[1];
				if (local100 < local71) {
					local281 = local71;
					local286 = local96;
					local71 = local100;
					local96 = local271;
					local100 = local281;
					local271 = local286;
				} else if (local71 == local100 && local271 < local96) {
					local281 = local96;
					local96 = local271;
					local271 = local281;
				}
				if (arg1 == null) {
					arg0.method20094(local71, local96, local100, local271, local5.anIntArray421[local5.aByteArray74[local5.aByteArray74.length - 1] & 0xFF], 1, local5.anInt4050 * 685328963, local5.anInt4042 * 1781521033, local5.anInt4043 * 290033855);
				} else {
					arg0.method20095(local71, local96, local100, local271, local5.anIntArray421[local5.aByteArray74[local5.aByteArray74.length - 1] & 0xFF], 1, arg1, arg3, arg4, local5.anInt4050 * 685328963, local5.anInt4042 * 1781521033, local5.anInt4043 * 290033855);
				}
			} else if (arg1 == null) {
				for (local71 = 0; local71 < local44.length / 2 - 1; local71++) {
					arg0.method20092(local44[local71 * 2], local44[local71 * 2 + 1], local44[(local71 + 1) * 2], local44[(local71 + 1) * 2 + 1], local5.anIntArray421[local5.aByteArray74[local71] & 0xFF], 1);
				}
				arg0.method20092(local44[local44.length - 2], local44[local44.length - 1], local44[0], local44[1], local5.anIntArray421[local5.aByteArray74[local5.aByteArray74.length - 1] & 0xFF], 1);
			} else {
				for (local71 = 0; local71 < local44.length / 2 - 1; local71++) {
					arg0.method20160(local44[local71 * 2], local44[local71 * 2 + 1], local44[(local71 + 1) * 2], local44[(local71 + 1) * 2 + 1], local5.anIntArray421[local5.aByteArray74[local71] & 0xFF], 1, arg1, arg3, arg4);
				}
				arg0.method20160(local44[local44.length - 2], local44[local44.length - 1], local44[0], local44[1], local5.anIntArray421[local5.aByteArray74[local5.aByteArray74.length - 1] & 0xFF], 1, arg1, arg3, arg4);
			}
		}
		@Pc(679) Class83 local679 = null;
		if (local5.anInt4019 * 1747122653 != -1) {
			local679 = local5.method27137(arg0, false);
			if (local679 != null) {
				local46 = local5.anInt4047 * 1484992485 > 0 ? local5.anInt4047 * 1484992485 : Class617.aClass629_1.anInt5696 * 1515024757;
				Class29.method500(arg2, arg1, arg3, arg4, arg5, arg6, local679, (double) local46, local5.aClass311_1, local5.aClass309_1);
			}
		}
		if (local5.aString189 == null) {
			return;
		}
		local46 = 0;
		if (local679 != null) {
			local46 = local679.method18171();
		}
		@Pc(737) Class94 local737 = Class248.aClass94_7;
		@Pc(739) Class17 local739 = Class143_Sub8.aClass17_8;
		if (local5.anInt4031 * 638004337 == 1) {
			local737 = Class128_Sub1.aClass94_5;
			local739 = Class611.aClass17_13;
		}
		if (local5.anInt4031 * 638004337 == 2) {
			local737 = Class260.aClass94_8;
			local739 = Class346.aClass17_12;
		}
		Class575.method31600(arg2, arg1, arg3, arg4, arg5, arg6, local46, local5.aString189, local737, local739, local5.anInt4021 * -1512587879);
	}

	@OriginalMember(owner = "client!au", name = "bw", descriptor = "(Lclient!dx;Lclient!cd;Lclient!gm;IIIII)V", line = 616)
	static void method24248(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class90 arg1, @OriginalArg(2) Class277 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(5) Class302 local5 = (Class302) Class251.aClass35_Sub10_3.method18319(arg7);
		if (local5 != null && local5.anIntArray420 != null && local5.method27136(Class55.aClass124_1, Class55.aClass124_1)) {
			local5 = local5.method27153(Class55.aClass124_1, Class55.aClass124_1);
		}
		if (local5 == null || !local5.aBoolean694 || !local5.method27136(Class55.aClass124_1, Class55.aClass124_1)) {
			return;
		}
		@Pc(46) int local46;
		if (local5.anIntArray422 != null) {
			@Pc(44) int[] local44 = new int[local5.anIntArray422.length];
			@Pc(71) int local71;
			@Pc(96) int local96;
			@Pc(100) int local100;
			for (local46 = 0; local46 < local44.length / 2; local46++) {
				if (Class11.anInt36 * -891094135 == 3) {
					local71 = (int) ((double) Class597.aClass107_Sub1_2.method8899() * 2607.5945876176133D) + client.anInt3462 * -2045337339 & 0x3FFF;
				} else if (Class11.anInt36 * -891094135 == 5) {
					local71 = (int) client.aFloat247 & 0x3FFF;
				} else {
					local71 = (int) client.aFloat247 + client.anInt3462 * -2045337339 & 0x3FFF;
				}
				local96 = Class436.anIntArray464[local71];
				local100 = Class436.anIntArray463[local71];
				if (Class11.anInt36 * -891094135 != 5) {
					local96 = local96 * 256 / (client.anInt3380 * -2002513841 + 256);
					local100 = local100 * 256 / (client.anInt3380 * -2002513841 + 256);
				}
				local44[local46 * 2] = arg3 + arg2.anInt3874 * -881188269 / 2 + (local100 * (arg5 + local5.anIntArray422[local46 * 2] * 4) + (local5.anIntArray422[local46 * 2 + 1] * 4 + arg6) * local96 >> 14);
				local44[local46 * 2 + 1] = arg2.anInt3875 * -1279656873 / 2 + arg4 - ((arg6 + local5.anIntArray422[local46 * 2 + 1] * 4) * local100 - (arg5 + local5.anIntArray422[local46 * 2] * 4) * local96 >> 14);
			}
			@Pc(220) Class276 local220 = arg2.method26633(arg0);
			if (local220 != null) {
				Class213.method25615(arg0, local44, local5.anInt4040 * 1393455813, local220.anIntArray393, local220.anIntArray392);
			}
			if (local5.anInt4050 * 685328963 > 0) {
				@Pc(271) int local271;
				@Pc(281) int local281;
				@Pc(286) int local286;
				for (local71 = 0; local71 < local44.length / 2 - 1; local71++) {
					local96 = local44[local71 * 2];
					local100 = local44[local71 * 2 + 1];
					local271 = local44[(local71 + 1) * 2];
					local281 = local44[(local71 + 1) * 2 + 1];
					if (local271 < local96) {
						local286 = local96;
						@Pc(288) int local288 = local100;
						local96 = local271;
						local100 = local281;
						local271 = local286;
						local281 = local288;
					} else if (local96 == local271 && local281 < local100) {
						local286 = local100;
						local100 = local281;
						local281 = local286;
					}
					if (arg1 == null) {
						arg0.method20094(local96, local100, local271, local281, local5.anIntArray421[local5.aByteArray74[local71] & 0xFF], 1, local5.anInt4050 * 685328963, local5.anInt4042 * 1781521033, local5.anInt4043 * 290033855);
					} else {
						arg0.method20095(local96, local100, local271, local281, local5.anIntArray421[local5.aByteArray74[local71] & 0xFF], 1, arg1, arg3, arg4, local5.anInt4050 * 685328963, local5.anInt4042 * 1781521033, local5.anInt4043 * 290033855);
					}
				}
				local71 = local44[local44.length - 2];
				local96 = local44[local44.length - 1];
				local100 = local44[0];
				local271 = local44[1];
				if (local100 < local71) {
					local281 = local71;
					local286 = local96;
					local71 = local100;
					local96 = local271;
					local100 = local281;
					local271 = local286;
				} else if (local71 == local100 && local271 < local96) {
					local281 = local96;
					local96 = local271;
					local271 = local281;
				}
				if (arg1 == null) {
					arg0.method20094(local71, local96, local100, local271, local5.anIntArray421[local5.aByteArray74[local5.aByteArray74.length - 1] & 0xFF], 1, local5.anInt4050 * 685328963, local5.anInt4042 * 1781521033, local5.anInt4043 * 290033855);
				} else {
					arg0.method20095(local71, local96, local100, local271, local5.anIntArray421[local5.aByteArray74[local5.aByteArray74.length - 1] & 0xFF], 1, arg1, arg3, arg4, local5.anInt4050 * 685328963, local5.anInt4042 * 1781521033, local5.anInt4043 * 290033855);
				}
			} else if (arg1 == null) {
				for (local71 = 0; local71 < local44.length / 2 - 1; local71++) {
					arg0.method20092(local44[local71 * 2], local44[local71 * 2 + 1], local44[(local71 + 1) * 2], local44[(local71 + 1) * 2 + 1], local5.anIntArray421[local5.aByteArray74[local71] & 0xFF], 1);
				}
				arg0.method20092(local44[local44.length - 2], local44[local44.length - 1], local44[0], local44[1], local5.anIntArray421[local5.aByteArray74[local5.aByteArray74.length - 1] & 0xFF], 1);
			} else {
				for (local71 = 0; local71 < local44.length / 2 - 1; local71++) {
					arg0.method20160(local44[local71 * 2], local44[local71 * 2 + 1], local44[(local71 + 1) * 2], local44[(local71 + 1) * 2 + 1], local5.anIntArray421[local5.aByteArray74[local71] & 0xFF], 1, arg1, arg3, arg4);
				}
				arg0.method20160(local44[local44.length - 2], local44[local44.length - 1], local44[0], local44[1], local5.anIntArray421[local5.aByteArray74[local5.aByteArray74.length - 1] & 0xFF], 1, arg1, arg3, arg4);
			}
		}
		@Pc(679) Class83 local679 = null;
		if (local5.anInt4019 * 1747122653 != -1) {
			local679 = local5.method27137(arg0, false);
			if (local679 != null) {
				local46 = local5.anInt4047 * 1484992485 > 0 ? local5.anInt4047 * 1484992485 : Class617.aClass629_1.anInt5696 * 1515024757;
				Class29.method500(arg2, arg1, arg3, arg4, arg5, arg6, local679, (double) local46, local5.aClass311_1, local5.aClass309_1);
			}
		}
		if (local5.aString189 == null) {
			return;
		}
		local46 = 0;
		if (local679 != null) {
			local46 = local679.method18171();
		}
		@Pc(737) Class94 local737 = Class248.aClass94_7;
		@Pc(739) Class17 local739 = Class143_Sub8.aClass17_8;
		if (local5.anInt4031 * 638004337 == 1) {
			local737 = Class128_Sub1.aClass94_5;
			local739 = Class611.aClass17_13;
		}
		if (local5.anInt4031 * 638004337 == 2) {
			local737 = Class260.aClass94_8;
			local739 = Class346.aClass17_12;
		}
		Class575.method31600(arg2, arg1, arg3, arg4, arg5, arg6, local46, local5.aString189, local737, local739, local5.anInt4021 * -1512587879);
	}

	@OriginalMember(owner = "client!au", name = "bi", descriptor = "(Lclient!dx;Lclient!cd;Lclient!gm;IIIII)V", line = 616)
	static void method24249(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class90 arg1, @OriginalArg(2) Class277 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(5) Class302 local5 = (Class302) Class251.aClass35_Sub10_3.method18319(arg7);
		if (local5 != null && local5.anIntArray420 != null && local5.method27136(Class55.aClass124_1, Class55.aClass124_1)) {
			local5 = local5.method27153(Class55.aClass124_1, Class55.aClass124_1);
		}
		if (local5 == null || !local5.aBoolean694 || !local5.method27136(Class55.aClass124_1, Class55.aClass124_1)) {
			return;
		}
		@Pc(46) int local46;
		if (local5.anIntArray422 != null) {
			@Pc(44) int[] local44 = new int[local5.anIntArray422.length];
			@Pc(71) int local71;
			@Pc(96) int local96;
			@Pc(100) int local100;
			for (local46 = 0; local46 < local44.length / 2; local46++) {
				if (Class11.anInt36 * -891094135 == 3) {
					local71 = (int) ((double) Class597.aClass107_Sub1_2.method8899() * 2607.5945876176133D) + client.anInt3462 * -2045337339 & 0x3FFF;
				} else if (Class11.anInt36 * -891094135 == 5) {
					local71 = (int) client.aFloat247 & 0x3FFF;
				} else {
					local71 = (int) client.aFloat247 + client.anInt3462 * -2045337339 & 0x3FFF;
				}
				local96 = Class436.anIntArray464[local71];
				local100 = Class436.anIntArray463[local71];
				if (Class11.anInt36 * -891094135 != 5) {
					local96 = local96 * 256 / (client.anInt3380 * -2002513841 + 256);
					local100 = local100 * 256 / (client.anInt3380 * -2002513841 + 256);
				}
				local44[local46 * 2] = arg3 + arg2.anInt3874 * -881188269 / 2 + (local100 * (arg5 + local5.anIntArray422[local46 * 2] * 4) + (local5.anIntArray422[local46 * 2 + 1] * 4 + arg6) * local96 >> 14);
				local44[local46 * 2 + 1] = arg2.anInt3875 * -1279656873 / 2 + arg4 - ((arg6 + local5.anIntArray422[local46 * 2 + 1] * 4) * local100 - (arg5 + local5.anIntArray422[local46 * 2] * 4) * local96 >> 14);
			}
			@Pc(220) Class276 local220 = arg2.method26633(arg0);
			if (local220 != null) {
				Class213.method25615(arg0, local44, local5.anInt4040 * 1393455813, local220.anIntArray393, local220.anIntArray392);
			}
			if (local5.anInt4050 * 685328963 > 0) {
				@Pc(271) int local271;
				@Pc(281) int local281;
				@Pc(286) int local286;
				for (local71 = 0; local71 < local44.length / 2 - 1; local71++) {
					local96 = local44[local71 * 2];
					local100 = local44[local71 * 2 + 1];
					local271 = local44[(local71 + 1) * 2];
					local281 = local44[(local71 + 1) * 2 + 1];
					if (local271 < local96) {
						local286 = local96;
						@Pc(288) int local288 = local100;
						local96 = local271;
						local100 = local281;
						local271 = local286;
						local281 = local288;
					} else if (local96 == local271 && local281 < local100) {
						local286 = local100;
						local100 = local281;
						local281 = local286;
					}
					if (arg1 == null) {
						arg0.method20094(local96, local100, local271, local281, local5.anIntArray421[local5.aByteArray74[local71] & 0xFF], 1, local5.anInt4050 * 685328963, local5.anInt4042 * 1781521033, local5.anInt4043 * 290033855);
					} else {
						arg0.method20095(local96, local100, local271, local281, local5.anIntArray421[local5.aByteArray74[local71] & 0xFF], 1, arg1, arg3, arg4, local5.anInt4050 * 685328963, local5.anInt4042 * 1781521033, local5.anInt4043 * 290033855);
					}
				}
				local71 = local44[local44.length - 2];
				local96 = local44[local44.length - 1];
				local100 = local44[0];
				local271 = local44[1];
				if (local100 < local71) {
					local281 = local71;
					local286 = local96;
					local71 = local100;
					local96 = local271;
					local100 = local281;
					local271 = local286;
				} else if (local71 == local100 && local271 < local96) {
					local281 = local96;
					local96 = local271;
					local271 = local281;
				}
				if (arg1 == null) {
					arg0.method20094(local71, local96, local100, local271, local5.anIntArray421[local5.aByteArray74[local5.aByteArray74.length - 1] & 0xFF], 1, local5.anInt4050 * 685328963, local5.anInt4042 * 1781521033, local5.anInt4043 * 290033855);
				} else {
					arg0.method20095(local71, local96, local100, local271, local5.anIntArray421[local5.aByteArray74[local5.aByteArray74.length - 1] & 0xFF], 1, arg1, arg3, arg4, local5.anInt4050 * 685328963, local5.anInt4042 * 1781521033, local5.anInt4043 * 290033855);
				}
			} else if (arg1 == null) {
				for (local71 = 0; local71 < local44.length / 2 - 1; local71++) {
					arg0.method20092(local44[local71 * 2], local44[local71 * 2 + 1], local44[(local71 + 1) * 2], local44[(local71 + 1) * 2 + 1], local5.anIntArray421[local5.aByteArray74[local71] & 0xFF], 1);
				}
				arg0.method20092(local44[local44.length - 2], local44[local44.length - 1], local44[0], local44[1], local5.anIntArray421[local5.aByteArray74[local5.aByteArray74.length - 1] & 0xFF], 1);
			} else {
				for (local71 = 0; local71 < local44.length / 2 - 1; local71++) {
					arg0.method20160(local44[local71 * 2], local44[local71 * 2 + 1], local44[(local71 + 1) * 2], local44[(local71 + 1) * 2 + 1], local5.anIntArray421[local5.aByteArray74[local71] & 0xFF], 1, arg1, arg3, arg4);
				}
				arg0.method20160(local44[local44.length - 2], local44[local44.length - 1], local44[0], local44[1], local5.anIntArray421[local5.aByteArray74[local5.aByteArray74.length - 1] & 0xFF], 1, arg1, arg3, arg4);
			}
		}
		@Pc(679) Class83 local679 = null;
		if (local5.anInt4019 * 1747122653 != -1) {
			local679 = local5.method27137(arg0, false);
			if (local679 != null) {
				local46 = local5.anInt4047 * 1484992485 > 0 ? local5.anInt4047 * 1484992485 : Class617.aClass629_1.anInt5696 * 1515024757;
				Class29.method500(arg2, arg1, arg3, arg4, arg5, arg6, local679, (double) local46, local5.aClass311_1, local5.aClass309_1);
			}
		}
		if (local5.aString189 == null) {
			return;
		}
		local46 = 0;
		if (local679 != null) {
			local46 = local679.method18171();
		}
		@Pc(737) Class94 local737 = Class248.aClass94_7;
		@Pc(739) Class17 local739 = Class143_Sub8.aClass17_8;
		if (local5.anInt4031 * 638004337 == 1) {
			local737 = Class128_Sub1.aClass94_5;
			local739 = Class611.aClass17_13;
		}
		if (local5.anInt4031 * 638004337 == 2) {
			local737 = Class260.aClass94_8;
			local739 = Class346.aClass17_12;
		}
		Class575.method31600(arg2, arg1, arg3, arg4, arg5, arg6, local46, local5.aString189, local737, local739, local5.anInt4021 * -1512587879);
	}

	@OriginalMember(owner = "client!au", name = "bg", descriptor = "(Lclient!gm;Lclient!gl;IIIIIJ)V", line = 733)
	static void method24250(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class276 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) long arg7) {
		@Pc(7) int local7 = arg4 * arg4 + arg5 * arg5;
		if ((long) local7 > arg7) {
			return;
		}
		@Pc(32) int local32;
		if (Class11.anInt36 * -891094135 == 3) {
			local32 = (int) ((double) Class597.aClass107_Sub1_2.method8899() * 2607.5945876176133D) + client.anInt3462 * -2045337339 & 0x3FFF;
		} else if (Class11.anInt36 * -891094135 == 5) {
			local32 = (int) client.aFloat247 & 0x3FFF;
		} else {
			local32 = (int) client.aFloat247 + client.anInt3462 * -2045337339 & 0x3FFF;
		}
		@Pc(57) int local57 = Class436.anIntArray464[local32];
		@Pc(61) int local61 = Class436.anIntArray463[local32];
		if (Class11.anInt36 * -891094135 != 5) {
			local57 = local57 * 256 / (client.anInt3380 * -2002513841 + 256);
			local61 = local61 * 256 / (client.anInt3380 * -2002513841 + 256);
		}
		@Pc(96) int local96 = local61 * arg4 + local57 * arg5 >> 14;
		@Pc(106) int local106 = local61 * arg5 - arg4 * local57 >> 14;
		@Pc(110) Class83 local110 = Class536.aClass83Array9[arg6];
		@Pc(113) int local113 = local110.method18169();
		@Pc(116) int local116 = local110.method18171();
		@Pc(129) int local129 = arg0.anInt3874 * -881188269 / 2 + local96 - local113 / 2;
		@Pc(133) int local133 = local129 + local113;
		@Pc(145) int local145 = arg0.anInt3875 * -1279656873 / 2 + -local106 - local116;
		@Pc(149) int local149 = local145 + local116;
		@Pc(180) boolean local180;
		if (arg1 == null) {
			@Pc(187) int local187 = local113 / 2;
			local180 = local145 <= -local116 || local149 >= arg0.anInt3875 * -1279656873 || local129 <= -local187 || local133 >= local187 + arg0.anInt3874 * -881188269;
		} else {
			local180 = !arg1.method26569(local129, local145) || !arg1.method26569(local133, local145) || !arg1.method26569(local129, local149) || !arg1.method26569(local133, local149);
		}
		if (local180) {
			@Pc(221) double local221 = Math.atan2((double) local96, (double) local106);
			@Pc(229) double local229 = Math.atan2((double) Math.abs(local96), (double) Math.abs(local106));
			@Pc(245) double local245 = Math.atan2((double) (arg0.anInt3874 * -881188269 / 2), (double) (arg0.anInt3875 * -1279656873 / 2));
			@Pc(247) boolean local247 = false;
			@Pc(249) double local249 = 0.0D;
			@Pc(264) int local264;
			if (local229 < local245) {
				local249 = 1.5707963267948966D - local221;
				local264 = arg0.anInt3875 * -1279656873 / 2;
			} else {
				local249 = local221;
				local264 = arg0.anInt3874 * -881188269 / 2;
			}
			@Pc(286) int local286 = Math.abs((int) -((double) local264 * Math.sin(1.5707963267948966D) / Math.sin(local249)));
			Class336.aClass83Array7[arg6].method18138((float) arg2 + 0.0F + (float) (arg0.anInt3874 * -881188269) / 2.0F, (float) arg3 + (float) (arg0.anInt3875 * -1279656873) / 2.0F - 0.0F, (float) Class336.aClass83Array7[arg6].method18121() / 2.0F, (float) local286, 4096, (int) (-local221 / 6.283185307179586D * 65535.0D));
		} else if (arg1 == null) {
			local110.method18123(arg2 + local129, arg3 + local145);
		} else {
			local110.method18197(arg2 + local129, arg3 + local145, arg1.aClass90_1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!au", name = "bs", descriptor = "(Lclient!gm;Lclient!gl;IIIIIJ)V", line = 733)
	static void method24251(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class276 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) long arg7) {
		@Pc(7) int local7 = arg4 * arg4 + arg5 * arg5;
		if ((long) local7 > arg7) {
			return;
		}
		@Pc(32) int local32;
		if (Class11.anInt36 * -891094135 == 3) {
			local32 = (int) ((double) Class597.aClass107_Sub1_2.method8899() * 2607.5945876176133D) + client.anInt3462 * -2045337339 & 0x3FFF;
		} else if (Class11.anInt36 * -891094135 == 5) {
			local32 = (int) client.aFloat247 & 0x3FFF;
		} else {
			local32 = (int) client.aFloat247 + client.anInt3462 * -2045337339 & 0x3FFF;
		}
		@Pc(57) int local57 = Class436.anIntArray464[local32];
		@Pc(61) int local61 = Class436.anIntArray463[local32];
		if (Class11.anInt36 * -891094135 != 5) {
			local57 = local57 * 256 / (client.anInt3380 * -2002513841 + 256);
			local61 = local61 * 256 / (client.anInt3380 * -2002513841 + 256);
		}
		@Pc(96) int local96 = local61 * arg4 + local57 * arg5 >> 14;
		@Pc(106) int local106 = local61 * arg5 - arg4 * local57 >> 14;
		@Pc(110) Class83 local110 = Class536.aClass83Array9[arg6];
		@Pc(113) int local113 = local110.method18169();
		@Pc(116) int local116 = local110.method18171();
		@Pc(129) int local129 = arg0.anInt3874 * -881188269 / 2 + local96 - local113 / 2;
		@Pc(133) int local133 = local129 + local113;
		@Pc(145) int local145 = arg0.anInt3875 * -1279656873 / 2 + -local106 - local116;
		@Pc(149) int local149 = local145 + local116;
		@Pc(180) boolean local180;
		if (arg1 == null) {
			@Pc(187) int local187 = local113 / 2;
			local180 = local145 <= -local116 || local149 >= arg0.anInt3875 * -1279656873 || local129 <= -local187 || local133 >= local187 + arg0.anInt3874 * -881188269;
		} else {
			local180 = !arg1.method26569(local129, local145) || !arg1.method26569(local133, local145) || !arg1.method26569(local129, local149) || !arg1.method26569(local133, local149);
		}
		if (local180) {
			@Pc(221) double local221 = Math.atan2((double) local96, (double) local106);
			@Pc(229) double local229 = Math.atan2((double) Math.abs(local96), (double) Math.abs(local106));
			@Pc(245) double local245 = Math.atan2((double) (arg0.anInt3874 * -881188269 / 2), (double) (arg0.anInt3875 * -1279656873 / 2));
			@Pc(247) boolean local247 = false;
			@Pc(249) double local249 = 0.0D;
			@Pc(264) int local264;
			if (local229 < local245) {
				local249 = 1.5707963267948966D - local221;
				local264 = arg0.anInt3875 * -1279656873 / 2;
			} else {
				local249 = local221;
				local264 = arg0.anInt3874 * -881188269 / 2;
			}
			@Pc(286) int local286 = Math.abs((int) -((double) local264 * Math.sin(1.5707963267948966D) / Math.sin(local249)));
			Class336.aClass83Array7[arg6].method18138((float) arg2 + 0.0F + (float) (arg0.anInt3874 * -881188269) / 2.0F, (float) arg3 + (float) (arg0.anInt3875 * -1279656873) / 2.0F - 0.0F, (float) Class336.aClass83Array7[arg6].method18121() / 2.0F, (float) local286, 4096, (int) (-local221 / 6.283185307179586D * 65535.0D));
		} else if (arg1 == null) {
			local110.method18123(arg2 + local129, arg3 + local145);
		} else {
			local110.method18197(arg2 + local129, arg3 + local145, arg1.aClass90_1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!au", name = "bt", descriptor = "(Lclient!gm;Lclient!cd;IIIILclient!cy;)V", line = 791)
	static void method24252(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class90 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class83 arg6) {
		Class29.method500(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 100.0D, Class311.aClass311_4, Class309.aClass309_4);
	}

	@OriginalMember(owner = "client!au", name = "bz", descriptor = "(Lclient!gm;Lclient!cd;IIIILclient!cy;)V", line = 791)
	static void method24253(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class90 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class83 arg6) {
		Class29.method500(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 100.0D, Class311.aClass311_4, Class309.aClass309_4);
	}

	@OriginalMember(owner = "client!au", name = "bf", descriptor = "(Lclient!gm;Lclient!cd;IIIILclient!cy;DLclient!hw;Lclient!ht;)V", line = 795)
	static void method24254(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class90 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class83 arg6, @OriginalArg(7) double arg7, @OriginalArg(8) Class311 arg8, @OriginalArg(9) Class309 arg9) {
		if (arg6 == null) {
			return;
		}
		@Pc(22) int local22;
		if (Class11.anInt36 * -891094135 == 3) {
			local22 = (int) ((double) Class597.aClass107_Sub1_2.method8899() * 2607.5945876176133D) + client.anInt3462 * -2045337339 & 0x3FFF;
		} else if (Class11.anInt36 * -891094135 == 5) {
			local22 = (int) client.aFloat247 & 0x3FFF;
		} else {
			local22 = (int) client.aFloat247 + client.anInt3462 * -2045337339 & 0x3FFF;
		}
		@Pc(59) int local59 = Math.max(arg0.anInt3874 * -881188269 / 2, arg0.anInt3875 * -1279656873 / 2) + 10;
		@Pc(67) int local67 = arg4 * arg4 + arg5 * arg5;
		if (local67 > local59 * local59) {
			return;
		}
		@Pc(77) int local77 = Class436.anIntArray464[local22];
		@Pc(81) int local81 = Class436.anIntArray463[local22];
		if (Class11.anInt36 * -891094135 != 5) {
			local77 = local77 * 256 / (client.anInt3380 * -2002513841 + 256);
			local81 = local81 * 256 / (client.anInt3380 * -2002513841 + 256);
		}
		@Pc(116) int local116 = local81 * arg4 + local77 * arg5 >> 14;
		@Pc(126) int local126 = local81 * arg5 - local77 * arg4 >> 14;
		@Pc(130) double local130 = arg7 / 100.0D;
		switch(arg8.anInt4060 * -1448550931) {
			case 0:
				arg2 = arg2 + arg0.anInt3874 * -881188269 / 2 + local116 - (int) ((double) arg6.method18121() * local130);
				break;
			case 1:
				arg2 = arg0.anInt3874 * -881188269 / 2 + arg2 + local116 - (int) ((double) (arg6.method18121() / 2) * local130);
				break;
			case 2:
				arg2 = arg0.anInt3874 * -881188269 / 2 + arg2 + local116;
		}
		switch(arg9.anInt4057 * -1863758235) {
			case 0:
				arg3 = arg3 + arg0.anInt3875 * -1279656873 / 2 - local126 - (int) ((double) arg6.method18198() * local130);
				break;
			case 1:
				arg3 = arg0.anInt3875 * -1279656873 / 2 + arg3 - local126;
				break;
			case 2:
				arg3 = arg0.anInt3875 * -1279656873 / 2 + arg3 - local126 - (int) ((double) (arg6.method18198() / 2) * local130);
		}
		if (arg1 == null) {
			if (local130 == 1.0D) {
				arg6.method18123(arg2, arg3);
			}
			arg6.method18125(arg2, arg3, (int) ((double) arg6.method18121() * local130), (int) ((double) arg6.method18198() * local130));
		} else if (local130 == 1.0D) {
			arg6.method18197(arg2, arg3, arg1, arg2, arg3);
		} else {
			arg6.method18125(arg2, arg3, (int) ((double) arg6.method18121() * local130), (int) ((double) arg6.method18198() * local130));
		}
	}

	@OriginalMember(owner = "client!au", name = "bu", descriptor = "(Lclient!gm;Lclient!cd;IIIILclient!cy;DLclient!hw;Lclient!ht;)V", line = 795)
	static void method24255(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class90 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class83 arg6, @OriginalArg(7) double arg7, @OriginalArg(8) Class311 arg8, @OriginalArg(9) Class309 arg9) {
		if (arg6 == null) {
			return;
		}
		@Pc(22) int local22;
		if (Class11.anInt36 * -891094135 == 3) {
			local22 = (int) ((double) Class597.aClass107_Sub1_2.method8899() * 2607.5945876176133D) + client.anInt3462 * -2045337339 & 0x3FFF;
		} else if (Class11.anInt36 * -891094135 == 5) {
			local22 = (int) client.aFloat247 & 0x3FFF;
		} else {
			local22 = (int) client.aFloat247 + client.anInt3462 * -2045337339 & 0x3FFF;
		}
		@Pc(59) int local59 = Math.max(arg0.anInt3874 * -881188269 / 2, arg0.anInt3875 * -1279656873 / 2) + 10;
		@Pc(67) int local67 = arg4 * arg4 + arg5 * arg5;
		if (local67 > local59 * local59) {
			return;
		}
		@Pc(77) int local77 = Class436.anIntArray464[local22];
		@Pc(81) int local81 = Class436.anIntArray463[local22];
		if (Class11.anInt36 * -891094135 != 5) {
			local77 = local77 * 256 / (client.anInt3380 * -2002513841 + 256);
			local81 = local81 * 256 / (client.anInt3380 * -2002513841 + 256);
		}
		@Pc(116) int local116 = local81 * arg4 + local77 * arg5 >> 14;
		@Pc(126) int local126 = local81 * arg5 - local77 * arg4 >> 14;
		@Pc(130) double local130 = arg7 / 100.0D;
		switch(arg8.anInt4060 * -1448550931) {
			case 0:
				arg2 = arg2 + arg0.anInt3874 * -881188269 / 2 + local116 - (int) ((double) arg6.method18121() * local130);
				break;
			case 1:
				arg2 = arg0.anInt3874 * -881188269 / 2 + arg2 + local116 - (int) ((double) (arg6.method18121() / 2) * local130);
				break;
			case 2:
				arg2 = arg0.anInt3874 * -881188269 / 2 + arg2 + local116;
		}
		switch(arg9.anInt4057 * -1863758235) {
			case 0:
				arg3 = arg3 + arg0.anInt3875 * -1279656873 / 2 - local126 - (int) ((double) arg6.method18198() * local130);
				break;
			case 1:
				arg3 = arg0.anInt3875 * -1279656873 / 2 + arg3 - local126;
				break;
			case 2:
				arg3 = arg0.anInt3875 * -1279656873 / 2 + arg3 - local126 - (int) ((double) (arg6.method18198() / 2) * local130);
		}
		if (arg1 == null) {
			if (local130 == 1.0D) {
				arg6.method18123(arg2, arg3);
			}
			arg6.method18125(arg2, arg3, (int) ((double) arg6.method18121() * local130), (int) ((double) arg6.method18198() * local130));
		} else if (local130 == 1.0D) {
			arg6.method18197(arg2, arg3, arg1, arg2, arg3);
		} else {
			arg6.method18125(arg2, arg3, (int) ((double) arg6.method18121() * local130), (int) ((double) arg6.method18198() * local130));
		}
	}

	@OriginalMember(owner = "client!au", name = "bn", descriptor = "(Lclient!gm;Lclient!cd;IIIIILjava/lang/String;Lclient!dj;Lclient!aar;I)V", line = 846)
	static void method24256(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class90 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) String arg7, @OriginalArg(8) Class94 arg8, @OriginalArg(9) Class17 arg9, @OriginalArg(10) int arg10) {
		@Pc(18) int local18;
		if (Class11.anInt36 * -891094135 == 3) {
			local18 = (int) ((double) Class597.aClass107_Sub1_2.method8899() * 2607.5945876176133D) + client.anInt3462 * -2045337339 & 0x3FFF;
		} else if (Class11.anInt36 * -891094135 == 5) {
			local18 = (int) client.aFloat247 & 0x3FFF;
		} else {
			local18 = (int) client.aFloat247 + client.anInt3462 * -2045337339 & 0x3FFF;
		}
		@Pc(55) int local55 = Math.max(arg0.anInt3874 * -881188269 / 2, arg0.anInt3875 * -1279656873 / 2) + 10;
		@Pc(63) int local63 = arg4 * arg4 + arg5 * arg5;
		if (local63 > local55 * local55) {
			return;
		}
		@Pc(73) int local73 = Class436.anIntArray464[local18];
		@Pc(77) int local77 = Class436.anIntArray463[local18];
		if (Class11.anInt36 * -891094135 != 5) {
			local73 = local73 * 256 / (client.anInt3380 * -2002513841 + 256);
			local77 = local77 * 256 / (client.anInt3380 * -2002513841 + 256);
		}
		@Pc(112) int local112 = arg5 * local73 + arg4 * local77 >> 14;
		@Pc(122) int local122 = arg5 * local77 - local73 * arg4 >> 14;
		@Pc(129) int local129 = arg9.method308(arg7, 100, null);
		@Pc(137) int local137 = arg9.method312(arg7, 100, 0, null);
		@Pc(143) int local143 = local112 - local129 / 2;
		if (local143 >= -(arg0.anInt3874 * -881188269) && local143 <= arg0.anInt3874 * -881188269 && local122 >= -(arg0.anInt3875 * -1279656873) && local122 <= arg0.anInt3875 * -1279656873) {
			arg8.method7614(arg7, arg0.anInt3874 * -881188269 / 2 + arg2 + local143, arg0.anInt3875 * -1279656873 / 2 + arg3 - local122 - arg6 - local137, local129, 50, arg10, 0, 1, 0, 0, null, null, arg1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!au", name = "bm", descriptor = "(Lclient!gm;Lclient!cd;IIIIILjava/lang/String;Lclient!dj;Lclient!aar;I)V", line = 846)
	static void method24257(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class90 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) String arg7, @OriginalArg(8) Class94 arg8, @OriginalArg(9) Class17 arg9, @OriginalArg(10) int arg10) {
		@Pc(18) int local18;
		if (Class11.anInt36 * -891094135 == 3) {
			local18 = (int) ((double) Class597.aClass107_Sub1_2.method8899() * 2607.5945876176133D) + client.anInt3462 * -2045337339 & 0x3FFF;
		} else if (Class11.anInt36 * -891094135 == 5) {
			local18 = (int) client.aFloat247 & 0x3FFF;
		} else {
			local18 = (int) client.aFloat247 + client.anInt3462 * -2045337339 & 0x3FFF;
		}
		@Pc(55) int local55 = Math.max(arg0.anInt3874 * -881188269 / 2, arg0.anInt3875 * -1279656873 / 2) + 10;
		@Pc(63) int local63 = arg4 * arg4 + arg5 * arg5;
		if (local63 > local55 * local55) {
			return;
		}
		@Pc(73) int local73 = Class436.anIntArray464[local18];
		@Pc(77) int local77 = Class436.anIntArray463[local18];
		if (Class11.anInt36 * -891094135 != 5) {
			local73 = local73 * 256 / (client.anInt3380 * -2002513841 + 256);
			local77 = local77 * 256 / (client.anInt3380 * -2002513841 + 256);
		}
		@Pc(112) int local112 = arg5 * local73 + arg4 * local77 >> 14;
		@Pc(122) int local122 = arg5 * local77 - local73 * arg4 >> 14;
		@Pc(129) int local129 = arg9.method308(arg7, 100, null);
		@Pc(137) int local137 = arg9.method312(arg7, 100, 0, null);
		@Pc(143) int local143 = local112 - local129 / 2;
		if (local143 >= -(arg0.anInt3874 * -881188269) && local143 <= arg0.anInt3874 * -881188269 && local122 >= -(arg0.anInt3875 * -1279656873) && local122 <= arg0.anInt3875 * -1279656873) {
			arg8.method7614(arg7, arg0.anInt3874 * -881188269 / 2 + arg2 + local143, arg0.anInt3875 * -1279656873 / 2 + arg3 - local122 - arg6 - local137, local129, 50, arg10, 0, 1, 0, 0, null, null, arg1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!au", name = "bp", descriptor = "(Lclient!gm;Lclient!cd;IIIIILjava/lang/String;Lclient!dj;Lclient!aar;I)V", line = 846)
	static void method24258(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class90 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) String arg7, @OriginalArg(8) Class94 arg8, @OriginalArg(9) Class17 arg9, @OriginalArg(10) int arg10) {
		@Pc(18) int local18;
		if (Class11.anInt36 * -891094135 == 3) {
			local18 = (int) ((double) Class597.aClass107_Sub1_2.method8899() * 2607.5945876176133D) + client.anInt3462 * -2045337339 & 0x3FFF;
		} else if (Class11.anInt36 * -891094135 == 5) {
			local18 = (int) client.aFloat247 & 0x3FFF;
		} else {
			local18 = (int) client.aFloat247 + client.anInt3462 * -2045337339 & 0x3FFF;
		}
		@Pc(55) int local55 = Math.max(arg0.anInt3874 * -881188269 / 2, arg0.anInt3875 * -1279656873 / 2) + 10;
		@Pc(63) int local63 = arg4 * arg4 + arg5 * arg5;
		if (local63 > local55 * local55) {
			return;
		}
		@Pc(73) int local73 = Class436.anIntArray464[local18];
		@Pc(77) int local77 = Class436.anIntArray463[local18];
		if (Class11.anInt36 * -891094135 != 5) {
			local73 = local73 * 256 / (client.anInt3380 * -2002513841 + 256);
			local77 = local77 * 256 / (client.anInt3380 * -2002513841 + 256);
		}
		@Pc(112) int local112 = arg5 * local73 + arg4 * local77 >> 14;
		@Pc(122) int local122 = arg5 * local77 - local73 * arg4 >> 14;
		@Pc(129) int local129 = arg9.method308(arg7, 100, null);
		@Pc(137) int local137 = arg9.method312(arg7, 100, 0, null);
		@Pc(143) int local143 = local112 - local129 / 2;
		if (local143 >= -(arg0.anInt3874 * -881188269) && local143 <= arg0.anInt3874 * -881188269 && local122 >= -(arg0.anInt3875 * -1279656873) && local122 <= arg0.anInt3875 * -1279656873) {
			arg8.method7614(arg7, arg0.anInt3874 * -881188269 / 2 + arg2 + local143, arg0.anInt3875 * -1279656873 / 2 + arg3 - local122 - arg6 - local137, local129, 50, arg10, 0, 1, 0, 0, null, null, arg1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!au", name = "bk", descriptor = "(IIZ)V", line = 868)
	static void method24259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		aBooleanArrayArray11[arg0][arg1] = arg2;
	}

	@OriginalMember(owner = "client!au", name = "bo", descriptor = "(IIZ)V", line = 868)
	static void method24260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		aBooleanArrayArray11[arg0][arg1] = arg2;
	}

	@OriginalMember(owner = "client!au", name = "br", descriptor = "(IIZ)V", line = 868)
	static void method24261(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		aBooleanArrayArray11[arg0][arg1] = arg2;
	}

	@OriginalMember(owner = "client!au", name = "ax", descriptor = "(I)I", line = 949)
	static int method24262() {
		if (client.aClass277_4 == null) {
			if (Class683.aBoolean861) {
				@Pc(24) Class17 local24 = Class197.method25473();
				@Pc(28) int local28 = Class60.aClass138_1.method14234();
				@Pc(32) int local32 = Class60.aClass138_1.method14225();
				@Pc(50) int local50;
				@Pc(52) int local52;
				@Pc(84) int local84;
				@Pc(160) Class77_Sub1_Sub7 local160;
				if (Class683.aBoolean862) {
					@Pc(286) Class689 local286;
					if (local28 > Class624.anInt5644 * -620506573 && local28 < Class624.anInt5644 * -620506573 + Class639.anInt5719 * -1739196959) {
						local50 = -1;
						for (local52 = 0; local52 < Class683.anInt5840 * 1965634793; local52++) {
							if (Class683.aBoolean863) {
								local84 = Class683.anInt5836 * -260575397 + 1 + 20 + local24.anInt52 * 102396103 + Class683.anInt5819 * -238165825 * local52;
								if (local32 > local84 - local24.anInt52 * 102396103 - 1 && local32 < local24.anInt51 * 728893755 + local84) {
									local50 = local52;
								}
							} else {
								local84 = Class683.anInt5836 * -260575397 + 31 + Class683.anInt5819 * -238165825 * local52;
								if (local32 > local84 - local24.anInt52 * 102396103 - 1 && local32 < local84 + local24.anInt51 * 728893755) {
									local50 = local52;
								}
							}
						}
						if (local50 != -1) {
							local52 = 0;
							local286 = new Class689(Class683.aClass691_17);
							for (@Pc(291) Class77_Sub1_Sub11 local291 = (Class77_Sub1_Sub11) local286.method36304(); local291 != null; local291 = (Class77_Sub1_Sub11) local286.next()) {
								if (local52++ == local50) {
									return ((Class77_Sub1_Sub7) local291.aClass691_11.aClass77_Sub1_66.aClass77_Sub1_62).anInt2984 * -1664709445;
								}
							}
						}
					} else if (Class683.aClass77_Sub1_Sub11_1 != null && local28 > Class155.anInt3189 * -1803884121 && local28 < Class131_Sub3.anInt1436 * -2123561997 + Class155.anInt3189 * -1803884121) {
						local50 = -1;
						for (local52 = 0; local52 < Class683.aClass77_Sub1_Sub11_1.anInt3023 * -475442105; local52++) {
							if (Class683.aBoolean863) {
								local84 = Class683.anInt5819 * -238165825 * local52 + local24.anInt52 * 102396103 + 20 + Class75.anInt224 * 892411561 + 1;
								if (local32 > local84 - local24.anInt52 * 102396103 - 1 && local32 < local84 + local24.anInt51 * 728893755) {
									local50 = local52;
								}
							} else {
								local84 = Class683.anInt5819 * -238165825 * local52 + Class75.anInt224 * 892411561 + 31;
								if (local32 > local84 - local24.anInt52 * 102396103 - 1 && local32 < local84 + local24.anInt51 * 728893755) {
									local50 = local52;
								}
							}
						}
						if (local50 != -1) {
							local52 = 0;
							local286 = new Class689(Class683.aClass77_Sub1_Sub11_1.aClass691_11);
							for (local160 = (Class77_Sub1_Sub7) local286.method36304(); local160 != null; local160 = (Class77_Sub1_Sub7) local286.next()) {
								if (local52++ == local50) {
									return local160.anInt2984 * -1664709445;
								}
							}
						}
					}
				} else if (local28 > Class624.anInt5644 * -620506573 && local28 < Class624.anInt5644 * -620506573 + Class639.anInt5719 * -1739196959) {
					local50 = -1;
					for (local52 = 0; local52 < Class683.anInt5826 * 324852453; local52++) {
						if (Class683.aBoolean863) {
							local84 = Class683.anInt5819 * -238165825 * (Class683.anInt5826 * 324852453 - 1 - local52) + 1 + Class683.anInt5836 * -260575397 + 20 + local24.anInt52 * 102396103;
							if (local32 > local84 - local24.anInt52 * 102396103 - 1 && local32 < local24.anInt51 * 728893755 + local84) {
								local50 = local52;
							}
						} else {
							local84 = Class683.anInt5836 * -260575397 + 31 + Class683.anInt5819 * -238165825 * (Class683.anInt5826 * 324852453 - 1 - local52);
							if (local32 > local84 - local24.anInt52 * 102396103 - 1 && local32 < local24.anInt51 * 728893755 + local84) {
								local50 = local52;
							}
						}
					}
					if (local50 != -1) {
						local52 = 0;
						@Pc(155) Class704 local155 = new Class704(Class683.aClass695_55);
						for (local160 = (Class77_Sub1_Sub7) local155.method36551(); local160 != null; local160 = (Class77_Sub1_Sub7) local155.next()) {
							if (local52++ == local50) {
								return local160.anInt2984 * -1664709445;
							}
						}
					}
				}
			} else if (Class695.aClass635_1.aBoolean851) {
				if (Class301.aClass77_Sub1_Sub7_4 != null) {
					return Class301.aClass77_Sub1_Sub7_4.anInt2984 * -1664709445;
				}
			} else if (Class281.aClass77_Sub1_Sub7_3 != null) {
				return Class281.aClass77_Sub1_Sub7_3.anInt2984 * -1664709445;
			}
		}
		return -1;
	}
}
