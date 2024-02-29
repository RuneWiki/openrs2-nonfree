package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gh")
public class Class273 {

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "[Lclient!gm;")
	Class277[] aClass277Array1;

	@OriginalMember(owner = "client!gh", name = "p", descriptor = "[Lclient!gm;")
	public Class277[] aClass277Array2;

	@OriginalMember(owner = "client!gh", name = "v", descriptor = "Z")
	public boolean aBoolean662;

	@OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(Z[Lclient!gm;)V", line = 8)
	Class273(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class277[] arg1) {
		this.aClass277Array2 = arg1;
		this.aBoolean662 = arg0;
	}

	@OriginalMember(owner = "client!gh", name = "p", descriptor = "(B)[Lclient!gm;", line = 14)
	public Class277[] method26533() {
		return this.aClass277Array1 == null ? this.aClass277Array2 : this.aClass277Array1;
	}

	@OriginalMember(owner = "client!gh", name = "w", descriptor = "()[Lclient!gm;", line = 14)
	public Class277[] method26534() {
		return this.aClass277Array1 == null ? this.aClass277Array2 : this.aClass277Array1;
	}

	@OriginalMember(owner = "client!gh", name = "l", descriptor = "()[Lclient!gm;", line = 14)
	public Class277[] method26535() {
		return this.aClass277Array1 == null ? this.aClass277Array2 : this.aClass277Array1;
	}

	@OriginalMember(owner = "client!gh", name = "y", descriptor = "()[Lclient!gm;", line = 14)
	public Class277[] method26536() {
		return this.aClass277Array1 == null ? this.aClass277Array2 : this.aClass277Array1;
	}

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "(B)[Lclient!gm;", line = 18)
	public Class277[] method26537() {
		if (this.aClass277Array1 == null) {
			@Pc(7) int local7 = this.aClass277Array2.length;
			this.aClass277Array1 = new Class277[local7];
			System.arraycopy(this.aClass277Array2, 0, this.aClass277Array1, 0, this.aClass277Array2.length);
		}
		return this.aClass277Array1;
	}

	@OriginalMember(owner = "client!gh", name = "v", descriptor = "(II)Lclient!gm;", line = 27)
	public Class277 method26538(@OriginalArg(0) int arg0) {
		if (arg0 >>> 16 != this.aClass277Array2[0].anInt3863 * -1278450723 >>> 16) {
			throw new IllegalArgumentException();
		}
		return this.aClass277Array2[arg0 & 0xFFFF];
	}

	@OriginalMember(owner = "client!gh", name = "t", descriptor = "(I)Lclient!gm;", line = 27)
	public Class277 method26539(@OriginalArg(0) int arg0) {
		if (arg0 >>> 16 != this.aClass277Array2[0].anInt3863 * -1278450723 >>> 16) {
			throw new IllegalArgumentException();
		}
		return this.aClass277Array2[arg0 & 0xFFFF];
	}

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "(Lclient!pw;II)Lclient!cy;", line = 89)
	public static Class83 method26540(@OriginalArg(0) Class478 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class83 local5 = (Class83) Class319.aClass232_76.method25835((long) arg1);
		if (local5 == null) {
			if (Class252.aBoolean655) {
				local5 = Class284.aClass86_9.method20076(Class210.method25594(arg0, arg1), true);
			} else {
				local5 = Class667.method33160(arg0.method29745(arg1));
			}
			Class319.aClass232_76.method25844(local5, (long) arg1);
		}
		return local5;
	}

	@OriginalMember(owner = "client!gh", name = "r", descriptor = "(Lclient!ajo;IIIII)V", line = 405)
	static void method26541(@OriginalArg(0) Class77_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (-241175639 * arg0.anInt1502 == -1 && arg0.anIntArray197 == null) {
			return;
		}
		@Pc(14) int local14 = arg0.anInt1495 * 63994171;
		if (arg0.anInt1488 * 984135565 != 0 && Class35_Sub6.aClass77_Sub35_45.aClass143_Sub27_1.method15901() != 0 && arg0.anInt1489 * 377042463 == arg1) {
			if (arg0.aClass496_3 != null && (arg0.aClass496_3.method30110() == Class486.aClass486_3 || arg0.aClass496_3.method30110() == Class486.aClass486_7)) {
				Class94_Sub4.aClass261_1.method26325(arg0.aClass496_3);
				arg0.aClass496_3 = null;
			}
			@Pc(102) int local102;
			@Pc(122) int local122;
			@Pc(203) int local203;
			if (arg0.aClass496_3 != null) {
				local203 = (int) ((float) (arg0.anInt1490 * 1285097747) + (float) (arg0.anInt1492 * 37947927 - arg0.anInt1490 * 1285097747) * 0.5F);
				local102 = (int) ((float) (arg0.anInt1493 * -374666787 - arg0.anInt1491 * -1700987663) * 0.5F + (float) (arg0.anInt1491 * -1700987663));
				arg0.aClass447_45.aFloat277 = local203;
				arg0.aClass447_45.aFloat278 = local102;
			} else if (arg0.anInt1502 * -241175639 >= 0) {
				@Pc(82) short local82 = 256;
				local102 = (int) ((float) (arg0.anInt1492 * 37947927 - arg0.anInt1490 * 1285097747) * 0.5F + (float) (arg0.anInt1490 * 1285097747));
				local122 = (int) ((float) (arg0.anInt1491 * -1700987663) + (float) (arg0.anInt1493 * -374666787 - arg0.anInt1491 * -1700987663) * 0.5F);
				arg0.aClass447_45.aFloat277 = local102;
				arg0.aClass447_45.aFloat278 = local122;
				arg0.aClass496_3 = Class94_Sub4.aClass261_1.method26331(Class239.aClass239_2, arg0, arg0.anInt1502 * -241175639, -1, 0, Class220.aClass220_10.method25727(), Class235.aClass235_3, (float) (arg0.anInt1503 * -1081773949), (float) (arg0.anInt1488 * 984135565), arg0.aClass447_45, 0, local82, false);
				if (arg0.aClass496_3 != null) {
					@Pc(172) float local172 = (float) local14 / 255.0F;
					arg0.aClass496_3.method30155(local172, 150);
					arg0.aClass496_3.method30099();
				}
			}
			if (arg0.aClass496_4 != null) {
				local203 = (int) ((float) (arg0.anInt1492 * 37947927 - arg0.anInt1490 * 1285097747) * 0.5F + (float) (arg0.anInt1490 * 1285097747));
				local102 = (int) ((float) (arg0.anInt1491 * -1700987663) + (float) (arg0.anInt1493 * -374666787 - arg0.anInt1491 * -1700987663) * 0.5F);
				arg0.aClass447_46.aFloat277 = local203;
				arg0.aClass447_46.aFloat278 = local102;
				if (arg0.aClass496_4.method30110() == Class486.aClass486_3 || arg0.aClass496_4.method30110() == Class486.aClass486_7) {
					Class94_Sub4.aClass261_1.method26325(arg0.aClass496_4);
					arg0.aClass496_4 = null;
				}
			} else if (arg0.anIntArray197 != null && (arg0.anInt1501 -= arg4 * 835810559) * 1102416639 <= 0) {
				local203 = arg0.anInt1504 * -1536094921 == 256 && arg0.anInt1496 * 1762794043 == 256 ? 256 : (int) (Math.random() * (double) (arg0.anInt1504 * -1536094921 - arg0.anInt1496 * 1762794043)) + arg0.anInt1496 * 1762794043;
				local102 = (int) (Math.random() * (double) arg0.anIntArray197.length);
				local122 = (int) ((float) (arg0.anInt1490 * 1285097747) + (float) (arg0.anInt1492 * 37947927 - arg0.anInt1490 * 1285097747) * 0.5F);
				@Pc(332) int local332 = (int) ((float) (arg0.anInt1491 * -1700987663) + (float) (arg0.anInt1493 * -374666787 - arg0.anInt1491 * -1700987663) * 0.5F);
				arg0.aClass447_46.aFloat277 = local122;
				arg0.aClass447_46.aFloat278 = local332;
				arg0.aClass496_4 = Class94_Sub4.aClass261_1.method26331(Class239.aClass239_3, arg0, arg0.anIntArray197[local102], 0, local14, Class220.aClass220_1.method25727(), Class235.aClass235_3, (float) (arg0.anInt1503 * -1081773949), (float) (arg0.anInt1488 * 984135565 + arg0.anInt1503 * -1081773949), arg0.aClass447_46, 0, local203, false);
				if (arg0.aClass496_4 != null) {
					arg0.aClass496_4.method30099();
				}
				arg0.anInt1501 = (arg0.anInt1505 * -1089168257 + (int) (Math.random() * (double) (arg0.anInt1506 * 1512108791 - arg0.anInt1505 * -1089168257))) * 835810559;
			}
		} else if (arg0.aClass496_3 != null) {
			arg0.aClass496_3.method30100(100);
			Class94_Sub4.aClass261_1.method26325(arg0.aClass496_3);
			arg0.aClass496_3 = null;
		}
	}

	@OriginalMember(owner = "client!gh", name = "us", descriptor = "(Lclient!yf;I)V", line = 8272)
	static final void method26542(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 926998689;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(33) int local33 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 2];
		Class94_Sub4.aClass261_1.method26303(local13, local23, local33);
	}

	@OriginalMember(owner = "client!gh", name = "afv", descriptor = "(Lclient!yf;B)V", line = 10104)
	static final void method26543(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5781 -= -1374580330;
		@Pc(14) String local14 = (String) arg0.anObjectArray45[arg0.anInt5781 * 1485266147];
		@Pc(25) String local25 = (String) arg0.anObjectArray45[arg0.anInt5781 * 1485266147 + 1];
		arg0.anInt5784 -= 617999126;
		@Pc(39) int local39 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(49) int local49 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		if (local25 == null) {
			local25 = "";
		}
		if (local25.length() > 80) {
			local25 = local25.substring(0, 80);
		}
		@Pc(66) Class82 local66 = Class230.method25826();
		@Pc(72) Class77_Sub20 local72 = Class365.method28132(Class414.aClass414_52, local66.aClass16_1);
		local72.aClass77_Sub39_Sub1_2.method22403(Class664.method33107(local14) + 2 + Class664.method33107(local25));
		local72.aClass77_Sub39_Sub1_2.method22440(local14);
		local72.aClass77_Sub39_Sub1_2.method22403(local39 - 1);
		local72.aClass77_Sub39_Sub1_2.method22403(local49);
		local72.aClass77_Sub39_Sub1_2.method22440(local25);
		local66.method2004(local72);
	}
}
