package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!on")
public class Class466 {

	@OriginalMember(owner = "client!on", name = "hh", descriptor = "Lclient!aox;")
	public static Class32_Sub20 aClass32_Sub20_3;

	@OriginalMember(owner = "client!on", name = "e", descriptor = "I")
	public final int anInt5092;

	@OriginalMember(owner = "client!on", name = "n", descriptor = "Ljava/lang/Object;")
	public Object anObject19;

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "(I)V", line = 7)
	public Class466(@OriginalArg(0) int arg0) {
		this.anInt5092 = arg0 * 1107930259;
	}

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "(ILjava/lang/Object;)V", line = 11)
	public Class466(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1) {
		this.anInt5092 = arg0 * 1107930259;
		this.anObject19 = arg1;
	}

	@OriginalMember(owner = "client!on", name = "rq", descriptor = "(Ljava/lang/Object;)Z", line = 17)
	public boolean method29322(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class466)) {
			return false;
		}
		@Pc(7) Class466 local7 = (Class466) arg0;
		if (local7.anObject19 == null && this.anObject19 != null) {
			return false;
		} else if (this.anObject19 == null && local7.anObject19 != null) {
			return false;
		} else {
			return this.anInt5092 * -1181855333 == local7.anInt5092 * -1181855333 && local7.anObject19.equals(this.anObject19);
		}
	}

	@OriginalMember(owner = "client!on", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 17)
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class466)) {
			return false;
		}
		@Pc(7) Class466 local7 = (Class466) arg0;
		if (local7.anObject19 == null && this.anObject19 != null) {
			return false;
		} else if (this.anObject19 == null && local7.anObject19 != null) {
			return false;
		} else {
			return this.anInt5092 * -1181855333 == local7.anInt5092 * -1181855333 && local7.anObject19.equals(this.anObject19);
		}
	}

	@OriginalMember(owner = "client!on", name = "rs", descriptor = "(Ljava/lang/Object;)Z", line = 17)
	public boolean method29323(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class466)) {
			return false;
		}
		@Pc(7) Class466 local7 = (Class466) arg0;
		if (local7.anObject19 == null && this.anObject19 != null) {
			return false;
		} else if (this.anObject19 == null && local7.anObject19 != null) {
			return false;
		} else {
			return this.anInt5092 * -1181855333 == local7.anInt5092 * -1181855333 && local7.anObject19.equals(this.anObject19);
		}
	}

	@OriginalMember(owner = "client!on", name = "rp", descriptor = "(Ljava/lang/Object;)Z", line = 17)
	public boolean method29324(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class466)) {
			return false;
		}
		@Pc(7) Class466 local7 = (Class466) arg0;
		if (local7.anObject19 == null && this.anObject19 != null) {
			return false;
		} else if (this.anObject19 == null && local7.anObject19 != null) {
			return false;
		} else {
			return this.anInt5092 * -1181855333 == local7.anInt5092 * -1181855333 && local7.anObject19.equals(this.anObject19);
		}
	}

	@OriginalMember(owner = "client!on", name = "ro", descriptor = "(Ljava/lang/Object;)Z", line = 17)
	public boolean method29325(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class466)) {
			return false;
		}
		@Pc(7) Class466 local7 = (Class466) arg0;
		if (local7.anObject19 == null && this.anObject19 != null) {
			return false;
		} else if (this.anObject19 == null && local7.anObject19 != null) {
			return false;
		} else {
			return this.anInt5092 * -1181855333 == local7.anInt5092 * -1181855333 && local7.anObject19.equals(this.anObject19);
		}
	}

	@OriginalMember(owner = "client!on", name = "e", descriptor = "(Lclient!alw;I)Lclient!kn;", line = 33)
	public static Class383 method29326(@OriginalArg(0) Class93_Sub41 arg0) {
		@Pc(3) int local3 = arg0.method22413();
		@Pc(10) Class390 local10 = Class708.method36756()[arg0.method22413()];
		@Pc(17) Class392 local17 = Class252.method25978()[arg0.method22413()];
		@Pc(21) int local21 = arg0.method22482();
		@Pc(25) int local25 = arg0.method22482();
		@Pc(29) int local29 = arg0.method22415();
		@Pc(33) int local33 = arg0.method22415();
		@Pc(37) int local37 = arg0.method22419();
		@Pc(41) int local41 = arg0.method22419();
		@Pc(45) int local45 = arg0.method22419();
		@Pc(54) boolean local54 = arg0.method22413() == 1;
		return new Class383(local3, local10, local17, local21, local25, local29, local33, local37, local41, local45, local54);
	}

	@OriginalMember(owner = "client!on", name = "jd", descriptor = "(I)V", line = 9656)
	static final void method29328() {
		@Pc(2) Class93_Sub41_Sub2 local2 = client.aClass175_2.aClass93_Sub41_Sub2_2;
		for (@Pc(4) int local4 = 0; local4 < client.anInt3472 * 146012633; local4++) {
			@Pc(13) int local13 = client.anIntArray306[local4];
			@Pc(21) Class132_Sub1_Sub1_Sub1_Sub1 local21 = (Class132_Sub1_Sub1_Sub1_Sub1) ((Class93_Sub15) client.aClass16_18.method215((long) local13)).anObject5;
			local2.method22415();
			@Pc(29) int local29 = local2.method22413();
			if ((local29 & 0x2) != 0) {
				local29 += local2.method22413() << 8;
			}
			if ((local29 & 0x200) != 0) {
				local29 += local2.method22413() << 16;
			}
			if ((local29 & 0x100000) != 0) {
				local29 += local2.method22413() << 24;
			}
			@Pc(75) int local75;
			@Pc(79) int local79;
			@Pc(88) int local88;
			@Pc(92) int local92;
			@Pc(98) int local98;
			@Pc(114) boolean local114;
			if ((local29 & 0x4000000) != 0) {
				local75 = local2.method22457();
				local79 = local2.method22538();
				if (local75 == 65535) {
					local75 = -1;
				}
				local88 = local2.method22413();
				local92 = local88 & 0x7;
				local98 = local88 >> 3 & 0xF;
				if (local98 == 15) {
					local98 = -1;
				}
				local114 = (local88 >> 7 & 0x1) == 1;
				local21.method20010(local75, local79, local92, local98, local114, 3);
			}
			if ((local29 & 0x2000) != 0) {
				local75 = local2.method22457();
				local79 = local2.method22538();
				if (local75 == 65535) {
					local75 = -1;
				}
				local88 = local2.method22499();
				local92 = local88 & 0x7;
				local98 = local88 >> 3 & 0xF;
				if (local98 == 15) {
					local98 = -1;
				}
				local114 = (local88 >> 7 & 0x1) == 1;
				local21.method20010(local75, local79, local92, local98, local114, 1);
			}
			@Pc(190) int[] local190;
			@Pc(193) int[] local193;
			@Pc(196) int[] local196;
			@Pc(205) int local205;
			if ((local29 & 0x1000) != 0) {
				local75 = local2.method22499();
				local190 = new int[local75];
				local193 = new int[local75];
				local196 = new int[local75];
				for (local98 = 0; local98 < local75; local98++) {
					local205 = local2.method22436();
					local190[local98] = local205;
					local193[local98] = local2.method22413();
					local196[local98] = local2.method22443();
				}
				Class133_Sub1.method10077(local21, local190, local193, local196);
			}
			if ((local29 & 0x4000) != 0) {
				local75 = local2.method22499();
				local190 = new int[local75];
				local193 = new int[local75];
				for (local92 = 0; local92 < local75; local92++) {
					local98 = local2.method22443();
					if ((local98 & 0xC000) == 49152) {
						local205 = local2.method22459();
						local190[local92] = local98 << 16 | local205;
					} else {
						local190[local92] = local98;
					}
					local193[local92] = local2.method22415();
				}
				local21.method19954(local190, local193);
			}
			if ((local29 & 0x1000000) != 0) {
				local21.anInt2651 = local2.method22449() * -2009901847;
			}
			if ((local29 & 0x1) != 0) {
				local21.anInt2642 = local2.method22457() * 757135575;
				local21.anInt2643 = local2.method22457() * -1574519779;
			}
			@Pc(427) int local427;
			if ((local29 & 0x80000) != 0) {
				local75 = 0;
				if (local21.aClass336_1.aShortArray118 != null) {
					local75 = local21.aClass336_1.aShortArray118.length;
				}
				@Pc(338) byte local338 = 0;
				if (local21.aClass336_1.aShortArray120 != null) {
					local75 = local21.aClass336_1.aShortArray120.length;
				}
				local88 = local2.method22413();
				if ((local88 & 0x1) != 1) {
					local2.anInt3070 += 1403713386;
					local196 = null;
					if ((local88 & 0x2) == 2) {
						local98 = local2.method22413();
						local196 = new int[local98];
						for (local205 = 0; local205 < local98; local205++) {
							local196[local205] = local2.method22436();
						}
					}
					@Pc(393) short[] local393 = null;
					if ((local88 & 0x4) == 4) {
						local393 = new short[local75];
						for (local205 = 0; local205 < local75; local205++) {
							local393[local205] = (short) local2.method22457();
						}
					}
					@Pc(417) short[] local417 = null;
					if ((local88 & 0x8) == 8) {
						local417 = new short[local338];
						for (local427 = 0; local427 < local338; local427++) {
							local417[local427] = (short) local2.method22459();
						}
					}
					@Pc(450) long local450 = (long) ((Class132_Sub1_Sub1_Sub1_Sub1.anInt2645 += 1113118159) * -1709043409 - 1);
					new Class331(local450, local196, null, null, null, local393, local417);
				}
			}
			if ((local29 & 0x2000000) != 0) {
				local75 = local2.method22415();
				local79 = local2.method22538();
				if (local75 == 65535) {
					local75 = -1;
				}
				local88 = local2.method22497();
				local92 = local88 & 0x7;
				local98 = local88 >> 3 & 0xF;
				if (local98 == 15) {
					local98 = -1;
				}
				local114 = (local88 >> 7 & 0x1) == 1;
				local21.method20010(local75, local79, local92, local98, local114, 4);
			}
			if ((local29 & 0x40) != 0) {
				@Pc(526) int[] local526 = new int[4];
				for (local79 = 0; local79 < 4; local79++) {
					local526[local79] = local2.method22436();
				}
				local79 = local2.method22497();
				Class623.method32148(local21, local526, local79, true);
			}
			if ((local29 & 0x800000) != 0) {
				local21.anInt2647 = local2.method22459() * -1192456509;
				if (local21.anInt2647 * 1464472043 == 65535) {
					local21.anInt2647 = local21.aClass336_1.anInt4159 * 342332629;
				}
			}
			if ((local29 & 0x10) != 0) {
				if (local21.aClass336_1.method27432()) {
					Class665.method32895(local21);
				}
				local21.method18590((Class336) Class162.aClass32_Sub3_2.method18261(local2.method22436()), (local29 & 0x10000) == 0, (local29 & 0x800000) == 0, true);
				local21.method19961(local21.aClass336_1.anInt4154 * 447008399);
				local21.anInt2788 = (local21.aClass336_1.anInt4165 * 295553787 << 3) * 723489705;
				if (local21.aClass336_1.method27432()) {
					Class643.method32583(local21.aByte100, local21.anIntArray240[0], local21.anIntArray239[0], 0, null, local21, null);
				}
			}
			if ((local29 & 0x8000) != 0) {
				local21.anInt2775 = local2.method22389() * -1449351677;
				local21.anInt2777 = local2.method22451() * -2034096445;
				local21.anInt2793 = local2.method22451() * -688148243;
				local21.anInt2778 = local2.method22389() * 501346955;
				local21.anInt2773 = local2.method22503() * -1861667641;
				local21.anInt2779 = local2.method22503() * -1832474127;
				local21.anInt2780 = (local2.method22415() + client.anInt3485) * 755240883;
				local21.anInt2762 = (local2.method22457() + client.anInt3485) * 1838812733;
				local21.anInt2782 = local2.method22457() * 862199857;
				local21.anInt2763 = 1975362387;
				local21.anInt2760 = 0;
				local21.anInt2775 += local21.anIntArray240[0] * -1449351677;
				local21.anInt2777 += local21.anIntArray239[0] * -2034096445;
				local21.anInt2793 += local21.anIntArray240[0] * -688148243;
				local21.anInt2778 += local21.anIntArray239[0] * 501346955;
				local21.anInt2773 += local21.aByte100 * -1861667641;
				local21.anInt2779 += local21.aByte100 * -1832474127;
			}
			if ((local29 & 0x10000000) != 0) {
				local21.aByte71 = local2.method22389();
				local21.aByte72 = local2.method22451();
				local21.aByte73 = local2.method22414();
				local21.aByte74 = (byte) local2.method22413();
				local21.anInt2789 = (client.anInt3485 + local2.method22415()) * 782633717;
				local21.anInt2796 = (client.anInt3485 + local2.method22457()) * 1198097015;
			}
			if ((local29 & 0x20) != 0) {
				local21.anInt2772 = local2.method22459() * -1158576417;
				if (local21.anInt2772 * -583289569 == 65535) {
					local21.anInt2772 = 1158576417;
				}
			}
			if ((local29 & 0x40000) != 0) {
				local75 = local2.aByteArray58[(local2.anInt3070 += -1445626955) * 212851357 - 1] & 0xFF;
				for (local79 = 0; local79 < local75; local79++) {
					local88 = local2.method22413();
					local92 = local2.method22508();
					local98 = local2.method22476();
					local21.method18598(local88, local92, local98);
				}
			}
			@Pc(1012) int local1012;
			if ((local29 & 0x8) != 0) {
				local75 = local2.method22449();
				if (local75 > 0) {
					for (local79 = 0; local79 < local75; local79++) {
						local92 = -1;
						local205 = -1;
						local88 = local2.method22632();
						if (local88 == 32767) {
							local88 = local2.method22632();
							local98 = local2.method22632();
							local92 = local2.method22632();
							local205 = local2.method22632();
						} else if (local88 == 32766) {
							local88 = -1;
							local98 = local2.method22497();
						} else {
							local98 = local2.method22632();
						}
						local427 = local2.method22632();
						local21.method19958(local88, local98, local92, local205, client.anInt3485, local427);
					}
				}
				local79 = local2.method22449();
				if (local79 > 0) {
					for (local88 = 0; local88 < local79; local88++) {
						local92 = local2.method22632();
						local98 = local2.method22632();
						if (local98 == 32767) {
							local21.method19960(local92);
						} else {
							local205 = local2.method22632();
							local427 = local2.method22499();
							local1012 = local98 > 0 ? local2.method22413() : local427;
							local21.method19959(local92, client.anInt3485, local98, local205, local427, local1012);
						}
					}
				}
			}
			@Pc(1075) Class500 local1075;
			@Pc(1081) Class466 local1081;
			if ((local29 & 0x200000) != 0) {
				local21.anInterface3_5.method777();
				local2.anInt3070 += 1403713386;
				local75 = local2.aByteArray58[(local2.anInt3070 += -1445626955) * 212851357 - 1] & 0xFF;
				for (local79 = 0; local79 < local75; local79++) {
					local88 = local2.method22497();
					local1075 = (Class500) Class107.method18119(Class500.method30159(), local88);
					local1081 = Class684.aClass79_Sub1_Sub2_6.method1464(local2, local1075);
					local21.anInterface3_5.method776(local1081.anInt5092 * -1181855333, local1081.anObject19);
				}
			}
			if ((local29 & 0x20000) != 0) {
				local75 = local2.method22449();
				local190 = new int[8];
				@Pc(1108) short[] local1108 = new short[8];
				for (local92 = 0; local92 < 8; local92++) {
					if ((local75 & 0x1 << local92) == 0) {
						local190[local92] = -1;
						local1108[local92] = -1;
					} else {
						local190[local92] = local2.method22436();
						local1108[local92] = (short) local2.method22433();
					}
				}
				local21.aClass334_1 = new Class334(local190, local1108);
			}
			if ((local29 & 0x800) != 0) {
				local21.anInt2646 = local2.method22459() * 28943715;
				if (local21.anInt2646 * -1509096373 == 65535) {
					local21.anInt2646 = -28943715;
				}
			}
			if ((local29 & 0x4) != 0) {
				local21.method18599(local2.method22427(), 0, 0);
			}
			if ((local29 & 0x80) != 0) {
				local75 = local2.method22415();
				local79 = local2.method22538();
				if (local75 == 65535) {
					local75 = -1;
				}
				local88 = local2.method22449();
				local92 = local88 & 0x7;
				local98 = local88 >> 3 & 0xF;
				if (local98 == 15) {
					local98 = -1;
				}
				local114 = (local88 >> 7 & 0x1) == 1;
				local21.method20010(local75, local79, local92, local98, local114, 0);
			}
			if ((local29 & 0x400) != 0) {
				local75 = 0;
				if (local21.aClass336_1.aShortArray118 != null) {
					local75 = local21.aClass336_1.aShortArray118.length;
				}
				local79 = 0;
				if (local21.aClass336_1.aShortArray120 != null) {
					local79 = local21.aClass336_1.aShortArray120.length;
				}
				local88 = local2.method22497();
				if ((local88 & 0x1) == 1) {
					local21.aClass331_1 = null;
				} else {
					local2.anInt3070 += 1403713386;
					local196 = null;
					@Pc(1292) float[] local1292 = null;
					@Pc(1295) int[][] local1295 = null;
					@Pc(1298) int[][] local1298 = null;
					@Pc(1328) int local1328;
					@Pc(1355) int local1355;
					if ((local88 & 0x2) == 2) {
						local1012 = local2.method22497();
						local196 = new int[local1012];
						if ((local88 & 0x10) == 16) {
							local1292 = new float[local1012];
							local1295 = new int[local1012][3];
							local1298 = new int[local1012][3];
						}
						for (local1328 = 0; local1328 < local1012; local1328++) {
							local196[local1328] = local2.method22436();
							if ((local88 & 0x10) == 16 && local196[local1328] != -1) {
								local1292[local1328] = local2.method22425();
								for (local1355 = 0; local1355 < 3; local1355++) {
									local1295[local1328][local1355] = local2.method22460();
								}
								for (local1355 = 0; local1355 < 3; local1355++) {
									local1298[local1328][local1355] = local2.method22482();
								}
							}
						}
					}
					@Pc(1387) short[] local1387 = null;
					if ((local88 & 0x4) == 4) {
						local1387 = new short[local75];
						for (local1328 = 0; local1328 < local75; local1328++) {
							local1387[local1328] = (short) local2.method22415();
						}
					}
					@Pc(1411) short[] local1411 = null;
					if ((local88 & 0x8) == 8) {
						local1411 = new short[local79];
						for (local1355 = 0; local1355 < local79; local1355++) {
							local1411[local1355] = (short) local2.method22415();
						}
					}
					@Pc(1444) long local1444 = (long) ((Class132_Sub1_Sub1_Sub1_Sub1.anInt2644 += -588889149) * -320846613 - 1);
					local21.aClass331_1 = new Class331(local1444, local196, local1292, local1295, local1298, local1387, local1411);
				}
			}
			if ((local29 & 0x10000) != 0) {
				local21.aString66 = local2.method22427();
				if ("".equals(local21.aString66) || local21.aString66.equals(local21.aClass336_1.aString178)) {
					local21.aString66 = local21.aClass336_1.aString178;
				}
			}
			if ((local29 & 0x20000000) != 0) {
				local21.aBoolean451 = local2.method22413() == 1;
			}
			if ((local29 & 0x8000000) != 0) {
				local75 = local2.method22415();
				local79 = local2.method22538();
				if (local75 == 65535) {
					local75 = -1;
				}
				local88 = local2.method22413();
				local92 = local88 & 0x7;
				local98 = local88 >> 3 & 0xF;
				if (local98 == 15) {
					local98 = -1;
				}
				local114 = (local88 >> 7 & 0x1) == 1;
				local21.method20010(local75, local79, local92, local98, local114, 2);
			}
			if ((local29 & 0x400000) != 0) {
				local2.anInt3070 += 1403713386;
				local75 = local2.aByteArray58[(local2.anInt3070 += -1445626955) * 212851357 - 1] & 0xFF;
				for (local79 = 0; local79 < local75; local79++) {
					local88 = local2.method22499();
					local1075 = (Class500) Class107.method18119(Class500.method30159(), local88);
					local1081 = Class684.aClass79_Sub1_Sub2_6.method1464(local2, local1075);
					local21.anInterface3_5.method776(local1081.anInt5092 * -1181855333, local1081.anObject19);
				}
			}
		}
	}

	@OriginalMember(owner = "client!on", name = "arz", descriptor = "(Lclient!yf;B)V", line = 12977)
	static final void method29327(@OriginalArg(0) Class681 arg0) {
		if (client.aString140 == null) {
			arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = "";
		} else {
			arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = client.aString140;
		}
	}
}
