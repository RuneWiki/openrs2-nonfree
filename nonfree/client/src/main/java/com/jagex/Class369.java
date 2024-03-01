package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ol")
public class Class369 {

	@OriginalMember(owner = "client!ol", name = "p", descriptor = "Lclient!oy;")
	static Interface42 anInterface42_1;

	@OriginalMember(owner = "client!ol", name = "hz", descriptor = "Lclient!qo;")
	public static Class413 aClass413_1;

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "()V", line = 11)
	Class369() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!ol", name = "h", descriptor = "(Lclient!oy;)V", line = 16)
	public static void method26928(@OriginalArg(0) Interface42 arg0) {
		if (anInterface42_1 != null) {
			throw new IllegalStateException("");
		}
		anInterface42_1 = arg0;
	}

	@OriginalMember(owner = "client!ol", name = "l", descriptor = "(Lclient!oy;)V", line = 16)
	public static void method26929(@OriginalArg(0) Interface42 arg0) {
		if (anInterface42_1 != null) {
			throw new IllegalStateException("");
		}
		anInterface42_1 = arg0;
	}

	@OriginalMember(owner = "client!ol", name = "u", descriptor = "()Lclient!oy;", line = 21)
	public static Interface42 method26927() {
		if (anInterface42_1 == null) {
			throw new IllegalStateException("");
		}
		return anInterface42_1;
	}

	@OriginalMember(owner = "client!ol", name = "s", descriptor = "()Lclient!oy;", line = 21)
	public static Interface42 method26930() {
		if (anInterface42_1 == null) {
			throw new IllegalStateException("");
		}
		return anInterface42_1;
	}

	@OriginalMember(owner = "client!ol", name = "x", descriptor = "()Lclient!oy;", line = 21)
	public static Interface42 method26931() {
		if (anInterface42_1 == null) {
			throw new IllegalStateException("");
		}
		return anInterface42_1;
	}

	@OriginalMember(owner = "client!ol", name = "y", descriptor = "()Z", line = 26)
	public static boolean method26932() {
		return anInterface42_1 != null;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V", line = 58)
	public static void method26933() {
		Class386.method27338();
	}

	@OriginalMember(owner = "client!ol", name = "l", descriptor = "(Ljava/lang/String;II)Z", line = 58)
	static boolean method26934(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return Class361.method26768(arg0, arg1, "openjs");
	}

	@OriginalMember(owner = "client!ol", name = "gs", descriptor = "(J)V", line = 3475)
	static final void method26936(@OriginalArg(0) long arg0) {
		@Pc(3) int local3 = client.anInt3085 * 1771104941;
		@Pc(7) int local7 = client.anInt3086 * 1828029883;
		@Pc(18) int local18;
		@Pc(26) int local26;
		if (Class403.anInt4808 * 110680385 != local3) {
			local18 = local3 - Class403.anInt4808 * 110680385;
			local26 = (int) ((long) local18 * arg0 / 320L);
			if (local18 > 0) {
				if (local26 == 0) {
					local26 = 1;
				} else if (local26 > local18) {
					local26 = local18;
				}
			} else if (local26 == 0) {
				local26 = -1;
			} else if (local26 < local18) {
				local26 = local18;
			}
			Class403.anInt4808 += local26 * 2018555585;
		}
		if (local7 != Class48.anInt1088 * 1640811813) {
			local18 = local7 - Class48.anInt1088 * 1640811813;
			local26 = (int) (arg0 * (long) local18 / 320L);
			if (local18 > 0) {
				if (local26 == 0) {
					local26 = 1;
				} else if (local26 > local18) {
					local26 = local18;
				}
			} else if (local26 == 0) {
				local26 = -1;
			} else if (local26 < local18) {
				local26 = local18;
			}
			Class48.anInt1088 += local26 * -958888275;
		}
		client.aFloat238 += (float) arg0 * client.aFloat239 / 40.0F * 8.0F;
		client.aFloat237 += (float) arg0 * client.aFloat240 / 40.0F * 8.0F;
		Class495.method29326();
	}

	@OriginalMember(owner = "client!ol", name = "jz", descriptor = "(Lclient!lu;B)V", line = 8451)
	static final void method26935(@OriginalArg(0) Class308 arg0) {
		@Pc(2) Class3_Sub41_Sub1 local2 = client.aClass82_2.aClass3_Sub41_Sub1_2;
		@Pc(9) int local9;
		@Pc(19) int local19;
		@Pc(31) int local31;
		@Pc(55) int local55;
		@Pc(79) int local79;
		@Pc(83) int local83;
		@Pc(99) int local99;
		@Pc(103) int local103;
		@Pc(27) int local27;
		@Pc(61) int local61;
		@Pc(67) int local67;
		@Pc(71) int local71;
		@Pc(75) int local75;
		if (Class308.aClass308_13 == arg0) {
			local9 = local2.method20269();
			local19 = (local9 >> 4 & 0xF) + Class242.anInt3777 * 729102278;
			local27 = Class530.anInt5308 * -1250531910 + (local9 & 0xF);
			local31 = local2.method20269();
			@Pc(39) boolean local39 = (local31 & 0x1) != 0;
			@Pc(47) boolean local47 = (local31 & 0x2) != 0;
			local55 = local47 ? local31 >> 2 : -1;
			local61 = local19 + local2.method20390();
			local67 = local27 + local2.method20390();
			local71 = local2.method20272();
			local75 = local2.method20272();
			local79 = local2.method20271();
			local83 = local2.method20269();
			if (local47) {
				local83 = (byte) local83;
			} else {
				local83 *= 4;
			}
			local99 = local2.method20269() * 4;
			local103 = local2.method20271();
			@Pc(107) int local107 = local2.method20271();
			@Pc(111) int local111 = local2.method20269();
			@Pc(115) int local115 = local2.method20271();
			if (local111 == 255) {
				local111 = -1;
			}
			@Pc(124) int local124 = local2.method20272();
			if (client.aClass370_1.method27018() != Class380.aClass380_4 && (local19 >= 0 && local27 >= 0 && local19 < client.aClass370_1.method26943() * 2 && local27 < client.aClass370_1.method26943() * 2 && local61 >= 0 && local67 >= 0 && local61 < client.aClass370_1.method27062() * 2 && local67 < client.aClass370_1.method27062() * 2 && local79 != 65535)) {
				local19 *= 256;
				local27 *= 256;
				local61 *= 256;
				local67 *= 256;
				local83 <<= 0x2;
				local99 <<= 0x2;
				local115 <<= 0x2;
				Class69_Sub1_Sub3.method20235(local79, local71, local75, local55, local83, local99, local19, local27, local61, local67, local103, local107, local111, local115, local39, local124);
			}
			return;
		}
		@Pc(249) int local249;
		@Pc(253) int local253;
		if (Class308.aClass308_15 == arg0) {
			local9 = local2.method20269();
			local19 = (local9 >> 4 & 0x7) + Class242.anInt3777 * 364551139;
			local27 = (local9 & 0x7) + Class530.anInt5308 * 1522217693;
			local31 = local2.method20310();
			local249 = local31 >> 2;
			local253 = local31 & 0x3;
			local55 = client.anIntArray295[local249];
			local61 = local2.method20275();
			if (client.aClass370_1.method27018().method27281() || local19 >= 0 && local27 >= 0 && local19 < client.aClass370_1.method26943() && local27 < client.aClass370_1.method27062()) {
				Class60_Sub21.method13693(Class523.anInt5297 * 790957737, local19, local27, local55, local61, local249, local253);
			}
		} else if (Class308.aClass308_5 == arg0) {
			local9 = local2.method20314();
			local19 = local2.method20313();
			local27 = local2.method20271();
			local31 = local2.method20310();
			@Pc(316) Class464 local316 = client.aClass370_1.method26942();
			local253 = (local31 & 0x7) + Class530.anInt5308 * 1522217693;
			local55 = local253 + local316.anInt5073 * 1360175441;
			local61 = Class242.anInt3777 * 364551139 + (local31 >> 4 & 0x7);
			local67 = local316.anInt5071 * -1567811631 + local61;
			if (client.anInt3115 * 2077649275 != local19) {
				@Pc(371) boolean local371 = local61 >= 0 && local253 >= 0 && local61 < client.aClass370_1.method26943() && local253 < client.aClass370_1.method27062();
				if (local371 || client.aClass370_1.method27018().method27281()) {
					Class291.method25545(Class523.anInt5297 * 790957737, local67, local55, new Class3_Sub4(local27, local9));
					if (local371) {
						Class356.method26653(Class523.anInt5297 * 790957737, local61, local253);
					}
				}
			}
		} else if (arg0 == Class308.aClass308_3) {
			local9 = local2.method20304();
			local19 = local9 >> 2;
			local27 = client.anIntArray295[local19];
			local31 = local2.method20317();
			local249 = (local31 >> 4 & 0x7) + Class242.anInt3777 * 364551139;
			local253 = (local31 & 0x7) + Class530.anInt5308 * 1522217693;
			local55 = local2.method20310();
			local61 = local2.method20323();
			if (Class456.aClass456_22.anInt5061 * 821735799 == local19) {
				local19 = Class456.aClass456_21.anInt5061 * 821735799;
			}
			if ((local55 & 0x1) == 1) {
				Class565.method32913(Class523.anInt5297 * 790957737, local249, local253, local27, local61, local19, null);
			} else {
				@Pc(476) int[] local476 = null;
				if ((local55 & 0x2) == 2) {
					local71 = local2.method20269();
					local476 = new int[local71];
					for (local75 = 0; local75 < local71; local75++) {
						local476[local75] = local2.method20275();
					}
				}
				@Pc(503) short[] local503 = null;
				if ((local55 & 0x4) == 4) {
					local75 = local2.method20269();
					local503 = new short[local75];
					for (local79 = 0; local79 < local75; local79++) {
						local503[local79] = (short) local2.method20271();
					}
				}
				@Pc(531) short[] local531 = null;
				if ((local55 & 0x8) == 8) {
					local79 = local2.method20269();
					local531 = new short[local79];
					for (local83 = 0; local83 < local79; local83++) {
						local531[local83] = (short) local2.method20271();
					}
				}
				Class565.method32913(Class523.anInt5297 * 790957737, local249, local253, local27, local61, local19, new Class462(Class3_Sub7.aLong46 * -6120224748967960933L, local476, local503, local531));
				Class3_Sub7.aLong46 += -3204532312793950317L;
			}
		} else if (arg0 == Class308.aClass308_2) {
			local9 = local2.method20269();
			local19 = Class242.anInt3777 * 364551139 + (local9 >> 4 & 0x7);
			local27 = (local9 & 0x7) + Class530.anInt5308 * 1522217693;
			local31 = local2.method20271();
			if (local31 == 65535) {
				local31 = -1;
			}
			local249 = local2.method20269();
			local253 = local249 >> 4 & 0xF;
			local55 = local249 & 0x7;
			local61 = local2.method20269();
			local67 = local2.method20269();
			local71 = local2.method20271();
			@Pc(650) boolean local650 = local2.method20269() == 1;
			if (client.aClass370_1.method27018() != Class380.aClass380_4 && (local19 >= 0 && local27 >= 0 && local19 < client.aClass370_1.method26943() && local27 < client.aClass370_1.method27062())) {
				local79 = local253 + 1;
				if (Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.anIntArray241[0] >= local19 - local79 && Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.anIntArray241[0] <= local79 + local19 && Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.anIntArray239[0] >= local27 - local79 && Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.anIntArray239[0] <= local27 + local79) {
					@Pc(719) Class320 local719 = new Class320((float) (local19 << 9), 0.0F, (float) (local27 << 9));
					local99 = Class523.anInt5297 * 790957737;
					local103 = local650 ? Class141.aClass141_2.method23024() : Class141.aClass141_3.method23024();
					Class510.aClass183_1.method23589(Class160.aClass160_10, local31, local55, local67, local103, Class158.aClass158_5, 0.0F, (float) (local253 << 9), local719, local99, local71, local61);
				}
			}
		} else if (Class308.aClass308_14 == arg0) {
			local9 = local2.method20317();
			local19 = Class242.anInt3777 * 364551139 + (local9 >> 4 & 0x7);
			local27 = (local9 & 0x7) + Class530.anInt5308 * 1522217693;
			local31 = local2.method20269();
			local249 = local31 >> 2;
			local253 = local31 & 0x3;
			local55 = client.anIntArray295[local249];
			if (client.aClass370_1.method27018().method27281() || local19 >= 0 && local27 >= 0 && local19 < client.aClass370_1.method26943() && local27 < client.aClass370_1.method27062()) {
				Class60_Sub21.method13693(Class523.anInt5297 * 790957737, local19, local27, local55, -1, local249, local253);
			}
		} else if (arg0 == Class308.aClass308_9) {
			local9 = local2.method20269();
			local19 = Class242.anInt3777 * 364551139 + (local9 >> 4 & 0x7);
			local27 = (local9 & 0x7) + Class530.anInt5308 * 1522217693;
			local31 = local2.method20271();
			if (local31 == 65535) {
				local31 = -1;
			}
			local249 = local2.method20271();
			local253 = local2.method20271();
			local55 = local2.method20269();
			local61 = local2.method20272();
			if (client.aClass370_1.method27018() != Class380.aClass380_4 && (local19 >= 0 && local27 >= 0 && local19 < client.aClass370_1.method26943() && local27 < client.aClass370_1.method27062())) {
				if (local31 == -1) {
					@Pc(908) Class3_Sub1_Sub16 local908 = (Class3_Sub1_Sub16) client.aClass581_18.method33217((long) (local19 << 16 | local27));
					if (local908 != null) {
						local908.aClass26_Sub1_Sub1_Sub4_1.method20597();
						local908.method33656();
					}
				} else {
					local67 = local19 * 512 + 256;
					local71 = local27 * 512 + 256;
					local75 = Class523.anInt5297 * 790957737;
					if (local75 < 3 && client.aClass370_1.method27075().method26504(local19, local27)) {
						local75++;
					}
					@Pc(978) Class26_Sub1_Sub1_Sub4 local978 = new Class26_Sub1_Sub1_Sub4(client.aClass370_1.method26950(), local31, local253, Class523.anInt5297 * 790957737, local75, local67, Class186.method23926(local67, local71, Class523.anInt5297 * 790957737) - local249, local71, local19, local19, local27, local27, local55, false, local61);
					client.aClass581_18.method33241(new Class3_Sub1_Sub16(local978), (long) (local19 << 16 | local27));
				}
			}
		} else if (Class308.aClass308_1 == arg0) {
			local9 = local2.method20269();
			local19 = Class242.anInt3777 * 364551139 + (local9 >> 4 & 0x7);
			local27 = Class530.anInt5308 * 1522217693 + (local9 & 0x7);
			local31 = local2.method20271();
			if (local31 == 65535) {
				local31 = -1;
			}
			local249 = local2.method20269();
			local253 = local249 >> 4 & 0xF;
			local55 = local249 & 0x7;
			local61 = local2.method20269();
			local67 = local2.method20269();
			local71 = local2.method20271();
			if (client.aClass370_1.method27018() != Class380.aClass380_4 && (local19 >= 0 && local27 >= 0 && local19 < client.aClass370_1.method26943() && local27 < client.aClass370_1.method27062())) {
				local75 = local253 + 1;
				if (Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.anIntArray241[0] >= local19 - local75 && Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.anIntArray241[0] <= local75 + local19 && Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.anIntArray239[0] >= local27 - local75 && Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.anIntArray239[0] <= local27 + local75) {
					@Pc(1120) Class320 local1120 = new Class320((float) (local19 << 9), 0.0F, (float) (local27 << 9));
					local83 = Class523.anInt5297 * 790957737;
					Class510.aClass183_1.method23589(Class160.aClass160_10, local31, local55, local67, Class141.aClass141_3.method23024(), Class158.aClass158_5, 0.0F, (float) (local253 << 9), local1120, local83, local71, local61);
				}
			}
		} else if (Class308.aClass308_4 == arg0) {
			local9 = local2.method20310();
			local19 = Class242.anInt3777 * 364551139 + (local9 >> 4 & 0x7);
			local27 = (local9 & 0x7) + Class530.anInt5308 * 1522217693;
			local31 = local2.method20269();
			local249 = local2.method20275();
			local253 = local2.method20317();
			local55 = local253 >> 2;
			local61 = local253 & 0x3;
			local67 = client.anIntArray295[local55];
			if (client.aClass370_1.method27018() != Class380.aClass380_4) {
				Class195.method24091(Class523.anInt5297 * 790957737, local19, local27, local67, local55, local61, local249, local31);
			}
		} else if (arg0 == Class308.aClass308_8) {
			local9 = local2.method20269();
			@Pc(1229) boolean local1229 = (local9 & 0x80) != 0;
			local27 = Class242.anInt3777 * 364551139 + (local9 >> 3 & 0x7);
			local31 = (local9 & 0x7) + Class530.anInt5308 * 1522217693;
			local249 = local27 + local2.method20390();
			local253 = local31 + local2.method20390();
			local55 = local2.method20272();
			local61 = local2.method20271();
			local67 = local2.method20269() * 4;
			local71 = local2.method20269() * 4;
			local75 = local2.method20271();
			local79 = local2.method20271();
			local83 = local2.method20269();
			local99 = local2.method20271();
			local103 = local2.method20272();
			if (local83 == 255) {
				local83 = -1;
			}
			if (client.aClass370_1.method27018() != Class380.aClass380_4 && (local27 >= 0 && local31 >= 0 && local27 < client.aClass370_1.method26943() && local31 < client.aClass370_1.method27062() && local249 >= 0 && local253 >= 0 && local249 < client.aClass370_1.method26943() && local253 < client.aClass370_1.method27062() && local61 != 65535)) {
				local27 = local27 * 512 + 256;
				local31 = local31 * 512 + 256;
				local249 = local249 * 512 + 256;
				local253 = local253 * 512 + 256;
				local67 <<= 0x2;
				local71 <<= 0x2;
				local99 <<= 0x2;
				@Pc(1408) Class26_Sub1_Sub1_Sub5 local1408 = new Class26_Sub1_Sub1_Sub5(client.aClass370_1.method26950(), local61, Class523.anInt5297 * 790957737, Class523.anInt5297 * 790957737, local27, local31, local67, client.anInt3034 + local75, local79 + client.anInt3034, local83, local99, 0, local55, local71, local1229, -1, local103);
				local1408.method21046(local249, local253, Class186.method23926(local249, local253, Class523.anInt5297 * 790957737) - local71, client.anInt3034 + local75);
				client.aClass553_44.method32702(new Class3_Sub1_Sub8(local1408));
			}
		} else if (Class308.aClass308_12 == arg0) {
			local9 = local2.method20271();
			local19 = local2.method20313();
			local27 = local2.method20269();
			@Pc(1452) Class464 local1452 = client.aClass370_1.method26942();
			local249 = Class530.anInt5308 * 1522217693 + (local27 & 0x7);
			local253 = local249 + local1452.anInt5073 * 1360175441;
			local55 = (local27 >> 4 & 0x7) + Class242.anInt3777 * 364551139;
			local61 = local1452.anInt5071 * -1567811631 + local55;
			@Pc(1502) boolean local1502 = local55 >= 0 && local249 >= 0 && local55 < client.aClass370_1.method26943() && local249 < client.aClass370_1.method27062();
			if (local1502 || client.aClass370_1.method27018().method27281()) {
				Class291.method25545(Class523.anInt5297 * 790957737, local61, local253, new Class3_Sub4(local19, local9));
				if (local1502) {
					Class356.method26653(Class523.anInt5297 * 790957737, local55, local249);
				}
			}
		} else if (Class308.aClass308_11 == arg0) {
			local9 = local2.method20269();
			@Pc(1543) Class464 local1543 = client.aClass370_1.method26942();
			local27 = Class530.anInt5308 * 1522217693 + (local9 & 0x7);
			local31 = local27 + local1543.anInt5073 * 1360175441;
			local249 = Class242.anInt3777 * 364551139 + (local9 >> 4 & 0x7);
			local253 = local249 + local1543.anInt5071 * -1567811631;
			local55 = local2.method20271();
			local61 = local2.method20271();
			local67 = local2.method20271();
			if (client.aClass581_19 != null) {
				@Pc(1605) Class3_Sub13 local1605 = (Class3_Sub13) client.aClass581_19.method33217((long) (Class523.anInt5297 * 790957737 << 28 | local31 << 14 | local253));
				if (local1605 != null) {
					for (@Pc(1614) Class3_Sub4 local1614 = (Class3_Sub4) local1605.aClass553_17.method32768(); local1614 != null; local1614 = (Class3_Sub4) local1605.aClass553_17.method32709()) {
						if ((local55 & 0x7FFF) == local1614.anInt1163 * 212444761 && local1614.anInt1162 * 1019273181 == local61) {
							local1614.method33656();
							local1614.anInt1162 = local67 * -2021822347;
							Class291.method25545(Class523.anInt5297 * 790957737, local253, local31, local1614);
							break;
						}
					}
					if (local249 >= 0 && local27 >= 0 && local249 < client.aClass370_1.method26943() && local27 < client.aClass370_1.method27062()) {
						Class356.method26653(Class523.anInt5297 * 790957737, local249, local27);
					}
				}
			}
		} else if (arg0 == Class308.aClass308_10) {
			local2.method20269();
			local9 = local2.method20269();
			local19 = (local9 >> 4 & 0x7) + Class242.anInt3777 * 364551139;
			local27 = (local9 & 0x7) + Class530.anInt5308 * 1522217693;
			local31 = local2.method20271();
			local249 = local2.method20269();
			local253 = local2.method20273();
			@Pc(1721) String local1721 = local2.method20283();
			if (client.aClass370_1.method27018() != Class380.aClass380_4) {
				Class161.method23264(Class523.anInt5297 * 790957737, local19, local27, local249, local31, local253, local1721);
			}
		} else if (Class308.aClass308_6 == arg0) {
			local9 = local2.method20275();
			local19 = local2.method20269();
			client.aClass370_1.method26954().method28510(local9).method28691(local19);
		} else if (Class308.aClass308_7 == arg0) {
			local9 = local2.method20315();
			local19 = local2.method20317();
			@Pc(1776) Class464 local1776 = client.aClass370_1.method26942();
			local31 = (local19 & 0x7) + Class530.anInt5308 * 1522217693;
			local249 = local1776.anInt5073 * 1360175441 + local31;
			local253 = (local19 >> 4 & 0x7) + Class242.anInt3777 * 364551139;
			local55 = local253 + local1776.anInt5071 * -1567811631;
			@Pc(1824) Class3_Sub13 local1824 = (Class3_Sub13) client.aClass581_19.method33217((long) (Class523.anInt5297 * 790957737 << 28 | local249 << 14 | local55));
			if (local1824 != null) {
				for (@Pc(1833) Class3_Sub4 local1833 = (Class3_Sub4) local1824.aClass553_17.method32768(); local1833 != null; local1833 = (Class3_Sub4) local1824.aClass553_17.method32709()) {
					if (local1833.anInt1163 * 212444761 == (local9 & 0x7FFF)) {
						local1833.method33656();
						break;
					}
				}
				if (local1824.aClass553_17.method32712()) {
					local1824.method33656();
				}
				if (local253 >= 0 && local31 >= 0 && local253 < client.aClass370_1.method26943() && local31 < client.aClass370_1.method27062()) {
					Class356.method26653(Class523.anInt5297 * 790957737, local253, local31);
				}
			}
		} else {
			Class27_Sub1.method7214("" + arg0, new RuntimeException());
			Class394.method27445(false);
		}
	}
}
