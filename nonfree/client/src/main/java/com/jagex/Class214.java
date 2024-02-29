package com.jagex;

import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dw")
public class Class214 {

	@OriginalMember(owner = "client!dw", name = "x", descriptor = "I")
	public static final int anInt3687 = 0;

	@OriginalMember(owner = "client!dw", name = "v", descriptor = "I")
	public static final int anInt3688 = 16;

	@OriginalMember(owner = "client!dw", name = "l", descriptor = "I")
	public static final int anInt3689 = 32;

	@OriginalMember(owner = "client!dw", name = "q", descriptor = "I")
	public static final int anInt3690 = 16;

	@OriginalMember(owner = "client!dw", name = "w", descriptor = "I")
	public static final int anInt3691 = 8191;

	@OriginalMember(owner = "client!dw", name = "t", descriptor = "I")
	public static final int anInt3692 = 64;

	@OriginalMember(owner = "client!dw", name = "z", descriptor = "I")
	public static final int anInt3693 = 2;

	@OriginalMember(owner = "client!dw", name = "d", descriptor = "I")
	public static final int anInt3694 = 1;

	@OriginalMember(owner = "client!dw", name = "s", descriptor = "I")
	public static final int anInt3695 = 0;

	@OriginalMember(owner = "client!dw", name = "r", descriptor = "I")
	public static final int anInt3696 = 2;

	@OriginalMember(owner = "client!dw", name = "g", descriptor = "I")
	public static final int anInt3697 = 8;

	@OriginalMember(owner = "client!dw", name = "p", descriptor = "I")
	public static final int anInt3698 = 1023;

	@OriginalMember(owner = "client!dw", name = "hv", descriptor = "Lclient!anl;")
	public static Class35_Sub6 aClass35_Sub6_1;

	@OriginalMember(owner = "client!dw", name = "c", descriptor = "[I")
	public static final int[] anIntArray351 = new int[] { 3, 7, 15 };

	@OriginalMember(owner = "client!dw", name = "y", descriptor = "[I")
	public static final int[] anIntArray350 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!dw", name = "p", descriptor = "(ZB)V", line = 15)
	public static void method25634(@OriginalArg(0) boolean arg0) {
		Class94_Sub4.aClass261_1.method26275();
		if (!Class35_Sub22.method18346(client.anInt3390 * -1850530127)) {
			return;
		}
		@Pc(11) Class82[] local11 = client.aClass82Array1;
		for (@Pc(13) int local13 = 0; local13 < local11.length; local13++) {
			@Pc(21) Class82 local21 = local11[local13];
			local21.anInt322 += -286235183;
			if (local21.anInt322 * -351399119 < 50 && !arg0) {
				return;
			}
			local21.anInt322 = 0;
			if (!local21.aBoolean52 && local21.method2022() != null) {
				@Pc(52) Class77_Sub20 local52 = Class365.method28132(Class414.aClass414_124, local21.aClass16_1);
				local21.method2004(local52);
				try {
					local21.method2000();
				} catch (@Pc(61) IOException local61) {
					local21.aBoolean52 = true;
				}
			}
		}
		Class94_Sub4.aClass261_1.method26275();
	}

	@OriginalMember(owner = "client!dw", name = "<init>", descriptor = "()V", line = 19)
	Class214() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!dw", name = "p", descriptor = "(B)V", line = 36)
	public static void method25635() {
		if (!Class8.aBoolean4) {
			return;
		}
		if (Class8.anInt28 * 2045011039 < Class616.anInt5593 * 206492647) {
			Class8.anInt28 = Class616.anInt5593 * 1816624505;
		}
		while (true) {
			while (Class8.anInt28 * 2045011039 < Class616.anInt5594 * -1664594981) {
				@Pc(27) Class145_Sub1 local27 = Class527.method30680(Class8.anInt28 * 2045011039);
				if (local27 != null && local27.anInt2066 * -663639827 == -1) {
					if (Class8.aClass639_1 == null) {
						Class8.aClass639_1 = client.aClass646_1.method32830(local27.aString60);
					}
					@Pc(55) int local55 = Class8.aClass639_1.anInt5718 * -685874327;
					if (local55 == -1) {
						return;
					}
					local27.anInt2066 = local55 * 307950821;
					Class8.anInt28 += 1148385183;
					Class8.aClass639_1 = null;
				} else {
					Class8.anInt28 += 1148385183;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!dw", name = "t", descriptor = "(Lclient!uq;IILclient!agh;II)V", line = 278)
	public static void method25636(@OriginalArg(0) Class135 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class104_Sub1_Sub1_Sub1 arg3, @OriginalArg(4) int arg4) {
		@Pc(2) Class665 local2 = Class566.method31372();
		local2.aClass104_Sub1_Sub1_Sub1_4 = arg3;
		local2.anInt5785 = arg4 * 436555041;
		Class274.method26548(arg0, arg1, arg2, local2);
		local2.aClass104_Sub1_Sub1_Sub1_4 = null;
		local2.anInt5785 = -436555041;
	}

	@OriginalMember(owner = "client!dw", name = "bp", descriptor = "(Lclient!yf;I)V", line = 4755)
	static final void method25637(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		if (Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aClass628_1 != null) {
			Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aClass628_1.method32547(local13, local23);
		}
	}

	@OriginalMember(owner = "client!dw", name = "ahe", descriptor = "(Lclient!yf;B)V", line = 10711)
	static final void method25638(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(15) Class77_Sub1_Sub8 local15 = Class136.method13911(local12);
		if (local15 == null) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local15.anInt3003 * -192382841;
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local15.anInt3009 * -1004159431;
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local15.anInt3008 * 36458189;
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local15.anInt3010 * 189160645;
		}
	}

	@OriginalMember(owner = "client!dw", name = "aow", descriptor = "(Lclient!yf;I)V", line = 12051)
	static final void method25639(@OriginalArg(0) Class665 arg0) {
		if (client.aString156 == null) {
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = "";
		} else {
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = client.aString156;
		}
	}

	@OriginalMember(owner = "client!dw", name = "atw", descriptor = "(Lclient!yf;B)V", line = 12821)
	static final void method25640(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) int local16 = local12 >> 16;
		if (Class35_Sub11.aClass273Array1[local16] == null) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class35_Sub11.aClass273Array1[local16].aClass277Array2[local12].anInt3862 * -324599085;
		}
	}

	@OriginalMember(owner = "client!dw", name = "atv", descriptor = "(Lclient!yf;I)V", line = 12943)
	static final void method25641(@OriginalArg(0) Class665 arg0) {
		Exception_Sub4.method17924();
	}

	@OriginalMember(owner = "client!dw", name = "axa", descriptor = "(Lclient!yf;B)V", line = 13403)
	static final void method25642(@OriginalArg(0) Class665 arg0) {
		Class465.method29555(arg0.aClass104_Sub1_Sub1_Sub1_4, arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307], true);
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = (int) client.aFloatArray96[0];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = (int) client.aFloatArray96[1];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = (int) client.aFloatArray96[2];
	}

	@OriginalMember(owner = "client!dw", name = "aym", descriptor = "(Lclient!yf;B)V", line = 13651)
	static final void method25643(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class508.aString221.startsWith("mac") ? 1 : 0;
	}
}
