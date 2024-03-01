package com.jagex;

import java.util.Stack;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!or")
public class Class375 {

	@OriginalMember(owner = "client!or", name = "hx", descriptor = "Lclient!gk;")
	public static Class200 aClass200_1;

	@OriginalMember(owner = "client!or", name = "p", descriptor = "Lclient!or;")
	static final Class375 aClass375_10 = new Class375(0);

	@OriginalMember(owner = "client!or", name = "a", descriptor = "Lclient!or;")
	public static final Class375 aClass375_2 = new Class375(1);

	@OriginalMember(owner = "client!or", name = "g", descriptor = "Lclient!or;")
	static final Class375 aClass375_9 = new Class375(2);

	@OriginalMember(owner = "client!or", name = "l", descriptor = "Lclient!or;")
	public static final Class375 aClass375_4 = new Class375(3);

	@OriginalMember(owner = "client!or", name = "h", descriptor = "Lclient!or;")
	public static final Class375 aClass375_5 = new Class375(4);

	@OriginalMember(owner = "client!or", name = "x", descriptor = "Lclient!or;")
	public static final Class375 aClass375_6 = new Class375(5);

	@OriginalMember(owner = "client!or", name = "s", descriptor = "Lclient!or;")
	static final Class375 aClass375_7 = new Class375(6);

	@OriginalMember(owner = "client!or", name = "u", descriptor = "Lclient!or;")
	static final Class375 aClass375_3 = new Class375(7);

	@OriginalMember(owner = "client!or", name = "y", descriptor = "Lclient!or;")
	static final Class375 aClass375_8 = new Class375(8);

	@OriginalMember(owner = "client!or", name = "b", descriptor = "I")
	final int anInt4701;

	@OriginalMember(owner = "client!or", name = "<init>", descriptor = "(I)V", line = 16)
	Class375(@OriginalArg(0) int arg0) {
		this.anInt4701 = arg0 * -772144469;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Lclient!ry;B)V", line = 29)
	static void method27228(@OriginalArg(0) Class446 arg0) {
		arg0.aClass26_Sub1_25 = null;
		@Pc(5) Stack local5 = Class446.aStack1;
		synchronized (Class446.aStack1) {
			if (Class446.aStack1.size() < 200) {
				Class446.aStack1.push(arg0);
			}
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(II)Lclient!fo;", line = 263)
	public static Class178 method27235(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 >> 16;
		if (Class178.aClass186Array1[local3] == null || Class178.aClass186Array1[local3].method23917(arg0) == null) {
			@Pc(19) boolean local19 = Class33.method7569(local3, null);
			if (!local19) {
				return null;
			}
		}
		return Class178.aClass186Array1[local3].method23917(arg0);
	}

	@OriginalMember(owner = "client!or", name = "hg", descriptor = "(II)V", line = 3660)
	public static final void method27232(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 5; local1++) {
			client.aBooleanArray22[local1] = false;
		}
		client.anInt3093 = 1952465969;
		client.anInt3137 = 216741911;
		Class60_Sub10.anInt1865 = 0;
		Class117.anInt3204 = 0;
		Class47.anInt1011 = -1801069635;
		Class449.anInt5013 = 2127832081;
		Class72.anInt2086 = arg0 * 224556581;
		if (Class72.anInt2086 * 81180077 != 3) {
			Class443.aLong271 = 0L;
		}
	}

	@OriginalMember(owner = "client!or", name = "mc", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;I)V", line = 6425)
	static final void method27229(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		@Pc(13) String local13 = (String) arg2.anObjectArray42[(arg2.anInt5315 -= 790013775) * 996806575];
		@Pc(18) int[] local18 = Class201.method24159(local13, arg2);
		if (local18 != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray13 = Class484.method29109(local13, arg2);
		arg0.anIntArray366 = local18;
		arg0.aBoolean644 = true;
	}

	@OriginalMember(owner = "client!or", name = "rg", descriptor = "(Lclient!vs;I)V", line = 7246)
	static final void method27230(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = method27235(local12);
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local16.anInt3499 * -751005789;
	}

	@OriginalMember(owner = "client!or", name = "zd", descriptor = "(Lclient!vs;B)V", line = 8601)
	static final void method27231(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 936373647;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		@Pc(33) int local33 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 2];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = arg0.aClass245_4.method24805(local13, local23, local33);
	}

	@OriginalMember(owner = "client!or", name = "aga", descriptor = "(Lclient!vs;I)V", line = 10042)
	static final void method27233(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		Class505.method29521(local12 >> 14 & 0x3FFF, local12 & 0x3FFF);
	}

	@OriginalMember(owner = "client!or", name = "ahw", descriptor = "(Lclient!vs;B)V", line = 10340)
	static final void method27234(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		if (local13 >= 0 && local13 < 2) {
			client.anIntArrayArrayArray15[local13] = new int[local23 << 1][4];
		}
	}
}
