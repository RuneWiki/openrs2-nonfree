package com.jagex;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!zn")
public class Class624 {

	@OriginalMember(owner = "client!zn", name = "p", descriptor = "I")
	static final int anInt5575 = 0;

	@OriginalMember(owner = "client!zn", name = "a", descriptor = "Lclient!ny;")
	final Class359 aClass359_117;

	@OriginalMember(owner = "client!zn", name = "g", descriptor = "[Lclient!ze;")
	final Class618[] aClass618Array1;

	@OriginalMember(owner = "client!zn", name = "l", descriptor = "I")
	final int anInt5576;

	@OriginalMember(owner = "client!zn", name = "<init>", descriptor = "(Lclient!vz;Lclient!vk;Lclient!ny;)V", line = 17)
	public Class624(@OriginalArg(0) Class543 arg0, @OriginalArg(1) Class530 arg1, @OriginalArg(2) Class359 arg2) {
		this.aClass359_117 = arg2;
		@Pc(14) Class3_Sub41 local14 = new Class3_Sub41(this.aClass359_117.method26713(0, 0));
		@Pc(29) int local29 = local14.aByteArray51 == null || local14.aByteArray51.length < 1 ? -1 : local14.method20269();
		if (local29 < 4) {
			this.aClass618Array1 = new Class618[0];
			this.anInt5576 = 1971214193;
		} else {
			@Pc(44) int local44 = local14.method20269();
			@Pc(47) Class274[] local47 = Class60_Sub27.method13866();
			@Pc(49) boolean local49 = true;
			@Pc(58) int local58;
			@Pc(66) int local66;
			if (local47.length == local44) {
				for (local58 = 0; local58 < local47.length; local58++) {
					local66 = local14.method20269();
					if (local66 != local47[local58].anInt4320 * -353989405) {
						local49 = false;
						break;
					}
				}
			} else {
				local49 = false;
			}
			if (local49) {
				local58 = local14.method20269();
				local66 = local14.method20269();
				@Pc(107) int local107;
				@Pc(103) int local103;
				if (local29 > 2) {
					this.anInt5576 = local14.method20272() * -1971214193;
					local103 = local14.method20273();
					local107 = local14.method20271();
				} else {
					this.anInt5576 = 1971214193;
					local103 = 0;
					local107 = 0;
				}
				this.aClass618Array1 = new Class618[local66 + 1];
				@Pc(123) int local123;
				for (local123 = 0; local123 < local58; local123++) {
					@Pc(130) int local130 = local14.method20269();
					@Pc(139) boolean local139 = local14.method20269() == 1;
					@Pc(143) int local143 = local14.method20271();
					@Pc(152) Class626[] local152;
					@Pc(154) int local154;
					@Pc(161) int local161;
					@Pc(165) int local165;
					@Pc(169) int local169;
					if (this.anInt5576 * 529167983 == -1) {
						local152 = new Class626[local143];
						for (local154 = 0; local154 < local143; local154++) {
							local161 = local14.method20271();
							local165 = local14.method20273();
							local169 = local14.method20271();
							local152[local154] = new Class626(local161, local165, local169);
						}
						this.aClass618Array1[local130] = new Class618(local139, local152);
					} else {
						local152 = new Class626[local143 + 1];
						local152[0] = new Class626(this.anInt5576 * 529167983, local103, local107);
						for (local154 = 0; local154 < local143; local154++) {
							local161 = local14.method20271();
							local165 = local14.method20273();
							local169 = local14.method20271();
							local152[local154 + 1] = new Class626(local161, local165, local169);
						}
					}
					this.aClass618Array1[local130] = new Class618(local139, local152);
				}
				for (local123 = 0; local123 < local66 + 1; local123++) {
					if (this.aClass618Array1[local123] == null) {
						this.aClass618Array1[local123] = this.method33773(local103, local107);
					}
				}
			} else {
				this.aClass618Array1 = new Class618[0];
				this.anInt5576 = 1971214193;
			}
		}
	}

	@OriginalMember(owner = "client!zn", name = "p", descriptor = "(III)Lclient!ze;", line = 98)
	Class618 method33773(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt5576 * 529167983 == -1) {
			return new Class618(false, new Class626[0]);
		} else {
			@Pc(22) Class626 local22 = new Class626(this.anInt5576 * 529167983, arg0, arg1);
			return new Class618(false, new Class626[] { local22 });
		}
	}

	@OriginalMember(owner = "client!zn", name = "x", descriptor = "(II)Lclient!ze;", line = 98)
	Class618 method33775(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt5576 * 529167983 == -1) {
			return new Class618(false, new Class626[0]);
		} else {
			@Pc(22) Class626 local22 = new Class626(this.anInt5576 * 529167983, arg0, arg1);
			return new Class618(false, new Class626[] { local22 });
		}
	}

	@OriginalMember(owner = "client!zn", name = "h", descriptor = "(II)Lclient!ze;", line = 98)
	Class618 method33779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt5576 * 529167983 == -1) {
			return new Class618(false, new Class626[0]);
		} else {
			@Pc(22) Class626 local22 = new Class626(this.anInt5576 * 529167983, arg0, arg1);
			return new Class618(false, new Class626[] { local22 });
		}
	}

	@OriginalMember(owner = "client!zn", name = "u", descriptor = "(I)Lclient!zq;", line = 108)
	public Class627 method33772(@OriginalArg(0) int arg0) {
		@Pc(6) byte[] local6 = this.aClass359_117.method26713(arg0, 0);
		@Pc(10) Class627 local10 = new Class627();
		local10.method33805(new Class3_Sub41(local6));
		return local10;
	}

	@OriginalMember(owner = "client!zn", name = "a", descriptor = "(II)Lclient!zq;", line = 108)
	public Class627 method33774(@OriginalArg(0) int arg0) {
		@Pc(6) byte[] local6 = this.aClass359_117.method26713(arg0, 0);
		@Pc(10) Class627 local10 = new Class627();
		local10.method33805(new Class3_Sub41(local6));
		return local10;
	}

	@OriginalMember(owner = "client!zn", name = "s", descriptor = "(I)Lclient!zq;", line = 108)
	public Class627 method33778(@OriginalArg(0) int arg0) {
		@Pc(6) byte[] local6 = this.aClass359_117.method26713(arg0, 0);
		@Pc(10) Class627 local10 = new Class627();
		local10.method33805(new Class3_Sub41(local6));
		return local10;
	}

	@OriginalMember(owner = "client!zn", name = "g", descriptor = "(II)[Lclient!zp;", line = 115)
	public Class626[] method33777(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 >= this.aClass618Array1.length) {
			return this.method33773(0, 0).aClass626Array1;
		}
		@Pc(18) Class618 local18 = this.aClass618Array1[arg0];
		if (!local18.aBoolean850 || local18.aClass626Array1.length <= 1) {
			return local18.aClass626Array1;
		}
		@Pc(39) int local39 = this.anInt5576 * 529167983 == -1 ? 0 : 1;
		@Pc(43) Random local43 = new Random();
		@Pc(48) Class626[] local48 = new Class626[local18.aClass626Array1.length];
		System.arraycopy(local18.aClass626Array1, 0, local48, 0, local48.length);
		for (@Pc(58) int local58 = local39; local58 < local48.length; local58++) {
			@Pc(72) int local72 = Class301.method25665(local43, local48.length - local39) + local39;
			@Pc(77) Class626 local77 = local18.aClass626Array1[local58];
			local48[local58] = local48[local72];
			local48[local72] = local77;
		}
		return local48;
	}

	@OriginalMember(owner = "client!zn", name = "y", descriptor = "(I)[Lclient!zp;", line = 115)
	public Class626[] method33780(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 >= this.aClass618Array1.length) {
			return this.method33773(0, 0).aClass626Array1;
		}
		@Pc(18) Class618 local18 = this.aClass618Array1[arg0];
		if (!local18.aBoolean850 || local18.aClass626Array1.length <= 1) {
			return local18.aClass626Array1;
		}
		@Pc(39) int local39 = this.anInt5576 * 529167983 == -1 ? 0 : 1;
		@Pc(43) Random local43 = new Random();
		@Pc(48) Class626[] local48 = new Class626[local18.aClass626Array1.length];
		System.arraycopy(local18.aClass626Array1, 0, local48, 0, local48.length);
		for (@Pc(58) int local58 = local39; local58 < local48.length; local58++) {
			@Pc(72) int local72 = Class301.method25665(local43, local48.length - local39) + local39;
			@Pc(77) Class626 local77 = local18.aClass626Array1[local58];
			local48[local58] = local48[local72];
			local48[local72] = local77;
		}
		return local48;
	}

	@OriginalMember(owner = "client!zn", name = "l", descriptor = "(I)Z", line = 134)
	public boolean method33776() {
		return this.anInt5576 * 529167983 != -1;
	}

	@OriginalMember(owner = "client!zn", name = "b", descriptor = "()Z", line = 134)
	public boolean method33781() {
		return this.anInt5576 * 529167983 != -1;
	}

	@OriginalMember(owner = "client!zn", name = "kv", descriptor = "([Lclient!fo;IIIIIIIIZI)V", line = 9714)
	public static final void method33782(@OriginalArg(0) Class178[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		Class613.aClass21_13.method17079(arg2, arg3, arg4, arg5);
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(15) Class178 local15 = arg0[local7];
			if (local15 != null && (local15.anInt3500 * 610124465 == arg1 || arg1 == -1412584499 && local15 == client.aClass178_13)) {
				@Pc(70) int local70;
				if (arg8 == -1) {
					client.aRectangleArray1[client.anInt3166 * 1457104959].setBounds(local15.anInt3497 * -1988957173 + arg6, arg7 + local15.anInt3510 * -1926174821, local15.anInt3498 * -1494060731, local15.anInt3499 * -751005789);
					local70 = (client.anInt3166 += -1114748993) * 1457104959 - 1;
				} else {
					local70 = arg8;
				}
				local15.anInt3581 = local70 * -631602233;
				local15.anInt3582 = client.anInt3034 * 196431355;
				if (!client.method22374(local15)) {
					if (local15.anInt3540 * 2108263643 != 0) {
						Class415.method27770(local15);
					}
					@Pc(103) int local103 = local15.anInt3497 * -1988957173 + arg6;
					@Pc(110) int local110 = local15.anInt3510 * -1926174821 + arg7;
					@Pc(115) int local115 = local15.anInt3507 * -1827200975;
					if (client.aBoolean610 && (client.method22372(local15).anInt1353 * 1263633035 != 0 || local15.anInt3492 * -107621169 == 0) && local115 > 127) {
						local115 = 127;
					}
					@Pc(187) int local187;
					@Pc(191) int local191;
					if (client.aClass178_13 == local15) {
						if (arg1 != -1412584499 && (Class178.anInt3478 * -32959165 == local15.anInt3516 * 410456335 || local15.anInt3516 * 410456335 == Class178.anInt3504 * 1056961711 || client.method22372(local15).method11810() && Class178.anInt3479 * 1336562021 != local15.anInt3516 * 410456335)) {
							Class69_Sub1.aClass178Array4 = arg0;
							Class13.anInt2438 = arg6 * -2410223;
							Class625.anInt5577 = arg7 * 1125503709;
							continue;
						}
						if (client.aBoolean604 && client.aBoolean601) {
							local187 = Class3_Sub10.aClass61_1.method12740();
							local191 = Class3_Sub10.aClass61_1.method12741();
							local187 -= client.anInt3043 * -2107267501;
							local191 -= client.anInt3132 * -1060157265;
							if (local187 < client.anInt3134 * 796552157) {
								local187 = client.anInt3134 * 796552157;
							}
							if (local15.anInt3498 * -1494060731 + local187 > client.anInt3134 * 796552157 + client.anInt3135 * 1764972057) {
								local187 = client.anInt3135 * 1764972057 + client.anInt3134 * 796552157 - local15.anInt3498 * -1494060731;
							}
							if (local191 < client.anInt3036 * 346295443) {
								local191 = client.anInt3036 * 346295443;
							}
							if (local15.anInt3499 * -751005789 + local191 > client.anInt3063 * -964554425 + client.anInt3036 * 346295443) {
								local191 = client.anInt3063 * -964554425 + client.anInt3036 * 346295443 - local15.anInt3499 * -751005789;
							}
							if (client.method22372(local15).method11810()) {
								Class198.method24130(local187, local191, local15.anInt3498 * -1494060731, local15.anInt3499 * -751005789);
							}
							if (local15.anInt3516 * 410456335 != Class178.anInt3479 * 1336562021) {
								local103 = local187;
								local110 = local191;
							}
						}
						if (Class178.anInt3504 * 1056961711 == local15.anInt3516 * 410456335) {
							local115 = 128;
						}
					}
					@Pc(326) int local326;
					@Pc(328) int local328;
					@Pc(336) int local336;
					@Pc(343) int local343;
					if (local15.anInt3492 * -107621169 == 2) {
						local187 = arg2;
						local191 = arg3;
						local326 = arg4;
						local328 = arg5;
					} else {
						local336 = local103 + local15.anInt3498 * -1494060731;
						local343 = local110 + local15.anInt3499 * -751005789;
						if (local15.anInt3492 * -107621169 == 9) {
							local336++;
							local343++;
						}
						local187 = local103 > arg2 ? local103 : arg2;
						local191 = local110 > arg3 ? local110 : arg3;
						local326 = local336 < arg4 ? local336 : arg4;
						local328 = local343 < arg5 ? local343 : arg5;
					}
					if (local187 < local326 && local191 < local328) {
						if (local15.anInt3540 * 2108263643 != 0) {
							if (local15.anInt3540 * 2108263643 == Class178.anInt3480 * -595093977 || local15.anInt3540 * 2108263643 == Class178.anInt3481 * -109032349) {
								if (client.aBoolean599) {
									Class613.aClass21_13.method17028();
									Class34.method16497(local103, local110, local15.anInt3498 * -1494060731, local15.anInt3499 * -751005789, local15.anInt3540 * 2108263643 == Class178.anInt3481 * -109032349);
									Class497.method29340(local70, local187, local191, local326, local328, local103, local110);
									Class613.aClass21_13.method17053();
									Class613.aClass21_13.method17079(arg2, arg3, arg4, arg5);
									client.aBooleanArray19[local70] = true;
								}
								continue;
							}
							if (local15.anInt3540 * 2108263643 == Class178.anInt3551 * 1022981073 && client.anInt3065 * -1773414811 == 4) {
								if (local15.anInt3492 * -107621169 != 5 || local15.method23435(Class613.aClass21_13) != null) {
									Class215.method24294(Class613.aClass21_13, local15, local103, local110);
									Class613.aClass21_13.method17079(arg2, arg3, arg4, arg5);
								}
								continue;
							}
							if (Class178.anInt3486 * 993027707 == local15.anInt3540 * 2108263643) {
								Class286.method25479(Class613.aClass21_13, local103, local110, local15);
								continue;
							}
							if (Class178.anInt3489 * -581767623 == local15.anInt3540 * 2108263643) {
								Class70.method33881(Class613.aClass21_13, local103, local110, local15, local15.anInt3506 * 225266731 % 64);
								continue;
							}
							if (local15.anInt3540 * 2108263643 == Class178.anInt3508 * -776381287) {
								if (local15.method23435(Class613.aClass21_13) != null) {
									Class613.aClass21_13.method17028();
									Class46.method8523(local15, local103, local110);
									Class613.aClass21_13.method17079(arg2, arg3, arg4, arg5);
								}
								continue;
							}
							if (Class178.anInt3482 * -1958956131 == local15.anInt3540 * 2108263643) {
								Class67.method13256(Class613.aClass21_13, local103, local110, local15.anInt3498 * -1494060731, local15.anInt3499 * -751005789);
								client.aBooleanArray19[local70] = true;
								Class613.aClass21_13.method17079(arg2, arg3, arg4, arg5);
								continue;
							}
							if (local15.anInt3540 * 2108263643 == Class178.anInt3483 * -599653365) {
								Class24.method6670(Class613.aClass21_13, local103, local110, local15.anInt3498 * -1494060731, local15.anInt3499 * -751005789);
								client.aBooleanArray19[local70] = true;
								Class613.aClass21_13.method17079(arg2, arg3, arg4, arg5);
								continue;
							}
							if (Class178.anInt3580 * -513842625 == local15.anInt3540 * 2108263643) {
								if (client.aBoolean574 || client.aBoolean575) {
									Class298.method25632(local103, local110, local15);
									client.aBooleanArray19[local70] = true;
								}
								continue;
							}
						}
						@Pc(800) int local800;
						@Pc(804) int local804;
						@Pc(808) int local808;
						if (local15.anInt3492 * -107621169 == 0) {
							if (Class178.anInt3485 * 1077229757 == local15.anInt3540 * 2108263643) {
								Class613.aClass21_13.method17121(0, 0, Class128.anInt3317 * 2037417253, Class575.anInt5428 * 1261116487);
							}
							method33782(arg0, local15.anInt3570 * 954808515, local187, local191, local326, local328, local103 - local15.anInt3573 * 598019781, local110 - local15.anInt3557 * 1648318741, local70, arg9);
							if (local15.aClass178Array6 != null) {
								method33782(local15.aClass178Array6, local15.anInt3570 * 954808515, local187, local191, local326, local328, local103 - local15.anInt3573 * 598019781, local110 - local15.anInt3557 * 1648318741, local70, arg9);
							}
							@Pc(732) Class3_Sub42 local732 = (Class3_Sub42) client.aClass581_22.method33217((long) (local15.anInt3570 * 954808515));
							if (local732 != null) {
								Class3_Sub1_Sub17.method19458(local732.anInt2796 * 1705574607, local187, local191, local326, local328, local103 - local15.anInt3573 * 598019781, local110 - local15.anInt3557 * 1648318741, local70);
							}
							if (Class178.anInt3485 * 1077229757 == local15.anInt3540 * 2108263643) {
								if (Class613.aClass21_13.method17123()) {
									Class613.aClass21_13.method17124();
									if (client.anInt3039 * 1115111877 == 5) {
										Class422.method27876(local103, local110, local15.anInt3498 * -1494060731, local15.anInt3499 * -751005789);
									}
								}
								if (client.anInt3065 * -1773414811 == 2) {
									local343 = client.anInt3070 * 1316850039;
									local800 = client.anInt3071 * 331305359;
									local804 = client.anInt3072 * 1761919517;
									local808 = client.anInt3172 * 604647413;
									if (client.anInt3034 < client.anInt3151 * 754430395) {
										@Pc(831) float local831 = (float) (client.anInt3034 - client.anInt3069 * -202335059) * 1.0F / (float) (client.anInt3151 * 754430395 - client.anInt3069 * -202335059);
										local343 = (int) (local831 * (float) (client.anInt3070 * 1316850039) + (1.0F - local831) * (float) (Class519.anInt5285 * -2118767807));
										local800 = (int) (local831 * (float) (client.anInt3071 * 331305359) + (1.0F - local831) * (float) (Class467.anInt5114 * 1231140163));
										local804 = (int) ((1.0F - local831) * (float) (Class126.anInt3313 * -1475355359) + local831 * (float) (client.anInt3072 * 1761919517));
										local808 = (int) ((float) (Class226.anInt3733 * 550672647) * (1.0F - local831) + (float) (client.anInt3172 * 604647413) * local831);
									}
									if (local343 > 0) {
										Class613.aClass21_13.method17063(local187, local191, local326 - local187, local328 - local191, local343 << 24 | local800 << 16 | local804 << 8 | local808);
									}
								}
							}
							Class613.aClass21_13.method17079(arg2, arg3, arg4, arg5);
						}
						if (client.aBooleanArray21[local70] || client.anInt3157 * 1294556851 > 1) {
							if (local15.anInt3492 * -107621169 == 3) {
								if (local115 == 0) {
									if (local15.aBoolean630) {
										Class613.aClass21_13.method17050(local103, local110, local15.anInt3498 * -1494060731, local15.anInt3499 * -751005789, local15.anInt3506 * 225266731 | 0xFF000000, 0);
									} else {
										Class613.aClass21_13.method17068(local103, local110, local15.anInt3498 * -1494060731, local15.anInt3499 * -751005789, local15.anInt3506 * 225266731 | 0xFF000000, 0);
									}
								} else if (local15.aBoolean630) {
									Class613.aClass21_13.method17050(local103, local110, local15.anInt3498 * -1494060731, local15.anInt3499 * -751005789, 255 - (local115 & 0xFF) << 24 | local15.anInt3506 * 225266731 & 0xFFFFFF, 1);
								} else {
									Class613.aClass21_13.method17068(local103, local110, local15.anInt3498 * -1494060731, local15.anInt3499 * -751005789, 255 - (local115 & 0xFF) << 24 | local15.anInt3506 * 225266731 & 0xFFFFFF, 1);
								}
							} else if (local15.anInt3492 * -107621169 == 4) {
								local336 = 255 - (local115 & 0xFF);
								if (local336 != 0) {
									@Pc(1072) Class14 local1072 = local15.method23432(Class379.aClass312_1, client.anInterface34_1);
									if (local1072 != null) {
										local800 = local15.anInt3506 * 225266731;
										@Pc(1089) String local1089 = local15.aString169;
										if (local15.anInt3559 * 1976441867 != -1) {
											@Pc(1103) Class594 local1103 = Class44_Sub3.aClass596_1.method33435(local15.anInt3559 * 1976441867);
											local1089 = local1103.aString243;
											if (local1089 == null) {
												local1089 = "null";
											}
											if ((local1103.anInt5473 * 1865134295 == 1 || local15.anInt3563 * -1429853457 != 1) && local15.anInt3563 * -1429853457 != -1) {
												local1089 = Class271.method25310(16748608) + local1089 + Class1.aString8 + " x" + Class226.method24482(local15.anInt3563 * -1429853457);
											}
										}
										if (local15.anInt3476 * -1129554023 != -1) {
											local1089 = Class84.method21633(local15.anInt3476 * -1129554023);
											if (local1089 == null) {
												local1089 = "";
											}
										}
										if (client.aClass178_10 == local15) {
											local1089 = Class601.aClass601_141.method33512(Class469.aClass530_2);
											local800 = local15.anInt3506 * 225266731;
										}
										if (client.aBoolean609) {
											Class613.aClass21_13.method17209(local103, local110, local15.anInt3498 * -1494060731 + local103, local15.anInt3499 * -751005789 + local110);
										}
										local336 <<= 0x18;
										if (local15.aBoolean646) {
											local1072.method3296(local1089, local103, local110, local15.anInt3498 * -1494060731, local15.anInt3499 * -751005789, local336 | local800, local15.aBoolean638 ? local336 : -1, local15.anInt3562 * -183226783, local15.anInt3553 * 1406609021, client.aRandom1, Class634.anInt5593, client.anIntArray302, Class19_Sub1.aClass6Array10, null);
										} else {
											local1072.method3284(local1089, local103, local110, local15.anInt3498 * -1494060731, local15.anInt3499 * -751005789, local336 | local800, local15.aBoolean638 ? local336 : -1, local15.anInt3562 * -183226783, local15.anInt3553 * 1406609021, local15.anInt3541 * -815720547, local15.anInt3556 * 749320319, Class19_Sub1.aClass6Array10, null, null, 0, 0);
										}
										if (client.aBoolean609) {
											Class613.aClass21_13.method17079(arg2, arg3, arg4, arg5);
										}
									} else if (Class178.aBoolean626) {
										Class223.method24442(local15);
									}
								}
							} else {
								@Pc(1556) int local1556;
								@Pc(1569) int local1569;
								@Pc(1574) int local1574;
								if (local15.anInt3492 * -107621169 == 5) {
									if (local15.anInt3565 * -449848023 >= 0) {
										local15.method23436(Class369.aClass413_1, Class375.aClass200_1).method27455(Class613.aClass21_13, 0, local103, local110, local15.anInt3498 * -1494060731, local15.anInt3499 * -751005789, local15.anInt3569 * 874301959 << 3, local15.anInt3566 * 1947349897 << 3, 0);
									} else {
										@Pc(1384) Class6 local1384;
										if (local15.anInt3559 * 1976441867 != -1) {
											@Pc(1356) Class488 local1356 = local15.aBoolean642 ? Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aClass488_1 : null;
											local1384 = Class44_Sub3.aClass596_1.method33436(Class613.aClass21_13, local15.anInt3559 * 1976441867, local15.anInt3563 * -1429853457, local15.anInt3532 * 1688841995, local15.anInt3511 * -846603747 | 0xFF000000, local15.anInt3501 * -58397333, local1356);
										} else if (local15.anInt3476 * -1129554023 != -1) {
											local1384 = Class57.method12276(Class613.aClass21_13, local15.anInt3476 * -1129554023);
										} else if (local15.anInt3571 * -364871717 == -1) {
											local1384 = local15.method23431(Class613.aClass21_13);
										} else {
											local1384 = (Class6) client.aClass161_16.method23219((long) (local15.anInt3571 * -364871717));
											if (local1384 == null && !client.aMap7.containsKey(local15.anInt3571 * -364871717)) {
												try {
													client.aMap7.put(local15.anInt3571 * -364871717, Class146.aClass423_1.method27878(new URL(client.aString146 + "/img/image_" + local15.anInt3571 * -364871717 + ".png?a=" + Class176.method23413())));
												} catch (@Pc(1459) MalformedURLException local1459) {
													Class27_Sub1.method7214(null, local1459);
												}
											}
										}
										if (local1384 != null) {
											local343 = local1384.method16772();
											local800 = local1384.method16779();
											local804 = 255 - (local115 & 0xFF);
											if (local804 != 0) {
												if (local15.anInt3506 * 225266731 == -1) {
													local808 = 16777215;
												} else {
													local808 = local15.anInt3506 * 225266731 & 0xFFFFFF;
													if (local808 == 0) {
														local808 = 16777215;
													}
												}
												local808 |= local804 << 24;
												@Pc(1521) boolean local1521 = local808 != -1;
												if (local15.aBoolean632) {
													Class613.aClass21_13.method17209(local103, local110, local15.anInt3498 * -1494060731 + local103, local110 + local15.anInt3499 * -751005789);
													if (local15.anInt3574 * -1289212201 != 0) {
														local1556 = (local343 - 1 + local15.anInt3498 * -1494060731) / local343;
														@Pc(1567) int local1567 = (local800 - 1 + local15.anInt3499 * -751005789) / local800;
														for (local1569 = 0; local1569 < local1556; local1569++) {
															for (local1574 = 0; local1574 < local1567; local1574++) {
																if (local1521) {
																	local1384.method16822((float) (local1569 * local343 + local103) + (float) local343 / 2.0F, (float) (local1574 * local800 + local110) + (float) local800 / 2.0F, 4096, local15.anInt3574 * -1289212201, 0, local808, 1);
																} else {
																	local1384.method16792((float) local343 / 2.0F + (float) (local343 * local1569 + local103), (float) local800 / 2.0F + (float) (local800 * local1574 + local110), 4096, local15.anInt3574 * -1289212201);
																}
															}
														}
													} else if (local1521) {
														local1384.method16790(local103, local110, local15.anInt3498 * -1494060731, local15.anInt3499 * -751005789, 0, local808, 1);
													} else {
														local1384.method16789(local103, local110, local15.anInt3498 * -1494060731, local15.anInt3499 * -751005789);
													}
													Class613.aClass21_13.method17079(arg2, arg3, arg4, arg5);
												} else if (local1521) {
													if (local15.anInt3574 * -1289212201 != 0) {
														local1384.method16822((float) local103 + (float) (local15.anInt3498 * -1494060731) / 2.0F, (float) local110 + (float) (local15.anInt3499 * -751005789) / 2.0F, local15.anInt3498 * 655642624 / local343, local15.anInt3574 * -1289212201, 0, local808, 1);
													} else if (local15.anInt3498 * -1494060731 == local343 && local15.anInt3499 * -751005789 == local800) {
														local1384.method16794(local103, local110, 0, local808, 1);
													} else {
														local1384.method16824(local103, local110, local15.anInt3498 * -1494060731, local15.anInt3499 * -751005789, 0, local808, 1);
													}
												} else if (local15.anInt3574 * -1289212201 != 0) {
													local1384.method16777((float) local103 + (float) (local15.anInt3498 * -1494060731) / 2.0F, (float) (local15.anInt3499 * -751005789) / 2.0F + (float) local110, (float) local343 / 2.0F, (float) local800 / 2.0F, local15.anInt3498 * 655642624 / local343, local15.anInt3499 * -923127808 / local800, local15.anInt3574 * -1289212201, 1, -1, 1);
												} else if (local15.anInt3498 * -1494060731 == local343 && local800 == local15.anInt3499 * -751005789) {
													local1384.method16783(local103, local110);
												} else {
													local1384.method16786(local103, local110, local15.anInt3498 * -1494060731, local15.anInt3499 * -751005789);
												}
											}
										} else if (Class178.aBoolean626) {
											Class223.method24442(local15);
										}
									}
								} else if (local15.anInt3492 * -107621169 == 6) {
									Class613.aClass21_13.method17028();
									@Pc(1864) Class20 local1864 = null;
									local343 = 2048;
									if (local15.anInt3550 * -2038511965 != 0) {
										local343 |= 0x80000;
									}
									local800 = 0;
									if (local15.anInt3559 * 1976441867 == -1) {
										@Pc(1956) Class26_Sub1_Sub1_Sub1_Sub2 local1956;
										if (local15.anInt3513 * -2138884745 == 3) {
											local804 = local15.anInt3514 * -472903775;
											if (local804 >= 0 && local804 < 2048) {
												local1956 = client.aClass26_Sub1_Sub1_Sub1_Sub2Array1[local804];
												if (local1956 != null && (local804 == client.anInt3115 * 2077649275 || Class481.method29081(local1956.aString75) == local15.anInt3493 * 501117109)) {
													local1864 = local15.method23434(Class613.aClass21_13, local343, Class399.aClass428_1, Class585.aClass228_2, Class498.aClass579_1, Class44_Sub3.aClass596_1, Class110.aClass436_1, Class424.aClass165_1, Class424.aClass165_1, local15.aClass71_6, local1956.aClass488_1);
													if (local1864 == null && Class178.aBoolean626) {
														Class223.method24442(local15);
													}
												}
											}
										} else if (local15.anInt3513 * -2138884745 == 5) {
											local804 = local15.anInt3514 * -472903775;
											local1956 = null;
											if (local804 >= 0 && local804 < 2048) {
												local1956 = client.aClass26_Sub1_Sub1_Sub1_Sub2Array1[local804];
											} else if (local804 == -1) {
												local1956 = Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3;
											}
											if (local1956 != null && local1956.aClass488_1 != null && (local804 == -1 || local804 == client.anInt3115 * 2077649275 || Class481.method29081(local1956.aString75) == local15.anInt3493 * 501117109)) {
												local1864 = local1956.aClass488_1.method29200(Class613.aClass21_13, local343, Class399.aClass428_1, Class585.aClass228_2, Class498.aClass579_1, Class44_Sub3.aClass596_1, Class424.aClass165_1, Class424.aClass165_1, local15.aClass71_6, null, null, null, 0, true, Class589.aClass489_2);
											}
										} else if (local15.anInt3513 * -2138884745 == 8 || local15.anInt3513 * -2138884745 == 9) {
											@Pc(2090) Class3_Sub8 local2090 = Class14.method3338(local15.anInt3514 * -472903775, false);
											if (local2090 != null) {
												local1864 = local2090.method10831(Class613.aClass21_13, local343, local15.aClass71_6, local15.anInt3493 * 501117109, local15.anInt3513 * -2138884745 == 9, local15.aBoolean642 ? Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aClass488_1 : null);
											}
										} else if (local15.aClass71_6 != null && local15.aClass71_6.method20021()) {
											local1864 = local15.method23434(Class613.aClass21_13, local343, Class399.aClass428_1, Class585.aClass228_2, Class498.aClass579_1, Class44_Sub3.aClass596_1, Class110.aClass436_1, Class424.aClass165_1, Class424.aClass165_1, local15.aClass71_6, Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aClass488_1);
											if (local1864 == null && Class178.aBoolean626) {
												Class223.method24442(local15);
											}
										} else {
											local1864 = local15.method23434(Class613.aClass21_13, local343, Class399.aClass428_1, Class585.aClass228_2, Class498.aClass579_1, Class44_Sub3.aClass596_1, Class110.aClass436_1, Class424.aClass165_1, Class424.aClass165_1, null, Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aClass488_1);
											if (local1864 == null && Class178.aBoolean626) {
												Class223.method24442(local15);
											}
										}
									} else {
										@Pc(1892) Class594 local1892 = Class44_Sub3.aClass596_1.method33435(local15.anInt3559 * 1976441867);
										if (local1892 != null) {
											local1892 = local1892.method33367(local15.anInt3563 * -1429853457);
											local1864 = local1892.method33358(Class613.aClass21_13, local343, 1, local15.aBoolean642 ? Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aClass488_1 : null, local15.aClass71_6, 0, 0, 0, 0);
											if (local1864 == null) {
												Class223.method24442(local15);
											} else {
												local800 = -local1864.method5466() >> 1;
											}
										}
									}
									if (local1864 != null) {
										if (local15.anInt3550 * -2038511965 != 0) {
											local1864.method5373(local15.anInt3527 * 1158088965, local15.anInt3528 * 487827353, local15.anInt3529 * 1413361231, local15.anInt3550 * -2038511965);
										}
										if (local15.anInt3524 * -1898374355 > 0) {
											local804 = (local15.anInt3498 * -1494060731 << 9) / (local15.anInt3524 * -1898374355);
										} else {
											local804 = 512;
										}
										if (local15.anInt3525 * -1553337443 > 0) {
											local808 = (local15.anInt3499 * -751005789 << 9) / (local15.anInt3525 * -1553337443);
										} else {
											local808 = 512;
										}
										@Pc(2252) int local2252 = local15.anInt3498 * -1494060731 / 2 + local103;
										local1556 = local15.anInt3499 * -751005789 / 2 + local110;
										if (!local15.aBoolean640) {
											local2252 += local804 * 1865601231 * local15.anInt3526 >> 9;
											local1556 += local15.anInt3521 * -1326573227 * local808 >> 9;
										}
										client.aClass332_51.method26233();
										Class613.aClass21_13.method17106(client.aClass332_51);
										@Pc(2294) Class328 local2294 = Class613.aClass21_13.method17333();
										local1569 = client.aClass370_1.method27009();
										local1574 = client.aClass370_1.method26948();
										@Pc(2309) int local2309 = local1574 + local15.anInt3523 * 260568357;
										if (local15.aBoolean635) {
											if (Class72.anInt2086 * 81180077 == 3) {
												if (local15.aBoolean640) {
													local2294.method26060((float) local2252, (float) local1556, (float) local804, (float) local808, Class80.aClass23_Sub1_1.method5892(), Class80.aClass23_Sub1_1.method5845(), (float) (Class128.anInt3317 * 2037417253), (float) (Class575.anInt5428 * 1261116487), (float) (local15.anInt3523 * 260568357));
												} else {
													local2294.method26060((float) local2252, (float) local1556, (float) local804, (float) local808, Class80.aClass23_Sub1_1.method5892(), Class80.aClass23_Sub1_1.method5845(), (float) (Class128.anInt3317 * 2037417253), (float) (Class575.anInt5428 * 1261116487), (float) (local15.anInt3523 * 260568357 << 2));
												}
											} else if (local15.aBoolean640) {
												local2294.method26060((float) local2252, (float) local1556, (float) local804, (float) local808, (float) local1569, (float) local2309, (float) (Class128.anInt3317 * 2037417253), (float) (Class575.anInt5428 * 1261116487), (float) (local15.anInt3523 * 260568357));
											} else {
												local2294.method26060((float) local2252, (float) local1556, (float) local804, (float) local808, (float) local1569, (float) local2309, (float) (Class128.anInt3317 * 2037417253), (float) (Class575.anInt5428 * 1261116487), (float) (local15.anInt3523 * 260568357 << 2));
											}
										} else if (Class72.anInt2086 * 81180077 == 3) {
											local2294.method26059((float) local2252, (float) local1556, (float) local804, (float) local808, Class80.aClass23_Sub1_1.method5892(), Class80.aClass23_Sub1_1.method5845(), (float) (Class128.anInt3317 * 2037417253), (float) (Class575.anInt5428 * 1261116487));
										} else {
											local2294.method26059((float) local2252, (float) local1556, (float) local804, (float) local808, (float) local1569, (float) local2309, (float) (Class128.anInt3317 * 2037417253), (float) (Class575.anInt5428 * 1261116487));
										}
										Class613.aClass21_13.method17322(local2294);
										Class613.aClass21_13.method17061(2, 0);
										if (local15.aBoolean636) {
											Class613.aClass21_13.method17108(false);
										}
										if (local15.aBoolean640) {
											client.aClass332_52.method26204(1.0F, 0.0F, 0.0F, Class317.method25842(local15.anInt3518 * 351958085));
											client.aClass332_52.method26198(0.0F, 1.0F, 0.0F, Class317.method25842(local15.anInt3519 * 492943859));
											client.aClass332_52.method26198(0.0F, 0.0F, 1.0F, Class317.method25842(local15.anInt3520 * 1884512825));
											client.aClass332_52.method26203((float) (local15.anInt3526 * 1865601231), (float) (local15.anInt3521 * -1326573227), (float) (local15.anInt3522 * 353383921));
										} else {
											@Pc(2577) int local2577 = (local15.anInt3523 * 260568357 << 2) * Class317.anIntArray419[local15.anInt3518 * 351958085 << 3] >> 14;
											@Pc(2595) int local2595 = (local15.anInt3523 * 260568357 << 2) * Class317.anIntArray420[local15.anInt3518 * 351958085 << 3] >> 14;
											client.aClass332_52.method26204(0.0F, 0.0F, 1.0F, Class317.method25842(-(local15.anInt3520 * 1884512825) << 3));
											client.aClass332_52.method26198(0.0F, 1.0F, 0.0F, Class317.method25842(local15.anInt3519 * 492943859 << 3));
											client.aClass332_52.method26203((float) (local15.anInt3561 * -1625983971 << 2), (float) (local2577 + (local15.anInt3517 * -1321366055 << 2) + local800), (float) (local2595 + (local15.anInt3517 * -1321366055 << 2)));
											client.aClass332_52.method26198(1.0F, 0.0F, 0.0F, Class317.method25842(local15.anInt3518 * 351958085 << 3));
										}
										local15.method23491(Class613.aClass21_13, local1864, client.aClass332_52, client.anInt3034);
										Class613.aClass21_13.method17053();
										Class613.aClass21_13.method17059(true);
										Class613.aClass21_13.method17079(arg2, arg3, arg4, arg5);
										if (client.aBoolean609) {
											Class613.aClass21_13.method17209(local103, local110, local15.anInt3498 * -1494060731 + local103, local15.anInt3499 * -751005789 + local110);
										}
										if (local15.aBoolean637) {
											client.aClass370_1.method26953().method28883((float) (local15.anInt3536 * 1839325951) / 256.0F, (float) (local15.anInt3534 * 574785159) / 256.0F, (float) (local15.anInt3535 * 1428980601) / 256.0F, local15.anInt3537 * 1753893539, local15.anInt3531 * 433574575, local15.anInt3579 * 412221839, local15.anInt3533 * 116666109, local15.anInt3538 * 1911448473);
										} else {
											client.aClass370_1.method26953().method28890();
										}
										local1864.method5352(client.aClass332_52, null, 1);
										if (!local15.aBoolean635 && local15.aClass478_6 != null) {
											Class613.aClass21_13.method17105(local15.aClass478_6.method28840());
										}
										if (client.aBoolean609) {
											Class613.aClass21_13.method17079(arg2, arg3, arg4, arg5);
										}
										Class613.aClass21_13.method17059(false);
										Class613.aClass21_13.method17056();
										Class613.aClass21_13.method17079(arg2, arg3, arg4, arg5);
										if (local15.aBoolean637) {
											client.aClass370_1.method26953().method28890();
										}
										if (local15.aBoolean636) {
											Class613.aClass21_13.method17108(true);
										}
									}
								} else if (local15.anInt3492 * -107621169 == 9) {
									if (local15.aBoolean631) {
										local336 = local103;
										local343 = local15.anInt3499 * -751005789 + local110;
										local800 = local15.anInt3498 * -1494060731 + local103;
										local804 = local110;
									} else {
										local336 = local103;
										local343 = local110;
										local800 = local103 + local15.anInt3498 * -1494060731;
										local804 = local110 + local15.anInt3499 * -751005789;
									}
									if (local15.anInt3575 * 184706957 == 1) {
										Class613.aClass21_13.method17024(local336, local343, local800, local804, local15.anInt3506 * 225266731 | 0xFF000000, 0);
									} else {
										Class613.aClass21_13.method17078(local336, local343, local800, local804, local15.anInt3506 * 225266731 | 0xFF000000, local15.anInt3575 * 184706957, 0);
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
