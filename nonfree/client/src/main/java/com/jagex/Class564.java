package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ww")
public class Class564 implements Interface56 {

	@OriginalMember(owner = "client!ww", name = "p", descriptor = "Lclient!ww;")
	public static final Class564 aClass564_5 = new Class564(-2);

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "Lclient!ww;")
	public static final Class564 aClass564_3 = new Class564(-3);

	@OriginalMember(owner = "client!ww", name = "g", descriptor = "Lclient!ww;")
	static final Class564 aClass564_4 = new Class564(2);

	@OriginalMember(owner = "client!ww", name = "l", descriptor = "Lclient!ww;")
	public static final Class564 aClass564_7 = new Class564(3);

	@OriginalMember(owner = "client!ww", name = "h", descriptor = "Lclient!ww;")
	static final Class564 aClass564_6 = new Class564(4);

	@OriginalMember(owner = "client!ww", name = "x", descriptor = "Lclient!ww;")
	static final Class564 aClass564_8 = new Class564(5);

	@OriginalMember(owner = "client!ww", name = "s", descriptor = "Lclient!ww;")
	static final Class564 aClass564_2 = new Class564(6);

	@OriginalMember(owner = "client!ww", name = "u", descriptor = "Lclient!ww;")
	static final Class564 aClass564_9 = new Class564(7);

	@OriginalMember(owner = "client!ww", name = "y", descriptor = "Lclient!ww;")
	static final Class564 aClass564_10 = new Class564(8);

	@OriginalMember(owner = "client!ww", name = "b", descriptor = "I")
	final int anInt5370;

	@OriginalMember(owner = "client!ww", name = "s", descriptor = "()[Lclient!ww;", line = 20)
	public static Class564[] method32896() {
		return new Class564[] { aClass564_8, aClass564_9, aClass564_10, aClass564_4, aClass564_2, aClass564_3, aClass564_6, aClass564_5, aClass564_7 };
	}

	@OriginalMember(owner = "client!ww", name = "g", descriptor = "()[Lclient!ww;", line = 20)
	public static Class564[] method32897() {
		return new Class564[] { aClass564_8, aClass564_9, aClass564_10, aClass564_4, aClass564_2, aClass564_3, aClass564_6, aClass564_5, aClass564_7 };
	}

	@OriginalMember(owner = "client!ww", name = "u", descriptor = "()[Lclient!ww;", line = 20)
	public static Class564[] method32898() {
		return new Class564[] { aClass564_8, aClass564_9, aClass564_10, aClass564_4, aClass564_2, aClass564_3, aClass564_6, aClass564_5, aClass564_7 };
	}

	@OriginalMember(owner = "client!ww", name = "y", descriptor = "()[Lclient!ww;", line = 20)
	public static Class564[] method32899() {
		return new Class564[] { aClass564_8, aClass564_9, aClass564_10, aClass564_4, aClass564_2, aClass564_3, aClass564_6, aClass564_5, aClass564_7 };
	}

	@OriginalMember(owner = "client!ww", name = "<init>", descriptor = "(I)V", line = 23)
	Class564(@OriginalArg(0) int arg0) {
		this.anInt5370 = arg0 * 231873843;
	}

	@OriginalMember(owner = "client!ww", name = "x", descriptor = "()I", line = 28)
	@Override
	public int method33764() {
		return this.anInt5370 * -702077445;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(I)I", line = 28)
	@Override
	public int method33765() {
		return this.anInt5370 * -702077445;
	}

	@OriginalMember(owner = "client!ww", name = "l", descriptor = "()I", line = 28)
	@Override
	public int method33767() {
		return this.anInt5370 * -702077445;
	}

	@OriginalMember(owner = "client!ww", name = "h", descriptor = "()I", line = 28)
	@Override
	public int method33766() {
		return this.anInt5370 * -702077445;
	}

	@OriginalMember(owner = "client!ww", name = "ak", descriptor = "(I)V", line = 906)
	public static void method32904() {
		for (@Pc(4) Class3_Sub1_Sub9 local4 = (Class3_Sub1_Sub9) Class250.aClass546_15.method32623(); local4 != null; local4 = (Class3_Sub1_Sub9) Class250.aClass546_15.method32645()) {
			if (local4.anInt2669 * 2127103997 > 1) {
				local4.anInt2669 = 0;
				Class250.aClass161_29.method23222(local4, ((Class3_Sub1_Sub7) local4.aClass546_9.aClass3_Sub1_62.aClass3_Sub1_66).aLong155 * 4089614541957148765L);
				local4.aClass546_9.method32620();
			}
		}
		Class250.anInt3812 = 0;
		Class250.anInt3811 = 0;
		Class250.aClass553_52.method32701();
		Class250.aClass581_30.method33222();
		Class250.aClass546_15.method32620();
		Class250.aBoolean688 = false;
	}

	@OriginalMember(owner = "client!ww", name = "nt", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;B)V", line = 6553)
	static final void method32900(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		@Pc(13) String local13 = (String) arg2.anObjectArray42[(arg2.anInt5315 -= 790013775) * 996806575];
		if (Class201.method24159(local13, arg2) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray30 = Class484.method29109(local13, arg2);
		arg0.aBoolean644 = true;
	}

	@OriginalMember(owner = "client!ww", name = "abu", descriptor = "(Lclient!vs;I)V", line = 9025)
	static final void method32901(@OriginalArg(0) Class536 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray42[(arg0.anInt5315 -= 790013775) * 996806575];
		if (local13 == null) {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 0;
		} else {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local13.length();
		}
	}

	@OriginalMember(owner = "client!ww", name = "atn", descriptor = "(Lclient!vs;I)V", line = 12370)
	static final void method32902(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class510.aClass3_Sub45_37.aClass60_Sub17_1.method13576() ? 1 : 0;
	}

	@OriginalMember(owner = "client!ww", name = "aup", descriptor = "(Lclient!vs;I)V", line = 12505)
	static final void method32903(@OriginalArg(0) Class536 arg0) {
		@Pc(4) Class399 local4 = arg0.aClass26_Sub1_Sub1_Sub1_4.method16654();
		if (local4 == null) {
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = "";
		} else {
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = local4.method27556();
		}
	}
}
