package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sh")
public class Class455 implements Interface56 {

	@OriginalMember(owner = "client!sh", name = "p", descriptor = "Lclient!sh;")
	static final Class455 aClass455_3 = new Class455(0);

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "Lclient!sh;")
	static final Class455 aClass455_1 = new Class455(1);

	@OriginalMember(owner = "client!sh", name = "g", descriptor = "Lclient!sh;")
	static final Class455 aClass455_2 = new Class455(2);

	@OriginalMember(owner = "client!sh", name = "l", descriptor = "I")
	final int anInt5060;

	@OriginalMember(owner = "client!sh", name = "g", descriptor = "()[Lclient!sh;", line = 14)
	public static Class455[] method28463() {
		return new Class455[] { aClass455_3, aClass455_1, aClass455_2 };
	}

	@OriginalMember(owner = "client!sh", name = "s", descriptor = "()[Lclient!sh;", line = 14)
	public static Class455[] method28464() {
		return new Class455[] { aClass455_3, aClass455_1, aClass455_2 };
	}

	@OriginalMember(owner = "client!sh", name = "u", descriptor = "()[Lclient!sh;", line = 14)
	public static Class455[] method28465() {
		return new Class455[] { aClass455_3, aClass455_1, aClass455_2 };
	}

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(I)V", line = 17)
	Class455(@OriginalArg(0) int arg0) {
		this.anInt5060 = arg0 * -1726723729;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)I", line = 22)
	@Override
	public int method33765() {
		return this.anInt5060 * 997799311;
	}

	@OriginalMember(owner = "client!sh", name = "l", descriptor = "()I", line = 22)
	@Override
	public int method33767() {
		return this.anInt5060 * 997799311;
	}

	@OriginalMember(owner = "client!sh", name = "h", descriptor = "()I", line = 22)
	@Override
	public int method33766() {
		return this.anInt5060 * 997799311;
	}

	@OriginalMember(owner = "client!sh", name = "x", descriptor = "()I", line = 22)
	@Override
	public int method33764() {
		return this.anInt5060 * 997799311;
	}

	@OriginalMember(owner = "client!sh", name = "ahl", descriptor = "(Lclient!vs;I)V", line = 10454)
	static final void method28467(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class21.method17426(local13, local23) ? 1 : 0;
	}

	@OriginalMember(owner = "client!sh", name = "aim", descriptor = "(Lclient!vs;B)V", line = 10606)
	static final void method28466(@OriginalArg(0) Class536 arg0) {
		Class66.method13207();
	}
}
