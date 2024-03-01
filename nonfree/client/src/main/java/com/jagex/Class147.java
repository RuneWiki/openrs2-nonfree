package com.jagex;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public class Class147 {

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "I")
	static int anInt3433;

	// $FF: synthetic field
	@OriginalMember(owner = "client!eg", name = "this$0", descriptor = "Lclient!ft;")
	final Class183 this$0;

	@OriginalMember(owner = "client!eg", name = "p", descriptor = "Ljava/util/List;")
	List aList3;

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "(IIB)I", line = 219)
	public static final int method23097(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == -1) {
			return 12345678;
		}
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!eg", name = "y", descriptor = "(I)V", line = 393)
	static void method23096() {
		try {
			@Pc(5) File local5 = new File(Class406.aString218, "random.dat");
			@Pc(29) int local29;
			if (local5.exists()) {
				Class390.aClass569_5 = new Class569(new Class592(local5, "rw", 25L), 24, 0);
			} else {
				label34: for (@Pc(23) int local23 = 0; local23 < Class220.aStringArray13.length; local23++) {
					for (local29 = 0; local29 < Class197.aStringArray12.length; local29++) {
						@Pc(53) File local53 = new File(Class197.aStringArray12[local29] + Class220.aStringArray13[local23] + File.separatorChar + "random.dat");
						if (local53.exists()) {
							Class390.aClass569_5 = new Class569(new Class592(local53, "rw", 25L), 24, 0);
							break label34;
						}
					}
				}
			}
			if (Class390.aClass569_5 == null) {
				@Pc(81) RandomAccessFile local81 = new RandomAccessFile(local5, "rw");
				local29 = local81.read();
				local81.seek(0L);
				local81.write(local29);
				local81.seek(0L);
				local81.close();
				Class390.aClass569_5 = new Class569(new Class592(local5, "rw", 25L), 24, 0);
			}
		} catch (@Pc(109) IOException local109) {
		}
	}

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Lclient!ft;)V", line = 919)
	Class147(@OriginalArg(0) Class183 arg0) {
		this.this$0 = arg0;
		this.aList3 = new ArrayList();
	}

	@OriginalMember(owner = "client!eg", name = "p", descriptor = "(Lclient!oh;B)V", line = 924)
	void method23088(@OriginalArg(0) Class366 arg0) {
		this.aList3.add(arg0);
	}

	@OriginalMember(owner = "client!eg", name = "h", descriptor = "(Lclient!oh;)V", line = 924)
	void method23091(@OriginalArg(0) Class366 arg0) {
		this.aList3.add(arg0);
	}

	@OriginalMember(owner = "client!eg", name = "x", descriptor = "(Lclient!oh;)V", line = 924)
	void method23092(@OriginalArg(0) Class366 arg0) {
		this.aList3.add(arg0);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!oh;B)V", line = 928)
	void method23087(@OriginalArg(0) Class366 arg0) {
		this.aList3.remove(arg0);
	}

	@OriginalMember(owner = "client!eg", name = "g", descriptor = "(B)Ljava/util/List;", line = 932)
	List method23090() {
		return this.aList3;
	}

	@OriginalMember(owner = "client!eg", name = "s", descriptor = "()Ljava/util/List;", line = 932)
	List method23093() {
		return this.aList3;
	}

	@OriginalMember(owner = "client!eg", name = "l", descriptor = "(Lclient!oh;I)Z", line = 936)
	boolean method23089(@OriginalArg(0) Class366 arg0) {
		return this.aList3.contains(arg0);
	}

	@OriginalMember(owner = "client!eg", name = "u", descriptor = "(Lclient!oh;)Z", line = 936)
	boolean method23094(@OriginalArg(0) Class366 arg0) {
		return this.aList3.contains(arg0);
	}

	@OriginalMember(owner = "client!eg", name = "y", descriptor = "(Lclient!oh;)Z", line = 936)
	boolean method23095(@OriginalArg(0) Class366 arg0) {
		return this.aList3.contains(arg0);
	}

	@OriginalMember(owner = "client!eg", name = "jg", descriptor = "(Lclient!av;I)Z", line = 6104)
	static final boolean method23099(@OriginalArg(0) Class82 arg0) throws IOException {
		@Pc(3) Class62 local3 = arg0.method21621();
		@Pc(6) Class3_Sub41_Sub1 local6 = arg0.aClass3_Sub41_Sub1_2;
		if (local3 == null) {
			return false;
		}
		@Pc(87) int local87;
		if (arg0.aClass301_2 == null) {
			if (arg0.aBoolean530) {
				if (!local3.method12856(1)) {
					return false;
				}
				local3.method12848(arg0.aClass3_Sub41_Sub1_2.aByteArray51, 0, 1);
				arg0.anInt2923 += 1439883833;
				arg0.anInt2918 = 0;
				arg0.aBoolean530 = false;
			}
			local6.anInt2803 = 0;
			if (local6.method19839()) {
				if (!local3.method12856(1)) {
					return false;
				}
				local3.method12848(arg0.aClass3_Sub41_Sub1_2.aByteArray51, 1, 1);
				arg0.anInt2923 += 1439883833;
				arg0.anInt2918 = 0;
			}
			arg0.aBoolean530 = true;
			@Pc(83) Class301[] local83 = Class146.method23081();
			local87 = local6.method19832();
			if (local87 < 0 || local87 >= local83.length) {
				throw new IOException(local87 + " " + local6.anInt2803 * 62066237);
			}
			arg0.aClass301_2 = local83[local87];
			arg0.anInt2915 = arg0.aClass301_2.anInt4422 * -1116210051;
		}
		if (-64841839 * arg0.anInt2915 == -1) {
			if (!local3.method12856(1)) {
				return false;
			}
			local3.method12848(local6.aByteArray51, 0, 1);
			arg0.anInt2915 = (local6.aByteArray51[0] & 0xFF) * -109639311;
			arg0.anInt2923 += 1439883833;
			arg0.anInt2918 = 0;
		}
		if (arg0.anInt2915 * -64841839 == -2) {
			if (!local3.method12856(2)) {
				return false;
			}
			local3.method12848(local6.aByteArray51, 0, 2);
			local6.anInt2803 = 0;
			arg0.anInt2915 = local6.method20271() * -109639311;
			arg0.anInt2923 += -1415199630;
			arg0.anInt2918 = 0;
		}
		if (arg0.anInt2915 * -64841839 > 0) {
			if (!local3.method12856(arg0.anInt2915 * -64841839)) {
				return false;
			}
			local6.anInt2803 = 0;
			local3.method12848(local6.aByteArray51, 0, arg0.anInt2915 * -64841839);
			arg0.anInt2923 += arg0.anInt2915 * 661897545;
			arg0.anInt2918 = 0;
		}
		arg0.aClass301_4 = arg0.aClass301_1;
		arg0.aClass301_1 = arg0.aClass301_3;
		arg0.aClass301_3 = arg0.aClass301_2;
		@Pc(263) int local263;
		if (arg0.aClass301_2 == Class301.aClass301_157) {
			local263 = local6.method20275();
			local87 = local6.method20275();
			@Pc(273) Class3_Sub23 local273 = Class269.method25284(Class311.aClass311_112, arg0.aClass577_2);
			local273.aClass3_Sub41_Sub1_1.method20303(client.anInt3019 * 1617726299);
			local273.aClass3_Sub41_Sub1_1.method20322(local263);
			local273.aClass3_Sub41_Sub1_1.method20322(local87);
			arg0.method21601(local273);
			arg0.aClass301_2 = null;
			return true;
		}
		@Pc(307) String local307;
		if (Class301.aClass301_92 == arg0.aClass301_2) {
			local307 = local6.method20283();
			local87 = local6.method20325();
			Class351.method26588();
			Class69.method20216(local87, local307);
			arg0.aClass301_2 = null;
			return true;
		} else if (Class301.aClass301_158 == arg0.aClass301_2) {
			local263 = local6.method20275();
			local87 = local6.method20324();
			Class351.method26588();
			Class238.method24617(local87, local263);
			arg0.aClass301_2 = null;
			return true;
		} else {
			@Pc(409) int local409;
			@Pc(360) boolean local360;
			@Pc(366) String local366;
			@Pc(376) String local376;
			@Pc(381) long local381;
			@Pc(364) String local364;
			@Pc(386) long local386;
			@Pc(395) Class284 local395;
			@Pc(399) int local399;
			@Pc(407) boolean local407;
			if (Class301.aClass301_162 == arg0.aClass301_2) {
				local360 = local6.method20269() == 1;
				local364 = local6.method20283();
				local366 = local364;
				if (local360) {
					local366 = local6.method20283();
				}
				local376 = local6.method20283();
				local381 = local6.method20271();
				local386 = local6.method20273();
				local395 = (Class284) Class356.method26649(Class48.method9534(), local6.method20269());
				local399 = local6.method20271();
				@Pc(405) long local405 = local386 + (local381 << 32);
				local407 = false;
				local409 = 0;
				while (true) {
					if (local409 >= 100) {
						if (local395.aBoolean708 && Class34_Sub1.method16502(local366)) {
							local407 = true;
						}
						break;
					}
					if (local405 == client.aLongArray13[local409]) {
						local407 = true;
						break;
					}
					local409++;
				}
				if (!local407) {
					client.aLongArray13[client.anInt3162 * 474555963] = local405;
					client.anInt3162 = (client.anInt3162 * 474555963 + 1) % 100 * 1967702771;
					@Pc(458) String local458 = Class622.aClass580_2.method33211(local399).method19277(local6);
					if (local395.anInt4353 * -1668906371 == -1) {
						Class3_Sub11.method18310(20, 0, local364, local366, local364, local458, local376, local399);
					} else {
						Class3_Sub11.method18310(20, 0, Class301.method25664(local395.anInt4353 * -1668906371) + local364, Class301.method25664(local395.anInt4353 * -1668906371) + local366, local364, local458, local376, local399);
					}
				}
				arg0.aClass301_2 = null;
				return true;
			}
			@Pc(524) byte[] local524;
			if (Class301.aClass301_178 == arg0.aClass301_2) {
				local524 = new byte[arg0.anInt2915 * -64841839];
				local6.method19830(local524, 0, arg0.anInt2915 * -64841839);
				local364 = Class60_Sub7.method13289(local524, 0, arg0.anInt2915 * -64841839);
				if (client.aBoolean565) {
					try {
						Class300.aClass300_12.method25650(new Object[] { local364 });
					} catch (@Pc(556) Throwable local556) {
					}
				}
				arg0.aClass301_2 = null;
				return true;
			} else if (Class301.aClass301_110 == arg0.aClass301_2) {
				Class48_Sub2.method9541(false);
				arg0.aClass301_2 = null;
				return true;
			} else if (Class301.aClass301_121 == arg0.aClass301_2) {
				Class369.method26935(Class308.aClass308_3);
				arg0.aClass301_2 = null;
				return true;
			} else {
				@Pc(597) Class3_Sub41_Sub1 local597;
				if (Class301.aClass301_153 == arg0.aClass301_2) {
					local597 = new Class3_Sub41_Sub1(arg0.anInt2915 * -64841839);
					System.arraycopy(arg0.aClass3_Sub41_Sub1_2.aByteArray51, arg0.aClass3_Sub41_Sub1_2.anInt2803 * 62066237, local597.aByteArray51, 0, arg0.anInt2915 * -64841839);
					Class161.method23267();
					if (Class510.aClass3_Sub45_37.aClass60_Sub16_1.method13548() == 1) {
						Class30_Sub1.aClass379_1.method27252(new Class374(Class380.aClass380_5, local597));
					} else {
						client.aClass370_1.method26969(new Class374(Class380.aClass380_5, local597));
					}
					arg0.aClass301_2 = null;
					return false;
				}
				@Pc(659) int local659;
				@Pc(663) int local663;
				if (arg0.aClass301_2 == Class301.aClass301_82) {
					local263 = local6.method20310();
					local87 = local6.method20315();
					local659 = local6.method20275();
					local663 = local6.method20313();
					Class351.method26588();
					Class578.method33183(local659, local263, local663, local87);
					arg0.aClass301_2 = null;
					return true;
				} else if (arg0.aClass301_2 == Class301.aClass301_138) {
					Class302.aClass10_Sub1_1.method728();
					arg0.aClass301_2 = null;
					return false;
				} else {
					@Pc(718) int local718;
					@Pc(722) int local722;
					@Pc(726) int local726;
					@Pc(732) int local732;
					@Pc(762) int local762;
					@Pc(782) int local782;
					@Pc(1055) int local1055;
					@Pc(773) int local773;
					if (arg0.aClass301_2 == Class301.aClass301_55) {
						local263 = local6.method20317();
						local87 = local6.method20271();
						if (local87 == 65535) {
							local87 = -1;
						}
						local659 = local6.method20315();
						local663 = local6.method20269();
						local718 = local6.method20323();
						local722 = local6.method20313();
						local726 = local263 & 0x7;
						local732 = local263 >> 3 & 0xF;
						if (local732 == 15) {
							local732 = -1;
						}
						@Pc(748) boolean local748 = (local263 >> 7 & 0x1) == 1;
						@Pc(831) int local831;
						@Pc(833) int local833;
						if (local718 >> 30 == 0) {
							@Pc(938) Class520 local938;
							@Pc(955) Class440 local955;
							@Pc(1004) Class440 local1004;
							if (local718 >> 29 != 0) {
								local399 = local718 & 0xFFFF;
								@Pc(900) Class3_Sub29 local900 = (Class3_Sub29) client.aClass581_21.method33217((long) local399);
								if (local900 != null) {
									@Pc(907) Class26_Sub1_Sub1_Sub1_Sub1 local907 = (Class26_Sub1_Sub1_Sub1_Sub1) local900.anObject2;
									@Pc(912) Class384 local912 = local907.aClass384Array3[local663];
									if (local87 == 65535) {
										local87 = -1;
									}
									@Pc(919) boolean local919 = true;
									local831 = local912.anInt4716 * 1164757693;
									if (local87 != -1 && local831 != -1) {
										if (local87 == local831) {
											local938 = Class19.aClass523_14.method29823(local87);
											if (local938.aBoolean820 && -1332447219 * local938.anInt5294 != -1) {
												local955 = Class110.aClass436_1.method27999(local938.anInt5294 * -1332447219);
												@Pc(960) int local960 = local955.anInt4928 * -413041149;
												if (local960 == 0 || local960 == 2) {
													local919 = false;
												} else if (local960 == 1) {
													local919 = true;
												}
											}
										} else {
											local938 = Class19.aClass523_14.method29823(local87);
											@Pc(984) Class520 local984 = Class19.aClass523_14.method29823(local831);
											if (-1332447219 * local938.anInt5294 != -1 && local984.anInt5294 * -1332447219 != -1) {
												local1004 = Class110.aClass436_1.method27999(local938.anInt5294 * -1332447219);
												@Pc(1012) Class440 local1012 = Class110.aClass436_1.method27999(local984.anInt5294 * -1332447219);
												if (local1004.anInt4932 * -2127032365 < local1012.anInt4932 * -2127032365) {
													local919 = false;
												}
											}
										}
									}
									if (local919) {
										local912.anInt4716 = local87 * 1212547221;
										local912.anInt4717 = local659 * 627330035;
										local912.anInt4715 = local732 * -2109652173;
										if (local87 == -1) {
											local912.aClass71_7.method20038(-1);
										} else {
											local938 = Class19.aClass523_14.method29823(local87);
											local1055 = local938.aBoolean820 ? 0 : 2;
											if (local748) {
												local1055 = 1;
											}
											local912.aClass71_7.method20030(local938.anInt5294 * -1332447219, local722, local1055, false);
										}
									}
								}
							} else if (local718 >> 28 != 0) {
								local399 = local718 & 0xFFFF;
								@Pc(1093) Class26_Sub1_Sub1_Sub1_Sub2 local1093;
								if (client.anInt3115 * 2077649275 == local399) {
									local1093 = Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3;
								} else {
									local1093 = client.aClass26_Sub1_Sub1_Sub1_Sub2Array1[local399];
								}
								if (local1093 != null) {
									@Pc(1105) Class384 local1105 = local1093.aClass384Array3[local663];
									if (local87 == 65535) {
										local87 = -1;
									}
									local407 = true;
									local409 = local1105.anInt4716 * 1164757693;
									@Pc(1131) Class520 local1131;
									if (local87 != -1 && local409 != -1) {
										if (local409 == local87) {
											local1131 = Class19.aClass523_14.method29823(local87);
											if (local1131.aBoolean820 && local1131.anInt5294 * -1332447219 != -1) {
												@Pc(1148) Class440 local1148 = Class110.aClass436_1.method27999(local1131.anInt5294 * -1332447219);
												local1055 = local1148.anInt4928 * -413041149;
												if (local1055 == 0 || local1055 == 2) {
													local407 = false;
												} else if (local1055 == 1) {
													local407 = true;
												}
											}
										} else {
											local1131 = Class19.aClass523_14.method29823(local87);
											local938 = Class19.aClass523_14.method29823(local409);
											if (local1131.anInt5294 * -1332447219 != -1 && local938.anInt5294 * -1332447219 != -1) {
												local955 = Class110.aClass436_1.method27999(local1131.anInt5294 * -1332447219);
												local1004 = Class110.aClass436_1.method27999(local938.anInt5294 * -1332447219);
												if (local955.anInt4932 * -2127032365 < local1004.anInt4932 * -2127032365) {
													local407 = false;
												}
											}
										}
									}
									if (local407) {
										local1105.anInt4716 = local87 * 1212547221;
										local1105.anInt4717 = local659 * 627330035;
										local1105.anInt4715 = local732 * -2109652173;
										local1105.anInt4718 = local726 * -579705385;
										if (local87 == -1) {
											local1105.aClass71_7.method20038(-1);
										} else {
											local1131 = Class19.aClass523_14.method29823(local87);
											local833 = local1131.aBoolean820 ? 0 : 2;
											if (local748) {
												local833 = 1;
											}
											local1105.aClass71_7.method20030(local1131.anInt5294 * -1332447219, local722, local833, false);
										}
									}
								}
							}
						} else {
							@Pc(756) Class464 local756 = client.aClass370_1.method26942();
							local762 = local718 >> 28 & 0x3;
							local773 = (local718 >> 14 & 0x3FFF) - local756.anInt5071 * -1567811631;
							local782 = (local718 & 0x3FFF) - local756.anInt5073 * 1360175441;
							if (local773 >= 0 && local782 >= 0 && local773 < client.aClass370_1.method26943() && local782 < client.aClass370_1.method27062()) {
								if (local87 == -1) {
									@Pc(809) Class3_Sub1_Sub16 local809 = (Class3_Sub1_Sub16) client.aClass581_18.method33217((long) (local773 << 16 | local782));
									if (local809 != null) {
										local809.aClass26_Sub1_Sub1_Sub4_1.method20597();
										local809.method33656();
									}
								} else {
									local409 = local773 * 512 + 256;
									local831 = local782 * 512 + 256;
									local833 = local762;
									if (local762 < 3 && client.aClass370_1.method27075().method26504(local773, local782)) {
										local833 = local762 + 1;
									}
									@Pc(872) Class26_Sub1_Sub1_Sub4 local872 = new Class26_Sub1_Sub1_Sub4(client.aClass370_1.method26950(), local87, local722, local762, local833, local409, Class186.method23926(local409, local831, local762) - local659, local831, local773, local773, local782, local782, local726, local748, 0);
									client.aClass581_18.method33241(new Class3_Sub1_Sub16(local872), (long) (local773 << 16 | local782));
								}
							}
						}
						arg0.aClass301_2 = null;
						return true;
					} else if (Class301.aClass301_83 == arg0.aClass301_2) {
						local263 = local6.method20271();
						Class510.aClass183_1.method23606(local263);
						arg0.aClass301_2 = null;
						return true;
					} else if (Class301.aClass301_170 == arg0.aClass301_2) {
						if (Class13_Sub21.aClass10_1 == null) {
							Class13_Sub21.aClass10_1 = new Class10(Class69.aClass70_Sub1_Sub2_9);
						}
						@Pc(1314) Class304 local1314 = Class69.aClass70_Sub1_Sub2_9.method14716(local6);
						Class13_Sub21.aClass10_1.anInterface58_2.method33310(local1314.anInt4428 * 1628864065, local1314.anObject17);
						client.anIntArray315[(client.anInt3146 += -100887975) * 1868142057 - 1 & 0x1F] = local1314.anInt4428 * 1628864065;
						arg0.aClass301_2 = null;
						return true;
					} else if (Class301.aClass301_147 == arg0.aClass301_2) {
						local263 = local6.method20269();
						local87 = local6.method20275();
						local659 = local6.method20315();
						local663 = local6.method20313();
						Class351.method26588();
						Class30_Sub2.method16474(local87, local263, local659, local663);
						arg0.aClass301_2 = null;
						return true;
					} else {
						@Pc(1402) long local1402;
						@Pc(1416) Class284 local1416;
						@Pc(1426) long local1426;
						@Pc(1428) boolean local1428;
						@Pc(1493) String local1493;
						if (arg0.aClass301_2 == Class301.aClass301_38) {
							local360 = local6.method20269() == 1;
							local364 = local6.method20283();
							local1402 = local6.method20271();
							local381 = local6.method20273();
							local1416 = (Class284) Class356.method26649(Class48.method9534(), local6.method20269());
							local732 = local6.method20271();
							local1426 = (local1402 << 32) + local381;
							local1428 = false;
							@Pc(1436) Class3_Sub30 local1436 = local360 ? Class68.aClass3_Sub30_2 : Class14_Sub5.aClass3_Sub30_1;
							if (local1436 == null) {
								local1428 = true;
							} else {
								local782 = 0;
								while (true) {
									if (local782 >= 100) {
										if (local1416.aBoolean708 && Class34_Sub1.method16502(local364)) {
											local1428 = true;
										}
										break;
									}
									if (client.aLongArray13[local782] == local1426) {
										local1428 = true;
										break;
									}
									local782++;
								}
							}
							if (!local1428) {
								client.aLongArray13[client.anInt3162 * 474555963] = local1426;
								client.anInt3162 = (client.anInt3162 * 474555963 + 1) % 100 * 1967702771;
								local1493 = Class622.aClass580_2.method33211(local732).method19277(local6);
								local409 = local360 ? 42 : 45;
								if (local1416.anInt4353 * -1668906371 == -1) {
									Class3_Sub11.method18310(local409, 0, local364, local364, local364, local1493, local1436.aString47, local732);
								} else {
									Class3_Sub11.method18310(local409, 0, Class301.method25664(local1416.anInt4353 * -1668906371) + local364, Class301.method25664(local1416.anInt4353 * -1668906371) + local364, local364, local1493, local1436.aString47, local732);
								}
							}
							arg0.aClass301_2 = null;
							return true;
						} else if (Class301.aClass301_69 == arg0.aClass301_2) {
							client.anInt3150 = client.anInt3138 * 695974381;
							local360 = local6.method20269() == 1;
							if (arg0.anInt2915 * -64841839 != 1) {
								if (local360) {
									Class68.aClass3_Sub30_2 = new Class3_Sub30(local6);
								} else {
									Class14_Sub5.aClass3_Sub30_1 = new Class3_Sub30(local6);
								}
								arg0.aClass301_2 = null;
								return true;
							}
							if (local360) {
								Class68.aClass3_Sub30_2 = null;
							} else {
								Class14_Sub5.aClass3_Sub30_1 = null;
							}
							arg0.aClass301_2 = null;
							return true;
						} else {
							@Pc(1644) boolean local1644;
							@Pc(1670) String local1670;
							if (Class301.aClass301_108 == arg0.aClass301_2) {
								if (Class552.aBoolean823 && Class350.aFrame3 != null) {
									Class157.method23193(Class510.aClass3_Sub45_37.aClass60_Sub11_1.method13403(), -1, -1, false);
								}
								local524 = new byte[arg0.anInt2915 * -64841839 - 1];
								local1644 = local6.method20269() == 1;
								local6.method19830(local524, 0, arg0.anInt2915 * -64841839 - 1);
								@Pc(1660) Class3_Sub41 local1660 = new Class3_Sub41(local524);
								local376 = local1660.method20283();
								if (local1644) {
									local1670 = local1660.method20283();
									if (local1670.length() == 0) {
										local1670 = local376;
									}
									if (!client.aBoolean565 || Class344.aString208.startsWith("mac") || !Class361.method26768(local376, 1, Class300.aClass300_11.method25639())) {
										Class485.method29178(local1670, true, client.aBoolean569);
									}
								} else {
									Class485.method29178(local376, true, client.aBoolean569);
								}
								arg0.aClass301_2 = null;
								return true;
							} else if (Class301.aClass301_72 == arg0.aClass301_2) {
								Class530.anInt5308 = (local6.method20309() << 3) * 1525822837;
								Class523.anInt5297 = local6.method20310() * -1789954663;
								Class242.anInt3777 = (local6.method20390() << 3) * 1827897803;
								arg0.aClass301_2 = null;
								return true;
							} else if (Class301.aClass301_42 == arg0.aClass301_2) {
								local360 = local6.method20310() == 1;
								local87 = local6.method20325();
								Class351.method26588();
								Class3_Sub1_Sub4.method18906(local87, local360);
								arg0.aClass301_2 = null;
								return true;
							} else if (arg0.aClass301_2 == Class301.aClass301_39) {
								local263 = local6.method20275();
								local87 = local6.method20317();
								Class490.aClass494_1.method29302(local87);
								local659 = local6.method20310();
								Class424.aClass165_1.aClass477Array1[local87].method28801(local263);
								Class424.aClass165_1.aClass477Array1[local87].method28805(local659);
								client.anIntArray314[(client.anInt3160 += -1724227233) * 2115123871 - 1 & 0x1F] = local87;
								arg0.aClass301_2 = null;
								return true;
							} else if (Class301.aClass301_152 == arg0.aClass301_2) {
								local263 = local6.method20275();
								Class351.method26588();
								Class3_Sub14.method11266(local263, 5, client.anInt3115 * 2077649275, 0);
								arg0.aClass301_2 = null;
								return true;
							} else if (arg0.aClass301_2 == Class301.aClass301_28) {
								local360 = local6.method20269() == 1;
								local87 = local6.method20325();
								Class351.method26588();
								Class571.method33069(local87, local360);
								arg0.aClass301_2 = null;
								return true;
							} else if (Class301.aClass301_163 == arg0.aClass301_2) {
								local263 = local6.method20324();
								local87 = local6.method20324();
								Class351.method26588();
								@Pc(1893) Class3_Sub42 local1893 = (Class3_Sub42) client.aClass581_22.method33217((long) local263);
								@Pc(1899) Class3_Sub42 local1899 = (Class3_Sub42) client.aClass581_22.method33217((long) local87);
								if (local1899 != null) {
									Class490.method29244(local1899, local1893 == null || local1893.anInt2796 * 1705574607 != local1899.anInt2796 * 1705574607, false);
								}
								if (local1893 != null) {
									local1893.method33656();
									client.aClass581_22.method33241(local1893, (long) local87);
								}
								@Pc(1934) Class178 local1934 = Class375.method27235(local263);
								if (local1934 != null) {
									Class223.method24442(local1934);
								}
								local1934 = Class375.method27235(local87);
								if (local1934 != null) {
									Class223.method24442(local1934);
									Class109.method21948(Class178.aClass186Array1[local1934.anInt3570 * 954808515 >>> 16], local1934, true);
								}
								if (-1579500007 * client.anInt3125 != -1) {
									Class60_Sub15.method13525(client.anInt3125 * -1579500007, 1);
								}
								arg0.aClass301_2 = null;
								return true;
							} else if (Class301.aClass301_131 == arg0.aClass301_2) {
								local263 = local6.method20324();
								local87 = local6.method20314();
								Class351.method26588();
								Class25.method6479(local87, local263);
								arg0.aClass301_2 = null;
								return true;
							} else if (Class301.aClass301_26 == arg0.aClass301_2) {
								local360 = local6.method20269() == 1;
								@Pc(2022) byte[] local2022 = new byte[arg0.anInt2915 * -64841839 - 1];
								local6.method20286(local2022, 0, arg0.anInt2915 * -64841839 - 1);
								Class356.method26651(local360, local2022);
								arg0.aClass301_2 = null;
								return true;
							} else if (Class301.aClass301_87 == arg0.aClass301_2) {
								Class357.anInt4639 = local6.method20274() * -61078775;
								client.aBoolean591 = local6.method20269() == 1;
								arg0.aClass301_2 = null;
								return true;
							} else if (Class301.aClass301_130 == arg0.aClass301_2) {
								Class369.method26935(Class308.aClass308_10);
								arg0.aClass301_2 = null;
								return true;
							} else if (Class301.aClass301_54 == arg0.aClass301_2) {
								local263 = local6.method20275();
								local87 = local6.method20314();
								Class351.method26588();
								Class212.method24255(local263, local87);
								arg0.aClass301_2 = null;
								return true;
							} else if (arg0.aClass301_2 == Class301.aClass301_146) {
								client.anInt3038 = local6.method20272() * 652442925;
								arg0.aClass301_2 = null;
								return true;
							} else if (Class301.aClass301_154 == arg0.aClass301_2) {
								local263 = local6.method20315();
								local364 = local6.method20283();
								Class351.method26588();
								Class296.method25576(local263, local364);
								arg0.aClass301_2 = null;
								return true;
							} else if (arg0.aClass301_2 == Class301.aClass301_125) {
								local263 = local6.method20271();
								local87 = local6.method20324();
								local659 = local6.method20313();
								local663 = local6.method20314();
								Class351.method26588();
								Class412.method27706(local87, local663, local659, local263);
								arg0.aClass301_2 = null;
								return true;
							} else {
								@Pc(2183) byte local2183;
								if (Class301.aClass301_58 == arg0.aClass301_2) {
									local2183 = local6.method20390();
									Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.method16730(local6, local2183);
									arg0.aClass301_2 = null;
									return true;
								} else if (Class301.aClass301_78 == arg0.aClass301_2) {
									local6.method20271();
									local6.method20269();
									local6.method20283();
									arg0.aClass301_2 = null;
									return true;
								} else if (Class301.aClass301_171 == arg0.aClass301_2) {
									@Pc(2222) Class518 local2222 = new Class518();
									local1644 = local2222.method29691(local6);
									client.aClass370_1.method26953().method28869(client.aClass370_1, local1644 ? local2222 : null, local2222.method29698());
									arg0.aClass301_2 = null;
									return true;
								} else if (arg0.aClass301_2 == Class301.aClass301_77) {
									local263 = local6.method20275();
									local87 = local6.method20323();
									local659 = local6.method20310();
									local663 = local6.method20269();
									local718 = local6.method20304();
									local722 = local87 >> 28;
									local726 = local87 >> 14 & 0x3FFF;
									local732 = local87 & 0x3FFF;
									Class510.aClass183_1.method23675(local263, local718, true, local722, local726 << 9, local732 << 9, local663 << 9, local659 << 9);
									arg0.aClass301_2 = null;
									return true;
								} else if (arg0.aClass301_2 == Class301.aClass301_49) {
									local360 = local6.method20269() == 1;
									if (local360) {
										Class375.method27232(3);
									} else {
										Class375.method27232(5);
									}
									arg0.aClass301_2 = null;
									return true;
								} else if (Class301.aClass301_60 == arg0.aClass301_2) {
									local263 = local6.method20271();
									client.anInt3066 = 1566474149;
									client.anInt3064 = local263 * 741970315;
									client.anInt3065 = 0;
									Class329.aClass359_60.method26674(client.anInt3064 * 1358073379);
									Class604.method33533();
									Class463.method28610();
									local87 = local6.method20271();
									client.anInt3068 = local87 * 1206325971;
									local659 = local6.method20269();
									Class223.aClass3_Sub41_17 = new Class3_Sub41(local659);
									Class223.aClass3_Sub41_17.method20248(local6.aByteArray51, local6.anInt2803 * 62066237, local659);
									local6.anInt2803 += local659 * -918980331;
									arg0.aClass301_2 = null;
									return false;
								} else if (arg0.aClass301_2 == Class301.aClass301_47) {
									Class13_Sub22.aClass566_1 = Class378.method27245(local6.method20269());
									arg0.aClass301_2 = null;
									return true;
								} else {
									@Pc(2453) boolean local2453;
									@Pc(2534) String local2534;
									@Pc(2568) int local2568;
									@Pc(2434) boolean local2434;
									if (arg0.aClass301_2 == Class301.aClass301_159) {
										local307 = local6.method20283();
										local2434 = local6.method20269() == 1;
										if (local2434) {
											local364 = local6.method20283();
										} else {
											local364 = local307;
										}
										local663 = local6.method20271();
										@Pc(2451) byte local2451 = local6.method20390();
										local2453 = false;
										if (local2451 == -128) {
											local2453 = true;
										}
										if (local2453) {
											if (Class21_Sub1.anInt288 * 906110417 == 0) {
												arg0.aClass301_2 = null;
												return true;
											}
											for (local726 = 0; local726 < Class21_Sub1.anInt288 * 906110417 && (!Class43_Sub2.aClass79Array1[local726].aString131.equals(local364) || Class43_Sub2.aClass79Array1[local726].anInt2911 * -1097692209 != local663); local726++) {
											}
											if (local726 < Class21_Sub1.anInt288 * 906110417) {
												while (local726 < Class21_Sub1.anInt288 * 906110417 - 1) {
													Class43_Sub2.aClass79Array1[local726] = Class43_Sub2.aClass79Array1[local726 + 1];
													local726++;
												}
												Class21_Sub1.anInt288 -= -1827384527;
												Class43_Sub2.aClass79Array1[Class21_Sub1.anInt288 * 906110417] = null;
											}
										} else {
											local2534 = local6.method20283();
											@Pc(2538) Class79 local2538 = new Class79();
											local2538.aString130 = local307;
											local2538.aString131 = local364;
											local2538.aString129 = Class65_Sub1.method13183(local2538.aString131, Class141.aClass623_1);
											local2538.anInt2911 = local663 * 1391369007;
											local2538.aByte104 = local2451;
											local2538.aString132 = local2534;
											for (local2568 = Class21_Sub1.anInt288 * 906110417 - 1; local2568 >= 0; local2568--) {
												local399 = Class43_Sub2.aClass79Array1[local2568].aString129.compareTo(local2538.aString129);
												if (local399 == 0) {
													Class43_Sub2.aClass79Array1[local2568].anInt2911 = local663 * 1391369007;
													Class43_Sub2.aClass79Array1[local2568].aByte104 = local2451;
													Class43_Sub2.aClass79Array1[local2568].aString132 = local2534;
													if (local364.equals(Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aString75)) {
														Class206.aByte128 = local2451;
													}
													client.anInt3148 = client.anInt3138 * 1773874355;
													arg0.aClass301_2 = null;
													return true;
												}
												if (local399 < 0) {
													break;
												}
											}
											if (Class21_Sub1.anInt288 * 906110417 >= Class43_Sub2.aClass79Array1.length) {
												arg0.aClass301_2 = null;
												return true;
											}
											for (local399 = Class21_Sub1.anInt288 * 906110417 - 1; local399 > local2568; local399--) {
												Class43_Sub2.aClass79Array1[local399 + 1] = Class43_Sub2.aClass79Array1[local399];
											}
											if (Class21_Sub1.anInt288 * 906110417 == 0) {
												Class43_Sub2.aClass79Array1 = new Class79[100];
											}
											Class43_Sub2.aClass79Array1[local2568 + 1] = local2538;
											Class21_Sub1.anInt288 += -1827384527;
											if (local364.equals(Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aString75)) {
												Class206.aByte128 = local2451;
											}
										}
										client.anInt3148 = client.anInt3138 * 1773874355;
										arg0.aClass301_2 = null;
										return true;
									} else if (arg0.aClass301_2 == Class301.aClass301_98) {
										Class369.method26935(Class308.aClass308_14);
										arg0.aClass301_2 = null;
										return true;
									} else if (arg0.aClass301_2 == Class301.aClass301_135) {
										Class355.method26638(local6.method20283());
										arg0.aClass301_2 = null;
										return true;
									} else if (Class301.aClass301_126 == arg0.aClass301_2) {
										Class3_Sub31.aString48 = arg0.anInt2915 * -64841839 > 2 ? local6.method20283() : Class601.aClass601_157.method33512(Class469.aClass530_2);
										client.anInt3118 = (-64841839 * arg0.anInt2915 > 0 ? local6.method20271() : -1) * -1799657885;
										if (client.anInt3118 * -409056437 == 65535) {
											client.anInt3118 = 1799657885;
										}
										arg0.aClass301_2 = null;
										return true;
									} else if (Class301.aClass301_76 == arg0.aClass301_2) {
										local263 = local6.method20313();
										local87 = local6.method20323();
										Class424.aClass165_1.aClass460_1.method28565(Class429.aClass70_Sub1_Sub1_2.method14717(local263), local87);
										arg0.aClass301_2 = null;
										return true;
									} else if (Class301.aClass301_29 == arg0.aClass301_2) {
										local263 = local6.method20271();
										if (local263 == 65535) {
											local263 = -1;
										}
										local87 = local6.method20269();
										local659 = local6.method20271();
										local663 = local6.method20269();
										local718 = local6.method20271();
										Class510.aClass183_1.method23589(Class160.aClass160_10, local263, local87, local663, Class141.aClass141_3.method23024(), Class158.aClass158_1, 0.0F, 0.0F, null, 0, local718, local659);
										arg0.aClass301_2 = null;
										return true;
									} else if (Class301.aClass301_70 == arg0.aClass301_2) {
										local263 = local6.method20313();
										local87 = local6.method20315();
										Class351.method26588();
										if (Class72.anInt2086 * 81180077 != 3) {
											Class80.method21596(local263, local87, 0);
										} else if (Class80.aClass23_Sub1_1.method5887() == Class204.aClass204_3) {
											@Pc(2859) Class30_Sub3 local2859 = (Class30_Sub3) Class80.aClass23_Sub1_1.method5827();
											@Pc(2863) Class335 local2863 = new Class335();
											@Pc(2867) Class335 local2867 = new Class335();
											local2863.method26365(0.0F, 1.0F, 0.0F, (float) (2.0D * 3.141592653589793D * (double) local87 / 16384.0D));
											@Pc(2888) Class320 local2888 = new Class320(1.0F, 0.0F, 0.0F);
											local2888.method25889(local2863);
											local2888.method25870();
											local2867.method26301(local2888, (float) ((double) local263 * 3.141592653589793D * 2.0D / 16384.0D));
											local2863.method26312(local2867);
											local2859.aClass335_2.method26315(local2863);
											client.aBoolean586 = true;
										}
										arg0.aClass301_2 = null;
										return true;
									} else if (arg0.aClass301_2 == Class301.aClass301_142) {
										local263 = local6.method20315();
										Class351.method26588();
										Class10.method717(local263);
										arg0.aClass301_2 = null;
										return true;
									} else if (arg0.aClass301_2 == Class301.aClass301_9) {
										local263 = local6.method20323();
										local87 = local6.method20324();
										Class351.method26588();
										Class3_Sub14.method11266(local263, 2, local87, -1);
										arg0.aClass301_2 = null;
										return true;
									} else if (Class301.aClass301_21 == arg0.aClass301_2) {
										local263 = local6.method20271();
										local87 = local6.method20269();
										local2434 = (local87 & 0x1) == 1;
										Class77.method21571(local263, local2434);
										local663 = local6.method20271();
										for (local718 = 0; local718 < local663; local718++) {
											local722 = local6.method20314();
											local726 = local6.method20317();
											if (local726 == 255) {
												local726 = local6.method20275();
											}
											Class286.method25482(local263, local718, local722 - 1, local726, local2434);
										}
										client.anIntArray313[(client.anInt3142 += -1142786477) * 742473179 - 1 & 0x1F] = local263;
										arg0.aClass301_2 = null;
										return true;
									} else if (Class301.aClass301_119 == arg0.aClass301_2) {
										Class369.method26935(Class308.aClass308_7);
										arg0.aClass301_2 = null;
										return true;
									} else if (Class301.aClass301_168 == arg0.aClass301_2) {
										local360 = local6.method20310() == 1;
										Class351.method26588();
										Class338.aBoolean719 = local360;
										arg0.aClass301_2 = null;
										return true;
									} else if (Class301.aClass301_71 == arg0.aClass301_2) {
										local307 = local6.method20283();
										local87 = local6.method20271();
										local366 = Class622.aClass580_2.method33211(local87).method19277(local6);
										Class3_Sub11.method18310(19, 0, local307, local307, local307, local366, null, local87);
										arg0.aClass301_2 = null;
										return true;
									} else if (Class301.aClass301_179 == arg0.aClass301_2) {
										local263 = local6.method20275();
										local87 = local6.method20275();
										local659 = local6.method20275();
										local663 = local6.method20325();
										local718 = local6.method20275();
										local722 = local6.method20304();
										local726 = local6.method20271();
										local732 = local6.method20313();
										Class351.method26588();
										Class492.method29290(local263, new Class3_Sub42_Sub4(local726, local722, local732), new int[] { local663, local659, local87, local718 }, false);
										arg0.aClass301_2 = null;
										return true;
									} else if (arg0.aClass301_2 == Class301.aClass301_161) {
										Class510.aClass183_1.method23580(Class141.aClass141_2.method23024());
										arg0.aClass301_2 = null;
										return true;
									} else if (Class301.aClass301_105 == arg0.aClass301_2) {
										local263 = local6.method20325();
										Class351.method26588();
										Class3_Sub14.method11266(local263, 3, client.anInt3115 * 2077649275, 0);
										arg0.aClass301_2 = null;
										return true;
									} else if (Class301.aClass301_48 == arg0.aClass301_2) {
										local263 = local6.method20271();
										local87 = local6.method20271();
										local659 = local6.method20271();
										Class351.method26588();
										if (Class178.aClass186Array1[local263] != null) {
											for (local663 = local87; local663 < local659; local663++) {
												local718 = local6.method20273();
												if (local663 < Class178.aClass186Array1[local263].aClass178Array8.length && Class178.aClass186Array1[local263].aClass178Array8[local663] != null) {
													Class178.aClass186Array1[local263].aClass178Array8[local663].anInt3555 = local718 * 1177016961;
												}
											}
										}
										arg0.aClass301_2 = null;
										return true;
									} else if (Class301.aClass301_151 == arg0.aClass301_2) {
										Class510.aClass183_1.method23599();
										arg0.aClass301_2 = null;
										return true;
									} else if (arg0.aClass301_2 == Class301.aClass301_109) {
										local263 = local6.method20271();
										Class13_Sub8.method6238(local263);
										arg0.aClass301_2 = null;
										return true;
									} else if (arg0.aClass301_2 == Class301.aClass301_53) {
										Class369.method26935(Class308.aClass308_15);
										arg0.aClass301_2 = null;
										return true;
									} else if (Class301.aClass301_59 == arg0.aClass301_2) {
										Class13_Sub21.aClass10_1 = null;
										arg0.aClass301_2 = null;
										return true;
									} else if (Class301.aClass301_94 == arg0.aClass301_2) {
										local263 = local6.method20324();
										Class351.method26588();
										if (local263 == -1) {
											Class449.anInt5013 = 2127832081;
											Class47.anInt1011 = -1801069635;
										} else {
											@Pc(3369) Class464 local3369 = client.aClass370_1.method26942();
											local659 = local263 >> 14 & 0x3FFF;
											local663 = local263 & 0x3FFF;
											local659 -= local3369.anInt5071 * -1567811631;
											if (local659 < 0) {
												local659 = 0;
											} else if (local659 >= client.aClass370_1.method26943()) {
												local659 = client.aClass370_1.method26943();
											}
											local663 -= local3369.anInt5073 * 1360175441;
											if (local663 < 0) {
												local663 = 0;
											} else if (local663 >= client.aClass370_1.method27062()) {
												local663 = client.aClass370_1.method27062();
											}
											Class449.anInt5013 = ((local659 << 9) + 256) * -2127832081;
											Class47.anInt1011 = ((local663 << 9) + 256) * 1801069635;
										}
										arg0.aClass301_2 = null;
										return true;
									} else {
										@Pc(3496) long local3496;
										@Pc(3498) boolean local3498;
										@Pc(3472) long local3472;
										@Pc(3477) long local3477;
										@Pc(3486) Class284 local3486;
										if (arg0.aClass301_2 == Class301.aClass301_149) {
											local360 = local6.method20269() == 1;
											local364 = local6.method20283();
											local366 = local364;
											if (local360) {
												local366 = local6.method20283();
											}
											local3472 = local6.method20271();
											local3477 = local6.method20273();
											local3486 = (Class284) Class356.method26649(Class48.method9534(), local6.method20269());
											local2568 = local6.method20271();
											local3496 = (local3472 << 32) + local3477;
											local3498 = false;
											local782 = 0;
											while (true) {
												if (local782 >= 100) {
													if (local3486.aBoolean708 && Class34_Sub1.method16502(local366)) {
														local3498 = true;
													}
													break;
												}
												if (client.aLongArray13[local782] == local3496) {
													local3498 = true;
													break;
												}
												local782++;
											}
											if (!local3498) {
												client.aLongArray13[client.anInt3162 * 474555963] = local3496;
												client.anInt3162 = (client.anInt3162 * 474555963 + 1) % 100 * 1967702771;
												local1493 = Class622.aClass580_2.method33211(local2568).method19277(local6);
												if (local3486.anInt4353 * -1668906371 == -1) {
													Class3_Sub11.method18310(18, 0, local364, local366, local364, local1493, null, local2568);
												} else {
													Class3_Sub11.method18310(18, 0, Class301.method25664(local3486.anInt4353 * -1668906371) + local364, Class301.method25664(local3486.anInt4353 * -1668906371) + local366, local364, local1493, null, local2568);
												}
											}
											arg0.aClass301_2 = null;
											return true;
										} else if (Class301.aClass301_156 == arg0.aClass301_2) {
											local263 = local6.method20271();
											Class510.aClass183_1.method23575(local263);
											arg0.aClass301_2 = null;
											return true;
										} else if (Class301.aClass301_27 == arg0.aClass301_2) {
											Class13_Sub21.aClass10_1 = new Class10(Class69.aClass70_Sub1_Sub2_9);
											arg0.aClass301_2 = null;
											return true;
										} else if (Class301.aClass301_155 == arg0.aClass301_2) {
											local307 = local6.method20283();
											Class339.method26424(local307, false, false);
											arg0.aClass301_2 = null;
											return true;
										} else if (arg0.aClass301_2 == Class301.aClass301_143) {
											Class424.aClass165_1.aClass460_1.method28564();
											client.anInt3141 += -1334106272;
											arg0.aClass301_2 = null;
											return true;
										} else if (arg0.aClass301_2 == Class301.aClass301_15) {
											local263 = local6.method20323();
											local87 = local6.method20275();
											Class351.method26588();
											Class60_Sub32.method14024(local87, local263);
											arg0.aClass301_2 = null;
											return true;
										} else if (Class301.aClass301_114 == arg0.aClass301_2) {
											client.anInt3186 = local6.method20317() * 910210619;
											client.anInt3126 = local6.method20304() * -1933606323;
											arg0.aClass301_2 = null;
											return true;
										} else if (arg0.aClass301_2 == Class301.aClass301_67) {
											Class394.method27445(false);
											arg0.aClass301_2 = null;
											return false;
										} else if (Class301.aClass301_160 == arg0.aClass301_2) {
											local263 = local6.method20324();
											local87 = local6.method20315();
											Class351.method26588();
											Class471.method28772(local263, local87);
											arg0.aClass301_2 = null;
											return true;
										} else if (Class301.aClass301_37 == arg0.aClass301_2) {
											client.anInt3094 = local6.method20272() * -1887431293;
											client.anInt3152 = client.anInt3138 * -218385621;
											arg0.aClass301_2 = null;
											return true;
										} else if (arg0.aClass301_2 == Class301.aClass301_45) {
											Class369.method26935(Class308.aClass308_5);
											arg0.aClass301_2 = null;
											return true;
										} else if (Class301.aClass301_93 == arg0.aClass301_2) {
											local263 = local6.method20323();
											local87 = local6.method20324();
											Class351.method26588();
											Class158.method23200(local87, local263);
											arg0.aClass301_2 = null;
											return true;
										} else if (Class301.aClass301_73 == arg0.aClass301_2) {
											Class13_Sub19.method7198(local6, arg0.anInt2915 * -64841839);
											arg0.aClass301_2 = null;
											return true;
										} else if (arg0.aClass301_2 == Class301.aClass301_124) {
											local263 = local6.method20310();
											local87 = local6.method20314();
											Class424.aClass165_1.aClass460_1.method28568(Class308.aClass70_Sub2_3.method33886(local87), local263);
											arg0.aClass301_2 = null;
											return true;
										} else if (Class301.aClass301_174 == arg0.aClass301_2) {
											local263 = local6.method20317();
											local87 = local263 >> 2;
											local659 = local263 & 0x3;
											local663 = local6.method20325();
											local718 = local6.method20275();
											local722 = local6.method20324();
											local726 = local6.method20315();
											local732 = local6.method20325();
											local2568 = local6.method20323();
											local399 = local6.method20275();
											local762 = local6.method20317();
											@Pc(3904) Class464 local3904 = new Class464(local6.method20275());
											Class351.method26588();
											Class492.method29290(local2568, new Class3_Sub42_Sub3(local726, local762, new Class537(local3904, local87, local659, local722)), new int[] { local732, local399, local663, local718 }, false);
											arg0.aClass301_2 = null;
											return true;
										} else {
											@Pc(4016) Class3_Sub38 local4016;
											@Pc(3998) Class3_Sub38 local3998;
											if (arg0.aClass301_2 == Class301.aClass301_30) {
												local263 = local6.method20271();
												if (local263 == 65535) {
													local263 = -1;
												}
												local87 = local6.method20325();
												local659 = local6.method20313();
												if (local659 == 65535) {
													local659 = -1;
												}
												local663 = local6.method20325();
												Class351.method26588();
												for (local718 = local659; local718 <= local263; local718++) {
													local3477 = ((long) local663 << 32) + (long) local718;
													local3998 = (Class3_Sub38) client.aClass581_20.method33217(local3477);
													if (local3998 != null) {
														local4016 = new Class3_Sub38(local87, local3998.anInt1354 * -1720854183);
														local3998.method33656();
													} else if (local718 == -1) {
														local4016 = new Class3_Sub38(local87, Class375.method27235(local663).aClass3_Sub38_2.anInt1354 * -1720854183);
													} else {
														local4016 = new Class3_Sub38(local87, -1);
													}
													client.aClass581_20.method33241(local4016, local3477);
												}
												arg0.aClass301_2 = null;
												return true;
											}
											@Pc(4078) boolean local4078;
											if (arg0.aClass301_2 == Class301.aClass301_97) {
												local360 = local6.method20269() == 1;
												@Pc(4065) long local4065 = (long) local6.method20271();
												local3472 = local6.method20273();
												local3477 = local3472 + (local4065 << 32);
												local4078 = false;
												@Pc(4084) Class3_Sub30 local4084 = local360 ? Class68.aClass3_Sub30_2 : Class14_Sub5.aClass3_Sub30_1;
												if (local4084 == null) {
													local4078 = true;
												} else {
													for (local399 = 0; local399 < 100; local399++) {
														if (local3477 == client.aLongArray13[local399]) {
															local4078 = true;
															break;
														}
													}
												}
												if (!local4078) {
													client.aLongArray13[client.anInt3162 * 474555963] = local3477;
													client.anInt3162 = (client.anInt3162 * 474555963 + 1) % 100 * 1967702771;
													@Pc(4128) String local4128 = Class491.method29258(local6);
													local762 = local360 ? 43 : 46;
													Class3_Sub11.method18310(local762, 0, "", "", "", local4128, local4084.aString47, -1);
												}
												arg0.aClass301_2 = null;
												return true;
											}
											@Pc(4329) boolean local4329;
											if (arg0.aClass301_2 == Class301.aClass301_167) {
												client.anInt3148 = client.anInt3138 * 1773874355;
												if (arg0.anInt2915 * -64841839 == 0) {
													client.aString151 = null;
													client.aString154 = null;
													Class21_Sub1.anInt288 = 0;
													Class43_Sub2.aClass79Array1 = null;
													arg0.aClass301_2 = null;
													return true;
												}
												client.aString154 = local6.method20283();
												local360 = local6.method20269() == 1;
												if (local360) {
													local6.method20283();
												}
												client.aString151 = local6.method20283();
												Class515.aByte169 = local6.method20390();
												local87 = local6.method20269();
												if (local87 == 255) {
													arg0.aClass301_2 = null;
													return true;
												}
												Class21_Sub1.anInt288 = local87 * -1827384527;
												@Pc(4223) Class79[] local4223 = new Class79[100];
												for (local663 = 0; local663 < Class21_Sub1.anInt288 * 906110417; local663++) {
													local4223[local663] = new Class79();
													local4223[local663].aString130 = local6.method20283();
													local360 = local6.method20269() == 1;
													if (local360) {
														local4223[local663].aString131 = local6.method20283();
													} else {
														local4223[local663].aString131 = local4223[local663].aString130;
													}
													local4223[local663].aString129 = Class65_Sub1.method13183(local4223[local663].aString131, Class141.aClass623_1);
													local4223[local663].anInt2911 = local6.method20271() * 1391369007;
													local4223[local663].aByte104 = local6.method20390();
													local4223[local663].aString132 = local6.method20283();
													if (local4223[local663].aString131.equals(Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aString75)) {
														Class206.aByte128 = local4223[local663].aByte104;
													}
												}
												local722 = Class21_Sub1.anInt288 * 906110417;
												while (local722 > 0) {
													local4329 = true;
													local722--;
													for (local726 = 0; local726 < local722; local726++) {
														if (local4223[local726].aString129.compareTo(local4223[local726 + 1].aString129) > 0) {
															@Pc(4351) Class79 local4351 = local4223[local726];
															local4223[local726] = local4223[local726 + 1];
															local4223[local726 + 1] = local4351;
															local4329 = false;
														}
													}
													if (local4329) {
														break;
													}
												}
												Class43_Sub2.aClass79Array1 = local4223;
												arg0.aClass301_2 = null;
												return true;
											} else if (Class301.aClass301_100 == arg0.aClass301_2) {
												local263 = local6.method20325();
												local87 = local263 >> 28 & 0x3;
												local659 = local263 >> 14 & 0x3FFF;
												local663 = local263 & 0x3FFF;
												local718 = local6.method20317();
												local722 = local6.method20310();
												local726 = local722 >> 2;
												local732 = local722 & 0x3;
												local2568 = client.anIntArray295[local726];
												local399 = local6.method20275();
												@Pc(4431) Class464 local4431 = client.aClass370_1.method26942();
												local659 -= local4431.anInt5071 * -1567811631;
												local663 -= local4431.anInt5073 * 1360175441;
												Class195.method24091(local87, local659, local663, local2568, local726, local732, local399, local718);
												arg0.aClass301_2 = null;
												return true;
											} else if (arg0.aClass301_2 == Class301.aClass301_13) {
												if (client.anInt3125 * -1579500007 != -1) {
													Class60_Sub15.method13525(client.anInt3125 * -1579500007, 0);
												}
												arg0.aClass301_2 = null;
												return true;
											} else if (arg0.aClass301_2 == Class301.aClass301_144) {
												local263 = local6.method20315();
												if (local263 == 65535) {
													local263 = -1;
												}
												Class510.aClass183_1.method23590(local263, 255);
												arg0.aClass301_2 = null;
												return true;
											} else if (Class301.aClass301_25 == arg0.aClass301_2) {
												local263 = local6.method20269();
												@Pc(4518) Class564 local4518 = (Class564) Class356.method26649(Class19.method21408(), local263);
												if (local4518 == null) {
													local4518 = Class564.aClass564_7;
												}
												Class342.method26471(local4518);
												arg0.aClass301_2 = null;
												return true;
											} else if (Class301.aClass301_46 == arg0.aClass301_2) {
												local597 = new Class3_Sub41_Sub1(arg0.anInt2915 * -64841839);
												System.arraycopy(arg0.aClass3_Sub41_Sub1_2.aByteArray51, arg0.aClass3_Sub41_Sub1_2.anInt2803 * 62066237, local597.aByteArray51, 0, arg0.anInt2915 * -64841839);
												Class161.method23267();
												if (Class510.aClass3_Sub45_37.aClass60_Sub16_1.method13548() == 1) {
													Class30_Sub1.aClass379_1.method27252(new Class374(Class380.aClass380_6, local597));
												} else {
													client.aClass370_1.method26969(new Class374(Class380.aClass380_6, local597));
												}
												arg0.aClass301_2 = null;
												return false;
											} else if (Class301.aClass301_43 == arg0.aClass301_2) {
												client.anInt3150 = client.anInt3138 * 695974381;
												local360 = local6.method20269() == 1;
												@Pc(4611) Class239 local4611 = new Class239(local6);
												@Pc(4615) Class3_Sub30 local4615;
												if (local360) {
													local4615 = Class68.aClass3_Sub30_2;
												} else {
													local4615 = Class14_Sub5.aClass3_Sub30_1;
												}
												local4611.method24619(local4615);
												arg0.aClass301_2 = null;
												return true;
											} else if (arg0.aClass301_2 == Class301.aClass301_40) {
												local263 = local6.method20271();
												Class351.method26588();
												Class36_Sub2.method8322(local263);
												arg0.aClass301_2 = null;
												return true;
											} else if (arg0.aClass301_2 == Class301.aClass301_120) {
												client.anInt3127 = local6.method20269() * -101261825;
												client.anInt3152 = client.anInt3138 * -218385621;
												arg0.aClass301_2 = null;
												return true;
											} else if (Class301.aClass301_5 == arg0.aClass301_2) {
												Class369.method26935(Class308.aClass308_13);
												arg0.aClass301_2 = null;
												return true;
											} else if (arg0.aClass301_2 == Class301.aClass301_7) {
												Class369.method26935(Class308.aClass308_8);
												arg0.aClass301_2 = null;
												return true;
											} else if (Class301.aClass301_111 == arg0.aClass301_2) {
												Class369.method26935(Class308.aClass308_9);
												arg0.aClass301_2 = null;
												return true;
											} else if (Class301.aClass301_148 == arg0.aClass301_2) {
												local263 = local6.method20310();
												local87 = local6.method20304();
												local659 = local6.method20314();
												local663 = local6.method20269();
												local718 = local6.method20304();
												Class351.method26588();
												client.aBooleanArray22[local87] = true;
												client.anIntArray317[local87] = local718;
												client.anIntArray291[local87] = local663;
												client.anIntArray318[local87] = local263;
												client.anIntArray319[local87] = local659;
												arg0.aClass301_2 = null;
												return true;
											} else if (arg0.aClass301_2 == Class301.aClass301_12) {
												local263 = local6.method20313();
												local87 = local6.method20275();
												local659 = local6.method20275();
												local663 = local6.method20275();
												local718 = local6.method20317();
												local722 = local6.method20275();
												@Pc(4788) Class464 local4788 = new Class464(local6.method20324());
												local732 = local6.method20325();
												local2568 = local6.method20315();
												Class351.method26588();
												Class492.method29290(local663, new Class3_Sub42_Sub1(local263, local718, new Class533(local4788, local2568)), new int[] { local659, local732, local722, local87 }, false);
												arg0.aClass301_2 = null;
												return true;
											} else if (arg0.aClass301_2 == Class301.aClass301_140) {
												local263 = local6.method20275();
												if (local263 != Class140.anInt3425 * 1411754057) {
													Class140.anInt3425 = local263 * -800142855;
													Class291.method25543(Class634.aClass634_16, -1, -1);
												}
												arg0.aClass301_2 = null;
												return true;
											} else if (Class301.aClass301_66 == arg0.aClass301_2) {
												Class394.method27445(Class190.aBoolean661);
												arg0.aClass301_2 = null;
												return false;
											} else if (arg0.aClass301_2 == Class301.aClass301_6) {
												Class186.method23925(local6, arg0.anInt2915 * -64841839);
												arg0.aClass301_2 = null;
												return true;
											} else if (arg0.aClass301_2 == Class301.aClass301_172) {
												local263 = local6.method20324();
												local87 = local6.method20271();
												Class351.method26588();
												Class414.method27750(local87, local263);
												arg0.aClass301_2 = null;
												return true;
											} else if (Class301.aClass301_95 == arg0.aClass301_2) {
												local263 = local6.method20271();
												local87 = local6.method20271();
												Class510.aClass183_1.method23570(local263, local87);
												arg0.aClass301_2 = null;
												return true;
											} else if (arg0.aClass301_2 == Class301.aClass301_52) {
												local307 = local6.method20283();
												Class191.method24061(local307);
												arg0.aClass301_2 = null;
												return true;
											} else if (arg0.aClass301_2 == Class301.aClass301_106) {
												local263 = local6.method20315();
												local87 = local6.method20324();
												local659 = local6.method20323();
												Class351.method26588();
												Class3_Sub14.method11266(local87, 5, local263, local659);
												arg0.aClass301_2 = null;
												return true;
											} else if (Class301.aClass301_56 == arg0.aClass301_2) {
												client.anInt3149 = client.anInt3138 * -608533147;
												local360 = local6.method20269() == 1;
												@Pc(5006) Class242 local5006 = new Class242(local6);
												@Pc(5010) Class245 local5010;
												if (local360) {
													local5010 = Class471.aClass245_2;
												} else {
													local5010 = Class357.aClass245_1;
												}
												local5006.method24744(local5010);
												arg0.aClass301_2 = null;
												return true;
											} else if (Class301.aClass301_181 == arg0.aClass301_2) {
												local263 = local6.method20313();
												local87 = local6.method20323();
												local659 = local6.method20272();
												local663 = local6.method20310();
												@Pc(5048) Class3_Sub29 local5048 = (Class3_Sub29) client.aClass581_21.method33217((long) local263);
												if (local5048 != null) {
													@Pc(5054) Class26_Sub1_Sub1_Sub1_Sub1 local5054 = (Class26_Sub1_Sub1_Sub1_Sub1) local5048.anObject2;
													if (local5054.aClass586_1 == null) {
														local5054.aClass586_1 = new Class586(local5054.aClass571_1);
													}
													local5054.aClass586_1.anIntArray513[local663] = local87;
													local5054.aClass586_1.aShortArray133[local663] = (short) local659;
												}
												arg0.aClass301_2 = null;
												return true;
											} else if (Class301.aClass301_50 == arg0.aClass301_2) {
												local263 = local6.method20269();
												if (local6.method20269() == 0) {
													client.aClass367Array1[local263] = new Class367();
												} else {
													local6.anInt2803 -= -918980331;
													client.aClass367Array1[local263] = new Class367(local6, null);
												}
												client.anInt3147 = client.anInt3138 * 1915775515;
												arg0.aClass301_2 = null;
												return true;
											} else if (arg0.aClass301_2 == Class301.aClass301_22) {
												local263 = local6.method20323();
												local87 = local6.method20271();
												Class351.method26588();
												Class19_Sub2.method21425(local263, local87);
												arg0.aClass301_2 = null;
												return true;
											} else if (arg0.aClass301_2 == Class301.aClass301_101) {
												local263 = local6.method20324();
												Class351.method26588();
												@Pc(5166) Class3_Sub42 local5166 = (Class3_Sub42) client.aClass581_22.method33217((long) local263);
												if (local5166 != null) {
													Class490.method29244(local5166, true, false);
												}
												if (client.aClass178_10 != null) {
													Class223.method24442(client.aClass178_10);
													client.aClass178_10 = null;
												}
												arg0.aClass301_2 = null;
												return true;
											} else if (arg0.aClass301_2 == Class301.aClass301_177) {
												Class510.aClass183_1.method23582(local6.method20271());
												arg0.aClass301_2 = null;
												return true;
											} else if (Class301.aClass301_74 == arg0.aClass301_2) {
												Class48_Sub2.method9541(true);
												arg0.aClass301_2 = null;
												return true;
											} else if (arg0.aClass301_2 == Class301.aClass301_41) {
												local263 = local6.method20325();
												if (Class30_Sub3.anInt848 * -284266725 != local263) {
													Class30_Sub3.anInt848 = local263 * 842552083;
													Class291.method25543(Class634.aClass634_19, -1, -1);
												}
												arg0.aClass301_2 = null;
												return true;
											} else if (Class301.aClass301_150 == arg0.aClass301_2) {
												Class80.aClass23_Sub1_1.method5945(local6, arg0.anInt2915 * -64841839);
												arg0.aClass301_2 = null;
												return true;
											} else if (Class301.aClass301_133 == arg0.aClass301_2) {
												local263 = local6.method20269();
												local87 = local6.method20269();
												local659 = local6.method20313();
												if (local659 == 65535) {
													local659 = -1;
												}
												local376 = local6.method20283();
												if (local87 >= 1 && local87 <= 8) {
													if (local376.equalsIgnoreCase("null")) {
														local376 = null;
													}
													client.aStringArray9[local87 - 1] = local376;
													client.anIntArray310[local87 - 1] = local659;
													client.aBooleanArray20[local87 - 1] = local263 == 0;
												}
												arg0.aClass301_2 = null;
												return true;
											} else if (Class301.aClass301_8 == arg0.aClass301_2) {
												local263 = local6.method20271() << 2;
												local87 = local6.method20304();
												local659 = local6.method20317();
												local663 = local6.method20317();
												local718 = local6.method20304();
												Class351.method26588();
												Class556.method32809(local87, local718, local263, local659, local663, true);
												arg0.aClass301_2 = null;
												return true;
											} else if (Class301.aClass301_57 == arg0.aClass301_2) {
												local6.anInt2803 += 38354508;
												if (local6.method20300()) {
													Class189.method23981(local6, local6.anInt2803 * 62066237 - 28);
												}
												arg0.aClass301_2 = null;
												return true;
											} else {
												@Pc(5500) boolean local5500;
												@Pc(5474) String local5474;
												if (Class301.aClass301_173 == arg0.aClass301_2) {
													while (local6.anInt2803 * 62066237 < arg0.anInt2915 * -64841839) {
														local360 = local6.method20269() == 1;
														local364 = local6.method20283();
														local366 = local6.method20283();
														local663 = local6.method20271();
														local718 = local6.method20269();
														local722 = local6.method20269();
														@Pc(5441) boolean local5441 = (local722 & 0x2) != 0;
														local4078 = (local722 & 0x1) != 0;
														@Pc(5452) String local5452 = "";
														local399 = -1;
														local762 = 0;
														if (local663 > 0) {
															local5452 = local6.method20283();
															local399 = local6.method20269();
															local762 = local6.method20275();
														}
														local5474 = local6.method20283();
														for (local782 = 0; local782 < client.anInt3042 * -1645830611; local782++) {
															@Pc(5485) Class313 local5485 = client.aClass313Array1[local782];
															if (local360) {
																if (local366.equals(local5485.aString202)) {
																	local5485.aString202 = local364;
																	local5485.aString200 = local366;
																	local364 = null;
																	break;
																}
															} else if (local364.equals(local5485.aString202)) {
																if (local5485.anInt4530 * -639487189 != local663) {
																	local5500 = true;
																	for (@Pc(5505) Class53_Sub5 local5505 = (Class53_Sub5) client.aClass559_8.method32822(); local5505 != null; local5505 = (Class53_Sub5) client.aClass559_8.method32837()) {
																		if (local5505.aString43.equals(local364)) {
																			if (local663 != 0 && local5505.aShort50 == 0) {
																				local5505.method20615();
																				local5500 = false;
																			} else if (local663 == 0 && local5505.aShort50 != 0) {
																				local5505.method20615();
																				local5500 = false;
																			}
																		}
																	}
																	if (local5500) {
																		client.aClass559_8.method32819(new Class53_Sub5(local364, local663));
																	}
																	local5485.anInt4530 = local663 * -519375997;
																}
																local5485.aString200 = local366;
																local5485.aString199 = local5452;
																local5485.anInt4531 = local718 * 1075933325;
																local5485.anInt4532 = local399 * 1131665837;
																local5485.aBoolean713 = local5441;
																local5485.aBoolean714 = local4078;
																local5485.aString201 = local5474;
																local5485.anInt4533 = local762 * -1936242811;
																local364 = null;
																break;
															}
														}
														if (local364 != null && client.anInt3042 * -1645830611 < 400) {
															@Pc(5615) Class313 local5615 = new Class313();
															client.aClass313Array1[client.anInt3042 * -1645830611] = local5615;
															local5615.aString202 = local364;
															local5615.aString200 = local366;
															local5615.anInt4530 = local663 * -519375997;
															local5615.aString199 = local5452;
															local5615.anInt4531 = local718 * 1075933325;
															local5615.anInt4532 = local399 * 1131665837;
															local5615.aBoolean713 = local5441;
															local5615.aBoolean714 = local4078;
															local5615.aString201 = local5474;
															local5615.anInt4533 = local762 * -1936242811;
															client.anInt3042 += -884907611;
														}
													}
													client.anInt3194 = 949055382;
													client.anInt3052 = client.anInt3138 * 1482989417;
													local87 = client.anInt3042 * -1645830611;
													while (local87 > 0) {
														local360 = true;
														local87--;
														for (local659 = 0; local659 < local87; local659++) {
															local4329 = false;
															@Pc(5692) Class313 local5692 = client.aClass313Array1[local659];
															@Pc(5698) Class313 local5698 = client.aClass313Array1[local659 + 1];
															if (FileFilter_Sub1.aClass585_1.anInt5458 * 146668341 != local5692.anInt4530 * -639487189 && local5698.anInt4530 * -639487189 == FileFilter_Sub1.aClass585_1.anInt5458 * 146668341) {
																local4329 = true;
															}
															if (!local4329 && local5692.anInt4530 * -639487189 == 0 && local5698.anInt4530 * -639487189 != 0) {
																local4329 = true;
															}
															if (!local4329 && !local5692.aBoolean713 && local5698.aBoolean713) {
																local4329 = true;
															}
															if (!local4329 && !local5692.aBoolean714 && local5698.aBoolean714) {
																local4329 = true;
															}
															if (local4329) {
																@Pc(5759) Class313 local5759 = client.aClass313Array1[local659];
																client.aClass313Array1[local659] = client.aClass313Array1[local659 + 1];
																client.aClass313Array1[local659 + 1] = local5759;
																local360 = false;
															}
														}
														if (local360) {
															break;
														}
													}
													arg0.aClass301_2 = null;
													return true;
												} else if (arg0.aClass301_2 == Class301.aClass301_134) {
													local307 = local6.method20283();
													local87 = local6.method20271();
													Class570.aClass585_5.aString242 = local307;
													Class570.aClass585_5.anInt5458 = local87 * 664190749;
													Class228.method24522();
													arg0.aClass301_2 = null;
													return true;
												} else if (Class301.aClass301_116 == arg0.aClass301_2) {
													local263 = local6.method20314();
													@Pc(5824) byte local5824 = local6.method20308();
													Class351.method26588();
													Class25.method6479(local263, local5824);
													arg0.aClass301_2 = null;
													return true;
												} else if (Class301.aClass301_32 == arg0.aClass301_2) {
													local263 = local6.method20325();
													local87 = local6.method20313();
													Class424.aClass165_1.aClass460_1.method28568(Class308.aClass70_Sub2_3.method33886(local87), local263);
													arg0.aClass301_2 = null;
													return true;
												} else if (Class301.aClass301_64 == arg0.aClass301_2) {
													local263 = local6.method20334();
													local87 = local6.method20275();
													local659 = local6.method20269();
													local376 = "";
													local1670 = local376;
													if ((local659 & 0x1) != 0) {
														local376 = local6.method20283();
														if ((local659 & 0x2) == 0) {
															local1670 = local376;
														} else {
															local1670 = local6.method20283();
														}
													}
													@Pc(5906) String local5906 = local6.method20283();
													if (local263 == 99) {
														Class215.method24289(local5906);
													} else if (local263 == 98) {
														Class544.method32604(local5906);
													} else if (local1670.equals("") || !Class34_Sub1.method16502(local1670)) {
														Class121.method22823(local263, local87, local376, local1670, local376, local5906);
													} else {
														arg0.aClass301_2 = null;
														return true;
													}
													arg0.aClass301_2 = null;
													return true;
												} else if (Class301.aClass301_139 == arg0.aClass301_2) {
													local263 = local6.method20324();
													local87 = local6.method20271();
													local659 = local6.method20323();
													Class351.method26588();
													Class3_Sub14.method11266(local263, 3, local87, local659);
													arg0.aClass301_2 = null;
													return true;
												} else if (Class301.aClass301_103 == arg0.aClass301_2) {
													local263 = local6.method20269();
													@Pc(5991) Class547 local5991 = (Class547) Class356.method26649(Class11_Sub2.method1218(), local263);
													if (local5991 == null) {
														local5991 = Class547.aClass547_2;
													}
													Class503.method29508(local5991);
													arg0.aClass301_2 = null;
													return true;
												} else if (Class301.aClass301_11 == arg0.aClass301_2) {
													local263 = local6.method20310();
													local87 = local6.method20304();
													if (local87 == 255) {
														local87 = -1;
														local263 = -1;
													}
													Class458.method28531(local87, local263);
													arg0.aClass301_2 = null;
													return true;
												} else if (arg0.aClass301_2 == Class301.aClass301_33) {
													Class351.method26588();
													Class375.method27232(Class205.method24189());
													arg0.aClass301_2 = null;
													return true;
												} else if (arg0.aClass301_2 == Class301.aClass301_85) {
													local263 = local6.method20269();
													local87 = local6.method20375();
													if (client.aClass398Array1[local263] != null) {
														client.aClass398Array1[local263].method27528(client.aClass370_1.method26950());
														client.aClass398Array1[local263] = null;
													}
													if (local87 != -1) {
														client.aClass398Array1[local263] = new Class398(Class613.aClass21_13, local6, local87);
													}
													arg0.aClass301_2 = null;
													return true;
												} else if (arg0.aClass301_2 == Class301.aClass301_91) {
													local263 = local6.method20271();
													Class510.aClass183_1.method23588(local263);
													arg0.aClass301_2 = null;
													return true;
												} else if (Class301.aClass301_123 == arg0.aClass301_2) {
													local263 = local6.method20271();
													if (local263 == 65535) {
														local263 = -1;
													}
													local87 = local6.method20304();
													Class510.aClass183_1.method23600(local263, local87);
													arg0.aClass301_2 = null;
													return true;
												} else if (Class301.aClass301_132 == arg0.aClass301_2) {
													arg0.aClass301_2 = null;
													return false;
												} else if (Class301.aClass301_80 == arg0.aClass301_2) {
													local263 = local6.method20271();
													local364 = local6.method20283();
													local2434 = local6.method20269() == 1;
													Class413.aClass585_2 = FileFilter_Sub1.aClass585_1;
													Class156.aBoolean622 = local2434;
													Class463.method28613(local263, local364);
													Class166.method23342(9);
													arg0.aClass301_2 = null;
													return false;
												} else if (arg0.aClass301_2 == Class301.aClass301_34) {
													Class369.method26935(Class308.aClass308_1);
													arg0.aClass301_2 = null;
													return true;
												} else if (Class301.aClass301_128 == arg0.aClass301_2) {
													local263 = local6.method20324();
													local87 = local6.method20269();
													local659 = local6.method20324();
													local663 = local6.method20325();
													local718 = local6.method20315();
													local722 = local6.method20324();
													local726 = local6.method20325();
													Class351.method26588();
													Class492.method29290(local263, new Class3_Sub42(local718, local87), new int[] { local663, local659, local722, local726 }, false);
													arg0.aClass301_2 = null;
													return true;
												} else if (arg0.aClass301_2 == Class301.aClass301_24) {
													local263 = local6.method20271();
													local364 = local6.method20283();
													Class351.method26588();
													Class296.method25576(local263, local364);
													arg0.aClass301_2 = null;
													return true;
												} else if (arg0.aClass301_2 == Class301.aClass301_68) {
													local307 = local6.method20283();
													local87 = local6.method20271();
													Class570.aClass585_6.aString242 = local307;
													Class570.aClass585_6.anInt5458 = local87 * 664190749;
													Class228.method24522();
													Class571.aClass348_3.method26552(Class570.aClass585_6.aString242, Class570.aClass585_6.method33271());
													Class626.aClass334_1.method26277();
													arg0.aClass301_2 = null;
													return true;
												} else if (arg0.aClass301_2 == Class301.aClass301_112) {
													local263 = local6.method20325();
													local87 = local6.method20271();
													if (local87 == 65535) {
														local87 = -1;
													}
													local659 = local6.method20324();
													Class351.method26588();
													Class458.method28530(local659, local87, local263);
													@Pc(6362) Class594 local6362 = Class44_Sub3.aClass596_1.method33435(local87);
													Class412.method27706(local659, local6362.anInt5469 * 1000926491, local6362.anInt5470 * 1054197095, local6362.anInt5512 * 1948319869);
													Class3_Sub40.method19104(local659, local6362.anInt5488 * -1275786649, local6362.anInt5472 * -1812757507, local6362.anInt5462 * -762415181);
													arg0.aClass301_2 = null;
													return true;
												} else if (Class301.aClass301_90 == arg0.aClass301_2) {
													local263 = local6.method20269();
													@Pc(6412) Class550 local6412 = (Class550) Class356.method26649(Class196.method24114(), local263);
													if (local6412 == null) {
														local6412 = Class550.aClass550_5;
													}
													Class146.method23085(local6412);
													arg0.aClass301_2 = null;
													return true;
												} else if (arg0.aClass301_2 == Class301.aClass301_62) {
													for (local263 = 0; local263 < client.aClass26_Sub1_Sub1_Sub1_Sub2Array1.length; local263++) {
														if (client.aClass26_Sub1_Sub1_Sub1_Sub2Array1[local263] != null) {
															client.aClass26_Sub1_Sub1_Sub1_Sub2Array1[local263].anIntArray234 = null;
															client.aClass26_Sub1_Sub1_Sub1_Sub2Array1[local263].aClass71_3.method20038(-1);
														}
													}
													for (local263 = 0; local263 < client.anInt3054 * -453205259; local263++) {
														((Class26_Sub1_Sub1_Sub1) client.aClass3_Sub29Array1[local263].anObject2).anIntArray234 = null;
														((Class26_Sub1_Sub1_Sub1) client.aClass3_Sub29Array1[local263].anObject2).aClass71_3.method20038(-1);
													}
													arg0.aClass301_2 = null;
													return true;
												} else if (Class301.aClass301_20 == arg0.aClass301_2) {
													local263 = local6.method20269();
													Class351.method26588();
													client.anInt3103 = local263 * -1332164859;
													arg0.aClass301_2 = null;
													return true;
												} else if (Class301.aClass301_180 == arg0.aClass301_2) {
													client.anInt3149 = client.anInt3138 * -608533147;
													local360 = local6.method20269() == 1;
													if (arg0.anInt2915 * -64841839 != 1) {
														if (local360) {
															Class471.aClass245_2 = new Class245(local6);
														} else {
															Class357.aClass245_1 = new Class245(local6);
														}
														arg0.aClass301_2 = null;
														return true;
													}
													if (local360) {
														Class471.aClass245_2 = null;
													} else {
														Class357.aClass245_1 = null;
													}
													arg0.aClass301_2 = null;
													return true;
												} else if (Class301.aClass301_115 == arg0.aClass301_2) {
													local263 = local6.method20324();
													local87 = local6.method20323();
													local659 = local6.method20314();
													local663 = local6.method20275();
													local718 = local6.method20325();
													local722 = local6.method20310();
													local726 = local6.method20271();
													local732 = local6.method20275();
													Class351.method26588();
													Class492.method29290(local263, new Class3_Sub42_Sub2(local659, local722, local726), new int[] { local663, local718, local732, local87 }, false);
													arg0.aClass301_2 = null;
													return true;
												} else if (arg0.aClass301_2 == Class301.aClass301_81) {
													Class530.anInt5308 = (local6.method20308() << 3) * 1525822837;
													Class242.anInt3777 = (local6.method20307() << 3) * 1827897803;
													Class523.anInt5297 = local6.method20310() * -1789954663;
													while (local6.anInt2803 * 62066237 < arg0.anInt2915 * -64841839) {
														@Pc(6672) Class308 local6672 = Class358.method26662()[local6.method20269()];
														Class369.method26935(local6672);
													}
													arg0.aClass301_2 = null;
													return true;
												} else if (arg0.aClass301_2 == Class301.aClass301_61) {
													local263 = local6.method20271();
													if (local263 == 65535) {
														local263 = -1;
													}
													local87 = local6.method20269();
													local659 = local6.method20271();
													local663 = local6.method20269();
													local718 = local6.method20271();
													Class510.aClass183_1.method23589(Class160.aClass160_10, local263, local87, local663, Class141.aClass141_3.method23024(), Class158.aClass158_1, 0.0F, 0.0F, null, 0, local718, local659);
													arg0.aClass301_2 = null;
													return true;
												} else if (Class301.aClass301_127 == arg0.aClass301_2) {
													local263 = local6.method20313();
													local87 = local6.method20325();
													local659 = local6.method20313();
													local663 = local6.method20315();
													Class351.method26588();
													Class3_Sub14.method11266(local87, 7, local663 << 16 | local659, local263);
													arg0.aClass301_2 = null;
													return true;
												} else if (arg0.aClass301_2 == Class301.aClass301_145) {
													local2183 = local6.method20309();
													local87 = local6.method20313();
													Class351.method26588();
													Class414.method27750(local87, local2183);
													arg0.aClass301_2 = null;
													return true;
												} else if (arg0.aClass301_2 == Class301.aClass301_88) {
													client.anInt3194 = 474527691;
													client.anInt3052 = client.anInt3138 * 1482989417;
													arg0.aClass301_2 = null;
													return true;
												} else if (Class301.aClass301_165 == arg0.aClass301_2) {
													local263 = local6.method20271();
													if (local263 == 65535) {
														local263 = -1;
													}
													local87 = local6.method20317();
													Class510.aClass183_1.method23573(local263, local87);
													arg0.aClass301_2 = null;
													return true;
												} else if (arg0.aClass301_2 == Class301.aClass301_36) {
													local307 = local6.method20283();
													local364 = Class140.method23023(Class491.method29258(local6));
													Class121.method22823(6, 0, local307, local307, local307, local364);
													arg0.aClass301_2 = null;
													return true;
												} else if (Class301.aClass301_122 == arg0.aClass301_2) {
													local263 = local6.method20314();
													if (local263 == 65535) {
														local263 = -1;
													}
													local87 = local6.method20313();
													local659 = local6.method20324();
													local663 = local6.method20315();
													if (local663 == 65535) {
														local663 = -1;
													}
													Class351.method26588();
													for (local718 = local663; local718 <= local263; local718++) {
														local3477 = ((long) local659 << 32) + (long) local718;
														local3998 = (Class3_Sub38) client.aClass581_20.method33217(local3477);
														if (local3998 != null) {
															local4016 = new Class3_Sub38(local3998.anInt1353 * 1263633035, local87);
															local3998.method33656();
														} else if (local718 == -1) {
															local4016 = new Class3_Sub38(Class375.method27235(local659).aClass3_Sub38_2.anInt1353 * 1263633035, local87);
														} else {
															local4016 = new Class3_Sub38(0, local87);
														}
														client.aClass581_20.method33241(local4016, local3477);
													}
													arg0.aClass301_2 = null;
													return true;
												} else if (Class301.aClass301_118 == arg0.aClass301_2) {
													local263 = local6.method20269();
													@Pc(6978) Class555 local6978 = (Class555) Class356.method26649(Class69_Sub2.method14575(), local263);
													if (local6978 == null) {
														local6978 = Class555.aClass555_3;
													}
													Class278.method25410(local6978);
													arg0.aClass301_2 = null;
													return true;
												} else if (arg0.aClass301_2 == Class301.aClass301_96) {
													Class42.method8327();
													arg0.aClass301_2 = null;
													return false;
												} else if (Class301.aClass301_84 == arg0.aClass301_2) {
													local263 = local6.method20269();
													local87 = local263 >> 5;
													local659 = local263 & 0x1F;
													if (local659 == 0) {
														client.aClass68Array1[local87] = null;
														arg0.aClass301_2 = null;
														return true;
													}
													@Pc(7032) Class68 local7032 = new Class68();
													local7032.anInt2017 = local659 * -897302379;
													local7032.anInt2010 = local6.method20269() * -399428217;
													if (local7032.anInt2010 * 310804535 >= 0 && local7032.anInt2010 * 310804535 < Class331.aClass6Array12.length) {
														if (local7032.anInt2017 * 207391421 == 1 || local7032.anInt2017 * 207391421 == 10) {
															local7032.anInt2012 = local6.method20271() * 603502265;
															local7032.anInt2018 = local6.method20271() * -1400026287;
															local6.anInt2803 += 619045972;
														} else if (local7032.anInt2017 * 207391421 >= 2 && local7032.anInt2017 * 207391421 <= 6) {
															if (local7032.anInt2017 * 207391421 == 2) {
																local7032.anInt2009 = -762519296;
																local7032.anInt2011 = 247681280;
															}
															if (local7032.anInt2017 * 207391421 == 3) {
																local7032.anInt2009 = 0;
																local7032.anInt2011 = 247681280;
															}
															if (local7032.anInt2017 * 207391421 == 4) {
																local7032.anInt2009 = -1525038592;
																local7032.anInt2011 = 247681280;
															}
															if (local7032.anInt2017 * 207391421 == 5) {
																local7032.anInt2009 = -762519296;
																local7032.anInt2011 = 0;
															}
															if (local7032.anInt2017 * 207391421 == 6) {
																local7032.anInt2009 = -762519296;
																local7032.anInt2011 = 495362560;
															}
															local7032.anInt2017 = -1794604758;
															local7032.anInt2013 = local6.method20269() * 1310547845;
															@Pc(7175) Class464 local7175 = client.aClass370_1.method26942();
															local7032.anInt2009 += (local6.method20271() - local7175.anInt5071 * -1567811631 << 9) * -2100130591;
															local7032.anInt2011 += (local6.method20271() - local7175.anInt5073 * 1360175441 << 9) * -770784431;
															local7032.anInt2015 = (local6.method20269() << 2) * 1857984185;
															local7032.anInt2014 = local6.method20271() * -232855163;
														}
														local7032.anInt2016 = local6.method20275() * 696283591;
														client.aClass68Array1[local87] = local7032;
													}
													arg0.aClass301_2 = null;
													return true;
												} else if (Class301.aClass301_51 == arg0.aClass301_2) {
													local263 = local6.method20275();
													Class128.aClass140_1 = new Class140(local263);
													@Pc(7259) Thread local7259 = new Thread(Class128.aClass140_1);
													local7259.setPriority(1);
													local7259.start();
													arg0.aClass301_2 = null;
													return true;
												} else if (Class301.aClass301_104 == arg0.aClass301_2) {
													local263 = local6.method20271();
													if (local263 == 65535) {
														local263 = -1;
													}
													local87 = local6.method20269();
													local659 = local6.method20271();
													local663 = local6.method20269();
													Class510.aClass183_1.method23589(Class160.aClass160_10, local263, local87, local663, Class141.aClass141_2.method23024(), Class158.aClass158_1, 0.0F, 0.0F, null, 0, 256, local659);
													arg0.aClass301_2 = null;
													return true;
												} else if (Class301.aClass301_86 == arg0.aClass301_2) {
													local263 = local6.method20275();
													local87 = local6.method20324();
													Class351.method26588();
													Class3_Sub14.method11266(local87, 1, local263, -1);
													arg0.aClass301_2 = null;
													return true;
												} else if (Class301.aClass301_35 == arg0.aClass301_2) {
													local307 = local6.method20283();
													@Pc(7356) Object[] local7356 = new Object[local307.length() + 1];
													for (local659 = local307.length() - 1; local659 >= 0; local659--) {
														if (local307.charAt(local659) == 's') {
															local7356[local659 + 1] = local6.method20283();
														} else {
															local7356[local659 + 1] = Integer.valueOf(local6.method20275());
														}
													}
													local7356[0] = Integer.valueOf(local6.method20275());
													Class351.method26588();
													@Pc(7406) Class3_Sub17 local7406 = new Class3_Sub17();
													local7406.anObjectArray1 = local7356;
													Class410.method27671(local7406);
													arg0.aClass301_2 = null;
													return true;
												} else if (arg0.aClass301_2 == Class301.aClass301_10) {
													local263 = local6.method20271();
													local87 = local6.method20271();
													local659 = local6.method20271();
													Class510.aClass183_1.method23577(local263, local87, local659);
													arg0.aClass301_2 = null;
													return true;
												} else if (arg0.aClass301_2 == Class301.aClass301_136) {
													if (Class552.aBoolean823 && Class350.aFrame3 != null) {
														Class157.method23193(Class510.aClass3_Sub45_37.aClass60_Sub11_1.method13403(), -1, -1, false);
													}
													local524 = new byte[arg0.anInt2915 * -64841839];
													local6.method19830(local524, 0, arg0.anInt2915 * -64841839);
													local364 = Class60_Sub7.method13289(local524, 0, arg0.anInt2915 * -64841839);
													Class485.method29178(local364, true, client.aBoolean569);
													arg0.aClass301_2 = null;
													return true;
												} else if (arg0.aClass301_2 == Class301.aClass301_176) {
													client.aBoolean597 = local6.method20310() == 1;
													arg0.aClass301_2 = null;
													return true;
												} else if (arg0.aClass301_2 == Class301.aClass301_166) {
													local263 = local6.method20316();
													local87 = local6.method20275();
													local659 = local6.method20272();
													Class351.method26588();
													Class411.method27697(local87, local263, local659);
													arg0.aClass301_2 = null;
													return true;
												} else if (arg0.aClass301_2 == Class301.aClass301_75) {
													Class369.method26935(Class308.aClass308_4);
													arg0.aClass301_2 = null;
													return true;
												} else if (arg0.aClass301_2 == Class301.aClass301_14) {
													Class369.method26935(Class308.aClass308_6);
													arg0.aClass301_2 = null;
													return true;
												} else if (arg0.aClass301_2 == Class301.aClass301_164) {
													local263 = local6.method20325();
													local87 = local6.method20310();
													Class351.method26588();
													Class19_Sub2_Sub2.method20763(local263, local87);
													arg0.aClass301_2 = null;
													return true;
												} else if (Class301.aClass301_99 == arg0.aClass301_2) {
													local263 = local6.method20271();
													if (local263 == 65535) {
														local263 = -1;
													}
													local87 = local6.method20269();
													local659 = local6.method20271();
													local663 = local6.method20269();
													local718 = local6.method20271();
													local722 = local6.method20271();
													@Pc(7642) Class366 local7642 = Class510.aClass183_1.method23686(Class160.aClass160_10, Class510.aClass183_1, local263, local87, local663, Class141.aClass141_3.method23024(), Class158.aClass158_1, 0.0F, 0.0F, null, 0, local718, false);
													if (local7642 != null) {
														Class510.aClass183_1.method23597(local7642, local722, local659);
													}
													arg0.aClass301_2 = null;
													return true;
												} else if (arg0.aClass301_2 == Class301.aClass301_23) {
													local263 = local6.method20271();
													local87 = local6.method20269();
													local2434 = (local87 & 0x1) == 1;
													while (local6.anInt2803 * 62066237 < arg0.anInt2915 * -64841839) {
														local663 = local6.method20334();
														local718 = local6.method20271();
														local722 = 0;
														if (local718 != 0) {
															local722 = local6.method20269();
															if (local722 == 255) {
																local722 = local6.method20275();
															}
														}
														Class286.method25482(local263, local663, local718 - 1, local722, local2434);
													}
													client.anIntArray313[(client.anInt3142 += -1142786477) * 742473179 - 1 & 0x1F] = local263;
													arg0.aClass301_2 = null;
													return true;
												} else if (Class301.aClass301_113 == arg0.aClass301_2) {
													local263 = local6.method20315();
													local87 = local6.method20304();
													local2434 = (local87 & 0x1) == 1;
													Class39_Sub2.method8268(local263, local2434);
													client.anIntArray313[(client.anInt3142 += -1142786477) * 742473179 - 1 & 0x1F] = local263;
													arg0.aClass301_2 = null;
													return true;
												} else if (arg0.aClass301_2 == Class301.aClass301_44) {
													Class369.method26935(Class308.aClass308_12);
													arg0.aClass301_2 = null;
													return true;
												} else if (Class301.aClass301_63 == arg0.aClass301_2) {
													local263 = local6.method20275();
													local87 = local6.method20324();
													local6.method20304();
													local659 = local6.method20325();
													local663 = local6.method20275();
													local718 = local6.method20314();
													Class351.method26588();
													@Pc(7844) int[] local7844 = new int[] { local659, local663, local87, local263 };
													client.anInt3125 = local718 * -334905815;
													Class16.method1677(local718, local7844);
													Class298.method25633(false);
													Class331.method26182(client.anInt3125 * -1579500007, local7844);
													for (local726 = 0; local726 < 112; local726++) {
														client.aBooleanArray19[local726] = true;
													}
													arg0.aClass301_2 = null;
													return true;
												} else if (arg0.aClass301_2 == Class301.aClass301_89) {
													local2183 = local6.method20307();
													local87 = local6.method20315();
													Class424.aClass165_1.aClass460_1.method28565(Class429.aClass70_Sub1_Sub1_2.method14717(local87), local2183);
													arg0.aClass301_2 = null;
													return true;
												} else if (arg0.aClass301_2 == Class301.aClass301_18) {
													Class351.method26588();
													Class540.method32578();
													arg0.aClass301_2 = null;
													return true;
												} else if (arg0.aClass301_2 == Class301.aClass301_102) {
													local360 = local6.method20269() == 1;
													local364 = local6.method20283();
													local366 = local364;
													if (local360) {
														local366 = local6.method20283();
													}
													local3472 = local6.method20271();
													local3477 = local6.method20273();
													local3486 = (Class284) Class356.method26649(Class48.method9534(), local6.method20269());
													local1426 = local3477 + (local3472 << 32);
													local1428 = false;
													local773 = 0;
													while (true) {
														if (local773 >= 100) {
															if (local3486.aBoolean708) {
																if (client.aBoolean591 && !client.aBoolean592 || client.aBoolean594) {
																	local1428 = true;
																} else if (Class34_Sub1.method16502(local366)) {
																	local1428 = true;
																}
															}
															break;
														}
														if (client.aLongArray13[local773] == local1426) {
															local1428 = true;
															break;
														}
														local773++;
													}
													if (!local1428) {
														client.aLongArray13[client.anInt3162 * 474555963] = local1426;
														client.anInt3162 = (client.anInt3162 * 474555963 + 1) % 100 * 1967702771;
														local5474 = Class140.method23023(Class491.method29258(local6));
														local782 = local3486.aBoolean707 ? 7 : 3;
														if (local3486.anInt4353 * -1668906371 == -1) {
															Class3_Sub11.method18310(local782, 0, local364, local366, local364, local5474, null, -1);
														} else {
															Class3_Sub11.method18310(local782, 0, Class301.method25664(local3486.anInt4353 * -1668906371) + local364, Class301.method25664(local3486.anInt4353 * -1668906371) + local366, local364, local5474, null, -1);
														}
													}
													arg0.aClass301_2 = null;
													return true;
												} else if (arg0.aClass301_2 == Class301.aClass301_17) {
													Class369.method26935(Class308.aClass308_11);
													arg0.aClass301_2 = null;
													return true;
												} else if (Class301.aClass301_169 == arg0.aClass301_2) {
													local263 = local6.method20315();
													local87 = local6.method20304();
													Class351.method26588();
													Class442.method28253(local263, local87, true);
													arg0.aClass301_2 = null;
													return true;
												} else if (Class301.aClass301_31 == arg0.aClass301_2) {
													local360 = local6.method20269() == 1;
													local364 = local6.method20283();
													local1402 = local6.method20271();
													local381 = local6.method20273();
													local1416 = (Class284) Class356.method26649(Class48.method9534(), local6.method20269());
													@Pc(8169) long local8169 = (local1402 << 32) + local381;
													@Pc(8171) boolean local8171 = false;
													@Pc(8179) Class3_Sub30 local8179 = local360 ? Class68.aClass3_Sub30_2 : Class14_Sub5.aClass3_Sub30_1;
													if (local8179 == null) {
														local8171 = true;
													} else {
														local773 = 0;
														while (true) {
															if (local773 >= 100) {
																if (local1416.aBoolean708) {
																	if (client.aBoolean591 && !client.aBoolean592 || client.aBoolean594) {
																		local8171 = true;
																	} else if (Class34_Sub1.method16502(local364)) {
																		local8171 = true;
																	}
																}
																break;
															}
															if (client.aLongArray13[local773] == local8169) {
																local8171 = true;
																break;
															}
															local773++;
														}
													}
													if (!local8171) {
														client.aLongArray13[client.anInt3162 * 474555963] = local8169;
														client.anInt3162 = (client.anInt3162 * 474555963 + 1) % 100 * 1967702771;
														local5474 = Class140.method23023(Class491.method29258(local6));
														local782 = local360 ? 41 : 44;
														if (local1416.anInt4353 * -1668906371 == -1) {
															Class3_Sub11.method18310(local782, 0, local364, local364, local364, local5474, local8179.aString47, -1);
														} else {
															Class3_Sub11.method18310(local782, 0, Class301.method25664(local1416.anInt4353 * -1668906371) + local364, Class301.method25664(local1416.anInt4353 * -1668906371) + local364, local364, local5474, local8179.aString47, -1);
														}
													}
													arg0.aClass301_2 = null;
													return true;
												} else if (arg0.aClass301_2 == Class301.aClass301_175) {
													local263 = local6.method20315();
													local87 = local6.method20272();
													local659 = local6.method20422();
													local663 = local6.method20310();
													local718 = local6.method20271();
													local722 = local6.method20317();
													if (local722 == 255) {
														local722 = -1;
													}
													local726 = local6.method20304() * 4;
													local732 = local6.method20313();
													local2568 = local6.method20315();
													@Pc(8357) byte local8357 = local6.method20390();
													local762 = local6.method20315();
													@Pc(8365) byte local8365 = local6.method20308();
													local782 = local6.method20313();
													local409 = local6.method20310();
													local5500 = (local409 & 0x1) != 0;
													@Pc(8390) boolean local8390 = (local409 & 0x2) != 0;
													local1055 = local8390 ? local409 >> 2 : -1;
													if (local8390) {
														local663 = (byte) local663;
													} else {
														local663 *= 4;
													}
													@Pc(8412) Class464 local8412 = client.aClass370_1.method26942();
													@Pc(8419) int local8419 = local762 - local8412.anInt5071 * 1159344034;
													@Pc(8426) int local8426 = local782 - local8412.anInt5073 * -1574616414;
													local773 = local8365 + local8419;
													local399 = local8357 + local8426;
													if (local8419 >= 0 && local8426 >= 0 && local8419 < client.aClass370_1.method26943() * 2 && local8426 < client.aClass370_1.method26943() * 2 && local773 >= 0 && local399 >= 0 && local773 < client.aClass370_1.method27062() * 2 && local399 < client.aClass370_1.method27062() * 2 && local263 != 65535) {
														local8419 *= 256;
														local8426 *= 256;
														local773 = local773 * 256;
														local399 *= 256;
														local663 <<= 0x2;
														local726 <<= 0x2;
														local718 <<= 0x2;
														Class69_Sub1_Sub3.method20235(local263, local87, local659, local1055, local663, local726, local8419, local8426, local773, local399, local2568, local732, local722, local718, local5500, 0);
													}
													arg0.aClass301_2 = null;
													return true;
												} else if (arg0.aClass301_2 == Class301.aClass301_19) {
													local360 = local6.method20269() == 1;
													local364 = local6.method20283();
													local366 = local364;
													if (local360) {
														local366 = local6.method20283();
													}
													local376 = local6.method20283();
													local381 = local6.method20271();
													local386 = local6.method20273();
													local395 = (Class284) Class356.method26649(Class48.method9534(), local6.method20269());
													local3496 = local386 + (local381 << 32);
													local3498 = false;
													local782 = 0;
													while (true) {
														if (local782 >= 100) {
															if (local395.aBoolean708) {
																if (client.aBoolean591 && !client.aBoolean592 || client.aBoolean594) {
																	local3498 = true;
																} else if (Class34_Sub1.method16502(local366)) {
																	local3498 = true;
																}
															}
															break;
														}
														if (client.aLongArray13[local782] == local3496) {
															local3498 = true;
															break;
														}
														local782++;
													}
													if (!local3498) {
														client.aLongArray13[client.anInt3162 * 474555963] = local3496;
														client.anInt3162 = (client.anInt3162 * 474555963 + 1) % 100 * 1967702771;
														local1493 = Class140.method23023(Class491.method29258(local6));
														if (local395.anInt4353 * -1668906371 == -1) {
															Class3_Sub11.method18310(9, 0, local364, local366, local364, local1493, local376, -1);
														} else {
															Class3_Sub11.method18310(9, 0, Class301.method25664(local395.anInt4353 * -1668906371) + local364, Class301.method25664(local395.anInt4353 * -1668906371) + local366, local364, local1493, local376, -1);
														}
													}
													arg0.aClass301_2 = null;
													return true;
												} else if (Class301.aClass301_129 == arg0.aClass301_2) {
													local263 = local6.method20304();
													local87 = local6.method20310();
													local659 = local6.method20269();
													local663 = local6.method20271() << 2;
													local718 = local6.method20269();
													Class351.method26588();
													Class545.method32618(local87, local718, local663, local659, local263);
													arg0.aClass301_2 = null;
													return true;
												} else if (arg0.aClass301_2 == Class301.aClass301_65) {
													if (Class108.method21938(client.anInt3039 * 1115111877)) {
														client.anInt3041 = (int) ((float) local6.method20271() * 2.5F) * 616510833;
													} else {
														client.anInt3041 = local6.method20271() * 1315455806;
													}
													client.anInt3152 = client.anInt3138 * -218385621;
													arg0.aClass301_2 = null;
													return true;
												} else if (arg0.aClass301_2 == Class301.aClass301_79) {
													local263 = local6.method20271();
													@Pc(8786) Class26_Sub1_Sub1_Sub1_Sub2 local8786;
													if (local263 == client.anInt3115 * 2077649275) {
														local8786 = Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3;
													} else {
														local8786 = client.aClass26_Sub1_Sub1_Sub1_Sub2Array1[local263];
													}
													if (local8786 == null) {
														arg0.aClass301_2 = null;
														return true;
													}
													local659 = local6.method20271();
													@Pc(8811) Class284 local8811 = (Class284) Class356.method26649(Class48.method9534(), local6.method20269());
													@Pc(8819) boolean local8819 = (local659 & 0x8000) != 0;
													if (local8786.aString75 != null && local8786.aClass488_1 != null) {
														local2453 = false;
														if (local8811.aBoolean708) {
															if (!local8819 && (client.aBoolean591 && !client.aBoolean592 || client.aBoolean594)) {
																local2453 = true;
															} else if (Class34_Sub1.method16502(local8786.aString75)) {
																local2453 = true;
															}
														}
														if (!local2453) {
															local732 = -1;
															if (local8819) {
																local659 &= 0x7FFF;
																@Pc(8863) Class283 local8863 = Class176.method23417(local6);
																local732 = local8863.anInt4351 * 189047461;
																local2534 = local8863.aClass3_Sub1_Sub13_1.method19277(local6);
															} else {
																local2534 = Class140.method23023(Class491.method29258(local6));
															}
															local8786.method16745(local2534.trim(), local659 >> 8, local659 & 0xFF);
															if (local8811.aBoolean707) {
																local2568 = local8819 ? 17 : 1;
															} else {
																local2568 = local8819 ? 17 : 2;
															}
															if (local8811.anInt4353 * -1668906371 == -1) {
																Class3_Sub11.method18310(local2568, 0, local8786.method16735(true), local8786.method16750(false), local8786.aString77, local2534, null, local732);
															} else {
																Class3_Sub11.method18310(local2568, 0, Class301.method25664(local8811.anInt4353 * -1668906371) + local8786.method16735(true), Class301.method25664(local8811.anInt4353 * -1668906371) + local8786.method16750(false), local8786.aString77, local2534, null, local732);
															}
														}
													}
													arg0.aClass301_2 = null;
													return true;
												} else if (Class301.aClass301_16 == arg0.aClass301_2) {
													while (local6.anInt2803 * 62066237 < arg0.anInt2915 * -64841839) {
														local263 = local6.method20269();
														local1644 = (local263 & 0x1) == 1;
														local366 = local6.method20283();
														local376 = local6.method20283();
														local1670 = local6.method20283();
														for (local722 = 0; local722 < client.anInt3174 * 918731051; local722++) {
															@Pc(9027) Class123 local9027 = client.aClass123Array1[local722];
															if (local1644) {
																if (local376.equals(local9027.aString161)) {
																	local9027.aString161 = local366;
																	local9027.aString159 = local376;
																	local366 = null;
																	break;
																}
															} else if (local366.equals(local9027.aString161)) {
																local9027.aString161 = local366;
																local9027.aString159 = local376;
																local9027.aString160 = local1670;
																local366 = null;
																break;
															}
														}
														if (local366 != null && client.anInt3174 * 918731051 < 400) {
															@Pc(9074) Class123 local9074 = new Class123();
															client.aClass123Array1[client.anInt3174 * 918731051] = local9074;
															local9074.aString161 = local366;
															local9074.aString159 = local376;
															local9074.aString160 = local1670;
															local9074.aBoolean613 = (local263 & 0x2) == 2;
															client.anInt3174 += 649346435;
														}
													}
													client.anInt3052 = client.anInt3138 * 1482989417;
													arg0.aClass301_2 = null;
													return true;
												} else if (arg0.aClass301_2 == Class301.aClass301_141) {
													local263 = local6.method20324();
													local87 = local6.method20323();
													Class351.method26588();
													@Pc(9132) Class178 local9132 = Class375.method27235(local263);
													local9132.anInt3571 = local87 * -2130746285;
													arg0.aClass301_2 = null;
													return true;
												} else if (arg0.aClass301_2 == Class301.aClass301_117) {
													local263 = local6.method20313();
													@Pc(9153) int[] local9153 = new int[4];
													for (local659 = 0; local659 < 4; local659++) {
														local9153[local659] = local6.method20324();
													}
													local659 = local6.method20317();
													@Pc(9176) Class3_Sub29 local9176 = (Class3_Sub29) client.aClass581_21.method33217((long) local263);
													if (local9176 != null) {
														Class435.method27993((Class26_Sub1_Sub1_Sub1) local9176.anObject2, local9153, local659, true);
													}
													arg0.aClass301_2 = null;
													return true;
												} else if (Class301.aClass301_107 == arg0.aClass301_2) {
													Class2.anInt4 = local6.method20269() * 328467737;
													arg0.aClass301_2 = null;
													return true;
												} else if (Class301.aClass301_137 == arg0.aClass301_2) {
													Class523.anInt5297 = local6.method20269() * -1789954663;
													Class530.anInt5308 = (local6.method20390() << 3) * 1525822837;
													Class242.anInt3777 = (local6.method20308() << 3) * 1827897803;
													@Pc(9237) Class464 local9237 = client.aClass370_1.method26942();
													for (@Pc(9242) Class3_Sub13 local9242 = (Class3_Sub13) client.aClass581_19.method33221(); local9242 != null; local9242 = (Class3_Sub13) client.aClass581_19.method33231()) {
														local659 = (int) (local9242.aLong296 * -1930649055099428229L >> 28 & 0x3L);
														local663 = (int) (local9242.aLong296 * -1930649055099428229L & 0x3FFFL);
														local718 = local663 - local9237.anInt5071 * -1567811631;
														local722 = (int) (local9242.aLong296 * -1930649055099428229L >> 14 & 0x3FFFL);
														local726 = local722 - local9237.anInt5073 * 1360175441;
														if (Class523.anInt5297 * 790957737 == local659 && local718 >= Class242.anInt3777 * 364551139 && local718 < Class242.anInt3777 * 364551139 + 8 && local726 >= Class530.anInt5308 * 1522217693 && local726 < Class530.anInt5308 * 1522217693 + 8) {
															local9242.method33656();
															if (local718 >= 0 && local726 >= 0 && local718 < client.aClass370_1.method26943() && local726 < client.aClass370_1.method27062()) {
																Class356.method26653(Class523.anInt5297 * 790957737, local718, local726);
															}
														}
													}
													@Pc(9350) Class3_Sub7 local9350;
													for (local9350 = (Class3_Sub7) Class3_Sub7.aClass553_15.method32768(); local9350 != null; local9350 = (Class3_Sub7) Class3_Sub7.aClass553_15.method32709()) {
														if (local9350.anInt1187 * -1303695121 >= Class242.anInt3777 * 364551139 && local9350.anInt1187 * -1303695121 < Class242.anInt3777 * 364551139 + 8 && local9350.anInt1184 * -2103701847 >= Class530.anInt5308 * 1522217693 && local9350.anInt1184 * -2103701847 < Class530.anInt5308 * 1522217693 + 8 && Class523.anInt5297 * 790957737 == local9350.anInt1191 * -53574091) {
															local9350.aBoolean256 = true;
														}
													}
													for (local9350 = (Class3_Sub7) Class3_Sub7.aClass553_16.method32768(); local9350 != null; local9350 = (Class3_Sub7) Class3_Sub7.aClass553_16.method32709()) {
														if (local9350.anInt1187 * -1303695121 >= Class242.anInt3777 * 364551139 && local9350.anInt1187 * -1303695121 < Class242.anInt3777 * 364551139 + 8 && local9350.anInt1184 * -2103701847 >= Class530.anInt5308 * 1522217693 && local9350.anInt1184 * -2103701847 < Class530.anInt5308 * 1522217693 + 8 && local9350.anInt1191 * -53574091 == Class523.anInt5297 * 790957737) {
															local9350.aBoolean256 = true;
														}
													}
													arg0.aClass301_2 = null;
													return true;
												} else {
													Class27_Sub1.method7214((arg0.aClass301_2 == null ? -1 : arg0.aClass301_2.anInt4421 * -1607733701) + Class1.aString4 + (arg0.aClass301_1 == null ? -1 : arg0.aClass301_1.anInt4421 * -1607733701) + Class1.aString4 + (arg0.aClass301_4 == null ? -1 : arg0.aClass301_4.anInt4421 * -1607733701) + " " + arg0.anInt2915 * -64841839, new RuntimeException());
													Class394.method27445(false);
													return true;
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
		}
	}

	@OriginalMember(owner = "client!eg", name = "aaq", descriptor = "(Lclient!vs;I)V", line = 8773)
	static final void method23100(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local13 * local23;
	}

	@OriginalMember(owner = "client!eg", name = "apw", descriptor = "(Lclient!vs;I)V", line = 11717)
	static final void method23098(@OriginalArg(0) Class536 arg0) {
		Class434.method27991(0, 0, client.aClass178_12.anInt3498 * -1494060731, client.aClass178_12.anInt3499 * -751005789, false);
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = client.anInt3169 * -1579786087;
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = client.anInt3047 * -1546836989;
	}
}
