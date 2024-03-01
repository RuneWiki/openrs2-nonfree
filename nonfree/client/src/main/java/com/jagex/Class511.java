package com.jagex;

import java.util.HashMap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ur")
public class Class511 {

	@OriginalMember(owner = "client!ur", name = "cg", descriptor = "Ljava/lang/String;")
	static String aString232;

	@OriginalMember(owner = "client!ur", name = "j", descriptor = "I")
	static int anInt5259;

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "Ljava/util/HashMap;")
	public HashMap aHashMap9;

	@OriginalMember(owner = "client!ur", name = "p", descriptor = "Lclient!jv;")
	Class265 aClass265_3;

	@OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(Lclient!jv;)V", line = 11)
	public Class511(@OriginalArg(0) Class265 arg0) {
		this.method29581();
		this.aClass265_3 = arg0;
	}

	@OriginalMember(owner = "client!ur", name = "p", descriptor = "(B)V", line = 17)
	void method29581() {
		this.aHashMap9 = new HashMap();
		this.aHashMap9.put(Class357.aClass357_2, 50);
	}

	@OriginalMember(owner = "client!ur", name = "n", descriptor = "(I)V", line = 484)
	static void method29585() {
		if (Class250.aClass3_Sub1_Sub9_1 != null) {
			Class250.aClass3_Sub1_Sub9_1 = null;
			Class198.method24130(Class356.anInt4637 * 1084730905, Class151.anInt3438 * 2118805765, Class381.anInt4707 * -1605305641, Class598.anInt5520 * 1979992829);
		}
	}

	@OriginalMember(owner = "client!ur", name = "vq", descriptor = "(Lclient!vs;B)V", line = 7900)
	static final void method29582(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 100;
	}

	@OriginalMember(owner = "client!ur", name = "zt", descriptor = "(Lclient!vs;I)V", line = 8592)
	static final void method29583(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = arg0.aClass245_4.anInt3791 * -1161929397;
	}

	@OriginalMember(owner = "client!ur", name = "lq", descriptor = "(ZII)V", line = 11403)
	public static final void method29584(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class3_Sub30 local5 = arg0 ? Class68.aClass3_Sub30_2 : Class14_Sub5.aClass3_Sub30_1;
		if (local5 == null || arg1 < 0 || arg1 >= local5.anInt1331 * 132295085) {
			return;
		}
		@Pc(21) Class238 local21 = local5.aClass238Array1[arg1];
		if (local21.aByte129 != -1) {
			return;
		}
		@Pc(29) String local29 = local21.aString192;
		@Pc(32) Class82 local32 = Class406.method27657();
		@Pc(38) Class3_Sub23 local38 = Class269.method25284(Class311.aClass311_19, local32.aClass577_2);
		local38.aClass3_Sub41_Sub1_1.method20250(Class43_Sub2.method8763(local29) + 3);
		local38.aClass3_Sub41_Sub1_1.method20250(arg0 ? 1 : 0);
		local38.aClass3_Sub41_Sub1_1.method20251(arg1);
		local38.aClass3_Sub41_Sub1_1.method20260(local29);
		local32.method21601(local38);
	}

	@OriginalMember(owner = "client!ur", name = "apo", descriptor = "(Lclient!vs;B)V", line = 11683)
	static final void method29586(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class510.aClass3_Sub45_37.aClass60_Sub14_1.method13486();
	}
}
