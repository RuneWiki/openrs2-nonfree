package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public class Class186 {

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "()V", line = 4)
	Class186() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 9)
	public static String method24626(@OriginalArg(0) String arg0) {
		@Pc(2) int local2 = arg0.length();
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < local2; local6++) {
			@Pc(13) char local13 = arg0.charAt(local6);
			if (local13 == '<' || local13 == '>') {
				local4 += 3;
			}
		}
		@Pc(29) StringBuilder local29 = new StringBuilder(local2 + local4);
		for (@Pc(31) int local31 = 0; local31 < local2; local31++) {
			@Pc(38) char local38 = arg0.charAt(local31);
			if (local38 == '<') {
				local29.append("<lt>");
			} else if (local38 == '>') {
				local29.append("<gt>");
			} else {
				local29.append(local38);
			}
		}
		return local29.toString();
	}

	@OriginalMember(owner = "client!ce", name = "w", descriptor = "(III)I", line = 160)
	public static int method24627(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!ce", name = "t", descriptor = "(I)V", line = 169)
	static void method24628() {
		if (client.anInt3381 * -1450626137 >= 0) {
			return;
		}
		@Pc(7) Class17 local7 = Class197.method25473();
		if (!Class683.aBoolean861) {
			Class683.aBoolean862 = -1144644173 * Class683.anInt5829 != -1 && Class683.anInt5826 * 324852453 >= Class683.anInt5829 * -1144644173 || Class683.anInt5826 * 324852453 * Class683.anInt5819 * -238165825 + (Class683.aBoolean863 ? 26 : 22) > Class19.anInt108 * -1091172141;
		}
		Class683.aClass695_54.method36380();
		Class683.aClass695_53.method36380();
		@Pc(61) int local61;
		for (@Pc(53) Class77_Sub1_Sub7 local53 = (Class77_Sub1_Sub7) Class683.aClass695_55.method36395(); local53 != null; local53 = (Class77_Sub1_Sub7) Class683.aClass695_55.method36406()) {
			local61 = local53.anInt2987 * -1986934021;
			if (local61 < 1000) {
				local53.method24063();
				if (local61 == 59 || local61 == 2 || local61 == 8 || local61 == 17 || local61 == 15 || local61 == 16 || local61 == 58) {
					Class683.aClass695_53.method36383(local53);
				} else {
					Class683.aClass695_54.method36383(local53);
				}
			}
		}
		Class683.aClass695_54.method36393(Class683.aClass695_55);
		Class683.aClass695_53.method36393(Class683.aClass695_55);
		if (Class683.anInt5826 * 324852453 > 1) {
			if (Class427.method28797() && Class683.anInt5826 * 324852453 > 2) {
				Class281.aClass77_Sub1_Sub7_3 = (Class77_Sub1_Sub7) Class683.aClass695_55.aClass77_223.aClass77_221.aClass77_221;
			} else {
				Class281.aClass77_Sub1_Sub7_3 = (Class77_Sub1_Sub7) Class683.aClass695_55.aClass77_223.aClass77_221;
			}
			Class98.aClass77_Sub1_Sub7_2 = (Class77_Sub1_Sub7) Class683.aClass695_55.aClass77_223.aClass77_221;
			if (Class683.anInt5826 * 324852453 > 2) {
				Class301.aClass77_Sub1_Sub7_4 = (Class77_Sub1_Sub7) Class98.aClass77_Sub1_Sub7_2.aClass77_221;
			} else {
				Class301.aClass77_Sub1_Sub7_4 = null;
			}
		} else {
			Class281.aClass77_Sub1_Sub7_3 = null;
			Class98.aClass77_Sub1_Sub7_2 = null;
			Class301.aClass77_Sub1_Sub7_4 = null;
		}
		@Pc(165) Class77_Sub42 local165 = (Class77_Sub42) client.aClass695_44.method36395();
		@Pc(175) int local175;
		if (local165 == null) {
			local61 = Class60.aClass138_1.method14234();
			local175 = Class60.aClass138_1.method14225();
		} else {
			local61 = local165.method22716();
			local175 = local165.method22717();
		}
		@Pc(613) boolean local613;
		if (!Class683.aBoolean861) {
			local613 = Class485.method29882(Class695.aClass635_1.anInterface64_4, local165);
			@Pc(844) boolean local844 = Class485.method29882(Class695.aClass635_1.anInterface64_2, local165);
			@Pc(850) boolean local850 = Class485.method29882(Class695.aClass635_1.anInterface64_3, local165);
			if ((local613 || local844) && (client.anInt3471 * 2117088631 == 1 && Class683.anInt5826 * 324852453 > 2 || Class98.method7803())) {
				local850 = true;
			}
			if (local850 && Class683.anInt5826 * 324852453 > 0) {
				if (client.aClass277_4 == null && client.anInt3493 * 245333843 == 0) {
					Class355.method27961(local61, local175);
				} else {
					Class683.anInt5822 = -1098055734;
				}
			} else if (local844) {
				if (Class301.aClass77_Sub1_Sub7_4 != null) {
					Class95.method7036(Class301.aClass77_Sub1_Sub7_4, local61, local175, false);
				}
			} else if (local613) {
				if (Class281.aClass77_Sub1_Sub7_3 != null) {
					@Pc(916) boolean local916 = client.aClass277_4 != null || client.anInt3493 * 245333843 > 0;
					if (local916) {
						Class683.anInt5822 = -549027867;
						Class518.aClass77_Sub1_Sub7_5 = Class281.aClass77_Sub1_Sub7_3;
					} else {
						Class95.method7036(Class281.aClass77_Sub1_Sub7_3, local61, local175, false);
					}
				} else if (client.aBoolean619) {
					Exception_Sub4.method17924();
				}
			}
			if (client.aClass277_4 == null && client.anInt3493 * 245333843 == 0) {
				Class683.anInt5822 = 0;
				Class518.aClass77_Sub1_Sub7_5 = null;
			}
			return;
		}
		@Pc(226) int local226;
		@Pc(253) int local253;
		if (!Class485.method29882(Class695.aClass635_1.anInterface64_5, local165)) {
			local613 = false;
			if (Class683.aClass77_Sub1_Sub11_1 != null) {
				if (local61 >= Class155.anInt3189 * -1803884121 - 10 && local61 <= Class155.anInt3189 * -1803884121 + 10 + Class131_Sub3.anInt1436 * -2123561997 && local175 >= Class75.anInt224 * 892411561 - 10 && local175 <= Class75.anInt224 * 892411561 + 10 + Class102.anInt955 * -417346889) {
					local613 = true;
				} else {
					Class581.method31699();
				}
			}
			if (!local613) {
				if (local61 < Class624.anInt5644 * -620506573 - 10 || local61 > Class639.anInt5719 * -1739196959 + Class624.anInt5644 * -620506573 + 10 || local175 < Class683.anInt5836 * -260575397 - 10 || local175 > Class100_Sub1.anInt946 * -577412881 + 10 + Class683.anInt5836 * -260575397) {
					Class35_Sub17.method17430();
				} else if (Class683.aBoolean862) {
					local226 = -1;
					local253 = -1;
					@Pc(706) int local706;
					for (local706 = 0; local706 < Class683.anInt5840 * 1965634793; local706++) {
						@Pc(732) int local732;
						if (Class683.aBoolean863) {
							local732 = Class683.anInt5819 * -238165825 * local706 + 20 + Class683.anInt5836 * -260575397 + local7.anInt52 * 102396103 + 1;
							if (local175 > local732 - local7.anInt52 * 102396103 - 1 && local175 < local7.anInt51 * 728893755 + local732) {
								local226 = local706;
								local253 = local732 - local7.anInt52 * 102396103 - 1;
								break;
							}
						} else {
							local732 = Class683.anInt5836 * -260575397 + 31 + Class683.anInt5819 * -238165825 * local706;
							if (local175 > local732 - 13 && local175 < local732 + 3) {
								local226 = local706;
								local253 = local732 - 13;
								break;
							}
						}
					}
					if (local226 != -1) {
						local706 = 0;
						@Pc(803) Class689 local803 = new Class689(Class683.aClass691_17);
						for (@Pc(808) Class77_Sub1_Sub11 local808 = (Class77_Sub1_Sub11) local803.method36304(); local808 != null; local808 = (Class77_Sub1_Sub11) local803.next()) {
							if (local706 == local226) {
								if (local808.anInt3023 * -475442105 > 1) {
									Class294.method27027(local808, local253);
								}
								break;
							}
							local706++;
						}
					}
				}
			}
			return;
		}
		@Pc(224) int local224;
		@Pc(316) Class77_Sub1_Sub7 local316;
		@Pc(311) Class689 local311;
		if (Class683.aClass77_Sub1_Sub11_1 != null && local61 >= Class155.anInt3189 * -1803884121 && local61 <= Class131_Sub3.anInt1436 * -2123561997 + Class155.anInt3189 * -1803884121 && local175 >= Class75.anInt224 * 892411561 && local175 <= Class75.anInt224 * 892411561 + Class102.anInt955 * -417346889) {
			local224 = -1;
			for (local226 = 0; local226 < Class683.aClass77_Sub1_Sub11_1.anInt3023 * -475442105; local226++) {
				if (Class683.aBoolean863) {
					local253 = local226 * Class683.anInt5819 * -238165825 + local7.anInt52 * 102396103 + Class75.anInt224 * 892411561 + 20 + 1;
					if (local175 > local253 - local7.anInt52 * 102396103 - 1 && local175 < local253 + local7.anInt51 * 728893755) {
						local224 = local226;
					}
				} else {
					local253 = local226 * Class683.anInt5819 * -238165825 + Class75.anInt224 * 892411561 + 31;
					if (local175 > local253 - 13 && local175 < local253 + 3) {
						local224 = local226;
					}
				}
			}
			if (local224 != -1) {
				local226 = 0;
				local311 = new Class689(Class683.aClass77_Sub1_Sub11_1.aClass691_11);
				for (local316 = (Class77_Sub1_Sub7) local311.method36304(); local316 != null; local316 = (Class77_Sub1_Sub7) local311.next()) {
					if (local226 == local224) {
						Class95.method7036(local316, local61, local175, true);
						break;
					}
					local226++;
				}
			}
			Class35_Sub17.method17430();
		} else if (local61 >= Class624.anInt5644 * -620506573 && local61 <= Class624.anInt5644 * -620506573 + Class639.anInt5719 * -1739196959 && local175 >= Class683.anInt5836 * -260575397 && local175 <= Class100_Sub1.anInt946 * -577412881 + Class683.anInt5836 * -260575397) {
			if (Class683.aBoolean862) {
				local224 = -1;
				for (local226 = 0; local226 < Class683.anInt5840 * 1965634793; local226++) {
					if (Class683.aBoolean863) {
						local253 = 1 + 20 + Class683.anInt5836 * -260575397 + local7.anInt52 * 102396103 + local226 * -238165825 * Class683.anInt5819;
						if (local175 > local253 - local7.anInt52 * 102396103 - 1 && local175 < local253 + local7.anInt51 * 728893755) {
							local224 = local226;
							break;
						}
					} else {
						local253 = local226 * Class683.anInt5819 * -238165825 + Class683.anInt5836 * -260575397 + 31;
						if (local175 > local253 - 13 && local175 < local253 + 3) {
							local224 = local226;
							break;
						}
					}
				}
				if (local224 != -1) {
					local226 = 0;
					local311 = new Class689(Class683.aClass691_17);
					for (@Pc(585) Class77_Sub1_Sub11 local585 = (Class77_Sub1_Sub11) local311.method36304(); local585 != null; local585 = (Class77_Sub1_Sub11) local311.next()) {
						if (local224 == local226) {
							Class95.method7036((Class77_Sub1_Sub7) local585.aClass691_11.aClass77_Sub1_66.aClass77_Sub1_62, local61, local175, true);
							Class35_Sub17.method17430();
							break;
						}
						local226++;
					}
				}
			} else {
				local224 = -1;
				for (local226 = 0; local226 < Class683.anInt5826 * 324852453; local226++) {
					if (Class683.aBoolean863) {
						local253 = (Class683.anInt5826 * 324852453 - 1 - local226) * Class683.anInt5819 * -238165825 + 1 + Class683.anInt5836 * -260575397 + 20 + local7.anInt52 * 102396103;
						if (local175 > local253 - local7.anInt52 * 102396103 - 1 && local175 < local253 + local7.anInt51 * 728893755) {
							local224 = local226;
						}
					} else {
						local253 = (Class683.anInt5826 * 324852453 - 1 - local226) * -238165825 * Class683.anInt5819 + 31 + Class683.anInt5836 * -260575397;
						if (local175 > local253 - 13 && local175 < local253 + 3) {
							local224 = local226;
						}
					}
				}
				if (local224 != -1) {
					local226 = 0;
					@Pc(466) Class704 local466 = new Class704(Class683.aClass695_55);
					for (local316 = (Class77_Sub1_Sub7) local466.method36551(); local316 != null; local316 = (Class77_Sub1_Sub7) local466.next()) {
						if (local224 == local226) {
							Class95.method7036(local316, local61, local175, true);
							break;
						}
						local226++;
					}
				}
				Class35_Sub17.method17430();
			}
		}
	}

	@OriginalMember(owner = "client!ce", name = "agb", descriptor = "(Lclient!yf;B)V", line = 10573)
	static final void method24629(@OriginalArg(0) Class665 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt5781 -= 1460193483) * 1485266147];
		@Pc(31) boolean local31 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307] == 1;
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class96_Sub13.method7481(local13, local31);
	}

	@OriginalMember(owner = "client!ce", name = "aia", descriptor = "(Lclient!yf;I)V", line = 10936)
	static final void method24630(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		if (Class136_Sub1.aClass12_15 == null) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
		} else {
			@Pc(19) Class77 local19 = Class136_Sub1.aClass12_15.method173((long) local12);
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local19 == null ? 0 : 1;
		}
	}

	@OriginalMember(owner = "client!ce", name = "aov", descriptor = "(Lclient!yf;S)V", line = 12110)
	static final void method24631(@OriginalArg(0) Class665 arg0) {
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub7_1, arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307]);
		client.aClass517_1.method30486();
		Class667.method33150();
		client.aBoolean593 = false;
	}
}
