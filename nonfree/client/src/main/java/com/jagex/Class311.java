package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hw")
public class Class311 implements Interface75 {

	@OriginalMember(owner = "client!hw", name = "p", descriptor = "Lclient!hw;")
	public static final Class311 aClass311_2 = new Class311(2, 0);

	@OriginalMember(owner = "client!hw", name = "c", descriptor = "Lclient!hw;")
	public static final Class311 aClass311_4 = new Class311(1, 1);

	@OriginalMember(owner = "client!hw", name = "v", descriptor = "Lclient!hw;")
	static final Class311 aClass311_3 = new Class311(0, 2);

	@OriginalMember(owner = "client!hw", name = "l", descriptor = "I")
	public final int anInt4060;

	@OriginalMember(owner = "client!hw", name = "y", descriptor = "I")
	final int anInt4061;

	@OriginalMember(owner = "client!hw", name = "w", descriptor = "()[Lclient!hw;", line = 14)
	static Class311[] method27292() {
		return new Class311[] { aClass311_3, aClass311_4, aClass311_2 };
	}

	@OriginalMember(owner = "client!hw", name = "v", descriptor = "()[Lclient!hw;", line = 14)
	static Class311[] method27293() {
		return new Class311[] { aClass311_3, aClass311_4, aClass311_2 };
	}

	@OriginalMember(owner = "client!hw", name = "t", descriptor = "()[Lclient!hw;", line = 14)
	static Class311[] method27294() {
		return new Class311[] { aClass311_3, aClass311_4, aClass311_2 };
	}

	@OriginalMember(owner = "client!hw", name = "<init>", descriptor = "(II)V", line = 17)
	Class311(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4060 = arg0 * 1499465701;
		this.anInt4061 = arg1 * 353765079;
	}

	@OriginalMember(owner = "client!hw", name = "c", descriptor = "()I", line = 23)
	@Override
	public int method36479() {
		return this.anInt4061 * 1588088039;
	}

	@OriginalMember(owner = "client!hw", name = "y", descriptor = "()I", line = 23)
	@Override
	public int method36477() {
		return this.anInt4061 * 1588088039;
	}

	@OriginalMember(owner = "client!hw", name = "l", descriptor = "()I", line = 23)
	@Override
	public int method36478() {
		return this.anInt4061 * 1588088039;
	}

	@OriginalMember(owner = "client!hw", name = "p", descriptor = "(B)[Lclient!xb;", line = 26)
	static Class638[] method27295() {
		return new Class638[] { Class638.aClass638_2, Class638.aClass638_9, Class638.aClass638_4, Class638.aClass638_11, Class638.aClass638_12, Class638.aClass638_3, Class638.aClass638_15, Class638.aClass638_7, Class638.aClass638_5, Class638.aClass638_14, Class638.aClass638_10, Class638.aClass638_13, Class638.aClass638_6, Class638.aClass638_8, Class638.aClass638_1 };
	}
}
