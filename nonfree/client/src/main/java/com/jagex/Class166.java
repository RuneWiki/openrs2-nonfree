package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!zf")
public abstract class Class166 {

	@OriginalMember(owner = "client!zf", name = "e", descriptor = "I")
	protected static final int anInt2377 = 1;

	@OriginalMember(owner = "client!zf", name = "n", descriptor = "I")
	protected static final int anInt2378 = 2;

	@OriginalMember(owner = "client!zf", name = "m", descriptor = "I")
	public static final int anInt2380 = 3;

	@OriginalMember(owner = "client!zf", name = "k", descriptor = "Lclient!ali;")
	protected Class93_Sub36 aClass93_Sub36_49;

	@OriginalMember(owner = "client!zf", name = "f", descriptor = "I")
	protected int anInt2379;

	@OriginalMember(owner = "client!zf", name = "<init>", descriptor = "(Lclient!ali;)V", line = 10)
	Class166(@OriginalArg(0) Class93_Sub36 arg0) {
		this.aClass93_Sub36_49 = arg0;
		this.anInt2379 = this.method16542() * -88839937;
	}

	@OriginalMember(owner = "client!zf", name = "<init>", descriptor = "(ILclient!ali;)V", line = 15)
	Class166(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		this.anInt2379 = arg0 * -88839937;
		this.aClass93_Sub36_49 = arg1;
	}

	@OriginalMember(owner = "client!zf", name = "m", descriptor = "(IB)V", line = 24)
	void method16544(@OriginalArg(0) int arg0) {
		if (this.method16543(arg0) != 3) {
			this.method16545(arg0);
		}
	}

	@OriginalMember(owner = "client!zf", name = "r", descriptor = "(I)V", line = 24)
	void method16552(@OriginalArg(0) int arg0) {
		if (this.method16543(arg0) != 3) {
			this.method16545(arg0);
		}
	}

	@OriginalMember(owner = "client!zf", name = "v", descriptor = "(I)V", line = 24)
	void method16553(@OriginalArg(0) int arg0) {
		if (this.method16543(arg0) != 3) {
			this.method16545(arg0);
		}
	}

	@OriginalMember(owner = "client!zf", name = "p", descriptor = "(I)I")
	abstract int method16540(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!zf", name = "f", descriptor = "()I")
	abstract int method16541();

	@OriginalMember(owner = "client!zf", name = "e", descriptor = "(B)I")
	abstract int method16542();

	@OriginalMember(owner = "client!zf", name = "n", descriptor = "(II)I")
	abstract int method16543(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!zf", name = "k", descriptor = "(II)V")
	abstract void method16545(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!zf", name = "d", descriptor = "(I)V")
	abstract void method16546(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!zf", name = "l", descriptor = "()I")
	abstract int method16547();

	@OriginalMember(owner = "client!zf", name = "u", descriptor = "()I")
	abstract int method16548();

	@OriginalMember(owner = "client!zf", name = "z", descriptor = "(I)I")
	abstract int method16549(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!zf", name = "w", descriptor = "()I")
	abstract int method16550();

	@OriginalMember(owner = "client!zf", name = "c", descriptor = "(I)V")
	abstract void method16551(@OriginalArg(0) int arg0);
}
