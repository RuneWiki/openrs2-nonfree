package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public class Class226 {

	@OriginalMember(owner = "client!dg", name = "e", descriptor = "Lclient!dg;")
	static final Class226 aClass226_21 = new Class226(4, 1);

	@OriginalMember(owner = "client!dg", name = "n", descriptor = "Lclient!dg;")
	static final Class226 aClass226_20 = new Class226(1, 2);

	@OriginalMember(owner = "client!dg", name = "m", descriptor = "Lclient!dg;")
	static final Class226 aClass226_27 = new Class226(2, 4);

	@OriginalMember(owner = "client!dg", name = "k", descriptor = "Lclient!dg;")
	public static final Class226 aClass226_22 = new Class226(7, 1);

	@OriginalMember(owner = "client!dg", name = "f", descriptor = "Lclient!dg;")
	public static final Class226 aClass226_23 = new Class226(6, 2);

	@OriginalMember(owner = "client!dg", name = "w", descriptor = "Lclient!dg;")
	public static final Class226 aClass226_26 = new Class226(5, 3);

	@OriginalMember(owner = "client!dg", name = "l", descriptor = "Lclient!dg;")
	public static final Class226 aClass226_25 = new Class226(8, 4);

	@OriginalMember(owner = "client!dg", name = "u", descriptor = "Lclient!dg;")
	public static final Class226 aClass226_24 = new Class226(3, 2);

	@OriginalMember(owner = "client!dg", name = "z", descriptor = "Lclient!dg;")
	public static final Class226 aClass226_19 = new Class226(0, 4);

	@OriginalMember(owner = "client!dg", name = "p", descriptor = "I")
	public final int anInt3645;

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "I")
	public final int anInt3646;

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(II)V", line = 18)
	Class226(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3645 = arg0 * 548741485;
		this.anInt3646 = arg1 * 154544613;
	}

	@OriginalMember(owner = "client!dg", name = "k", descriptor = "(B)V", line = 57)
	static void method25608() {
		@Pc(4) Class124_Sub2 local4 = (Class124_Sub2) Class1.aClass123_Sub1_1.method8952();
		@Pc(9) Class25_Sub1 local9 = (Class25_Sub1) Class1.aClass123_Sub1_1.method9040();
		@Pc(13) Class472 local13 = local4.method21402();
		@Pc(17) Class471 local17 = local9.method15969();
		if (client.aClass312_4 != null) {
			@Pc(24) int local24 = client.aClass312_4.anInt3981 * 1215292027;
			@Pc(29) int local29 = client.aClass312_4.anInt3982 * -1490598249;
			@Pc(31) float local31 = 1000.0F;
			@Pc(43) float local43 = (float) (Math.atan((double) ((float) local24 / 2.0F / local31)) * 2.0D);
			@Pc(55) float local55 = (float) (Math.atan((double) ((float) local29 / 2.0F / local31)) * 2.0D);
			try {
				Class1.aClass123_Sub1_1.method9071(local43, local55);
			} catch (@Pc(62) Exception_Sub3 local62) {
			}
		}
		if (Class82.aClass153_1.method14093()) {
			@Pc(68) Class471 local68 = Class471.method29521();
			local68.method29466(1.0F, 0.0F, 0.0F, (float) (Class82.aClass153_1.method14064() - Class627.anInt5705 * -133818179) / 200.0F);
			local17.method29476(local68);
			@Pc(91) Class472 local91 = Class472.method29529(0.0F, 1.0F, 0.0F);
			local91.method29572(local17);
			@Pc(96) Class471 local96 = Class471.method29521();
			local96.method29465(local91, (float) (Class1.anInt1 * -719242275 - Class82.aClass153_1.method14058()) / 200.0F);
			local17.method29476(local96);
			local9.method15963(local17);
		}
		Class1.anInt1 = Class82.aClass153_1.method14058() * 1043723381;
		Class627.anInt5705 = Class82.aClass153_1.method14064() * -155409771;
		local17.method29470();
		@Pc(140) Class472 local140;
		if (Class112_Sub2_Sub2.aClass158_2.method14308(98)) {
			local140 = Class472.method29529(0.0F, 0.0F, 25.0F);
			local140.method29572(local17);
			local140.aFloat318 *= -1.0F;
			local13.method29543(local140);
		}
		if (Class112_Sub2_Sub2.aClass158_2.method14308(99)) {
			local140 = Class472.method29529(0.0F, 0.0F, -25.0F);
			local140.method29572(local17);
			local140.aFloat318 *= -1.0F;
			local13.method29543(local140);
		}
		if (Class112_Sub2_Sub2.aClass158_2.method14308(96)) {
			local140 = Class472.method29529(-25.0F, 0.0F, 0.0F);
			local140.method29572(local17);
			local140.aFloat318 *= -1.0F;
			local13.method29543(local140);
		}
		if (Class112_Sub2_Sub2.aClass158_2.method14308(97)) {
			local140 = Class472.method29529(25.0F, 0.0F, 0.0F);
			local140.method29572(local17);
			local140.aFloat318 *= -1.0F;
			local13.method29543(local140);
		}
		@Pc(232) Class93_Sub30 local232 = new Class93_Sub30(0, (int) local13.aFloat317, (int) local13.aFloat318, (int) local13.aFloat319);
		local4.method9297(local232);
		@Pc(240) Class611 local240 = client.aClass532_1.method30443();
		@Pc(247) int local247 = local240.anInt5623 * 270611681 << 9;
		@Pc(254) int local254 = local240.anInt5624 * -1994307635 << 9;
		Class1.aClass123_Sub1_1.method8924(0.02F, client.aClass532_1.method30460().anIntArrayArrayArray14, client.aClass532_1.method30509(), local247, local254);
	}

	@OriginalMember(owner = "client!dg", name = "co", descriptor = "(Lclient!yf;I)V", line = 5394)
	static final void method25606(@OriginalArg(0) Class681 arg0) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class166_Sub46.method16538(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!dg", name = "aba", descriptor = "(Lclient!yf;I)V", line = 9888)
	static final void method25607(@OriginalArg(0) Class681 arg0) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class557.aClass297_1.method26622(local12).method26748();
	}
}
