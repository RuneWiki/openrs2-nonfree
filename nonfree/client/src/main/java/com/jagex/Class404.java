package com.jagex;

import java.util.HashMap;
import java.util.Map;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mr")
public class Class404 {

	@OriginalMember(owner = "client!mr", name = "v", descriptor = "[I")
	public int[] anIntArray460;

	@OriginalMember(owner = "client!mr", name = "p", descriptor = "I")
	public int anInt4703;

	@OriginalMember(owner = "client!mr", name = "c", descriptor = "Lclient!arh;")
	public Class77_Sub1_Sub13 aClass77_Sub1_Sub13_1;

	@OriginalMember(owner = "client!mr", name = "c", descriptor = "(Lclient!akv;)Lclient!mr;", line = 13)
	public static Class404 method28522(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(3) Class404 local3 = new Class404();
		local3.anInt4703 = arg0.method22483() * 167533425;
		local3.aClass77_Sub1_Sub13_1 = RuntimeException_Sub4.aClass41_2.method688(local3.anInt4703 * -1791556207);
		return local3;
	}

	@OriginalMember(owner = "client!mr", name = "h", descriptor = "([Lclient!adw;B)Ljava/util/Map;", line = 28)
	public static Map method28523(@OriginalArg(0) Class80_Sub1[] arg0) {
		if (arg0 == null || arg0.length == 0) {
			return null;
		}
		@Pc(11) HashMap local11 = new HashMap();
		@Pc(13) Class80_Sub1[] local13 = arg0;
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(23) Class80_Sub1 local23 = local13[local15];
			local11.put(local23.aClass127_6, local23);
		}
		return local11;
	}

	@OriginalMember(owner = "client!mr", name = "amz", descriptor = "(Lclient!yf;I)V", line = 11823)
	static final void method28524(@OriginalArg(0) Class665 arg0) throws Exception_Sub2 {
		arg0.anInt5784 -= 1235998252;
		@Pc(14) float local14 = (float) arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(25) float local25 = (float) arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(36) float local36 = (float) arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 2];
		@Pc(49) float local49 = (float) arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 3] / 1000.0F;
		Class597.aClass107_Sub1_2.method8834(Class447.method29120(local14, local25, local36), local49);
	}

	@OriginalMember(owner = "client!mr", name = "axo", descriptor = "(Lclient!yf;B)V", line = 13434)
	static final void method28525(@OriginalArg(0) Class665 arg0) {
		@Pc(3) Class104_Sub1_Sub1_Sub1_Sub1 local3 = (Class104_Sub1_Sub1_Sub1_Sub1) arg0.aClass104_Sub1_Sub1_Sub1_4;
		@Pc(5) boolean local5 = false;
		@Pc(8) Class333 local8 = local3.aClass333_1;
		if (local8.anIntArray437 != null) {
			local8 = local8.method27642(Class55.aClass124_1, Class55.aClass124_1);
		}
		if (local8 != null) {
			local5 = local8.aBoolean714;
		}
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local5 ? 1 : 0;
	}
}
