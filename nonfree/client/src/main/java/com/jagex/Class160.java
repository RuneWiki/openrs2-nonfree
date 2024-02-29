package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ay")
public class Class160 {

	@OriginalMember(owner = "client!ay", name = "x", descriptor = "I")
	int anInt3250;

	@OriginalMember(owner = "client!ay", name = "l", descriptor = "I")
	int anInt3251;

	@OriginalMember(owner = "client!ay", name = "y", descriptor = "I")
	int anInt3252;

	@OriginalMember(owner = "client!ay", name = "t", descriptor = "I")
	int anInt3253;

	@OriginalMember(owner = "client!ay", name = "d", descriptor = "I")
	int anInt3254;

	@OriginalMember(owner = "client!ay", name = "w", descriptor = "I")
	int anInt3255;

	@OriginalMember(owner = "client!ay", name = "s", descriptor = "F")
	float aFloat236;

	@OriginalMember(owner = "client!ay", name = "q", descriptor = "I")
	int anInt3257;

	@OriginalMember(owner = "client!ay", name = "c", descriptor = "F")
	float aFloat234 = 1.0F;

	@OriginalMember(owner = "client!ay", name = "v", descriptor = "F")
	float aFloat235 = 1.0F;

	@OriginalMember(owner = "client!ay", name = "p", descriptor = "I")
	int anInt3256;

	@OriginalMember(owner = "client!ay", name = "<init>", descriptor = "(I)V", line = 16)
	Class160(@OriginalArg(0) int arg0) {
		this.anInt3256 = arg0 * 874668989;
	}

	@OriginalMember(owner = "client!ay", name = "<init>", descriptor = "(IFFIII)V", line = 20)
	Class160(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt3256 = arg0 * 874668989;
		this.aFloat234 = arg1;
		this.aFloat235 = arg2;
		this.anInt3251 = arg3 * 1831486073;
		this.anInt3252 = arg4 * -108929861;
		this.anInt3255 = arg5 * 1832042733;
	}

	@OriginalMember(owner = "client!ay", name = "v", descriptor = "()Lclient!ay;", line = 30)
	Class160 method24320() {
		return new Class160(this.anInt3256 * -150900843, this.aFloat234, this.aFloat235, this.anInt3251 * -169572407, this.anInt3252 * -653522829, this.anInt3255 * -133325595);
	}

	@OriginalMember(owner = "client!ay", name = "p", descriptor = "(B)Lclient!ay;", line = 30)
	Class160 method24321() {
		return new Class160(this.anInt3256 * -150900843, this.aFloat234, this.aFloat235, this.anInt3251 * -169572407, this.anInt3252 * -653522829, this.anInt3255 * -133325595);
	}

	@OriginalMember(owner = "client!ay", name = "l", descriptor = "()Lclient!ay;", line = 30)
	Class160 method24322() {
		return new Class160(this.anInt3256 * -150900843, this.aFloat234, this.aFloat235, this.anInt3251 * -169572407, this.anInt3252 * -653522829, this.anInt3255 * -133325595);
	}

	@OriginalMember(owner = "client!ay", name = "c", descriptor = "(Lclient!ay;I)V", line = 34)
	void method24323(@OriginalArg(0) Class160 arg0) {
		this.aFloat234 = arg0.aFloat234;
		this.aFloat235 = arg0.aFloat235;
		this.anInt3251 = arg0.anInt3251;
		this.anInt3252 = arg0.anInt3252;
		this.anInt3256 = arg0.anInt3256;
		this.anInt3255 = arg0.anInt3255;
	}

	@OriginalMember(owner = "client!ay", name = "m", descriptor = "(Lclient!yf;I)V", line = 4412)
	static final void method24324(@OriginalArg(0) Class665 arg0) {
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = arg0.aClass77_Sub1_Sub9_2.anObjectArray5[arg0.anInt5786 * 662605117];
	}

	@OriginalMember(owner = "client!ay", name = "bl", descriptor = "(Lclient!yf;I)V", line = 4640)
	static final void method24325(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5782 -= -2111195934;
		if (arg0.aLongArray28[arg0.anInt5782 * 1572578961] >= arg0.aLongArray28[arg0.anInt5782 * 1572578961 + 1]) {
			arg0.anInt5786 += arg0.anIntArray535[arg0.anInt5786 * 662605117] * -793595371;
		}
	}

	@OriginalMember(owner = "client!ay", name = "bt", descriptor = "(ZLclient!yf;I)V", line = 4706)
	static final void method24326(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class665 arg1) {
		@Pc(8) Class662 local8 = arg1.aBoolean857 ? arg1.aClass662_1 : arg1.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		if (arg0) {
			Class148.method15594(local14, local11);
		} else {
			Class26.method462(local14, local11);
		}
	}

	@OriginalMember(owner = "client!ay", name = "lr", descriptor = "(Lclient!yf;B)V", line = 6703)
	static final void method24327(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class104_Sub1_Sub2_Sub1.method11349(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!ay", name = "lu", descriptor = "(B)V", line = 11689)
	static final void method24328() {
		Class461.method29531(client.aClass277_4);
		Class618.anInt5608 += 1713249661;
		if (client.aBoolean623 && client.aBoolean604) {
			@Pc(24) int local24 = Class60.aClass138_1.method14234();
			@Pc(28) int local28 = Class60.aClass138_1.method14225();
			local24 -= client.anInt3429 * -1626933515;
			local28 -= client.anInt3387 * 1953389231;
			if (local24 < client.anInt3484 * -169004095) {
				local24 = client.anInt3484 * -169004095;
			}
			if (client.aClass277_4.anInt3874 * -881188269 + local24 > client.anInt3484 * -169004095 + client.anInt3486 * -1152577469) {
				local24 = client.anInt3484 * -169004095 + client.anInt3486 * -1152577469 - client.aClass277_4.anInt3874 * -881188269;
			}
			if (local28 < client.anInt3445 * -171218513) {
				local28 = client.anInt3445 * -171218513;
			}
			if (local28 + client.aClass277_4.anInt3875 * -1279656873 > client.anInt3445 * -171218513 + client.anInt3490 * 1976194639) {
				local28 = client.anInt3445 * -171218513 + client.anInt3490 * 1976194639 - client.aClass277_4.anInt3875 * -1279656873;
			}
			@Pc(117) int local117;
			@Pc(119) int local119;
			if (Class58.aClass277_1 == client.aClass277_8) {
				local117 = local24;
				local119 = local28;
			} else {
				local117 = client.aClass277_8.anInt3879 * -488164841 + (local24 - client.anInt3484 * -169004095);
				local119 = local28 - client.anInt3445 * -171218513 + client.aClass277_8.anInt3880 * 2142374941;
			}
			@Pc(158) Class77_Sub41 local158;
			if (Class60.aClass138_1.method14208()) {
				if (Class618.anInt5608 * 273482709 > client.aClass277_4.anInt3922 * 73463143) {
					@Pc(323) int local323 = local24 - client.anInt3491 * 33779563;
					@Pc(329) int local329 = local28 - client.anInt3492 * 1729150661;
					if (local323 > client.aClass277_4.anInt3921 * 1344073003 || local323 < -(client.aClass277_4.anInt3921 * 1344073003) || local329 > client.aClass277_4.anInt3921 * 1344073003 || local329 < -(client.aClass277_4.anInt3921 * 1344073003)) {
						client.aBoolean624 = true;
					}
				}
				if (client.aClass277_4.anObjectArray24 != null && client.aBoolean624) {
					local158 = new Class77_Sub41();
					local158.aClass277_2 = client.aClass277_4;
					local158.anInt2004 = local117 * -1310455037;
					local158.anInt2001 = local119 * 1212820407;
					local158.anObjectArray4 = client.aClass277_4.anObjectArray24;
					Class72.method1019(local158);
				}
			} else {
				if (client.aBoolean624) {
					Exception_Sub4.method17924();
					if (client.aClass277_4.anObjectArray25 != null) {
						local158 = new Class77_Sub41();
						local158.aClass277_2 = client.aClass277_4;
						local158.anInt2004 = local117 * -1310455037;
						local158.anInt2001 = local119 * 1212820407;
						@Pc(174) Class277 local174 = client.method25377(client.aClass277_4);
						@Pc(176) Class277 local176 = client.aClass277_7;
						@Pc(178) boolean local178 = false;
						while (local176 != null && local176.anInt3876 * -742015869 != -1 && local174 != null) {
							if (local174.anInt3863 * -1278450723 == local176.anInt3863 * -1278450723) {
								local178 = true;
								break;
							}
							local176 = Class35_Sub11.aClass273Array1[local176.anInt3863 * -1278450723 >> 16].aClass277Array2[local176.anInt3876 * -742015869 & 0xFFFF];
						}
						if (local176 == null || local174 == null || local174 == Class58.aClass277_1 || local178) {
							local158.aClass277_3 = client.aClass277_7;
						} else {
							local158.aClass277_3 = Class58.aClass277_1;
						}
						local158.anObjectArray4 = client.aClass277_4.anObjectArray25;
						Class72.method1019(local158);
					}
					if (client.aClass277_7 != null && client.method25377(client.aClass277_4) != null) {
						Class596.method31919(client.aClass277_4, client.aClass277_7);
					}
				} else if ((client.anInt3471 * 2117088631 == 1 || Class98.method7803()) && Class683.anInt5826 * 324852453 > 2) {
					Class201.method25538(client.anInt3429 * -1626933515 + client.anInt3491 * 33779563, client.anInt3387 * 1953389231 + client.anInt3492 * 1729150661);
				} else if (Class651.method32954()) {
					Class201.method25538(client.anInt3491 * 33779563 + client.anInt3429 * -1626933515, client.anInt3387 * 1953389231 + client.anInt3492 * 1729150661);
				}
				client.aClass277_4 = null;
				client.aClass277_8 = null;
			}
		} else if (Class618.anInt5608 * 273482709 > 1) {
			client.aClass277_4 = null;
			client.aClass277_8 = null;
		}
	}

	@OriginalMember(owner = "client!ay", name = "asw", descriptor = "(Lclient!yf;S)V", line = 12711)
	static final void method24329(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(26) String local26 = (String) arg0.anObjectArray45[(arg0.anInt5781 -= 1460193483) * 1485266147];
		@Pc(32) int local32 = Class13.method205(client.aClass661_1, Class664.aClass664_1, local12);
		@Pc(38) int local38 = Class493.method30043(client.aClass661_1, Class664.aClass664_1, local12);
		if (client.anInt3390 * -1850530127 == 9 && !Class231.method25828()) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class101_Sub1_Sub1.method20899(local12, local26, local32, local38) ? 1 : 0;
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
		}
	}
}
