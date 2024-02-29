package com.jagex;

import com.jagex.twitchtv.TwitchEventResult;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kq")
public abstract class Class115 {

	@OriginalMember(owner = "client!kq", name = "cg", descriptor = "I")
	static int anInt2917;

	@OriginalMember(owner = "client!kq", name = "p", descriptor = "Lclient!im;")
	final Class107 aClass107_13;

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Lclient!im;)V", line = 13)
	Class115(@OriginalArg(0) Class107 arg0) {
		this.aClass107_13 = arg0;
	}

	@OriginalMember(owner = "client!kq", name = "t", descriptor = "(I)V", line = 113)
	public static void method21202() {
		Class474.method29676();
		Class640.aClass147_Sub2_1.method15607();
		Class640.aClass147_Sub1_1.method15607();
		@Pc(17) Class77_Sub20 local17;
		@Pc(26) int local26;
		if (client.anInt3468 * -2064179505 > 0) {
			local17 = Class365.method28132(Class414.aClass414_79, client.aClass82_2.aClass16_1);
			local17.aClass77_Sub39_Sub1_2.method22408(client.anInt3468 * 333216572);
			for (local26 = 0; local26 < client.anInt3468 * -2064179505; local26++) {
				@Pc(35) Interface62 local35 = client.anInterface62Array2[local26];
				@Pc(43) long local43 = local35.method14148() - Class640.aLong303 * 3448347234370012423L;
				if (local43 > 16777215L) {
					local43 = 16777215L;
				}
				Class640.aLong303 = local35.method14148() * -2887650411480147785L;
				local17.aClass77_Sub39_Sub1_2.method22403(local35.method14158());
				local17.aClass77_Sub39_Sub1_2.method22413((int) local43);
			}
			client.aClass82_2.method2004(local17);
		}
		if (Class640.anInt5721 * -152420315 > 0) {
			Class640.anInt5721 -= 1972886445;
		}
		if (client.aBoolean612 && Class640.anInt5721 * -152420315 <= 0) {
			Class640.anInt5721 = 803023236;
			client.aBoolean612 = false;
			@Pc(114) int local114;
			if (Class11.anInt36 * -891094135 != 3) {
				local114 = (int) client.aFloat249 >> 3;
				local26 = (int) client.aFloat247 >> 3;
			} else if (Class597.aClass107_Sub1_2.method8880() == Class331.aClass331_4) {
				@Pc(107) Class115_Sub1 local107 = (Class115_Sub1) Class597.aClass107_Sub1_2.method8871();
				local114 = Class547.method30972(local107.aClass452_1) >> 3;
				@Pc(116) short local116 = 1024;
				local26 = (local116 * 3 - (Class579.method31668(local107.aClass452_1) >> 3)) % (local116 * 2);
			} else {
				local114 = 0;
				local26 = 0;
			}
			@Pc(153) Class77_Sub20 local153 = Class365.method28132(Class414.aClass414_36, client.aClass82_2.aClass16_1);
			local153.aClass77_Sub39_Sub1_2.method22609(local114);
			local153.aClass77_Sub39_Sub1_2.method22408(local26);
			client.aClass82_2.method2004(local153);
		}
		if (Class77_Sub36.aBoolean351 != Class640.aBoolean852) {
			Class640.aBoolean852 = Class77_Sub36.aBoolean351;
			local17 = Class365.method28132(Class414.aClass414_31, client.aClass82_2.aClass16_1);
			local17.aClass77_Sub39_Sub1_2.method22403(Class77_Sub36.aBoolean351 ? 1 : 0);
			client.aClass82_2.method2004(local17);
		}
		if (!client.aBoolean593) {
			local17 = Class365.method28132(Class414.aClass414_114, client.aClass82_2.aClass16_1);
			local17.aClass77_Sub39_Sub1_2.method22403(0);
			local26 = local17.aClass77_Sub39_Sub1_2.anInt3089 * 31645619;
			@Pc(214) Class77_Sub39 local214 = Class35_Sub6.aClass77_Sub35_45.method14377();
			local17.aClass77_Sub39_Sub1_2.method22452(local214.aByteArray53, 0, local214.anInt3089 * 31645619);
			local17.aClass77_Sub39_Sub1_2.method22463(local17.aClass77_Sub39_Sub1_2.anInt3089 * 31645619 - local26);
			client.aClass82_2.method2004(local17);
			client.aBoolean593 = true;
		}
		if (client.aBoolean594 || Class35_Sub6.aClass77_Sub35_45.aClass143_Sub6_2.method15109() != 1) {
			return;
		}
		@Pc(253) int[] local253 = Class284.aClass86_9.method20060();
		@Pc(259) Class77_Sub20 local259 = Class365.method28132(Class414.aClass414_74, client.aClass82_2.aClass16_1);
		local259.aClass77_Sub39_Sub1_2.method22408(0);
		@Pc(270) int local270 = local259.aClass77_Sub39_Sub1_2.anInt3089 * 31645619;
		if (local253 == null || local253.length == 0) {
			local259.aClass77_Sub39_Sub1_2.method22403(0);
		} else {
			local259.aClass77_Sub39_Sub1_2.method22403(1);
			@Pc(284) Class174[] local284 = Class174.method24548();
			@Pc(288) HashSet local288 = new HashSet();
			@Pc(292) ArrayList local292 = new ArrayList();
			@Pc(294) int local294 = 0;
			label94: while (true) {
				if (local294 >= local253.length) {
					Class256.method26214(local288, local259.aClass77_Sub39_Sub1_2);
					local259.aClass77_Sub39_Sub1_2.method22469(local292.size());
					if (local292.size() <= 0) {
						break;
					}
					local294 = Integer.MAX_VALUE;
					@Pc(355) Iterator local355 = local292.iterator();
					@Pc(362) Integer local362;
					while (local355.hasNext()) {
						local362 = (Integer) local355.next();
						if (local362 < local294) {
							local294 = local362;
						}
					}
					local259.aClass77_Sub39_Sub1_2.method22474(local294);
					local355 = local292.iterator();
					while (true) {
						if (!local355.hasNext()) {
							break label94;
						}
						local362 = (Integer) local355.next();
						if (local362 != local294) {
							local259.aClass77_Sub39_Sub1_2.method22474(local362 - local294);
						}
					}
				}
				@Pc(300) boolean local300 = false;
				for (@Pc(302) int local302 = 0; local302 < local284.length; local302++) {
					if (local284[local302].anInt3296 == local253[local294]) {
						local288.add(local284[local302]);
						local300 = true;
						break;
					}
				}
				if (!local300) {
					local292.add(local253[local294]);
				}
				local294++;
			}
		}
		local259.aClass77_Sub39_Sub1_2.method22462(local259.aClass77_Sub39_Sub1_2.anInt3089 * 31645619 - local270);
		client.aClass82_2.method2004(local259);
		client.aBoolean594 = true;
	}

	@OriginalMember(owner = "client!kq", name = "ao", descriptor = "(IIB)V", line = 454)
	static void method21203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) TwitchEventResult local5 = new TwitchEventResult(arg0, arg1);
		@Pc(8) Class587 local8 = local5.c();
		if (local8 != null) {
			Class112.method9541(local8.method36479(), local5);
		}
	}

	@OriginalMember(owner = "client!kq", name = "jz", descriptor = "(IIIIIIB)V", line = 5616)
	static final void method21204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = Class152.anInt2399 * -1843550713;
		@Pc(5) int[] local5 = Class152.anIntArray221;
		client.anInt3524 = 0;
		@Pc(15) int local15;
		if (client.anInt3443 * -1468443459 == 3) {
			local15 = Class589.aClass222Array1.length;
		} else {
			local15 = client.anInt3527 * -1125820437 + local3;
		}
		@Pc(24) int local24;
		@Pc(343) int local343;
		@Pc(352) int local352;
		@Pc(227) int local227;
		@Pc(580) int local580;
		@Pc(789) int local789;
		@Pc(598) int local598;
		@Pc(603) int local603;
		@Pc(1028) int local1028;
		@Pc(410) int local410;
		for (local24 = 0; local24 < local15; local24++) {
			@Pc(29) Class333 local29 = null;
			@Pc(46) Class104_Sub1_Sub1_Sub1 local46;
			if (client.anInt3443 * -1468443459 == 3) {
				@Pc(38) Class222 local38 = Class589.aClass222Array1[local24];
				if (!local38.aBoolean643) {
					continue;
				}
				local46 = local38.method25755();
				if (local46.anInt2878 * -1527295759 != client.anInt3447 * 1373322351) {
					continue;
				}
				if (local38.anInt3742 * -849492911 >= 0) {
					local29 = ((Class104_Sub1_Sub1_Sub1_Sub1) local46).aClass333_1;
					if (local29.anIntArray437 != null) {
						local29 = local29.method27642(Class55.aClass124_1, Class55.aClass124_1);
						if (local29 == null) {
							continue;
						}
					}
				}
			} else {
				if (local24 < local3) {
					local46 = client.aClass104_Sub1_Sub1_Sub1_Sub2Array1[local5[local24]];
				} else {
					local46 = (Class104_Sub1_Sub1_Sub1) ((Class77_Sub6) client.aClass12_22.method173((long) client.anIntArray317[local24 - local3])).anObject5;
					local29 = ((Class104_Sub1_Sub1_Sub1_Sub1) local46).aClass333_1;
					if (local29.anIntArray437 != null) {
						local29 = local29.method27642(Class55.aClass124_1, Class55.aClass124_1);
						if (local29 == null) {
							continue;
						}
					}
				}
				if (local46.anInt2873 * -1547173311 < 0 || client.anInt3447 * 1373322351 != local46.anInt2878 * -1527295759 && Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aByte100 != local46.aByte100) {
					continue;
				}
			}
			Class548.method30977(local46, local46.method24134(), false);
			if (!(client.aFloatArray96[0] < 0.0F)) {
				if (local46.method21142()) {
					@Pc(157) Class532 local157 = local46.method21143();
					if (local157 != null && client.anInt3524 * -156893177 < client.anInt3515 * 1281230471) {
						@Pc(171) String local171 = local157.method30744();
						if (Class205.aClass299_1.method27068()) {
							local171 = Class205.aClass299_1.method27096(local171);
						}
						client.anIntArray337[client.anInt3524 * -156893177] = Class346.aClass17_12.method297(local171) / 2;
						client.anIntArray339[client.anInt3524 * -156893177] = (int) client.aFloatArray96[0];
						client.anIntArray340[client.anInt3524 * -156893177] = (int) client.aFloatArray96[1];
						client.aClass532Array1[client.anInt3524 * -156893177] = local157;
						client.anInt3524 += 1230335415;
					}
				}
				local227 = (int) (client.aFloatArray96[1] + (float) arg1);
				local227 -= Class346.aClass17_12.anInt52 * 102396103;
				@Pc(236) boolean local236 = false;
				@Pc(263) Class579 local263;
				@Pc(298) Class83 local298;
				@Pc(488) int local488;
				if (!local46.aBoolean484 && !local46.aClass703_5.method36541()) {
					for (@Pc(250) Class131_Sub6 local250 = (Class131_Sub6) local46.aClass703_5.method36536(); local250 != null; local250 = (Class131_Sub6) local46.aClass703_5.method36537()) {
						@Pc(258) Class131_Sub1 local258 = local250.method13134(client.anInt3414);
						if (local258 != null) {
							local263 = local250.aClass579_1;
							@Pc(269) Class104_Sub1_Sub1_Sub1_Sub2 local269 = client.aClass104_Sub1_Sub1_Sub1_Sub2Array1[local5[local24]];
							@Pc(289) Class83 local289;
							if (local269 == null || Class282.aClass282_4 == local269.aClass282_1) {
								local289 = local263.method31669(Class284.aClass86_9, local263.anInt5440 * 930052789);
								local298 = local263.method31669(Class284.aClass86_9, local263.anInt5436 * -1494517865);
							} else if (Class282.aClass282_2 == local269.aClass282_1) {
								local289 = local263.method31669(Class284.aClass86_9, local263.anInt5439 * 1463849337);
								local298 = local263.method31669(Class284.aClass86_9, local263.anInt5438 * 62974025);
							} else {
								local289 = local263.method31669(Class284.aClass86_9, local263.anInt5441 * 1417005703);
								local298 = local263.method31669(Class284.aClass86_9, local263.anInt5430 * -1550459521);
							}
							if (local289 != null && local298 != null) {
								local343 = 255;
								@Pc(345) boolean local345 = true;
								local352 = client.anInt3414 - local258.anInt1415 * 1770939769;
								@Pc(362) int local362 = local298.method18169() * 1415440011 * local258.anInt1416 / 255;
								@Pc(387) int local387;
								@Pc(397) int local397;
								if (local258.anInt1417 * -1162579465 > local352) {
									local387 = local263.anInt5434 * -1314075657 == 0 ? 0 : local352 / (local263.anInt5434 * -1314075657) * local263.anInt5434 * -1314075657;
									local397 = local298.method18169() * local258.anInt1414 * -1206299323 / 255;
									local410 = local387 * (local362 - local397) / (local258.anInt1417 * -1162579465) + local397;
								} else {
									local410 = local362;
									local387 = local258.anInt1417 * -1162579465 + local263.anInt5435 * 1929647207 - local352;
									if (local263.anInt5433 * 2041880747 >= 0) {
										local343 = (local387 << 8) / (local263.anInt5435 * 1929647207 - local263.anInt5433 * 2041880747);
									}
								}
								if (local258.anInt1416 * 1415440011 > 0 && local410 < 2) {
									local410 = 2;
								}
								local387 = local289.method18171();
								local397 = (int) ((float) arg0 + client.aFloatArray96[0] - (float) (local289.method18169() >> 1));
								local227 -= local387;
								if (local343 >= 0 && local343 < 255) {
									@Pc(484) int local484 = local343 << 24;
									local488 = local484 | 0xFFFFFF;
									local289.method18177(local397, local227, 0, local488, 1);
									Class284.aClass86_9.method20079(local397, local227, local410 + local397, local227 + local387);
									local298.method18177(local397, local227, 0, local488, 1);
								} else {
									local289.method18123(local397, local227);
									Class284.aClass86_9.method20079(local397, local227, local410 + local397, local387 + local227);
									local298.method18123(local397, local227);
								}
								Class284.aClass86_9.method20151(arg0, arg1, arg2 + arg0, arg1 + arg3);
								local227 -= 2;
								local236 = true;
							}
						} else if (local250.method13136()) {
							local250.method23056();
						}
					}
				}
				if (!local236) {
					local227 -= Class617.aClass629_1.anInt5685 * 1453520235 + 2;
				}
				if (!local46.aBoolean484) {
					@Pc(610) long local610;
					@Pc(623) Class89[] local623;
					if (local29 == null) {
						@Pc(578) Class104_Sub1_Sub1_Sub1_Sub2 local578 = (Class104_Sub1_Sub1_Sub1_Sub2) local46;
						for (local580 = 0; local580 < local578.anIntArray278.length; local580++) {
							if (local578.anIntArray278[local580] >= 0) {
								local263 = null;
								local598 = local578.anIntArray278[local580];
								local603 = local578.anIntArray277[local580];
								local610 = local603 << 8 | local598;
								@Pc(615) Class83 local615 = (Class83) client.aClass232_64.method25835(local610);
								if (local615 == null) {
									local623 = Class210.method25596(Class470.aClass478_125, local603, 0);
									if (local623 == null) {
										continue;
									}
									local615 = Class284.aClass86_9.method20076(local623[local598], true);
									client.aClass232_64.method25844(local615, local610);
								}
								if (local615 != null) {
									local227 -= local615.method18171();
									local615.method18123((int) ((float) arg0 + client.aFloatArray96[0] - 12.0F), local227);
									local227 -= 2;
								}
							}
						}
					} else {
						@Pc(664) Class104_Sub1_Sub1_Sub1_Sub1 local664 = (Class104_Sub1_Sub1_Sub1_Sub1) local46;
						@Pc(675) int[] local675 = local664.aClass323_1 == null ? local664.aClass333_1.anIntArray439 : local664.aClass323_1.anIntArray433;
						@Pc(686) short[] local686 = local664.aClass323_1 == null ? local664.aClass333_1.aShortArray121 : local664.aClass323_1.aShortArray113;
						if (local686 != null && local675 != null) {
							for (local598 = 0; local598 < local686.length; local598++) {
								if (local686[local598] >= 0 && local675[local598] >= 0) {
									local298 = null;
									local610 = local675[local598] << 8 | local686[local598];
									local298 = (Class83) client.aClass232_64.method25835(local610);
									if (local298 == null) {
										local623 = Class210.method25596(Class470.aClass478_125, local675[local598], 0);
										if (local623 == null) {
											continue;
										}
										local298 = Class284.aClass86_9.method20076(local623[local686[local598]], true);
										client.aClass232_64.method25844(local298, local610);
									}
									if (local298 != null) {
										local227 -= local298.method18171();
										local298.method18123((int) (client.aFloatArray96[0] + (float) arg0 - (float) (local298.method18169() >> 1)), local227);
										local227 -= 2;
									}
								}
							}
						}
					}
				}
				@Pc(851) int local851;
				@Pc(785) int local785;
				@Pc(787) Class73[] local787;
				@Pc(797) Class73 local797;
				if (!(local46 instanceof Class104_Sub1_Sub1_Sub1_Sub2)) {
					local785 = 0;
					local787 = client.aClass73Array1;
					for (local789 = 0; local789 < local787.length; local789++) {
						local797 = local787[local789];
						if (local797 != null && local797.anInt215 * 652406965 == 1 && client.anIntArray317[local24 - local3] == local797.anInt208 * -879249997) {
							local298 = Class515.aClass83Array8[local797.anInt216 * -1562758755];
							if (local298.method18171() > local785) {
								local785 = local298.method18171();
							}
							@Pc(906) boolean local906;
							if (local797.anInt207 * 1818534715 == 0) {
								local906 = true;
							} else {
								local343 = Class475.method29690() * 1000 / (local797.anInt207 * 1818534715) / 2;
								local906 = client.anInt3414 % (local343 * 2) < local343;
							}
							if (local906) {
								local298.method18123((int) ((float) arg0 + client.aFloatArray96[0] - 12.0F), local227 - local298.method18171());
							}
						}
					}
					if (local785 > 0) {
						local851 = local227 - (local785 + 2);
					}
				} else if (local24 >= 0) {
					local785 = 0;
					local787 = client.aClass73Array1;
					for (local789 = 0; local789 < local787.length; local789++) {
						local797 = local787[local789];
						if (local797 != null && local797.anInt215 * 652406965 == 10 && local797.anInt208 * -879249997 == local5[local24]) {
							local298 = Class515.aClass83Array8[local797.anInt216 * -1562758755];
							if (local298.method18171() > local785) {
								local785 = local298.method18171();
							}
							local298.method18123((int) ((float) arg0 + client.aFloatArray96[0] - 12.0F), local227 - local298.method18171());
						}
					}
					if (local785 > 0) {
						local851 = local227 - (local785 + 2);
					}
				}
				for (local785 = 0; local785 < Class617.aClass629_1.anInt5687 * 521612365; local785++) {
					local580 = local46.anIntArray268[local785];
					local789 = local46.anIntArray269[local785];
					@Pc(977) Class578 local977 = null;
					local603 = 0;
					if (local789 >= 0) {
						if (local580 <= client.anInt3414) {
							continue;
						}
						local977 = (Class578) Class629.aClass35_Sub1_1.method18319(local46.anIntArray269[local785]);
						local603 = local977.anInt5411 * 1049226697;
						if (local977 != null && local977.anIntArray503 != null) {
							local977 = local977.method31633(Class55.aClass124_1, Class55.aClass124_1);
							if (local977 == null) {
								local46.anIntArray268[local785] = -1;
								continue;
							}
						}
					} else if (local580 < 0) {
						continue;
					}
					local1028 = local46.anIntArray273[local785];
					@Pc(1030) Class578 local1030 = null;
					if (local1028 >= 0) {
						local1030 = (Class578) Class629.aClass35_Sub1_1.method18319(local1028);
						if (local1030 != null && local1030.anIntArray503 != null) {
							local1030 = local1030.method31633(Class55.aClass124_1, Class55.aClass124_1);
						}
					}
					if (local580 - local603 <= client.anInt3414) {
						if (local977 == null) {
							local46.anIntArray268[local785] = -1;
						} else {
							local410 = local46.method24134() / 2;
							Class548.method30977(local46, local410, false);
							if (client.aFloatArray96[0] > -1.0F) {
								client.aFloatArray96[0] += Class617.aClass629_1.anIntArray527[local785];
								client.aFloatArray96[1] += Class617.aClass629_1.anIntArray526[local785];
								@Pc(1106) Object local1106 = null;
								@Pc(1108) Class83 local1108 = null;
								@Pc(1110) Class83 local1110 = null;
								@Pc(1112) Class83 local1112 = null;
								local488 = 0;
								@Pc(1116) int local1116 = 0;
								@Pc(1118) int local1118 = 0;
								@Pc(1120) int local1120 = 0;
								@Pc(1122) int local1122 = 0;
								@Pc(1124) int local1124 = 0;
								@Pc(1126) int local1126 = 0;
								@Pc(1128) int local1128 = 0;
								@Pc(1130) Class83 local1130 = null;
								@Pc(1132) Class83 local1132 = null;
								@Pc(1134) Class83 local1134 = null;
								@Pc(1136) Class83 local1136 = null;
								@Pc(1138) int local1138 = 0;
								@Pc(1140) int local1140 = 0;
								@Pc(1142) int local1142 = 0;
								@Pc(1144) int local1144 = 0;
								@Pc(1146) int local1146 = 0;
								@Pc(1148) int local1148 = 0;
								@Pc(1150) int local1150 = 0;
								@Pc(1152) int local1152 = 0;
								@Pc(1157) Class83 local1157 = local977.method31638(Class284.aClass86_9);
								if (local1157 != null) {
									local488 = local1157.method18169();
									local1157.method18168(client.anIntArray347);
									local1122 = client.anIntArray347[0];
								}
								local1108 = local977.method31643(Class284.aClass86_9);
								if (local1108 != null) {
									local1116 = local1108.method18169();
									local1108.method18168(client.anIntArray347);
									local1124 = client.anIntArray347[0];
								}
								local1110 = local977.method31646(Class284.aClass86_9);
								if (local1110 != null) {
									local1118 = local1110.method18169();
									local1110.method18168(client.anIntArray347);
									local1126 = client.anIntArray347[0];
								}
								local1112 = local977.method31648(Class284.aClass86_9);
								if (local1112 != null) {
									local1120 = local1112.method18169();
									local1112.method18168(client.anIntArray347);
									local1128 = client.anIntArray347[0];
								}
								if (local1030 != null) {
									local1130 = local1030.method31638(Class284.aClass86_9);
									if (local1130 != null) {
										local1138 = local1130.method18169();
										local1130.method18168(client.anIntArray347);
										local1146 = client.anIntArray347[0];
									}
									local1132 = local1030.method31643(Class284.aClass86_9);
									if (local1132 != null) {
										local1140 = local1132.method18169();
										local1132.method18168(client.anIntArray347);
										local1148 = client.anIntArray347[0];
									}
									local1134 = local1030.method31646(Class284.aClass86_9);
									if (local1134 != null) {
										local1142 = local1134.method18169();
										local1134.method18168(client.anIntArray347);
										local1150 = client.anIntArray347[0];
									}
									local1136 = local1030.method31648(Class284.aClass86_9);
									if (local1136 != null) {
										local1144 = local1136.method18169();
										local1136.method18168(client.anIntArray347);
										local1152 = client.anIntArray347[0];
									}
								}
								@Pc(1296) Class94 local1296 = Class248.aClass94_7;
								@Pc(1298) Class94 local1298 = Class248.aClass94_7;
								@Pc(1300) Class17 local1300 = Class143_Sub8.aClass17_8;
								@Pc(1302) Class17 local1302 = Class143_Sub8.aClass17_8;
								@Pc(1307) int local1307 = local977.anInt5421 * -648026785;
								@Pc(1319) Class94 local1319;
								@Pc(1325) Class17 local1325;
								if (local1307 >= 0) {
									local1319 = (Class94) Class367.aClass415_1.method28640(client.anInterface51_1, local1307, true, local977.aBoolean810);
									local1325 = Class367.aClass415_1.method28644(client.anInterface51_1, local1307);
									if (local1319 != null && local1325 != null) {
										local1296 = local1319;
										local1300 = local1325;
									}
								}
								if (local1030 != null) {
									local1307 = local1030.anInt5421 * -648026785;
									if (local1307 >= 0) {
										local1319 = (Class94) Class367.aClass415_1.method28640(client.anInterface51_1, local1307, true, local1030.aBoolean810);
										local1325 = Class367.aClass415_1.method28644(client.anInterface51_1, local1307);
										if (local1319 != null && local1325 != null) {
											local1298 = local1319;
											local1302 = local1325;
										}
									}
								}
								local1319 = null;
								@Pc(1373) String local1373 = null;
								@Pc(1375) boolean local1375 = false;
								@Pc(1377) int local1377 = 0;
								@Pc(1385) String local1385 = local977.method31636(local46.anIntArray270[local785]);
								@Pc(1390) int local1390 = local1300.method297(local1385);
								if (local1030 != null) {
									local1373 = local1030.method31636(local46.anIntArray271[local785]);
									local1377 = local1302.method297(local1373);
								}
								@Pc(1408) int local1408 = 0;
								@Pc(1410) int local1410 = 0;
								if (local1116 > 0) {
									local1408 = local1390 / local1116 + 1;
								}
								if (local1030 != null && local1140 > 0) {
									local1410 = local1377 / local1140 + 1;
								}
								@Pc(1431) int local1431 = 0;
								@Pc(1433) int local1433 = local1431;
								if (local488 > 0) {
									local1431 += local488;
								}
								local1431 += 2;
								@Pc(1442) int local1442 = local1431;
								if (local1118 > 0) {
									local1431 += local1118;
								}
								@Pc(1450) int local1450 = local1431;
								@Pc(1452) int local1452 = local1431;
								@Pc(1458) int local1458;
								if (local1116 > 0) {
									local1458 = local1116 * local1408;
									local1431 += local1458;
									local1452 += (local1458 - local1390) / 2;
								} else {
									local1431 += local1390;
								}
								local1458 = local1431;
								if (local1120 > 0) {
									local1431 += local1120;
								}
								@Pc(1485) int local1485 = 0;
								@Pc(1487) int local1487 = 0;
								@Pc(1489) int local1489 = 0;
								@Pc(1491) int local1491 = 0;
								@Pc(1493) int local1493 = 0;
								@Pc(1524) int local1524;
								if (local1030 != null) {
									local1431 += 2;
									local1485 = local1431;
									if (local1138 > 0) {
										local1431 += local1138;
									}
									local1431 += 2;
									local1487 = local1431;
									if (local1142 > 0) {
										local1431 += local1142;
									}
									local1489 = local1431;
									local1493 = local1431;
									if (local1140 > 0) {
										local1524 = local1140 * local1410;
										local1431 += local1524;
										local1493 += (local1524 - local1377) / 2;
									} else {
										local1431 += local1377;
									}
									local1491 = local1431;
									if (local1144 > 0) {
										local1431 += local1144;
									}
								}
								local1524 = local46.anIntArray268[local785] - client.anInt3414;
								@Pc(1573) int local1573 = local977.anInt5415 * -2060756059 - local977.anInt5415 * -2060756059 * local1524 / (local977.anInt5411 * 1049226697);
								@Pc(1591) int local1591 = -(local977.anInt5406 * -809297399) + local1524 * -809297399 * local977.anInt5406 / (local977.anInt5411 * 1049226697);
								@Pc(1607) int local1607 = (int) ((float) local1573 + ((float) arg0 + client.aFloatArray96[0] - (float) (local1431 >> 1)));
								@Pc(1620) int local1620 = (int) (client.aFloatArray96[1] + (float) arg1 - 12.0F + (float) local1591);
								@Pc(1629) int local1629 = local1620 + 15 + local977.anInt5420 * 848869245;
								@Pc(1631) int local1631 = 0;
								if (local1030 != null) {
									local1631 = local1620 + 15 + local1030.anInt5420 * 848869245;
								}
								@Pc(1645) int local1645 = 255;
								if (local977.anInt5417 * -681467477 >= 0) {
									local1645 = (local1524 << 8) / (local977.anInt5411 * 1049226697 - local977.anInt5417 * -681467477);
								}
								@Pc(1673) int local1673;
								if (local1645 >= 0 && local1645 < 255) {
									local1673 = local1645 << 24;
									@Pc(1677) int local1677 = local1673 | 0xFFFFFF;
									if (local1157 != null) {
										local1157.method18177(local1607 + local1433 - local1122, local1620, 0, local1677, 1);
									}
									if (local1110 != null) {
										local1110.method18177(local1442 + local1607 - local1126 + local977.anInt5423 * 1481307617, local1620 + local977.anInt5422 * -1588685693, 0, local1677, 1);
									}
									@Pc(1718) int local1718;
									if (local1108 != null) {
										for (local1718 = 0; local1718 < local1408; local1718++) {
											local1108.method18177(local977.anInt5423 * 1481307617 + local1718 * local1116 + (local1450 + local1607 - local1124), local977.anInt5422 * -1588685693 + local1620, 0, local1677, 1);
										}
									}
									if (local1112 != null) {
										local1112.method18177(local977.anInt5423 * 1481307617 + (local1607 + local1458 - local1128), local1620 + local977.anInt5422 * -1588685693, 0, local1677, 1);
									}
									local1296.method7602(local1385, local1452 + local1607, local1629, local977.anInt5410 * 1499836569 | local1673, 0);
									if (local1030 != null) {
										if (local1130 != null) {
											local1130.method18177(local1485 + local1607 - local1146, local1620, 0, local1677, 1);
										}
										if (local1134 != null) {
											local1134.method18177(local1030.anInt5423 * 1481307617 + (local1607 + local1487 - local1150), local1030.anInt5422 * -1588685693 + local1620, 0, local1677, 1);
										}
										if (local1132 != null) {
											for (local1718 = 0; local1718 < local1410; local1718++) {
												local1132.method18177(local1140 * local1718 + (local1489 + local1607 - local1148) + local1030.anInt5423 * 1481307617, local1030.anInt5422 * -1588685693 + local1620, 0, local1677, 1);
											}
										}
										if (local1136 != null) {
											local1136.method18177(local1030.anInt5423 * 1481307617 + (local1607 + local1491 - local1152), local1030.anInt5422 * -1588685693 + local1620, 0, local1677, 1);
										}
										local1298.method7602(local1373, local1493 + local1607, local1631, local1030.anInt5410 * 1499836569 | local1673, 0);
									}
								} else {
									if (local1157 != null) {
										local1157.method18123(local1607 + local1433 - local1122, local1620);
									}
									if (local1110 != null) {
										local1110.method18123(local1442 + local1607 - local1126 + local977.anInt5423 * 1481307617, local977.anInt5422 * -1588685693 + local1620);
									}
									if (local1108 != null) {
										for (local1673 = 0; local1673 < local1408; local1673++) {
											local1108.method18123(local977.anInt5423 * 1481307617 + local1116 * local1673 + (local1450 + local1607 - local1124), local1620 + local977.anInt5422 * -1588685693);
										}
									}
									if (local1112 != null) {
										local1112.method18123(local977.anInt5423 * 1481307617 + (local1607 + local1458 - local1128), local977.anInt5422 * -1588685693 + local1620);
									}
									local1296.method7602(local1385, local1607 + local1452, local1629, local977.anInt5410 * 1499836569 | 0xFF000000, 0);
									if (local1030 != null) {
										if (local1130 != null) {
											local1130.method18123(local1485 + local1607 - local1146, local1620);
										}
										if (local1134 != null) {
											local1134.method18123(local1030.anInt5423 * 1481307617 + (local1607 + local1487 - local1150), local1030.anInt5422 * -1588685693 + local1620);
										}
										if (local1132 != null) {
											for (local1673 = 0; local1673 < local1410; local1673++) {
												local1132.method18123(local1030.anInt5423 * 1481307617 + local1140 * local1673 + (local1607 + local1489 - local1148), local1030.anInt5422 * -1588685693 + local1620);
											}
										}
										if (local1136 != null) {
											local1136.method18123(local1491 + local1607 - local1152 + local1030.anInt5423 * 1481307617, local1030.anInt5422 * -1588685693 + local1620);
										}
										local1298.method7602(local1373, local1607 + local1493, local1631, local1030.anInt5410 * 1499836569 | 0xFF000000, 0);
									}
								}
							}
						}
					}
				}
			}
		}
		@Pc(2111) int local2111;
		for (local24 = 0; local24 < client.anInt3448 * 937787657; local24++) {
			local2111 = client.anIntArray327[local24];
			@Pc(2118) Class104_Sub1_Sub1_Sub1 local2118;
			if (local2111 < 2048) {
				local2118 = client.aClass104_Sub1_Sub1_Sub1_Sub2Array1[local2111];
			} else {
				local2118 = (Class104_Sub1_Sub1_Sub1) ((Class77_Sub6) client.aClass12_22.method173((long) (local2111 - 2048))).anObject5;
			}
			local227 = client.anIntArray328[local24];
			@Pc(2140) Class104_Sub1_Sub1_Sub1 local2140;
			if (local227 < 2048) {
				local2140 = client.aClass104_Sub1_Sub1_Sub1_Sub2Array1[local227];
			} else {
				local2140 = (Class104_Sub1_Sub1_Sub1) ((Class77_Sub6) client.aClass12_22.method173((long) (local227 - 2048))).anObject5;
			}
			Class475.method29691(local2118, local2140, (local2118.anInt2871 -= 503147987) * -122260901, arg0, arg1, arg2, arg3, arg4, arg5);
		}
		local24 = Class346.aClass17_12.anInt52 * 102396103 + Class346.aClass17_12.anInt51 * 728893755 + 2;
		for (local2111 = 0; local2111 < client.anInt3524 * -156893177; local2111++) {
			@Pc(2195) int local2195 = client.anIntArray339[local2111];
			local227 = client.anIntArray340[local2111];
			@Pc(2203) int local2203 = client.anIntArray337[local2111];
			@Pc(2205) boolean local2205 = true;
			while (local2205) {
				local2205 = false;
				for (local580 = 0; local580 < local2111; local580++) {
					if (local227 + 2 > client.anIntArray340[local580] - local24 && local227 - local24 < client.anIntArray340[local580] + 2 && local2195 - local2203 < client.anIntArray337[local580] + client.anIntArray339[local580] && local2203 + local2195 > client.anIntArray339[local580] - client.anIntArray337[local580] && client.anIntArray340[local580] - local24 < local227) {
						local227 = client.anIntArray340[local580] - local24;
						local2205 = true;
					}
				}
			}
			client.anIntArray340[local2111] = local227;
			@Pc(2282) String local2282 = client.aClass532Array1[local2111].method30744();
			if (Class205.aClass299_1.method27068()) {
				local2282 = Class205.aClass299_1.method27096(local2282);
			}
			if (client.anInt3477 * 717910271 == 0) {
				local789 = 16776960;
				local598 = client.aClass532Array1[local2111].method30747();
				if (local598 < 6) {
					local789 = client.anIntArray316[local598];
				}
				if (local598 == 6) {
					local789 = client.anInt3447 * 1373322351 % 20 < 10 ? 16711680 : 16776960;
				}
				if (local598 == 7) {
					local789 = client.anInt3447 * 1373322351 % 20 < 10 ? 255 : 65535;
				}
				if (local598 == 8) {
					local789 = client.anInt3447 * 1373322351 % 20 < 10 ? 45056 : 8454016;
				}
				if (local598 == 9) {
					local603 = 150 - client.aClass532Array1[local2111].method30755() * 150 / client.aClass532Array1[local2111].method30752();
					if (local603 < 50) {
						local789 = local603 * 1280 + 16711680;
					} else if (local603 < 100) {
						local789 = 16776960 - (local603 - 50) * 327680;
					} else if (local603 < 150) {
						local789 = (local603 - 100) * 5 + 65280;
					}
				}
				if (local598 == 10) {
					local603 = 150 - client.aClass532Array1[local2111].method30755() * 150 / client.aClass532Array1[local2111].method30752();
					if (local603 < 50) {
						local789 = local603 * 5 + 16711680;
					} else if (local603 < 100) {
						local789 = 16711935 - (local603 - 50) * 327680;
					} else if (local603 < 150) {
						local789 = (local603 - 100) * 327680 + 255 - (local603 - 100) * 5;
					}
				}
				if (local598 == 11) {
					local603 = 150 - client.aClass532Array1[local2111].method30755() * 150 / client.aClass532Array1[local2111].method30752();
					if (local603 < 50) {
						local789 = 16777215 - local603 * 327685;
					} else if (local603 < 100) {
						local789 = (local603 - 50) * 327685 + 65280;
					} else if (local603 < 150) {
						local789 = 16777215 - (local603 - 100) * 327680;
					}
				}
				local603 = local789 | 0xFF000000;
				local1028 = client.aClass532Array1[local2111].method30751();
				if (local1028 == 0) {
					Class260.aClass94_8.method7612(local2282, local2195 + arg0, local227 + arg1, local603, -16777216);
				}
				if (local1028 == 1) {
					Class260.aClass94_8.method7619(local2282, arg0 + local2195, arg1 + local227, local603, -16777216, client.anInt3447 * 1373322351);
				}
				if (local1028 == 2) {
					Class260.aClass94_8.method7620(local2282, local2195 + arg0, arg1 + local227, local603, -16777216, client.anInt3447 * 1373322351);
				}
				if (local1028 == 3) {
					local343 = 150 - client.aClass532Array1[local2111].method30755() * 150 / client.aClass532Array1[local2111].method30752();
					Class260.aClass94_8.method7626(local2282, local2195 + arg0, arg1 + local227, local603, -16777216, client.anInt3447 * 1373322351, local343);
				}
				if (local1028 == 4) {
					local343 = 150 - client.aClass532Array1[local2111].method30755() * 150 / client.aClass532Array1[local2111].method30752();
					local410 = local343 * (Class346.aClass17_12.method297(local2282) + 100) / 150;
					Class284.aClass86_9.method20079(arg0 + local2195 - 50, arg1, local2195 + arg0 + 50, arg3 + arg1);
					Class260.aClass94_8.method7602(local2282, arg0 + 50 + local2195 - local410, local227 + arg1, local603, -16777216);
					Class284.aClass86_9.method20151(arg0, arg1, arg2 + arg0, arg1 + arg3);
				}
				if (local1028 == 5) {
					local343 = 150 - client.aClass532Array1[local2111].method30755() * 150 / client.aClass532Array1[local2111].method30752();
					local410 = 0;
					if (local343 < 25) {
						local410 = local343 - 25;
					} else if (local343 > 125) {
						local410 = local343 - 125;
					}
					local352 = Class346.aClass17_12.anInt52 * 102396103 + Class346.aClass17_12.anInt51 * 728893755;
					Class284.aClass86_9.method20079(arg0, arg1 + local227 - local352 - 1, arg0 + arg2, arg1 + local227 + 5);
					Class260.aClass94_8.method7612(local2282, arg0 + local2195, local410 + local227 + arg1, local603, -16777216);
					Class284.aClass86_9.method20151(arg0, arg1, arg2 + arg0, arg3 + arg1);
				}
			} else {
				Class260.aClass94_8.method7612(local2282, arg0 + local2195, local227 + arg1, -256, -16777216);
			}
		}
	}

	@OriginalMember(owner = "client!kq", name = "i", descriptor = "()Lclient!oo;")
	public abstract Class447 method21205();

	@OriginalMember(owner = "client!kq", name = "l", descriptor = "(I)[D")
	public abstract double[] method21206();

	@OriginalMember(owner = "client!kq", name = "c", descriptor = "(I)Z")
	public abstract boolean method21207();

	@OriginalMember(owner = "client!kq", name = "s", descriptor = "(F[[[ILclient!ps;II)V")
	public abstract void method21208(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class474 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!kq", name = "y", descriptor = "(B)Lclient!aks;")
	public abstract Class77_Sub36 method21209();

	@OriginalMember(owner = "client!kq", name = "w", descriptor = "(I)F")
	public abstract float method21210();

	@OriginalMember(owner = "client!kq", name = "f", descriptor = "()Lclient!aks;")
	public abstract Class77_Sub36 method21211();

	@OriginalMember(owner = "client!kq", name = "p", descriptor = "(F[[[ILclient!ps;IIB)V")
	public abstract void method21212(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class474 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!kq", name = "v", descriptor = "(I)Lclient!oo;")
	public abstract Class447 method21213();

	@OriginalMember(owner = "client!kq", name = "d", descriptor = "(F[[[ILclient!ps;II)V")
	public abstract void method21214(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class474 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!kq", name = "x", descriptor = "(F[[[ILclient!ps;II)V")
	public abstract void method21215(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class474 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!kq", name = "r", descriptor = "()Z")
	public abstract boolean method21216();

	@OriginalMember(owner = "client!kq", name = "g", descriptor = "()Z")
	public abstract boolean method21217();

	@OriginalMember(owner = "client!kq", name = "o", descriptor = "(Lclient!ia;II)V")
	public abstract void method21218(@OriginalArg(0) Class315 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!kq", name = "j", descriptor = "()Lclient!oo;")
	public abstract Class447 method21219();

	@OriginalMember(owner = "client!kq", name = "e", descriptor = "()[D")
	public abstract double[] method21220();

	@OriginalMember(owner = "client!kq", name = "k", descriptor = "()Lclient!oo;")
	public abstract Class447 method21221();

	@OriginalMember(owner = "client!kq", name = "u", descriptor = "()Lclient!oo;")
	public abstract Class447 method21222();

	@OriginalMember(owner = "client!kq", name = "z", descriptor = "()Z")
	public abstract boolean method21223();

	@OriginalMember(owner = "client!kq", name = "q", descriptor = "(Lclient!akv;B)V")
	public abstract void method21224(@OriginalArg(0) Class77_Sub39 arg0);

	@OriginalMember(owner = "client!kq", name = "t", descriptor = "(Lclient!ia;IIS)V")
	public abstract void method21225(@OriginalArg(0) Class315 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "(Lclient!ia;II)V")
	public abstract void method21226(@OriginalArg(0) Class315 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!kq", name = "n", descriptor = "(Lclient!akv;)V")
	public abstract void method21227(@OriginalArg(0) Class77_Sub39 arg0);

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lclient!akv;)V")
	public abstract void method21228(@OriginalArg(0) Class77_Sub39 arg0);

	@OriginalMember(owner = "client!kq", name = "m", descriptor = "()F")
	public abstract float method21229();

	@OriginalMember(owner = "client!kq", name = "h", descriptor = "()F")
	public abstract float method21230();
}
