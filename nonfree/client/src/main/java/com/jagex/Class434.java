package com.jagex;

import java.util.Iterator;
import java.util.List;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public class Class434 {

	@OriginalMember(owner = "client!o", name = "c", descriptor = "Lclient!agn;")
	static Class107_Sub1 aClass107_Sub1_1;

	@OriginalMember(owner = "client!o", name = "v", descriptor = "I")
	static int anInt4909;

	@OriginalMember(owner = "client!o", name = "p", descriptor = "Z")
	static boolean aBoolean749 = false;

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V", line = 24)
	Class434() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!o", name = "l", descriptor = "(Lclient!ajq;Lclient!ajq;B)V", line = 38)
	public static void method28870(@OriginalArg(0) Class77_Sub1 arg0, @OriginalArg(1) Class77_Sub1 arg1) {
		if (arg0.aClass77_Sub1_61 != null) {
			arg0.method24069();
		}
		arg0.aClass77_Sub1_61 = arg1;
		arg0.aClass77_Sub1_62 = arg1.aClass77_Sub1_62;
		arg0.aClass77_Sub1_61.aClass77_Sub1_62 = arg0;
		arg0.aClass77_Sub1_62.aClass77_Sub1_61 = arg0;
	}

	@OriginalMember(owner = "client!o", name = "t", descriptor = "()V", line = 48)
	static void method28871() {
		aClass107_Sub1_1 = null;
		aBoolean749 = false;
	}

	@OriginalMember(owner = "client!o", name = "w", descriptor = "()V", line = 48)
	static void method28872() {
		aClass107_Sub1_1 = null;
		aBoolean749 = false;
	}

	@OriginalMember(owner = "client!o", name = "y", descriptor = "()V", line = 48)
	static void method28873() {
		aClass107_Sub1_1 = null;
		aBoolean749 = false;
	}

	@OriginalMember(owner = "client!o", name = "r", descriptor = "()Z", line = 53)
	static boolean method28874() {
		return aBoolean749;
	}

	@OriginalMember(owner = "client!o", name = "q", descriptor = "()Z", line = 53)
	static boolean method28875() {
		return aBoolean749;
	}

	@OriginalMember(owner = "client!o", name = "x", descriptor = "()Z", line = 53)
	static boolean method28876() {
		return aBoolean749;
	}

	@OriginalMember(owner = "client!o", name = "d", descriptor = "()Z", line = 53)
	static boolean method28877() {
		return aBoolean749;
	}

	@OriginalMember(owner = "client!o", name = "s", descriptor = "()Z", line = 53)
	static boolean method28878() {
		return aBoolean749;
	}

	@OriginalMember(owner = "client!o", name = "z", descriptor = "()V", line = 57)
	static void method28879() {
		@Pc(4) Class115_Sub2 local4 = (Class115_Sub2) aClass107_Sub1_1.method8871();
		@Pc(9) Class149_Sub3 local9 = (Class149_Sub3) aClass107_Sub1_1.method8873();
		@Pc(13) Class447 local13 = local4.method21213();
		@Pc(17) Class452 local17 = local9.method16735();
		if (client.aClass277_6 != null) {
			@Pc(25) int local25 = client.aClass277_6.anInt3874 * -881188269;
			@Pc(30) int local30 = client.aClass277_6.anInt3875 * -1279656873;
			@Pc(32) float local32 = 1000.0F;
			@Pc(44) float local44 = (float) (Math.atan((double) ((float) local25 / 2.0F / local32)) * 2.0D);
			@Pc(56) float local56 = (float) (Math.atan((double) ((float) local30 / 2.0F / local32)) * 2.0D);
			try {
				aClass107_Sub1_1.method8842(local44, local56);
			} catch (@Pc(63) Exception_Sub2 local63) {
			}
		}
		if (Class60.aClass138_1.method14242()) {
			@Pc(69) Class452 local69 = Class452.method29269();
			local69.method29292(1.0F, 0.0F, 0.0F, (float) (Class60.aClass138_1.method14225() - RuntimeException_Sub4.anInt3175 * -230736199) / 200.0F);
			local17.method29330(local69);
			@Pc(92) Class447 local92 = Class447.method29120(0.0F, 1.0F, 0.0F);
			local92.method29198(local17);
			@Pc(97) Class452 local97 = Class452.method29269();
			local97.method29290(local92, (float) (anInt4909 * 1453851069 - Class60.aClass138_1.method14234()) / 200.0F);
			local17.method29330(local97);
			local9.method16715(local17);
		}
		anInt4909 = Class60.aClass138_1.method14234() * 742277525;
		RuntimeException_Sub4.anInt3175 = Class60.aClass138_1.method14225() * -1144821879;
		local17.method29307();
		@Pc(141) Class447 local141;
		if (Class662.aClass141_1.method14784(98)) {
			local141 = Class447.method29120(0.0F, 0.0F, 25.0F);
			local141.method29198(local17);
			local141.aFloat276 *= -1.0F;
			local13.method29146(local141);
		}
		if (Class662.aClass141_1.method14784(99)) {
			local141 = Class447.method29120(0.0F, 0.0F, -25.0F);
			local141.method29198(local17);
			local141.aFloat276 *= -1.0F;
			local13.method29146(local141);
		}
		if (Class662.aClass141_1.method14784(96)) {
			local141 = Class447.method29120(-25.0F, 0.0F, 0.0F);
			local141.method29198(local17);
			local141.aFloat276 *= -1.0F;
			local13.method29146(local141);
		}
		if (Class662.aClass141_1.method14784(97)) {
			local141 = Class447.method29120(25.0F, 0.0F, 0.0F);
			local141.method29198(local17);
			local141.aFloat276 *= -1.0F;
			local13.method29146(local141);
		}
		@Pc(233) Class77_Sub36 local233 = new Class77_Sub36(0, (int) local13.aFloat277, (int) local13.aFloat276, (int) local13.aFloat278);
		local4.method10238(local233);
		@Pc(241) Class595 local241 = client.aClass517_1.method30409();
		@Pc(248) int local248 = local241.anInt5504 * -424199969 << 9;
		@Pc(255) int local255 = local241.anInt5506 * -1166289421 << 9;
		aClass107_Sub1_1.method8778(0.02F, client.aClass517_1.method30459().anIntArrayArrayArray14, client.aClass517_1.method30441(), local248, local255);
	}

	@OriginalMember(owner = "client!o", name = "g", descriptor = "()V", line = 57)
	static void method28880() {
		@Pc(4) Class115_Sub2 local4 = (Class115_Sub2) aClass107_Sub1_1.method8871();
		@Pc(9) Class149_Sub3 local9 = (Class149_Sub3) aClass107_Sub1_1.method8873();
		@Pc(13) Class447 local13 = local4.method21213();
		@Pc(17) Class452 local17 = local9.method16735();
		if (client.aClass277_6 != null) {
			@Pc(25) int local25 = client.aClass277_6.anInt3874 * -881188269;
			@Pc(30) int local30 = client.aClass277_6.anInt3875 * -1279656873;
			@Pc(32) float local32 = 1000.0F;
			@Pc(44) float local44 = (float) (Math.atan((double) ((float) local25 / 2.0F / local32)) * 2.0D);
			@Pc(56) float local56 = (float) (Math.atan((double) ((float) local30 / 2.0F / local32)) * 2.0D);
			try {
				aClass107_Sub1_1.method8842(local44, local56);
			} catch (@Pc(63) Exception_Sub2 local63) {
			}
		}
		if (Class60.aClass138_1.method14242()) {
			@Pc(69) Class452 local69 = Class452.method29269();
			local69.method29292(1.0F, 0.0F, 0.0F, (float) (Class60.aClass138_1.method14225() - RuntimeException_Sub4.anInt3175 * -230736199) / 200.0F);
			local17.method29330(local69);
			@Pc(92) Class447 local92 = Class447.method29120(0.0F, 1.0F, 0.0F);
			local92.method29198(local17);
			@Pc(97) Class452 local97 = Class452.method29269();
			local97.method29290(local92, (float) (anInt4909 * 1453851069 - Class60.aClass138_1.method14234()) / 200.0F);
			local17.method29330(local97);
			local9.method16715(local17);
		}
		anInt4909 = Class60.aClass138_1.method14234() * 742277525;
		RuntimeException_Sub4.anInt3175 = Class60.aClass138_1.method14225() * -1144821879;
		local17.method29307();
		@Pc(141) Class447 local141;
		if (Class662.aClass141_1.method14784(98)) {
			local141 = Class447.method29120(0.0F, 0.0F, 25.0F);
			local141.method29198(local17);
			local141.aFloat276 *= -1.0F;
			local13.method29146(local141);
		}
		if (Class662.aClass141_1.method14784(99)) {
			local141 = Class447.method29120(0.0F, 0.0F, -25.0F);
			local141.method29198(local17);
			local141.aFloat276 *= -1.0F;
			local13.method29146(local141);
		}
		if (Class662.aClass141_1.method14784(96)) {
			local141 = Class447.method29120(-25.0F, 0.0F, 0.0F);
			local141.method29198(local17);
			local141.aFloat276 *= -1.0F;
			local13.method29146(local141);
		}
		if (Class662.aClass141_1.method14784(97)) {
			local141 = Class447.method29120(25.0F, 0.0F, 0.0F);
			local141.method29198(local17);
			local141.aFloat276 *= -1.0F;
			local13.method29146(local141);
		}
		@Pc(233) Class77_Sub36 local233 = new Class77_Sub36(0, (int) local13.aFloat277, (int) local13.aFloat276, (int) local13.aFloat278);
		local4.method10238(local233);
		@Pc(241) Class595 local241 = client.aClass517_1.method30409();
		@Pc(248) int local248 = local241.anInt5504 * -424199969 << 9;
		@Pc(255) int local255 = local241.anInt5506 * -1166289421 << 9;
		aClass107_Sub1_1.method8778(0.02F, client.aClass517_1.method30459().anIntArrayArrayArray14, client.aClass517_1.method30441(), local248, local255);
	}

	@OriginalMember(owner = "client!o", name = "j", descriptor = "()V", line = 57)
	static void method28881() {
		@Pc(4) Class115_Sub2 local4 = (Class115_Sub2) aClass107_Sub1_1.method8871();
		@Pc(9) Class149_Sub3 local9 = (Class149_Sub3) aClass107_Sub1_1.method8873();
		@Pc(13) Class447 local13 = local4.method21213();
		@Pc(17) Class452 local17 = local9.method16735();
		if (client.aClass277_6 != null) {
			@Pc(25) int local25 = client.aClass277_6.anInt3874 * -881188269;
			@Pc(30) int local30 = client.aClass277_6.anInt3875 * -1279656873;
			@Pc(32) float local32 = 1000.0F;
			@Pc(44) float local44 = (float) (Math.atan((double) ((float) local25 / 2.0F / local32)) * 2.0D);
			@Pc(56) float local56 = (float) (Math.atan((double) ((float) local30 / 2.0F / local32)) * 2.0D);
			try {
				aClass107_Sub1_1.method8842(local44, local56);
			} catch (@Pc(63) Exception_Sub2 local63) {
			}
		}
		if (Class60.aClass138_1.method14242()) {
			@Pc(69) Class452 local69 = Class452.method29269();
			local69.method29292(1.0F, 0.0F, 0.0F, (float) (Class60.aClass138_1.method14225() - RuntimeException_Sub4.anInt3175 * -230736199) / 200.0F);
			local17.method29330(local69);
			@Pc(92) Class447 local92 = Class447.method29120(0.0F, 1.0F, 0.0F);
			local92.method29198(local17);
			@Pc(97) Class452 local97 = Class452.method29269();
			local97.method29290(local92, (float) (anInt4909 * 1453851069 - Class60.aClass138_1.method14234()) / 200.0F);
			local17.method29330(local97);
			local9.method16715(local17);
		}
		anInt4909 = Class60.aClass138_1.method14234() * 742277525;
		RuntimeException_Sub4.anInt3175 = Class60.aClass138_1.method14225() * -1144821879;
		local17.method29307();
		@Pc(141) Class447 local141;
		if (Class662.aClass141_1.method14784(98)) {
			local141 = Class447.method29120(0.0F, 0.0F, 25.0F);
			local141.method29198(local17);
			local141.aFloat276 *= -1.0F;
			local13.method29146(local141);
		}
		if (Class662.aClass141_1.method14784(99)) {
			local141 = Class447.method29120(0.0F, 0.0F, -25.0F);
			local141.method29198(local17);
			local141.aFloat276 *= -1.0F;
			local13.method29146(local141);
		}
		if (Class662.aClass141_1.method14784(96)) {
			local141 = Class447.method29120(-25.0F, 0.0F, 0.0F);
			local141.method29198(local17);
			local141.aFloat276 *= -1.0F;
			local13.method29146(local141);
		}
		if (Class662.aClass141_1.method14784(97)) {
			local141 = Class447.method29120(25.0F, 0.0F, 0.0F);
			local141.method29198(local17);
			local141.aFloat276 *= -1.0F;
			local13.method29146(local141);
		}
		@Pc(233) Class77_Sub36 local233 = new Class77_Sub36(0, (int) local13.aFloat277, (int) local13.aFloat276, (int) local13.aFloat278);
		local4.method10238(local233);
		@Pc(241) Class595 local241 = client.aClass517_1.method30409();
		@Pc(248) int local248 = local241.anInt5504 * -424199969 << 9;
		@Pc(255) int local255 = local241.anInt5506 * -1166289421 << 9;
		aClass107_Sub1_1.method8778(0.02F, client.aClass517_1.method30459().anIntArrayArrayArray14, client.aClass517_1.method30441(), local248, local255);
	}

	@OriginalMember(owner = "client!o", name = "w", descriptor = "(IIZZI)I", line = 79)
	public static int method28882(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		@Pc(4) Class77_Sub7 local4 = Class112.method9473(arg0, arg3);
		if (local4 == null) {
			return 0;
		}
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < local4.anIntArray192.length; local13++) {
			if (local4.anIntArray192[local13] >= 0 && local4.anIntArray192[local13] < Class537.aClass35_Sub7_1.anInt2544 * 888398261) {
				@Pc(41) Class18 local41 = (Class18) Class537.aClass35_Sub7_1.method18319(local4.anIntArray192[local13]);
				@Pc(54) int local54 = local41.method379(arg1, ((Class67) Class77_Sub13_Sub12.aClass35_Sub22_1.method18319(arg1)).anInt198 * 263946597);
				if (arg2) {
					local11 += local4.anIntArray193[local13] * local54;
				} else {
					local11 += local54;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!o", name = "o", descriptor = "(Lclient!dx;III)V", line = 587)
	static void method28883(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 < 0 || arg2 < 0 || Class683.aClass442_98 == null) {
			return;
		}
		@Pc(10) Class595 local10 = client.aClass517_1.method30409();
		@Pc(13) Class442 local13 = arg0.method20282();
		Class149_Sub5.method23180(arg0);
		local13.method28969(Class683.aClass455_54);
		local13.method28965(Class683.aClass442_98);
		local13.method28973();
		@Pc(30) int local30 = arg1 - Class683.anInt5831 * 894945745;
		@Pc(36) int local36 = arg2 - Class683.anInt5832 * -655548783;
		if (client.aClass517_1.method30435() == null) {
			return;
		}
		@Pc(52) int local52;
		@Pc(165) int local165;
		@Pc(172) int local172;
		@Pc(220) int local220;
		if (!client.aBoolean619 || (Class96_Sub15.anInt893 * 460977285 & 0x40) != 0) {
			@Pc(50) int local50 = -1;
			local52 = -1;
			@Pc(64) float local64 = (float) local30 * 2.0F / (float) (Class683.anInt5833 * 1852547097) - 1.0F;
			@Pc(76) float local76 = (float) local36 * 2.0F / (float) (Class683.anInt5834 * -1954074475) - 1.0F;
			local13.method28984(local64, local76, -1.0F, Class683.aFloatArray118);
			@Pc(90) float local90 = Class683.aFloatArray118[0] / Class683.aFloatArray118[3];
			@Pc(98) float local98 = Class683.aFloatArray118[1] / Class683.aFloatArray118[3];
			@Pc(106) float local106 = Class683.aFloatArray118[2] / Class683.aFloatArray118[3];
			local13.method28984(local64, local76, 1.0F, Class683.aFloatArray118);
			@Pc(120) float local120 = Class683.aFloatArray118[0] / Class683.aFloatArray118[3];
			@Pc(128) float local128 = Class683.aFloatArray118[1] / Class683.aFloatArray118[3];
			@Pc(136) float local136 = Class683.aFloatArray118[2] / Class683.aFloatArray118[3];
			@Pc(146) float local146 = Class217.method25701(local90, local98, local106, local120, local128, local136, 4);
			if (local146 > 0.0F) {
				@Pc(154) float local154 = local120 - local90;
				@Pc(158) float local158 = local136 - local106;
				local165 = (int) (local154 * local146 + local90);
				local172 = (int) (local106 + local158 * local146);
				local50 = local165 + (Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.method21095() - 1 << 8) >> 9;
				local52 = local172 + (Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.method21095() - 1 << 8) >> 9;
				@Pc(199) byte local199 = Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aByte100;
				if (local199 < 3 && (client.aClass517_1.method30441().aByteArrayArrayArray13[1][local165 >> 9][local172 >> 9] & 0x2) != 0) {
					local220 = local199 + 1;
				}
			}
			if (local50 != -1 && local52 != -1) {
				if (client.aBoolean619 && (Class96_Sub15.anInt893 * 460977285 & 0x40) != 0) {
					@Pc(243) Class277 local243 = Class60.method884(Class173.anInt3295 * -1808298539, client.anInt3475 * -985352023);
					if (local243 == null) {
						Exception_Sub4.method17924();
					} else {
						Class155.method23634(client.aString160, " " + Class184.aString136 + " ", Class130.anInt1407 * -731032933, 59, -1, 0L, local50, local52, true, false, (long) (local50 << 0 | local52), true);
					}
				} else {
					if (Class661.aBoolean856) {
						Class155.method23634(Class44.aClass44_176.method713(Class128.aClass667_3), "", -1, 60, -1, 0L, local50, local52, true, false, (long) (local50 << 0 | local52), true);
					}
					Class155.method23634(Class142.aString58, "", client.anInt3543 * 1361725501, 23, -1, 0L, local50, local52, true, false, (long) (local50 << 0 | local52), true);
				}
			}
		}
		@Pc(330) Class557 local330 = client.aClass517_1.method30435().aClass557_2;
		local52 = arg1;
		@Pc(334) int local334 = arg2;
		@Pc(337) List local337 = local330.aList22;
		@Pc(340) Iterator local340 = local337.iterator();
		while (true) {
			@Pc(377) int local377;
			@Pc(382) int local382;
			@Pc(1361) Interface61 local1361;
			@Pc(1371) Class599 local1371;
			@Pc(465) int local465;
			@Pc(1480) String[] local1480;
			do {
				@Pc(347) Class551 local347;
				do {
					do {
						do {
							@Pc(542) int var25;
							@Pc(658) int var26;
							@Pc(412) int var39;
							@Pc(873) int var64;
							while (true) {
								@Pc(514) Class447 var23;
								@Pc(528) int var24;
								@Pc(477) int var51;
								while (true) {
									do {
										do {
											if (!local340.hasNext()) {
												return;
											}
											local347 = (Class551) local340.next();
										} while (!client.aBoolean597 && Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aByte100 != local347.aClass104_Sub1_25.aByte100);
									} while (!local347.method30994(arg0, local52, local334));
									@Pc(366) boolean local366 = false;
									@Pc(368) boolean local368 = false;
									if (local347.aClass104_Sub1_25 instanceof Class104_Sub1_Sub1) {
										local377 = ((Class104_Sub1_Sub1) local347.aClass104_Sub1_25).aShort131;
										local382 = ((Class104_Sub1_Sub1) local347.aClass104_Sub1_25).aShort132;
									} else {
										@Pc(388) Class447 local388 = local347.aClass104_Sub1_25.method24085().aClass447_61;
										local377 = (int) local388.aFloat277 >> 9;
										local382 = (int) local388.aFloat278 >> 9;
									}
									if (!(local347.aClass104_Sub1_25 instanceof Class104_Sub1_Sub1_Sub1_Sub2)) {
										break;
									}
									@Pc(408) Class104_Sub1_Sub1_Sub1_Sub2 local408 = (Class104_Sub1_Sub1_Sub1_Sub2) local347.aClass104_Sub1_25;
									var39 = local408.method21095();
									@Pc(416) Class447 local416 = local408.method24085().aClass447_61;
									if ((var39 & 0x1) == 0 && ((int) local416.aFloat277 & 0x1FF) == 0 && ((int) local416.aFloat278 & 0x1FF) == 0 || (var39 & 0x1) == 1 && ((int) local416.aFloat277 & 0x1FF) == 256 && ((int) local416.aFloat278 & 0x1FF) == 256) {
										local465 = (int) local416.aFloat277 - (local408.method21095() - 1 << 8);
										var51 = (int) local416.aFloat278 - (local408.method21095() - 1 << 8);
										for (local165 = 0; local165 < client.anInt3527 * -1125820437; local165++) {
											@Pc(492) Class77_Sub6 local492 = (Class77_Sub6) client.aClass12_22.method173((long) client.anIntArray317[local165]);
											if (local492 != null) {
												@Pc(500) Class104_Sub1_Sub1_Sub1_Sub1 local500 = (Class104_Sub1_Sub1_Sub1_Sub1) local492.anObject5;
												if (client.anInt3414 != local500.anInt2895 * 1959487047 && local500.aBoolean484) {
													var23 = local500.method24085().aClass447_61;
													var24 = (int) var23.aFloat277 - (local500.aClass333_1.anInt4117 * -1821838479 - 1 << 8);
													var25 = (int) var23.aFloat278 - (local500.aClass333_1.anInt4117 * -1821838479 - 1 << 8);
													if (var24 >= local465 && local500.aClass333_1.anInt4117 * -1821838479 <= local408.method21095() - (var24 - local465 >> 9) && var25 >= var51 && local500.aClass333_1.anInt4117 * -1821838479 <= local408.method21095() - (var25 - var51 >> 9)) {
														Class306.method27247(local500, Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aByte100 != local347.aClass104_Sub1_25.aByte100);
														local500.anInt2895 = client.anInt3414 * -253074569;
													}
												}
											}
										}
										local165 = Class152.anInt2399 * -1843550713;
										@Pc(603) int[] local603 = Class152.anIntArray221;
										for (local220 = 0; local220 < local165; local220++) {
											@Pc(614) Class104_Sub1_Sub1_Sub1_Sub2 local614 = client.aClass104_Sub1_Sub1_Sub1_Sub2Array1[local603[local220]];
											if (local614 != null && local614.anInt2895 * 1959487047 != client.anInt3414 && local614 != local408 && local614.aBoolean484) {
												@Pc(634) Class447 local634 = local614.method24085().aClass447_61;
												var25 = (int) local634.aFloat277 - (local614.method21095() - 1 << 8);
												var26 = (int) local634.aFloat278 - (local614.method21095() - 1 << 8);
												if (var25 >= local465 && local614.method21095() <= local408.method21095() - (var25 - local465 >> 9) && var26 >= var51 && local614.method21095() <= local408.method21095() - (var26 - var51 >> 9)) {
													Class322.method27467(local614, local347.aClass104_Sub1_25.aByte100 != Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aByte100);
													local614.anInt2895 = client.anInt3414 * -253074569;
												}
											}
										}
									}
									if (client.anInt3414 != local408.anInt2895 * 1959487047) {
										Class322.method27467(local408, local347.aClass104_Sub1_25.aByte100 != Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aByte100);
										local408.anInt2895 = client.anInt3414 * -253074569;
										break;
									}
								}
								if (!(local347.aClass104_Sub1_25 instanceof Class104_Sub1_Sub1_Sub1_Sub1)) {
									break;
								}
								@Pc(741) Class104_Sub1_Sub1_Sub1_Sub1 local741 = (Class104_Sub1_Sub1_Sub1_Sub1) local347.aClass104_Sub1_25;
								if (local741.aClass333_1 == null) {
									break;
								}
								@Pc(749) Class447 local749 = local741.method24085().aClass447_61;
								if ((local741.aClass333_1.anInt4117 * -1821838479 & 0x1) == 0 && ((int) local749.aFloat277 & 0x1FF) == 0 && ((int) local749.aFloat278 & 0x1FF) == 0 || (local741.aClass333_1.anInt4117 * -1821838479 & 0x1) == 1 && ((int) local749.aFloat277 & 0x1FF) == 256 && ((int) local749.aFloat278 & 0x1FF) == 256) {
									@Pc(806) int local806 = (int) local749.aFloat277 - (local741.aClass333_1.anInt4117 * -1821838479 - 1 << 8);
									local465 = (int) local749.aFloat278 - (local741.aClass333_1.anInt4117 * -1821838479 - 1 << 8);
									for (var51 = 0; var51 < client.anInt3527 * -1125820437; var51++) {
										@Pc(835) Class77_Sub6 local835 = (Class77_Sub6) client.aClass12_22.method173((long) client.anIntArray317[var51]);
										if (local835 != null) {
											@Pc(842) Class104_Sub1_Sub1_Sub1_Sub1 local842 = (Class104_Sub1_Sub1_Sub1_Sub1) local835.anObject5;
											if (client.anInt3414 != local842.anInt2895 * 1959487047 && local842 != local741 && local842.aBoolean484) {
												@Pc(859) Class447 local859 = local842.method24085().aClass447_61;
												var64 = (int) local859.aFloat277 - (local842.aClass333_1.anInt4117 * -1821838479 - 1 << 8);
												var24 = (int) local859.aFloat278 - (local842.aClass333_1.anInt4117 * -1821838479 - 1 << 8);
												if (var64 >= local806 && local842.aClass333_1.anInt4117 * -1821838479 <= local741.aClass333_1.anInt4117 * -1821838479 - (var64 - local806 >> 9) && var24 >= local465 && local842.aClass333_1.anInt4117 * -1821838479 <= local741.aClass333_1.anInt4117 * -1821838479 - (var24 - local465 >> 9)) {
													Class306.method27247(local842, local347.aClass104_Sub1_25.aByte100 != Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aByte100);
													local842.anInt2895 = client.anInt3414 * -253074569;
												}
											}
										}
									}
									var51 = Class152.anInt2399 * -1843550713;
									@Pc(952) int[] local952 = Class152.anIntArray221;
									for (local172 = 0; local172 < var51; local172++) {
										@Pc(963) Class104_Sub1_Sub1_Sub1_Sub2 local963 = client.aClass104_Sub1_Sub1_Sub1_Sub2Array1[local952[local172]];
										if (local963 != null && local963.anInt2895 * 1959487047 != client.anInt3414 && local963.aBoolean484) {
											var23 = local963.method24085().aClass447_61;
											var24 = (int) var23.aFloat277 - (local963.method21095() - 1 << 8);
											var25 = (int) var23.aFloat278 - (local963.method21095() - 1 << 8);
											if (var24 >= local806 && local963.method21095() <= local741.aClass333_1.anInt4117 * -1821838479 - (var24 - local806 >> 9) && var25 >= local465 && local963.method21095() <= local741.aClass333_1.anInt4117 * -1821838479 - (var25 - local465 >> 9)) {
												Class322.method27467(local963, Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aByte100 != local347.aClass104_Sub1_25.aByte100);
												local963.anInt2895 = client.anInt3414 * -253074569;
											}
										}
									}
								}
								if (local741.anInt2895 * 1959487047 != client.anInt3414) {
									Class306.method27247(local741, Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aByte100 != local347.aClass104_Sub1_25.aByte100);
									local741.anInt2895 = client.anInt3414 * -253074569;
									break;
								}
							}
							if (local347.aClass104_Sub1_25 instanceof Class104_Sub1_Sub5_Sub1) {
								@Pc(1093) int local1093 = local377 + local10.anInt5504 * -424199969;
								var39 = local382 + local10.anInt5506 * -1166289421;
								@Pc(1116) Class77_Sub9 local1116 = (Class77_Sub9) client.aClass12_19.method173((long) (local347.aClass104_Sub1_25.aByte100 << 28 | var39 << 14 | local1093));
								if (local1116 != null) {
									local465 = 0;
									@Pc(1127) Class77_Sub24 local1127 = (Class77_Sub24) local1116.aClass695_19.method36400();
									while (local1127 != null) {
										@Pc(1138) Class18 local1138 = (Class18) Class537.aClass35_Sub7_1.method18319(local1127.anInt1549 * -400233975);
										if (local1138.aBoolean11) {
											local172 = local1138.anInt106 * 510229545;
										} else if (local1138.aBoolean7) {
											local172 = Class695.aClass635_1.anInt5711 * 1376086885;
										} else {
											local172 = Class695.aClass635_1.anInt5712 * -629529995;
										}
										if (client.aBoolean619 && local347.aClass104_Sub1_25.aByte100 == Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aByte100) {
											@Pc(1184) Class67 local1184 = (Class67) (Class121_Sub1.anInt1207 * 410979031 == -1 ? null : Class77_Sub13_Sub12.aClass35_Sub22_1.method18319(Class121_Sub1.anInt1207 * 410979031));
											if ((Class96_Sub15.anInt893 * 460977285 & 0x1) != 0 && (local1184 == null || local1138.method379(Class121_Sub1.anInt1207 * 410979031, local1184.anInt198 * 263946597) != local1184.anInt198 * 263946597)) {
												Class155.method23634(client.aString160, client.aString161 + " " + Class184.aString136 + " " + Class192.method25433(local172) + local1138.aString2, Class130.anInt1407 * -731032933, 17, -1, (long) (-400233975 * local1127.anInt1549), local377, local382, true, false, (long) local465, false);
											}
										}
										if (local347.aClass104_Sub1_25.aByte100 == Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aByte100) {
											@Pc(1255) String[] local1255 = local1138.aStringArray4;
											for (var64 = local1255.length - 1; var64 >= 0; var64--) {
												if (local1255[var64] != null) {
													@Pc(1269) short local1269 = 0;
													var25 = client.anInt3473 * 2068410197;
													if (var64 == 0) {
														local1269 = 18;
													}
													if (var64 == 1) {
														local1269 = 19;
													}
													if (var64 == 2) {
														local1269 = 20;
													}
													if (var64 == 3) {
														local1269 = 21;
													}
													if (var64 == 4) {
														local1269 = 22;
													}
													if (var64 == 5) {
														local1269 = 1004;
													}
													var26 = local1138.method385(var64);
													if (var26 != -1) {
														var25 = var26;
													}
													Class155.method23634(local1255[var64], Class192.method25433(local172) + local1138.aString2, var25, local1269, -1, (long) (-400233975 * local1127.anInt1549), local377, local382, true, false, (long) local465, false);
												}
											}
										}
										local1127 = (Class77_Sub24) local1116.aClass695_19.method36410();
										local465++;
									}
								}
							}
						} while (!(local347.aClass104_Sub1_25 instanceof Interface61));
						local1361 = (Interface61) local347.aClass104_Sub1_25;
						local1371 = (Class599) client.aClass517_1.method30444().method18319(local1361.method13060());
						if (local1371.anIntArray511 != null) {
							local1371 = local1371.method32006(Class55.aClass124_1, Class55.aClass124_1);
						}
					} while (local1371 == null);
					if (client.aBoolean619 && local347.aClass104_Sub1_25.aByte100 == Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aByte100) {
						@Pc(1407) Class67 local1407 = (Class67) (Class121_Sub1.anInt1207 * 410979031 == -1 ? null : Class77_Sub13_Sub12.aClass35_Sub22_1.method18319(Class121_Sub1.anInt1207 * 410979031));
						if ((Class96_Sub15.anInt893 * 460977285 & 0x4) != 0 && (local1407 == null || local1371.method32008(Class121_Sub1.anInt1207 * 410979031, local1407.anInt198 * 263946597) != local1407.anInt198 * 263946597)) {
							Class155.method23634(client.aString160, client.aString161 + " " + Class184.aString136 + " " + Class192.method25433(65535) + local1371.aString236, Class130.anInt1407 * -731032933, 2, -1, Class552.method31014(local1361, local377, local382), local377, local382, true, false, (long) local1361.hashCode(), false);
						}
					}
				} while (Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aByte100 != local347.aClass104_Sub1_25.aByte100);
				local1480 = local1371.aStringArray34;
			} while (local1480 == null);
			for (local465 = local1480.length - 1; local465 >= 0; local465--) {
				if (local1480[local465] != null) {
					@Pc(1496) short local1496 = 0;
					local165 = client.anInt3473 * 2068410197;
					if (local465 == 0) {
						local1496 = 3;
					}
					if (local465 == 1) {
						local1496 = 4;
					}
					if (local465 == 2) {
						local1496 = 5;
					}
					if (local465 == 3) {
						local1496 = 6;
					}
					if (local465 == 4) {
						local1496 = 1001;
					}
					if (local465 == 5) {
						local1496 = 1002;
					}
					local172 = local1371.method32028(local465);
					if (local172 != -1) {
						local165 = local172;
					}
					Class155.method23634(local1480[local465], Class192.method25433(65535) + local1371.aString236, local165, local1496, -1, Class552.method31014(local1361, local377, local382), local377, local382, true, false, (long) local1361.hashCode(), false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!o", name = "amh", descriptor = "(Lclient!yf;I)V", line = 11728)
	static final void method28884(@OriginalArg(0) Class665 arg0) {
		if (Class597.aClass107_Sub1_2.method8880() != Class331.aClass331_4 || Class597.aClass107_Sub1_2.method8879() != Class321.aClass321_4) {
			throw new RuntimeException();
		}
		@Pc(20) Class447 local20 = ((Class115_Sub1) Class597.aClass107_Sub1_2.method8871()).method9855();
		@Pc(27) Class447 local27 = ((Class149_Sub4) Class597.aClass107_Sub1_2.method8873()).method16846();
		@Pc(30) Class447 local30 = Class447.method29124(local20);
		local30.method29156(local27);
		@Pc(40) float local40 = Class462.method29537(local30.aFloat277, local30.aFloat278);
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = (int) ((double) local40 * 2607.5945876176133D) & 0x3FFF;
	}

	@OriginalMember(owner = "client!o", name = "avh", descriptor = "(Lclient!yf;I)V", line = 13156)
	static final void method28885(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub10_1.method15218() ? 1 : 0;
	}
}
