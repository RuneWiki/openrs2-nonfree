package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ms")
public class Class405 implements Interface47 {

	@OriginalMember(owner = "client!ms", name = "kw", descriptor = "I")
	public static int anInt4704;

	@OriginalMember(owner = "client!ms", name = "c", descriptor = "Lclient!er;")
	Class232 aClass232_79 = new Class232(64);

	@OriginalMember(owner = "client!ms", name = "p", descriptor = "Lclient!pw;")
	Class478 aClass478_113;

	@OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(Lclient!pw;)V", line = 12)
	public Class405(@OriginalArg(0) Class478 arg0) {
		this.aClass478_113 = arg0;
	}

	@OriginalMember(owner = "client!ms", name = "v", descriptor = "(I)Lclient!me;", line = 17)
	@Override
	public synchronized Class396 method28526(@OriginalArg(0) int arg0) {
		@Pc(6) Class396 local6 = (Class396) this.aClass232_79.method25835((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(18) byte[] local18 = this.aClass478_113.method29725(0, arg0);
		local6 = new Class396();
		if (local18 != null) {
			local6.method28423(new Class77_Sub39(local18));
		}
		local6.method28433();
		this.aClass232_79.method25844(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!ms", name = "l", descriptor = "(I)Lclient!me;", line = 17)
	@Override
	public synchronized Class396 method28529(@OriginalArg(0) int arg0) {
		@Pc(6) Class396 local6 = (Class396) this.aClass232_79.method25835((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(18) byte[] local18 = this.aClass478_113.method29725(0, arg0);
		local6 = new Class396();
		if (local18 != null) {
			local6.method28423(new Class77_Sub39(local18));
		}
		local6.method28433();
		this.aClass232_79.method25844(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!ms", name = "y", descriptor = "(I)Lclient!me;", line = 17)
	@Override
	public synchronized Class396 method28527(@OriginalArg(0) int arg0) {
		@Pc(6) Class396 local6 = (Class396) this.aClass232_79.method25835((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(18) byte[] local18 = this.aClass478_113.method29725(0, arg0);
		local6 = new Class396();
		if (local18 != null) {
			local6.method28423(new Class77_Sub39(local18));
		}
		local6.method28433();
		this.aClass232_79.method25844(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!ms", name = "p", descriptor = "(II)Lclient!me;", line = 17)
	@Override
	public synchronized Class396 method28528(@OriginalArg(0) int arg0) {
		@Pc(6) Class396 local6 = (Class396) this.aClass232_79.method25835((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(18) byte[] local18 = this.aClass478_113.method29725(0, arg0);
		local6 = new Class396();
		if (local18 != null) {
			local6.method28423(new Class77_Sub39(local18));
		}
		local6.method28433();
		this.aClass232_79.method25844(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!ms", name = "c", descriptor = "(II)Lclient!zy;", line = 24)
	public static Class705 method28530(@OriginalArg(0) int arg0) {
		@Pc(2) Class705[] local2 = Class173.method24539();
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class705 local12 = local2[local4];
			if (local12.anInt5890 * -1439134429 == arg0) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ms", name = "t", descriptor = "()V", line = 28)
	public void method28531() {
		this.aClass232_79.method25850();
	}

	@OriginalMember(owner = "client!ms", name = "c", descriptor = "(B)V", line = 28)
	public void method28532() {
		this.aClass232_79.method25850();
	}

	@OriginalMember(owner = "client!ms", name = "w", descriptor = "()V", line = 28)
	public void method28533() {
		this.aClass232_79.method25850();
	}

	@OriginalMember(owner = "client!ms", name = "t", descriptor = "(Lclient!dx;IB)Z", line = 102)
	static boolean method28534(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1) {
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
			if (local37 >= 0 && local37 < Class156.aBooleanArrayArray11.length && local44 >= 0 && local44 < Class156.aBooleanArrayArray11[local37].length && Class156.aBooleanArrayArray11[local37][local44]) {
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
		if (Class156.aBoolean550) {
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
		arg0.method20080(Class156.anIntArray296);
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
				if (Class156.aBoolean549) {
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
				if (!Class156.aBoolean550) {
					Class609.aClass83_38.method18213((local304 - local72) * 4 + 48, local18 * 4 + 48 - (local311 - local74) * 4 - local70 * 4, local70 * 4, local70 * 4, local318, local320);
					if (Class156.aBoolean549) {
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
		if (Class156.aBoolean550) {
			arg0.method19972(local162);
			if (Class156.aBoolean549) {
				Class609.aClass83_38.method18123(256, 0);
				try {
					arg0.method19926();
					Class281.method26679(2000L);
				} catch (@Pc(601) Exception local601) {
				}
			}
		}
		arg0.method20299();
		arg0.method20104(Class156.anIntArray296[0], Class156.anIntArray296[1], Class156.anIntArray296[2], Class156.anIntArray296[3]);
		arg0.method20125(1, 1);
		Class430.method28815();
		Class156.anInt3237 = 0;
		Class156.aClass695_42.method36380();
		if (!Class156.aBoolean552) {
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
							Class156.aClass695_42.method36383(new Class77_Sub40(local318));
						} else {
							@Pc(715) Class302 local715 = (Class302) Class251.aClass35_Sub10_3.method18319(local637.anIntArray480[local318]);
							if (local715.anIntArray422 != null && local322 + local715.anInt4046 * -321707117 >= 0 && local322 + local715.anInt4036 * 1863424643 < local14 && local328 + local715.anInt4039 * -967887583 >= 0 && local328 + local715.anInt4033 * 148212907 < local18) {
								Class156.aClass695_42.method36383(new Class77_Sub40(local318));
							}
						}
					}
				}
				Class251.aClass35_Sub10_3.method17150(128, 64);
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ms", name = "agi", descriptor = "(Lclient!yf;B)V", line = 10563)
	static final void method28535(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 926998689;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(33) int local33 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 2];
		@Pc(38) Class77_Sub1_Sub13 local38 = RuntimeException_Sub4.aClass41_2.method688(local13);
		if (local38.method22318(local23).anInt5714 * 41641943 != 0) {
			throw new RuntimeException("");
		}
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local38.method22321(local23, local33);
	}

	@OriginalMember(owner = "client!ms", name = "aqd", descriptor = "(Lclient!yf;I)V", line = 12335)
	static final void method28536(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 308999563;
	}
}
