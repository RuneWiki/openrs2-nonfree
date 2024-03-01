package com.jagex;

import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!an")
public class Class75 {

	@OriginalMember(owner = "client!an", name = "a", descriptor = "Z")
	volatile boolean aBoolean480;

	@OriginalMember(owner = "client!an", name = "g", descriptor = "[B")
	volatile byte[] aByteArray48;

	@OriginalMember(owner = "client!an", name = "p", descriptor = "Ljava/net/URL;")
	final URL anURL1;

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Ljava/net/URL;)V", line = 82)
	Class75(@OriginalArg(0) URL arg0) {
		this.anURL1 = arg0;
	}

	@OriginalMember(owner = "client!an", name = "p", descriptor = "(B)Z", line = 87)
	boolean method19516() {
		return this.aBoolean480;
	}

	@OriginalMember(owner = "client!an", name = "g", descriptor = "()Z", line = 87)
	boolean method19518() {
		return this.aBoolean480;
	}

	@OriginalMember(owner = "client!an", name = "l", descriptor = "()Z", line = 87)
	boolean method19519() {
		return this.aBoolean480;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(B)[B", line = 91)
	byte[] method19517() {
		return this.aByteArray48;
	}

	@OriginalMember(owner = "client!an", name = "x", descriptor = "()[B", line = 91)
	byte[] method19520() {
		return this.aByteArray48;
	}

	@OriginalMember(owner = "client!an", name = "h", descriptor = "()[B", line = 91)
	byte[] method19521() {
		return this.aByteArray48;
	}

	@OriginalMember(owner = "client!an", name = "h", descriptor = "(Lclient!ahw;I)V", line = 185)
	static void method19522(@OriginalArg(0) Class64_Sub1 arg0) {
		arg0.method13104(0);
		@Pc(18) byte local18;
		if (Class390.anInt3031 * -435910341 >= 96) {
			@Pc(11) int local11 = Class46.method8524();
			if (local11 <= 104) {
				Class565.method32912();
				local18 = 4;
			} else if (local11 <= 502) {
				Class572.method33073();
				local18 = 3;
			} else if (local11 <= 1003) {
				Class210.method24250();
				local18 = 2;
			} else {
				Class280.method25423();
				local18 = 1;
			}
			arg0.method13105(0, local11);
		} else {
			Class280.method25423();
			local18 = 1;
			arg0.method13103(64);
		}
		if (Class510.aClass3_Sub45_37.aClass60_Sub10_2.method13373() == 0) {
			Class510.aClass3_Sub45_37.method13000(Class510.aClass3_Sub45_37.aClass60_Sub10_2, true);
		} else {
			Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub10_1, 0);
			Class546.method32647(0, false);
		}
		Class26_Sub1_Sub1_Sub1.method16728();
		arg0.method13102(local18);
	}

	@OriginalMember(owner = "client!an", name = "fo", descriptor = "(Lclient!av;I)V", line = 2243)
	static void method19526(@OriginalArg(0) Class82 arg0) {
		@Pc(5) Class3_Sub23 local5 = Class269.method25284(Class311.aClass311_67, arg0.aClass577_2);
		local5.aClass3_Sub41_Sub1_1.method20250(Class492.method29292());
		local5.aClass3_Sub41_Sub1_1.method20251(Class128.anInt3317 * 2037417253);
		local5.aClass3_Sub41_Sub1_1.method20251(Class575.anInt5428 * 1261116487);
		local5.aClass3_Sub41_Sub1_1.method20250(Class510.aClass3_Sub45_37.aClass60_Sub27_2.method13857());
		arg0.method21601(local5);
	}

	@OriginalMember(owner = "client!an", name = "hn", descriptor = "(Lclient!act;ZB)V", line = 3808)
	static final void method19527(@OriginalArg(0) Class26_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(3) Class445 local3 = arg0.method16690();
		if (arg0.anInt2362 * -162520433 == 0) {
			arg0.anInt2384 = 0;
			Class30_Sub1.anInt770 = Class538.aClass538_4.aByte171 * 1653883683;
			Class107.anInt2992 = 0;
			return;
		}
		if (arg0.aClass71_3.method20021() && !arg0.aClass71_3.method20032()) {
			@Pc(35) Class440 local35 = arg0.aClass71_3.method20069();
			if (arg0.anInt2385 * -1943098143 > 0 && local35.anInt4935 * 394312291 == 0) {
				arg0.anInt2384 += 1549754299;
				Class30_Sub1.anInt770 = Class538.aClass538_4.aByte171 * 1653883683;
				Class107.anInt2992 = 0;
				return;
			}
			if (arg0.anInt2385 * -1943098143 <= 0 && local35.anInt4937 * 988717411 == 0) {
				arg0.anInt2384 += 1549754299;
				Class30_Sub1.anInt770 = Class538.aClass538_4.aByte171 * 1653883683;
				Class107.anInt2992 = 0;
				return;
			}
		}
		for (@Pc(85) int local85 = 0; local85 < arg0.aClass384Array3.length; local85++) {
			if (arg0.aClass384Array3[local85].anInt4716 * 1164757693 != -1 && arg0.aClass384Array3[local85].aClass71_7.method20032()) {
				@Pc(118) Class520 local118 = Class19.aClass523_14.method29823(arg0.aClass384Array3[local85].anInt4716 * 1164757693);
				if (local118.aBoolean820 && local118.anInt5294 * -1332447219 != -1) {
					@Pc(135) Class440 local135 = Class110.aClass436_1.method27999(local118.anInt5294 * -1332447219);
					if (arg0.anInt2385 * -1943098143 > 0 && local135.anInt4935 * 394312291 == 0) {
						arg0.anInt2384 += 1549754299;
						Class30_Sub1.anInt770 = Class538.aClass538_4.aByte171 * 1653883683;
						Class107.anInt2992 = 0;
						return;
					}
					if (arg0.anInt2385 * -1943098143 <= 0 && local135.anInt4937 * 988717411 == 0) {
						arg0.anInt2384 += 1549754299;
						Class30_Sub1.anInt770 = Class538.aClass538_4.aByte171 * 1653883683;
						Class107.anInt2992 = 0;
						return;
					}
				}
			}
		}
		@Pc(191) Class320 local191 = Class320.method25906(arg0.method21431().aClass320_61);
		@Pc(195) int local195 = (int) local191.aFloat259;
		@Pc(199) int local199 = (int) local191.aFloat261;
		@Pc(217) int local217 = arg0.anIntArray241[arg0.anInt2362 * -162520433 - 1] * 512 + arg0.method16630() * 256;
		@Pc(235) int local235 = arg0.anIntArray239[arg0.anInt2362 * -162520433 - 1] * 512 + arg0.method16630() * 256;
		if (local195 < local217) {
			if (local199 < local235) {
				arg0.method16633(10240);
			} else if (local199 > local235) {
				arg0.method16633(14336);
			} else {
				arg0.method16633(12288);
			}
		} else if (local195 > local217) {
			if (local199 < local235) {
				arg0.method16633(6144);
			} else if (local199 > local235) {
				arg0.method16633(2048);
			} else {
				arg0.method16633(4096);
			}
		} else if (local199 < local235) {
			arg0.method16633(8192);
		} else if (local199 > local235) {
			arg0.method16633(0);
		}
		@Pc(308) byte local308 = arg0.aByteArray41[arg0.anInt2362 * -162520433 - 1];
		if (!arg1 && (local217 - local195 > 1024 || local217 - local195 < -1024 || local235 - local199 > 1024 || local235 - local199 < -1024)) {
			arg0.method21437((float) local217, local191.aFloat260, (float) local235);
			arg0.method16634(arg0.anInt2381 * 856615359, false);
			arg0.anInt2362 -= 2015411311;
			if (arg0.anInt2385 * -1943098143 > 0) {
				arg0.anInt2385 -= -345794783;
			}
			Class30_Sub1.anInt770 = Class538.aClass538_4.aByte171 * 1653883683;
			Class107.anInt2992 = 0;
			local191.method25874();
			return;
		}
		@Pc(375) int local375 = 16;
		@Pc(377) boolean local377 = true;
		if (arg0 instanceof Class26_Sub1_Sub1_Sub1_Sub1) {
			local377 = ((Class26_Sub1_Sub1_Sub1_Sub1) arg0).aClass571_1.aBoolean833;
		}
		@Pc(398) int local398;
		if (local377) {
			local398 = arg0.anInt2381 * 856615359 - arg0.aClass106_7.anInt2990 * 1871843793;
			if (local398 != 0 && arg0.anInt2364 * -867983489 == -1 && arg0.anInt2358 * 1280627541 != 0) {
				local375 = 8;
			}
			if (!arg1 && arg0.anInt2362 * -162520433 > 2) {
				local375 = 24;
			}
			if (!arg1 && arg0.anInt2362 * -162520433 > 3) {
				local375 = 32;
			}
		} else {
			if (!arg1 && arg0.anInt2362 * -162520433 > 1) {
				local375 = 24;
			}
			if (!arg1 && arg0.anInt2362 * -162520433 > 2) {
				local375 = 32;
			}
		}
		if (arg0.anInt2384 * -1570075277 > 0 && arg0.anInt2362 * -162520433 > 1) {
			local375 = 32;
			arg0.anInt2384 -= 1549754299;
		}
		if (Class538.aClass538_2.aByte171 == local308) {
			local375 <<= 0x1;
		} else if (local308 == Class538.aClass538_1.aByte171) {
			local375 >>= 0x1;
		}
		if (local3.anInt5001 * 1444287659 != -1) {
			local375 <<= 0x9;
			if (arg0.anInt2362 * -162520433 == 1) {
				local398 = arg0.anInt2389 * -754989465 * arg0.anInt2389 * -754989465;
				@Pc(536) int local536 = ((int) local191.aFloat259 > local217 ? (int) local191.aFloat259 - local217 : local217 - (int) local191.aFloat259) << 9;
				@Pc(555) int local555 = ((int) local191.aFloat261 > local235 ? (int) local191.aFloat261 - local235 : local235 - (int) local191.aFloat261) << 9;
				@Pc(562) int local562 = local536 > local555 ? local536 : local555;
				@Pc(569) int local569 = local562 * -1406391978 * local3.anInt5001;
				if (local398 > local569) {
					arg0.anInt2389 = arg0.anInt2389 * -754989465 / 2 * 240514391;
				} else if (local398 / 2 > local562) {
					arg0.anInt2389 -= local3.anInt5001 * -1710248675;
					if (arg0.anInt2389 * -754989465 < 0) {
						arg0.anInt2389 = 0;
					}
				} else if (arg0.anInt2389 * -754989465 < local375) {
					arg0.anInt2389 += local3.anInt5001 * -1710248675;
					if (arg0.anInt2389 * -754989465 > local375) {
						arg0.anInt2389 = local375 * 240514391;
					}
				}
			} else if (arg0.anInt2389 * -754989465 < local375) {
				arg0.anInt2389 += local3.anInt5001 * -1710248675;
				if (arg0.anInt2389 * -754989465 > local375) {
					arg0.anInt2389 = local375 * 240514391;
				}
			} else if (arg0.anInt2389 * -754989465 > 0) {
				arg0.anInt2389 -= local3.anInt5001 * -1710248675;
				if (arg0.anInt2389 * -754989465 < 0) {
					arg0.anInt2389 = 0;
				}
			}
			local375 = arg0.anInt2389 * -754989465 >> 9;
			if (local375 < 1) {
				local375 = 1;
			}
		}
		Class107.anInt2992 = 0;
		if (local217 == local195 && local235 == local199) {
			Class30_Sub1.anInt770 = Class538.aClass538_4.aByte171 * 1653883683;
		} else {
			if (local195 < local217) {
				local191.aFloat259 += local375;
				Class107.anInt2992 = (Class107.anInt2992 * 1690541573 | 0x4) * -377192755;
				if (local191.aFloat259 > (float) local217) {
					local191.aFloat259 = local217;
				}
			} else if (local195 > local217) {
				local191.aFloat259 -= local375;
				Class107.anInt2992 = (Class107.anInt2992 * 1690541573 | 0x8) * -377192755;
				if (local191.aFloat259 < (float) local217) {
					local191.aFloat259 = local217;
				}
			}
			if (local199 < local235) {
				local191.aFloat261 += local375;
				Class107.anInt2992 = (Class107.anInt2992 * 1690541573 | 0x1) * -377192755;
				if (local191.aFloat261 > (float) local235) {
					local191.aFloat261 = local235;
				}
			} else if (local199 > local235) {
				local191.aFloat261 -= local375;
				Class107.anInt2992 = (Class107.anInt2992 * 1690541573 | 0x2) * -377192755;
				if (local191.aFloat261 < (float) local235) {
					local191.aFloat261 = local235;
				}
			}
			arg0.method21436(local191);
			if (local375 >= 32) {
				Class30_Sub1.anInt770 = Class538.aClass538_2.aByte171 * 1653883683;
			} else {
				Class30_Sub1.anInt770 = local308 * 1653883683;
			}
		}
		if (local217 == (int) local191.aFloat259 && local235 == (int) local191.aFloat261) {
			arg0.anInt2362 -= 2015411311;
			if (arg0.anInt2385 * -1943098143 > 0) {
				arg0.anInt2385 -= -345794783;
			}
		}
		local191.method25874();
	}

	@OriginalMember(owner = "client!an", name = "ha", descriptor = "(Lclient!vs;B)V", line = 5360)
	static final void method19523(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class174.method23395(local11, local14, false, 2, arg0);
	}

	@OriginalMember(owner = "client!an", name = "hn", descriptor = "(Lclient!vs;I)V", line = 5423)
	static final void method19528(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class174.method23395(local16, local22, true, 1, arg0);
	}

	@OriginalMember(owner = "client!an", name = "lm", descriptor = "(Lclient!vs;B)V", line = 6141)
	static final void method19524(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class421.method27847(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!an", name = "ael", descriptor = "(Lclient!vs;B)V", line = 9626)
	static final void method19525(@OriginalArg(0) Class536 arg0) {
		@Pc(10) String local10;
		if (Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3 == null || Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aString77 == null) {
			local10 = "";
		} else {
			local10 = Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.method16750(false);
		}
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = local10;
	}
}
