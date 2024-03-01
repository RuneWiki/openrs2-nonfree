package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ajz")
public class Class71_Sub3 extends Class71 {

	@OriginalMember(owner = "client!ajz", name = "d", descriptor = "Lclient!ahn;")
	Class26_Sub1 aClass26_Sub1_19;

	@OriginalMember(owner = "client!ajz", name = "<init>", descriptor = "(Lclient!ahn;Z)V", line = 12)
	Class71_Sub3(@OriginalArg(0) Class26_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		super(arg1);
		this.aClass26_Sub1_19 = arg0;
	}

	@OriginalMember(owner = "client!ajz", name = "k", descriptor = "(Lclient!rs;II)V", line = 17)
	@Override
	void method20045(@OriginalArg(0) Class440 arg0, @OriginalArg(1) int arg1) {
		Class510.aClass183_1.method23635(arg0, arg1, this.aClass26_Sub1_19);
	}

	@OriginalMember(owner = "client!ajz", name = "aa", descriptor = "(Lclient!rs;I)V", line = 17)
	@Override
	void method20049(@OriginalArg(0) Class440 arg0, @OriginalArg(1) int arg1) {
		Class510.aClass183_1.method23635(arg0, arg1, this.aClass26_Sub1_19);
	}

	@OriginalMember(owner = "client!ajz", name = "ak", descriptor = "(Lclient!rs;I)V", line = 17)
	@Override
	void method20048(@OriginalArg(0) Class440 arg0, @OriginalArg(1) int arg1) {
		Class510.aClass183_1.method23635(arg0, arg1, this.aClass26_Sub1_19);
	}

	@OriginalMember(owner = "client!ajz", name = "s", descriptor = "(I)V", line = 172)
	static void method20104() {
		if (client.anInt3064 * 1358073379 >= 0) {
			return;
		}
		@Pc(7) Class611 local7 = Class49_Sub1.method9259();
		if (!Class250.aBoolean688) {
			Class250.aBoolean687 = Class250.anInt3821 * 1360229261 != -1 && Class250.anInt3811 * -1176041819 >= Class250.anInt3821 * 1360229261 || (Class250.aBoolean689 ? 26 : 22) + Class250.anInt3804 * 192470685 * -1176041819 * Class250.anInt3811 > Class575.anInt5428 * 1261116487;
		}
		Class250.aClass553_53.method32701();
		Class250.aClass553_54.method32701();
		@Pc(61) int local61;
		for (@Pc(53) Class3_Sub1_Sub7 local53 = (Class3_Sub1_Sub7) Class250.aClass553_52.method32768(); local53 != null; local53 = (Class3_Sub1_Sub7) Class250.aClass553_52.method32709()) {
			local61 = local53.anInt2664 * 296027207;
			if (local61 < 1000) {
				local53.method33656();
				if (local61 == 59 || local61 == 2 || local61 == 8 || local61 == 17 || local61 == 15 || local61 == 16 || local61 == 58) {
					Class250.aClass553_54.method32702(local53);
				} else {
					Class250.aClass553_53.method32702(local53);
				}
			}
		}
		Class250.aClass553_53.method32748(Class250.aClass553_52);
		Class250.aClass553_54.method32748(Class250.aClass553_52);
		if (Class250.anInt3811 * -1176041819 > 1) {
			if (Class56_Sub2.method12598() && Class250.anInt3811 * -1176041819 > 2) {
				Class423.aClass3_Sub1_Sub7_5 = (Class3_Sub1_Sub7) Class250.aClass553_52.aClass3_238.aClass3_245.aClass3_245;
			} else {
				Class423.aClass3_Sub1_Sub7_5 = (Class3_Sub1_Sub7) Class250.aClass553_52.aClass3_238.aClass3_245;
			}
			Class2.aClass3_Sub1_Sub7_1 = (Class3_Sub1_Sub7) Class250.aClass553_52.aClass3_238.aClass3_245;
			if (Class250.anInt3811 * -1176041819 > 2) {
				Class287.aClass3_Sub1_Sub7_3 = (Class3_Sub1_Sub7) Class2.aClass3_Sub1_Sub7_1.aClass3_245;
			} else {
				Class287.aClass3_Sub1_Sub7_3 = null;
			}
		} else {
			Class423.aClass3_Sub1_Sub7_5 = null;
			Class2.aClass3_Sub1_Sub7_1 = null;
			Class287.aClass3_Sub1_Sub7_3 = null;
		}
		@Pc(165) Class3_Sub22 local165 = (Class3_Sub22) client.aClass553_43.method32768();
		@Pc(175) int local175;
		if (local165 == null) {
			local61 = Class3_Sub10.aClass61_1.method12740();
			local175 = Class3_Sub10.aClass61_1.method12741();
		} else {
			local61 = local165.method19854();
			local175 = local165.method19867();
		}
		@Pc(610) boolean local610;
		if (!Class250.aBoolean688) {
			local610 = Class596.method33464(Class44.aClass483_5.anInterface50_4, local165);
			@Pc(840) boolean local840 = Class596.method33464(Class44.aClass483_5.anInterface50_1, local165);
			@Pc(846) boolean local846 = Class596.method33464(Class44.aClass483_5.anInterface50_2, local165);
			if ((local610 || local840) && (client.anInt3119 * 775790181 == 1 && Class250.anInt3811 * -1176041819 > 2 || Class549.method32673())) {
				local846 = true;
			}
			if (local846 && Class250.anInt3811 * -1176041819 > 0) {
				if (client.aClass178_13 == null && client.anInt3143 * 1039052419 == 0) {
					Class210.method24249(local61, local175);
				} else {
					Class250.anInt3810 = -1339390998;
				}
			} else if (local840) {
				if (Class287.aClass3_Sub1_Sub7_3 != null) {
					Class396.method27512(Class287.aClass3_Sub1_Sub7_3, local61, local175);
				}
			} else if (local610) {
				if (Class423.aClass3_Sub1_Sub7_5 != null) {
					@Pc(912) boolean local912 = client.aClass178_13 != null || client.anInt3143 * 1039052419 > 0;
					if (local912) {
						Class250.anInt3810 = 1477788149;
						Class141.aClass3_Sub1_Sub7_2 = Class423.aClass3_Sub1_Sub7_5;
					} else {
						Class396.method27512(Class423.aClass3_Sub1_Sub7_5, local61, local175);
					}
				} else if (client.aBoolean596) {
					Class44_Sub2.method15142();
				}
			}
			if (client.aClass178_13 == null && client.anInt3143 * 1039052419 == 0) {
				Class250.anInt3810 = 0;
				Class141.aClass3_Sub1_Sub7_2 = null;
			}
			return;
		}
		@Pc(226) int local226;
		@Pc(253) int local253;
		if (!Class596.method33464(Class44.aClass483_5.anInterface50_3, local165)) {
			local610 = false;
			if (Class250.aClass3_Sub1_Sub9_1 != null) {
				if (local61 >= Class356.anInt4637 * 1084730905 - 10 && local61 <= Class356.anInt4637 * 1084730905 + Class381.anInt4707 * -1605305641 + 10 && local175 >= Class151.anInt3438 * 2118805765 - 10 && local175 <= Class598.anInt5520 * 1979992829 + Class151.anInt3438 * 2118805765 + 10) {
					local610 = true;
				} else {
					Class511.method29585();
				}
			}
			if (!local610) {
				if (local61 < Class284.anInt4355 * 989672103 - 10 || local61 > Class13_Sub14.anInt663 * -1045688681 + 10 + Class284.anInt4355 * 989672103 || local175 < Class338.anInt4600 * 1100948139 - 10 || local175 > Class338.anInt4600 * 1100948139 + 10 + Class294.anInt4390 * -1006383485) {
					Class604.method33533();
				} else if (Class250.aBoolean687) {
					local226 = -1;
					local253 = -1;
					@Pc(703) int local703;
					for (local703 = 0; local703 < Class250.anInt3812 * 1575832235; local703++) {
						@Pc(729) int local729;
						if (Class250.aBoolean689) {
							local729 = Class338.anInt4600 * 1100948139 + 20 + local7.anInt5537 * -1760037867 + 1 + local703 * Class250.anInt3804 * 192470685;
							if (local175 > local729 - local7.anInt5537 * -1760037867 - 1 && local175 < local7.anInt5536 * -1990992757 + local729) {
								local226 = local703;
								local253 = local729 - local7.anInt5537 * -1760037867 - 1;
								break;
							}
						} else {
							local729 = Class250.anInt3804 * 192470685 * local703 + Class338.anInt4600 * 1100948139 + 31;
							if (local175 > local729 - 13 && local175 < local729 + 3) {
								local226 = local703;
								local253 = local729 - 13;
								break;
							}
						}
					}
					if (local226 != -1) {
						local703 = 0;
						@Pc(800) Class549 local800 = new Class549(Class250.aClass546_15);
						for (@Pc(805) Class3_Sub1_Sub9 local805 = (Class3_Sub1_Sub9) local800.method32671(); local805 != null; local805 = (Class3_Sub1_Sub9) local800.next()) {
							if (local703 == local226) {
								if (local805.anInt2669 * 2127103997 > 1) {
									Class13_Sub20.method7227(local805, local253);
								}
								break;
							}
							local703++;
						}
					}
				}
			}
			return;
		}
		@Pc(224) int local224;
		@Pc(316) Class3_Sub1_Sub7 local316;
		@Pc(311) Class549 local311;
		if (Class250.aClass3_Sub1_Sub9_1 != null && local61 >= Class356.anInt4637 * 1084730905 && local61 <= Class381.anInt4707 * -1605305641 + Class356.anInt4637 * 1084730905 && local175 >= Class151.anInt3438 * 2118805765 && local175 <= Class598.anInt5520 * 1979992829 + Class151.anInt3438 * 2118805765) {
			local224 = -1;
			for (local226 = 0; local226 < Class250.aClass3_Sub1_Sub9_1.anInt2669 * 2127103997; local226++) {
				if (Class250.aBoolean689) {
					local253 = Class250.anInt3804 * 192470685 * local226 + 1 + local7.anInt5537 * -1760037867 + 20 + Class151.anInt3438 * 2118805765;
					if (local175 > local253 - local7.anInt5537 * -1760037867 - 1 && local175 < local253 + local7.anInt5536 * -1990992757) {
						local224 = local226;
					}
				} else {
					local253 = Class151.anInt3438 * 2118805765 + 31 + Class250.anInt3804 * 192470685 * local226;
					if (local175 > local253 - 13 && local175 < local253 + 3) {
						local224 = local226;
					}
				}
			}
			if (local224 != -1) {
				local226 = 0;
				local311 = new Class549(Class250.aClass3_Sub1_Sub9_1.aClass546_9);
				for (local316 = (Class3_Sub1_Sub7) local311.method32671(); local316 != null; local316 = (Class3_Sub1_Sub7) local311.next()) {
					if (local224 == local226) {
						Class396.method27512(local316, local61, local175);
						break;
					}
					local226++;
				}
			}
			Class604.method33533();
		} else if (local61 >= Class284.anInt4355 * 989672103 && local61 <= Class13_Sub14.anInt663 * -1045688681 + Class284.anInt4355 * 989672103 && local175 >= Class338.anInt4600 * 1100948139 && local175 <= Class294.anInt4390 * -1006383485 + Class338.anInt4600 * 1100948139) {
			if (Class250.aBoolean687) {
				local224 = -1;
				for (local226 = 0; local226 < Class250.anInt3812 * 1575832235; local226++) {
					if (Class250.aBoolean689) {
						local253 = local226 * 192470685 * Class250.anInt3804 + Class338.anInt4600 * 1100948139 + 20 + local7.anInt5537 * -1760037867 + 1;
						if (local175 > local253 - local7.anInt5537 * -1760037867 - 1 && local175 < local253 + local7.anInt5536 * -1990992757) {
							local224 = local226;
							break;
						}
					} else {
						local253 = Class338.anInt4600 * 1100948139 + 31 + local226 * Class250.anInt3804 * 192470685;
						if (local175 > local253 - 13 && local175 < local253 + 3) {
							local224 = local226;
							break;
						}
					}
				}
				if (local224 != -1) {
					local226 = 0;
					local311 = new Class549(Class250.aClass546_15);
					for (@Pc(584) Class3_Sub1_Sub9 local584 = (Class3_Sub1_Sub9) local311.method32671(); local584 != null; local584 = (Class3_Sub1_Sub9) local311.next()) {
						if (local224 == local226) {
							Class396.method27512((Class3_Sub1_Sub7) local584.aClass546_9.aClass3_Sub1_62.aClass3_Sub1_66, local61, local175);
							Class604.method33533();
							break;
						}
						local226++;
					}
				}
			} else {
				local224 = -1;
				for (local226 = 0; local226 < Class250.anInt3811 * -1176041819; local226++) {
					if (Class250.aBoolean689) {
						local253 = Class338.anInt4600 * 1100948139 + 1 + 20 + local7.anInt5537 * -1760037867 + Class250.anInt3804 * 192470685 * (Class250.anInt3811 * -1176041819 - 1 - local226);
						if (local175 > local253 - local7.anInt5537 * -1760037867 - 1 && local175 < local7.anInt5536 * -1990992757 + local253) {
							local224 = local226;
						}
					} else {
						local253 = Class338.anInt4600 * 1100948139 + 31 + (Class250.anInt3811 * -1176041819 - 1 - local226) * Class250.anInt3804 * 192470685;
						if (local175 > local253 - 13 && local175 < local253 + 3) {
							local224 = local226;
						}
					}
				}
				if (local224 != -1) {
					local226 = 0;
					@Pc(465) Class554 local465 = new Class554(Class250.aClass553_52);
					for (local316 = (Class3_Sub1_Sub7) local465.method32778(); local316 != null; local316 = (Class3_Sub1_Sub7) local465.next()) {
						if (local226 == local224) {
							Class396.method27512(local316, local61, local175);
							break;
						}
						local226++;
					}
				}
				Class604.method33533();
			}
		}
	}

	@OriginalMember(owner = "client!ajz", name = "h", descriptor = "([BIIB)[B", line = 178)
	public static byte[] method20105(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) byte[] local4;
		if (arg1 > 0) {
			local4 = new byte[arg2];
			for (@Pc(6) int local6 = 0; local6 < arg2; local6++) {
				local4[local6] = arg0[arg1 + local6];
			}
		} else {
			local4 = arg0;
		}
		@Pc(26) Class578 local26 = new Class578();
		local26.method33180();
		local26.method33170(local4, (long) (arg2 * 8));
		@Pc(39) byte[] local39 = new byte[64];
		local26.method33173(local39, 0);
		return local39;
	}
}
