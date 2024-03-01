package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!zm")
public class Class623 implements Interface56 {

	@OriginalMember(owner = "client!zm", name = "fr", descriptor = "Lclient!ny;")
	public static Class359 aClass359_116;

	@OriginalMember(owner = "client!zm", name = "gi", descriptor = "Lclient!qq;")
	public static Class415 aClass415_2;

	@OriginalMember(owner = "client!zm", name = "p", descriptor = "Lclient!zm;")
	public static final Class623 aClass623_5 = new Class623(3, 0, "", "");

	@OriginalMember(owner = "client!zm", name = "a", descriptor = "Lclient!zm;")
	static final Class623 aClass623_3 = new Class623(6, 1, "", "");

	@OriginalMember(owner = "client!zm", name = "g", descriptor = "Lclient!zm;")
	static final Class623 aClass623_4 = new Class623(2, 2, "", "");

	@OriginalMember(owner = "client!zm", name = "l", descriptor = "Lclient!zm;")
	public static final Class623 aClass623_2 = new Class623(5, 3, "", "");

	@OriginalMember(owner = "client!zm", name = "h", descriptor = "Lclient!zm;")
	static final Class623 aClass623_6 = new Class623(4, 4, "", "");

	@OriginalMember(owner = "client!zm", name = "x", descriptor = "Lclient!zm;")
	public static final Class623 aClass623_7 = new Class623(1, 5, "", "");

	@OriginalMember(owner = "client!zm", name = "s", descriptor = "Lclient!zm;")
	public static final Class623 aClass623_8 = new Class623(0, 6, "", "");

	@OriginalMember(owner = "client!zm", name = "u", descriptor = "Lclient!zm;")
	public static final Class623 aClass623_9 = new Class623(7, -1, "", "", true, new Class623[] { aClass623_5, aClass623_3, aClass623_4, aClass623_6, aClass623_2 });

	@OriginalMember(owner = "client!zm", name = "y", descriptor = "I")
	final int anInt5573;

	@OriginalMember(owner = "client!zm", name = "b", descriptor = "I")
	final int anInt5574;

	@OriginalMember(owner = "client!zm", name = "c", descriptor = "Ljava/lang/String;")
	final String aString247;

	@OriginalMember(owner = "client!zm", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;)V", line = 19)
	Class623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		this.anInt5573 = arg0 * -703014135;
		this.anInt5574 = arg1 * -1507846713;
		this.aString247 = arg3;
	}

	@OriginalMember(owner = "client!zm", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Z[Lclient!zm;)V", line = 25)
	Class623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class623[] arg5) {
		this.anInt5573 = arg0 * -703014135;
		this.anInt5574 = arg1 * -1507846713;
		this.aString247 = arg3;
	}

	@OriginalMember(owner = "client!zm", name = "a", descriptor = "(I)I", line = 32)
	@Override
	public int method33765() {
		return this.anInt5574 * -381084681;
	}

	@OriginalMember(owner = "client!zm", name = "l", descriptor = "()I", line = 32)
	@Override
	public int method33767() {
		return this.anInt5574 * -381084681;
	}

	@OriginalMember(owner = "client!zm", name = "x", descriptor = "()I", line = 32)
	@Override
	public int method33764() {
		return this.anInt5574 * -381084681;
	}

	@OriginalMember(owner = "client!zm", name = "h", descriptor = "()I", line = 32)
	@Override
	public int method33766() {
		return this.anInt5574 * -381084681;
	}

	@OriginalMember(owner = "client!zm", name = "ou", descriptor = "()Ljava/lang/String;", line = 36)
	public String method33768() {
		return this.aString247;
	}

	@OriginalMember(owner = "client!zm", name = "toString", descriptor = "()Ljava/lang/String;", line = 36)
	@Override
	public String toString() {
		return this.aString247;
	}

	@OriginalMember(owner = "client!zm", name = "ox", descriptor = "()Ljava/lang/String;", line = 36)
	public String method33769() {
		return this.aString247;
	}

	@OriginalMember(owner = "client!zm", name = "bg", descriptor = "(II)Z", line = 1428)
	static boolean method33771(@OriginalArg(0) int arg0) {
		if (arg0 == 18 || arg0 == 19 || arg0 == 20 || arg0 == 21 || arg0 == 22 || arg0 == 1004) {
			return true;
		} else {
			return arg0 == 17;
		}
	}

	@OriginalMember(owner = "client!zm", name = "ajf", descriptor = "(Lclient!vs;B)V", line = 10689)
	static final void method33770(@OriginalArg(0) Class536 arg0) throws Exception_Sub4 {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		@Pc(31) Class320 local31 = Class320.method25891((float) local13, (float) local13, (float) local13);
		if (local31.aFloat259 == -1.0F) {
			local31.aFloat259 = Float.POSITIVE_INFINITY;
		}
		if (local31.aFloat260 == -1.0F) {
			local31.aFloat260 = Float.POSITIVE_INFINITY;
		}
		if (local31.aFloat261 == -1.0F) {
			local31.aFloat261 = Float.POSITIVE_INFINITY;
		}
		Class80.aClass23_Sub1_1.method5808(local31);
		Class80.aClass23_Sub1_1.method5805((float) local23 / 1000.0F);
		local31.method25874();
	}
}
