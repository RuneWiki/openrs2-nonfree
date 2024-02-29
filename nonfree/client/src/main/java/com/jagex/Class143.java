package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!zc")
public abstract class Class143 {

	@OriginalMember(owner = "client!zc", name = "p", descriptor = "I")
	protected static final int anInt2321 = 1;

	@OriginalMember(owner = "client!zc", name = "c", descriptor = "I")
	protected static final int anInt2322 = 2;

	@OriginalMember(owner = "client!zc", name = "v", descriptor = "I")
	public static final int anInt2323 = 3;

	@OriginalMember(owner = "client!zc", name = "l", descriptor = "Lclient!akq;")
	protected Class77_Sub35 aClass77_Sub35_44;

	@OriginalMember(owner = "client!zc", name = "y", descriptor = "I")
	protected int anInt2324;

	@OriginalMember(owner = "client!zc", name = "<init>", descriptor = "(Lclient!akq;)V", line = 10)
	Class143(@OriginalArg(0) Class77_Sub35 arg0) {
		this.aClass77_Sub35_44 = arg0;
		this.anInt2324 = this.method16256() * 1823770475;
	}

	@OriginalMember(owner = "client!zc", name = "<init>", descriptor = "(ILclient!akq;)V", line = 15)
	Class143(@OriginalArg(0) int arg0, @OriginalArg(1) Class77_Sub35 arg1) {
		this.anInt2324 = arg0 * 1823770475;
		this.aClass77_Sub35_44 = arg1;
	}

	@OriginalMember(owner = "client!zc", name = "v", descriptor = "(II)V", line = 24)
	void method16253(@OriginalArg(0) int arg0) {
		if (this.method16264(arg0) != 3) {
			this.method16258(arg0);
		}
	}

	@OriginalMember(owner = "client!zc", name = "j", descriptor = "(I)V", line = 24)
	void method16254(@OriginalArg(0) int arg0) {
		if (this.method16264(arg0) != 3) {
			this.method16258(arg0);
		}
	}

	@OriginalMember(owner = "client!zc", name = "b", descriptor = "(I)V", line = 266)
	static void method16255() {
		client.aClass82_1.method2014();
		if (Class314.anInt4063 * 2039255983 < 2) {
			Class8.aClass25_4.method450();
			Class314.anInt4065 = 0;
			Class314.anInt4063 += 625648463;
			Class590.aClass548_3 = Class548.aClass548_2;
		} else {
			Class590.aClass548_3 = null;
			Class314.aClass690_1 = Class690.aClass690_6;
			Class668.method33179(15);
		}
	}

	@OriginalMember(owner = "client!zc", name = "p", descriptor = "(I)I")
	abstract int method16256();

	@OriginalMember(owner = "client!zc", name = "t", descriptor = "()I")
	abstract int method16257();

	@OriginalMember(owner = "client!zc", name = "l", descriptor = "(II)V")
	abstract void method16258(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!zc", name = "y", descriptor = "()I")
	abstract int method16259();

	@OriginalMember(owner = "client!zc", name = "w", descriptor = "()I")
	abstract int method16260();

	@OriginalMember(owner = "client!zc", name = "d", descriptor = "(I)V")
	abstract void method16261(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!zc", name = "q", descriptor = "(I)V")
	abstract void method16262(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!zc", name = "x", descriptor = "(I)V")
	abstract void method16263(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!zc", name = "c", descriptor = "(II)I")
	abstract int method16264(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!zc", name = "s", descriptor = "(I)I")
	abstract int method16265(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!zc", name = "r", descriptor = "(I)I")
	abstract int method16266(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!zc", name = "g", descriptor = "(I)I")
	abstract int method16267(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!zc", name = "z", descriptor = "(I)I")
	abstract int method16268(@OriginalArg(0) int arg0);
}
