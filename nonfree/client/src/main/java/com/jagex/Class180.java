package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fq")
public class Class180 {

	@OriginalMember(owner = "client!fq", name = "g", descriptor = "Lclient!po;")
	static Class395 aClass395_1;

	@OriginalMember(owner = "client!fq", name = "p", descriptor = "Ljava/lang/String;")
	public String aString173;

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "Ljava/lang/String;")
	public String aString174;

	@OriginalMember(owner = "client!fq", name = "<init>", descriptor = "()V", line = 84)
	Class180() {
	}

	@OriginalMember(owner = "client!fq", name = "p", descriptor = "(Lclient!fj;B)V", line = 87)
	void method23536(@OriginalArg(0) Class174 arg0) {
		this.aString173 = arg0.method23391();
		this.aString174 = arg0.method23391();
	}

	@OriginalMember(owner = "client!fq", name = "z", descriptor = "(S)V", line = 626)
	static void method23541() {
		@Pc(6) Class592 local6 = Class348.method26559("2", client.aClass543_2.aString236, false);
		Class302.aClass10_Sub1_1.method722(local6);
	}

	@OriginalMember(owner = "client!fq", name = "iu", descriptor = "(I)V", line = 4566)
	static final void method23542() {
		if (Class510.aClass3_Sub45_37.aClass60_Sub21_2.method13688() != 2) {
			return;
		}
		@Pc(10) byte[][][] local10 = client.aClass370_1.method26957();
		@Pc(19) byte local19 = (byte) (client.anInt3100 * -630801869 - 4 & 0xFF);
		@Pc(27) int local27 = client.anInt3100 * -630801869 % client.aClass370_1.method26943();
		@Pc(29) int local29;
		for (local29 = 0; local29 < 4; local29++) {
			for (@Pc(34) int local34 = 0; local34 < client.aClass370_1.method27062(); local34++) {
				local10[local29][local27][local34] = local19;
			}
		}
		if (Class141.anInt3427 * 1197232991 == 3) {
			return;
		}
		for (local29 = 0; local29 < 2; local29++) {
			client.anIntArray304[local29] = -1000000;
			client.anIntArray305[local29] = 1000000;
			client.anIntArray296[local29] = 0;
			client.anIntArray307[local29] = 1000000;
			client.anIntArray306[local29] = 0;
		}
		@Pc(88) Class320 local88 = Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.method21431().aClass320_61;
		@Pc(92) Class346 local92 = client.aClass370_1.method27075();
		@Pc(96) Class438 local96 = client.aClass370_1.method26950();
		@Pc(142) int local142;
		if (Class72.anInt2086 * 81180077 != 5 && Class72.anInt2086 * 81180077 != 3 && Class449.anInt5013 * -2001030385 == -1) {
			local142 = Class186.method23926(Class586.anInt5460 * -1129330577, Class149.anInt3434 * -324079631, Class141.anInt3427 * 1197232991);
			if (local142 - Class140.anInt3424 * 1701665129 < 3200 && (local92.aByteArrayArrayArray12[Class141.anInt3427 * 1197232991][Class586.anInt5460 * -1129330577 >> 9][Class149.anInt3434 * -324079631 >> 9] & 0x4) != 0) {
				Class43_Sub1.method8380(local96.aClass432ArrayArrayArray3, 1, Class586.anInt5460 * -1129330577 >> 9, Class149.anInt3434 * -324079631 >> 9, false);
			}
			return;
		}
		@Pc(115) Class464 local115 = client.aClass370_1.method26942();
		@Pc(153) int local153;
		if (Class72.anInt2086 * 81180077 == 3) {
			@Pc(126) Class320 local126 = Class80.aClass23_Sub1_1.method5799().method20205();
			if (Float.isNaN(local126.aFloat259)) {
				return;
			}
			local142 = (int) local126.aFloat259 - (local115.anInt5071 * -1567811631 << 9);
			local153 = (int) local126.aFloat261 - (local115.anInt5073 * 1360175441 << 9);
			if (local142 < 0 || local153 < 0 || local142 >> 9 >= local92.aByteArrayArrayArray12[Class141.anInt3427 * 1197232991].length || local153 >> 9 >= local92.aByteArrayArrayArray12[Class141.anInt3427 * 1197232991][local142 >> 9].length) {
				return;
			}
		} else if (Class72.anInt2086 * 81180077 == 5) {
			local142 = (int) local88.aFloat259;
			local153 = (int) local88.aFloat261;
		} else {
			local142 = Class449.anInt5013 * -2001030385;
			local153 = Class47.anInt1011 * 979388523;
		}
		if ((local92.aByteArrayArrayArray12[Class141.anInt3427 * 1197232991][local142 >> 9][local153 >> 9] & 0x4) != 0) {
			Class43_Sub1.method8380(local96.aClass432ArrayArrayArray3, 0, local142 >> 9, local153 >> 9, false);
			return;
		}
		@Pc(272) int local272;
		@Pc(261) int local261;
		if (Class72.anInt2086 * 81180077 == 3) {
			@Pc(250) Class320 local250 = Class80.aClass23_Sub1_1.method5827().method16426();
			local261 = ((int) local250.aFloat259 >> 9) - local115.anInt5071 * -1567811631;
			local272 = ((int) local250.aFloat261 >> 9) - local115.anInt5073 * 1360175441;
			if (local261 < 0 || local272 < 0 || local261 >= local92.aByteArrayArrayArray12[Class141.anInt3427 * 1197232991].length || local272 >= local92.aByteArrayArrayArray12[Class141.anInt3427 * 1197232991][local261].length) {
				return;
			}
		} else {
			local261 = Class586.anInt5460 * -1129330577 >> 9;
			local272 = Class149.anInt3434 * -324079631 >> 9;
		}
		@Pc(314) int local314 = local142 >> 9;
		@Pc(318) int local318 = local153 >> 9;
		@Pc(334) int local334;
		if (local92.method26503(local261, local272)) {
			local334 = Class186.method23926(Class586.anInt5460 * -1129330577, Class149.anInt3434 * -324079631, 3);
			if (Class140.anInt3424 * 1701665129 >= local334) {
				Class43_Sub1.method8380(local96.aClass432ArrayArrayArray3, 1, local261, local272, false);
			}
			return;
		}
		if (Class30.anInt2350 * 1495770999 >= 2560) {
			return;
		}
		if (local314 > local261) {
			local334 = local314 - local261;
		} else {
			local334 = local261 - local314;
		}
		@Pc(373) int local373;
		if (local318 > local272) {
			local373 = local318 - local272;
		} else {
			local373 = local272 - local318;
		}
		if (local334 == 0 && local373 == 0 || local334 <= -client.aClass370_1.method26943() || local334 >= client.aClass370_1.method26943() || local373 <= -client.aClass370_1.method27062() || local373 >= client.aClass370_1.method27062()) {
			if (Class72.anInt2086 * 81180077 != 3) {
				Class27_Sub1.method7214(local261 + Class1.aString4 + local272 + " " + local314 + Class1.aString4 + local318 + " " + local115.anInt5071 * -1567811631 + Class1.aString4 + local115.anInt5073 * 1360175441, new RuntimeException());
			}
			return;
		}
		@Pc(458) int local458;
		@Pc(460) int local460;
		if (local334 <= local373) {
			local458 = local334 * 65536 / local373;
			local460 = 32768;
			while (local318 != local272) {
				if (local272 < local318) {
					local272++;
				} else if (local272 > local318) {
					local272--;
				}
				if ((local92.aByteArrayArrayArray12[Class141.anInt3427 * 1197232991][local261][local272] & 0x4) != 0) {
					Class43_Sub1.method8380(local96.aClass432ArrayArrayArray3, 1, local261, local272, false);
					break;
				}
				if (local261 + 1 < local92.aByteArrayArrayArray12[Class141.anInt3427 * 1197232991].length && (local92.aByteArrayArrayArray12[Class141.anInt3427 * 1197232991][local261 + 1][local272] & 0x4) != 0) {
					Class43_Sub1.method8380(local96.aClass432ArrayArrayArray3, 1, local261 + 1, local272, false);
					break;
				}
				if (local261 > 0 && (local92.aByteArrayArrayArray12[Class141.anInt3427 * 1197232991][local261 - 1][local272] & 0x4) != 0) {
					Class43_Sub1.method8380(local96.aClass432ArrayArrayArray3, 1, local261 - 1, local272, false);
					break;
				}
				local460 += local458;
				if (local460 >= 65536) {
					local460 -= 65536;
					if (local261 < local314) {
						local261++;
						if (local261 + 1 < local92.aByteArrayArrayArray12[Class141.anInt3427 * 1197232991].length && (local92.aByteArrayArrayArray12[Class141.anInt3427 * 1197232991][local261 + 1][local272] & 0x4) != 0) {
							Class43_Sub1.method8380(local96.aClass432ArrayArrayArray3, 1, local261 + 1, local272, false);
							break;
						}
					} else if (local261 > local314) {
						local261--;
						if (local261 > 0 && (local92.aByteArrayArrayArray12[Class141.anInt3427 * 1197232991][local261 - 1][local272] & 0x4) != 0) {
							Class43_Sub1.method8380(local96.aClass432ArrayArrayArray3, 1, local261 - 1, local272, false);
							break;
						}
					}
				}
			}
			return;
		}
		local458 = local373 * 65536 / local334;
		local460 = 32768;
		while (local261 != local314) {
			if (local261 < local314) {
				local261++;
			} else if (local261 > local314) {
				local261--;
			}
			if ((local92.aByteArrayArrayArray12[Class141.anInt3427 * 1197232991][local261][local272] & 0x4) != 0) {
				Class43_Sub1.method8380(local96.aClass432ArrayArrayArray3, 1, local261, local272, false);
				break;
			}
			if (local272 + 1 < local92.aByteArrayArrayArray12[Class141.anInt3427 * 1197232991][local261].length && (local92.aByteArrayArrayArray12[Class141.anInt3427 * 1197232991][local261][local272 + 1] & 0x4) != 0) {
				Class43_Sub1.method8380(local96.aClass432ArrayArrayArray3, 1, local261, local272 + 1, false);
				break;
			}
			if (local272 > 0 && (local92.aByteArrayArrayArray12[Class141.anInt3427 * 1197232991][local261][local272 - 1] & 0x4) != 0) {
				Class43_Sub1.method8380(local96.aClass432ArrayArrayArray3, 1, local261, local272 - 1, false);
				break;
			}
			local460 += local458;
			if (local460 >= 65536) {
				local460 -= 65536;
				if (local272 < local318) {
					local272++;
					if (local272 + 1 < local92.aByteArrayArrayArray12[Class141.anInt3427 * 1197232991][local261].length && (local92.aByteArrayArrayArray12[Class141.anInt3427 * 1197232991][local261][local272 + 1] & 0x4) != 0) {
						Class43_Sub1.method8380(local96.aClass432ArrayArrayArray3, 1, local261, local272 + 1, false);
						break;
					}
				} else if (local272 > local318) {
					local272--;
					if (local272 > 0 && (local92.aByteArrayArrayArray12[Class141.anInt3427 * 1197232991][local261][local272 - 1] & 0x4) != 0) {
						Class43_Sub1.method8380(local96.aClass432ArrayArrayArray3, 1, local261, local272 - 1, false);
						break;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fq", name = "jd", descriptor = "(Lclient!vs;I)V", line = 5756)
	static final void method23537(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class123.method22846(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!fq", name = "ms", descriptor = "(Lclient!vs;I)V", line = 6418)
	static final void method23540(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class460.method28580(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!fq", name = "xr", descriptor = "(Lclient!vs;I)V", line = 8325)
	static final void method23538(@OriginalArg(0) Class536 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray42[(arg0.anInt5315 -= 790013775) * 996806575];
		@Pc(26) int local26 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		Class487.method29191(local13, local26);
	}

	@OriginalMember(owner = "client!fq", name = "aux", descriptor = "(Lclient!vs;I)V", line = 12617)
	static final void method23539(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = ((Class26_Sub1_Sub1_Sub1_Sub1) arg0.aClass26_Sub1_Sub1_Sub1_4).aClass571_1.anInt5388 * 898829907;
	}
}
