package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!zu")
public final class Class702 {

	@OriginalMember(owner = "client!zu", name = "l", descriptor = "I")
	static final int anInt5882 = 0;

	@OriginalMember(owner = "client!zu", name = "c", descriptor = "I")
	static final int anInt5883 = 16;

	@OriginalMember(owner = "client!zu", name = "t", descriptor = "I")
	static final int anInt5884 = 50;

	@OriginalMember(owner = "client!zu", name = "y", descriptor = "I")
	static final int anInt5885 = 1;

	@OriginalMember(owner = "client!zu", name = "v", descriptor = "I")
	static final int anInt5886 = 23;

	@OriginalMember(owner = "client!zu", name = "w", descriptor = "I")
	static final int anInt5887 = 6;

	@OriginalMember(owner = "client!zu", name = "p", descriptor = "I")
	static final int anInt5888 = 4096;

	@OriginalMember(owner = "client!zu", name = "q", descriptor = "Lclient!zb;")
	static Class685 aClass685_1 = new Class685();

	@OriginalMember(owner = "client!zu", name = "<init>", descriptor = "()V", line = 15)
	Class702() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!zu", name = "p", descriptor = "([BI[BII)I", line = 20)
	public static int method36499(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) Class685 local2 = aClass685_1;
		synchronized (aClass685_1) {
			aClass685_1.aByteArray107 = arg2;
			aClass685_1.anInt5853 = arg4 * -885442949;
			aClass685_1.aByteArray109 = arg0;
			aClass685_1.anInt5855 = 0;
			aClass685_1.anInt5865 = arg1 * 578387025;
			aClass685_1.anInt5859 = 0;
			aClass685_1.anInt5858 = 0;
			aClass685_1.anInt5847 = 0;
			aClass685_1.anInt5856 = 0;
			method36502(aClass685_1);
			@Pc(43) int local43 = arg1 - aClass685_1.anInt5865 * -968274767;
			aClass685_1.aByteArray107 = null;
			aClass685_1.aByteArray109 = null;
			return local43;
		}
	}

	@OriginalMember(owner = "client!zu", name = "c", descriptor = "(Lclient!zb;)V", line = 40)
	static void method36500(@OriginalArg(0) Class685 arg0) {
		@Pc(2) byte local2 = arg0.aByte177;
		@Pc(7) int local7 = arg0.anInt5854 * -223608861;
		@Pc(12) int local12 = arg0.anInt5862 * 439762289;
		@Pc(17) int local17 = arg0.anInt5864 * -1062608083;
		@Pc(19) int[] local19 = Class96_Sub14.anIntArray93;
		@Pc(24) int local24 = arg0.anInt5852 * 818213577;
		@Pc(27) byte[] local27 = arg0.aByteArray109;
		@Pc(32) int local32 = arg0.anInt5855 * 1586446913;
		@Pc(37) int local37 = arg0.anInt5865 * -968274767;
		@Pc(39) int local39 = local37;
		@Pc(46) int local46 = arg0.anInt5867 * -1821454345 + 1;
		label63: while (true) {
			if (local7 > 0) {
				while (true) {
					if (local37 == 0) {
						break label63;
					}
					if (local7 == 1) {
						if (local37 == 0) {
							local7 = 1;
							break label63;
						}
						local27[local32] = local2;
						local32++;
						local37--;
						break;
					}
					local27[local32] = local2;
					local7--;
					local32++;
					local37--;
				}
			}
			while (local12 != local46) {
				local2 = (byte) local17;
				local24 = local19[local24];
				@Pc(90) byte local90 = (byte) local24;
				local24 >>= 0x8;
				local12++;
				if (local90 == local17) {
					if (local12 != local46) {
						local7 = 2;
						local24 = local19[local24];
						local90 = (byte) local24;
						local24 >>= 0x8;
						local12++;
						if (local12 != local46) {
							if (local90 == local17) {
								local7 = 3;
								local24 = local19[local24];
								local90 = (byte) local24;
								local24 >>= 0x8;
								local12++;
								if (local12 != local46) {
									if (local90 == local17) {
										local24 = local19[local24];
										local90 = (byte) local24;
										local24 >>= 0x8;
										local12++;
										local7 = (local90 & 0xFF) + 4;
										local24 = local19[local24];
										local17 = (byte) local24;
										local24 >>= 0x8;
										local12++;
									} else {
										local17 = local90;
									}
								}
							} else {
								local17 = local90;
							}
						}
						continue label63;
					}
					if (local37 == 0) {
						local7 = 1;
						break label63;
					}
					local27[local32] = local2;
					local32++;
					local37--;
				} else {
					local17 = local90;
					if (local37 == 0) {
						local7 = 1;
						break label63;
					}
					local27[local32] = local2;
					local32++;
					local37--;
				}
			}
			local7 = 0;
			break;
		}
		@Pc(211) int local211 = arg0.anInt5856 * -306312173;
		arg0.anInt5856 += (local39 - local37) * -1499750885;
		if (arg0.anInt5856 * -306312173 < local211) {
		}
		arg0.aByte177 = local2;
		arg0.anInt5854 = local7 * 2134982091;
		arg0.anInt5862 = local12 * 1166861201;
		arg0.anInt5864 = local17 * 313484453;
		Class96_Sub14.anIntArray93 = local19;
		arg0.anInt5852 = local24 * -1455962247;
		arg0.aByteArray109 = local27;
		arg0.anInt5855 = local32 * 1873923521;
		arg0.anInt5865 = local37 * 578387025;
	}

	@OriginalMember(owner = "client!zu", name = "x", descriptor = "(Lclient!zb;)V", line = 40)
	static void method36501(@OriginalArg(0) Class685 arg0) {
		@Pc(2) byte local2 = arg0.aByte177;
		@Pc(7) int local7 = arg0.anInt5854 * -223608861;
		@Pc(12) int local12 = arg0.anInt5862 * 439762289;
		@Pc(17) int local17 = arg0.anInt5864 * -1062608083;
		@Pc(19) int[] local19 = Class96_Sub14.anIntArray93;
		@Pc(24) int local24 = arg0.anInt5852 * 818213577;
		@Pc(27) byte[] local27 = arg0.aByteArray109;
		@Pc(32) int local32 = arg0.anInt5855 * 1586446913;
		@Pc(37) int local37 = arg0.anInt5865 * -968274767;
		@Pc(39) int local39 = local37;
		@Pc(46) int local46 = arg0.anInt5867 * -1821454345 + 1;
		label63: while (true) {
			if (local7 > 0) {
				while (true) {
					if (local37 == 0) {
						break label63;
					}
					if (local7 == 1) {
						if (local37 == 0) {
							local7 = 1;
							break label63;
						}
						local27[local32] = local2;
						local32++;
						local37--;
						break;
					}
					local27[local32] = local2;
					local7--;
					local32++;
					local37--;
				}
			}
			while (local12 != local46) {
				local2 = (byte) local17;
				local24 = local19[local24];
				@Pc(90) byte local90 = (byte) local24;
				local24 >>= 0x8;
				local12++;
				if (local90 == local17) {
					if (local12 != local46) {
						local7 = 2;
						local24 = local19[local24];
						local90 = (byte) local24;
						local24 >>= 0x8;
						local12++;
						if (local12 != local46) {
							if (local90 == local17) {
								local7 = 3;
								local24 = local19[local24];
								local90 = (byte) local24;
								local24 >>= 0x8;
								local12++;
								if (local12 != local46) {
									if (local90 == local17) {
										local24 = local19[local24];
										local90 = (byte) local24;
										local24 >>= 0x8;
										local12++;
										local7 = (local90 & 0xFF) + 4;
										local24 = local19[local24];
										local17 = (byte) local24;
										local24 >>= 0x8;
										local12++;
									} else {
										local17 = local90;
									}
								}
							} else {
								local17 = local90;
							}
						}
						continue label63;
					}
					if (local37 == 0) {
						local7 = 1;
						break label63;
					}
					local27[local32] = local2;
					local32++;
					local37--;
				} else {
					local17 = local90;
					if (local37 == 0) {
						local7 = 1;
						break label63;
					}
					local27[local32] = local2;
					local32++;
					local37--;
				}
			}
			local7 = 0;
			break;
		}
		@Pc(211) int local211 = arg0.anInt5856 * -306312173;
		arg0.anInt5856 += (local39 - local37) * -1499750885;
		if (arg0.anInt5856 * -306312173 < local211) {
		}
		arg0.aByte177 = local2;
		arg0.anInt5854 = local7 * 2134982091;
		arg0.anInt5862 = local12 * 1166861201;
		arg0.anInt5864 = local17 * 313484453;
		Class96_Sub14.anIntArray93 = local19;
		arg0.anInt5852 = local24 * -1455962247;
		arg0.aByteArray109 = local27;
		arg0.anInt5855 = local32 * 1873923521;
		arg0.anInt5865 = local37 * 578387025;
	}

	@OriginalMember(owner = "client!zu", name = "v", descriptor = "(Lclient!zb;)V", line = 151)
	static void method36502(@OriginalArg(0) Class685 arg0) {
		@Pc(1) boolean local1 = false;
		@Pc(3) boolean local3 = false;
		@Pc(5) boolean local5 = false;
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(11) boolean local11 = false;
		@Pc(13) boolean local13 = false;
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) boolean local23 = false;
		@Pc(25) boolean local25 = false;
		@Pc(27) boolean local27 = false;
		@Pc(29) boolean local29 = false;
		@Pc(31) boolean local31 = false;
		@Pc(33) boolean local33 = false;
		@Pc(35) boolean local35 = false;
		@Pc(37) int local37 = 0;
		@Pc(39) int[] local39 = null;
		@Pc(41) int[] local41 = null;
		@Pc(43) int[] local43 = null;
		arg0.anInt5860 = -197864175;
		if (Class96_Sub14.anIntArray93 == null) {
			Class96_Sub14.anIntArray93 = new int[arg0.anInt5860 * 1120312480];
		}
		@Pc(56) boolean local56 = true;
		while (true) {
			while (local56) {
				@Pc(61) byte local61 = method36507(arg0);
				if (local61 == 23) {
					return;
				}
				local61 = method36507(arg0);
				local61 = method36507(arg0);
				local61 = method36507(arg0);
				local61 = method36507(arg0);
				local61 = method36507(arg0);
				local61 = method36507(arg0);
				local61 = method36507(arg0);
				local61 = method36507(arg0);
				local61 = method36507(arg0);
				local61 = method36512(arg0);
				if (local61 != 0) {
				}
				arg0.anInt5861 = 0;
				local61 = method36507(arg0);
				arg0.anInt5861 = (arg0.anInt5861 * -1121734515 << 8 | local61 & 0xFF) * -206204347;
				local61 = method36507(arg0);
				arg0.anInt5861 = (arg0.anInt5861 * -1121734515 << 8 | local61 & 0xFF) * -206204347;
				local61 = method36507(arg0);
				arg0.anInt5861 = (arg0.anInt5861 * -1121734515 << 8 | local61 & 0xFF) * -206204347;
				@Pc(153) int local153;
				for (local153 = 0; local153 < 16; local153++) {
					local61 = method36512(arg0);
					if (local61 == 1) {
						arg0.aBooleanArray35[local153] = true;
					} else {
						arg0.aBooleanArray35[local153] = false;
					}
				}
				for (local153 = 0; local153 < 256; local153++) {
					arg0.aBooleanArray34[local153] = false;
				}
				@Pc(199) int local199;
				for (local153 = 0; local153 < 16; local153++) {
					if (arg0.aBooleanArray35[local153]) {
						for (local199 = 0; local199 < 16; local199++) {
							local61 = method36512(arg0);
							if (local61 == 1) {
								arg0.aBooleanArray34[local153 * 16 + local199] = true;
							}
						}
					}
				}
				method36516(arg0);
				@Pc(230) int local230 = arg0.anInt5863 * 1834749779 + 2;
				@Pc(234) int local234 = method36514(3, arg0);
				@Pc(238) int local238 = method36514(15, arg0);
				for (local153 = 0; local153 < local238; local153++) {
					local199 = 0;
					while (true) {
						local61 = method36512(arg0);
						if (local61 == 0) {
							arg0.aByteArray111[local153] = (byte) local199;
							break;
						}
						local199++;
					}
				}
				@Pc(264) byte[] local264 = new byte[6];
				@Pc(266) byte local266 = 0;
				while (local266 < local234) {
					local264[local266] = local266++;
				}
				for (local153 = 0; local153 < local238; local153++) {
					local266 = arg0.aByteArray111[local153];
					@Pc(293) byte local293 = local264[local266];
					while (local266 > 0) {
						local264[local266] = local264[local266 - 1];
						local266--;
					}
					local264[0] = local293;
					arg0.aByteArray112[local153] = local293;
				}
				@Pc(322) int local322;
				for (local322 = 0; local322 < local234; local322++) {
					@Pc(329) int local329 = method36514(5, arg0);
					for (local153 = 0; local153 < local230; local153++) {
						while (true) {
							local61 = method36512(arg0);
							if (local61 == 0) {
								arg0.aByteArrayArray25[local322][local153] = (byte) local329;
								break;
							}
							local61 = method36512(arg0);
							if (local61 == 0) {
								local329++;
							} else {
								local329--;
							}
						}
					}
				}
				for (local322 = 0; local322 < local234; local322++) {
					@Pc(368) byte local368 = 32;
					@Pc(370) byte local370 = 0;
					for (local153 = 0; local153 < local230; local153++) {
						if (arg0.aByteArrayArray25[local322][local153] > local370) {
							local370 = arg0.aByteArrayArray25[local322][local153];
						}
						if (arg0.aByteArrayArray25[local322][local153] < local368) {
							local368 = arg0.aByteArrayArray25[local322][local153];
						}
					}
					method36520(arg0.anIntArrayArray66[local322], arg0.anIntArrayArray67[local322], arg0.anIntArrayArray65[local322], arg0.aByteArrayArray25[local322], local368, local370, local230);
					arg0.anIntArray542[local322] = local368;
				}
				@Pc(441) int local441 = arg0.anInt5863 * 1834749779 + 1;
				@Pc(443) int local443 = -1;
				@Pc(445) byte local445 = 0;
				for (local153 = 0; local153 <= 255; local153++) {
					arg0.anIntArray539[local153] = 0;
				}
				@Pc(459) int local459 = 4095;
				@Pc(461) int local461;
				@Pc(465) int local465;
				for (local461 = 15; local461 >= 0; local461--) {
					for (local465 = 15; local465 >= 0; local465--) {
						arg0.aByteArray110[local459] = (byte) (local461 * 16 + local465);
						local459--;
					}
					arg0.anIntArray541[local461] = local459 + 1;
				}
				@Pc(491) int local491 = 0;
				@Pc(501) byte local501;
				if (local445 == 0) {
					local443++;
					local445 = 50;
					local501 = arg0.aByteArray112[local443];
					local37 = arg0.anIntArray542[local501];
					local39 = arg0.anIntArrayArray66[local501];
					local43 = arg0.anIntArrayArray65[local501];
					local41 = arg0.anIntArrayArray67[local501];
				}
				@Pc(522) int local522 = local445 - 1;
				@Pc(524) int local524 = local37;
				@Pc(528) int local528;
				@Pc(538) byte local538;
				for (local528 = method36514(local37, arg0); local528 > local39[local524]; local528 = local528 << 1 | local538) {
					local524++;
					local538 = method36512(arg0);
				}
				@Pc(553) int local553 = local43[local528 - local41[local524]];
				while (true) {
					while (local553 != local441) {
						if (local553 == 0 || local553 == 1) {
							@Pc(564) int local564 = -1;
							@Pc(566) int local566 = 1;
							do {
								if (local553 == 0) {
									local564 += local566;
								} else if (local553 == 1) {
									local564 += local566 * 2;
								}
								local566 *= 2;
								if (local522 == 0) {
									local443++;
									local522 = 50;
									local501 = arg0.aByteArray112[local443];
									local37 = arg0.anIntArray542[local501];
									local39 = arg0.anIntArrayArray66[local501];
									local43 = arg0.anIntArrayArray65[local501];
									local41 = arg0.anIntArrayArray67[local501];
								}
								local522--;
								local524 = local37;
								for (local528 = method36514(local37, arg0); local528 > local39[local524]; local528 = local528 << 1 | local538) {
									local524++;
									local538 = method36512(arg0);
								}
								local553 = local43[local528 - local41[local524]];
							} while (local553 == 0 || local553 == 1);
							local564++;
							local61 = arg0.aByteArray108[arg0.aByteArray110[arg0.anIntArray541[0]] & 0xFF];
							arg0.anIntArray539[local61 & 0xFF] += local564;
							while (local564 > 0) {
								Class96_Sub14.anIntArray93[local491] = local61 & 0xFF;
								local491++;
								local564--;
							}
						} else {
							@Pc(694) int local694 = local553 - 1;
							@Pc(702) int local702;
							if (local694 < 16) {
								local702 = arg0.anIntArray541[0];
								local61 = arg0.aByteArray110[local702 + local694];
								while (local694 > 3) {
									@Pc(716) int local716 = local702 + local694;
									arg0.aByteArray110[local716] = arg0.aByteArray110[local716 - 1];
									arg0.aByteArray110[local716 - 1] = arg0.aByteArray110[local716 - 2];
									arg0.aByteArray110[local716 - 2] = arg0.aByteArray110[local716 - 3];
									arg0.aByteArray110[local716 - 3] = arg0.aByteArray110[local716 - 4];
									local694 -= 4;
								}
								while (local694 > 0) {
									arg0.aByteArray110[local702 + local694] = arg0.aByteArray110[local702 + local694 - 1];
									local694--;
								}
								arg0.aByteArray110[local702] = local61;
							} else {
								@Pc(792) int local792 = local694 / 16;
								@Pc(796) int local796 = local694 % 16;
								local702 = arg0.anIntArray541[local792] + local796;
								local61 = arg0.aByteArray110[local702];
								while (local702 > arg0.anIntArray541[local792]) {
									arg0.aByteArray110[local702] = arg0.aByteArray110[local702 - 1];
									local702--;
								}
								@Pc(831) int local831 = arg0.anIntArray541[local792]++;
								while (local792 > 0) {
									local831 = arg0.anIntArray541[local792]--;
									arg0.aByteArray110[arg0.anIntArray541[local792]] = arg0.aByteArray110[arg0.anIntArray541[local792 - 1] + 16 - 1];
									local792--;
								}
								local831 = arg0.anIntArray541[0]--;
								arg0.aByteArray110[arg0.anIntArray541[0]] = local61;
								if (arg0.anIntArray541[0] == 0) {
									local459 = 4095;
									for (local461 = 15; local461 >= 0; local461--) {
										for (local465 = 15; local465 >= 0; local465--) {
											arg0.aByteArray110[local459] = arg0.aByteArray110[arg0.anIntArray541[local461] + local465];
											local459--;
										}
										arg0.anIntArray541[local461] = local459 + 1;
									}
								}
							}
							arg0.anIntArray539[arg0.aByteArray108[local61 & 0xFF] & 0xFF]++;
							Class96_Sub14.anIntArray93[local491] = arg0.aByteArray108[local61 & 0xFF] & 0xFF;
							local491++;
							if (local522 == 0) {
								local443++;
								local522 = 50;
								local501 = arg0.aByteArray112[local443];
								local37 = arg0.anIntArray542[local501];
								local39 = arg0.anIntArrayArray66[local501];
								local43 = arg0.anIntArrayArray65[local501];
								local41 = arg0.anIntArrayArray67[local501];
							}
							local522--;
							local524 = local37;
							for (local528 = method36514(local37, arg0); local528 > local39[local524]; local528 = local528 << 1 | local538) {
								local524++;
								local538 = method36512(arg0);
							}
							local553 = local43[local528 - local41[local524]];
						}
					}
					arg0.anInt5854 = 0;
					arg0.aByte177 = 0;
					arg0.anIntArray540[0] = 0;
					for (local153 = 1; local153 <= 256; local153++) {
						arg0.anIntArray540[local153] = arg0.anIntArray539[local153 - 1];
					}
					for (local153 = 1; local153 <= 256; local153++) {
						arg0.anIntArray540[local153] += arg0.anIntArray540[local153 - 1];
					}
					for (local153 = 0; local153 < local491; local153++) {
						local61 = (byte) (Class96_Sub14.anIntArray93[local153] & 0xFF);
						Class96_Sub14.anIntArray93[arg0.anIntArray540[local61 & 0xFF]] |= local153 << 8;
						arg0.anIntArray540[local61 & 0xFF]++;
					}
					arg0.anInt5852 = (Class96_Sub14.anIntArray93[arg0.anInt5861 * -1121734515] >> 8) * -1455962247;
					arg0.anInt5862 = 0;
					arg0.anInt5852 = Class96_Sub14.anIntArray93[arg0.anInt5852 * 818213577] * -1455962247;
					arg0.anInt5864 = (byte) (arg0.anInt5852 * 818213577 & 0xFF) * 313484453;
					arg0.anInt5852 = (arg0.anInt5852 * 818213577 >> 8) * -1455962247;
					arg0.anInt5862 += 1166861201;
					arg0.anInt5867 = local491 * 1274978759;
					method36500(arg0);
					if (arg0.anInt5862 * 439762289 == arg0.anInt5867 * -1821454345 + 1 && arg0.anInt5854 * -223608861 == 0) {
						local56 = true;
						break;
					}
					local56 = false;
					break;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!zu", name = "d", descriptor = "(Lclient!zb;)V", line = 151)
	static void method36503(@OriginalArg(0) Class685 arg0) {
		@Pc(1) boolean local1 = false;
		@Pc(3) boolean local3 = false;
		@Pc(5) boolean local5 = false;
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(11) boolean local11 = false;
		@Pc(13) boolean local13 = false;
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) boolean local23 = false;
		@Pc(25) boolean local25 = false;
		@Pc(27) boolean local27 = false;
		@Pc(29) boolean local29 = false;
		@Pc(31) boolean local31 = false;
		@Pc(33) boolean local33 = false;
		@Pc(35) boolean local35 = false;
		@Pc(37) int local37 = 0;
		@Pc(39) int[] local39 = null;
		@Pc(41) int[] local41 = null;
		@Pc(43) int[] local43 = null;
		arg0.anInt5860 = -197864175;
		if (Class96_Sub14.anIntArray93 == null) {
			Class96_Sub14.anIntArray93 = new int[arg0.anInt5860 * 1120312480];
		}
		@Pc(56) boolean local56 = true;
		while (true) {
			while (local56) {
				@Pc(61) byte local61 = method36507(arg0);
				if (local61 == 23) {
					return;
				}
				local61 = method36507(arg0);
				local61 = method36507(arg0);
				local61 = method36507(arg0);
				local61 = method36507(arg0);
				local61 = method36507(arg0);
				local61 = method36507(arg0);
				local61 = method36507(arg0);
				local61 = method36507(arg0);
				local61 = method36507(arg0);
				local61 = method36512(arg0);
				if (local61 != 0) {
				}
				arg0.anInt5861 = 0;
				local61 = method36507(arg0);
				arg0.anInt5861 = (arg0.anInt5861 * -1121734515 << 8 | local61 & 0xFF) * -206204347;
				local61 = method36507(arg0);
				arg0.anInt5861 = (arg0.anInt5861 * -1121734515 << 8 | local61 & 0xFF) * -206204347;
				local61 = method36507(arg0);
				arg0.anInt5861 = (arg0.anInt5861 * -1121734515 << 8 | local61 & 0xFF) * -206204347;
				@Pc(153) int local153;
				for (local153 = 0; local153 < 16; local153++) {
					local61 = method36512(arg0);
					if (local61 == 1) {
						arg0.aBooleanArray35[local153] = true;
					} else {
						arg0.aBooleanArray35[local153] = false;
					}
				}
				for (local153 = 0; local153 < 256; local153++) {
					arg0.aBooleanArray34[local153] = false;
				}
				@Pc(199) int local199;
				for (local153 = 0; local153 < 16; local153++) {
					if (arg0.aBooleanArray35[local153]) {
						for (local199 = 0; local199 < 16; local199++) {
							local61 = method36512(arg0);
							if (local61 == 1) {
								arg0.aBooleanArray34[local153 * 16 + local199] = true;
							}
						}
					}
				}
				method36516(arg0);
				@Pc(230) int local230 = arg0.anInt5863 * 1834749779 + 2;
				@Pc(234) int local234 = method36514(3, arg0);
				@Pc(238) int local238 = method36514(15, arg0);
				for (local153 = 0; local153 < local238; local153++) {
					local199 = 0;
					while (true) {
						local61 = method36512(arg0);
						if (local61 == 0) {
							arg0.aByteArray111[local153] = (byte) local199;
							break;
						}
						local199++;
					}
				}
				@Pc(264) byte[] local264 = new byte[6];
				@Pc(266) byte local266 = 0;
				while (local266 < local234) {
					local264[local266] = local266++;
				}
				for (local153 = 0; local153 < local238; local153++) {
					local266 = arg0.aByteArray111[local153];
					@Pc(293) byte local293 = local264[local266];
					while (local266 > 0) {
						local264[local266] = local264[local266 - 1];
						local266--;
					}
					local264[0] = local293;
					arg0.aByteArray112[local153] = local293;
				}
				@Pc(322) int local322;
				for (local322 = 0; local322 < local234; local322++) {
					@Pc(329) int local329 = method36514(5, arg0);
					for (local153 = 0; local153 < local230; local153++) {
						while (true) {
							local61 = method36512(arg0);
							if (local61 == 0) {
								arg0.aByteArrayArray25[local322][local153] = (byte) local329;
								break;
							}
							local61 = method36512(arg0);
							if (local61 == 0) {
								local329++;
							} else {
								local329--;
							}
						}
					}
				}
				for (local322 = 0; local322 < local234; local322++) {
					@Pc(368) byte local368 = 32;
					@Pc(370) byte local370 = 0;
					for (local153 = 0; local153 < local230; local153++) {
						if (arg0.aByteArrayArray25[local322][local153] > local370) {
							local370 = arg0.aByteArrayArray25[local322][local153];
						}
						if (arg0.aByteArrayArray25[local322][local153] < local368) {
							local368 = arg0.aByteArrayArray25[local322][local153];
						}
					}
					method36520(arg0.anIntArrayArray66[local322], arg0.anIntArrayArray67[local322], arg0.anIntArrayArray65[local322], arg0.aByteArrayArray25[local322], local368, local370, local230);
					arg0.anIntArray542[local322] = local368;
				}
				@Pc(441) int local441 = arg0.anInt5863 * 1834749779 + 1;
				@Pc(443) int local443 = -1;
				@Pc(445) byte local445 = 0;
				for (local153 = 0; local153 <= 255; local153++) {
					arg0.anIntArray539[local153] = 0;
				}
				@Pc(459) int local459 = 4095;
				@Pc(461) int local461;
				@Pc(465) int local465;
				for (local461 = 15; local461 >= 0; local461--) {
					for (local465 = 15; local465 >= 0; local465--) {
						arg0.aByteArray110[local459] = (byte) (local461 * 16 + local465);
						local459--;
					}
					arg0.anIntArray541[local461] = local459 + 1;
				}
				@Pc(491) int local491 = 0;
				@Pc(501) byte local501;
				if (local445 == 0) {
					local443++;
					local445 = 50;
					local501 = arg0.aByteArray112[local443];
					local37 = arg0.anIntArray542[local501];
					local39 = arg0.anIntArrayArray66[local501];
					local43 = arg0.anIntArrayArray65[local501];
					local41 = arg0.anIntArrayArray67[local501];
				}
				@Pc(522) int local522 = local445 - 1;
				@Pc(524) int local524 = local37;
				@Pc(528) int local528;
				@Pc(538) byte local538;
				for (local528 = method36514(local37, arg0); local528 > local39[local524]; local528 = local528 << 1 | local538) {
					local524++;
					local538 = method36512(arg0);
				}
				@Pc(553) int local553 = local43[local528 - local41[local524]];
				while (true) {
					while (local553 != local441) {
						if (local553 == 0 || local553 == 1) {
							@Pc(564) int local564 = -1;
							@Pc(566) int local566 = 1;
							do {
								if (local553 == 0) {
									local564 += local566;
								} else if (local553 == 1) {
									local564 += local566 * 2;
								}
								local566 *= 2;
								if (local522 == 0) {
									local443++;
									local522 = 50;
									local501 = arg0.aByteArray112[local443];
									local37 = arg0.anIntArray542[local501];
									local39 = arg0.anIntArrayArray66[local501];
									local43 = arg0.anIntArrayArray65[local501];
									local41 = arg0.anIntArrayArray67[local501];
								}
								local522--;
								local524 = local37;
								for (local528 = method36514(local37, arg0); local528 > local39[local524]; local528 = local528 << 1 | local538) {
									local524++;
									local538 = method36512(arg0);
								}
								local553 = local43[local528 - local41[local524]];
							} while (local553 == 0 || local553 == 1);
							local564++;
							local61 = arg0.aByteArray108[arg0.aByteArray110[arg0.anIntArray541[0]] & 0xFF];
							arg0.anIntArray539[local61 & 0xFF] += local564;
							while (local564 > 0) {
								Class96_Sub14.anIntArray93[local491] = local61 & 0xFF;
								local491++;
								local564--;
							}
						} else {
							@Pc(694) int local694 = local553 - 1;
							@Pc(702) int local702;
							if (local694 < 16) {
								local702 = arg0.anIntArray541[0];
								local61 = arg0.aByteArray110[local702 + local694];
								while (local694 > 3) {
									@Pc(716) int local716 = local702 + local694;
									arg0.aByteArray110[local716] = arg0.aByteArray110[local716 - 1];
									arg0.aByteArray110[local716 - 1] = arg0.aByteArray110[local716 - 2];
									arg0.aByteArray110[local716 - 2] = arg0.aByteArray110[local716 - 3];
									arg0.aByteArray110[local716 - 3] = arg0.aByteArray110[local716 - 4];
									local694 -= 4;
								}
								while (local694 > 0) {
									arg0.aByteArray110[local702 + local694] = arg0.aByteArray110[local702 + local694 - 1];
									local694--;
								}
								arg0.aByteArray110[local702] = local61;
							} else {
								@Pc(792) int local792 = local694 / 16;
								@Pc(796) int local796 = local694 % 16;
								local702 = arg0.anIntArray541[local792] + local796;
								local61 = arg0.aByteArray110[local702];
								while (local702 > arg0.anIntArray541[local792]) {
									arg0.aByteArray110[local702] = arg0.aByteArray110[local702 - 1];
									local702--;
								}
								@Pc(831) int local831 = arg0.anIntArray541[local792]++;
								while (local792 > 0) {
									local831 = arg0.anIntArray541[local792]--;
									arg0.aByteArray110[arg0.anIntArray541[local792]] = arg0.aByteArray110[arg0.anIntArray541[local792 - 1] + 16 - 1];
									local792--;
								}
								local831 = arg0.anIntArray541[0]--;
								arg0.aByteArray110[arg0.anIntArray541[0]] = local61;
								if (arg0.anIntArray541[0] == 0) {
									local459 = 4095;
									for (local461 = 15; local461 >= 0; local461--) {
										for (local465 = 15; local465 >= 0; local465--) {
											arg0.aByteArray110[local459] = arg0.aByteArray110[arg0.anIntArray541[local461] + local465];
											local459--;
										}
										arg0.anIntArray541[local461] = local459 + 1;
									}
								}
							}
							arg0.anIntArray539[arg0.aByteArray108[local61 & 0xFF] & 0xFF]++;
							Class96_Sub14.anIntArray93[local491] = arg0.aByteArray108[local61 & 0xFF] & 0xFF;
							local491++;
							if (local522 == 0) {
								local443++;
								local522 = 50;
								local501 = arg0.aByteArray112[local443];
								local37 = arg0.anIntArray542[local501];
								local39 = arg0.anIntArrayArray66[local501];
								local43 = arg0.anIntArrayArray65[local501];
								local41 = arg0.anIntArrayArray67[local501];
							}
							local522--;
							local524 = local37;
							for (local528 = method36514(local37, arg0); local528 > local39[local524]; local528 = local528 << 1 | local538) {
								local524++;
								local538 = method36512(arg0);
							}
							local553 = local43[local528 - local41[local524]];
						}
					}
					arg0.anInt5854 = 0;
					arg0.aByte177 = 0;
					arg0.anIntArray540[0] = 0;
					for (local153 = 1; local153 <= 256; local153++) {
						arg0.anIntArray540[local153] = arg0.anIntArray539[local153 - 1];
					}
					for (local153 = 1; local153 <= 256; local153++) {
						arg0.anIntArray540[local153] += arg0.anIntArray540[local153 - 1];
					}
					for (local153 = 0; local153 < local491; local153++) {
						local61 = (byte) (Class96_Sub14.anIntArray93[local153] & 0xFF);
						Class96_Sub14.anIntArray93[arg0.anIntArray540[local61 & 0xFF]] |= local153 << 8;
						arg0.anIntArray540[local61 & 0xFF]++;
					}
					arg0.anInt5852 = (Class96_Sub14.anIntArray93[arg0.anInt5861 * -1121734515] >> 8) * -1455962247;
					arg0.anInt5862 = 0;
					arg0.anInt5852 = Class96_Sub14.anIntArray93[arg0.anInt5852 * 818213577] * -1455962247;
					arg0.anInt5864 = (byte) (arg0.anInt5852 * 818213577 & 0xFF) * 313484453;
					arg0.anInt5852 = (arg0.anInt5852 * 818213577 >> 8) * -1455962247;
					arg0.anInt5862 += 1166861201;
					arg0.anInt5867 = local491 * 1274978759;
					method36500(arg0);
					if (arg0.anInt5862 * 439762289 == arg0.anInt5867 * -1821454345 + 1 && arg0.anInt5854 * -223608861 == 0) {
						local56 = true;
						break;
					}
					local56 = false;
					break;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!zu", name = "s", descriptor = "(Lclient!zb;)V", line = 151)
	static void method36504(@OriginalArg(0) Class685 arg0) {
		@Pc(1) boolean local1 = false;
		@Pc(3) boolean local3 = false;
		@Pc(5) boolean local5 = false;
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(11) boolean local11 = false;
		@Pc(13) boolean local13 = false;
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) boolean local23 = false;
		@Pc(25) boolean local25 = false;
		@Pc(27) boolean local27 = false;
		@Pc(29) boolean local29 = false;
		@Pc(31) boolean local31 = false;
		@Pc(33) boolean local33 = false;
		@Pc(35) boolean local35 = false;
		@Pc(37) int local37 = 0;
		@Pc(39) int[] local39 = null;
		@Pc(41) int[] local41 = null;
		@Pc(43) int[] local43 = null;
		arg0.anInt5860 = -197864175;
		if (Class96_Sub14.anIntArray93 == null) {
			Class96_Sub14.anIntArray93 = new int[arg0.anInt5860 * 1120312480];
		}
		@Pc(56) boolean local56 = true;
		while (true) {
			while (local56) {
				@Pc(61) byte local61 = method36507(arg0);
				if (local61 == 23) {
					return;
				}
				local61 = method36507(arg0);
				local61 = method36507(arg0);
				local61 = method36507(arg0);
				local61 = method36507(arg0);
				local61 = method36507(arg0);
				local61 = method36507(arg0);
				local61 = method36507(arg0);
				local61 = method36507(arg0);
				local61 = method36507(arg0);
				local61 = method36512(arg0);
				if (local61 != 0) {
				}
				arg0.anInt5861 = 0;
				local61 = method36507(arg0);
				arg0.anInt5861 = (arg0.anInt5861 * -1121734515 << 8 | local61 & 0xFF) * -206204347;
				local61 = method36507(arg0);
				arg0.anInt5861 = (arg0.anInt5861 * -1121734515 << 8 | local61 & 0xFF) * -206204347;
				local61 = method36507(arg0);
				arg0.anInt5861 = (arg0.anInt5861 * -1121734515 << 8 | local61 & 0xFF) * -206204347;
				@Pc(153) int local153;
				for (local153 = 0; local153 < 16; local153++) {
					local61 = method36512(arg0);
					if (local61 == 1) {
						arg0.aBooleanArray35[local153] = true;
					} else {
						arg0.aBooleanArray35[local153] = false;
					}
				}
				for (local153 = 0; local153 < 256; local153++) {
					arg0.aBooleanArray34[local153] = false;
				}
				@Pc(199) int local199;
				for (local153 = 0; local153 < 16; local153++) {
					if (arg0.aBooleanArray35[local153]) {
						for (local199 = 0; local199 < 16; local199++) {
							local61 = method36512(arg0);
							if (local61 == 1) {
								arg0.aBooleanArray34[local153 * 16 + local199] = true;
							}
						}
					}
				}
				method36516(arg0);
				@Pc(230) int local230 = arg0.anInt5863 * 1834749779 + 2;
				@Pc(234) int local234 = method36514(3, arg0);
				@Pc(238) int local238 = method36514(15, arg0);
				for (local153 = 0; local153 < local238; local153++) {
					local199 = 0;
					while (true) {
						local61 = method36512(arg0);
						if (local61 == 0) {
							arg0.aByteArray111[local153] = (byte) local199;
							break;
						}
						local199++;
					}
				}
				@Pc(264) byte[] local264 = new byte[6];
				@Pc(266) byte local266 = 0;
				while (local266 < local234) {
					local264[local266] = local266++;
				}
				for (local153 = 0; local153 < local238; local153++) {
					local266 = arg0.aByteArray111[local153];
					@Pc(293) byte local293 = local264[local266];
					while (local266 > 0) {
						local264[local266] = local264[local266 - 1];
						local266--;
					}
					local264[0] = local293;
					arg0.aByteArray112[local153] = local293;
				}
				@Pc(322) int local322;
				for (local322 = 0; local322 < local234; local322++) {
					@Pc(329) int local329 = method36514(5, arg0);
					for (local153 = 0; local153 < local230; local153++) {
						while (true) {
							local61 = method36512(arg0);
							if (local61 == 0) {
								arg0.aByteArrayArray25[local322][local153] = (byte) local329;
								break;
							}
							local61 = method36512(arg0);
							if (local61 == 0) {
								local329++;
							} else {
								local329--;
							}
						}
					}
				}
				for (local322 = 0; local322 < local234; local322++) {
					@Pc(368) byte local368 = 32;
					@Pc(370) byte local370 = 0;
					for (local153 = 0; local153 < local230; local153++) {
						if (arg0.aByteArrayArray25[local322][local153] > local370) {
							local370 = arg0.aByteArrayArray25[local322][local153];
						}
						if (arg0.aByteArrayArray25[local322][local153] < local368) {
							local368 = arg0.aByteArrayArray25[local322][local153];
						}
					}
					method36520(arg0.anIntArrayArray66[local322], arg0.anIntArrayArray67[local322], arg0.anIntArrayArray65[local322], arg0.aByteArrayArray25[local322], local368, local370, local230);
					arg0.anIntArray542[local322] = local368;
				}
				@Pc(441) int local441 = arg0.anInt5863 * 1834749779 + 1;
				@Pc(443) int local443 = -1;
				@Pc(445) byte local445 = 0;
				for (local153 = 0; local153 <= 255; local153++) {
					arg0.anIntArray539[local153] = 0;
				}
				@Pc(459) int local459 = 4095;
				@Pc(461) int local461;
				@Pc(465) int local465;
				for (local461 = 15; local461 >= 0; local461--) {
					for (local465 = 15; local465 >= 0; local465--) {
						arg0.aByteArray110[local459] = (byte) (local461 * 16 + local465);
						local459--;
					}
					arg0.anIntArray541[local461] = local459 + 1;
				}
				@Pc(491) int local491 = 0;
				@Pc(501) byte local501;
				if (local445 == 0) {
					local443++;
					local445 = 50;
					local501 = arg0.aByteArray112[local443];
					local37 = arg0.anIntArray542[local501];
					local39 = arg0.anIntArrayArray66[local501];
					local43 = arg0.anIntArrayArray65[local501];
					local41 = arg0.anIntArrayArray67[local501];
				}
				@Pc(522) int local522 = local445 - 1;
				@Pc(524) int local524 = local37;
				@Pc(528) int local528;
				@Pc(538) byte local538;
				for (local528 = method36514(local37, arg0); local528 > local39[local524]; local528 = local528 << 1 | local538) {
					local524++;
					local538 = method36512(arg0);
				}
				@Pc(553) int local553 = local43[local528 - local41[local524]];
				while (true) {
					while (local553 != local441) {
						if (local553 == 0 || local553 == 1) {
							@Pc(564) int local564 = -1;
							@Pc(566) int local566 = 1;
							do {
								if (local553 == 0) {
									local564 += local566;
								} else if (local553 == 1) {
									local564 += local566 * 2;
								}
								local566 *= 2;
								if (local522 == 0) {
									local443++;
									local522 = 50;
									local501 = arg0.aByteArray112[local443];
									local37 = arg0.anIntArray542[local501];
									local39 = arg0.anIntArrayArray66[local501];
									local43 = arg0.anIntArrayArray65[local501];
									local41 = arg0.anIntArrayArray67[local501];
								}
								local522--;
								local524 = local37;
								for (local528 = method36514(local37, arg0); local528 > local39[local524]; local528 = local528 << 1 | local538) {
									local524++;
									local538 = method36512(arg0);
								}
								local553 = local43[local528 - local41[local524]];
							} while (local553 == 0 || local553 == 1);
							local564++;
							local61 = arg0.aByteArray108[arg0.aByteArray110[arg0.anIntArray541[0]] & 0xFF];
							arg0.anIntArray539[local61 & 0xFF] += local564;
							while (local564 > 0) {
								Class96_Sub14.anIntArray93[local491] = local61 & 0xFF;
								local491++;
								local564--;
							}
						} else {
							@Pc(694) int local694 = local553 - 1;
							@Pc(702) int local702;
							if (local694 < 16) {
								local702 = arg0.anIntArray541[0];
								local61 = arg0.aByteArray110[local702 + local694];
								while (local694 > 3) {
									@Pc(716) int local716 = local702 + local694;
									arg0.aByteArray110[local716] = arg0.aByteArray110[local716 - 1];
									arg0.aByteArray110[local716 - 1] = arg0.aByteArray110[local716 - 2];
									arg0.aByteArray110[local716 - 2] = arg0.aByteArray110[local716 - 3];
									arg0.aByteArray110[local716 - 3] = arg0.aByteArray110[local716 - 4];
									local694 -= 4;
								}
								while (local694 > 0) {
									arg0.aByteArray110[local702 + local694] = arg0.aByteArray110[local702 + local694 - 1];
									local694--;
								}
								arg0.aByteArray110[local702] = local61;
							} else {
								@Pc(792) int local792 = local694 / 16;
								@Pc(796) int local796 = local694 % 16;
								local702 = arg0.anIntArray541[local792] + local796;
								local61 = arg0.aByteArray110[local702];
								while (local702 > arg0.anIntArray541[local792]) {
									arg0.aByteArray110[local702] = arg0.aByteArray110[local702 - 1];
									local702--;
								}
								@Pc(831) int local831 = arg0.anIntArray541[local792]++;
								while (local792 > 0) {
									local831 = arg0.anIntArray541[local792]--;
									arg0.aByteArray110[arg0.anIntArray541[local792]] = arg0.aByteArray110[arg0.anIntArray541[local792 - 1] + 16 - 1];
									local792--;
								}
								local831 = arg0.anIntArray541[0]--;
								arg0.aByteArray110[arg0.anIntArray541[0]] = local61;
								if (arg0.anIntArray541[0] == 0) {
									local459 = 4095;
									for (local461 = 15; local461 >= 0; local461--) {
										for (local465 = 15; local465 >= 0; local465--) {
											arg0.aByteArray110[local459] = arg0.aByteArray110[arg0.anIntArray541[local461] + local465];
											local459--;
										}
										arg0.anIntArray541[local461] = local459 + 1;
									}
								}
							}
							arg0.anIntArray539[arg0.aByteArray108[local61 & 0xFF] & 0xFF]++;
							Class96_Sub14.anIntArray93[local491] = arg0.aByteArray108[local61 & 0xFF] & 0xFF;
							local491++;
							if (local522 == 0) {
								local443++;
								local522 = 50;
								local501 = arg0.aByteArray112[local443];
								local37 = arg0.anIntArray542[local501];
								local39 = arg0.anIntArrayArray66[local501];
								local43 = arg0.anIntArrayArray65[local501];
								local41 = arg0.anIntArrayArray67[local501];
							}
							local522--;
							local524 = local37;
							for (local528 = method36514(local37, arg0); local528 > local39[local524]; local528 = local528 << 1 | local538) {
								local524++;
								local538 = method36512(arg0);
							}
							local553 = local43[local528 - local41[local524]];
						}
					}
					arg0.anInt5854 = 0;
					arg0.aByte177 = 0;
					arg0.anIntArray540[0] = 0;
					for (local153 = 1; local153 <= 256; local153++) {
						arg0.anIntArray540[local153] = arg0.anIntArray539[local153 - 1];
					}
					for (local153 = 1; local153 <= 256; local153++) {
						arg0.anIntArray540[local153] += arg0.anIntArray540[local153 - 1];
					}
					for (local153 = 0; local153 < local491; local153++) {
						local61 = (byte) (Class96_Sub14.anIntArray93[local153] & 0xFF);
						Class96_Sub14.anIntArray93[arg0.anIntArray540[local61 & 0xFF]] |= local153 << 8;
						arg0.anIntArray540[local61 & 0xFF]++;
					}
					arg0.anInt5852 = (Class96_Sub14.anIntArray93[arg0.anInt5861 * -1121734515] >> 8) * -1455962247;
					arg0.anInt5862 = 0;
					arg0.anInt5852 = Class96_Sub14.anIntArray93[arg0.anInt5852 * 818213577] * -1455962247;
					arg0.anInt5864 = (byte) (arg0.anInt5852 * 818213577 & 0xFF) * 313484453;
					arg0.anInt5852 = (arg0.anInt5852 * 818213577 >> 8) * -1455962247;
					arg0.anInt5862 += 1166861201;
					arg0.anInt5867 = local491 * 1274978759;
					method36500(arg0);
					if (arg0.anInt5862 * 439762289 == arg0.anInt5867 * -1821454345 + 1 && arg0.anInt5854 * -223608861 == 0) {
						local56 = true;
						break;
					}
					local56 = false;
					break;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!zu", name = "g", descriptor = "(Lclient!zb;)V", line = 151)
	static void method36505(@OriginalArg(0) Class685 arg0) {
		@Pc(1) boolean local1 = false;
		@Pc(3) boolean local3 = false;
		@Pc(5) boolean local5 = false;
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(11) boolean local11 = false;
		@Pc(13) boolean local13 = false;
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) boolean local23 = false;
		@Pc(25) boolean local25 = false;
		@Pc(27) boolean local27 = false;
		@Pc(29) boolean local29 = false;
		@Pc(31) boolean local31 = false;
		@Pc(33) boolean local33 = false;
		@Pc(35) boolean local35 = false;
		@Pc(37) int local37 = 0;
		@Pc(39) int[] local39 = null;
		@Pc(41) int[] local41 = null;
		@Pc(43) int[] local43 = null;
		arg0.anInt5860 = -197864175;
		if (Class96_Sub14.anIntArray93 == null) {
			Class96_Sub14.anIntArray93 = new int[arg0.anInt5860 * 1120312480];
		}
		@Pc(56) boolean local56 = true;
		while (true) {
			while (local56) {
				@Pc(61) byte local61 = method36507(arg0);
				if (local61 == 23) {
					return;
				}
				local61 = method36507(arg0);
				local61 = method36507(arg0);
				local61 = method36507(arg0);
				local61 = method36507(arg0);
				local61 = method36507(arg0);
				local61 = method36507(arg0);
				local61 = method36507(arg0);
				local61 = method36507(arg0);
				local61 = method36507(arg0);
				local61 = method36512(arg0);
				if (local61 != 0) {
				}
				arg0.anInt5861 = 0;
				local61 = method36507(arg0);
				arg0.anInt5861 = (arg0.anInt5861 * -1121734515 << 8 | local61 & 0xFF) * -206204347;
				local61 = method36507(arg0);
				arg0.anInt5861 = (arg0.anInt5861 * -1121734515 << 8 | local61 & 0xFF) * -206204347;
				local61 = method36507(arg0);
				arg0.anInt5861 = (arg0.anInt5861 * -1121734515 << 8 | local61 & 0xFF) * -206204347;
				@Pc(153) int local153;
				for (local153 = 0; local153 < 16; local153++) {
					local61 = method36512(arg0);
					if (local61 == 1) {
						arg0.aBooleanArray35[local153] = true;
					} else {
						arg0.aBooleanArray35[local153] = false;
					}
				}
				for (local153 = 0; local153 < 256; local153++) {
					arg0.aBooleanArray34[local153] = false;
				}
				@Pc(199) int local199;
				for (local153 = 0; local153 < 16; local153++) {
					if (arg0.aBooleanArray35[local153]) {
						for (local199 = 0; local199 < 16; local199++) {
							local61 = method36512(arg0);
							if (local61 == 1) {
								arg0.aBooleanArray34[local153 * 16 + local199] = true;
							}
						}
					}
				}
				method36516(arg0);
				@Pc(230) int local230 = arg0.anInt5863 * 1834749779 + 2;
				@Pc(234) int local234 = method36514(3, arg0);
				@Pc(238) int local238 = method36514(15, arg0);
				for (local153 = 0; local153 < local238; local153++) {
					local199 = 0;
					while (true) {
						local61 = method36512(arg0);
						if (local61 == 0) {
							arg0.aByteArray111[local153] = (byte) local199;
							break;
						}
						local199++;
					}
				}
				@Pc(264) byte[] local264 = new byte[6];
				@Pc(266) byte local266 = 0;
				while (local266 < local234) {
					local264[local266] = local266++;
				}
				for (local153 = 0; local153 < local238; local153++) {
					local266 = arg0.aByteArray111[local153];
					@Pc(293) byte local293 = local264[local266];
					while (local266 > 0) {
						local264[local266] = local264[local266 - 1];
						local266--;
					}
					local264[0] = local293;
					arg0.aByteArray112[local153] = local293;
				}
				@Pc(322) int local322;
				for (local322 = 0; local322 < local234; local322++) {
					@Pc(329) int local329 = method36514(5, arg0);
					for (local153 = 0; local153 < local230; local153++) {
						while (true) {
							local61 = method36512(arg0);
							if (local61 == 0) {
								arg0.aByteArrayArray25[local322][local153] = (byte) local329;
								break;
							}
							local61 = method36512(arg0);
							if (local61 == 0) {
								local329++;
							} else {
								local329--;
							}
						}
					}
				}
				for (local322 = 0; local322 < local234; local322++) {
					@Pc(368) byte local368 = 32;
					@Pc(370) byte local370 = 0;
					for (local153 = 0; local153 < local230; local153++) {
						if (arg0.aByteArrayArray25[local322][local153] > local370) {
							local370 = arg0.aByteArrayArray25[local322][local153];
						}
						if (arg0.aByteArrayArray25[local322][local153] < local368) {
							local368 = arg0.aByteArrayArray25[local322][local153];
						}
					}
					method36520(arg0.anIntArrayArray66[local322], arg0.anIntArrayArray67[local322], arg0.anIntArrayArray65[local322], arg0.aByteArrayArray25[local322], local368, local370, local230);
					arg0.anIntArray542[local322] = local368;
				}
				@Pc(441) int local441 = arg0.anInt5863 * 1834749779 + 1;
				@Pc(443) int local443 = -1;
				@Pc(445) byte local445 = 0;
				for (local153 = 0; local153 <= 255; local153++) {
					arg0.anIntArray539[local153] = 0;
				}
				@Pc(459) int local459 = 4095;
				@Pc(461) int local461;
				@Pc(465) int local465;
				for (local461 = 15; local461 >= 0; local461--) {
					for (local465 = 15; local465 >= 0; local465--) {
						arg0.aByteArray110[local459] = (byte) (local461 * 16 + local465);
						local459--;
					}
					arg0.anIntArray541[local461] = local459 + 1;
				}
				@Pc(491) int local491 = 0;
				@Pc(501) byte local501;
				if (local445 == 0) {
					local443++;
					local445 = 50;
					local501 = arg0.aByteArray112[local443];
					local37 = arg0.anIntArray542[local501];
					local39 = arg0.anIntArrayArray66[local501];
					local43 = arg0.anIntArrayArray65[local501];
					local41 = arg0.anIntArrayArray67[local501];
				}
				@Pc(522) int local522 = local445 - 1;
				@Pc(524) int local524 = local37;
				@Pc(528) int local528;
				@Pc(538) byte local538;
				for (local528 = method36514(local37, arg0); local528 > local39[local524]; local528 = local528 << 1 | local538) {
					local524++;
					local538 = method36512(arg0);
				}
				@Pc(553) int local553 = local43[local528 - local41[local524]];
				while (true) {
					while (local553 != local441) {
						if (local553 == 0 || local553 == 1) {
							@Pc(564) int local564 = -1;
							@Pc(566) int local566 = 1;
							do {
								if (local553 == 0) {
									local564 += local566;
								} else if (local553 == 1) {
									local564 += local566 * 2;
								}
								local566 *= 2;
								if (local522 == 0) {
									local443++;
									local522 = 50;
									local501 = arg0.aByteArray112[local443];
									local37 = arg0.anIntArray542[local501];
									local39 = arg0.anIntArrayArray66[local501];
									local43 = arg0.anIntArrayArray65[local501];
									local41 = arg0.anIntArrayArray67[local501];
								}
								local522--;
								local524 = local37;
								for (local528 = method36514(local37, arg0); local528 > local39[local524]; local528 = local528 << 1 | local538) {
									local524++;
									local538 = method36512(arg0);
								}
								local553 = local43[local528 - local41[local524]];
							} while (local553 == 0 || local553 == 1);
							local564++;
							local61 = arg0.aByteArray108[arg0.aByteArray110[arg0.anIntArray541[0]] & 0xFF];
							arg0.anIntArray539[local61 & 0xFF] += local564;
							while (local564 > 0) {
								Class96_Sub14.anIntArray93[local491] = local61 & 0xFF;
								local491++;
								local564--;
							}
						} else {
							@Pc(694) int local694 = local553 - 1;
							@Pc(702) int local702;
							if (local694 < 16) {
								local702 = arg0.anIntArray541[0];
								local61 = arg0.aByteArray110[local702 + local694];
								while (local694 > 3) {
									@Pc(716) int local716 = local702 + local694;
									arg0.aByteArray110[local716] = arg0.aByteArray110[local716 - 1];
									arg0.aByteArray110[local716 - 1] = arg0.aByteArray110[local716 - 2];
									arg0.aByteArray110[local716 - 2] = arg0.aByteArray110[local716 - 3];
									arg0.aByteArray110[local716 - 3] = arg0.aByteArray110[local716 - 4];
									local694 -= 4;
								}
								while (local694 > 0) {
									arg0.aByteArray110[local702 + local694] = arg0.aByteArray110[local702 + local694 - 1];
									local694--;
								}
								arg0.aByteArray110[local702] = local61;
							} else {
								@Pc(792) int local792 = local694 / 16;
								@Pc(796) int local796 = local694 % 16;
								local702 = arg0.anIntArray541[local792] + local796;
								local61 = arg0.aByteArray110[local702];
								while (local702 > arg0.anIntArray541[local792]) {
									arg0.aByteArray110[local702] = arg0.aByteArray110[local702 - 1];
									local702--;
								}
								@Pc(831) int local831 = arg0.anIntArray541[local792]++;
								while (local792 > 0) {
									local831 = arg0.anIntArray541[local792]--;
									arg0.aByteArray110[arg0.anIntArray541[local792]] = arg0.aByteArray110[arg0.anIntArray541[local792 - 1] + 16 - 1];
									local792--;
								}
								local831 = arg0.anIntArray541[0]--;
								arg0.aByteArray110[arg0.anIntArray541[0]] = local61;
								if (arg0.anIntArray541[0] == 0) {
									local459 = 4095;
									for (local461 = 15; local461 >= 0; local461--) {
										for (local465 = 15; local465 >= 0; local465--) {
											arg0.aByteArray110[local459] = arg0.aByteArray110[arg0.anIntArray541[local461] + local465];
											local459--;
										}
										arg0.anIntArray541[local461] = local459 + 1;
									}
								}
							}
							arg0.anIntArray539[arg0.aByteArray108[local61 & 0xFF] & 0xFF]++;
							Class96_Sub14.anIntArray93[local491] = arg0.aByteArray108[local61 & 0xFF] & 0xFF;
							local491++;
							if (local522 == 0) {
								local443++;
								local522 = 50;
								local501 = arg0.aByteArray112[local443];
								local37 = arg0.anIntArray542[local501];
								local39 = arg0.anIntArrayArray66[local501];
								local43 = arg0.anIntArrayArray65[local501];
								local41 = arg0.anIntArrayArray67[local501];
							}
							local522--;
							local524 = local37;
							for (local528 = method36514(local37, arg0); local528 > local39[local524]; local528 = local528 << 1 | local538) {
								local524++;
								local538 = method36512(arg0);
							}
							local553 = local43[local528 - local41[local524]];
						}
					}
					arg0.anInt5854 = 0;
					arg0.aByte177 = 0;
					arg0.anIntArray540[0] = 0;
					for (local153 = 1; local153 <= 256; local153++) {
						arg0.anIntArray540[local153] = arg0.anIntArray539[local153 - 1];
					}
					for (local153 = 1; local153 <= 256; local153++) {
						arg0.anIntArray540[local153] += arg0.anIntArray540[local153 - 1];
					}
					for (local153 = 0; local153 < local491; local153++) {
						local61 = (byte) (Class96_Sub14.anIntArray93[local153] & 0xFF);
						Class96_Sub14.anIntArray93[arg0.anIntArray540[local61 & 0xFF]] |= local153 << 8;
						arg0.anIntArray540[local61 & 0xFF]++;
					}
					arg0.anInt5852 = (Class96_Sub14.anIntArray93[arg0.anInt5861 * -1121734515] >> 8) * -1455962247;
					arg0.anInt5862 = 0;
					arg0.anInt5852 = Class96_Sub14.anIntArray93[arg0.anInt5852 * 818213577] * -1455962247;
					arg0.anInt5864 = (byte) (arg0.anInt5852 * 818213577 & 0xFF) * 313484453;
					arg0.anInt5852 = (arg0.anInt5852 * 818213577 >> 8) * -1455962247;
					arg0.anInt5862 += 1166861201;
					arg0.anInt5867 = local491 * 1274978759;
					method36500(arg0);
					if (arg0.anInt5862 * 439762289 == arg0.anInt5867 * -1821454345 + 1 && arg0.anInt5854 * -223608861 == 0) {
						local56 = true;
						break;
					}
					local56 = false;
					break;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!zu", name = "r", descriptor = "(Lclient!zb;)V", line = 151)
	static void method36506(@OriginalArg(0) Class685 arg0) {
		@Pc(1) boolean local1 = false;
		@Pc(3) boolean local3 = false;
		@Pc(5) boolean local5 = false;
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(11) boolean local11 = false;
		@Pc(13) boolean local13 = false;
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) boolean local23 = false;
		@Pc(25) boolean local25 = false;
		@Pc(27) boolean local27 = false;
		@Pc(29) boolean local29 = false;
		@Pc(31) boolean local31 = false;
		@Pc(33) boolean local33 = false;
		@Pc(35) boolean local35 = false;
		@Pc(37) int local37 = 0;
		@Pc(39) int[] local39 = null;
		@Pc(41) int[] local41 = null;
		@Pc(43) int[] local43 = null;
		arg0.anInt5860 = -197864175;
		if (Class96_Sub14.anIntArray93 == null) {
			Class96_Sub14.anIntArray93 = new int[arg0.anInt5860 * 1120312480];
		}
		@Pc(56) boolean local56 = true;
		while (true) {
			while (local56) {
				@Pc(61) byte local61 = method36507(arg0);
				if (local61 == 23) {
					return;
				}
				local61 = method36507(arg0);
				local61 = method36507(arg0);
				local61 = method36507(arg0);
				local61 = method36507(arg0);
				local61 = method36507(arg0);
				local61 = method36507(arg0);
				local61 = method36507(arg0);
				local61 = method36507(arg0);
				local61 = method36507(arg0);
				local61 = method36512(arg0);
				if (local61 != 0) {
				}
				arg0.anInt5861 = 0;
				local61 = method36507(arg0);
				arg0.anInt5861 = (arg0.anInt5861 * -1121734515 << 8 | local61 & 0xFF) * -206204347;
				local61 = method36507(arg0);
				arg0.anInt5861 = (arg0.anInt5861 * -1121734515 << 8 | local61 & 0xFF) * -206204347;
				local61 = method36507(arg0);
				arg0.anInt5861 = (arg0.anInt5861 * -1121734515 << 8 | local61 & 0xFF) * -206204347;
				@Pc(153) int local153;
				for (local153 = 0; local153 < 16; local153++) {
					local61 = method36512(arg0);
					if (local61 == 1) {
						arg0.aBooleanArray35[local153] = true;
					} else {
						arg0.aBooleanArray35[local153] = false;
					}
				}
				for (local153 = 0; local153 < 256; local153++) {
					arg0.aBooleanArray34[local153] = false;
				}
				@Pc(199) int local199;
				for (local153 = 0; local153 < 16; local153++) {
					if (arg0.aBooleanArray35[local153]) {
						for (local199 = 0; local199 < 16; local199++) {
							local61 = method36512(arg0);
							if (local61 == 1) {
								arg0.aBooleanArray34[local153 * 16 + local199] = true;
							}
						}
					}
				}
				method36516(arg0);
				@Pc(230) int local230 = arg0.anInt5863 * 1834749779 + 2;
				@Pc(234) int local234 = method36514(3, arg0);
				@Pc(238) int local238 = method36514(15, arg0);
				for (local153 = 0; local153 < local238; local153++) {
					local199 = 0;
					while (true) {
						local61 = method36512(arg0);
						if (local61 == 0) {
							arg0.aByteArray111[local153] = (byte) local199;
							break;
						}
						local199++;
					}
				}
				@Pc(264) byte[] local264 = new byte[6];
				@Pc(266) byte local266 = 0;
				while (local266 < local234) {
					local264[local266] = local266++;
				}
				for (local153 = 0; local153 < local238; local153++) {
					local266 = arg0.aByteArray111[local153];
					@Pc(293) byte local293 = local264[local266];
					while (local266 > 0) {
						local264[local266] = local264[local266 - 1];
						local266--;
					}
					local264[0] = local293;
					arg0.aByteArray112[local153] = local293;
				}
				@Pc(322) int local322;
				for (local322 = 0; local322 < local234; local322++) {
					@Pc(329) int local329 = method36514(5, arg0);
					for (local153 = 0; local153 < local230; local153++) {
						while (true) {
							local61 = method36512(arg0);
							if (local61 == 0) {
								arg0.aByteArrayArray25[local322][local153] = (byte) local329;
								break;
							}
							local61 = method36512(arg0);
							if (local61 == 0) {
								local329++;
							} else {
								local329--;
							}
						}
					}
				}
				for (local322 = 0; local322 < local234; local322++) {
					@Pc(368) byte local368 = 32;
					@Pc(370) byte local370 = 0;
					for (local153 = 0; local153 < local230; local153++) {
						if (arg0.aByteArrayArray25[local322][local153] > local370) {
							local370 = arg0.aByteArrayArray25[local322][local153];
						}
						if (arg0.aByteArrayArray25[local322][local153] < local368) {
							local368 = arg0.aByteArrayArray25[local322][local153];
						}
					}
					method36520(arg0.anIntArrayArray66[local322], arg0.anIntArrayArray67[local322], arg0.anIntArrayArray65[local322], arg0.aByteArrayArray25[local322], local368, local370, local230);
					arg0.anIntArray542[local322] = local368;
				}
				@Pc(441) int local441 = arg0.anInt5863 * 1834749779 + 1;
				@Pc(443) int local443 = -1;
				@Pc(445) byte local445 = 0;
				for (local153 = 0; local153 <= 255; local153++) {
					arg0.anIntArray539[local153] = 0;
				}
				@Pc(459) int local459 = 4095;
				@Pc(461) int local461;
				@Pc(465) int local465;
				for (local461 = 15; local461 >= 0; local461--) {
					for (local465 = 15; local465 >= 0; local465--) {
						arg0.aByteArray110[local459] = (byte) (local461 * 16 + local465);
						local459--;
					}
					arg0.anIntArray541[local461] = local459 + 1;
				}
				@Pc(491) int local491 = 0;
				@Pc(501) byte local501;
				if (local445 == 0) {
					local443++;
					local445 = 50;
					local501 = arg0.aByteArray112[local443];
					local37 = arg0.anIntArray542[local501];
					local39 = arg0.anIntArrayArray66[local501];
					local43 = arg0.anIntArrayArray65[local501];
					local41 = arg0.anIntArrayArray67[local501];
				}
				@Pc(522) int local522 = local445 - 1;
				@Pc(524) int local524 = local37;
				@Pc(528) int local528;
				@Pc(538) byte local538;
				for (local528 = method36514(local37, arg0); local528 > local39[local524]; local528 = local528 << 1 | local538) {
					local524++;
					local538 = method36512(arg0);
				}
				@Pc(553) int local553 = local43[local528 - local41[local524]];
				while (true) {
					while (local553 != local441) {
						if (local553 == 0 || local553 == 1) {
							@Pc(564) int local564 = -1;
							@Pc(566) int local566 = 1;
							do {
								if (local553 == 0) {
									local564 += local566;
								} else if (local553 == 1) {
									local564 += local566 * 2;
								}
								local566 *= 2;
								if (local522 == 0) {
									local443++;
									local522 = 50;
									local501 = arg0.aByteArray112[local443];
									local37 = arg0.anIntArray542[local501];
									local39 = arg0.anIntArrayArray66[local501];
									local43 = arg0.anIntArrayArray65[local501];
									local41 = arg0.anIntArrayArray67[local501];
								}
								local522--;
								local524 = local37;
								for (local528 = method36514(local37, arg0); local528 > local39[local524]; local528 = local528 << 1 | local538) {
									local524++;
									local538 = method36512(arg0);
								}
								local553 = local43[local528 - local41[local524]];
							} while (local553 == 0 || local553 == 1);
							local564++;
							local61 = arg0.aByteArray108[arg0.aByteArray110[arg0.anIntArray541[0]] & 0xFF];
							arg0.anIntArray539[local61 & 0xFF] += local564;
							while (local564 > 0) {
								Class96_Sub14.anIntArray93[local491] = local61 & 0xFF;
								local491++;
								local564--;
							}
						} else {
							@Pc(694) int local694 = local553 - 1;
							@Pc(702) int local702;
							if (local694 < 16) {
								local702 = arg0.anIntArray541[0];
								local61 = arg0.aByteArray110[local702 + local694];
								while (local694 > 3) {
									@Pc(716) int local716 = local702 + local694;
									arg0.aByteArray110[local716] = arg0.aByteArray110[local716 - 1];
									arg0.aByteArray110[local716 - 1] = arg0.aByteArray110[local716 - 2];
									arg0.aByteArray110[local716 - 2] = arg0.aByteArray110[local716 - 3];
									arg0.aByteArray110[local716 - 3] = arg0.aByteArray110[local716 - 4];
									local694 -= 4;
								}
								while (local694 > 0) {
									arg0.aByteArray110[local702 + local694] = arg0.aByteArray110[local702 + local694 - 1];
									local694--;
								}
								arg0.aByteArray110[local702] = local61;
							} else {
								@Pc(792) int local792 = local694 / 16;
								@Pc(796) int local796 = local694 % 16;
								local702 = arg0.anIntArray541[local792] + local796;
								local61 = arg0.aByteArray110[local702];
								while (local702 > arg0.anIntArray541[local792]) {
									arg0.aByteArray110[local702] = arg0.aByteArray110[local702 - 1];
									local702--;
								}
								@Pc(831) int local831 = arg0.anIntArray541[local792]++;
								while (local792 > 0) {
									local831 = arg0.anIntArray541[local792]--;
									arg0.aByteArray110[arg0.anIntArray541[local792]] = arg0.aByteArray110[arg0.anIntArray541[local792 - 1] + 16 - 1];
									local792--;
								}
								local831 = arg0.anIntArray541[0]--;
								arg0.aByteArray110[arg0.anIntArray541[0]] = local61;
								if (arg0.anIntArray541[0] == 0) {
									local459 = 4095;
									for (local461 = 15; local461 >= 0; local461--) {
										for (local465 = 15; local465 >= 0; local465--) {
											arg0.aByteArray110[local459] = arg0.aByteArray110[arg0.anIntArray541[local461] + local465];
											local459--;
										}
										arg0.anIntArray541[local461] = local459 + 1;
									}
								}
							}
							arg0.anIntArray539[arg0.aByteArray108[local61 & 0xFF] & 0xFF]++;
							Class96_Sub14.anIntArray93[local491] = arg0.aByteArray108[local61 & 0xFF] & 0xFF;
							local491++;
							if (local522 == 0) {
								local443++;
								local522 = 50;
								local501 = arg0.aByteArray112[local443];
								local37 = arg0.anIntArray542[local501];
								local39 = arg0.anIntArrayArray66[local501];
								local43 = arg0.anIntArrayArray65[local501];
								local41 = arg0.anIntArrayArray67[local501];
							}
							local522--;
							local524 = local37;
							for (local528 = method36514(local37, arg0); local528 > local39[local524]; local528 = local528 << 1 | local538) {
								local524++;
								local538 = method36512(arg0);
							}
							local553 = local43[local528 - local41[local524]];
						}
					}
					arg0.anInt5854 = 0;
					arg0.aByte177 = 0;
					arg0.anIntArray540[0] = 0;
					for (local153 = 1; local153 <= 256; local153++) {
						arg0.anIntArray540[local153] = arg0.anIntArray539[local153 - 1];
					}
					for (local153 = 1; local153 <= 256; local153++) {
						arg0.anIntArray540[local153] += arg0.anIntArray540[local153 - 1];
					}
					for (local153 = 0; local153 < local491; local153++) {
						local61 = (byte) (Class96_Sub14.anIntArray93[local153] & 0xFF);
						Class96_Sub14.anIntArray93[arg0.anIntArray540[local61 & 0xFF]] |= local153 << 8;
						arg0.anIntArray540[local61 & 0xFF]++;
					}
					arg0.anInt5852 = (Class96_Sub14.anIntArray93[arg0.anInt5861 * -1121734515] >> 8) * -1455962247;
					arg0.anInt5862 = 0;
					arg0.anInt5852 = Class96_Sub14.anIntArray93[arg0.anInt5852 * 818213577] * -1455962247;
					arg0.anInt5864 = (byte) (arg0.anInt5852 * 818213577 & 0xFF) * 313484453;
					arg0.anInt5852 = (arg0.anInt5852 * 818213577 >> 8) * -1455962247;
					arg0.anInt5862 += 1166861201;
					arg0.anInt5867 = local491 * 1274978759;
					method36500(arg0);
					if (arg0.anInt5862 * 439762289 == arg0.anInt5867 * -1821454345 + 1 && arg0.anInt5854 * -223608861 == 0) {
						local56 = true;
						break;
					}
					local56 = false;
					break;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!zu", name = "l", descriptor = "(Lclient!zb;)B", line = 447)
	static byte method36507(@OriginalArg(0) Class685 arg0) {
		return (byte) method36514(8, arg0);
	}

	@OriginalMember(owner = "client!zu", name = "i", descriptor = "(Lclient!zb;)B", line = 447)
	static byte method36508(@OriginalArg(0) Class685 arg0) {
		return (byte) method36514(8, arg0);
	}

	@OriginalMember(owner = "client!zu", name = "z", descriptor = "(Lclient!zb;)B", line = 447)
	static byte method36509(@OriginalArg(0) Class685 arg0) {
		return (byte) method36514(8, arg0);
	}

	@OriginalMember(owner = "client!zu", name = "j", descriptor = "(Lclient!zb;)B", line = 447)
	static byte method36510(@OriginalArg(0) Class685 arg0) {
		return (byte) method36514(8, arg0);
	}

	@OriginalMember(owner = "client!zu", name = "u", descriptor = "(Lclient!zb;)B", line = 451)
	static byte method36511(@OriginalArg(0) Class685 arg0) {
		return (byte) method36514(1, arg0);
	}

	@OriginalMember(owner = "client!zu", name = "y", descriptor = "(Lclient!zb;)B", line = 451)
	static byte method36512(@OriginalArg(0) Class685 arg0) {
		return (byte) method36514(1, arg0);
	}

	@OriginalMember(owner = "client!zu", name = "k", descriptor = "(Lclient!zb;)B", line = 451)
	static byte method36513(@OriginalArg(0) Class685 arg0) {
		return (byte) method36514(1, arg0);
	}

	@OriginalMember(owner = "client!zu", name = "w", descriptor = "(ILclient!zb;)I", line = 456)
	static int method36514(@OriginalArg(0) int arg0, @OriginalArg(1) Class685 arg1) {
		while (arg1.anInt5859 * 948092361 < arg0) {
			arg1.anInt5858 = (arg1.anInt5858 * -778455557 << 8 | arg1.aByteArray107[arg1.anInt5853 * -1493419853] & 0xFF) * 502861107;
			arg1.anInt5859 += -432053304;
			arg1.anInt5853 += -885442949;
			arg1.anInt5847 += 1387707809;
			if (arg1.anInt5847 * 78931553 == 0) {
			}
		}
		@Pc(23) int local23 = arg1.anInt5858 * -778455557 >> arg1.anInt5859 * 948092361 - arg0 & (0x1 << arg0) - 1;
		arg1.anInt5859 -= arg0 * 1556606073;
		return local23;
	}

	@OriginalMember(owner = "client!zu", name = "e", descriptor = "(ILclient!zb;)I", line = 456)
	static int method36515(@OriginalArg(0) int arg0, @OriginalArg(1) Class685 arg1) {
		while (arg1.anInt5859 * 948092361 < arg0) {
			arg1.anInt5858 = (arg1.anInt5858 * -778455557 << 8 | arg1.aByteArray107[arg1.anInt5853 * -1493419853] & 0xFF) * 502861107;
			arg1.anInt5859 += -432053304;
			arg1.anInt5853 += -885442949;
			arg1.anInt5847 += 1387707809;
			if (arg1.anInt5847 * 78931553 == 0) {
			}
		}
		@Pc(23) int local23 = arg1.anInt5858 * -778455557 >> arg1.anInt5859 * 948092361 - arg0 & (0x1 << arg0) - 1;
		arg1.anInt5859 -= arg0 * 1556606073;
		return local23;
	}

	@OriginalMember(owner = "client!zu", name = "t", descriptor = "(Lclient!zb;)V", line = 472)
	static void method36516(@OriginalArg(0) Class685 arg0) {
		arg0.anInt5863 = 0;
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			if (arg0.aBooleanArray34[local4]) {
				arg0.aByteArray108[arg0.anInt5863 * 1834749779] = (byte) local4;
				arg0.anInt5863 += 41749723;
			}
		}
	}

	@OriginalMember(owner = "client!zu", name = "o", descriptor = "(Lclient!zb;)V", line = 472)
	static void method36517(@OriginalArg(0) Class685 arg0) {
		arg0.anInt5863 = 0;
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			if (arg0.aBooleanArray34[local4]) {
				arg0.aByteArray108[arg0.anInt5863 * 1834749779] = (byte) local4;
				arg0.anInt5863 += 41749723;
			}
		}
	}

	@OriginalMember(owner = "client!zu", name = "f", descriptor = "(Lclient!zb;)V", line = 472)
	static void method36518(@OriginalArg(0) Class685 arg0) {
		arg0.anInt5863 = 0;
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			if (arg0.aBooleanArray34[local4]) {
				arg0.aByteArray108[arg0.anInt5863 * 1834749779] = (byte) local4;
				arg0.anInt5863 += 41749723;
			}
		}
	}

	@OriginalMember(owner = "client!zu", name = "b", descriptor = "([I[I[I[BIII)V", line = 486)
	static void method36519(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3;
		for (local3 = arg4; local3 <= arg5; local3++) {
			for (@Pc(8) int local8 = 0; local8 < arg6; local8++) {
				if (arg3[local8] == local3) {
					arg2[local1] = local8;
					local1++;
				}
			}
		}
		for (local3 = 0; local3 < 23; local3++) {
			arg1[local3] = 0;
		}
		for (local3 = 0; local3 < arg6; local3++) {
			arg1[arg3[local3] + 1]++;
		}
		for (local3 = 1; local3 < 23; local3++) {
			arg1[local3] += arg1[local3 - 1];
		}
		for (local3 = 0; local3 < 23; local3++) {
			arg0[local3] = 0;
		}
		@Pc(85) int local85 = 0;
		for (local3 = arg4; local3 <= arg5; local3++) {
			local85 += arg1[local3 + 1] - arg1[local3];
			arg0[local3] = local85 - 1;
			local85 <<= 0x1;
		}
		for (local3 = arg4 + 1; local3 <= arg5; local3++) {
			arg1[local3] = (arg0[local3 - 1] + 1 << 1) - arg1[local3];
		}
	}

	@OriginalMember(owner = "client!zu", name = "q", descriptor = "([I[I[I[BIII)V", line = 486)
	static void method36520(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3;
		for (local3 = arg4; local3 <= arg5; local3++) {
			for (@Pc(8) int local8 = 0; local8 < arg6; local8++) {
				if (arg3[local8] == local3) {
					arg2[local1] = local8;
					local1++;
				}
			}
		}
		for (local3 = 0; local3 < 23; local3++) {
			arg1[local3] = 0;
		}
		for (local3 = 0; local3 < arg6; local3++) {
			arg1[arg3[local3] + 1]++;
		}
		for (local3 = 1; local3 < 23; local3++) {
			arg1[local3] += arg1[local3 - 1];
		}
		for (local3 = 0; local3 < 23; local3++) {
			arg0[local3] = 0;
		}
		@Pc(85) int local85 = 0;
		for (local3 = arg4; local3 <= arg5; local3++) {
			local85 += arg1[local3 + 1] - arg1[local3];
			arg0[local3] = local85 - 1;
			local85 <<= 0x1;
		}
		for (local3 = arg4 + 1; local3 <= arg5; local3++) {
			arg1[local3] = (arg0[local3 - 1] + 1 << 1) - arg1[local3];
		}
	}
}
