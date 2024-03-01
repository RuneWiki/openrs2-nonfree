package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rp")
class Class534 implements Interface41 {

	@OriginalMember(owner = "client!rp", name = "hd", descriptor = "Lclient!aol;")
	public static Class32_Sub10 aClass32_Sub10_1;

	// $FF: synthetic field
	@OriginalMember(owner = "client!rp", name = "this$0", descriptor = "Lclient!rq;")
	final Class535 this$0;

	@OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(Lclient!rq;)V", line = 74)
	Class534(@OriginalArg(0) Class535 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!rp", name = "n", descriptor = "()V", line = 76)
	@Override
	public void method30621() {
		this.this$0.method30657(true);
	}

	@OriginalMember(owner = "client!rp", name = "e", descriptor = "(I)V", line = 76)
	@Override
	public void method30622() {
		this.this$0.method30657(true);
	}

	@OriginalMember(owner = "client!rp", name = "m", descriptor = "()V", line = 76)
	@Override
	public void method30620() {
		this.this$0.method30657(true);
	}

	@OriginalMember(owner = "client!rp", name = "k", descriptor = "()V", line = 76)
	@Override
	public void method30623() {
		this.this$0.method30657(true);
	}

	@OriginalMember(owner = "client!rp", name = "h", descriptor = "(Lclient!yf;I)V", line = 105)
	static void method30627(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray519[arg0.anInt5891 * -1497248091 - 2] = ((Class347) Class288.aClass55_Sub2_1.method18261(arg0.anIntArray519[arg0.anInt5891 * -1497248091 - 2])).method27590(Class624.aClass120_1, arg0.anIntArray519[arg0.anInt5891 * -1497248091 - 1]) ? 1 : 0;
		arg0.anInt5891 -= 1189701933;
	}

	@OriginalMember(owner = "client!rp", name = "u", descriptor = "(Lclient!ase;ILclient!aqk;II)V", line = 484)
	static final void method30625(@OriginalArg(0) Class93_Sub41_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class132_Sub1_Sub1_Sub1_Sub2 arg2, @OriginalArg(3) int arg3) {
		@Pc(8) int local8;
		if ((arg3 & 0x80) != 0) {
			@Pc(6) int[] local6 = new int[4];
			for (local8 = 0; local8 < 4; local8++) {
				local6[local8] = arg0.method22436();
			}
			local8 = arg0.method22497();
			Class623.method32148(arg2, local6, local8, false);
		}
		@Pc(66) int local66;
		@Pc(73) Class500 local73;
		@Pc(79) Class466 local79;
		@Pc(57) int local57;
		if ((arg3 & 0x40000) != 0) {
			arg0.anInt3070 += 1403713386;
			local57 = arg0.aByteArray58[(arg0.anInt3070 += -1445626955) * 212851357 - 1] & 0xFF;
			for (local8 = 0; local8 < local57; local8++) {
				local66 = arg0.method22499();
				local73 = (Class500) Class107.method18119(Class500.method30159(), local66);
				local79 = Class21.aClass79_Sub1_Sub1_1.method1464(arg0, local73);
				arg2.anInterface3_5.method776(local79.anInt5092 * -1181855333, local79.anObject19);
			}
		}
		if ((arg3 & 0x10) != 0) {
			arg2.anInt2799 = arg0.method22459() * 1224757437;
			if (arg2.anInt2763 * -846948133 == 0) {
				arg2.method19951(arg2.anInt2799 * 1643784853);
				arg2.anInt2799 = -1224757437;
			}
		}
		if ((arg3 & 0x10000) != 0) {
			arg2.aBoolean455 = arg0.method22499() == 1;
		}
		@Pc(155) int local155;
		@Pc(151) int local151;
		@Pc(170) int local170;
		if ((arg3 & 0x20) != 0) {
			local57 = arg0.method22449();
			@Pc(197) int local197;
			if (local57 > 0) {
				for (local8 = 0; local8 < local57; local8++) {
					local151 = -1;
					local155 = -1;
					local66 = arg0.method22632();
					if (local66 == 32767) {
						local66 = arg0.method22632();
						local170 = arg0.method22632();
						local151 = arg0.method22632();
						local155 = arg0.method22632();
					} else if (local66 == 32766) {
						local66 = -1;
						local170 = arg0.method22413();
					} else {
						local170 = arg0.method22632();
					}
					local197 = arg0.method22632();
					arg2.method19958(local66, local170, local151, local155, client.anInt3485, local197);
				}
			}
			local8 = arg0.method22499();
			if (local8 > 0) {
				for (local66 = 0; local66 < local8; local66++) {
					local151 = arg0.method22632();
					local170 = arg0.method22632();
					if (local170 == 32767) {
						arg2.method19960(local151);
					} else {
						local155 = arg0.method22632();
						local197 = arg0.method22499();
						@Pc(246) int local246 = local170 > 0 ? arg0.method22497() : local197;
						arg2.method19959(local151, client.anInt3485, local170, local155, local197, local246);
					}
				}
			}
		}
		@Pc(274) int[] local274;
		@Pc(277) int[] local277;
		if ((arg3 & 0x8000) != 0) {
			local57 = arg0.method22499();
			local274 = new int[local57];
			local277 = new int[local57];
			@Pc(280) int[] local280 = new int[local57];
			for (local170 = 0; local170 < local57; local170++) {
				local274[local170] = arg0.method22436();
				local277[local170] = arg0.method22449();
				local280[local170] = arg0.method22459();
			}
			Class133_Sub1.method10077(arg2, local274, local277, local280);
		}
		@Pc(359) boolean local359;
		if ((arg3 & 0x100000) != 0) {
			local57 = arg0.method22459();
			local8 = arg0.method22468();
			if (local57 == 65535) {
				local57 = -1;
			}
			local66 = arg0.method22449();
			local151 = local66 & 0x7;
			local170 = local66 >> 3 & 0xF;
			if (local170 == 15) {
				local170 = -1;
			}
			local359 = (local66 >> 7 & 0x1) == 1;
			arg2.method20010(local57, local8, local151, local170, local359, 4);
		}
		@Pc(379) byte[] local379;
		@Pc(384) Class93_Sub41 local384;
		if ((arg3 & 0x4) != 0) {
			local57 = arg0.method22449();
			local379 = new byte[local57];
			local384 = new Class93_Sub41(local379);
			arg0.method22531(local379, 0, local57);
			Class174.aClass93_Sub41Array2[arg1] = local384;
			arg2.method20066(local384);
		}
		if ((arg3 & 0x80000) != 0) {
			local57 = arg0.method22449();
			local274 = new int[local57];
			local277 = new int[local57];
			for (local151 = 0; local151 < local57; local151++) {
				local170 = arg0.method22457();
				if ((local170 & 0xC000) == 49152) {
					local155 = arg0.method22457();
					local274[local151] = local170 << 16 | local155;
				} else {
					local274[local151] = local170;
				}
				local277[local151] = arg0.method22443();
			}
			arg2.method19954(local274, local277);
		}
		if ((arg3 & 0x2000) != 0) {
			local57 = arg0.method22415();
			local8 = arg0.method22508();
			if (local57 == 65535) {
				local57 = -1;
			}
			local66 = arg0.method22449();
			local151 = local66 & 0x7;
			local170 = local66 >> 3 & 0xF;
			if (local170 == 15) {
				local170 = -1;
			}
			local359 = (local66 >> 7 & 0x1) == 1;
			arg2.method20010(local57, local8, local151, local170, local359, 2);
		}
		if ((arg3 & 0x2) != 0) {
			local57 = arg0.method22459();
			local8 = arg0.method22538();
			if (local57 == 65535) {
				local57 = -1;
			}
			local66 = arg0.method22449();
			local151 = local66 & 0x7;
			local170 = local66 >> 3 & 0xF;
			if (local170 == 15) {
				local170 = -1;
			}
			local359 = (local66 >> 7 & 0x1) == 1;
			arg2.method20010(local57, local8, local151, local170, local359, 0);
		}
		if ((arg3 & 0x800) != 0) {
			local57 = arg0.method22413();
			local379 = new byte[local57];
			local384 = new Class93_Sub41(local379);
			arg0.method22471(local379, 0, local57);
			Class174.aClass93_Sub41Array1[arg1] = local384;
			arg2.method20048(local384);
		}
		if ((arg3 & 0x20000) != 0) {
			arg2.anInterface3_5.method777();
			arg0.anInt3070 += 1403713386;
			local57 = arg0.aByteArray58[(arg0.anInt3070 += -1445626955) * 212851357 - 1] & 0xFF;
			for (local8 = 0; local8 < local57; local8++) {
				local66 = arg0.method22499();
				local73 = (Class500) Class107.method18119(Class500.method30159(), local66);
				local79 = Class21.aClass79_Sub1_Sub1_1.method1464(arg0, local73);
				arg2.anInterface3_5.method776(local79.anInt5092 * -1181855333, local79.anObject19);
			}
		}
		@Pc(673) String local673;
		if ((arg3 & 0x200) != 0) {
			local673 = arg0.method22427();
			if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 == arg2) {
				Class227.method25614(2, 0, arg2.method20052(true), arg2.method20053(false), arg2.aString81, local673, null);
			}
			arg2.method20061(local673, 0, 0);
		}
		if ((arg3 & 0x8) != 0) {
			arg2.anInt2775 = arg0.method22389() * -1449351677;
			arg2.anInt2777 = arg0.method22414() * -2034096445;
			arg2.anInt2793 = arg0.method22389() * -688148243;
			arg2.anInt2778 = arg0.method22451() * 501346955;
			arg2.anInt2773 = arg0.method22451() * -1861667641;
			arg2.anInt2779 = arg0.method22414() * -1832474127;
			arg2.anInt2780 = (arg0.method22459() + client.anInt3485) * 755240883;
			arg2.anInt2762 = (arg0.method22457() + client.anInt3485) * 1838812733;
			arg2.anInt2782 = arg0.method22457() * 862199857;
			arg2.anInt2763 = 1975362387;
			arg2.anInt2760 = 0;
			arg2.anInt2775 += arg2.anIntArray240[0] * -1449351677;
			arg2.anInt2777 += arg2.anIntArray239[0] * -2034096445;
			arg2.anInt2793 += arg2.anIntArray240[0] * -688148243;
			arg2.anInt2778 += arg2.anIntArray239[0] * 501346955;
			arg2.anInt2773 += arg2.aByte100 * -1861667641;
			arg2.anInt2779 += arg2.aByte100 * -1832474127;
		}
		if ((arg3 & 0x1) != 0) {
			local57 = arg0.method22415();
			if (local57 == 65535) {
				local57 = -1;
			}
			arg2.anInt2772 = local57 * -1158576417;
		}
		if ((arg3 & 0x800000) != 0) {
			arg2.aByte71 = arg0.method22389();
			arg2.aByte72 = arg0.method22503();
			arg2.aByte73 = arg0.method22389();
			arg2.aByte74 = (byte) arg0.method22449();
			arg2.anInt2789 = (client.anInt3485 + arg0.method22415()) * 782633717;
			arg2.anInt2796 = (client.anInt3485 + arg0.method22415()) * 1198097015;
		}
		if ((arg3 & 0x400) != 0) {
			arg2.aClass286_1 = (Class286) Class107.method18119(Class286.method26523(), arg0.method22497());
			if (arg2.aClass286_1 == null) {
				arg2.aClass286_1 = Class286.aClass286_5;
			}
		}
		if ((arg3 & 0x100) != 0) {
			local57 = arg0.method22459();
			local8 = arg0.method22508();
			if (local57 == 65535) {
				local57 = -1;
			}
			local66 = arg0.method22497();
			local151 = local66 & 0x7;
			local170 = local66 >> 3 & 0xF;
			if (local170 == 15) {
				local170 = -1;
			}
			local359 = (local66 >> 7 & 0x1) == 1;
			arg2.method20010(local57, local8, local151, local170, local359, 1);
		}
		if ((arg3 & 0x200000) != 0) {
			local673 = arg0.method22427();
			local8 = arg0.method22413();
			if ((local8 & 0x1) != 0) {
				Class227.method25614(2, local8, arg2.method20052(true), arg2.method20053(false), arg2.aString81, local673, null);
			}
			arg2.method20061(local673, 0, 0);
		}
		if ((arg3 & 0x400000) == 0) {
			return;
		}
		local57 = arg0.method22459();
		local8 = arg0.method22419();
		if (local57 == 65535) {
			local57 = -1;
		}
		local66 = arg0.method22449();
		local151 = local66 & 0x7;
		local170 = local66 >> 3 & 0xF;
		if (local170 == 15) {
			local170 = -1;
		}
		local359 = (local66 >> 7 & 0x1) == 1;
		arg2.method20010(local57, local8, local151, local170, local359, 3);
	}

	@OriginalMember(owner = "client!rp", name = "ajx", descriptor = "(Lclient!yf;I)V", line = 11480)
	static final void method30624(@OriginalArg(0) Class681 arg0) {
		Class93_Sub36.method14380(arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091]);
	}

	@OriginalMember(owner = "client!rp", name = "aoc", descriptor = "(Lclient!yf;I)V", line = 12448)
	static final void method30626(@OriginalArg(0) Class681 arg0) {
		if (Class65.aClass123_Sub1_2.method9023() != Class342.aClass342_3) {
			throw new RuntimeException();
		}
		@Pc(13) Class124_Sub1 local13 = (Class124_Sub1) Class65.aClass123_Sub1_2.method8952();
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = (int) ((double) local13.method9168() * 2607.5945876176133D) & 0x3FFF;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = (int) ((double) local13.method9169() * 2607.5945876176133D) & 0x3FFF;
	}

	@OriginalMember(owner = "client!rp", name = "awi", descriptor = "(Lclient!yf;I)V", line = 13741)
	static final void method30628(@OriginalArg(0) Class681 arg0) {
		@Pc(3) int local3 = client.aClass16_22.method218();
		if (-703563959 * client.anInt3526 != -1) {
			local3++;
		}
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local3;
	}
}
